// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3704 extends Class3703
{
    private int field17028;
    private boolean field17029;
    private boolean field17030;
    private long field17031;
    private long field17032;
    private boolean field17033;
    private boolean field17034;
    private boolean field17035;
    private boolean field17036;
    private long[] field17037;
    private long[] field17038;
    private long[] field17039;
    private long[] field17040;
    
    public Class3704() {
        super("Track Fragment Run Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17028 = (int)class9131.method33137(4);
        if (this.field17029 = ((this.field17027 & 0x1) == 0x1)) {
            this.field17031 = class9131.method33137(4);
        }
        if (this.field17030 = ((this.field17027 & 0x4) == 0x4)) {
            this.field17032 = class9131.method33137(4);
        }
        if (this.field17033 = ((this.field17027 & 0x100) == 0x100)) {
            this.field17037 = new long[this.field17028];
        }
        if (this.field17034 = ((this.field17027 & 0x200) == 0x200)) {
            this.field17038 = new long[this.field17028];
        }
        if (this.field17035 = ((this.field17027 & 0x400) == 0x400)) {
            this.field17039 = new long[this.field17028];
        }
        if (this.field17036 = ((this.field17027 & 0x800) == 0x800)) {
            this.field17040 = new long[this.field17028];
        }
        for (int n = 0; n < this.field17028 && this.method11491(class9131) > 0L; ++n) {
            if (this.field17033) {
                this.field17037[n] = class9131.method33137(4);
            }
            if (this.field17034) {
                this.field17038[n] = class9131.method33137(4);
            }
            if (this.field17035) {
                this.field17039[n] = class9131.method33137(4);
            }
            if (this.field17036) {
                this.field17040[n] = class9131.method33137(4);
            }
        }
    }
    
    public int method11383() {
        return this.field17028;
    }
    
    public boolean method11384() {
        return this.field17029;
    }
    
    public long method11385() {
        return this.field17031;
    }
    
    public boolean method11386() {
        return this.field17030;
    }
    
    public long method11387() {
        return this.field17032;
    }
    
    public boolean method11388() {
        return this.field17033;
    }
    
    public long[] method11389() {
        return this.field17037;
    }
    
    public boolean method11390() {
        return this.field17034;
    }
    
    public long[] method11391() {
        return this.field17038;
    }
    
    public boolean method11392() {
        return this.field17035;
    }
    
    public long[] method11393() {
        return this.field17039;
    }
    
    public boolean method11394() {
        return this.field17036;
    }
    
    public long[] method11395() {
        return this.field17040;
    }
}
