// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4716 extends Class4712<Class778, Class5857<Class778>>
{
    private static final Class1932 field20318;
    
    public Class4716(final Class8551 class8551) {
        super(class8551, new Class5857(0.0f), 0.5f);
        this.method13978((Class1799<Class778, Class5857<Class778>>)new Class1828((Class4778<Class511, Class5857<Class511>>)this));
    }
    
    public void method14021(final Class778 class778, final float n, final float n2, final Class7351 class779, final Class7807 class780, final int n3) {
        ((Class5857)this.field20301).method17591(!class778.method2713().method27620());
        super.method14006(class778, n, n2, class779, class780, n3);
    }
    
    public Class1932 method14022(final Class778 class778) {
        return Class4716.field20318;
    }
    
    public void method14023(final Class778 class778, final Class7351 class779, final float n) {
        class779.method22565(0.9375f, 0.9375f, 0.9375f);
    }
    
    static {
        field20318 = new Class1932("textures/entity/witch.png");
    }
}
