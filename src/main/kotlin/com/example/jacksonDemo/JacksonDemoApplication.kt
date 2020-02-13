package com.example.jacksonDemo

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File

@SpringBootApplication
class JacksonDemoApplication

fun main(args: Array<String>) {
    runApplication<JacksonDemoApplication>(*args)


    try {
        // create object mapper
        val mapper = ObjectMapper()

        // read JSON file and map/convert to java POJO
        // data/sample-lite.json
        val theStudent =
                mapper.readValue(File("data/simple-full.json"), Student::class.java)

        val tempAddress = theStudent.address

        // print first name and last name
        println("First name = ${theStudent.firstName}")
        println("Last name = ${theStudent.lastName}")

        // print address info
        println("Street = ${tempAddress?.street}")
        println("City = ${tempAddress?.city}")

        // print out languages
        theStudent.languages?.forEach { languages ->
            println(languages)
        }
    } catch (e: Exception) {
        println(e.localizedMessage)
    }

}
