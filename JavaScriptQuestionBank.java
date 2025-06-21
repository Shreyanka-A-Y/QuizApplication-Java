package quizApp;

public class JavaScriptQuestionBank implements QuestionBank {
    private final String[][] q = new String[10][5];
    private final String[] a = new String[10];

    public JavaScriptQuestionBank() {
        q[0] = new String[]{"Which keyword declares a variable?", "var", "let", "const", "all of the above"}; a[0] = "all of the above";
        q[1] = new String[]{"Which symbol is used for comments?", "//", "/*", "#", "<!--"}; a[1] = "//";
        q[2] = new String[]{"JavaScript is ___?", "compiled", "interpreted", "assembled", "none"}; a[2] = "interpreted";
        q[3] = new String[]{"Which is not a data type?", "string", "boolean", "float", "undefined"}; a[3] = "float";
        q[4] = new String[]{"What is typeof null?", "object", "null", "undefined", "number"}; a[4] = "object";
        q[5] = new String[]{"Function to parse integers?", "int()", "parse()", "parseInt()", "Number()"}; a[5] = "parseInt()";
        q[6] = new String[]{"Which is used to select an element?", "getElementById", "select", "find", "query"}; a[6] = "getElementById";
        q[7] = new String[]{"Which keyword exits a loop?", "stop", "exit", "return", "break"}; a[7] = "break";
        q[8] = new String[]{"Which operator compares value and type?", "==", "===", "!=", "="}; a[8] = "===";
        q[9] = new String[]{"Where is JS code placed?", "<script>", "<js>", "<code>", "<javascript>"}; a[9] = "<script>";
    }

    public String[][] getQuestions() { return q; }
    public String[] getAnswers() { return a; }
}
