// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3706 extends Class3703
{
    private boolean field17041;
    private boolean field17042;
    private boolean field17043;
    private long field17044;
    private long field17045;
    private long field17046;
    private int field17047;
    private int field17048;
    private int field17049;
    private double field17050;
    private double field17051;
    private double field17052;
    private double[] field17053;
    
    public Class3706() {
        super("Track Header Box");
        this.field17053 = new double[9];
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17041 = ((this.field17027 & 0x1) == 0x1);
        this.field17042 = ((this.field17027 & 0x2) == 0x2);
        this.field17043 = ((this.field17027 & 0x4) == 0x4);
        final int n = (this.field17026 != 1) ? 4 : 8;
        this.field17044 = class9131.method33137(n);
        this.field17045 = class9131.method33137(n);
        this.field17047 = (int)class9131.method33137(4);
        class9131.method33144(4L);
        this.field17046 = Class8805.method30720(class9131.method33137(n));
        class9131.method33144(8L);
        this.field17048 = (int)class9131.method33137(2);
        this.field17049 = (int)class9131.method33137(2);
        this.field17050 = class9131.method33143(8, 8);
        class9131.method33144(2L);
        for (int i = 0; i < 9; ++i) {
            if (i >= 6) {
                this.field17053[i] = class9131.method33143(2, 30);
            }
            else {
                this.field17053[i] = class9131.method33143(16, 16);
            }
        }
        this.field17051 = class9131.method33143(16, 16);
        this.field17052 = class9131.method33143(16, 16);
    }
    
    public boolean method11396() {
        return this.field17041;
    }
    
    public boolean method11397() {
        return this.field17042;
    }
    
    public boolean method11398() {
        return this.field17043;
    }
    
    public long method11399() {
        return this.field17044;
    }
    
    public long method11400() {
        return this.field17045;
    }
    
    public int method11401() {
        return this.field17047;
    }
    
    public long method11402() {
        return this.field17046;
    }
    
    public int method11403() {
        return this.field17048;
    }
    
    public int method11404() {
        return this.field17049;
    }
    
    public double method11405() {
        return this.field17050;
    }
    
    public double method11406() {
        return this.field17051;
    }
    
    public double method11407() {
        return this.field17052;
    }
    
    public double[] method11408() {
        return this.field17053;
    }
}
