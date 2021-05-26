package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    static String filename = "config.properties";
    static String fileLocation = "src/test/resources/TestData/config.Properties";

    public LoadProperty(){
        firstName = getProperty("firstName");
        lastName = getProperty("lastName");
        dateOfBirthDay  = Integer.parseInt (getProperty ("dateOfBirthDay"));
        dateOfBirthMonth = Integer.parseInt(getProperty("dateOfBirthMonth"));
        dateOfBirthYear = getProperty("dateOfBirthYear");
        email = getProperty("email");
        password= getProperty("password");
        confirmPassword = getProperty("password");
        search = getProperty("search");
        searchCount =Integer.parseInt (getProperty("searchCount"));
        computerMenuItem = getProperty("computerMenuItem");
        computerMenuItemCount = Integer.parseInt(getProperty("computerMenuItemCount"));

    }
    public String getProperty(String keyName){
        if (prop==null){
            prop = new Properties();
            try {
                input = new FileInputStream(fileLocation);

                prop.load(input);
                input.close();

            }catch (FileSystemNotFoundException e){
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return prop.getProperty(keyName);

    }
    public  String firstName;
    public  String lastName;
    public  int dateOfBirthDay;
    public  int dateOfBirthMonth;
    public  String dateOfBirthYear;
    public String email;
    public  String password;
    public  String confirmPassword;
    public  String search;
    public  int searchCount;
    public  String computerMenuItem;
    public  int computerMenuItemCount;

}
