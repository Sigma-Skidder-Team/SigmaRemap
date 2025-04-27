// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public enum Class296
{
    field1684(0, 0), 
    field1685(0, 1), 
    field1686(0, 2), 
    field1687(0, 3), 
    field1688(0, 4), 
    field1689(0, 5), 
    field1690(1, 0), 
    field1691(1, 1), 
    field1692(1, 2), 
    field1693(1, 3), 
    field1694(1, 4), 
    field1695(1, 5);
    
    private final int field1696;
    private final int field1697;
    private static final Class296[] field1698;
    
    Class296(final int field1696, final int field1697) {
        this.field1696 = field1696;
        this.field1697 = field1697;
    }
    
    public int method947() {
        return this.field1696;
    }
    
    public int method948() {
        return this.field1697;
    }
    
    public static String method949(final int n, final int n2) {
        return Class296.field1698[n2 + 6 * n].method950();
    }
    
    public String method950() {
        return this.name().toLowerCase(Locale.ROOT);
    }
    
    static {
        field1698 = values();
    }
}
