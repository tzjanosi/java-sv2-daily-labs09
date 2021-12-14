package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> peopleList=new ArrayList<>();

    public void addPerson(Person person, LocalTime time){
        if(person.getTicket().entryTime().isBefore(time)){
            peopleList.add(person);
        }
        else{
            throw new IllegalArgumentException("She/He can't entry the venue yet!");
        }

    }

    @Override
    public String toString() {
        return "Concert{" +
                "peopleList=" + peopleList +
                '}';
    }
}
