package arrays;

/**
 * Klassen Country lagrar information om ett land. Det är landets namn
 * och dess befolkning som lagras.
 * @author Rolf Axelsson
 */
public class Country implements Comparable {
    private String name;
    private long population;
    
    /**
     * Konstruerar ett Country-objekt.
     * @param inName landets namn
     * @param inPopulation landets befolkning
     */
    public Country( String inName, long inPopulation ) {
        this.name = inName;
        this.population = inPopulation;
    }

    /**
     * Returnerar landets namn.
     * @return landets namn
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returnerar landets befolkning
     * @return landets befolkning
     */
    public long getPopulation() {
        return this.population;
    }
    
    public boolean equals(Object obj) {
    	Country country = (Country)obj;
    	return this.name.equals(country.getName());
    }
    
    public int compareTo(Object obj) {
    	int res;
    	Country country = (Country)obj;
    	if(this.population<country.getPopulation())
    		res = -1;
    	else if(this.population==country.getPopulation())
    		res = 0;
    	else
    		res = 1;
    	return res;
    }
    
    /**
     * Beskriver ett lands befolkning på formen "Landsnamn                32987800". 
     * Landsnamnet är vänsterjusterat i ett 30 tecken brett fält och befolkningen
     * är högerjusterad i ett 12 tecken brett fält.
     */
    public String toString() {
        return "[" + name + "," + population + "]";
    }
    
    public static void main( String[] args ) {
        Country c1 = new Country( "Sverige", 9100293 );
        Country c2 = new Country( "Danmark", 5529270 );
        System.out.println( c1 );
        System.out.println( c2 );
    }
}
