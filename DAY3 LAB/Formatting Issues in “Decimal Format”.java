DecimalFormat df = new DecimalFormat("#,###.##");
String formattedNumber = df.format(1234.567); // Formatting with incorrect pattern
System.out.println(formattedNumber);
