import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun test() {
    val lastActive = LocalDate.now()
    if (lastActive != null && ChronoUnit.DAYS.between(
        lastActive,
        LocalDate.now()
    ) > 30
    ) {
        println("hello")
    }
}
