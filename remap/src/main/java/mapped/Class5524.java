// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5524 extends Class5509
{
    public Class5524() {
        super(Class5412.field22548, "sign", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5902();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5902)) {
            return null;
        }
        final Class5902 class5902 = (Class5902)class5901;
        if (!s.equals("board")) {
            return s.equals("stick") ? ((Class6300)Class9570.field41532.method21625(class5902, 1)) : null;
        }
        return (Class6300)Class9570.field41532.method21625(class5902, 0);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "board", "stick" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float n) {
        final Class9550 field41126 = Class9550.field41126;
        Class4158 method35732 = field41126.method35732(Class5412.field22548);
        if (!(method35732 instanceof Class4159)) {
            return null;
        }
        if (method35732.method12456() == null) {
            method35732 = new Class4159(field41126);
        }
        if (Class9570.field41599.method22634()) {
            Class9570.method35837(method35732, Class9570.field41599, class5901);
            return (Class9559)method35732;
        }
        Config.warn("Field not found: TileEntitySignRenderer.model");
        return null;
    }
}
