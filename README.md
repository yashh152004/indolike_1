# 📝 To-Do List (CLI-Based Java App)

A simple and interactive **Command-Line To-Do List** app built using **Java OOP concepts** and **arrays** (no ArrayList). It's beginner-friendly and perfect for learning core Java.

---

## 🚀 Features

✅ Add New Tasks  
✅ View All Tasks  
✅ Mark Tasks as Done  
✅ Delete Tasks  
✅ CLI-based interactive interface  
✅ OOP Structure: `Task` and `TaskManager`  
✅ Lightweight – No external libraries used

---

## 🧱 Project Structure

├── Task.java # Defines Task object (id, description, status)
├── TaskManager.java # Manages task operations (array-based)
└── Main.java # Runs the CLI interface

yaml
Copy
Edit

---

## 🧠 Concepts Used

- ✅ **Classes & Objects**
- ✅ **Encapsulation**
- ✅ **Arrays** instead of dynamic collections
- ✅ **Command-line interaction**
- ✅ **Separation of logic and UI**

---

## 💻 How to Run the App

### 1️⃣ Compile the Java files

```bash
javac Main.java TaskManager.java Task.java
2️⃣ Run the app
bash
Copy
Edit
java Main
🧪 Sample Interaction
text
Copy
Edit
--- TO-DO LIST ---
1. Add Task
2. View Tasks
3. Mark Task as Done
4. Delete Task
5. Exit
Enter choice: 1
Enter task: Submit internship report
Task added.

--- TO-DO LIST ---
1. Add Task
2. View Tasks
3. Mark Task as Done
4. Delete Task
5. Exit
Enter choice: 2

[Pending] 1. Submit internship report
<details> <summary>📦 Tip: Customize Maximum Task Limit</summary>
Go to TaskManager.java and modify:

java
Copy
Edit
private final int MAX_TASKS = 100; // Change this to your desired limit
</details>
📌 Notes
Uses static arrays for learning purposes

No database or file storage (can be added as enhancement)

Cleanly written using only core Java (Java SE)
