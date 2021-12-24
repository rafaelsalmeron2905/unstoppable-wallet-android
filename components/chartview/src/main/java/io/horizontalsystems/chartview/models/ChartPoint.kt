package io.horizontalsystems.chartview.models

import io.horizontalsystems.chartview.Indicator

class ChartPoint(
    val value: Float,
    val timestamp: Long,
    val volume: Float? = null,
    val dominance: Float? = null,
    val indicators: Map<Indicator, Float?> = mapOf()
)
