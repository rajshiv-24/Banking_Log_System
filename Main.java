package forms;

public class Main {

    public static void main(String[] args) {

        LogManager manager = new LogManager();

        manager.addLog("ACC101",
                ActionType.DEPOSIT,
                10000,
                Status.SUCCESS);

        manager.addLog("ACC101",
                ActionType.WITHDRAW,
                5000,
                Status.SUCCESS);

        manager.addLog("ACC202",
                ActionType.LOGIN,
                0,
                Status.SUCCESS);


        System.out.println("Logs for ACC101:");

        for(LogEntry log :
            manager.getLogsByAccount("ACC101")) {

            System.out.println(log);
        }
    }
}
