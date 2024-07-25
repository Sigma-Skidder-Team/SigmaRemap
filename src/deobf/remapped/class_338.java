package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_338 extends class_4088 {
   private static String[] field_1270;
   private final class_9210 field_1268;
   private final class_9332 field_1264 = class_9332.method_43089();
   private final World field_1273;
   private List<class_5638> field_1269 = Lists.newArrayList();
   private ItemStack field_1265 = ItemStack.EMPTY;
   private long field_1272;
   public final class_7934 field_1266;
   public final class_7934 field_1271;
   private Runnable field_1267 = () -> {
   };
   public final class_6867 field_1263 = new class_979(this, 1);
   private final class_7143 field_1262 = new class_7143();

   public class_338(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_338(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20255, var1);
      this.field_1268 = var3;
      this.field_1273 = var2.field_36409.world;
      this.field_1266 = this.method_18885(new class_7934(this.field_1263, 0, 20, 33));
      this.field_1271 = this.method_18885(new class_8302(this, this.field_1262, 1, 143, 33, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 8 + var8 * 18, 142));
      }

      this.method_18889(this.field_1264);
   }

   public int method_1567() {
      return this.field_1264.method_43085();
   }

   public List<class_5638> method_1568() {
      return this.field_1269;
   }

   public int method_1566() {
      return this.field_1269.size();
   }

   public boolean method_1563() {
      return this.field_1266.method_35884() && !this.field_1269.isEmpty();
   }

   @Override
   public boolean method_18861(PlayerEntity var1) {
      return method_18872(this.field_1268, var1, class_4783.field_23478);
   }

   @Override
   public boolean method_18886(PlayerEntity var1, int var2) {
      if (this.method_1558(var2)) {
         this.field_1264.method_43087(var2);
         this.method_1561();
      }

      return true;
   }

   private boolean method_1558(int var1) {
      return var1 >= 0 && var1 < this.field_1269.size();
   }

   @Override
   public void method_18853(class_6867 var1) {
      ItemStack var4 = this.field_1266.method_35898();
      if (var4.method_27960() != this.field_1265.method_27960()) {
         this.field_1265 = var4.method_27973();
         this.method_1565(var1, var4);
      }
   }

   private void method_1565(class_6867 var1, ItemStack var2) {
      this.field_1269.clear();
      this.field_1264.method_43087(-1);
      this.field_1271.method_35896(ItemStack.EMPTY);
      if (!var2.method_28022()) {
         this.field_1269 = this.field_1273.method_29549().<class_6867, class_5638>method_23143(class_1510.field_8000, var1, this.field_1273);
      }
   }

   private void method_1561() {
      if (!this.field_1269.isEmpty() && this.method_1558(this.field_1264.method_43085())) {
         class_5638 var3 = this.field_1269.get(this.field_1264.method_43085());
         this.field_1262.method_41427(var3);
         this.field_1271.method_35896(var3.method_41042(this.field_1263));
      } else {
         this.field_1271.method_35896(ItemStack.EMPTY);
      }

      this.method_18877();
   }

   @Override
   public class_4165<?> method_18891() {
      return class_4165.field_20255;
   }

   public void method_1570(Runnable var1) {
      this.field_1267 = var1;
   }

   @Override
   public boolean method_18873(ItemStack var1, class_7934 var2) {
      return var2.field_40591 != this.field_1262 && super.method_18873(var1, var2);
   }

   @Override
   public ItemStack method_18874(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         class_2451 var8 = var7.method_27960();
         var5 = var7.method_27973();
         if (var2 != 1) {
            if (var2 != 0) {
               if (!this.field_1273
                  .method_29549()
                  .<class_6867, class_5638>method_23138(class_1510.field_8000, new class_4657(var7), this.field_1273)
                  .isPresent()) {
                  if (var2 >= 2 && var2 < 29) {
                     if (!this.method_18892(var7, 29, 38, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 29 && var2 < 38 && !this.method_18892(var7, 2, 29, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.method_18892(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method_18892(var7, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            var8.method_11236(var7, var1.world, var1);
            if (!this.method_18892(var7, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            var6.method_35888(var7, var5);
         }

         if (var7.method_28022()) {
            var6.method_35896(ItemStack.EMPTY);
         }

         var6.method_35887();
         if (var7.method_27997() == var5.method_27997()) {
            return ItemStack.EMPTY;
         }

         var6.method_35892(var1, var7);
         this.method_18877();
      }

      return var5;
   }

   @Override
   public void method_18876(PlayerEntity var1) {
      super.method_18876(var1);
      this.field_1262.method_31507(1);
      this.field_1268.method_42533((var2, var3) -> this.method_18887(var1, var1.world, this.field_1263));
   }
}
