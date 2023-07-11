package com.example.noteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
