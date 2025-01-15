// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3557 extends Class3555<Class512>
{
    private static String[] field16639;
    private final Class850 field16640;
    private Class512 field16641;
    private int field16642;
    private int field16643;
    private final Class7843 field16644;
    private final Class7843 field16645;
    
    public Class3557(final Class850 field16640) {
        super(field16640, Class512.class, false);
        this.field16645 = new Class7843().method25340();
        this.field16640 = field16640;
        this.field16644 = new Class7843().method25337(this.method11096()).method25343(class851 -> Class850.method5085(class850, (Class512)class851));
    }
    
    @Override
    public boolean method11013() {
        this.field16641 = this.field16640.field2391.method7135(this.field16644, this.field16640);
        return this.field16641 != null;
    }
    
    @Override
    public void method11015() {
        this.field16642 = 5;
        this.field16643 = 0;
        this.field16640.method5083();
    }
    
    @Override
    public void method11018() {
        this.field16641 = null;
        super.method11018();
    }
    
    @Override
    public boolean method11017() {
        if (this.field16641 == null) {
            return (this.field16636 != null && this.field16645.method25344(this.field16640, this.field16636)) || super.method11017();
        }
        if (Class850.method5085(this.field16640, this.field16641)) {
            this.field16640.method4176(this.field16641, 10.0f, 10.0f);
            return true;
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16641 == null) {
            if (this.field16636 != null) {
                if (!this.field16640.method1805()) {
                    if (!Class850.method5085(this.field16640, (Class512)this.field16636)) {
                        if (this.field16636.method1734(this.field16640) > 256.0) {
                            if (this.field16643++ >= 30) {
                                if (Class850.method5086(this.field16640, this.field16636)) {
                                    this.field16643 = 0;
                                }
                            }
                        }
                    }
                    else {
                        if (this.field16636.method1734(this.field16640) < 16.0) {
                            this.field16640.method5076();
                        }
                        this.field16643 = 0;
                    }
                }
            }
            super.method11016();
        }
        else if (--this.field16642 <= 0) {
            this.field16636 = this.field16641;
            this.field16641 = null;
            super.method11015();
        }
    }
}
