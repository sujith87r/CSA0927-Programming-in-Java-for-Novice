void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

int[] array = {1, 2, 3};
printArray(array); // Correct usage

int[] anotherArray = null;
printArray(anotherArray); // Incorrect usage, passing a null array
