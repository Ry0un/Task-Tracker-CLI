package task.tracker.cli;

import java.time.LocalDate;
public class Task {
    private String description;
    private int id =1;
    private String createDate;
    private String updateDate;

    public Task(String description){
        LocalDate now = LocalDate.now();
        this.description=description;
        this.id=id++;
        this.createDate=now.toString();
        this.updateDate=updateDate;
    }

    public String getDescription(){
        return description;
    }
    
    public int getId(){
        return id;
    }


    public String getCreationDate(){
        return createDate;
    }
    public String getUpdateDate(){
        return updateDate;
    }



    public String toString(){  
        return "Task: "+description+" ID: "+id+" Creation date: "+createDate+" Update date: "+updateDate;
    }













}
