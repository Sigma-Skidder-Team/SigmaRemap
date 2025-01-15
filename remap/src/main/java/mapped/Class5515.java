// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5515 extends Class5509
{
    public Class5515(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5839)) {
            return null;
        }
        final Class5839 class5902 = (Class5839)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41520.method21625(class5902, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41520.method21625(class5902, 1);
        }
        if (s.equals("leg1")) {
            return (Class6300)Class9570.field41520.method21625(class5902, 2);
        }
        if (s.equals("leg2")) {
            return (Class6300)Class9570.field41520.method21625(class5902, 3);
        }
        if (!s.equals("leg3")) {
            return s.equals("leg4") ? ((Class6300)Class9570.field41520.method21625(class5902, 5)) : null;
        }
        return (Class6300)Class9570.field41520.method21625(class5902, 4);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "leg1", "leg2", "leg3", "leg4" };
    }
}
