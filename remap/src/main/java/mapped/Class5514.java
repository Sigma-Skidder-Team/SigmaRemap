// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class5514 extends Class5509
{
    private static Map<String, Integer> field22813;
    
    public Class5514() {
        super(EntityType.field28985, "fox", 0.4f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5927<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5927)) {
            return null;
        }
        final Class5927 class5902 = (Class5927)class5901;
        final Map<String, Integer> method16820 = method16820();
        if (!method16820.containsKey(s)) {
            return null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41495, (int)method16820.get(s));
    }
    
    @Override
    public String[] method16813() {
        return method16820().keySet().toArray(new String[0]);
    }
    
    private static Map<String, Integer> method16820() {
        if (Class5514.field22813 == null) {
            (Class5514.field22813 = new HashMap<String, Integer>()).put("head", 0);
            Class5514.field22813.put("body", 4);
            Class5514.field22813.put("leg1", 5);
            Class5514.field22813.put("leg2", 6);
            Class5514.field22813.put("leg3", 7);
            Class5514.field22813.put("leg4", 8);
            Class5514.field22813.put("tail", 9);
            return Class5514.field22813;
        }
        return Class5514.field22813;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4731 class5902 = new Class4731(Minecraft.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5514.field22813 = null;
    }
}
