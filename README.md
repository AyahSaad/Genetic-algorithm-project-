# Genetic-algorithm-project-
---

## Overview
This project was implemented as part of the **Artificial Intelligence course (ENCS3340)** at Birzeit University. It addresses the challenge of distributing department courses efficiently by **optimizing schedules** using a **Genetic Algorithm (GA)**. The algorithm minimizes conflicts between courses, instructors, and student schedules while maximizing diversity.  

---

## Key Features
- **Population Initialization:** Generates multiple candidate schedules (chromosomes).  
- **Fitness Function:** Measures schedule quality based on conflicts.  
- **Crossover & Mutation:** Produces new generations of schedules to improve overall fitness.  
- **Conflict Management:** Detects overlapping courses, instructor conflicts, and lab/lecture overlaps.  
- **Structural Design:** Classes used include `Instructor`, `Course`, `Schedule`, `Class`, `MeetingTime`, `Department`, `Data`, `GeneticAlgorithm`, `Population`, and `Driver`.  

---

## Tools & Technologies
- **Programming Language:** Python  
- **Techniques:** Genetic Algorithm, Object-Oriented Programming  
- **Applications:** Schedule optimization for university courses  

---

## Outcome
- The GA successfully produced schedules with **minimal conflicts**.  
- Solution quality depends on **fitness function accuracy, population size, and generation count**.  
- Larger populations improve diversity but increase computation time.  

---

## Conclusion
This project demonstrates how **Genetic Algorithms** can solve complex scheduling problems efficiently. It provides hands-on experience in algorithm design, optimization, and object-oriented programming for real-world applications.  
