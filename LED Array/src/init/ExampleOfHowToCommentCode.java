package init;

/**
 * Klassen Commodity representerar en vara i en butik. 
 * @version 1.0
 * @author Philip Ekholm
 */
public class ExampleOfHowToCommentCode {
    private String name;
    private String category;
    private int quantity;
    private double price;
    
    /**
     * Konstruerar och initialiserar en vara med name="", category="", 
     * quantity=0 och price=0.0.
     */
    public ExampleOfHowToCommentCode() {
        this.name = "";
        this.category = "";
    }

    /**
     * Konstruerar och initialiserar en vara med angivna värden.
     * @param name varans namn
     * @param category varans kategori
     * @param quantity antal varor på lagret
     * @param price varans pris
     */
    public ExampleOfHowToCommentCode(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Returnerar varans namn.
     * @return varans namn
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sätter varans namn
     * @param name varans namn
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returnerar varans kategori.
     * @return varans kategori
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Sätter varans kategori
     * @param category varans kategori
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returnerar varans pris.
     * @return varans pris
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sätter varans pris
     * @param price varans pris
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Ändrar antalet varor i lager. Ett positivt värde ökar antalet varor (inköp)
     * och ett negativt värde minskar antalet varor (försäljning)
     * @param change förändring av antalet varor
     * @return antal varor i lager efter förändring
     */
    public int changeQuantity(int change) {
        quantity += change;
        return this.quantity;
    }

    /**
     * Skriver ut information om ett objekt
     */
    public void info() {
        System.out.println(this.name + ", " + this.category + "\n" +
                           "Antal i lager: " + this.quantity + "\n" +
                           "Pris: " + this.price + " kr");
    }
}
