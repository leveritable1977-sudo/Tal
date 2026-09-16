void main() {
    IO.println("Välkommen till projektet StruktureradJava!");

    int x = 15;
    int y = 10;

    if (x > y) {
        IO.println(String.format("Talet %d är större än talet %d.", x, y));
    }
    else {
        IO.println(String.format("Talet %d är inte större än talet %d.", x, y));
    }
}
