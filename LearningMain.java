package JavaPractice;

abstract class Course {
    private String CourseName;
    private int duration;

    public Course(String CourseName, int duration) {
        this.CourseName = CourseName;
        this.duration = duration;
    }

    abstract void showContent();

    void displayDetails() {
        System.out.println("Course name " + CourseName);
        System.out.println("Duration " + duration+ " weeks");
    }
}

class ProgrammingCourse extends Course {
    private String language;

    public ProgrammingCourse(String CourseName, int duration, String language) {
        super(CourseName, duration);
        this.language = language;
    }

    void showContent() {
        System.out.println("\"This course covers programming in " + language);
    }
}

class DesignCourse extends Course {
    private String tool;

    public DesignCourse(String CourseName, int duration, String tool) {
        super(CourseName, duration);
        this.tool = tool;
    }

    void showContent() {
        System.out.println("This course focuses on design using" + tool);
    }
}

public class LearningMain {
    public static void main(String[] args) {
        Course obj1=new ProgrammingCourse("english course", 7, "english");
        Course obj2=new DesignCourse("Maths Puzzle", 8 , "Computer");
        System.out.println("Programing Course");
        obj1.showContent();
        obj1.displayDetails();
        System.out.println("Design Course");
        obj2.showContent();
        obj2.displayDetails();
    }
}
