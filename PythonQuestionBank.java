package quizApp;

public class PythonQuestionBank implements QuestionBank {
    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public PythonQuestionBank() {
        q[0] = new String[]{"Who developed Python?", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum", "James Gosling"}; a[0] = "Guido van Rossum";
        q[1] = new String[]{"Which keyword is used to define a function?", "function", "def", "func", "define"}; a[1] = "def";
        q[2] = new String[]{"What is the output of: type(5)?", "int", "float", "str", "bool"}; a[2] = "int";
        q[3] = new String[]{"Which operator is used for exponentiation?", "^", "**", "//", "%"}; a[3] = "**";
        q[4] = new String[]{"How to write a comment in Python?", "//", "#", "/*", "--"}; a[4] = "#";
        q[5] = new String[]{"Which method converts string to lowercase?", "tolower()", "lower()", "downcase()", "mincase()"}; a[5] = "lower()";
        q[6] = new String[]{"Which data structure is immutable?", "list", "dict", "set", "tuple"}; a[6] = "tuple";
        q[7] = new String[]{"Which statement handles exceptions?", "try", "catch", "throw", "handle"}; a[7] = "try";
        q[8] = new String[]{"What does len() return?", "List type", "Item count", "Index", "None"}; a[8] = "Item count";
        q[9] = new String[]{"Which loop is used to iterate a range?", "for", "do", "each", "iterate"}; a[9] = "for";
    }

    public String[][] getQuestions() { return q; }
    public String[] getAnswers() { return a; }
}
