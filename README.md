# Online Examination Management Subsystem

A Java-based Learning Management System (LMS) component built using multiple **Creational Design Patterns**. This project demonstrates how to design a flexible and extensible architecture for university-level examinations, allowing instructors to customize exam types, question formats, and sourcing strategies.

## 🛠 Design Patterns Implemented

This project strictly follows the **Open/Closed Principle (OCP)** using the following patterns:

1.  **Factory Method Pattern:** Used for creating different types of examinations like *Practice Quizzes*, *Midterm Exams*, and *Final Exams*.
2.  **Abstract Factory Pattern:** Manages families of related question components (Question Entity, Renderer, and Evaluator) for MCQ, Essay, and Programming challenges.
3.  **Builder Pattern:** Facilitates the step-by-step construction of complex, immutable `ExamConfiguration` objects (e.g., setting duration, negative marking, and shuffle rules).
4.  **Strategy Pattern / Dependency Injection:** Decouples the question data origin through a `QuestionSource` interface, allowing seamless switching between *Question Banks* and *Auto-generated Faker* data.

## 📁 Project Structure

```text
src/
├── builder/           # Builder Pattern classes for configuration
├── exams/             # Factory Method implementation for exam types
├── questions/         # Abstract Factory for question components
├── sources/           # Question sourcing strategies (Bank, Faker)
└── Main.java          # Central orchestration/driver file

**classDiagram**
    class Exam { <<interface>> }
    class ExamFactory { <<abstract>> }
    ExamFactory <|-- MidtermExamFactory
    Exam <|.. MidtermExam

    class QuestionFactory { <<interface>> }
    QuestionFactory <|.. MCQFactory
    MCQFactory --> QuestionSource : Dependency Injection

    class ExamBuilder { +build() }
    class ExamConfiguration { +title: String }
    ExamBuilder ..> ExamConfiguration : constructs

**Sample Dashboard Output**
=====================================================================
                     EXAM CREATED SUCCESSFULLY                       
=====================================================================
Type: Midterm Exam
Title: OOP Midterm Exam
Duration: 60 minutes
Passing Score: 50 Marks
Configuration Profiles:
 ✓ Negative Marking Enabled
 ✓ Question Shuffle Activated
 ✗ Embedded Calculator Allowed
 ✓ Auto-Submit On Timeout
Question Sourcing Strategy: Question Bank Mode
Compiled Structural Components:
- [Type: MCQ] Points: 2 Difficulty: Medium
- [Type: Essay] Points: 10 Difficulty: Hard
- [Type: Programming] Points: 20 Difficulty: Hard
=====================================================================
