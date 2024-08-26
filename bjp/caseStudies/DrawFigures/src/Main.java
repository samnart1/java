class Main {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    public static void drawDiamond() {
        drawCone();
        drawV();
    }

    public static void drawX() {
        drawV();
        drawCone();
    }

    public static void drawRocket() {
        drawCone();
        drawBox();
        System.out.println("|United|");
        System.out.println("|States|");
        drawBox();
        drawCone();
    }

    public static void drawCone() {
        System.out.println("   /\\");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\ ");

    }

    public static void drawV() {
        System.out.println(" \\    / ");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}