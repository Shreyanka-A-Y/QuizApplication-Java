package quizApp;

public class RubyQuestionBank implements QuestionBank {
    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public RubyQuestionBank() {
        q[0] = new String[]{"Who developed Ruby?", "Yukihiro Matsumoto", "Guido Rossum", "Dennis Ritchie", "James Gosling"}; a[0] = "Yukihiro Matsumoto";
        q[1] = new String[]{"Which keyword defines a method?", "def", "function", "method", "define"}; a[1] = "def";
        q[2] = new String[]{"Which symbol denotes block start in Ruby?", ":", "->", "do", "end"}; a[2] = "do";
        q[3] = new String[]{"What is used to print output?", "print", "puts", "echo", "out"}; a[3] = "puts";
        q[4] = new String[]{"Which symbol denotes a variable?", "@", "$", "%", "#"}; a[4] = "$";
        q[5] = new String[]{"What is the extension of Ruby files?", ".rb", ".py", ".java", ".c"}; a[5] = ".rb";
        q[6] = new String[]{"How to start a comment?", "#", "//", "/*", "--"}; a[6] = "#";
        q[7] = new String[]{"What is Ruby's boolean true value?", "1", "yes", "true", "True"}; a[7] = "true";
        q[8] = new String[]{"Which method checks if string is empty?", "isEmpty()", "empty?", "isempty()", "checkEmpty()"}; a[8] = "empty?";
        q[9] = new String[]{"What is nil in Ruby?", "null", "none", "void", "nil"}; a[9] = "nil";
    }

    public String[][] getQuestions() { return q; }
    public String[] getAnswers() { return a; }
}

