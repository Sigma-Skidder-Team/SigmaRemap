// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class8276
{
    public static final Class2248<Block> field33979;
    public static final Class2248<Item> field33980;
    public static final Class2248<Item> field33981;
    public static final Class2248<Item> field33982;
    public static final Class2248<Item> field33983;
    public static final Class2248<Item> field33984;
    public static final Class2248<EntityType<?>> field33985;
    public static final Class2248<EntityType<?>> field33986;
    public static final Class2248<ResourceLocation> field33987;
    public static final ResourceLocation field33988;
    public static final ResourceLocation field33989;
    public static final ResourceLocation field33990;
    public static final ResourceLocation field33991;
    public static final ResourceLocation field33992;
    public static final ResourceLocation field33993;
    public static final ResourceLocation field33994;
    public static final ResourceLocation field33995;
    public static final ResourceLocation field33996;
    public static final ResourceLocation field33997;
    public static final ResourceLocation field33998;
    public static final ResourceLocation field33999;
    public static final ResourceLocation field34000;
    public static final ResourceLocation field34001;
    public static final ResourceLocation field34002;
    public static final ResourceLocation field34003;
    public static final ResourceLocation field34004;
    public static final ResourceLocation field34005;
    public static final ResourceLocation field34006;
    public static final ResourceLocation field34007;
    public static final ResourceLocation field34008;
    public static final ResourceLocation field34009;
    public static final ResourceLocation field34010;
    public static final ResourceLocation field34011;
    public static final ResourceLocation field34012;
    public static final ResourceLocation field34013;
    public static final ResourceLocation field34014;
    public static final ResourceLocation field34015;
    public static final ResourceLocation field34016;
    public static final ResourceLocation field34017;
    public static final ResourceLocation field34018;
    public static final ResourceLocation field34019;
    public static final ResourceLocation field34020;
    public static final ResourceLocation field34021;
    public static final ResourceLocation field34022;
    public static final ResourceLocation field34023;
    public static final ResourceLocation field34024;
    public static final ResourceLocation field34025;
    public static final ResourceLocation field34026;
    public static final ResourceLocation field34027;
    public static final ResourceLocation field34028;
    public static final ResourceLocation field34029;
    public static final ResourceLocation field34030;
    public static final ResourceLocation field34031;
    public static final ResourceLocation field34032;
    public static final ResourceLocation field34033;
    public static final ResourceLocation field34034;
    public static final ResourceLocation field34035;
    public static final ResourceLocation field34036;
    public static final ResourceLocation field34037;
    public static final ResourceLocation field34038;
    public static final ResourceLocation field34039;
    public static final ResourceLocation field34040;
    public static final ResourceLocation field34041;
    public static final ResourceLocation field34042;
    public static final ResourceLocation field34043;
    public static final ResourceLocation field34044;
    public static final ResourceLocation field34045;
    public static final ResourceLocation field34046;
    public static final ResourceLocation field34047;
    public static final ResourceLocation field34048;
    public static final ResourceLocation field34049;
    public static final ResourceLocation field34050;
    public static final ResourceLocation field34051;
    public static final ResourceLocation field34052;
    public static final ResourceLocation field34053;
    public static final ResourceLocation field34054;
    public static final ResourceLocation field34055;
    public static final ResourceLocation field34056;
    public static final ResourceLocation field34057;
    public static final ResourceLocation field34058;
    
    private static ResourceLocation method27510(final String s, final Class9109 class9109) {
        final ResourceLocation class9110 = new ResourceLocation(s);
        Registry.method511(Registry.field228, s, class9110);
        Class8276.field33987.method8447(class9110, class9109);
        return class9110;
    }
    
    private static <T> Class2248<T> method27511(final String s, final Registry<T> class90) {
        return Registry.method511(Registry.field238, s, new Class2248<T>(class90));
    }
    
    static {
        field33979 = method27511("mined", Registry.BLOCK);
        field33980 = method27511("crafted", Registry.field211);
        field33981 = method27511("used", Registry.field211);
        field33982 = method27511("broken", Registry.field211);
        field33983 = method27511("picked_up", Registry.field211);
        field33984 = method27511("dropped", Registry.field211);
        field33985 = method27511("killed", Registry.field210);
        field33986 = method27511("killed_by", Registry.field210);
        field33987 = method27511("custom", Registry.field228);
        field33988 = method27510("leave_game", Class9109.field38589);
        field33989 = method27510("play_one_minute", Class9109.field38592);
        field33990 = method27510("time_since_death", Class9109.field38592);
        field33991 = method27510("time_since_rest", Class9109.field38592);
        field33992 = method27510("sneak_time", Class9109.field38592);
        field33993 = method27510("walk_one_cm", Class9109.field38591);
        field33994 = method27510("crouch_one_cm", Class9109.field38591);
        field33995 = method27510("sprint_one_cm", Class9109.field38591);
        field33996 = method27510("walk_on_water_one_cm", Class9109.field38591);
        field33997 = method27510("fall_one_cm", Class9109.field38591);
        field33998 = method27510("climb_one_cm", Class9109.field38591);
        field33999 = method27510("fly_one_cm", Class9109.field38591);
        field34000 = method27510("walk_under_water_one_cm", Class9109.field38591);
        field34001 = method27510("minecart_one_cm", Class9109.field38591);
        field34002 = method27510("boat_one_cm", Class9109.field38591);
        field34003 = method27510("pig_one_cm", Class9109.field38591);
        field34004 = method27510("horse_one_cm", Class9109.field38591);
        field34005 = method27510("aviate_one_cm", Class9109.field38591);
        field34006 = method27510("swim_one_cm", Class9109.field38591);
        field34007 = method27510("jump", Class9109.field38589);
        field34008 = method27510("drop", Class9109.field38589);
        field34009 = method27510("damage_dealt", Class9109.field38590);
        field34010 = method27510("damage_dealt_absorbed", Class9109.field38590);
        field34011 = method27510("damage_dealt_resisted", Class9109.field38590);
        field34012 = method27510("damage_taken", Class9109.field38590);
        field34013 = method27510("damage_blocked_by_shield", Class9109.field38590);
        field34014 = method27510("damage_absorbed", Class9109.field38590);
        field34015 = method27510("damage_resisted", Class9109.field38590);
        field34016 = method27510("deaths", Class9109.field38589);
        field34017 = method27510("mob_kills", Class9109.field38589);
        field34018 = method27510("animals_bred", Class9109.field38589);
        field34019 = method27510("player_kills", Class9109.field38589);
        field34020 = method27510("fish_caught", Class9109.field38589);
        field34021 = method27510("talked_to_villager", Class9109.field38589);
        field34022 = method27510("traded_with_villager", Class9109.field38589);
        field34023 = method27510("eat_cake_slice", Class9109.field38589);
        field34024 = method27510("fill_cauldron", Class9109.field38589);
        field34025 = method27510("use_cauldron", Class9109.field38589);
        field34026 = method27510("clean_armor", Class9109.field38589);
        field34027 = method27510("clean_banner", Class9109.field38589);
        field34028 = method27510("clean_shulker_box", Class9109.field38589);
        field34029 = method27510("interact_with_brewingstand", Class9109.field38589);
        field34030 = method27510("interact_with_beacon", Class9109.field38589);
        field34031 = method27510("inspect_dropper", Class9109.field38589);
        field34032 = method27510("inspect_hopper", Class9109.field38589);
        field34033 = method27510("inspect_dispenser", Class9109.field38589);
        field34034 = method27510("play_noteblock", Class9109.field38589);
        field34035 = method27510("tune_noteblock", Class9109.field38589);
        field34036 = method27510("pot_flower", Class9109.field38589);
        field34037 = method27510("trigger_trapped_chest", Class9109.field38589);
        field34038 = method27510("open_enderchest", Class9109.field38589);
        field34039 = method27510("enchant_item", Class9109.field38589);
        field34040 = method27510("play_record", Class9109.field38589);
        field34041 = method27510("interact_with_furnace", Class9109.field38589);
        field34042 = method27510("interact_with_crafting_table", Class9109.field38589);
        field34043 = method27510("open_chest", Class9109.field38589);
        field34044 = method27510("sleep_in_bed", Class9109.field38589);
        field34045 = method27510("open_shulker_box", Class9109.field38589);
        field34046 = method27510("open_barrel", Class9109.field38589);
        field34047 = method27510("interact_with_blast_furnace", Class9109.field38589);
        field34048 = method27510("interact_with_smoker", Class9109.field38589);
        field34049 = method27510("interact_with_lectern", Class9109.field38589);
        field34050 = method27510("interact_with_campfire", Class9109.field38589);
        field34051 = method27510("interact_with_cartography_table", Class9109.field38589);
        field34052 = method27510("interact_with_loom", Class9109.field38589);
        field34053 = method27510("interact_with_stonecutter", Class9109.field38589);
        field34054 = method27510("bell_ring", Class9109.field38589);
        field34055 = method27510("raid_trigger", Class9109.field38589);
        field34056 = method27510("raid_win", Class9109.field38589);
        field34057 = method27510("interact_with_anvil", Class9109.field38589);
        field34058 = method27510("interact_with_grindstone", Class9109.field38589);
    }
}