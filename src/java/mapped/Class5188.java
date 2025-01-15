// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5188 extends Class5174
{
    public Class5188(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        schema.registerSimple(registerEntities, "minecraft:egg");
        schema.registerSimple(registerEntities, "minecraft:ender_pearl");
        schema.registerSimple(registerEntities, "minecraft:fireball");
        schema.register(registerEntities, "minecraft:potion", p1 -> DSL.optionalFields("Potion", Class9451.field40622.in(schema2)));
        schema.registerSimple(registerEntities, "minecraft:small_fireball");
        schema.registerSimple(registerEntities, "minecraft:snowball");
        schema.registerSimple(registerEntities, "minecraft:wither_skull");
        schema.registerSimple(registerEntities, "minecraft:xp_bottle");
        schema.register(registerEntities, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", Class9451.field40623.in(schema3)));
        schema.register(registerEntities, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", Class9451.field40623.in(schema4), Class9478.method35286(schema4)));
        schema.register(registerEntities, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", Class9451.field40623.in(schema5), "TileEntityData", Class9451.field40621.in(schema5)));
        schema.register(registerEntities, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", Class9451.field40623.in(schema6)));
        schema.register(registerEntities, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema7), "Items", DSL.list(Class9451.field40622.in(schema7))));
        schema.register(registerEntities, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema8)));
        schema.register(registerEntities, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema9)));
        schema.register(registerEntities, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema10), "Items", DSL.list(Class9451.field40622.in(schema10))));
        schema.register(registerEntities, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema11)));
        schema.register(registerEntities, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema12), Class9451.field40629.in(schema12)));
        schema.register(registerEntities, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema13)));
        return registerEntities;
    }
}
