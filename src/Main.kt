fun main() {
    val students = mutableListOf<Student>()
    println("Enter student details. Type 'quit' to end program.\n")

    while (true) {
        print("Student name (or 'quit' to stop): ")
        val name = readln().trim()
        if (name.equals("quit", ignoreCase = true)) break

        print("Student ID: ")
        val id = readln().trim()

        print("Student course: ")
        val course = readln().trim()

        print("Is this an Undergraduate or Masters student? (U/M): ")
        val type = readln().trim().uppercase()

        val student: Student = if (type == "M") {
            Masters(id, name, course)
        } else {
            Undergraduate(id, name, course)
        }

        val mark = readDoubleInRange("Enter mark (0–100): ", 0.0, 100.0)
        student.mark = mark

        students += student
        println("Added -> $student\n")
    }

    println("\nAll Students Entered")
    if (students.isNotEmpty()) {
        for (s in students) println(s)
    } else {
        println("No Students Found")
    }
}

fun readDoubleInRange(prompt: String, min: Double, max: Double): Double {
    while (true) {
        print(prompt)
        val value = readln().trim().toDoubleOrNull()
        if (value != null && value in min..max) return value
        println("Invalid number. Enter a value between $min and $max.")
    }
}
