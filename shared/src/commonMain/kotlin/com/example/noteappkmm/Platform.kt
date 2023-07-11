package com.example.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform