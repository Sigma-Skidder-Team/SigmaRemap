package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.function.Predicate;

public class Class8582 {
   public static final Class7130 field38595 = method30663("inverted", new Class4953());
   public static final Class7130 field38596 = method30663("alternative", new Class4945());
   public static final Class7130 field38597 = method30663("random_chance", new Class4952());
   public static final Class7130 field38598 = method30663("random_chance_with_looting", new Class4943());
   public static final Class7130 field38599 = method30663("entity_properties", new Class4933());
   public static final Class7130 field38600 = method30663("killed_by_player", new Class4947());
   public static final Class7130 field38601 = method30663("entity_scores", new Class4944());
   public static final Class7130 field38602 = method30663("block_state_property", new Class4948());
   public static final Class7130 field38603 = method30663("match_tool", new Class4951());
   public static final Class7130 field38604 = method30663("table_bonus", new Class4949());
   public static final Class7130 field38605 = method30663("survives_explosion", new Class4930());
   public static final Class7130 field38606 = method30663("damage_source_properties", new Class4946());
   public static final Class7130 field38607 = method30663("location_check", new Class4950());
   public static final Class7130 field38608 = method30663("weather_check", new Class4942());
   public static final Class7130 field38609 = method30663("reference", new Class4931());
   public static final Class7130 field38610 = method30663("time_check", new Class4932());

   private static Class7130 method30663(String var0, ILootSerializer<? extends ILootCondition> var1) {
      return Registry.<Class7130, Class7130>register(Registry.field16098, new ResourceLocation(var0), new Class7130(var1));
   }

   public static Object method30664() {
      return LootTypesManager.<ILootCondition, Class7130>getLootTypeRegistryWrapper(Registry.field16098, "condition", "condition", ILootCondition::method354).getSerializer();
   }

   public static <T> Predicate<T> method30665(Predicate<T>[] var0) {
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

   public static <T> Predicate<T> method30666(Predicate<T>[] var0) {
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
