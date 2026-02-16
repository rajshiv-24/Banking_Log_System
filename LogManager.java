package forms;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class LogManager {

    // auto increment logId
    private AtomicInteger logIdCounter = new AtomicInteger(1);

    // store all logs
    private List<LogEntry> allLogs = new ArrayList<>();

    // fast account lookup
    private Map<String, List<LogEntry>> accountMap = new HashMap<>();


    // FEATURE 1: Add Log
    public void addLog(String accountNumber,
                       ActionType actionType,
                       double amount,
                       Status status) {

        int id = logIdCounter.getAndIncrement();

        LogEntry log = new LogEntry(
                id,
                accountNumber,
                actionType,
                amount,
                status);

        // store in main list
        allLogs.add(log);

        // store in hashmap for fast account lookup
        accountMap
            .computeIfAbsent(accountNumber,
                    k -> new ArrayList<>())
            .add(log);
    }


    // FEATURE 2: Get Logs by Account
    public List<LogEntry> getLogsByAccount(String accountNumber) {

        return accountMap.getOrDefault(
                accountNumber,
                new ArrayList<>());
    }
}

