public SimonSays() {
window = new Frame();

// calculate dimensions of buttons
int bWidth = Frame._dp.getWidth() / 2;
int bHeight = Frame._dp.getHeight() / 2;

// create buttons
red = new Button("RED", 0, 0, bWidth, bHeight,
Color.red, new Color(100, 0, 0));
green = new Button("GREEN", bWidth, 0, bWidth, bHeight,
Color.green, new Color(0, 100, 0));
blue = new Button("BLUE", 0, bHeight, bWidth, bHeight,
Color.blue, new Color(0, 0, 100));
yellow = new Button("YELLOW", bWidth, bHeight, bWidth, bHeight,
Color.yellow, new Color(100, 100, 0));
}