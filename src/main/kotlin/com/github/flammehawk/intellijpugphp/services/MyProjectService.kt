package com.github.flammehawk.intellijpugphp.services

import com.intellij.openapi.project.Project
import com.github.flammehawk.intellijpugphp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
