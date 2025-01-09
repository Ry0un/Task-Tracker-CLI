package task.tracker.cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TaskWriting {

    private Task taskArray[];
    private Path path = Path.of("c:/Users/zerou/Documents/Codes/repos/Task-Tracker-CLI/tasktracker/"); 
    

    public void writeTask(String description){
        try {
            Files.writeString(path.resolve("Tasks.json"), description);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    



}
