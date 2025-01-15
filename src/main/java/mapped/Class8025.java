// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8025
{
    private static String[] field33042;
    private final String field33043;
    
    public Class8025(final String field33043) {
        this.field33043 = field33043;
    }
    
    public Class1954 method26310() {
        try {
            Double.parseDouble(this.field33043);
        }
        catch (final NumberFormatException | NullPointerException ex) {
            return Class1954.field10636;
        }
        return Class1954.field10637;
    }
    
    public double method26311() {
        try {
            return Double.parseDouble(this.field33043);
        }
        catch (final NumberFormatException | NullPointerException ex) {
            return 0.0;
        }
    }
    
    public float method26312() {
        try {
            return (float)Double.parseDouble(this.field33043);
        }
        catch (final NumberFormatException | NullPointerException ex) {
            return 0.0f;
        }
    }
    
    public int method26313() {
        try {
            return (int)Double.parseDouble(this.field33043);
        }
        catch (final NumberFormatException | NullPointerException ex) {
            return 0;
        }
    }
    
    public String method26314() {
        return this.field33043;
    }
}
