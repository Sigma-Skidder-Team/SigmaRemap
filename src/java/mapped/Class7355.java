// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.Maps;
import java.util.HashMap;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class7355 extends DataFix
{
    private static final Map<String, String> field28386;
    
    public Class7355(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq(this.convertUnchecked("item stack entity name hook converter", this.getInputSchema().getType(Class9451.field40622), this.getOutputSchema().getType(Class9451.field40622)), this.fixTypeEverywhere("EntityIdFix", (Type)this.getInputSchema().findChoiceType(Class9451.field40626), (Type)this.getOutputSchema().findChoiceType(Class9451.field40626), p0 -> pair -> pair.mapFirst(s -> Class7355.field28386.getOrDefault(s, s))));
    }
    
    static {
        field28386 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("AreaEffectCloud", "minecraft:area_effect_cloud");
            hashMap.put("ArmorStand", "minecraft:armor_stand");
            hashMap.put("Arrow", "minecraft:arrow");
            hashMap.put("Bat", "minecraft:bat");
            hashMap.put("Blaze", "minecraft:blaze");
            hashMap.put("Boat", "minecraft:boat");
            hashMap.put("CaveSpider", "minecraft:cave_spider");
            hashMap.put("Chicken", "minecraft:chicken");
            hashMap.put("Cow", "minecraft:cow");
            hashMap.put("Creeper", "minecraft:creeper");
            hashMap.put("Donkey", "minecraft:donkey");
            hashMap.put("DragonFireball", "minecraft:dragon_fireball");
            hashMap.put("ElderGuardian", "minecraft:elder_guardian");
            hashMap.put("EnderCrystal", "minecraft:ender_crystal");
            hashMap.put("EnderDragon", "minecraft:ender_dragon");
            hashMap.put("Enderman", "minecraft:enderman");
            hashMap.put("Endermite", "minecraft:endermite");
            hashMap.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
            hashMap.put("FallingSand", "minecraft:falling_block");
            hashMap.put("Fireball", "minecraft:fireball");
            hashMap.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
            hashMap.put("Ghast", "minecraft:ghast");
            hashMap.put("Giant", "minecraft:giant");
            hashMap.put("Guardian", "minecraft:guardian");
            hashMap.put("Horse", "minecraft:horse");
            hashMap.put("Husk", "minecraft:husk");
            hashMap.put("Item", "minecraft:item");
            hashMap.put("ItemFrame", "minecraft:item_frame");
            hashMap.put("LavaSlime", "minecraft:magma_cube");
            hashMap.put("LeashKnot", "minecraft:leash_knot");
            hashMap.put("MinecartChest", "minecraft:chest_minecart");
            hashMap.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
            hashMap.put("MinecartFurnace", "minecraft:furnace_minecart");
            hashMap.put("MinecartHopper", "minecraft:hopper_minecart");
            hashMap.put("MinecartRideable", "minecraft:minecart");
            hashMap.put("MinecartSpawner", "minecraft:spawner_minecart");
            hashMap.put("MinecartTNT", "minecraft:tnt_minecart");
            hashMap.put("Mule", "minecraft:mule");
            hashMap.put("MushroomCow", "minecraft:mooshroom");
            hashMap.put("Ozelot", "minecraft:ocelot");
            hashMap.put("Painting", "minecraft:painting");
            hashMap.put("Pig", "minecraft:pig");
            hashMap.put("PigZombie", "minecraft:zombie_pigman");
            hashMap.put("PolarBear", "minecraft:polar_bear");
            hashMap.put("PrimedTnt", "minecraft:tnt");
            hashMap.put("Rabbit", "minecraft:rabbit");
            hashMap.put("Sheep", "minecraft:sheep");
            hashMap.put("Shulker", "minecraft:shulker");
            hashMap.put("ShulkerBullet", "minecraft:shulker_bullet");
            hashMap.put("Silverfish", "minecraft:silverfish");
            hashMap.put("Skeleton", "minecraft:skeleton");
            hashMap.put("SkeletonHorse", "minecraft:skeleton_horse");
            hashMap.put("Slime", "minecraft:slime");
            hashMap.put("SmallFireball", "minecraft:small_fireball");
            hashMap.put("SnowMan", "minecraft:snowman");
            hashMap.put("Snowball", "minecraft:snowball");
            hashMap.put("SpectralArrow", "minecraft:spectral_arrow");
            hashMap.put("Spider", "minecraft:spider");
            hashMap.put("Squid", "minecraft:squid");
            hashMap.put("Stray", "minecraft:stray");
            hashMap.put("ThrownEgg", "minecraft:egg");
            hashMap.put("ThrownEnderpearl", "minecraft:ender_pearl");
            hashMap.put("ThrownExpBottle", "minecraft:xp_bottle");
            hashMap.put("ThrownPotion", "minecraft:potion");
            hashMap.put("Villager", "minecraft:villager");
            hashMap.put("VillagerGolem", "minecraft:villager_golem");
            hashMap.put("Witch", "minecraft:witch");
            hashMap.put("WitherBoss", "minecraft:wither");
            hashMap.put("WitherSkeleton", "minecraft:wither_skeleton");
            hashMap.put("WitherSkull", "minecraft:wither_skull");
            hashMap.put("Wolf", "minecraft:wolf");
            hashMap.put("XPOrb", "minecraft:xp_orb");
            hashMap.put("Zombie", "minecraft:zombie");
            hashMap.put("ZombieHorse", "minecraft:zombie_horse");
            hashMap.put("ZombieVillager", "minecraft:zombie_villager");
        });
    }
}
