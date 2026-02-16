package forms;

import java.time.LocalDateTime;

class LogEntry {

    private int logId;
    private String accountNumber;
    private ActionType actionType;
    private double amount;
    private LocalDateTime timestamp;
    private Status status;

    public LogEntry(int logId, String accountNumber,
                    ActionType actionType,
                    double amount, Status status) {

        this.logId = logId;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String toString() {
        return "LogID=" + logId +
               " Account=" + accountNumber +
               " Action=" + actionType +
               " Amount=" + amount +
               " Status=" + status +
               " Time=" + timestamp;
    }
}

