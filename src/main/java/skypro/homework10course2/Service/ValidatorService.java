package skypro.homework10course2.Service;

import org.apache.commons.lang3.StringUtils;
import skypro.homework10course2.Exception.InvalidFirstNameException;
import skypro.homework10course2.Exception.InvalidLastNameException;

public class ValidatorService {
    public static String validateFirstName(String firstName){
        if (!StringUtils.isAlpha(firstName)){
            throw new InvalidFirstNameException();
        }
        return StringUtils.capitalize(firstName);

    }
    public static String validateLastName(String lastName){
        if (!StringUtils.isAlpha(lastName)){
            throw new InvalidLastNameException();
        }
        return StringUtils.capitalize(lastName);
    }
}
