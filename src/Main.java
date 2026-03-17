
void main() {
//LAB1
IO.print("Clasa da aceste date: ");
IO.println();

 Student stud1= new Student( 527, "Botea", "Lavinia", "ISM21/2");
 IO.println(stud1);

 IO.println();
 IO.println();


 //LAB2



 List<Integer> x = new ArrayList();

 x.add(1);
 x.add(10);
 x.add(3);
 x.add(5);
 x.add(2);



 List<Integer> y = new ArrayList();

 y.add(1);
 y.add(2);
 y.add(3);
 y.add(5);
 y.add(4);
 y.add(6);
 y.add(7);

 Collections.sort(x);
 Collections.sort(y);

 List<Integer> xPlusY = new ArrayList(); //a
 xPlusY.addAll(x);
 xPlusY.addAll(y);
 Collections.sort(xPlusY);
 IO.print(xPlusY);


 IO.println();
 IO.println();



 Set<Integer> zSet = new TreeSet(); //b
 zSet.addAll(x);
 zSet.retainAll(y);


 IO.println("Elemente comune (zSet): " + zSet);
 IO.println();




 List<Integer> xMinusY = new ArrayList();//c

 xMinusY.addAll(x);
 xMinusY.removeAll(y);

 IO.println("Elemente din x care nu sunt in y: " + xMinusY);
 IO.println();

 int p = 4;
 List<Integer> xPlusYLimitedByP = new ArrayList(); //d
 for (Integer val : xPlusY) {
  if (val <= p) {
   xPlusYLimitedByP.add(val);
  }
 }

 IO.println("Elemente din x si y <= " + p + ": " + xPlusYLimitedByP);



 //Partea Student


}
