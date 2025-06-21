package quizApp;

public class CppQuestionBank implements QuestionBank {
    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public CppQuestionBank() {
        q[0] = new String[]{"C++ was developed by?", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "Ken Thompson"}; a[0] = "Bjarne Stroustrup";
        q[1] = new String[]{"What does OOP stand for?", "Object Operating Program", "Object-Oriented Programming", "Oriented Object Processing", "None"}; a[1] = "Object-Oriented Programming";
        q[2] = new String[]{"Which symbol is used for single-line comments?", "//", "#", "/*", "--"}; a[2] = "//";
        q[3] = new String[]{"Which feature allows function reuse with same name?", "Inheritance", "Encapsulation", "Overloading", "None"}; a[3] = "Overloading";
        q[4] = new String[]{"Which header defines cout?", "iostream", "stdio.h", "math.h", "conio.h"}; a[4] = "iostream";
        q[5] = new String[]{"Which access specifier is most restrictive?", "private", "public", "protected", "internal"}; a[5] = "private";
        q[6] = new String[]{"What is used to define a class in C++?", "function", "struct", "class", "object"}; a[6] = "class";
        q[7] = new String[]{"Which operator is overloaded for cout?", "<<", ">>", "::", "=="}; a[7] = "<<";
        q[8] = new String[]{"What is the output stream object?", "cin", "cout", "printf", "scanf"}; a[8] = "cout";
        q[9] = new String[]{"Which keyword creates objects?", "new", "malloc", "this", "object"}; a[9] = "new";
    }

    public String[][] getQuestions() { return q; }
    public String[] getAnswers() { return a; }
}
