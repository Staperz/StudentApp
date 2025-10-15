class Undergraduate(
    id: String,
    name: String,
    course: String,
) : Student(id, name, course) {
    override fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.99 -> "2/1"
            in 50.0..59.99 -> "2/2"
            in 40.0..49.99 -> "Third"
            else -> "Fail"
        }
    }
}