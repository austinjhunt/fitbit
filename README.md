# fitbit-project
FitBit software implemented in Java. <br>
Ian Brown, Austin Hunt, Eliza Starr

**UI:** JFC/Swing <br>
**Domain Layer:** Java <br>
**Testing:** JUnit 5 <br>
**Developed:** Mac OS <br>

Notes about the code:
* Classes
  * Runner - The test class for ButtonListener and for the logic of the domain layer, made possible because the UI and domain layer are loosely coupled.
  * Unit tests - StepCountTest, SleepCycleTest, and UserDescriptionTest. Note that Altitude does not have a test because the values are randomized and cannot be tested using predicted values.
