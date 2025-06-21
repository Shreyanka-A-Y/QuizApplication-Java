# QuizApplication-Java
Simple Quiz application using java swing and awt

# 🎯 QuizMe - Java Swing Quiz Application
---
## 🚀 Features

- 🔘 Topic selection: Java, C, C++, Python, Ruby, JavaScript
- 🕒 15-second countdown per question
- ✅ 10 questions per topic
- 🧠 Score display at the end
- 🎨 Java Swing GUI (no external libraries)
- 📦 Modular design (easy to add more topics)
  
---
## 📁 Project Structure
QuizMe/
├── src/
│ └── quizApp/
│ ├── Login.java # Starting point
│ ├── Rules.java # Displays rules & topic selection
│ ├── Quiz.java # Quiz UI and timer logic
│ ├── score.java # Final score display
│ ├── QuestionBank.java # Interface for all topic question sets
│ ├── JavaQuestionBank.java
│ ├── CQuestionBank.java
│ ├── CppQuestionBank.java
│ ├── PythonQuestionBank.java
│ ├── RubyQuestionBank.java
│ ├── JavaScriptQuestionBank.java
│ └── /images/
│       ├── login.jpg



---

## 🧰 Requirements

- Java JDK 8 or higher
- Eclipse IDE (or any Java IDE)
- Basic Swing knowledge (optional)

---

## 🏁 How to Run (Eclipse Instructions)

1. **Open Eclipse**
   - Go to `File > New > Java Project`
   - Name the project: `QuizMe`

2. **Set up the Package**
   - Create package: `quizApp`
   - Copy all `.java` files into `src/quizApp`

3. **Add Images**
   - Inside `src/quizApp/`, create a folder: `images`
   - Place the following images inside:
     - `login.jpg`
     - `score.png`

4. **Run the App**
   - Right-click `Login.java` > `Run As > Java Application`
   - The app will launch and navigate to rules, quiz, and score screens.

---

## 🛠️ Customization

To add a new topic:

1. Create a file like `GoQuestionBank.java` implementing `QuestionBank`
2. Add `"Go"` to the `topics[]` dropdown in `Rules.java`
3. Add a `case "Go"` in the `switch(topic)` block inside `Quiz.java`

---

## 👤 Author

**[Shreyanka A Y]**  
Computer Science Student

---



