package Lab6;

class Tools {
    private static int countStatic_ = 0;
    //private int countNonStatic_ = 0;

    private static int idStatic_ = 0;
    private int idNonStatic_ = 0;

    private String name;
    private double weight;
    private Specification specification;

    public Tools() {
        this.name = "ERROR";
        this.weight = -1;
        this.specification = new Specification("ERROR", "ERROR");
        countStatic_++;
        idStatic_++;
        this.idNonStatic_ = idStatic_;
        System.out.println("Default constructor called");
    }

    
    public Tools(String name, double weight, String mat, String color) {
        this.name = name;
        this.weight = weight;
        this.specification = new Specification(mat, color);
        countStatic_++;
        idStatic_++;
        this.idNonStatic_ = idStatic_;
        System.out.println("Parameterized constructor called");
    }

    
    public Tools(Tools other) {
        this.name = other.name;
        this.weight = other.weight;
        this.specification = new Specification(other.specification);
        countStatic_++;
        idStatic_++;
        this.idNonStatic_ = idStatic_;
        System.out.println("Copy constructor called");
    }

    public void display() {
        System.out.println("Tool ID: " + idNonStatic_ +
                ", Name: " + name +
                ", Weight: " + weight);
        specification.display();
    }

    public static int getCount() {
        return countStatic_;
    }

    
    private  static class Specification {
        private String material;
        private String color;

        private Specification(String material, String color) {
            this.material = material;
            this.color = color;
        }

        private Specification(Specification other) {
            this.material = other.material;
            this.color = other.color;
        }

        private void display() {
            System.out.println("  Material: " + material + ", Color: " + color);
        }
    }
}
