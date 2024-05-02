class Program1 extends ConsoleProgram {

  public void run() {

    String[] strNames =  new String[5];
    double[] dblMarks = new double[5];
    int[] absences = {4, 3, 6, 8, 9};
    

    // set the names in the list
    strNames[0] = "Gordon";
    strNames[1] = "Michael";
    strNames[2] = "Christine";
    strNames[3] = "Holly";
    strNames[4] = "Ben";

    // set the marks in the list
    dblMarks[0] = 89.9;
    dblMarks[1] = 82.3;
    dblMarks[2] = 91.4;
    dblMarks[3] = 93.6;
    dblMarks[4] = 98.7;

    // print the marks and names
    System.out.println(strNames[0] + " has a mark of " + dblMarks[0]);    
    
    
    // more examples
    int[] intCanCount = { 43, 65, 34, 90, 101 };
    String[] strTop5 = new String[5];
    double[] dblMenuItems = { 8.99, 2.99, 1.50, 5.99, 2.99 };

    System.out.println(intCanCount[0]);
    System.out.println(intCanCount[4]);
    System.out.println(intCanCount[intCanCount.length - 1]);

    strTop5[0] = "Ambitionz Az a Ridah";
    strTop5[1] = "All Bout U[Explicit]";
    strTop5[2] = "Skandalouz";
    strTop5[3] = "Got My Mind Made Up";
    strTop5[4] = "How Do U Want It";

    System.out.println(strTop5[strTop5.length / 2]);

    System.out.println(dblMenuItems[dblMenuItems.length - 2]);
    
  }
}