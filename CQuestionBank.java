package quizApp;

public class CQuestionBank implements QuestionBank {
    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public CQuestionBank() {
        q[0] = new String[]{"What is used to declare constants in C?", "#define", "const", "constant", "int"}; a[0] = "#define";
        q[1] = new String[]{"Which operator is used to get the address of a variable?", "&", "*", "->", "%"}; a[1] = "&";
        q[2] = new String[]{"Which function is used to print output?", "print()", "echo()", "printf()", "cout"}; a[2] = "printf()";
        q[3] = new String[]{"C language was developed by?", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "Ken Thompson"}; a[3] = "Dennis Ritchie";
        q[4] = new String[]{"Which data type is used to store decimal values?", "int", "float", "char", "bool"}; a[4] = "float";
        q[5] = new String[]{"Which keyword is used for decision making?", "switch", "case", "if", "loop"}; a[5] = "if";
        q[6] = new String[]{"What is the extension for a C source file?", ".cpp", ".cs", ".c", ".java"}; a[6] = ".c";
        q[7] = new String[]{"Which of these is a looping construct?", "do-while", "foreach", "go-to", "next"}; a[7] = "do-while";
        q[8] = new String[]{"Which header is used for input/output?", "stdlib.h", "stdio.h", "conio.h", "math.h"}; a[8] = "stdio.h";
        q[9] = new String[]{"Which operator is used to access value at address?", "*", "&", "#", "%"}; a[9] = "*";
    }

    public String[][] getQuestions() { return q; }
    public String[] getAnswers() { return a; }
}
