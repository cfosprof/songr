# Songr

Songr is a full-stack Spring application that can be used to display, add, update, and delete information about albums.

## Getting Started

1. Clone this repository to your computer.
2. Open a terminal window in the project directory.
3. Run the following command to start the application:

```
./gradlew bootRun
```

4. The application will be running on port 8080. You can access it at `http://localhost:8080`.

## Routes

1. `/hello` - Displays a "Hello, world!" message.
2. `/albums` - List of all albums. Here, you can also add a new album, edit existing ones, and delete albums.
4. `/capitalize/{text}` - Capitalizes the text provided in the path and displays it.

## Classes

### Album

Model representing an album with the following properties:

* id: Long
* title: String
* artist: String
* songCount: int
* length: int
* imageUrl: String