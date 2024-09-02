package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Class133 extends Class128 {
   private static String[] field452;
   private final Map<Effect, Class6872> field453;

   public Class133(ILootCondition[] var1, Map<Effect, Class6872> var2) {
      super(var1);
      this.field453 = ImmutableMap.copyOf(var2);
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_STEW_EFFECT;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (var1.getItem() == Items.field38149 && !this.field453.isEmpty()) {
         Random var5 = var2.method26088();
         int var6 = var5.nextInt(this.field453.size());
         Entry var7 = (Entry)Iterables.get(this.field453.entrySet(), var6);
         Effect var8 = (Effect)var7.getKey();
         int var9 = ((Class6872)var7.getValue()).method20914(var5);
         if (!var8.method22292()) {
            var9 *= 20;
         }

         Class3284.method11816(var1, var8, var9);
         return var1;
      } else {
         return var1;
      }
   }

   public static Class5883 method389() {
      return new Class5883();
   }

   // $VF: synthetic method
   public static Map<Effect, Class6872> method390(Class133 var0) {
      return var0.field453;
   }
}
