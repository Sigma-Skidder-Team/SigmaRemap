// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Objects;

public class Class731 extends Class527 implements Class732
{
    private String field3985;
    private String field3986;
    private int field3987;
    private boolean field3988;
    private Class9103 field3989;
    
    public Class731() {
        super(Class7895.field32402);
        this.field3985 = "";
        this.field3986 = "";
        this.field3989 = Class9203.method33675();
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public void method4036(final ITextComponent class2250) {
        this.method4037(class2250);
    }
    
    @Override
    public void method4037(final ITextComponent class2250) {
        this.field3985 = class2250.method8461();
        this.method4038(new Class2259("progress.working", new Object[0]));
    }
    
    @Override
    public void method4038(final ITextComponent class2250) {
        this.field3986 = class2250.method8461();
        this.method4039(0);
    }
    
    @Override
    public void method4039(final int field3987) {
        this.field3987 = field3987;
    }
    
    @Override
    public void method4040() {
        this.field3988 = true;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (!this.field3988) {
            if (this.field3989 != null && this.field3150.field4683 == null) {
                this.field3989.method32901(this.field3152, this.field3153);
            }
            else {
                this.method3041();
            }
            if (this.field3987 > 0) {
                this.method3295(this.field3156, this.field3985, this.field3152 / 2, 70, 16777215);
                if (!Objects.equals(this.field3986, "")) {
                    if (this.field3987 != 0) {
                        this.method3295(this.field3156, this.field3986 + " " + this.field3987 + "%", this.field3152 / 2, 90, 16777215);
                    }
                }
            }
            super.method2975(n, n2, n3);
        }
        else if (!this.field3150.method5311()) {
            this.field3150.method5244(null);
        }
    }
}
