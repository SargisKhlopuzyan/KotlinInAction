package com.example.kotlininaction.chapter_8_higher_order_functions.function_types

class SiteVisite(val path: String, val duration: Double, val os: OS)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }


fun main() {
    val averageWindowsDuration = log
        .filter { it.os == OS.WINDOWS }
        .map(SiteVisite::duration)
        .average()

    println(averageWindowsDuration)
    //*************************************************

    println(
        log.averageOsDuration(
            OS.ANDROID
        ))
    println(averageMobileDuration)
    //*************************************************

    println(log.averageDurationFor { it.os == OS.WINDOWS && it.path == "/signup" })
}

val log = listOf(
    SiteVisite(
        "/",
        3.8,
        OS.WINDOWS
    ),
    SiteVisite(
        "/",
        4.4,
        OS.IOS
    ),
    SiteVisite(
        "/login",
        1.3,
        OS.ANDROID
    ),
    SiteVisite(
        "/signup",
        8.8,
        OS.MAC
    ),
    SiteVisite(
        "/signup",
        8.8,
        OS.WINDOWS
    )
)

fun List<SiteVisite>.averageOsDuration(os: OS) =
    filter { it.os == os }.map(SiteVisite::duration).average()

val averageMobileDuration =
    log.filter { it.os in setOf(
        OS.ANDROID,
        OS.IOS
    ) }.map(SiteVisite::duration).average()

fun List<SiteVisite>.averageDurationFor(predicate: (SiteVisite) -> Boolean): Double {
    return this.filter(predicate).map(SiteVisite::duration).average()
}

fun List<SiteVisite>.averageDurationForV2(predicate: (SiteVisite) -> Boolean) =
    filter(predicate).map(SiteVisite::duration).average()