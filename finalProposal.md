Using MySQL and Spring MVC I will make a social media page specifically used by groups of people to communicate information amongst themselves. 
A user must be registered into the group to be able to view and create posts. To register into a group, the user must have the group name and group password. 
Once in the group, users will be able to make blog style posts or upload files to be shared with everyone in the group. When a user logs in, they will see the most recent posts of the group. 
This would be useful for clubs, sports teams and all groups were information needs to be accessible by all. The sqlite database will contain user information and all of the posts created by group.
The project will be completed in check points. The checkpoints will be as followed
Checkpoint1: Create User login and registration views. Start on error notification system.
Checkpoint2: Implement user login and registration. Finish notification system. Create Announcement and File views
Checkpoint3: Connect to database. Implement creating announcements
Final: Group implementation and file upload implementation

*Final Submission*

Was unable to implement groups or file uploads.  The project at this point is an anonymous blog posting site.  User can register and post announcements.  Pages are secured by Spring Security and authenticated against the user list in the MySQL database.  Announcements are also stored in their own table in the MySQL database.
