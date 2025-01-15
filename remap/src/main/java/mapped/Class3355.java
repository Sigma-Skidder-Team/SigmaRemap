// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3355 extends Class3167
{
    public Class3355(final String s, final String s2, final Class8013 class8013) {
        super(class8013, s, s2);
    }
    
    @Override
    public boolean method9906() {
        return Class9463.method35173().method35201().method19352() && super.method9906();
    }
    
    @Override
    public void method9907(final boolean b) {
        if (Class9463.method35173().method35201().method19352()) {
            super.method9907(b);
            return;
        }
        if (this.field15518 != b) {
            Class9463.method35173().method35197().method25776(new Class6224("Premium", this.method9901() + " Not yet available for free version"));
            Class9463.method35173().method35196().method32830("error");
        }
    }
    
    @Override
    public void method9908(final boolean b) {
        if (Class9463.method35173().method35201().method19352()) {
            super.method9908(b);
            return;
        }
        if (this.field15518 != b) {
            if (b) {
                Class9463.method35173().method35197().method25776(new Class6224("Premium", this.method9901() + " Not yet available for free version"));
                Class9463.method35173().method35196().method32830("error");
            }
        }
    }
    
    @Override
    public void method9909(final boolean b) {
        if (Class9463.method35173().method35201().method19352()) {
            super.method9909(b);
            return;
        }
        if (this.method9906() != b) {
            Class9463.method35173().method35197().method25776(new Class6224("Premium", this.method9901() + " Not yet available for free version"));
            Class9463.method35173().method35196().method32830("error");
        }
    }
}
