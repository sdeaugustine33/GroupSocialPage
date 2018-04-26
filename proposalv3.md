Using sqlite and Spring MVC I will make a social media page specifically used by groups of people to communicate information amongst themselves. 
A user must be registered into the group to be able to view and create posts. To register into a group, the user must have the group name and group password. 
Once in the group, users will be able to make blog style posts or upload files to be shared with everyone in the group. When a user logs in, they will see the most recent posts of the group. 
This would be useful for clubs, sports teams and all groups were information needs to be accessible by all. The sqlite database will contain user information and all of the posts created by group.
The project will be completed in check points. The checkpoints will be as followed
Checkpoint1: Create User login and registration views. Start on error notification system.
Checkpoint2: Implement user login and registration. Finish notification system. Create Announcement and File views
Checkpoint3: Connect to database. Implement creating announcements
Final: Group implementation and file upload implementation

*Checkpoint 2 Update*

Unable to get sqlite database connected, so login and registration is not functional with Spring Security.  
Setup Spring Security to help with authentication and authorization.  Pages can be locked until authorized using Spring Security.  
Created general views of how group homepages and group announcement pages will look.  
When database is connected will make these views pull information from database.

For next checkpoint
Want to have database connected for next checkpoint.  After database is connected, want to have a fully functioning login and registration.  Once logged in, I want users to be able to create posts.  Will attempt to create groups using Spring Security Roles functionality.

*Checkpoint 3 Update*

Fully functioning registration and login implemented with spring security.  Create announcement functional, adds to databse.  Removing the file upload functionality from overall project, as there is not enough time.

For final submission
Will need to get announcements view to pull from database.  Possibly have group functionality, if not will make it a general blog posting site. 
