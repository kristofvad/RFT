package com.example.RFT.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

   public void addNewTeacher(Teacher teacher) {
        System.out.println(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        boolean exists =  teacherRepository.existsById(teacherId);
        if (!exists) {
            throw new IllegalStateException("teacher with id " + teacherId + " does not exists");
        }
        teacherRepository.deleteById(teacherId);
    }
    @Transactional
    public void updateTeacher(Long teacherId, String name) {
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow(() -> new IllegalStateException("teacher with id " + teacherId + " does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(teacher.getName(), name)) {
            teacher.setName(name);
        }

    }

}
