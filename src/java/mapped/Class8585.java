package mapped;

import java.util.function.BiFunction;

public class Class8585 {
   public static final BiFunction<ItemStack, Class7812, ItemStack> field38617 = (var0, var1) -> var0;
   public static final Class7128 field38618 = method30684("set_count", new Class4959());
   public static final Class7128 field38619 = method30684("enchant_with_levels", new Class4962());
   public static final Class7128 field38620 = method30684("enchant_randomly", new Class4970());
   public static final Class7128 field38621 = method30684("set_nbt", new Class4958());
   public static final Class7128 field38622 = method30684("furnace_smelt", new Class4967());
   public static final Class7128 field38623 = method30684("looting_enchant", new Class4963());
   public static final Class7128 field38624 = method30684("set_damage", new Class4964());
   public static final Class7128 field38625 = method30684("set_attributes", new Class4955());
   public static final Class7128 field38626 = method30684("set_name", new Class4956());
   public static final Class7128 field38627 = method30684("exploration_map", new Class4965());
   public static final Class7128 field38628 = method30684("set_stew_effect", new Class4971());
   public static final Class7128 field38629 = method30684("copy_name", new Class4954());
   public static final Class7128 field38630 = method30684("set_contents", new Class4973());
   public static final Class7128 field38631 = method30684("limit_count", new Class4968());
   public static final Class7128 field38632 = method30684("apply_bonus", new Class4957());
   public static final Class7128 field38633 = method30684("set_loot_table", new Class4969());
   public static final Class7128 field38634 = method30684("explosion_decay", new Class4960());
   public static final Class7128 field38635 = method30684("set_lore", new Class4972());
   public static final Class7128 field38636 = method30684("fill_player_head", new Class4961());
   public static final Class7128 field38637 = method30684("copy_nbt", new Class4927());
   public static final Class7128 field38638 = method30684("copy_state", new Class4966());

   private static Class7128 method30684(String var0, Class4929<? extends Class127> var1) {
      return Registry.<Class7128, Class7128>method9195(Registry.field16097, new ResourceLocation(var0), new Class7128(var1));
   }

   public static Object method30685() {
      return Class9709.<Class127, Class7128>method38040(Registry.field16097, "function", "function", Class127::method368).method31075();
   }

   public static BiFunction<ItemStack, Class7812, ItemStack> method30686(BiFunction<ItemStack, Class7812, ItemStack>[] var0) {
      switch (var0.length) {
         case 0:
            return field38617;
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
