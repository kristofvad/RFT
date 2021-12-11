package com.example.RFT.Teacher;

import javax.persistence.*;

@Entity
@Table
public class Teacher {


    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )

    private Long id;
    private String name;
    private Integer age;
    private Long ClassId;
    private String ClassName;

    public Teacher() {
    }

    public Teacher(Long id, String name, Integer age, Long classId, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        ClassId = classId;
        ClassName = className;
    }

    public Teacher(String name, Integer age, Long classId, String className) {
        this.name = name;
        this.age = age;
        ClassId = classId;
        ClassName = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getClassId() {
        return ClassId;
    }

    public void setClassId(Long classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ClassId=" + ClassId +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
