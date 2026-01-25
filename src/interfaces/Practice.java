package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Practice {

    static String URL = "jdbc:postgresql://localhost:5432/postgres";
    static String USER = "postgres";
    static String DB_KEY = "250762";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                1 - Create course
                2 - Read all courses
                3 - Read course by id
                4 - Update course
                5 - Delete course
                6 - Exit
                """);

            int choice = sc.nextInt();

            if (choice == 1) createCourse(sc);
            else if (choice == 2) readAllCourses();
            else if (choice == 3) readCourseById(sc);
            else if (choice == 4) updateCourse(sc);
            else if (choice == 5) deleteCourse(sc);
            else if (choice == 6) break;
            else System.out.println("Wrong choice");
        }
    }

    static void createCourse(Scanner sc) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, DB_KEY);
            Statement st = con.createStatement();

            sc.nextLine();
            String name = sc.nextLine();
            if (name.isBlank()) return;

            ResultSet check =
                    st.executeQuery("SELECT * FROM courses WHERE name = '" + name + "'");
            if (check.next()) return;

            String category = sc.nextLine();
            String instructor = sc.nextLine();

            int duration = sc.nextInt();
            if (duration < 0) return;

            int price = sc.nextInt();
            if (price < 0) return;

            st.executeUpdate(
                    "INSERT INTO courses(name, category, instructor, duration, price) VALUES ('"
                            + name + "','" + category + "','" + instructor + "',"
                            + duration + "," + price + ")"
            );

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void readAllCourses() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, DB_KEY);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM courses");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("category") + " " +
                                rs.getString("instructor") + " " +
                                rs.getInt("duration") + " " +
                                rs.getInt("price")
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void readCourseById(Scanner sc) {
        int id = sc.nextInt();

        try {
            Connection con = DriverManager.getConnection(URL, USER, DB_KEY);
            Statement st = con.createStatement();
            ResultSet rs =
                    st.executeQuery("SELECT * FROM courses WHERE id = " + id);

            if (rs.next()) {
                System.out.println(
                        rs.getString("name") + " " +
                                rs.getString("category") + " " +
                                rs.getInt("duration")
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void updateCourse(Scanner sc) {
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        if (name.isBlank()) return;

        try {
            Connection con = DriverManager.getConnection(URL, USER, DB_KEY);
            Statement st = con.createStatement();

            st.executeUpdate(
                    "UPDATE courses SET name = '" + name + "' WHERE id = " + id
            );

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleteCourse(Scanner sc) {
        int id = sc.nextInt();

        try {
            Connection con = DriverManager.getConnection(URL, USER, DB_KEY);
            Statement st = con.createStatement();

            st.executeUpdate(
                    "DELETE FROM courses WHERE id = " + id
            );

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
