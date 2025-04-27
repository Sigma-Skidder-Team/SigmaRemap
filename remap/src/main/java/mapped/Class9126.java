// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import com.google.common.base.Optional;
import com.google.common.collect.BiMap;

public class Class9126
{
    private static final BiMap<String, Integer> field38680;
    
    private static void method33111(final String s) {
        Class9126.field38680.put((Object)s, (Object)Class9126.field38680.size());
    }
    
    public static int method33112(final String s) {
        if (Class9126.field38680.containsKey(s)) {
            return 0x17F0000 | (Class9126.field38680.get(s) & 0xFFFF);
        }
        return -1;
    }
    
    public static Optional<String> method33113(final int n) {
        if (n >> 16 == 383) {
            return Optional.fromNullable(Class9126.field38680.inverse().get(n & 0xFFFF));
        }
        return Optional.absent();
    }
    
    static {
        field38680 = HashBiMap.create();
        method33111("minecraft:bat");
        method33111("minecraft:blaze");
        method33111("minecraft:cave_spider");
        method33111("minecraft:chicken");
        method33111("minecraft:cow");
        method33111("minecraft:creeper");
        method33111("minecraft:donkey");
        method33111("minecraft:elder_guardian");
        method33111("minecraft:enderman");
        method33111("minecraft:endermite");
        method33111("minecraft:evocation_illager");
        method33111("minecraft:ghast");
        method33111("minecraft:guardian");
        method33111("minecraft:horse");
        method33111("minecraft:husk");
        method33111("minecraft:llama");
        method33111("minecraft:magma_cube");
        method33111("minecraft:mooshroom");
        method33111("minecraft:mule");
        method33111("minecraft:ocelot");
        method33111("minecraft:parrot");
        method33111("minecraft:pig");
        method33111("minecraft:polar_bear");
        method33111("minecraft:rabbit");
        method33111("minecraft:sheep");
        method33111("minecraft:shulker");
        method33111("minecraft:silverfish");
        method33111("minecraft:skeleton");
        method33111("minecraft:skeleton_horse");
        method33111("minecraft:slime");
        method33111("minecraft:spider");
        method33111("minecraft:squid");
        method33111("minecraft:stray");
        method33111("minecraft:vex");
        method33111("minecraft:villager");
        method33111("minecraft:vindication_illager");
        method33111("minecraft:witch");
        method33111("minecraft:wither_skeleton");
        method33111("minecraft:wolf");
        method33111("minecraft:zombie");
        method33111("minecraft:zombie_horse");
        method33111("minecraft:zombie_pigman");
        method33111("minecraft:zombie_villager");
    }
}
