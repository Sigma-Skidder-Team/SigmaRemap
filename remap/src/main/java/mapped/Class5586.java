// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5586 extends Class5509
{
    public Class5586() {
        super(EntityType.field29025, "slime", 0.25f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5871<Object>(16);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5871)) {
            return null;
        }
        final Class5871 class5902 = (Class5871)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41539, 0);
        }
        if (s.equals("left_eye")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41539, 1);
        }
        if (!s.equals("right_eye")) {
            return s.equals("mouth") ? ((Class6300)Class9570.method35831(class5902, Class9570.field41539, 3)) : null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41539, 2);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "left_eye", "right_eye", "mouth" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4772 class5902 = new Class4772(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
