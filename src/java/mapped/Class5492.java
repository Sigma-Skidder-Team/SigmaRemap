// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5492 implements Class5491
{
    private static String[] field22773;
    private final Class1847 field22774;
    private final Class354 field22775;
    
    public Class5492(final Class1847 field22774, final Class354 field22775) {
        this.field22774 = field22774;
        this.field22775 = field22775;
    }
    
    @Override
    public Class1847 method16763() {
        return this.field22774;
    }
    
    @Override
    public double method16760() {
        return this.field22775.method1074() + 0.5;
    }
    
    @Override
    public double method16761() {
        return this.field22775.method1075() + 0.5;
    }
    
    @Override
    public double method16762() {
        return this.field22775.method1076() + 0.5;
    }
    
    @Override
    public Class354 method16764() {
        return this.field22775;
    }
    
    @Override
    public Class7096 method16765() {
        return this.field22774.method6701(this.field22775);
    }
    
    @Override
    public <T extends Class436> T method16766() {
        return (T)this.field22774.method6727(this.field22775);
    }
}
