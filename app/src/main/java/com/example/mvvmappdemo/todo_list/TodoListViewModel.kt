package com.example.mvvmappdemo.todo_list

import androidx.lifecycle.ViewModel
import com.example.mvvmappdemo.data.TodoRepository
import com.example.mvvmappdemo.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    //Getting ALL the todos the database contains
    val todos = repository.getTodos()

    //Event generate on the data model
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when (event) {
            is TodoListEvent.OnTodoClick -> {

            }
            is TodoListEvent.OnAddTodoClick -> {

            }
            is TodoListEvent.OnUndoDeleteClick -> {

            }
            is TodoListEvent.OnDeleteTodoClick -> {

            }
            is TodoListEvent.OnDoneChange -> {

            }
        }
    }
}