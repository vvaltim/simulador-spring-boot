package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.Exercise
import br.com.simulador.Simulador.repository.ExerciseRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class ExerciseController(val exerciseRepository: ExerciseRepository) {

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/exercise/create")
    fun saveExerciseCase(@RequestBody exercises: List<Exercise>) : String{
        for (item in exercises){
            item.dateCreate = Date()
            exerciseRepository.save(item)
        }
        return "{ \"responseMessage\": \"Salvo com sucesso\" }"
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/exercise/listAll")
    fun listAllExercise() : List<Exercise>{
        return exerciseRepository.findAll()
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/exercise/listByCodTeam/{id}")
    fun getAllTeamByCodProf(@PathVariable id: Long): List<Exercise> {
        val allExercise = exerciseRepository.findAll()
        return allExercise.filter { it.codTeam == id}
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/exercise/update")
    fun updateExercise(@RequestBody exercise: Exercise): String {
        return if (exercise.codExercise != null){
            exerciseRepository.save(exercise)
            "{ \"responseMessage\": \"Salvo com sucesso\" }"
        } else {
            "{ \"responseMessage\": \"Erro ao salvar registro\" }"
        }
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/exercise/listByCodTeacher/{id}")
    fun getExerciseByCodTeacherAndStatus(@PathVariable id: Long): List<Exercise> {
        return exerciseRepository.findExerciseByCodTeacher(id)
    }
}