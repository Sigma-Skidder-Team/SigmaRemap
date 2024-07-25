package remapped;

import java.util.Random;

public class class_2576 extends class_8131 {
   private final class_6631 field_12750;
   private final Identifier field_12751;
   private final boolean field_12753;

   public class_2576(class_5799 var1, Identifier var2, class_1331 var3, class_6631 var4, boolean var5) {
      super(class_2746.field_13423, 0);
      this.field_41648 = var3;
      this.field_12750 = var4;
      this.field_12751 = var2;
      this.field_12753 = var5;
      this.method_11701(var1);
   }

   public class_2576(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13423, var2);
      this.field_12751 = new Identifier(var2.method_25965("Template"));
      this.field_12753 = var2.method_25933("isBeached");
      this.field_12750 = class_6631.valueOf(var2.method_25965("Rot"));
      this.method_11701(var1);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_12751.toString());
      var1.method_25934("isBeached", this.field_12753);
      var1.method_25941("Rot", this.field_12750.name());
   }

   private void method_11701(class_5799 var1) {
      class_6561 var4 = var1.method_26279(this.field_12751);
      class_8478 var5 = new class_8478()
         .method_39053(this.field_12750)
         .method_39055(class_9022.field_46145)
         .method_39037(class_5293.method_24141())
         .method_39048(class_2010.field_10193);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
      if (!"map_chest".equals(var1)) {
         if (!"treasure_chest".equals(var1)) {
            if ("supply_chest".equals(var1)) {
               class_2358.method_10817(var3, var4, var2.method_6100(), class_5931.field_30123);
            }
         } else {
            class_2358.method_10817(var3, var4, var2.method_6100(), class_5931.field_30127);
         }
      } else {
         class_2358.method_10817(var3, var4, var2.method_6100(), class_5931.field_30090);
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      int var10 = 256;
      int var11 = 0;
      class_1331 var12 = this.field_41647.method_29975();
      class_3801 var13 = !this.field_12753 ? class_3801.field_18591 : class_3801.field_18598;
      int var14 = var12.method_12173() * var12.method_12185();
      if (var14 != 0) {
         class_1331 var15 = this.field_41648.method_6104(var12.method_12173() - 1, 0, var12.method_12185() - 1);

         for (class_1331 var17 : class_1331.method_6076(this.field_41648, var15)) {
            int var18 = var1.method_22562(var13, var17.method_12173(), var17.method_12185());
            var11 += var18;
            var10 = Math.min(var10, var18);
         }

         var11 /= var14;
      } else {
         var11 = var1.method_22562(var13, this.field_41648.method_12173(), this.field_41648.method_12185());
      }

      int var20 = !this.field_12753 ? var11 : var10 - var12.method_12165() / 2 - var4.nextInt(3);
      this.field_41648 = new class_1331(this.field_41648.method_12173(), var20, this.field_41648.method_12185());
      return super.method_32501(var1, var2, var3, var4, var5, var6, var7);
   }
}
