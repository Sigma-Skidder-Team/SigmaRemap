// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5588 extends Class5509
{
    public Class5588() {
        super(Class5412.field22563, "shulker_box", 0.0f);
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
    public Class9559 method16814(final Class5901 class5901, final float n) {
        final Class9550 field41126 = Class9550.field41126;
        Class4158 method35732 = field41126.method35732(Class5412.field22563);
        if (!(method35732 instanceof Class4160)) {
            return null;
        }
        if (method35732.method12456() == null) {
            method35732 = new Class4160((Class5876<?>)class5901, field41126);
        }
        if (Class9570.field41597.method22634()) {
            Class9570.method35837(method35732, Class9570.field41597, class5901);
            return (Class9559)method35732;
        }
        Class8571.method28848("Field not found: TileEntityShulkerBoxRenderer.model");
        return null;
    }
}
