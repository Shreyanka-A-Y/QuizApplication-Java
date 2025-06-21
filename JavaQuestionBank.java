package quizApp;

public class JavaQuestionBank implements QuestionBank {

    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public JavaQuestionBank() {
        q[0] = new String[]{"Which of these is not a Java keyword?", "class", "interface", "extends", "include"};
        a[0] = "include";
        q[1] = new String[]{"Which method is the entry point of a Java program?", "start()", "main()", "run()", "init()"};
        a[1] = "main()";
        q[2] = new String[]{"Which keyword is used to define a subclass?", "inherits", "super", "extends", "this"};
        a[2] = "extends";
        q[3] = new String[]{"What is the size of an int variable in Java?", "2 bytes", "4 bytes", "8 bytes", "Depends on system"};
        a[3] = "4 bytes";
        q[4] = new String[]{"Which of the following is used to handle exceptions?", "try-catch", "finally", "throw", "goto"};
        a[4] = "try-catch";
        q[5] = new String[]{"Which of these is not a primitive data type?", "int", "boolean", "String", "char"};
        a[5] = "String";
        q[6] = new String[]{"What does JVM stand for?", "Java Variable Machine", "Java Virtual Method", "Java Virtual Machine", "Java Verified Machine"};
        a[6] = "Java Virtual Machine";
        q[7] = new String[]{"Which operator is used for comparison in Java?", "=", "==", "!=", "&&"};
        a[7] = "==";
        q[8] = new String[]{"Which access modifier makes members accessible only within the same class?", "public", "protected", "private", "default"};
        a[8] = "private";
        q[9] = new String[]{"Which keyword is used to inherit a class in Java?", "this", "super", "extends", "implements"};
        a[9] = "extends";
    }

    public String[][] getQuestions() { return q; }

    public String[] getAnswers() { return a; }
}
