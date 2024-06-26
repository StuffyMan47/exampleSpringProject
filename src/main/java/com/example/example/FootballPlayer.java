package com.example.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FootballPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "team")
    @JoinColumn(name = "command_id", referencedColumnName = "id")
    private FootballCommand team;

    @Column(name = "age")
    private Integer age;

    @Column(name = "coast")
    private Integer coast;
}
