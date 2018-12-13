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

    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/exercise/updateConciliation")
    fun updateExerciseConciliation(@RequestBody exercise: Exercise): String {
        //preencheram os 2
        if (exercise.studentOneConciliation != null || exercise.studentTwoConciliation != null){

            //houve auto composição, caso encerrado
            if (exercise.studentOneConciliation == true && exercise.studentTwoConciliation == true){
                exercise.status = 99
                exercise.veredict = "Houve acordo entre as partes."
            } else {
                //não ouve composição

                //se o status for 4 (primeira audiencia de conciliação), lebera para o advogado 2 fazer a Contestação status 5
                if (exercise.status == 4){
                    exercise.status = 5
                }
                //TODO: Adicionar o status de não contestação da segunda audiencia de conciliação
                if (exercise.status == 7){
                    exercise.status = 8
                }
            }
        }

        return if (exercise.codExercise != null){
            exerciseRepository.save(exercise)
            "{ \"responseMessage\": \"Salvo com sucesso\" }"
        } else {
            "{ \"responseMessage\": \"Erro ao salvar registro\" }"
        }
    }
}