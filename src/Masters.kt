class Masters(
    id: String,
    name: String,
    course: String
) : Student(id, name, course) {

    override fun getGrade(): String {
        return when (mark){
            in 70.0..100.0 -> "Distinction"
            in 60.0..69.99 -> "Merit"
            in 40.0..59.99 -> "Pass"
            else -> "Fail"
        }
    }
}