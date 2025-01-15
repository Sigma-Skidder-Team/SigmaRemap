// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6835 implements Class6834
{
    public Class7832 field26831;
    private Class7833 field26832;
    public final Class286 field26833;
    public final Class1932 field26834;
    public float field26835;
    public float field26836;
    public float field26837;
    public float field26838;
    public float field26839;
    public boolean field26840;
    public int field26841;
    public Class229 field26842;
    public boolean field26843;
    public boolean field26844;
    
    public Class6835(final Class7795 class7795, final Class286 class7796) {
        this(class7795.method25124(), class7796);
    }
    
    public Class6835(final Class1932 field26834, final Class286 field26835) {
        this.field26835 = 1.0f;
        this.field26836 = 1.0f;
        this.field26842 = Class229.field810;
        this.field26834 = field26834;
        this.field26833 = field26835;
    }
    
    @Override
    public Class1932 method20920() {
        return this.field26834;
    }
    
    @Override
    public Class7833 method20921(final Class1784 class1784) {
        this.field26832 = class1784.method6419(this.field26834);
        if (this.field26832 != null) {
            this.field26831 = this.field26832.method25301();
        }
        else {
            this.field26831 = Class1784.field9895;
        }
        return this.field26832;
    }
    
    @Override
    public Class7832 method20922() {
        return this.field26831;
    }
    
    @Override
    public Class286 method20923() {
        return this.field26833;
    }
    
    @Override
    public boolean method20924() {
        return this.field26840;
    }
    
    @Override
    public int method20926() {
        return this.field26841;
    }
    
    @Override
    public float method20927() {
        return this.field26835 * this.field26831.method25306();
    }
    
    @Override
    public float method20928() {
        return this.field26836 * this.field26831.method25307();
    }
    
    @Override
    public float method20929() {
        return this.field26837;
    }
    
    @Override
    public float method20930() {
        return this.field26838;
    }
    
    @Override
    public float method20931() {
        return this.field26839;
    }
    
    @Override
    public Class229 method20932() {
        return this.field26842;
    }
    
    @Override
    public boolean method20925() {
        return this.field26844;
    }
}
