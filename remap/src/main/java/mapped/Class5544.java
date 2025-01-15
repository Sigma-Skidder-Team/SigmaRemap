// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5544 extends Class5543
{
    public Class5544() {
        super(EntityType.field28958, "armor_stand", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5867();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5867)) {
            return null;
        }
        final Class5867 class5902 = (Class5867)class5901;
        if (s.equals("right")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41448, 0);
        }
        if (s.equals("left")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41448, 1);
        }
        if (!s.equals("waist")) {
            return (Class6300)(s.equals("base") ? Class9570.method35831(class5902, Class9570.field41448, 3) : super.method16812(class5902, s));
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41448, 2);
    }
    
    @Override
    public String[] method16813() {
        return (String[])Class8571.method28984(super.method16813(), new String[] { "right", "left", "waist", "base" });
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4779 class5902 = new Class4779(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
