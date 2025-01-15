// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5563 extends Class5509
{
    public Class5563() {
        super(EntityType.field28996, "llama", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5899<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5899)) {
            return null;
        }
        final Class5899 class5902 = (Class5899)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 1);
        }
        if (s.equals("leg1")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 2);
        }
        if (s.equals("leg2")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 3);
        }
        if (s.equals("leg3")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 4);
        }
        if (s.equals("leg4")) {
            return (Class6300)Class9570.field41501.method21625(class5902, 5);
        }
        if (!s.equals("chest_right")) {
            return s.equals("chest_left") ? ((Class6300)Class9570.field41501.method21625(class5902, 7)) : null;
        }
        return (Class6300)Class9570.field41501.method21625(class5902, 6);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "leg1", "leg2", "leg3", "leg4", "chest_right", "chest_left" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4718 class5902 = new Class4718(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
