// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.function.Predicate;

public enum HeightmapType
{
    field11521("WORLD_SURFACE_WG", Class2106.field12209, (Predicate<BlockState>)Class9548.method35721()),
    field11522("WORLD_SURFACE", Class2106.field12211, (Predicate<BlockState>)Class9548.method35721()),
    field11523("OCEAN_FLOOR_WG", Class2106.field12209, (Predicate<BlockState>)Class9548.method35722()),
    field11524("OCEAN_FLOOR", Class2106.field12210, (Predicate<BlockState>)Class9548.method35722()),
    field11525("MOTION_BLOCKING", Class2106.field12211, class7096 -> class7096.getMaterial().method26440() || !class7096.getFluidState().isEmpty()),
    field11526("MOTION_BLOCKING_NO_LEAVES", Class2106.field12210, class7097 -> {
        final boolean b;
        if (class7097.getMaterial().method26440() || !class7097.getFluidState().isEmpty()) {
            if (!(class7097.getBlock() instanceof Class3972)) {
                return b;
            }
        }
        return b;
    });
    
    private final String field11527;
    private final Class2106 field11528;
    private final Predicate<BlockState> field11529;
    private static final Map<String, HeightmapType> field11530;
    
    private HeightmapType(final String field11527, final Class2106 field11528, final Predicate<BlockState> field11529) {
        this.field11527 = field11527;
        this.field11528 = field11528;
        this.field11529 = field11529;
    }
    
    public String method8060() {
        return this.field11527;
    }
    
    public boolean method8061() {
        return this.field11528 == Class2106.field12211;
    }
    
    public boolean method8062() {
        return this.field11528 != Class2106.field12209;
    }
    
    public static HeightmapType method8063(final String s) {
        return HeightmapType.field11530.get(s);
    }
    
    public Predicate<BlockState> method8064() {
        return this.field11529;
    }
    
    static {
        field11530 = Util.method27851(Maps.newHashMap(), hashMap -> {
            values();
            final HeightmapType[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final HeightmapType value = array[i];
                hashMap.put(value.field11527, value);
            }
        });
    }
}
