/** MYTH Music Crystal Glass reusable Compose surface. GPL-3.0. */
package com.blazify.music.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/** Translucent glass-like surface; backdrop blur is device-dependent and not claimed here. */
@Composable
fun CrystalGlass(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    val shape = RoundedCornerShape(24.dp)
    Box(
        modifier = modifier
            .clip(shape)
            .background(
                Brush.linearGradient(
                    listOf(Color.White.copy(alpha = 0.88f), Color(0xFFDAF0FC).copy(alpha = 0.65f))
                )
            )
            .border(BorderStroke(1.dp, Color.White.copy(alpha = 0.90f)), shape),
        content = content
    )
}
