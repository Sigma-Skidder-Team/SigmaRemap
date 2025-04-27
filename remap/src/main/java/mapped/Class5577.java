// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class5577 extends Class5509
{
    private static Map<String, Integer> field22819;
    
    public Class5577() {
        super(EntityType.field29056, "ravager", 1.1f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5884();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5884)) {
            return null;
        }
        final Class5884 class5902 = (Class5884)class5901;
        final Map<String, Integer> method16826 = method16826();
        if (!method16826.containsKey(s)) {
            return null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41524, method16826.get(s));
    }
    
    @Override
    public String[] method16813() {
        return method16826().keySet().toArray(new String[0]);
    }
    
    private static Map<String, Integer> method16826() {
        if (Class5577.field22819 == null) {
            (Class5577.field22819 = new HashMap<String, Integer>()).put("head", 0);
            Class5577.field22819.put("jaw", 1);
            Class5577.field22819.put("body", 2);
            Class5577.field22819.put("leg1", 3);
            Class5577.field22819.put("leg2", 4);
            Class5577.field22819.put("leg3", 5);
            Class5577.field22819.put("leg4", 6);
            Class5577.field22819.put("neck", 7);
            return Class5577.field22819;
        }
        return Class5577.field22819;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4766 class5902 = new Class4766(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
    
    static {
        Class5577.field22819 = null;
    }
}
