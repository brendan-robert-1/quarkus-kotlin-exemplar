package org.my.group.service

import org.eclipse.microprofile.config.inject.ConfigProperty
import org.my.group.model.Greeting
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService(
    @ConfigProperty(name="greeting.message")
    val message: String,
    @ConfigProperty(name="greeting.name")
    val name: String
) {
    fun greet()=
        Greeting("$message from $name!").message
}