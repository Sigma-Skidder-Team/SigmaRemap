// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class5533 extends Class5509
{
    private static Map<String, Integer> field22814;
    
    public Class5533() {
        super(EntityType.field29008, "ocelot", 0.4f);
    }
    
    public Class5533(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5925<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5925)) {
            return null;
        }
        final Class5925 class5902 = (Class5925)class5901;
        final Map<String, Integer> method16821 = method16821();
        if (!method16821.containsKey(s)) {
            return null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41508, method16821.get(s));
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body" };
    }
    
    private static Map<String, Integer> method16821() {
        if (Class5533.field22814 == null) {
            (Class5533.field22814 = new HashMap<String, Integer>()).put("back_left_leg", 0);
            Class5533.field22814.put("back_right_leg", 1);
            Class5533.field22814.put("front_left_leg", 2);
            Class5533.field22814.put("front_right_leg", 3);
            Class5533.field22814.put("tail", 4);
            Class5533.field22814.put("tail2", 5);
            Class5533.field22814.put("head", 6);
            Class5533.field22814.put("body", 7);
            return Class5533.field22814;
        }
        return Class5533.field22814;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4776 class5902 = new Class4776(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5533.field22814 = null;
    }
}
