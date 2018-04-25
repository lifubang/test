package hello;

import org.joda.time.LocalTime;

/**
 * Created by Ilya on 07.07.2016.
 */
public class Greeter {
    public String sayHello(){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        return "HelloWorld";
    }
}
