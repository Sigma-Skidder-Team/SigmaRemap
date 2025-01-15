// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class5526 extends Class5509
{
    public Class5526() {
        super(Class5412.field22555, "head_dragon", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5919(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5919)) {
            return null;
        }
        final Class5919 class5902 = (Class5919)class5901;
        if (!s.equals("head")) {
            return s.equals("jaw") ? ((Class6300)Class9570.method35828(class5902, Class9570.field41487)) : null;
        }
        return (Class6300)Class9570.method35828(class5902, Class9570.field41486);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "jaw" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float n) {
        final Class9550 field41126 = Class9550.field41126;
        Class4158 method35732 = field41126.method35732(Class5412.field22555);
        if (!(method35732 instanceof Class4174)) {
            return null;
        }
        if (method35732.method12456() == null) {
            method35732 = new Class4174(field41126);
        }
        final Map map = (Map)Class9570.field41601.method22630();
        if (map != null) {
            map.put(Class298.field1716, class5901);
            return (Class9559)method35732;
        }
        Class8571.method28848("Field not found: TileEntitySkullRenderer.MODELS");
        return null;
    }
}
