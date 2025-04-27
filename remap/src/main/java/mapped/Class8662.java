// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.Maps;
import java.util.HashMap;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class8662 extends DataFix
{
    private static final Map<String, String> field36391;
    
    public Class8662(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40622);
        DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
        DSL.fieldFinder("id", DSL.namespacedString());
        type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemInstanceSpawnEggFix", type, typed -> {
            final OpticFinder opticFinder5;
            opticFinder5.type().findField("EntityTag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent()) {
                if (Objects.equals(optional.get().getSecond(), "minecraft:spawn_egg")) {
                    typed.getOrCreateTyped(opticFinder2).getOrCreateTyped(opticFinder3).getOptional(opticFinder4);
                    final Optional optional2;
                    if (optional2.isPresent()) {
                        return typed.set(opticFinder, (Object)Pair.of((Object)Class9451.field40628.typeName(), (Object)Class8662.field36391.getOrDefault(optional2.get(), "minecraft:pig_spawn_egg")));
                    }
                }
            }
            return typed;
        });
    }
    
    static {
        field36391 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("minecraft:bat", "minecraft:bat_spawn_egg");
            hashMap.put("minecraft:blaze", "minecraft:blaze_spawn_egg");
            hashMap.put("minecraft:cave_spider", "minecraft:cave_spider_spawn_egg");
            hashMap.put("minecraft:chicken", "minecraft:chicken_spawn_egg");
            hashMap.put("minecraft:cow", "minecraft:cow_spawn_egg");
            hashMap.put("minecraft:creeper", "minecraft:creeper_spawn_egg");
            hashMap.put("minecraft:donkey", "minecraft:donkey_spawn_egg");
            hashMap.put("minecraft:elder_guardian", "minecraft:elder_guardian_spawn_egg");
            hashMap.put("minecraft:enderman", "minecraft:enderman_spawn_egg");
            hashMap.put("minecraft:endermite", "minecraft:endermite_spawn_egg");
            hashMap.put("minecraft:evocation_illager", "minecraft:evocation_illager_spawn_egg");
            hashMap.put("minecraft:ghast", "minecraft:ghast_spawn_egg");
            hashMap.put("minecraft:guardian", "minecraft:guardian_spawn_egg");
            hashMap.put("minecraft:horse", "minecraft:horse_spawn_egg");
            hashMap.put("minecraft:husk", "minecraft:husk_spawn_egg");
            hashMap.put("minecraft:llama", "minecraft:llama_spawn_egg");
            hashMap.put("minecraft:magma_cube", "minecraft:magma_cube_spawn_egg");
            hashMap.put("minecraft:mooshroom", "minecraft:mooshroom_spawn_egg");
            hashMap.put("minecraft:mule", "minecraft:mule_spawn_egg");
            hashMap.put("minecraft:ocelot", "minecraft:ocelot_spawn_egg");
            hashMap.put("minecraft:pufferfish", "minecraft:pufferfish_spawn_egg");
            hashMap.put("minecraft:parrot", "minecraft:parrot_spawn_egg");
            hashMap.put("minecraft:pig", "minecraft:pig_spawn_egg");
            hashMap.put("minecraft:polar_bear", "minecraft:polar_bear_spawn_egg");
            hashMap.put("minecraft:rabbit", "minecraft:rabbit_spawn_egg");
            hashMap.put("minecraft:sheep", "minecraft:sheep_spawn_egg");
            hashMap.put("minecraft:shulker", "minecraft:shulker_spawn_egg");
            hashMap.put("minecraft:silverfish", "minecraft:silverfish_spawn_egg");
            hashMap.put("minecraft:skeleton", "minecraft:skeleton_spawn_egg");
            hashMap.put("minecraft:skeleton_horse", "minecraft:skeleton_horse_spawn_egg");
            hashMap.put("minecraft:slime", "minecraft:slime_spawn_egg");
            hashMap.put("minecraft:spider", "minecraft:spider_spawn_egg");
            hashMap.put("minecraft:squid", "minecraft:squid_spawn_egg");
            hashMap.put("minecraft:stray", "minecraft:stray_spawn_egg");
            hashMap.put("minecraft:turtle", "minecraft:turtle_spawn_egg");
            hashMap.put("minecraft:vex", "minecraft:vex_spawn_egg");
            hashMap.put("minecraft:villager", "minecraft:villager_spawn_egg");
            hashMap.put("minecraft:vindication_illager", "minecraft:vindication_illager_spawn_egg");
            hashMap.put("minecraft:witch", "minecraft:witch_spawn_egg");
            hashMap.put("minecraft:wither_skeleton", "minecraft:wither_skeleton_spawn_egg");
            hashMap.put("minecraft:wolf", "minecraft:wolf_spawn_egg");
            hashMap.put("minecraft:zombie", "minecraft:zombie_spawn_egg");
            hashMap.put("minecraft:zombie_horse", "minecraft:zombie_horse_spawn_egg");
            hashMap.put("minecraft:zombie_pigman", "minecraft:zombie_pigman_spawn_egg");
            hashMap.put("minecraft:zombie_villager", "minecraft:zombie_villager_spawn_egg");
        });
    }
}
