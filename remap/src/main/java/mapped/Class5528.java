// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5528 extends Class5509
{
    public Class5528() {
        super(EntityType.field28999, "minecart", 0.5f);
    }
    
    public Class5528(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5886<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5886) {
            final Class6300[] array = (Class6300[])Class9570.field41503.method22631(class5901);
            if (array != null) {
                if (s.equals("bottom")) {
                    return array[0];
                }
                if (s.equals("back")) {
                    return array[1];
                }
                if (s.equals("front")) {
                    return array[2];
                }
                if (s.equals("right")) {
                    return array[3];
                }
                if (s.equals("left")) {
                    return array[4];
                }
                if (s.equals("dirt")) {
                    return array[5];
                }
            }
            return null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "bottom", "back", "front", "right", "left", "dirt" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4708 class5902 = new Class4708(Class869.method5277().method5306());
        if (Class9570.field41576.method22634()) {
            Class9570.method35837(class5902, Class9570.field41576, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Class8571.method28848("Field not found: RenderMinecart.modelMinecart");
        return null;
    }
}
