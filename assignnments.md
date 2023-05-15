# Assignment template

### Feature Tasks
* Update your Album model so that it can be saved in a database. 
  * An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
* A user should be able to see information about all the albums on the site.
* A user should be able to add albums to the site.

### Stretch Goals
Add update and delete routes
### Testing
Just visual testing

### Submission instructions
Repo Name: [Songr](https://github.com/cfosprof/songr)
Branch Name: [Lab-12](/)

### Setup Instructions

### Grading Rubric

## Todo
1. Update Album model to save to a database 
   * Update build.gradle to include Spring Data JPA and Postgres
   * Create an album model class and annotate it to map the db
   * Define properties title, artist, songCount, length, imageUrl
   * Assign albums id in db
2. Display all albums and information on site for users
   * Create route that maps through all albums and fetches their entities
   * Add fetched albums to the model to be displayed in the view
3. Allow users to add albums to the site
   * Create @PostMapping route in controller to accept album data as request parameters
   * Create new album object with received request data and save it to the database repository.


## Resources
[Class Github Repo](https://github.com/codefellows/seattle-code-java401d17/tree/main/class-12)
[Lecture](https://zoom.us/rec/play/--RSu9Gp0yUNg8baB64Sx3S67uE8QTKRVi552Fk5ZKDVEHgahMxe9N63ZDlkm6qVH8NXiF0p_xA4dwKI.LLIVU1N7jbFaj4--?canPlayFromShare=true&from=share_recording_detail&continueMode=true&componentName=rec-play&originRequestUrl=https://zoom.us/rec/share/LKMpwD15zAojGlJWsirwinUUj_BxJz-vMwpboUMEJXGZZpKymTDr3yomggCWCCuZ.9-2vP0aJtDNOQt2J)
[Assignment](https://canvas.instructure.com/courses/6504881/assignments/36513369)
