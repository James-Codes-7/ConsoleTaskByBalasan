package interviewpanal.util;

import java.util.regex.Pattern;

public class Validation {

    private static  Validation validation;

    public static Validation getInstance()
    {
        if(validation==null)validation=new Validation();
        return validation;
    }
    public Boolean nameValidation(String name)
    {
       return Pattern.matches("[A-Z][a-zA-Z/ ]{2,}",name);
    }


}
