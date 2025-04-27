// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class7078 implements Class7079
{
    private static final ITextComponent field27560;
    private static final ITextComponent field27561;
    private static final ITextComponent field27562;
    private static final ITextComponent field27563;
    private final Class9106 field27564;
    private Class6869 field27565;
    private Class6869 field27566;
    private int field27567;
    private int field27568;
    private int field27569;
    private boolean field27570;
    private boolean field27571;
    private int field27572;
    private int field27573;
    
    public Class7078(final Class9106 field27564) {
        this.field27572 = -1;
        this.field27573 = -1;
        this.field27564 = field27564;
    }
    
    @Override
    public void method21655() {
        ++this.field27567;
        if (this.field27570) {
            ++this.field27568;
            this.field27570 = false;
        }
        if (this.field27571) {
            ++this.field27569;
            this.field27571 = false;
        }
        if (this.field27572 == -1) {
            if (this.field27568 > 40) {
                if (this.field27565 != null) {
                    this.field27565.method20985();
                    this.field27565 = null;
                }
                this.field27572 = this.field27567;
            }
        }
        if (this.field27573 == -1) {
            if (this.field27569 > 40) {
                if (this.field27566 != null) {
                    this.field27566.method20985();
                    this.field27566 = null;
                }
                this.field27573 = this.field27567;
            }
        }
        if (this.field27572 != -1) {
            if (this.field27573 != -1) {
                if (this.field27564.method32928() != Class101.field298) {
                    this.field27564.method32926(Class2012.field11444);
                }
                else {
                    this.field27564.method32926(Class2012.field11440);
                }
            }
        }
        if (this.field27565 != null) {
            this.field27565.method20986(this.field27568 / 40.0f);
        }
        if (this.field27566 != null) {
            this.field27566.method20986(this.field27569 / 40.0f);
        }
        if (this.field27567 >= 100) {
            if (this.field27572 == -1 && this.field27565 == null) {
                this.field27565 = new Class6869(Class2240.field13767, Class7078.field27560, Class7078.field27561, true);
                this.field27564.method32927().method5318().method3852(this.field27565);
            }
            else if (this.field27572 != -1) {
                if (this.field27567 - this.field27572 >= 20) {
                    if (this.field27573 == -1) {
                        if (this.field27566 == null) {
                            this.field27566 = new Class6869(Class2240.field13768, Class7078.field27562, Class7078.field27563, true);
                            this.field27564.method32927().method5318().method3852(this.field27566);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method21656() {
        if (this.field27565 != null) {
            this.field27565.method20985();
            this.field27565 = null;
        }
        if (this.field27566 != null) {
            this.field27566.method20985();
            this.field27566 = null;
        }
    }
    
    @Override
    public void method21657(final Class6093 class6093) {
        if (!class6093.field24723) {
            if (!class6093.field24724) {
                if (!class6093.field24725) {
                    if (!class6093.field24726) {
                        if (!class6093.field24727) {
                            return;
                        }
                    }
                }
            }
        }
        this.field27570 = true;
    }
    
    @Override
    public void method21658(final double a, final double a2) {
        if (Math.abs(a) > 0.01 || Math.abs(a2) > 0.01) {
            this.field27571 = true;
        }
    }
    
    static {
        field27560 = new Class2259("tutorial.move.title", Class9106.method32929("forward"), Class9106.method32929("left"), Class9106.method32929("back"), Class9106.method32929("right"));
        field27561 = new Class2259("tutorial.move.description", Class9106.method32929("jump"));
        field27562 = new Class2259("tutorial.look.title");
        field27563 = new Class2259("tutorial.look.description");
    }
}
