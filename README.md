# Platzi Play - Java POO Basic

This is a small educational Java project that demonstrates basic
object-oriented programming concepts: classes, fields, methods, collections
and console input.

## Project structure

- src/platzi/play
  - Main.java - Console application. Interactive menu to add/search/delete movies.
  - MainStackHeap.java - Small example showing object reference assignment.
- src/platzi/play/content
  - Movie.java - Represents a Movie with title, duration, genre, review and age.
- src/platzi/play/platform
  - Platform.java - Simple container for movies (add, remove, list, search).
  - User.java - Minimal user model with a `watch` helper that prints a message.
- src/platzi/play/util
  - ScannerUtils.java - Small utility wrapper around java.util.Scanner for CLI input.

## How to run

This is a plain Java project. You can compile and run with your IDE (IntelliJ,
Eclipse) or using javac/java from the command line.

Example (from project root):

```bash
# compile
javac -d out $(find src -name "*.java")

# run the main application
java -cp out platzi.play.Main
```

Note: On Windows with bash.exe the `find` invocation works in Git Bash / WSL.
You can also compile from your IDE which will handle classpaths automatically.

## What each class does (summary)

- Movie: stores basic movie metadata and offers methods to play, set a review,
  and produce a short technical info string.
- Platform: in-memory list of movies; provides add, remove, search and show
  operations. Search is case-insensitive and returns the first match.
- User: simple data holder for a user's name and email; `watch(Movie)` prints
  that the user is playing the movie.
- ScannerUtils: helper that encapsulates a shared Scanner to read text, int
  and double values from stdin. The methods prompt the user before reading.
- Main: interactive console program demonstrating how to use Platform and
  Movie to add, search and delete content.
- MainStackHeap: tiny example illustrating reference assignment between objects.

## Notes and suggestions

- Input validation is minimal. Invalid numeric input will throw a Scanner
  exception. Consider adding validation and retry loops for production code.
- The project uses package-private and public fields deliberately to keep the
  code short for learning purposes.


