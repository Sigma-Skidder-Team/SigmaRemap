// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class5556 extends Class5509
{
    private static Map<String, Integer> field22815;
    private static Map<String, Integer> field22816;
    private static Map<String, Integer> field22817;
    
    public Class5556() {
        super(EntityType.field28989, "horse", 0.75f);
    }
    
    public Class5556(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5928<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5928)) {
            return null;
        }
        final Class5928 class5902 = (Class5928)class5901;
        if (Class5556.field22815.containsKey(s)) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41489, Class5556.field22815.get(s));
        }
        if (Class5556.field22816.containsKey(s)) {
            return this.method16812(class5902, "neck").method18655(Class5556.field22816.get(s));
        }
        if (!Class5556.field22817.containsKey(s)) {
            return null;
        }
        return this.method16812(class5902, "body").method18655(Class5556.field22817.get(s));
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "neck", "back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "child_back_left_leg", "child_back_right_leg", "child_front_left_leg", "child_front_right_leg", "tail", "saddle", "head", "mane", "mouth", "left_ear", "right_ear", "left_bit", "right_bit", "left_rein", "right_rein", "headpiece", "noseband" };
    }
    
    private static Map<String, Integer> method16822() {
        final HashMap hashMap = new HashMap();
        hashMap.put("body", 0);
        hashMap.put("neck", 1);
        hashMap.put("back_left_leg", 2);
        hashMap.put("back_right_leg", 3);
        hashMap.put("front_left_leg", 4);
        hashMap.put("front_right_leg", 5);
        hashMap.put("child_back_left_leg", 6);
        hashMap.put("child_back_right_leg", 7);
        hashMap.put("child_front_left_leg", 8);
        hashMap.put("child_front_right_leg", 9);
        return hashMap;
    }
    
    private static Map<String, Integer> method16823() {
        final HashMap hashMap = new HashMap();
        hashMap.put("head", 0);
        hashMap.put("mane", 1);
        hashMap.put("mouth", 2);
        hashMap.put("left_ear", 3);
        hashMap.put("right_ear", 4);
        hashMap.put("left_bit", 5);
        hashMap.put("right_bit", 6);
        hashMap.put("left_rein", 7);
        hashMap.put("right_rein", 8);
        hashMap.put("headpiece", 9);
        hashMap.put("noseband", 10);
        return hashMap;
    }
    
    private static Map<String, Integer> method16824() {
        final HashMap hashMap = new HashMap();
        hashMap.put("tail", 0);
        hashMap.put("saddle", 1);
        return hashMap;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4762 class5902 = new Class4762(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5556.field22815 = method16822();
        Class5556.field22816 = method16823();
        Class5556.field22817 = method16824();
    }
}
