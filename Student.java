
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2011.07.31
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
       name = fullName;
       if (fullName.length() < 4)
       {
           System.out.println("");
           System.out.println("NAME ERROR." );
           System.out.println("The entered name contains less than 4 characters.");
           System.out.println("");
       }
       id = studentID;
       if (studentID.length() < 3)
       {
           System.out.println("");
           System.out.println("STUDENT ID ERROR." );
           System.out.println("The entered ID contains less than 3 numbers.");
           System.out.println("");
       }
       credits = 0;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        String shortName = name;
        String shortID = id;
        // If the length of name is more than 4. Take 4 characters.
        if (name.length() > 4)
        {
            shortName = name.substring(0,4);
        }
        // If the length of name is more than 3. Take 3 characters.
        if (id.length() > 3)
        {
           shortID = id.substring(0,3);
        } 
        return shortName + shortID;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
