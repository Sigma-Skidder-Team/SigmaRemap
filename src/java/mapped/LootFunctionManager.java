package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.function.BiFunction;

public class LootFunctionManager {
   public static final BiFunction<ItemStack, LootContext, ItemStack> IDENTITY = (var0, var1) -> var0;
   public static final LootFunctionType SET_COUNT = func_237451_a_("set_count", new SetCountSerializer());
   public static final LootFunctionType ENCHANT_WITH_LEVELS = func_237451_a_("enchant_with_levels", new EnchantWithLevelsSerializer());
   public static final LootFunctionType ENCHANT_RANDOMLY = func_237451_a_("enchant_randomly", new EnchantRandomlySerializer());
   public static final LootFunctionType SET_NBT = func_237451_a_("set_nbt", new SetNBTSerializer());
   public static final LootFunctionType FURNACE_SMELT = func_237451_a_("furnace_smelt", new SmeltSerializer());
   public static final LootFunctionType LOOTING_ENCHANT = func_237451_a_("looting_enchant", new LootingEnchantSerializer());
   public static final LootFunctionType SET_DAMAGE = func_237451_a_("set_damage", new SetDMGSerializer());
   public static final LootFunctionType SET_ATTRIBUTES = func_237451_a_("set_attributes", new SetAttribSerializer());
   public static final LootFunctionType SET_NAME = func_237451_a_("set_name", new SetNameSerializer());
   public static final LootFunctionType EXPLORATION_MAP = func_237451_a_("exploration_map", new ExplorationMapSerializer());
   public static final LootFunctionType SET_STEW_EFFECT = func_237451_a_("set_stew_effect", new SetStewEffectSerializer());
   public static final LootFunctionType COPY_NAME = func_237451_a_("copy_name", new CopyNameSerializer());
   public static final LootFunctionType SET_CONTENTS = func_237451_a_("set_contents", new SetContentsSerializer());
   public static final LootFunctionType LIMIT_COUNT = func_237451_a_("limit_count", new LimitCountSerializer());
   public static final LootFunctionType APPLY_BONUS = func_237451_a_("apply_bonus", new ApplyBonusSerializer());
   public static final LootFunctionType SET_LOOT_TABLE = func_237451_a_("set_loot_table", new SetLootTableSerializer());
   public static final LootFunctionType EXPLOSION_DECAY = func_237451_a_("explosion_decay", new ExplosionDecaySerializer());
   public static final LootFunctionType SET_LORE = func_237451_a_("set_lore", new SetLoreSerializer());
   public static final LootFunctionType FILL_PLAYER_HEAD = func_237451_a_("fill_player_head", new FillPlayerheadSerializer());
   public static final LootFunctionType COPY_NBT = func_237451_a_("copy_nbt", new CopyNBTSerializer());
   public static final LootFunctionType COPY_STATE = func_237451_a_("copy_state", new CopyStateSerializer());

   private static LootFunctionType func_237451_a_(String var0, ILootSerializer<? extends ILootFunction> var1) {
      return Registry.<LootFunctionType, LootFunctionType>register(Registry.LOOT_FUNCTION_TYPE, new ResourceLocation(var0), new LootFunctionType(var1));
   }

   public static Object func_237450_a_() {
      return LootTypesManager.<ILootFunction, LootFunctionType>getLootTypeRegistryWrapper(Registry.LOOT_FUNCTION_TYPE, "function", "function", ILootFunction::getFunctionType).getSerializer();
   }

   public static BiFunction<ItemStack, LootContext, ItemStack> combine(BiFunction<ItemStack, LootContext, ItemStack>[] var0) {
      switch (var0.length) {
         case 0:
            return IDENTITY;
         case 1:
            return var0[0];
         case 2:
            BiFunction var3 = var0[0];
            BiFunction var4 = var0[1];
            return (var2, var3x) -> (ItemStack)var4.apply(var3.apply(var2, var3x), var3x);
         default:
            return (var1, var2) -> {
               for (BiFunction bifunction2 : var0) {
                  var1 = (ItemStack)bifunction2.apply(var1, var2);
               }

               return var1;
            };
      }
   }
}
