package com.databaseindexing.databseindexing.entities;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    int id;
    String name;
}
