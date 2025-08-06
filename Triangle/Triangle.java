class Triangle {
    // Defining attributes for the class Triangle
    private double sideA;
    private double sideB;
    private double sideC;
    private static int totalTrianglesCount;
    
    // Null Constructor for Equilateral triangle
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        totalTrianglesCount++;
    }
    // Parameterized Constructor for Equilateral triangle
    public Triangle(double length) {
        this.sideA = length;
        this.sideB = length;
        this.sideC = length;
        totalTrianglesCount++;
    }
    // Parameterized Constructor for Isosceles Triangle
    public Triangle(double equalSide, double differentSide) {
        this.sideA = equalSide;
        this.sideB = equalSide;
        this.sideC = differentSide;
        totalTrianglesCount++;
    }
    // Parameterized Constructor for Triangle
    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        totalTrianglesCount++;
    }
    // Copy Constructor for Triangle
    public Triangle(Triangle otherTriangle) {
        this.sideA = otherTriangle.sideA;
        this.sideB = otherTriangle.sideB;
        this.sideC = otherTriangle.sideC;
        totalTrianglesCount++;
    }
    // Setter for sideA
    public void setSideA(double valueA) {
        this.sideA = valueA;
    }
    // Setter for sideB
    public void setSideB(double valueB) {
        this.sideB = valueB;
    }
    // Setter for sideC
    public void setSideC(double valueC) {
        this.sideC = valueC;
    }
    // Getter for sideA
    public double getSideA() {
        return this.sideA;
    }
    // Getter for sideB
    public double getSideB() {
        return this.sideB;
    }
    // Getter for sideC
    public double getSideC() {
        return this.sideC;
    }
    // returns number of objects associated with class Triangle
    public static int getTotalTriangles() {
        return totalTrianglesCount;
    }
    // returns perimeter of a specific triangle
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    // Validates if a specific triangle is Right-Angled or not
    public boolean isRightAngled() {
        if (sideA > sideB && sideA > sideC) {
            return (sideB * sideB + sideC * sideC == sideA * sideA);
        }
        if (sideB > sideA && sideB > sideC) {
            return (sideA * sideA + sideC * sideC == sideB * sideB);
        }
        if (sideC > sideA && sideC > sideB) {
            return (sideA * sideA + sideB * sideB == sideC * sideC);
        }
        return false;
    }
    @Override
    public String toString() {
        String triangleType;
        if (sideA + sideB == sideA + sideC 
            || sideA + sideB == sideB + sideC 
            || sideA + sideC == sideB + sideC) {
            
            if (sideA + sideB == sideA + sideC 
                && sideA + sideB == sideB + sideC 
                && sideA + sideC == sideB + sideC) {
                triangleType = "Equilateral";
            } else {
                triangleType = "Isosceles";
            }
        } else {
            triangleType = "Scalene";
        }
        return "{ Triangle with sides (" + sideA + ", " + sideB + ", " + sideC + 
               "), " + (isRightAngled() ? "is" : "is not") + " right-angled, Type: " + triangleType + " }";
    }
}
