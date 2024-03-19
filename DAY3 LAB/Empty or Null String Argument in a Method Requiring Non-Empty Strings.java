public void printName(String name) {
    if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name must be non-empty.");
    }
    System.out.println("Name: " + name);
}
