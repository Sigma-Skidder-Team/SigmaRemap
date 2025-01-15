// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8013
{
    public static final Class8013 field32984;
    public static final Class8013 field32985;
    public static final Class8013 field32986;
    public static final Class8013 field32987;
    public static final Class8013 field32988;
    public static final Class8013 field32989;
    public static final Class8013 field32990;
    public static final Class8013 field32991;
    public static final Class8013 field32992;
    private String field32993;
    
    public Class8013(final String field32993) {
        this.field32993 = field32993;
    }
    
    public String method26228() {
        return this.field32993;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class8013 && ((Class8013)o).field32993.equals(this.field32993);
    }
    
    @Override
    public int hashCode() {
        return this.field32993.hashCode();
    }
    
    @Override
    public String toString() {
        return this.field32993;
    }
    
    static {
        field32984 = new Class8013("Render");
        field32985 = new Class8013("Player");
        field32986 = new Class8013("Combat");
        field32987 = new Class8013("World");
        field32988 = new Class8013("Misc");
        field32989 = new Class8013("Exploit");
        field32990 = new Class8013("Movement");
        field32991 = new Class8013("Gui");
        field32992 = new Class8013("Item");
    }
}
