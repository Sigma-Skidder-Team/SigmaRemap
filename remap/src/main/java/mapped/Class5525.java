// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5525 extends Class5509
{
    public Class5525() {
        super(EntityType.field28971, "dolphin", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5882<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5882)) {
            return null;
        }
        final Class6300 class5902 = (Class6300)Class9570.field41467.method22631(class5901);
        if (class5902 == null) {
            return null;
        }
        if (s.equals("body")) {
            return class5902;
        }
        if (s.equals("back_fin")) {
            return class5902.method18655(0);
        }
        if (s.equals("left_fin")) {
            return class5902.method18655(1);
        }
        if (s.equals("right_fin")) {
            return class5902.method18655(2);
        }
        if (!s.equals("tail")) {
            return s.equals("head") ? class5902.method18655(4) : null;
        }
        return class5902.method18655(3);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "back_fin", "left_fin", "right_fin", "tail", "head" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4717 class5902 = new Class4717(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
