// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3715 extends Class3703
{
    private long field17073;
    private long field17074;
    private long field17075;
    private long field17076;
    private double field17077;
    private double field17078;
    private final double[] field17079;
    private long field17080;
    
    public Class3715() {
        super("Movie Header Box");
        this.field17079 = new double[9];
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        final int n = (this.field17026 != 1) ? 4 : 8;
        this.field17073 = class9131.method33137(n);
        this.field17074 = class9131.method33137(n);
        this.field17075 = class9131.method33137(4);
        this.field17076 = Class8805.method30720(class9131.method33137(n));
        this.field17077 = class9131.method33143(16, 16);
        this.field17078 = class9131.method33143(8, 8);
        class9131.method33144(10L);
        for (int i = 0; i < 9; ++i) {
            if (i >= 6) {
                this.field17079[i] = class9131.method33143(2, 30);
            }
            else {
                this.field17079[i] = class9131.method33143(16, 16);
            }
        }
        class9131.method33144(24L);
        this.field17080 = class9131.method33137(4);
    }
    
    public long method11428() {
        return this.field17073;
    }
    
    public long method11429() {
        return this.field17074;
    }
    
    public long method11430() {
        return this.field17075;
    }
    
    public long method11431() {
        return this.field17076;
    }
    
    public double method11432() {
        return this.field17077;
    }
    
    public double method11433() {
        return this.field17078;
    }
    
    public double[] method11434() {
        return this.field17079;
    }
    
    public long method11435() {
        return this.field17080;
    }
}
