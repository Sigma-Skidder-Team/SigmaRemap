// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class5565 extends Class5509
{
    private static Map<String, Integer> field22818;
    
    public Class5565() {
        super(EntityType.field29055, "phantom", 0.75f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5891<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5891)) {
            return null;
        }
        final Class5891 class5902 = (Class5891)class5901;
        final Map<String, Integer> method16825 = method16825();
        if (!method16825.containsKey(s)) {
            return null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41510, (int)method16825.get(s));
    }
    
    @Override
    public String[] method16813() {
        return method16825().keySet().toArray(new String[0]);
    }
    
    private static Map<String, Integer> method16825() {
        if (Class5565.field22818 == null) {
            (Class5565.field22818 = new HashMap<String, Integer>()).put("body", 0);
            Class5565.field22818.put("left_wing", 1);
            Class5565.field22818.put("left_wing_tip", 2);
            Class5565.field22818.put("right_wing", 3);
            Class5565.field22818.put("right_wing_tip", 4);
            Class5565.field22818.put("head", 5);
            Class5565.field22818.put("tail", 6);
            Class5565.field22818.put("tail2", 7);
            return Class5565.field22818;
        }
        return Class5565.field22818;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4722 class5902 = new Class4722(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5565.field22818 = null;
    }
}
