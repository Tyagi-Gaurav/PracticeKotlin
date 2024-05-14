import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class Gigasecond(val gigaSend: LocalDateTime) {
    constructor(gigaSend: LocalDate) : this(gigaSend.atStartOfDay())

    val date: LocalDateTime = gigaSend.plusSeconds(1_000_000_000)
}

val gigaSecond2 = Gigasecond(LocalDate.of(2011, Month.APRIL, 25))

fun main() {

}