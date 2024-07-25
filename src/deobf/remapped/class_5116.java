package remapped;

import java.util.function.BiFunction;

public class class_5116 {
   public static final BiFunction<ItemStack, class_2792, ItemStack> field_26392 = (var0, var1) -> var0;
   public static final class_1404 field_26380 = method_23455("set_count", new class_9602());
   public static final class_1404 field_26394 = method_23455("enchant_with_levels", new class_8488());
   public static final class_1404 field_26389 = method_23455("enchant_randomly", new class_1914());
   public static final class_1404 field_26385 = method_23455("set_nbt", new class_7898());
   public static final class_1404 field_26391 = method_23455("furnace_smelt", new class_2178());
   public static final class_1404 field_26402 = method_23455("looting_enchant", new class_3392());
   public static final class_1404 field_26382 = method_23455("set_damage", new class_2663());
   public static final class_1404 field_26387 = method_23455("set_attributes", new class_3249());
   public static final class_1404 field_26386 = method_23455("set_name", new class_1349());
   public static final class_1404 field_26398 = method_23455("exploration_map", new class_2857());
   public static final class_1404 field_26381 = method_23455("set_stew_effect", new class_1763());
   public static final class_1404 field_26383 = method_23455("copy_name", new class_1725());
   public static final class_1404 field_26393 = method_23455("set_contents", new class_288());
   public static final class_1404 field_26397 = method_23455("limit_count", new class_3772());
   public static final class_1404 field_26400 = method_23455("apply_bonus", new class_3910());
   public static final class_1404 field_26399 = method_23455("set_loot_table", new class_651());
   public static final class_1404 field_26384 = method_23455("explosion_decay", new class_1051());
   public static final class_1404 field_26390 = method_23455("set_lore", new class_5887());
   public static final class_1404 field_26395 = method_23455("fill_player_head", new class_3344());
   public static final class_1404 field_26388 = method_23455("copy_nbt", new class_251());
   public static final class_1404 field_26401 = method_23455("copy_state", new class_3694());

   private static class_1404 method_23455(String var0, class_6478<? extends class_2913> var1) {
      return class_8669.<class_1404, class_1404>method_39792(class_8669.field_44357, new Identifier(var0), new class_1404(var1));
   }

   public static Object method_23458() {
      return class_9430.<class_2913, class_1404>method_43644(class_8669.field_44357, "function", "function", class_2913::method_13321).method_24455();
   }

   public static BiFunction<ItemStack, class_2792, ItemStack> method_23457(BiFunction<ItemStack, class_2792, ItemStack>[] var0) {
      switch (var0.length) {
         case 0:
            return field_26392;
         case 1:
            return var0[0];
         case 2:
            BiFunction var3 = var0[0];
            BiFunction var4 = var0[1];
            return (var2, var3x) -> (ItemStack)var4.apply(var3.apply(var2, var3x), var3x);
         default:
            return (var1, var2) -> {
               for (BiFunction var8 : var0) {
                  var1 = (ItemStack)var8.apply(var1, var2);
               }

               return var1;
            };
      }
   }
}
