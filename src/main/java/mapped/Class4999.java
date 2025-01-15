// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4999 extends Class4997<Boolean>
{
    public boolean field21516;
    
    public Class4999(final String s, final String s2, final boolean b) {
        super(s, s2, Class2076.field11981, b);
        this.field21516 = false;
    }
    
    public Class4999 method15206() {
        this.field21516 = true;
        return this;
    }
    
    @Override
    public void method15201() {
        this.field21516 = false;
    }
    
    @Override
    public boolean method15202() {
        return this.field21516;
    }
    
    public void method15207(final Boolean b, final boolean b2) {
        if (this.field21516) {
            if (b2) {
                Class9463.method35173().method35197().method25776(new Class6224("Premium", "Not yet available for free version"));
            }
        }
        super.method15200(b, b2);
    }
    
    public Boolean method15208() {
        if (!this.field21516) {
            return (Boolean)this.field21511;
        }
        return (Boolean)this.field21512;
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.field21511 = (T)Boolean.valueOf(Class8105.method26630(class4405, "value", this.method15203()));
        return class4405;
    }
}
