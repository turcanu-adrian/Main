import java.io.File
import kotlin.text.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    var Dictionar = hashMapOf<LocalDateTime, HistoryLogRecord>()
    var str1 = String()
    var str2 = String()
    File("input.txt").forEachLine{
        if (it.contains("Start-Date: "))
            str1 = it.substring(12, 22)
        if (it.contains("Commandline: "))
            str2 = it.substring(13)
        if (!str1.isEmpty() && !str2.isEmpty())
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss")
            LocalDateTime dateTime = LocalDateTime.parse(str1, formatter)
            val HistoryLogRecord = HistoryLogRecord(dateTime, str2)
            Dictionar.put(dateTime, HistoryLogRecord)
            str1 = String()
            str2 = String()
        }
    }
}