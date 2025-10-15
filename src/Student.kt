abstract class Student(
    val id: String,
    val name: String,
    val course: String
){
    var mark: Double = 0.0
        set(value){
            if(value in 0.0..100.0) {
                field = value}
            else{
                println("Invalid mark: $value -must be 0..100")
            }
        }

    abstract fun getGrade(): String

    fun didPass(): Boolean =  mark >= 40.0


    override fun toString(): String =
        "Name: $name, course: $course, mark: $mark, Grade:${getGrade()}, Passed: ${didPass()}"
}
