# 🚇 Riyadh Metro Simulation System - Phase 2

**Java OOP - CSC 113 Project**

## 📌 Overview
This project is an interactive metro network simulation built using Object-Oriented Programming (OOP) in Java[cite: 6]. In Phase 2, we have significantly enhanced the system architecture, added a graphical user interface (GUI) using Java Swing, and implemented file management and exception handling to provide a more robust and realistic user experience[cite: 6].

The system continues to offer two main user experiences:
1. **Manager Control View:** Oversee and manage the network's stations, employees, and diverse fleet of transportation units (Metros, Buses, and On-Demand Buses), track network profit, and perform maintenance[cite: 6].
2. **Passenger View:** Create and manage personal accounts, add wallet balance, purchase and manage tickets, activate tickets with QR codes, browse available stations and vehicles, and enjoy rides across the system[cite: 6].

---

## 🚀 What's New in Phase 2
- **Data Structures Upgrade:** All arrays from Phase 1 have been replaced with **Linked Lists** for dynamic data management[cite: 6].
- **Graphical User Interface (GUI):** A fully functional GUI built with Java Swing (`JFrame`, `JPanel`, `JButton`, `JList`, `JProgressBar`, etc.) for an intuitive user experience[cite: 6].
- **File Management:** Implemented saving and loading system progress using **binary object files**, allowing users to retain data between sessions[cite: 6].
- **Exception Handling:** Robust error handling using checked (`IOException`, `ClassNotFoundException`, User-Defined `StationNotFoundException`) and unchecked (`NumberFormatException`, `IllegalArgumentException`) exceptions to validate user inputs and ensure system stability[cite: 6].
- **Advanced Ticket System:** Expanded the ticket system to include different types, activation with dynamic QR code generation, and refund logic[cite: 6].

---

## 🏗️ System Architecture & GUI Design

### Core GUI Components
The application utilizes a single main `JFrame` (`MetroGui`) with dynamic switching of `JPanel`s to simulate navigation, and an on-demand `DisplayNetworkFrame` for comprehensive network reports[cite: 6].

- **MetroGui (Main Frame):** Handles all logins, inputs, and task panels[cite: 6].
- **DisplayNetworkFrame:** Displays detailed network data, total stations, profit, and station lists using `JList` and `JTextArea`[cite: 6].

### Key Features Demonstrated
- Exception Handling (Checked, Unchecked, User-Defined)[cite: 6]
- File I/O (Binary Object Serialization)[cite: 6]
- GUI Programming (Java Swing, ActionListeners, Visibility toggling)[cite: 6]
- Linked Lists Data Structures[cite: 6]

---

## 👥 Team Members & Division of Work
- **Reema Al-Showiman (446202930):** MetroGui JFrame main structure, management station panels, Ticket activation panel[cite: 6].
- **Ghala Alotaibi (446202981):** Linked Lists implementation, Employee management panels, maintenance panel, displayMetroInfo JFrame[cite: 6].
- **Nassrah Aldaham (446202179):** All Passenger Panels except the Ticket activation panel[cite: 6].

---

## 🛠️ How to Run & Important Notes
1. Compile and run the `MetroTest` main class.
2. The initial screen allows selection between **Manager** and **Passenger** roles[cite: 6].
3. **Manager Login Credentials:**
   - **Name:** Ghala[cite: 6]
   - **ID:** admin-01[cite: 6]
4. Check the "I'm not a robot" box to proceed with the login[cite: 6].

Enjoy simulating the Riyadh Metro System!
