package com.phone;
import com.phone.*;

public class OperatingSystemFactory {
    public os getInstance(String str) {
        if(str.equals("open")) {
            return new Android();
        } else if(str.equals("closed")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }
}
