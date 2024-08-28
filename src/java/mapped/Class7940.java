package mapped;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class Class7940 {
   public static final Class7435 field34048 = method26742("ambient_entity_effect", false);
   public static final Class7435 field34049 = method26742("angry_villager", false);
   public static final Class7435 field34050 = method26742("barrier", false);
   public static final Class7434<Class7439> field34051 = method26743("block", Class7439.field32010, Class7439::method24025);
   public static final Class7435 field34052 = method26742("bubble", false);
   public static final Class7435 field34053 = method26742("cloud", false);
   public static final Class7435 field34054 = method26742("crit", false);
   public static final Class7435 field34055 = method26742("damage_indicator", true);
   public static final Class7435 field34056 = method26742("dragon_breath", false);
   public static final Class7435 field34057 = method26742("dripping_lava", false);
   public static final Class7435 field34058 = method26742("falling_lava", false);
   public static final Class7435 field34059 = method26742("landing_lava", false);
   public static final Class7435 field34060 = method26742("dripping_water", false);
   public static final Class7435 field34061 = method26742("falling_water", false);
   public static final Class7434<Class7437> field34062 = method26743("dust", Class7437.field32002, var0 -> Class7437.field32001);
   public static final Class7435 field34063 = method26742("effect", false);
   public static final Class7435 field34064 = method26742("elder_guardian", true);
   public static final Class7435 field34065 = method26742("enchanted_hit", false);
   public static final Class7435 field34066 = method26742("enchant", false);
   public static final Class7435 field34067 = method26742("end_rod", false);
   public static final Class7435 field34068 = method26742("entity_effect", false);
   public static final Class7435 field34069 = method26742("explosion_emitter", true);
   public static final Class7435 field34070 = method26742("explosion", true);
   public static final Class7434<Class7439> field34071 = method26743("falling_dust", Class7439.field32010, Class7439::method24025);
   public static final Class7435 field34072 = method26742("firework", false);
   public static final Class7435 field34073 = method26742("fishing", false);
   public static final Class7435 field34074 = method26742("flame", false);
   public static final Class7435 field34075 = method26742("soul_fire_flame", false);
   public static final Class7435 field34076 = method26742("soul", false);
   public static final Class7435 field34077 = method26742("flash", false);
   public static final Class7435 field34078 = method26742("happy_villager", false);
   public static final Class7435 field34079 = method26742("composter", false);
   public static final Class7435 field34080 = method26742("heart", false);
   public static final Class7435 field34081 = method26742("instant_effect", false);
   public static final Class7434<Class7438> field34082 = method26743("item", Class7438.field32007, Class7438::method24021);
   public static final Class7435 field34083 = method26742("item_slime", false);
   public static final Class7435 field34084 = method26742("item_snowball", false);
   public static final Class7435 field34085 = method26742("large_smoke", false);
   public static final Class7435 field34086 = method26742("lava", false);
   public static final Class7435 field34087 = method26742("mycelium", false);
   public static final Class7435 field34088 = method26742("note", false);
   public static final Class7435 field34089 = method26742("poof", true);
   public static final Class7435 field34090 = method26742("portal", false);
   public static final Class7435 field34091 = method26742("rain", false);
   public static final Class7435 field34092 = method26742("smoke", false);
   public static final Class7435 field34093 = method26742("sneeze", false);
   public static final Class7435 field34094 = method26742("spit", true);
   public static final Class7435 field34095 = method26742("squid_ink", true);
   public static final Class7435 field34096 = method26742("sweep_attack", true);
   public static final Class7435 field34097 = method26742("totem_of_undying", false);
   public static final Class7435 field34098 = method26742("underwater", false);
   public static final Class7435 field34099 = method26742("splash", false);
   public static final Class7435 field34100 = method26742("witch", false);
   public static final Class7435 field34101 = method26742("bubble_pop", false);
   public static final Class7435 field34102 = method26742("current_down", false);
   public static final Class7435 field34103 = method26742("bubble_column_up", false);
   public static final Class7435 field34104 = method26742("nautilus", false);
   public static final Class7435 field34105 = method26742("dolphin", false);
   public static final Class7435 field34106 = method26742("campfire_cosy_smoke", true);
   public static final Class7435 field34107 = method26742("campfire_signal_smoke", true);
   public static final Class7435 field34108 = method26742("dripping_honey", false);
   public static final Class7435 field34109 = method26742("falling_honey", false);
   public static final Class7435 field34110 = method26742("landing_honey", false);
   public static final Class7435 field34111 = method26742("falling_nectar", false);
   public static final Class7435 field34112 = method26742("ash", false);
   public static final Class7435 field34113 = method26742("crimson_spore", false);
   public static final Class7435 field34114 = method26742("warped_spore", false);
   public static final Class7435 field34115 = method26742("dripping_obsidian_tear", false);
   public static final Class7435 field34116 = method26742("falling_obsidian_tear", false);
   public static final Class7435 field34117 = method26742("landing_obsidian_tear", false);
   public static final Class7435 field34118 = method26742("reverse_portal", false);
   public static final Class7435 field34119 = method26742("white_ash", false);
   public static final Codec<Class7436> field34120 = Class2348.field16077.dispatch("type", Class7436::method24011, Class7434::method24005);

   private static Class7435 method26742(String var0, boolean var1) {
      return Class2348.<Class7435>method9194(Class2348.field16077, var0, new Class7435(var1));
   }

   private static <T extends Class7436> Class7434<T> method26743(String var0, Class6865<T> var1, Function<Class7434<T>, Codec<T>> var2) {
      return Class2348.<Class7434<T>>method9194(Class2348.field16077, var0, new Class7433(false, var1, var2));
   }
}
