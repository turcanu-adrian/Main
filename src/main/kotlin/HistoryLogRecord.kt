import java.time.*

class HistoryLogRecord(val timestamp: LocalDateTime, val command: String): Comparable<HistoryLogRecord> {
    override fun compareTo(other: HistoryLogRecord): Int {
        if (timestamp.isEqual(other.timestamp))
            return 0;
        else if (timestamp.isBefore(other.timestamp))
            return -1;
        return 1;
    }

/*    fun max(other: HistoryLogRecord): HistoryLogRecord {
        if (timestamp.)
    }*/
}