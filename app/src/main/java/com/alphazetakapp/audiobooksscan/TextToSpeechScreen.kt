package com.alphazetakapp.audiobooksscan

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun TextToSpeechScreen(navController: NavController) {
    var isPlaying by remember { mutableStateOf(false) }

    Column {
        Text("Texto reconocido: ...")

        Button(onClick = {
            isPlaying = !isPlaying
            if (isPlaying) {
                // Iniciar la reproducción de texto a voz
            } else {
                // Pausar la reproducción
            }
        }) {
            Text(if (isPlaying) "Pausar" else "Reproducir")
        }
    }
}