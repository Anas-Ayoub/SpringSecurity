package com.xproce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name="customer")
public class Customer {
    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String email;
    private String pwd;
    private String role;
}
