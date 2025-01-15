// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5562 extends Class5509
{
    public Class5562() {
        super(EntityType.field29020, "shulker", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5876<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5876)) {
            return null;
        }
        final Class5876 class5902 = (Class5876)class5901;
        if (s.equals("base")) {
            return (Class6300)Class9570.field41528.method21625(class5902, 0);
        }
        if (!s.equals("lid")) {
            return s.equals("head") ? ((Class6300)Class9570.field41528.method21625(class5902, 2)) : null;
        }
        return (Class6300)Class9570.field41528.method21625(class5902, 1);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "base", "lid", "head" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4714 class5902 = new Class4714(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
