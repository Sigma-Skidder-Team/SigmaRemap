// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import java.util.stream.Stream;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.mojang.datafixers.DataFix;

public class Class6713 extends DataFix
{
    private static final Int2ObjectMap<String> field26445;
    
    public Class6713(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemStackEnchantmentFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            final Type type;
            type.findField("tag");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), (Function)this::method20390));
        });
    }
    
    private Dynamic<?> method20390(Dynamic<?> set) {
        final Optional map = set.get("ench").asStreamOpt().map(stream -> stream.map(dynamic -> dynamic.set("id", dynamic.createString(Class6713.field26445.getOrDefault(dynamic.get("id").asInt(0), (Object)"null"))))).map(set::createList);
        if (map.isPresent()) {
            set = set.remove("ench").set("Enchantments", (Dynamic)map.get());
        }
        return set.update("StoredEnchantments", dynamic2 -> DataFixUtils.orElse((Optional)dynamic2.asStreamOpt().map(stream2 -> stream2.map(dynamic3 -> dynamic3.set("id", dynamic3.createString(Class6713.field26445.getOrDefault(dynamic3.get("id").asInt(0), (Object)"null"))))).map(dynamic2::createList), (Object)dynamic2));
    }
    
    static {
        field26445 = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
            int2ObjectOpenHashMap.put(0, (Object)"minecraft:protection");
            int2ObjectOpenHashMap.put(1, (Object)"minecraft:fire_protection");
            int2ObjectOpenHashMap.put(2, (Object)"minecraft:feather_falling");
            int2ObjectOpenHashMap.put(3, (Object)"minecraft:blast_protection");
            int2ObjectOpenHashMap.put(4, (Object)"minecraft:projectile_protection");
            int2ObjectOpenHashMap.put(5, (Object)"minecraft:respiration");
            int2ObjectOpenHashMap.put(6, (Object)"minecraft:aqua_affinity");
            int2ObjectOpenHashMap.put(7, (Object)"minecraft:thorns");
            int2ObjectOpenHashMap.put(8, (Object)"minecraft:depth_strider");
            int2ObjectOpenHashMap.put(9, (Object)"minecraft:frost_walker");
            int2ObjectOpenHashMap.put(10, (Object)"minecraft:binding_curse");
            int2ObjectOpenHashMap.put(16, (Object)"minecraft:sharpness");
            int2ObjectOpenHashMap.put(17, (Object)"minecraft:smite");
            int2ObjectOpenHashMap.put(18, (Object)"minecraft:bane_of_arthropods");
            int2ObjectOpenHashMap.put(19, (Object)"minecraft:knockback");
            int2ObjectOpenHashMap.put(20, (Object)"minecraft:fire_aspect");
            int2ObjectOpenHashMap.put(21, (Object)"minecraft:looting");
            int2ObjectOpenHashMap.put(22, (Object)"minecraft:sweeping");
            int2ObjectOpenHashMap.put(32, (Object)"minecraft:efficiency");
            int2ObjectOpenHashMap.put(33, (Object)"minecraft:silk_touch");
            int2ObjectOpenHashMap.put(34, (Object)"minecraft:unbreaking");
            int2ObjectOpenHashMap.put(35, (Object)"minecraft:fortune");
            int2ObjectOpenHashMap.put(48, (Object)"minecraft:power");
            int2ObjectOpenHashMap.put(49, (Object)"minecraft:punch");
            int2ObjectOpenHashMap.put(50, (Object)"minecraft:flame");
            int2ObjectOpenHashMap.put(51, (Object)"minecraft:infinity");
            int2ObjectOpenHashMap.put(61, (Object)"minecraft:luck_of_the_sea");
            int2ObjectOpenHashMap.put(62, (Object)"minecraft:lure");
            int2ObjectOpenHashMap.put(65, (Object)"minecraft:loyalty");
            int2ObjectOpenHashMap.put(66, (Object)"minecraft:impaling");
            int2ObjectOpenHashMap.put(67, (Object)"minecraft:riptide");
            int2ObjectOpenHashMap.put(68, (Object)"minecraft:channeling");
            int2ObjectOpenHashMap.put(70, (Object)"minecraft:mending");
            int2ObjectOpenHashMap.put(71, (Object)"minecraft:vanishing_curse");
        });
    }
}
