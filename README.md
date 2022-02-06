# The-Boat-Club

Planed and actualized a basic part registry with CRUD (Make, Recover, Overhaul, Erase) usefulness. Execution (source code + “running” adaptation), course- and interaction graphs have been made and displayed. The interaction graphs ought to appear how a model-view division is accomplished (i.e. begin within the UI) and how the diverse necessities are met. Plan and usage ought to coordinate.

#  Requirements: 

1. Create a new member with a name, personal number, a unique member id should be created and assigned to the new member.


     1.1. The member id should be something that could be printed on a small membership-card and handled by a human mind, I.e. no superlong GUID like stuff.
 
2. Show lists of all members in two different ways:

      2.1. “Compact List”; name, member id and number of boats.
  
      2.2. “Verbose List”; name, personal number, member id and boats with boat information.

3. Delete a member.
4. Change a member’s information.
5. Look at a specific member’s information.
6. Register a new boat for a member the boat should have a type (Sailboat, Motorsailer, kayak/Canoe, Other) and a length.
7. Delete a boat.
8. Change a boat’s information.
9. Persistence (the registry should be saved and loaded for example from a text file).

10. Strict Model-View separation: 


        10.1. The model should not depend on the view or user interface in any way (direct or indirect)

        10.2. The model should not have user interface responsibilities

        10.3. The user interface (view) should not implement domain functionality



11. Good quality of code (for example naming, standards, duplication)
12. An object oriented design and implementation. This includes but is not limited to:

        12.1. Objects are connected using associations and not with keys/ids.
        12.2. Classes have high cohesion and are not too large or have too much responsibility.
        12.3. Classes have low coupling and are not too connected to other entities.
        12.4. Avoid the use of static variables and operations as well as global variables.
        12.5. Avoid hidden dependencies.
        12.6. Informations should be encapsulated.
        12.7. Use a natural design, the domain model should inspire the design.


13. Simple error handling. The application should not crash but it does not need to be user friendly.
