package JavaPractice;

interface LibraryOperation {
    void issueBook();

    void returnBook();
}

class Student implements LibraryOperation {
    public void issueBook() {
        System.out.println("student want  to issue book");
    }

    public void returnBook() {
        System.out.println("students returned book...");
    }
}

class Teacher implements LibraryOperation {
    public void issueBook() {
        System.out.println("teacher want to issue books");
    }

    public void returnBook() {
        System.out.println("teacher returned books...");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryOperation obj = new Student();
        LibraryOperation obj1 = new Teacher();
        obj.issueBook();
        obj.returnBook();
        obj1.issueBook();
        obj1.returnBook();
    }
}
