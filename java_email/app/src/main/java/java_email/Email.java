package java_email;

import java.util.Scanner;

class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String passWord;
    private int mailBoxCapacity = 8000;
    private String eMail;
    private String altEmail;
    
// constructor receiving first and last name, setting department
        public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call getDepartment to get the name of the department
        this.department = getDepartment();

        //Call randomPassword to set a random password
        this.passWord = randomPassword(10);

        // define Email
        this.eMail = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"company.com";
    }

    //Constructor for testing purposes
    public Email(){
        }

    // Get the name of the Department   
    public String getDepartment() {
        System.out.println("Enter your department:");
        System.out.println("1 for sales");
        System.out.println("2 for developement");
        System.out.println("3 for accounting");
        System.out.println("4 if none");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if(dep == 1) return "sales.";
        if(dep == 2) return "developement.";
        if(dep == 3) return "accounting.";
        return "";
    }

    // Generate a random string for a password
    public String randomPassword(int len) {
        String alphaStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#@$%*";
        StringBuilder str = new StringBuilder(len);
        for(int i =1; i<= len; i++) {
            int index = (int)(alphaStr.length() * Math.random());
            str = str.append(alphaStr.charAt(index));
        }
        return str.toString();

    }

    //change the password
    public void setPassWord(String pword) {
        this.passWord = pword;
    }
    public String getPassWord() {
        return passWord;
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int mailCapacity) {
        this.mailBoxCapacity = mailCapacity;
    }
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    //Set an alternative email address
    public void setAlterEmail(String alterEmail) {
        this.altEmail = alterEmail;
    }
    public String getAlterEmail() {
        return altEmail;
    }

    //Display name, email, and mailbox capacity
    public void displayInfo() {
        System.out.println("Name: " + this.firstName + " "+ this.lastName);
        System.out.println("Email " + this.eMail);
        System.out.println("Password " + this.passWord);
        System.out.println("Has email capacity of: " + mailBoxCapacity);
    }
}
