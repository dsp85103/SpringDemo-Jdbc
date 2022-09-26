package com.duotify.jdbcdemo;

import com.duotify.jdbcdemo.entity.CourseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseContorller {

    private final JdbcTemplate jdbcTemplate;

    public CourseContorller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("all")
    public List<CourseEntity> getAllCourse() {
        return jdbcTemplate.query("SELECT * from Course", new BeanPropertyRowMapper<>(CourseEntity.class));
    }
}
