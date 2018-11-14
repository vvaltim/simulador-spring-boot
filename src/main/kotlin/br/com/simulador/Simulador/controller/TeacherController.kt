package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.exception.TeacherNotFoundException
import br.com.simulador.Simulador.model.Teacher
import br.com.simulador.Simulador.repository.TeacherRepository
import org.springframework.web.bind.annotation.*

@RestController
class TeacherController(val repository: TeacherRepository) {

    @GetMapping("/teacher")
    fun all(): List<Teacher> {
        return repository.findAll()
    }

    @PostMapping("/teacher")
    fun newTeacher(@RequestBody teacher: Teacher): Teacher {
        return repository.save(teacher)
    }

    @GetMapping("teacher/{id}")
    fun one(@PathVariable id: Long): Teacher {
        return repository.findById(id)
                .orElseThrow { TeacherNotFoundException(id) }
    }

    @PutMapping("/teacher/{id}")
    fun replaceTeacher(@RequestBody newTeacher: Teacher, @PathVariable id: Long): Teacher? {
        return repository.findById(id)
                .map { t: Teacher ->
                    t.name = newTeacher.name
                    t.email = newTeacher.email
                    t.password = newTeacher.password
                    repository.save(t)
                }
                .orElseGet {
                    newTeacher.codTeacher = id
                    repository.save(newTeacher)
                }
    }

    @DeleteMapping("/teacher/{id}")
    fun deleteTeacher(@PathVariable id: Long) {
        repository.deleteById(id)
    }

}