package com.group.libraryapp.dto.user.request;

public class UserCreatedRequest {

    private String name;
    private Integer age; // Integer는 int 와 다르게 null을 표현 가능함.

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
