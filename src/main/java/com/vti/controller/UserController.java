package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;


    public List<User> findEmployeeByProjectId(int projectId)  {
        return service.findEmployeeByProjectId(projectId);
    }

    /**
     * @param id Định danh của user
     * @return Thông tin user tương ứng với id, hoặc null nếu không tồn tại
     */


    /**
     * @param email Email của user
     * @param password Mật khẩu của user
     * @return Thông tin user tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findManagerByEmailAndPassword(String email, String password) {
        return service.findManagerByEmailAndPassword(email, password);
    }

    /**
     * Cách dùng:
     * <pre>{@code
     * controller.create("Nguyễn Văn Khoa", "khoa.nv@gmail.com")
     * }
     * @param fullName Họ và tên của user
     * @param email Email của user
     * @return Số bản ghi được tạo thành công
     */
    public List<User> findManager()  {
        return service.findManager();
    }

}