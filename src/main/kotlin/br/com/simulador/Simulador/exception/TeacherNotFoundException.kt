package br.com.simulador.Simulador.exception

class TeacherNotFoundException(id: Long?) : RuntimeException("Não foi possível encontrar o professor $id")