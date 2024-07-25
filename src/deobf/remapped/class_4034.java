package remapped;

import javax.annotation.Nullable;

public class class_4034 extends class_4088 {
   private static String[] field_19589;
   private final class_6867 field_19588 = new class_1555(this, 1);
   private final class_2684 field_19587;
   private final class_9210 field_19591;
   private final class_6844 field_19590;

   public class_4034(int var1, class_6867 var2) {
      this(var1, var2, new class_4799(3), class_9210.field_47106);
   }

   public class_4034(int var1, class_6867 var2, class_6844 var3, class_9210 var4) {
      super(class_4165.field_20247, var1);
      method_18867(var3, 3);
      this.field_19590 = var3;
      this.field_19591 = var4;
      this.field_19587 = new class_2684(this, this.field_19588, 0, 136, 110);
      this.method_18885(this.field_19587);
      this.method_18859(var3);
      byte var7 = 36;
      short var8 = 137;

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method_18885(new class_7934(var2, var10 + var9 * 9 + 9, 36 + var10 * 18, 137 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.method_18885(new class_7934(var2, var11, 36 + var11 * 18, 195));
      }
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      if (!var1.field_41768.field_33055) {
         ItemStack var4 = this.field_19587.method_35899(this.field_19587.method_35897());
         if (!var4.method_28022()) {
            var1.method_3153(var4, false);
         }
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return method_18872(this.field_19591, var1, class_4783.field_23862);
   }

   @Override
   public void method_18869(int var1, int var2) {
      super.method_18869(var1, var2);
      this.method_18877();
   }

   @Override
   public ItemStack method_18874(class_704 var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 0) {
            if (!this.field_19587.method_35884() && this.field_19587.method_35889(var7) && var7.method_27997() == 1) {
               if (!this.method_18892(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 1 && var2 < 28) {
               if (!this.method_18892(var7, 28, 37, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 28 && var2 < 37) {
               if (!this.method_18892(var7, 1, 28, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method_18892(var7, 1, 37, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method_18892(var7, 1, 37, true)) {
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

   public int method_18563() {
      return this.field_19590.method_31408(0);
   }

   @Nullable
   public class_1425 method_18567() {
      return class_1425.method_6538(this.field_19590.method_31408(1));
   }

   @Nullable
   public class_1425 method_18565() {
      return class_1425.method_6538(this.field_19590.method_31408(2));
   }

   public void method_18566(int var1, int var2) {
      if (this.field_19587.method_35884()) {
         this.field_19590.method_31409(1, var1);
         this.field_19590.method_31409(2, var2);
         this.field_19587.method_35899(1);
      }
   }

   public boolean method_18564() {
      return !this.field_19588.method_31498(0).method_28022();
   }
}
