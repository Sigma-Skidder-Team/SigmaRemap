package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_4061 extends class_2208<class_3973> {
   private static final Identifier field_19781 = new Identifier("textures/gui/container/cartography_table.png");

   public class_4061(class_3973 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_10971 -= 2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      this.method_1183(var1);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_19781);
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      class_2451 var9 = this.field_10956.method_18878(1).method_35898().method_27960();
      boolean var10 = var9 == class_4897.field_25113;
      boolean var11 = var9 == class_4897.field_24622;
      boolean var12 = var9 == class_4897.field_24799;
      class_6098 var13 = this.field_10956.method_18878(0).method_35898();
      boolean var14 = false;
      class_2134 var15;
      if (var13.method_27960() != class_4897.field_25262) {
         var15 = null;
      } else {
         var15 = class_2143.method_10012(var13, this.field_943.field_9601);
         if (var15 != null) {
            if (var15.field_10686) {
               var14 = true;
               if (var11 || var12) {
                  this.method_9781(var1, var7 + 35, var8 + 31, this.field_10981 + 50, 132, 28, 21);
               }
            }

            if (var11 && var15.field_10678 >= 4) {
               var14 = true;
               this.method_9781(var1, var7 + 35, var8 + 31, this.field_10981 + 50, 132, 28, 21);
            }
         }
      }

      this.method_18733(var1, var15, var10, var11, var12, var14);
   }

   private void method_18733(class_7966 var1, class_2134 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var9 = this.field_10984;
      int var10 = this.field_10962;
      if (var4 && !var6) {
         this.method_9781(var1, var9 + 67, var10 + 13, this.field_10981, 66, 66, 66);
         this.method_18732(var2, var9 + 85, var10 + 31, 0.226F);
      } else if (!var3) {
         if (!var5) {
            this.method_9781(var1, var9 + 67, var10 + 13, this.field_10981, 0, 66, 66);
            this.method_18732(var2, var9 + 71, var10 + 17, 0.45F);
         } else {
            this.method_9781(var1, var9 + 67, var10 + 13, this.field_10981, 0, 66, 66);
            this.method_18732(var2, var9 + 71, var10 + 17, 0.45F);
            this.field_943.method_8577().method_35674(field_19781);
            class_3542.method_16438();
            class_3542.method_16413(0.0F, 0.0F, 1.0F);
            this.method_9781(var1, var9 + 66, var10 + 12, 0, this.field_10973, 66, 66);
            class_3542.method_16489();
         }
      } else {
         this.method_9781(var1, var9 + 67 + 16, var10 + 13, this.field_10981, 132, 50, 66);
         this.method_18732(var2, var9 + 86, var10 + 16, 0.34F);
         this.field_943.method_8577().method_35674(field_19781);
         class_3542.method_16438();
         class_3542.method_16413(0.0F, 0.0F, 1.0F);
         this.method_9781(var1, var9 + 67, var10 + 13 + 16, this.field_10981, 132, 50, 66);
         this.method_18732(var2, var9 + 70, var10 + 32, 0.34F);
         class_3542.method_16489();
      }
   }

   private void method_18732(class_2134 var1, int var2, int var3, float var4) {
      if (var1 != null) {
         class_3542.method_16438();
         class_3542.method_16413((float)var2, (float)var3, 1.0F);
         class_3542.method_16403(var4, var4, 1.0F);
         class_3758 var7 = class_2565.method_11648(class_8042.method_36499().method_36501());
         this.field_943.gameRenderer.method_35928().method_38860(new class_7966(), var7, var1, true, 15728880);
         var7.method_17415();
         class_3542.method_16489();
      }
   }
}
