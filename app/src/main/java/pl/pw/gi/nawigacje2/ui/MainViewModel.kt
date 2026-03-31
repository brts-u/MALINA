package pl.pw.gi.nawigacje2.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {

    private val _qrResults = MutableStateFlow<List<String>>(emptyList())
    val qrResults: StateFlow<List<String>> = _qrResults.asStateFlow()

    fun handleQrContent(content: String) {
        _qrResults.update { currentList -> currentList + content }
    }

    fun clearResults() {
        _qrResults.value = emptyList()
    }
}