// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2011
{
    field11429("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:."), 
    field11430("0123456789", "0123456789."), 
    field11431("+-*/%!&|<>=", "&|="), 
    field11432(","), 
    field11433("("), 
    field11434(")");
    
    private String field11435;
    private String field11436;
    public static final Class2011[] field11437;
    
    private Class2011(final String s2) {
        this(s2, "");
    }
    
    private Class2011(final String field11435, final String field11436) {
        this.field11435 = field11435;
        this.field11436 = field11436;
    }
    
    public String method8048() {
        return this.field11435;
    }
    
    public String method8049() {
        return this.field11436;
    }
    
    public static Class2011 method8050(final char ch) {
        for (int i = 0; i < Class2011.field11437.length; ++i) {
            final Class2011 class2011 = Class2011.field11437[i];
            if (class2011.method8048().indexOf(ch) >= 0) {
                return class2011;
            }
        }
        return null;
    }
    
    public boolean method8051(final char ch) {
        return this.field11436.indexOf(ch) >= 0;
    }
    
    static {
        field11437 = values();
    }
}
