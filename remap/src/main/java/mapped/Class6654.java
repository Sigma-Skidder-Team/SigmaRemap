// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class6654 extends Class6635
{
    private static String[] field26306;
    private int field26307;
    private String field26308;
    private String field26309;
    private long field26310;
    
    public Class6654(final Class6108 class6108) {
        super(class6108);
    }
    
    public void method20227() {
        if (this.field26309 == null || this.field26310 > System.currentTimeMillis()) {
            return;
        }
        final Class8699 class8699 = new Class8699(1, null, this.method20121());
        class8699.method29823(Class5260.field22308, this.field26309);
        class8699.method29823(Class5260.field22294, false);
        class8699.method29823(Class5260.field22326, null);
        try {
            class8699.method29846(Class5215.class);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.field26309 = null;
    }
    
    public int method20228() {
        return this.field26307;
    }
    
    public String method20229() {
        return this.field26308;
    }
    
    public String method20230() {
        return this.field26309;
    }
    
    public long method20231() {
        return this.field26310;
    }
    
    public void method20232(final int field26307) {
        this.field26307 = field26307;
    }
    
    public void method20233(final String field26308) {
        this.field26308 = field26308;
    }
    
    public void method20234(final String field26309) {
        this.field26309 = field26309;
    }
    
    public void method20235(final long field26310) {
        this.field26310 = field26310;
    }
}
