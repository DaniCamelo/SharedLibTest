package com.example.sharedlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform