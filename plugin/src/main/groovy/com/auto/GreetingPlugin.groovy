package com.auto
import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task('greeting') << {
            logger.quiet("hello stupid")
        }

        project.afterEvaluate {
            println('my god')
        }
    }
}