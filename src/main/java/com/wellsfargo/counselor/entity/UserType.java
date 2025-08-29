package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "user_types")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserType {

    @Id
    @Setter(lombok.AccessLevel.NONE)
    private int id;

    @Column(name = "type_name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

}

