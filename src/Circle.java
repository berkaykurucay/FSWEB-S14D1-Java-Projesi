public class Circle {
    // Sınıf değişkeni
    private double radius;

    // Constructor metodu
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter metodu
    public double getRadius() {
        return radius;
    }

    // Metod ile alan hesapla
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Setter metodu
    private void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
}

// Cylinder sınıfı Circle sınıfından kalıtım alıyor
class Cylinder extends Circle {
    // Sınıf değişkeni
    private double height;

    // Constructor metodu
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    // Getter metodu
    public double getHeight() {
        return height;
    }

    // Metod ile silindirin alanını hesapla
    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * height;
    }

    // Metod ile silindirin hacmini hesapla
    public double getVolume() {
        return super.getArea() * height;
    }

    // Setter metodu
    private void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}

// Main sınıfı
class Main {
    public static void main(String[] args) {
        // Circle ve Cylinder örnekleri oluştur
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
