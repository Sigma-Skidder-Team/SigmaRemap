// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6916 extends Class6915
{
    private static String[] field27110;
    private final String field27111;
    private final String field27112;
    private final String field27113;
    private final byte[] field27114;
    private final byte[] field27115;
    
    public Class6916(final Class3746 class3746) {
        super(class3746);
        final Class3746 method11499 = class3746.method11499(1935894633L);
        this.field27111 = new String(((Class3770)method11499.method11499(1970496882L)).method11575());
        byte[] method11500;
        int n;
        for (method11500 = ((Class3770)method11499.method11499(1851878757L)).method11575(), n = 0; method11500[n] != 0; ++n) {}
        this.field27112 = new String(method11500, 0, n - 1);
        this.field27113 = new String(((Class3770)method11499.method11499(1801812256L)).method11575());
        this.field27114 = ((Class3770)method11499.method11499(1886546294L)).method11575();
        this.field27115 = ((Class3770)method11499.method11499(1769367926L)).method11575();
    }
    
    @Override
    public Class188 method21282() {
        return Class188.field606;
    }
    
    public String method21285() {
        return this.field27111;
    }
    
    public String method21286() {
        return this.field27112;
    }
    
    public String method21287() {
        return this.field27113;
    }
    
    public byte[] method21288() {
        return this.field27114;
    }
    
    public byte[] method21289() {
        return this.field27115;
    }
}
