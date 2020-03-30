/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int rollNo;
    private String name;
    private int backLogCounter;
    private int appearingCounter;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(int rollNo, String name, int backLogCounter, int appearingCounter) {
        this.rollNo = rollNo;
        this.name = name;
        this.backLogCounter = backLogCounter;
        this.appearingCounter = appearingCounter;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    public int getAppearingCounter() {
        return appearingCounter;
    }

    public void setAppearingCounter(int appearingCounter) {
        this.appearingCounter = appearingCounter;
    }

    @Override
    public String toString() {
        return "rollNo = " + rollNo + "\n" +
                "name = " + name + "\n" +
                "backLogCounter = " + backLogCounter + "\n" +
                "appearingCounter = " + appearingCounter + "\n" +
                "----------------------------------------------\n";
    }
}
