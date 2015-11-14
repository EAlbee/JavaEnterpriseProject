## Team Day's Code Review Checklist

### Project Structure
| Metric | Measurement | 
| :---------- | :----------: | :---------- |
| Classes are single-purpose | none, some, most, all | All
| Proper file structure | Y/N | Yes - it may be useful to create a package for your model objects like Resturant visit this way the Project package root will contain servlets and the sub packages would separate out the model and dao objects

- Project
	- persistance:
		doas and other objects related to storing objects in the database
	- model:
		POJOS and Beans which represent the model of your object like ResurantVisit

| Proper implementation of industry-standard high-level structure (or, appropriate separation of concerns) | poor, fair, good, excellent | good

### Code Structure and Style
| Metric | Measurement | 
| :---------- | :----------: | :---------- |
| No duplicate code | Y/N | Yes
| No dead/useless/lazy/unreachable code | Y/N | There are some unused methods and method parameters
| Variables and methods have appropriate access modifiers | Y/N (possibly scale?) | yes
| No hardcoded variables/magic numbers/strings | Y/N | No
| Readability | poor, fair, good, excellent | Excellent
| Full, complete Javadoc for all classes and methods | none, some, most, all | some
| Appropriate and descriptive variable and function names | poor, fair, good, excellent | excellent
| Consistent formatting | Y/N | yes
| Methods are concise and single-purpose | none, some, most, all | all
| Class constructors are present and appropriately implemented | none, some, most, all | yes

### Testing
| Metric | Measurement | Criteria |
| :---------- | :----------: | :---------- |
| Code compiles with no errors or warnings | Y/N | No
| Appropriate use of logging | poor, fair, good, excellent | Not yet - need to add Log4J logging
| no System.out.println use | Y/N | Yes, in the ResaurantSevlet
| Testing for positive results | Y/N | No
| Testing for negative resuts | Y/N | No
| Testing for errors and exceptions | Y/N | No
| Code coverage with tests | none(<20%), some(20-44%), most(45-79%), all (80%+) | none
