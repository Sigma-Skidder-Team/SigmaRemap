// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4727 extends Class4723<Class769>
{
    private static final Class1932 field20329;
    
    public Class4727(final Class8551 class8551) {
        super(class8551, new Class5851(0.0f, 0.0f, 64, 64), 0.5f);
        this.method13978((Class1799<T, Class5851<T>>)new Class1825(this, this));
        ((Class5851)this.field20301).method17576().field25187 = true;
    }
    
    public Class1932 method14038(final Class769 class769) {
        return Class4727.field20329;
    }
    
    public void method14039(final Class769 class769, final float n, final float n2, final Class7351 class770, final Class7807 class771, final int n3) {
        if (!class769.method1823()) {
            super.method14006((T)class769, n, n2, class770, class771, n3);
        }
        else {
            final Class5487[] method4261 = class769.method4261(n2);
            final float method4262 = ((Class4710<T, M>)this).method13987((T)class769, n2);
            for (int i = 0; i < method4261.length; ++i) {
                class770.method22567();
                class770.method22564(method4261[i].field22770 + Class9546.method35639(i + method4262 * 0.5f) * 0.025, method4261[i].field22771 + Class9546.method35639(i + method4262 * 0.75f) * 0.0125, method4261[i].field22772 + Class9546.method35639(i + method4262 * 0.7f) * 0.025);
                super.method14006((T)class769, n, n2, class770, class771, n3);
                class770.method22568();
            }
        }
    }
    
    public boolean method14040(final Class769 class769) {
        return true;
    }
    
    static {
        field20329 = new Class1932("textures/entity/illager/illusioner.png");
    }
}
