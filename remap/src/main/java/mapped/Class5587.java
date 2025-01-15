// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5587 extends Class5509
{
    public Class5587() {
        super(EntityType.field29051, "wolf", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5922<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5922)) {
            return null;
        }
        final Class5922 class5902 = (Class5922)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 1);
        }
        if (s.equals("leg1")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 2);
        }
        if (s.equals("leg2")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 3);
        }
        if (s.equals("leg3")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 4);
        }
        if (s.equals("leg4")) {
            return (Class6300)Class9570.field41564.method21625(class5902, 5);
        }
        if (!s.equals("tail")) {
            return s.equals("mane") ? ((Class6300)Class9570.field41564.method21625(class5902, 7)) : null;
        }
        return (Class6300)Class9570.field41564.method21625(class5902, 6);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4744 class5902 = new Class4744(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
