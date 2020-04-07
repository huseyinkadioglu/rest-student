package com.huseyink.spring.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}



