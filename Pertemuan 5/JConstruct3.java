public class JConstruct3 {
    int modelYear;
    String modelName;
  
    public JConstruct3(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      JConstruct3 myCar = new JConstruct3(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }