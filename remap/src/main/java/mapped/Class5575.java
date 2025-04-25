// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5575 extends Class5509
{
    public Class5575() {
        super(EntityType.field28962, "blaze", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5885<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5885)) {
            return null;
        }
        final Class5885 class5902 = (Class5885)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.method35828(class5902, Class9570.field41456);
        }
        final String prefix = "stick";
        if (!s.startsWith(prefix)) {
            return null;
        }
        final Class6300[] array = (Class6300[])Class9570.method35828(class5902, Class9570.field41457);
        if (array != null) {
            int method28933 = Config.method28933(s.substring(prefix.length()), -1);
            return (--method28933 >= 0 && method28933 < array.length) ? array[method28933] : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4777 class5902 = new Class4777(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
