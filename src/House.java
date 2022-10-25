public class House implements Comparable<House> {
    private int price;
    private double square;
    private String postCode;
    private String adressName;

    int[] nums;

    @Override
    public int compareTo(House other) {
        double result = this.getPrice() * 1.0 / this.getSquare() - other.getPrice() * 1.0 / other.getSquare();
        return (int) Math.round(result);
    }


    public int compareTo(int[] nums) {
        int counter = 0;
        int thisCounter = 0;
        for(int i : nums) {
            counter += i;
        }

        for (int i : this.nums) {
            thisCounter += i;
        }
        return thisCounter - counter;
    }


    public House() {
    }

    public House(int price, double square, String postCode, String adressName) {
        this.price = price;
        this.square = square;
        this.postCode = postCode;
        this.adressName = adressName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAdressName() {
        return adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName;
    }
}
