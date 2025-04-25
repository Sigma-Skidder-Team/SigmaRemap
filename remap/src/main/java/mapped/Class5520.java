// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5520 extends Class5515
{
    public Class5520() {
        super(EntityType.field29035, "turtle", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5932<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5839) {
            final Class5932 class5902 = (Class5932)class5901;
            return (Class6300)(s.equals("body2") ? Class9570.field41552.method22631(class5902) : super.method16812(class5901, s));
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return (String[]) Config.method28982(super.method16813(), "body2");
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4739 class5902 = new Class4739(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
