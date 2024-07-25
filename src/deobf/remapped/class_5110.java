package remapped;

import java.util.function.Predicate;

public class class_5110 {
   public static final class_2190 field_26353 = method_23431("inverted", new class_2863());
   public static final class_2190 field_26356 = method_23431("alternative", new class_7578());
   public static final class_2190 field_26358 = method_23431("random_chance", new class_1444());
   public static final class_2190 field_26350 = method_23431("random_chance_with_looting", new class_9667());
   public static final class_2190 field_26359 = method_23431("entity_properties", new class_316());
   public static final class_2190 field_26357 = method_23431("killed_by_player", new class_5648());
   public static final class_2190 field_26349 = method_23431("entity_scores", new class_5866());
   public static final class_2190 field_26346 = method_23431("block_state_property", new class_4253());
   public static final class_2190 field_26362 = method_23431("match_tool", new class_9705());
   public static final class_2190 field_26351 = method_23431("table_bonus", new class_3968());
   public static final class_2190 field_26361 = method_23431("survives_explosion", new class_1186());
   public static final class_2190 field_26352 = method_23431("damage_source_properties", new class_3430());
   public static final class_2190 field_26354 = method_23431("location_check", new class_9308());
   public static final class_2190 field_26360 = method_23431("weather_check", new class_9282());
   public static final class_2190 field_26355 = method_23431("reference", new class_2012());
   public static final class_2190 field_26348 = method_23431("time_check", new class_8654());

   private static class_2190 method_23431(String var0, class_6478<? extends class_7279> var1) {
      return class_8669.<class_2190, class_2190>method_39792(class_8669.field_44384, new class_4639(var0), new class_2190(var1));
   }

   public static Object method_23433() {
      return class_9430.<class_7279, class_2190>method_43644(class_8669.field_44384, "condition", "condition", class_7279::method_33269).method_24455();
   }

   public static <T> Predicate<T> method_23432(Predicate<T>[] var0) {
      switch (var0.length) {
         case 0:
            return var0x -> true;
         case 1:
            return var0[0];
         case 2:
            return var0[0].and(var0[1]);
         default:
            return var1 -> {
               for (Predicate var7 : var0) {
                  if (!var7.test(var1)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   public static <T> Predicate<T> method_23435(Predicate<T>[] var0) {
      switch (var0.length) {
         case 0:
            return var0x -> false;
         case 1:
            return var0[0];
         case 2:
            return var0[0].or(var0[1]);
         default:
            return var1 -> {
               for (Predicate var7 : var0) {
                  if (var7.test(var1)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }
}
