package remapped;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class_1039 extends class_4088 {
   private final class_6867 field_5737 = new class_7143();
   private final class_6867 field_5734 = new class_8240(this, 2);
   private final class_9210 field_5736;

   public class_1039(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_1039(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20241, var1);
      this.field_5736 = var3;
      this.method_18885(new class_343(this, this.field_5734, 0, 49, 19));
      this.method_18885(new class_6227(this, this.field_5734, 1, 49, 40));
      this.method_18885(new class_8267(this, this.field_5737, 2, 129, 34, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public void method_18853(class_6867 var1) {
      super.method_18853(var1);
      if (var1 == this.field_5734) {
         this.method_4597();
      }
   }

   private void method_4597() {
      ItemStack var3 = this.field_5734.method_31498(0);
      ItemStack var4 = this.field_5734.method_31498(1);
      boolean var5 = !var3.method_28022() || !var4.method_28022();
      boolean var6 = !var3.method_28022() && !var4.method_28022();
      if (!var5) {
         this.field_5737.method_31503(0, ItemStack.EMPTY);
      } else {
         boolean var7 = !var3.method_28022() && var3.method_27960() != class_4897.field_24879 && !var3.method_28020()
            || !var4.method_28022() && var4.method_27960() != class_4897.field_24879 && !var4.method_28020();
         if (var3.method_27997() > 1 || var4.method_27997() > 1 || !var6 && var7) {
            this.field_5737.method_31503(0, ItemStack.EMPTY);
            this.method_18877();
            return;
         }

         byte var8 = 1;
         int var13;
         ItemStack var14;
         if (!var6) {
            boolean var9 = !var3.method_28022();
            var13 = !var9 ? var4.method_28026() : var3.method_28026();
            var14 = !var9 ? var4 : var3;
         } else {
            if (var3.method_27960() != var4.method_27960()) {
               this.field_5737.method_31503(0, ItemStack.EMPTY);
               this.method_18877();
               return;
            }

            class_2451 var15 = var3.method_27960();
            int var10 = var15.method_11234() - var3.method_28026();
            int var11 = var15.method_11234() - var4.method_28026();
            int var12 = var10 + var11 + var15.method_11234() * 5 / 100;
            var13 = Math.max(var15.method_11234() - var12, 0);
            var14 = this.method_4600(var3, var4);
            if (!var14.method_27959()) {
               if (!ItemStack.method_27982(var3, var4)) {
                  this.field_5737.method_31503(0, ItemStack.EMPTY);
                  this.method_18877();
                  return;
               }

               var8 = 2;
            }
         }

         this.field_5737.method_31503(0, this.method_4599(var14, var13, var8));
      }

      this.method_18877();
   }

   private ItemStack method_4600(ItemStack var1, ItemStack var2) {
      ItemStack var5 = var1.method_27973();
      Map var6 = class_2931.method_13402(var2);

      for (Entry var8 : var6.entrySet()) {
         class_4382 var9 = (class_4382)var8.getKey();
         if (!var9.method_20435() || class_2931.method_13423(var9, var5) == 0) {
            var5.method_28031(var9, (Integer)var8.getValue());
         }
      }

      return var5;
   }

   private ItemStack method_4599(ItemStack var1, int var2, int var3) {
      ItemStack var6 = var1.method_27973();
      var6.method_27976("Enchantments");
      var6.method_27976("StoredEnchantments");
      if (var2 <= 0) {
         var6.method_27976("Damage");
      } else {
         var6.method_27999(var2);
      }

      var6.method_28017(var3);
      Map var7 = class_2931.method_13402(var1)
         .entrySet()
         .stream()
         .filter(var0 -> var0.getKey().method_20435())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      class_2931.method_13398(var7, var6);
      var6.method_27986(0);
      if (var6.method_27960() == class_4897.field_24879 && var7.size() == 0) {
         var6 = new ItemStack(class_4897.field_24551);
         if (var1.method_28018()) {
            var6.method_28032(var1.method_28008());
         }
      }

      for (int var8 = 0; var8 < var7.size(); var8++) {
         var6.method_27986(class_6600.method_30383(var6.method_27969()));
      }

      return var6;
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_5736.method_42533((var2, var3) -> this.method_18887(var1, var2, this.field_5734));
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return method_18872(this.field_5736, var1, class_4783.field_23461);
   }

   @Override
   public ItemStack method_18874(class_704 var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         ItemStack var8 = this.field_5734.method_31498(0);
         ItemStack var9 = this.field_5734.method_31498(1);
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (!var8.method_28022() && !var9.method_28022()) {
                  if (var2 >= 3 && var2 < 30) {
                     if (!this.method_18892(var7, 30, 39, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 30 && var2 < 39 && !this.method_18892(var7, 3, 30, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.method_18892(var7, 0, 2, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method_18892(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method_18892(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.method_35888(var7, var5);
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(ItemStack.EMPTY);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return ItemStack.EMPTY;
         }

         var6.method_35892(var1, var7);
      }

      return var5;
   }
}
