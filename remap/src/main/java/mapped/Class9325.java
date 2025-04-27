// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;

public class Class9325
{
    private static BiMap<String, String> field40035;
    
    public static void method34544(final Class74 class74) {
        if (class74.method419("id") instanceof Class71) {
            final Class71 class75 = class74.method419("id");
            final String s = Class9325.field40035.get(class75.method406());
            if (s != null) {
                class75.method407(s);
            }
        }
    }
    
    public static void method34545(final Class74 class74) {
        if (class74 != null) {
            if (class74.method418("SpawnData")) {
                final Class74 class75 = class74.method419("SpawnData");
                if (class75 != null) {
                    if (class75.method418("id")) {
                        method34544(class75);
                    }
                }
            }
        }
    }
    
    public static void method34546(final Class7562 class7562) {
        if (method34548(class7562)) {
            method34544(class7562.method23743().method419("EntityTag"));
        }
        if (class7562 != null) {
            if (class7562.method23741() <= 0) {
                class7562.method23745((byte)1);
            }
        }
    }
    
    public static void method34547(final Class7562 class7562) {
        if (method34548(class7562)) {
            final Class74 class7563 = class7562.method23743().method419("EntityTag");
            if (class7563.method419("id") instanceof Class71) {
                final Class71 class7564 = class7563.method419("id");
                final String s = Class9325.field40035.inverse().get(class7564.method406());
                if (s != null) {
                    class7564.method407(s);
                }
            }
        }
    }
    
