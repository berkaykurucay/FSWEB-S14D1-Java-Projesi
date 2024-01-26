public class Rectangle {
    // Sınıf değişkenleri
    private double width;
    private double length;

    // Constructor metodu
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    // Getter metodu
    public double getWidth() {
        return width;
    }

    // Getter metodu
    public double getLength() {
        return length;
    }

    // Metod ile alan hesapla
    public double getArea() {
        return width * length;
    }

    // Setter metodu
    private void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Setter metodu
    private void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
}

// Cuboid sınıfı Rectangle sınıfından kalıtım alıyor
class Cuboid extends Rectangle {
    // Sınıf değişkeni
    private double height;

    // Constructor metodu
    public Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }

    // Getter metodu
    public double getHeight() {
        return height;
    }

    // Metod ile hacmi hesapla
    public double getVolume() {
        return getArea() * height;
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
        // Rectangle ve Cuboid örnekleri oluştur
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
