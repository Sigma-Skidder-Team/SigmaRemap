// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.schemas.Schema;

public class Class9478 extends Schema
{
    public Class9478(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static TypeTemplate method35286(final Schema schema) {
        return DSL.optionalFields("ArmorItems", DSL.list(Class9451.field40622.in(schema)), "HandItems", DSL.list(Class9451.field40622.in(schema)));
    }
    
    public static void method35287(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register(map, s, () -> method35286(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        method35287(schema, registerEntities, "ArmorStand");
        method35287(schema, registerEntities, "Creeper");
        method35287(schema, registerEntities, "Skeleton");
        method35287(schema, registerEntities, "Spider");
        method35287(schema, registerEntities, "Giant");
        method35287(schema, registerEntities, "Zombie");
        method35287(schema, registerEntities, "Slime");
        method35287(schema, registerEntities, "Ghast");
        method35287(schema, registerEntities, "PigZombie");
        schema.register(registerEntities, "Enderman", p1 -> DSL.optionalFields("carried", Class9451.field40627.in(schema2), method35286(schema2)));
        method35287(schema, registerEntities, "CaveSpider");
        method35287(schema, registerEntities, "Silverfish");
        method35287(schema, registerEntities, "Blaze");
        method35287(schema, registerEntities, "LavaSlime");
        method35287(schema, registerEntities, "EnderDragon");
        method35287(schema, registerEntities, "WitherBoss");
        method35287(schema, registerEntities, "Bat");
        method35287(schema, registerEntities, "Witch");
        method35287(schema, registerEntities, "Endermite");
        method35287(schema, registerEntities, "Guardian");
        method35287(schema, registerEntities, "Pig");
        method35287(schema, registerEntities, "Sheep");
        method35287(schema, registerEntities, "Cow");
        method35287(schema, registerEntities, "Chicken");
        method35287(schema, registerEntities, "Squid");
        method35287(schema, registerEntities, "Wolf");
        method35287(schema, registerEntities, "MushroomCow");
        method35287(schema, registerEntities, "SnowMan");
        method35287(schema, registerEntities, "Ozelot");
        method35287(schema, registerEntities, "VillagerGolem");
        schema.register(registerEntities, "EntityHorse", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema3)), "ArmorItem", Class9451.field40622.in(schema3), "SaddleItem", Class9451.field40622.in(schema3), method35286(schema3)));
        method35287(schema, registerEntities, "Rabbit");
        schema.register(registerEntities, "Villager", p1 -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema4)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", Class9451.field40622.in(schema4), "buyB", Class9451.field40622.in(schema4), "sell", Class9451.field40622.in(schema4)))), method35286(schema4)));
        method35287(schema, registerEntities, "Shulker");
        schema.registerSimple(registerEntities, "AreaEffectCloud");
        schema.registerSimple(registerEntities, "ShulkerBullet");
        return registerEntities;
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, Class9451.field40616, () -> DSL.optionalFields("entities", DSL.list(DSL.optionalFields("nbt", Class9451.field40625.in(schema2))), "blocks", DSL.list(DSL.optionalFields("nbt", Class9451.field40621.in(schema2))), "palette", DSL.list(Class9451.field40623.in(schema2))));
        schema.registerType(false, Class9451.field40623, (Supplier)DSL::remainder);
    }
}
