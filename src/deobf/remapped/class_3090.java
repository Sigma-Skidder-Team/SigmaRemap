package remapped;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public class class_3090 {
   public static final class_2427 field_15364 = method_14171("ambient_entity_effect", false);
   public static final class_2427 field_15352 = method_14171("angry_villager", false);
   public static final class_2427 field_15327 = method_14171("barrier", false);
   public static final class_8583<class_7110> field_15325 = method_14170("block", class_7110.field_36663, class_7110::method_32669);
   public static final class_2427 field_15340 = method_14171("bubble", false);
   public static final class_2427 field_15385 = method_14171("cloud", false);
   public static final class_2427 field_15322 = method_14171("crit", false);
   public static final class_2427 field_15323 = method_14171("damage_indicator", true);
   public static final class_2427 field_15315 = method_14171("dragon_breath", false);
   public static final class_2427 field_15336 = method_14171("dripping_lava", false);
   public static final class_2427 field_15359 = method_14171("falling_lava", false);
   public static final class_2427 field_15331 = method_14171("landing_lava", false);
   public static final class_2427 field_15358 = method_14171("dripping_water", false);
   public static final class_2427 field_15329 = method_14171("falling_water", false);
   public static final class_8583<class_5727> field_15317 = method_14170("dust", class_5727.field_28939, var0 -> class_5727.field_28940);
   public static final class_2427 field_15338 = method_14171("effect", false);
   public static final class_2427 field_15335 = method_14171("elder_guardian", true);
   public static final class_2427 field_15360 = method_14171("enchanted_hit", false);
   public static final class_2427 field_15354 = method_14171("enchant", false);
   public static final class_2427 field_15332 = method_14171("end_rod", false);
   public static final class_2427 field_15353 = method_14171("entity_effect", false);
   public static final class_2427 field_15377 = method_14171("explosion_emitter", true);
   public static final class_2427 field_15339 = method_14171("explosion", true);
   public static final class_8583<class_7110> field_15371 = method_14170("falling_dust", class_7110.field_36663, class_7110::method_32669);
   public static final class_2427 field_15366 = method_14171("firework", false);
   public static final class_2427 field_15341 = method_14171("fishing", false);
   public static final class_2427 field_15321 = method_14171("flame", false);
   public static final class_2427 field_15365 = method_14171("soul_fire_flame", false);
   public static final class_2427 field_15380 = method_14171("soul", false);
   public static final class_2427 field_15345 = method_14171("flash", false);
   public static final class_2427 field_15361 = method_14171("happy_villager", false);
   public static final class_2427 field_15384 = method_14171("composter", false);
   public static final class_2427 field_15348 = method_14171("heart", false);
   public static final class_2427 field_15324 = method_14171("instant_effect", false);
   public static final class_8583<class_8661> field_15351 = method_14170("item", class_8661.field_44336, class_8661::method_39707);
   public static final class_2427 field_15313 = method_14171("item_slime", false);
   public static final class_2427 field_15370 = method_14171("item_snowball", false);
   public static final class_2427 field_15319 = method_14171("large_smoke", false);
   public static final class_2427 field_15372 = method_14171("lava", false);
   public static final class_2427 field_15328 = method_14171("mycelium", false);
   public static final class_2427 field_15374 = method_14171("note", false);
   public static final class_2427 field_15343 = method_14171("poof", true);
   public static final class_2427 field_15356 = method_14171("portal", false);
   public static final class_2427 field_15386 = method_14171("rain", false);
   public static final class_2427 field_15376 = method_14171("smoke", false);
   public static final class_2427 field_15326 = method_14171("sneeze", false);
   public static final class_2427 field_15383 = method_14171("spit", true);
   public static final class_2427 field_15368 = method_14171("squid_ink", true);
   public static final class_2427 field_15362 = method_14171("sweep_attack", true);
   public static final class_2427 field_15334 = method_14171("totem_of_undying", false);
   public static final class_2427 field_15350 = method_14171("underwater", false);
   public static final class_2427 field_15346 = method_14171("splash", false);
   public static final class_2427 field_15342 = method_14171("witch", false);
   public static final class_2427 field_15347 = method_14171("bubble_pop", false);
   public static final class_2427 field_15363 = method_14171("current_down", false);
   public static final class_2427 field_15382 = method_14171("bubble_column_up", false);
   public static final class_2427 field_15357 = method_14171("nautilus", false);
   public static final class_2427 field_15378 = method_14171("dolphin", false);
   public static final class_2427 field_15333 = method_14171("campfire_cosy_smoke", true);
   public static final class_2427 field_15320 = method_14171("campfire_signal_smoke", true);
   public static final class_2427 field_15316 = method_14171("dripping_honey", false);
   public static final class_2427 field_15337 = method_14171("falling_honey", false);
   public static final class_2427 field_15349 = method_14171("landing_honey", false);
   public static final class_2427 field_15344 = method_14171("falling_nectar", false);
   public static final class_2427 field_15375 = method_14171("ash", false);
   public static final class_2427 field_15367 = method_14171("crimson_spore", false);
   public static final class_2427 field_15379 = method_14171("warped_spore", false);
   public static final class_2427 field_15369 = method_14171("dripping_obsidian_tear", false);
   public static final class_2427 field_15330 = method_14171("falling_obsidian_tear", false);
   public static final class_2427 field_15314 = method_14171("landing_obsidian_tear", false);
   public static final class_2427 field_15381 = method_14171("reverse_portal", false);
   public static final class_2427 field_15373 = method_14171("white_ash", false);
   public static final Codec<class_5079> field_15355 = class_8669.field_44387.dispatch("type", class_5079::method_23357, class_8583::method_39481);

   private static class_2427 method_14171(String var0, boolean var1) {
      return class_8669.<class_2427>method_39791(class_8669.field_44387, var0, new class_2427(var1));
   }

   private static <T extends class_5079> class_8583<T> method_14170(String var0, class_7981<T> var1, Function<class_8583<T>, Codec<T>> var2) {
      return class_8669.<class_8583<T>>method_39791(class_8669.field_44387, var0, new class_1952(false, var1, var2));
   }
}
