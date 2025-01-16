// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5194 extends Class5174
{
    public Class5194(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40613, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(Class9451.field40625.in(schema2)), "TileEntities", DSL.list(Class9451.field40621.in(schema2)), "TileTicks", DSL.list(DSL.fields("i", Class9451.field40627.in(schema2))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(Class9451.field40623.in(schema2)))), "Structures", DSL.optionalFields("Starts", DSL.compoundList(Class9451.field40630.in(schema2))))));
        schema.registerType(false, Class9451.field40630, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", Class9451.field40623.in(schema3), "CB", Class9451.field40623.in(schema3), "CC", Class9451.field40623.in(schema3), "CD", Class9451.field40623.in(schema3))), "biome", Class9451.field40634.in(schema3)));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        registerBlockEntities.put("DUMMY", DSL::remainder);
        return registerBlockEntities;
    }
}