# MouseMotion Demo

This Java application demonstrates how to track mouse motion and dragging using Swing.

## Requirements

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse

## Instructions

1. Ensure you have JDK installed on your system.
2. Open the project in your preferred IDE.
3. Run the `MouseMotion` class.
4. Move your mouse around the window to see the coordinates displayed.
5. Drag the mouse to see the updated coordinates.

## Code Overview

The `MouseMotion` class implements the `MouseMotionListener` interface to handle mouse motion events. It creates a simple Swing application with a `JFrame` and a `JLabel` to display mouse coordinates.

### Methods

- `mouseMoved(MouseEvent e)`: Updates the label text with the current mouse coordinates when the mouse is moved.
- `mouseDragged(MouseEvent e)`: Updates the label text with the current mouse coordinates when the mouse is dragged.

### Main Method

The `main` method initializes an instance of the `MouseMotion` class, which starts the application.

## About

This application is for educational purposes to understand mouse motion event handling in Java Swing.
