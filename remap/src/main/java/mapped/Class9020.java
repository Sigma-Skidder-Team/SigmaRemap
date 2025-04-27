// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class9020
{
    private static final Set<ResourceLocation> field38061;
    private static final Set<ResourceLocation> field38062;
    public static final ResourceLocation field38063;
    public static final ResourceLocation field38064;
    public static final ResourceLocation field38065;
    public static final ResourceLocation field38066;
    public static final ResourceLocation field38067;
    public static final ResourceLocation field38068;
    public static final ResourceLocation field38069;
    public static final ResourceLocation field38070;
    public static final ResourceLocation field38071;
    public static final ResourceLocation field38072;
    public static final ResourceLocation field38073;
    public static final ResourceLocation field38074;
    public static final ResourceLocation field38075;
    public static final ResourceLocation field38076;
    public static final ResourceLocation field38077;
    public static final ResourceLocation field38078;
    public static final ResourceLocation field38079;
    public static final ResourceLocation field38080;
    public static final ResourceLocation field38081;
    public static final ResourceLocation field38082;
    public static final ResourceLocation field38083;
    public static final ResourceLocation field38084;
    public static final ResourceLocation field38085;
    public static final ResourceLocation field38086;
    public static final ResourceLocation field38087;
    public static final ResourceLocation field38088;
    public static final ResourceLocation field38089;
    public static final ResourceLocation field38090;
    public static final ResourceLocation field38091;
    public static final ResourceLocation field38092;
    public static final ResourceLocation field38093;
    public static final ResourceLocation field38094;
    public static final ResourceLocation field38095;
    public static final ResourceLocation field38096;
    public static final ResourceLocation field38097;
    public static final ResourceLocation field38098;
    public static final ResourceLocation field38099;
    public static final ResourceLocation field38100;
    public static final ResourceLocation field38101;
    public static final ResourceLocation field38102;
    public static final ResourceLocation field38103;
    public static final ResourceLocation field38104;
    public static final ResourceLocation field38105;
    public static final ResourceLocation field38106;
    public static final ResourceLocation field38107;
    public static final ResourceLocation field38108;
    public static final ResourceLocation field38109;
    public static final ResourceLocation field38110;
    public static final ResourceLocation field38111;
    public static final ResourceLocation field38112;
    public static final ResourceLocation field38113;
    public static final ResourceLocation field38114;
    public static final ResourceLocation field38115;
    public static final ResourceLocation field38116;
    public static final ResourceLocation field38117;
    public static final ResourceLocation field38118;
    public static final ResourceLocation field38119;
    public static final ResourceLocation field38120;
    public static final ResourceLocation field38121;
    public static final ResourceLocation field38122;
    public static final ResourceLocation field38123;
    public static final ResourceLocation field38124;
    public static final ResourceLocation field38125;
    public static final ResourceLocation field38126;
    public static final ResourceLocation field38127;
    public static final ResourceLocation field38128;
    public static final ResourceLocation field38129;
    public static final ResourceLocation field38130;
    public static final ResourceLocation field38131;
    public static final ResourceLocation field38132;
    public static final ResourceLocation field38133;
    
    private static ResourceLocation method32315(final String s) {
        return method32316(new ResourceLocation(s));
    }
    
    private static ResourceLocation method32316(final ResourceLocation obj) {
        if (!Class9020.field38061.add(obj)) {
            throw new IllegalArgumentException(obj + " is already a registered built-in loot table");
        }
        return obj;
    }
    
    public static Set<ResourceLocation> method32317() {
        return Class9020.field38062;
    }
    
    static {
        field38061 = Sets.newHashSet();
        field38062 = Collections.unmodifiableSet(Class9020.field38061);
        field38063 = new ResourceLocation("empty");
        field38064 = method32315("chests/spawn_bonus_chest");
        field38065 = method32315("chests/end_city_treasure");
        field38066 = method32315("chests/simple_dungeon");
        field38067 = method32315("chests/village/village_weaponsmith");
        field38068 = method32315("chests/village/village_toolsmith");
        field38069 = method32315("chests/village/village_armorer");
        field38070 = method32315("chests/village/village_cartographer");
        field38071 = method32315("chests/village/village_mason");
        field38072 = method32315("chests/village/village_shepherd");
        field38073 = method32315("chests/village/village_butcher");
        field38074 = method32315("chests/village/village_fletcher");
        field38075 = method32315("chests/village/village_fisher");
        field38076 = method32315("chests/village/village_tannery");
        field38077 = method32315("chests/village/village_temple");
        field38078 = method32315("chests/village/village_desert_house");
        field38079 = method32315("chests/village/village_plains_house");
        field38080 = method32315("chests/village/village_taiga_house");
        field38081 = method32315("chests/village/village_snowy_house");
        field38082 = method32315("chests/village/village_savanna_house");
        field38083 = method32315("chests/abandoned_mineshaft");
        field38084 = method32315("chests/nether_bridge");
        field38085 = method32315("chests/stronghold_library");
        field38086 = method32315("chests/stronghold_crossing");
        field38087 = method32315("chests/stronghold_corridor");
        field38088 = method32315("chests/desert_pyramid");
        field38089 = method32315("chests/jungle_temple");
        field38090 = method32315("chests/jungle_temple_dispenser");
        field38091 = method32315("chests/igloo_chest");
        field38092 = method32315("chests/woodland_mansion");
        field38093 = method32315("chests/underwater_ruin_small");
        field38094 = method32315("chests/underwater_ruin_big");
        field38095 = method32315("chests/buried_treasure");
        field38096 = method32315("chests/shipwreck_map");
        field38097 = method32315("chests/shipwreck_supply");
        field38098 = method32315("chests/shipwreck_treasure");
        field38099 = method32315("chests/pillager_outpost");
        field38100 = method32315("entities/sheep/white");
        field38101 = method32315("entities/sheep/orange");
        field38102 = method32315("entities/sheep/magenta");
        field38103 = method32315("entities/sheep/light_blue");
        field38104 = method32315("entities/sheep/yellow");
        field38105 = method32315("entities/sheep/lime");
        field38106 = method32315("entities/sheep/pink");
        field38107 = method32315("entities/sheep/gray");
        field38108 = method32315("entities/sheep/light_gray");
        field38109 = method32315("entities/sheep/cyan");
        field38110 = method32315("entities/sheep/purple");
        field38111 = method32315("entities/sheep/blue");
        field38112 = method32315("entities/sheep/brown");
        field38113 = method32315("entities/sheep/green");
        field38114 = method32315("entities/sheep/red");
        field38115 = method32315("entities/sheep/black");
        field38116 = method32315("gameplay/fishing");
        field38117 = method32315("gameplay/fishing/junk");
        field38118 = method32315("gameplay/fishing/treasure");
        field38119 = method32315("gameplay/fishing/fish");
        field38120 = method32315("gameplay/cat_morning_gift");
        field38121 = method32315("gameplay/hero_of_the_village/armorer_gift");
        field38122 = method32315("gameplay/hero_of_the_village/butcher_gift");
        field38123 = method32315("gameplay/hero_of_the_village/cartographer_gift");
        field38124 = method32315("gameplay/hero_of_the_village/cleric_gift");
        field38125 = method32315("gameplay/hero_of_the_village/farmer_gift");
        field38126 = method32315("gameplay/hero_of_the_village/fisherman_gift");
        field38127 = method32315("gameplay/hero_of_the_village/fletcher_gift");
        field38128 = method32315("gameplay/hero_of_the_village/leatherworker_gift");
        field38129 = method32315("gameplay/hero_of_the_village/librarian_gift");
        field38130 = method32315("gameplay/hero_of_the_village/mason_gift");
        field38131 = method32315("gameplay/hero_of_the_village/shepherd_gift");
        field38132 = method32315("gameplay/hero_of_the_village/toolsmith_gift");
        field38133 = method32315("gameplay/hero_of_the_village/weaponsmith_gift");
    }
}
