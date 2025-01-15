// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4360 implements Class4252<Class5813>
{
    private static String[] field19525;
    private Class354 field19526;
    private Class2146 field19527;
    private Class102 field19528;
    private String field19529;
    private Class354 field19530;
    private Class354 field19531;
    private Class2181 field19532;
    private Class2052 field19533;
    private String field19534;
    private boolean field19535;
    private boolean field19536;
    private boolean field19537;
    private float field19538;
    private long field19539;
    
    public Class4360() {
    }
    
    public Class4360(final Class354 field19526, final Class2146 field19527, final Class102 field19528, final String field19529, final Class354 field19530, final Class354 field19531, final Class2181 field19532, final Class2052 field19533, final String field19534, final boolean field19535, final boolean field19536, final boolean field19537, final float field19538, final long field19539) {
        this.field19526 = field19526;
        this.field19527 = field19527;
        this.field19528 = field19528;
        this.field19529 = field19529;
        this.field19530 = field19530;
        this.field19531 = field19531;
        this.field19532 = field19532;
        this.field19533 = field19533;
        this.field19534 = field19534;
        this.field19535 = field19535;
        this.field19536 = field19536;
        this.field19537 = field19537;
        this.field19538 = field19538;
        this.field19539 = field19539;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19526 = class8654.method29494();
        this.field19527 = class8654.method29499(Class2146.class);
        this.field19528 = class8654.method29499(Class102.class);
        this.field19529 = class8654.method29513(32767);
        this.field19530 = new Class354(Class9546.method35651(class8654.readByte(), -32, 32), Class9546.method35651(class8654.readByte(), -32, 32), Class9546.method35651(class8654.readByte(), -32, 32));
        this.field19531 = new Class354(Class9546.method35651(class8654.readByte(), 0, 32), Class9546.method35651(class8654.readByte(), 0, 32), Class9546.method35651(class8654.readByte(), 0, 32));
        this.field19532 = class8654.method29499(Class2181.class);
        this.field19533 = class8654.method29499(Class2052.class);
        this.field19534 = class8654.method29513(12);
        this.field19538 = Class9546.method35653(class8654.readFloat(), 0.0f, 1.0f);
        this.field19539 = class8654.method29502();
        class8654.readByte();
        Class4360 class8655 = this;
        Class4360 class8656 = this;
        Class4360 class8657 = this;
    Label_0231_Outer:
        while (true) {
            final int n;
            while (true) {
                Label_0271: {
                    if ((n & 0x40000000) != 0x0) {
                        break Label_0271;
                    }
                    if ((n & 0x1) != 0x0) {
                        break Label_0231;
                    }
                    boolean field19537;
                    boolean field19536 = field19537 = false;
                    while (true) {
                        Label_0257: {
                            if ((n & 0x40) != 0x0) {
                                break Label_0257;
                            }
                            class8657.field19535 = field19537;
                            class8655 = this;
                            class8656 = this;
                            class8657 = this;
                            if ((n & 0x80000) != 0x0) {
                                break Label_0271;
                            }
                            if ((n & 0x40000000) != 0x0) {
                                continue Label_0231_Outer;
                            }
                            field19536 = (field19537 = false);
                        }
                        if ((n & 0x100000) == 0x0) {
                            continue;
                        }
                        break;
                    }
                    class8656.field19536 = field19536;
                    class8655 = this;
                    class8656 = this;
                    class8657 = this;
                }
                if ((n & 0x10) != 0x0) {
                    continue;
                }
                break;
            }
            if ((n & 0x2000000) == 0x0) {
                continue Label_0231_Outer;
            }
            break;
        }
        class8655.field19537 = false;
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19526);
        class8654.method29500(this.field19527);
        class8654.method29500(this.field19528);
        class8654.method29514(this.field19529);
        class8654.writeByte(this.field19530.method1074());
        class8654.writeByte(this.field19530.method1075());
        class8654.writeByte(this.field19530.method1076());
        class8654.writeByte(this.field19531.method1074());
        class8654.writeByte(this.field19531.method1075());
        class8654.writeByte(this.field19531.method1076());
        class8654.method29500(this.field19532);
        class8654.method29500(this.field19533);
        class8654.method29514(this.field19534);
        class8654.writeFloat(this.field19538);
        class8654.method29506(this.field19539);
        int n = 0;
        if (this.field19535) {
            n |= 0x1;
        }
        if (this.field19536) {
            n |= 0x2;
        }
        if (this.field19537) {
            n |= 0x4;
        }
        class8654.writeByte(n);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17452(this);
    }
    
    public Class354 method13101() {
        return this.field19526;
    }
    
    public Class2146 method13102() {
        return this.field19527;
    }
    
    public Class102 method13103() {
        return this.field19528;
    }
    
    public String method13104() {
        return this.field19529;
    }
    
    public Class354 method13105() {
        return this.field19530;
    }
    
    public Class354 method13106() {
        return this.field19531;
    }
    
    public Class2181 method13107() {
        return this.field19532;
    }
    
    public Class2052 method13108() {
        return this.field19533;
    }
    
    public String method13109() {
        return this.field19534;
    }
    
    public boolean method13110() {
        return this.field19535;
    }
    
    public boolean method13111() {
        return this.field19536;
    }
    
    public boolean method13112() {
        return this.field19537;
    }
    
    public float method13113() {
        return this.field19538;
    }
    
    public long method13114() {
        return this.field19539;
    }
}
