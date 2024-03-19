public void setWidth(int width) {
    if (width < 0) {
        throw new IllegalArgumentException("Width must be non-negative.");
    }
    this.width = width;
}
