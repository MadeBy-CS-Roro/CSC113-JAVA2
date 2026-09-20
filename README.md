
  # ☕ Object-Oriented Programming (CSC 113)
  *Mastering OOP concepts through academic labs and real-world system simulations.*
</div>

---

## 📌 About This Repository
This repository is a collection of my practical work in **Object-Oriented Programming (CSC 113)**. It bridges theoretical university concepts with hands-on skill-building in Java. The repository includes weekly lab evaluations and a comprehensive interactive system simulation (Metro Riyadh) that demonstrates advanced Java architecture capabilities.

## 🗂️ Repository Highlights
This repository demonstrates practical application in two main areas:

### 1. Weekly Labs (`Lab1` to `Lab11`)
Progressive exercises covering core OOP principles like Inheritance, Interfaces, and Abstract classes to build a strong programming foundation.

### 2. Core Project: Riyadh Metro Simulation 🚇
An interactive metro network simulation built entirely using strict Object-Oriented Programming principles. The system provides two distinct user experiences:
*   **Manager View:** Allows the manager to add/remove employees and stations, view transport units (Metros, Buses, On-Demand Buses), manage maintenance (using randomized logic), and track network profit[span_5](start_span)[span_5](end_span).
*   **Passenger View:** Allows users to create/manage accounts, add balance, buy/refund tickets, board/unboard vehicles, and browse stations[span_6](start_span)[span_6](end_span).

## 🏗️ System Architecture & Core Classes
The project relies on a robust and scalable architecture:
*   **`TransportUnit` (abstract):** Base class for vehicles, extended by `Metro`, `Bus`, and `BusOnDemand`[span_7](start_span)[span_7](end_span).
*   **`Person` (abstract):** Parent class extended by `Employee` and `Passenger`[span_8](start_span)[span_8](end_span).
*   **`Station` (implements `CapacityChecker`):** Manages arrays of transport units and employees, featuring recursive printing and capacity validation[span_9](start_span)[span_9](end_span).
*   **`MetroNetwork` (Main Controller):** The central hub managing the network, handling adding/removing entities, and processing complex logic like boarding and maintenance[span_10](start_span)[span_10](end_span)[span_11](start_span)[span_11](end_span).

## 🛠️ Features & OOP Concepts Demonstrated
Through the Metro Riyadh project and weekly labs, the following concepts are heavily utilized:
- [x] Inheritance & Polymorphism[span_12](start_span)[span_12](end_span)
- [x] Abstract Classes & Interfaces[span_13](start_span)[span_13](end_span)
- [x] Method Overriding & Recursion[span_14](start_span)[span_14](end_span)
- [x] Arrays, Shifting, & Encapsulation[span_15](start_span)[span_15](end_span)
- [x] Composition (e.g., Bus $\rightarrow$ Driver, Passenger $\rightarrow$ Ticket)[span_16](start_span)[span_16](end_span)

## 💡 Why This Matters?
Object-Oriented Programming is the foundation of modern software engineering. Building modular systems with clean architecture, proper encapsulation, and complex relationships (like the Metro Network) develops the critical mindset required for writing secure, scalable, and maintainable enterprise-level code.

---
