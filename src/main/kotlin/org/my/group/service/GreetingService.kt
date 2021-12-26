package org.my.group.service

import org.my.group.model.Greeting
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greet()=
        Greeting("hello").message
}