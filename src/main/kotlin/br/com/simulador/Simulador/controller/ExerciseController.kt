package br.com.simulador.Simulador.controller

import br.com.simulador.Simulador.model.Exercise
import br.com.simulador.Simulador.repository.ExerciseRepository
import org.springframework.web.bind.annotation.*

@RestController
class ExerciseController(val exerciseRepository: ExerciseRepository) {
    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/exercise/create")
    fun saveExerciseCase(@RequestBody exercises: List<Exercise>) : String{
        for (item in exercises){
            exerciseRepository.save(item)
        }
        return "OK"
    }

    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping("/exercise/listAll")
    fun listAllExercise() : List<Exercise>{
        return exerciseRepository.findAll()
    }
}