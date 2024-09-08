package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Random;

public class Class5390 implements Class5391 {
   private final Map<Class9564, Item> field24027;
   private final int field24028;
   private final int field24029;
   private final int field24030;

   public Class5390(int var1, int var2, int var3, Map<Class9564, Item> var4) {
      Registry.field16089.method9192().filter(var1x -> !var4.containsKey(var1x)).findAny().ifPresent(var0 -> {
         throw new IllegalStateException("Missing trade for villager type: " + Registry.field16089.getKey(var0));
      });
      this.field24027 = var4;
      this.field24028 = var1;
      this.field24029 = var2;
      this.field24030 = var3;
   }

   @Nullable
   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      if (!(var1 instanceof Class1041)) {
         return null;
      } else {
         ItemStack var5 = new ItemStack(this.field24027.get(((Class1041)var1).method4674().method26570()), this.field24028);
         return new Class9346(var5, new ItemStack(Items.field38049), this.field24029, this.field24030, 0.05F);
      }
   }
}
