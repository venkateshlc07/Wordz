🧠 **Wordz - Word Guessing Game Backend**

Welcome to Wordz, a backend web service for a fun and challenging five-letter word guessing game. Designed to provide a light brain workout, 
Wordz lets players compete across multiple rounds to guess the secret word and earn points based on their accuracy and speed.

This repository contains the backend logic and API implementation using **_Test-Driven Development(TDD)_** principles. 
It does not include user authentication or a frontend UI, 

The workflow we will use is typical for an agile TDD project:

`````
1.Pick a user story prioritized for impact.

2.Think a little about the design to aim for.

3.Use TDD to write the application logic in the core.

4.Use TDD to write code to connect the core to a database.

5.Use TDD to write code to connect to an API endpoint.
`````

This process repeats. It forms the rhythm of writing the core application logic under a unit test, then
growing the application outward, connecting it to API endpoints, user interfaces, databases, and
external web services. 

🎮 **Game Rules**

The objective is to guess a five-letter word in up to six attempts.

After each guess, feedback is provided per letter:

🟩 Green background: Correct letter in the correct position.

🟦 Blue background: Correct letter in the wrong position.

⬜ White background: Letter not present in the word.

Points are awarded based on how quickly the word is guessed:
`````
1st Attempt: 6 points

2nd Attempt: 5 points

3rd Attempt: 4 points

4th Attempt: 3 points

5th Attempt: 2 points

6th Attempt: 1 point
`````
Players compete across rounds to achieve the highest total score.