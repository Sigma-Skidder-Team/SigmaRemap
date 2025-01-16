// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class5590 extends Class5509
{
    private static Map<String, Integer> field22820;
    
    public Class5590() {
        super(EntityType.field29017, "rabbit", 0.3f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5900<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5900)) {
            return null;
        }
        final Class5900 class5902 = (Class5900)class5901;
        final Map<String, Integer> method16827 = method16827();
        if (!method16827.containsKey(s)) {
            return null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41522, (int)method16827.get(s));
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose" };
    }
    
    private static Map<String, Integer> method16827() {
        if (Class5590.field22820 == null) {
            (Class5590.field22820 = new HashMap<String, Integer>()).put("left_foot", 0);
            Class5590.field22820.put("right_foot", 1);
            Class5590.field22820.put("left_thigh", 2);
            Class5590.field22820.put("right_thigh", 3);
            Class5590.field22820.put("body", 4);
            Class5590.field22820.put("left_arm", 5);
            Class5590.field22820.put("right_arm", 6);
            Class5590.field22820.put("head", 7);
            Class5590.field22820.put("right_ear", 8);
            Class5590.field22820.put("left_ear", 9);
            Class5590.field22820.put("tail", 10);
            Class5590.field22820.put("nose", 11);
            return Class5590.field22820;
        }
        return Class5590.field22820;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4737 class5902 = new Class4737(Minecraft.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5590.field22820 = null;
    }
}
