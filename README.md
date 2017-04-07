# measurementConversionAPI

## Team project - REST API development
doing it again, making sure it's right
bawk a bawk bawk

* Helpful link that explains basic branching and merging [Git Branching](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging)

### Pitch
Do you ever have your hands full in the kitchen and suddenly need to know how many tablespoons are in one cup of butter? Or how many cups of milk are in a gallon? Then this is the API for you! Add it to your existing recipe blog site for the convenience your users or include it in your own micro app for your smartphone. Our handy service is perfect for the chef in your home.

### Problem Statement
This service will accept a numeric value and two unit types from the user representing an existing unit quantity and the desired unit.  It will convert the existing unit quantity and return the value of the chosen unit quantity.

Example -> User input = "8 tablespoons to cups", service returns ".5 cups"
[Conversion Resource](http://www.tablespoon.com/posts/tablespoon-conversions-tablespoons-in-cups/bdf92edc-7542-4af5-8d55-6bd11ef77101)

### Project Goal:
This API will enable third-party developers to build applications, which will consume results of this API.

### Technology/Techniques

 * Database - MySql
    * Table for common cooking unit types
 * API
    * Endpoint 1 - returns all Unit types (from table)
    * Endpoint 2 - requires 3 parameters (quantity, existing unit type, desired unit type) - returns new quantity
 * Logging
    * Log4J
 * Unit Testing
    * Junit
 * DB CRUD
    * Hibernate
 * Return formats
    * JSON
    
### Design

 * [Class Diagrams](https://github.com/sandoschwert/measurementConversionAPI/blob/master/CookingConversionClassDiagramUpdate.png)
 * [DB Design]()
 
### [Project Plan](https://github.com/sandoschwert/measurementConversionAPI/blob/master/ProjectPlan.md)

### [Progress Log](https://github.com/sandoschwert/measurementConversionAPI/blob/master/ProjectLog.md)