    private static boolean method34548(final Class7562 class7562) {
        if (class7562 != null) {
            if (class7562.method23740() == 383) {
                final Class74 method23743 = class7562.method23743();
                if (method23743 != null) {
                    if (method23743.method418("EntityTag")) {
                        if (method23743.method419("EntityTag") instanceof Class74) {
                            return ((Class74) method23743.method419("EntityTag")).method419("id") instanceof Class71;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static {
        (Class9325.field40035 = HashBiMap.create()).put((Object)"AreaEffectCloud", (Object)"minecraft:area_effect_cloud");
        Class9325.field40035.put((Object)"ArmorStand", (Object)"minecraft:armor_stand");
        Class9325.field40035.put((Object)"Arrow", (Object)"minecraft:arrow");
        Class9325.field40035.put((Object)"Bat", (Object)"minecraft:bat");
        Class9325.field40035.put((Object)"Blaze", (Object)"minecraft:blaze");
        Class9325.field40035.put((Object)"Boat", (Object)"minecraft:boat");
        Class9325.field40035.put((Object)"CaveSpider", (Object)"minecraft:cave_spider");
        Class9325.field40035.put((Object)"Chicken", (Object)"minecraft:chicken");
        Class9325.field40035.put((Object)"Cow", (Object)"minecraft:cow");
        Class9325.field40035.put((Object)"Creeper", (Object)"minecraft:creeper");
        Class9325.field40035.put((Object)"Donkey", (Object)"minecraft:donkey");
        Class9325.field40035.put((Object)"DragonFireball", (Object)"minecraft:dragon_fireball");
        Class9325.field40035.put((Object)"ElderGuardian", (Object)"minecraft:elder_guardian");
        Class9325.field40035.put((Object)"EnderCrystal", (Object)"minecraft:ender_crystal");
        Class9325.field40035.put((Object)"EnderDragon", (Object)"minecraft:ender_dragon");
        Class9325.field40035.put((Object)"Enderman", (Object)"minecraft:enderman");
        Class9325.field40035.put((Object)"Endermite", (Object)"minecraft:endermite");
        Class9325.field40035.put((Object)"EntityHorse", (Object)"minecraft:horse");
        Class9325.field40035.put((Object)"EyeOfEnderSignal", (Object)"minecraft:eye_of_ender_signal");
        Class9325.field40035.put((Object)"FallingSand", (Object)"minecraft:falling_block");
        Class9325.field40035.put((Object)"Fireball", (Object)"minecraft:fireball");
        Class9325.field40035.put((Object)"FireworksRocketEntity", (Object)"minecraft:fireworks_rocket");
        Class9325.field40035.put((Object)"Ghast", (Object)"minecraft:ghast");
        Class9325.field40035.put((Object)"Giant", (Object)"minecraft:giant");
        Class9325.field40035.put((Object)"Guardian", (Object)"minecraft:guardian");
        Class9325.field40035.put((Object)"Husk", (Object)"minecraft:husk");
        Class9325.field40035.put((Object)"Item", (Object)"minecraft:item");
        Class9325.field40035.put((Object)"ItemFrame", (Object)"minecraft:item_frame");
        Class9325.field40035.put((Object)"LavaSlime", (Object)"minecraft:magma_cube");
        Class9325.field40035.put((Object)"LeashKnot", (Object)"minecraft:leash_knot");
        Class9325.field40035.put((Object)"MinecartChest", (Object)"minecraft:chest_minecart");
        Class9325.field40035.put((Object)"MinecartCommandBlock", (Object)"minecraft:commandblock_minecart");
        Class9325.field40035.put((Object)"MinecartFurnace", (Object)"minecraft:furnace_minecart");
        Class9325.field40035.put((Object)"MinecartHopper", (Object)"minecraft:hopper_minecart");
        Class9325.field40035.put((Object)"MinecartRideable", (Object)"minecraft:minecart");
        Class9325.field40035.put((Object)"MinecartSpawner", (Object)"minecraft:spawner_minecart");
        Class9325.field40035.put((Object)"MinecartTNT", (Object)"minecraft:tnt_minecart");
        Class9325.field40035.put((Object)"Mule", (Object)"minecraft:mule");
        Class9325.field40035.put((Object)"MushroomCow", (Object)"minecraft:mooshroom");
        Class9325.field40035.put((Object)"Ozelot", (Object)"minecraft:ocelot");
        Class9325.field40035.put((Object)"Painting", (Object)"minecraft:painting");
        Class9325.field40035.put((Object)"Pig", (Object)"minecraft:pig");
        Class9325.field40035.put((Object)"PigZombie", (Object)"minecraft:zombie_pigman");
        Class9325.field40035.put((Object)"PolarBear", (Object)"minecraft:polar_bear");
        Class9325.field40035.put((Object)"PrimedTnt", (Object)"minecraft:tnt");
        Class9325.field40035.put((Object)"Rabbit", (Object)"minecraft:rabbit");
        Class9325.field40035.put((Object)"Sheep", (Object)"minecraft:sheep");
        Class9325.field40035.put((Object)"Shulker", (Object)"minecraft:shulker");
        Class9325.field40035.put((Object)"ShulkerBullet", (Object)"minecraft:shulker_bullet");
        Class9325.field40035.put((Object)"Silverfish", (Object)"minecraft:silverfish");
        Class9325.field40035.put((Object)"Skeleton", (Object)"minecraft:skeleton");
        Class9325.field40035.put((Object)"SkeletonHorse", (Object)"minecraft:skeleton_horse");
        Class9325.field40035.put((Object)"Slime", (Object)"minecraft:slime");
        Class9325.field40035.put((Object)"SmallFireball", (Object)"minecraft:small_fireball");
        Class9325.field40035.put((Object)"Snowball", (Object)"minecraft:snowball");
        Class9325.field40035.put((Object)"SnowMan", (Object)"minecraft:snowman");
        Class9325.field40035.put((Object)"SpectralArrow", (Object)"minecraft:spectral_arrow");
        Class9325.field40035.put((Object)"Spider", (Object)"minecraft:spider");
        Class9325.field40035.put((Object)"Squid", (Object)"minecraft:squid");
        Class9325.field40035.put((Object)"Stray", (Object)"minecraft:stray");
        Class9325.field40035.put((Object)"ThrownEgg", (Object)"minecraft:egg");
        Class9325.field40035.put((Object)"ThrownEnderpearl", (Object)"minecraft:ender_pearl");
        Class9325.field40035.put((Object)"ThrownExpBottle", (Object)"minecraft:xp_bottle");
        Class9325.field40035.put((Object)"ThrownPotion", (Object)"minecraft:potion");
        Class9325.field40035.put((Object)"Villager", (Object)"minecraft:villager");
        Class9325.field40035.put((Object)"VillagerGolem", (Object)"minecraft:villager_golem");
        Class9325.field40035.put((Object)"Witch", (Object)"minecraft:witch");
        Class9325.field40035.put((Object)"WitherBoss", (Object)"minecraft:wither");
        Class9325.field40035.put((Object)"WitherSkeleton", (Object)"minecraft:wither_skeleton");
        Class9325.field40035.put((Object)"WitherSkull", (Object)"minecraft:wither_skull");
        Class9325.field40035.put((Object)"Wolf", (Object)"minecraft:wolf");
        Class9325.field40035.put((Object)"XPOrb", (Object)"minecraft:xp_orb");
        Class9325.field40035.put((Object)"Zombie", (Object)"minecraft:zombie");
        Class9325.field40035.put((Object)"ZombieHorse", (Object)"minecraft:zombie_horse");
        Class9325.field40035.put((Object)"ZombieVillager", (Object)"minecraft:zombie_villager");
    }
}
