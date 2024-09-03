package com.josy

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

val BASE_DURATION_TIME_IN_MINUTES = 25.minutes + 456789.seconds

@Composable
@Preview
fun App() {
    var duration = BASE_DURATION_TIME_IN_MINUTES
    BasicText("${duration.inWholeMinutes}:${String.format("%02d%n", duration.inWholeSeconds % 60)}")
}