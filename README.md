# Lab 11

# Songr

Songr is a full-stack Spring application that can be used to display information about albums and songs.

## Routes

1. `/hello` - "Hello, world!" message.
2. `/albums` - List of hardcoded albums.
3. `/capitalize/{text}` - Capitalizes the text provided in the path and displays it.

## Classes

### Album

Model representing an album with the following properties:

- title: String
- artist: String
- songCount: int
- length: int
- imageUrl: String

### HomeController

Routes for app

- hello(): Displays the hello.html template.
- albums(Model model): Renders the albums.html template with a list of hardcoded albums.
- capitalize(@PathVariable String text, Model model): Renders the capitalize.html template with the capitalized text.

### SongrApplication

Main entry point for the application.

## Running the application

1.Run the application using the following command:

```
 ./gradlew bootRun
```

2. Open a web browser and visit `http://localhost:8080` to access the application.


## Features

- Ensure that you can run the Spring app.
- Create a hello world route at `/hello`, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit `/capitalize/hello` and get back an HTML page containing the response HELLO, or I could visit `/capitalize/this is Kinda Capitalized` and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
- Create an Album class to act as a model in our app.
    - An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- Create a route at `/albums` that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)