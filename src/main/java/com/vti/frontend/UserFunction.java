package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng nhập dành cho manager");
            System.out.println("2. Hiển thị danh sách nhân viên theo project id");
            System.out.println("3. Hiển thị danh sách manager");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findManagerByEmailAndPassword();
            } else if (menu == 2) {
                findEmployeeByProjectId();
            } else if (menu == 3) {
                findManager();
            } else if (menu == 4) {
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
                System.err.println("Nhập lại:");
            }
        }
    }


    private void findEmployeeByProjectId() {
        System.out.println("nhap vao projectId");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);
        System.out.println("Danh sách users:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }


    private void findManagerByEmailAndPassword() {
        System.out.println("Mời bạn nhập vào thông tin đăng nhập.");
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại.");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(), role);

        }
    }
    private void findManager() {

        List<User> users = controller.findManager();
        System.out.println("Danh sách manager:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }


}