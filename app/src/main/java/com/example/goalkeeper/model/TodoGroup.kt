package com.example.goalkeeper.model

data class TodoGroup(
    val groupId: String,
    var groupName: String,
    var mainTodo: MutableList<Todo> = mutableListOf(),
    var color: String = ToDoGroupColor.BLUE.toString(),
    var icon: String = ToDoGroupIcon.FAVORITE.toString(),
)
{
    constructor():this ("0","groupName")
}