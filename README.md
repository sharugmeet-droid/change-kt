# 🪙 Change – Exercism (Kotlin)

This solution solves the **Change** exercise from **Exercism** using **Dynamic Programming** to determine the **minimum number of coins** needed to make a given amount.

---

## 📌 Problem Statement

Given a target amount and a list of coin denominations, determine the **fewest number of coins** required to make exact change.

If exact change is **not possible**, the program must throw an exception.

---

## 🧠 Approach Used

### Dynamic Programming (Optimal Solution)

- Builds solutions for all amounts from `0` up to the target amount
- Stores the **minimum coin combination** for each sub-amount
- Ensures correctness for **all coin systems** (unlike greedy algorithms)

This approach is required by **Exercism**, as greedy solutions may fail hidden test cases.

---

## 🧩 Implementation Details

### Class
```kotlin
class Change
