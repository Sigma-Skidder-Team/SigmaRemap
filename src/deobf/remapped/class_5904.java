package remapped;

import java.util.stream.IntStream;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5904 extends class_266 {
   private final class_6679 field_29968 = new class_6679();
   private final class_8398 field_29973;
   private int field_29969;
   private int field_29971;
   private class_6935 field_29970;
   private final String[] field_29972;

   public class_5904(class_8398 var1) {
      super(new TranslationTextComponent("sign.edit"));
      this.field_29972 = IntStream.range(0, 4)
         .<ITextComponent>mapToObj(var1::method_38678)
         .<String>map(ITextComponent::getString)
         .<String>toArray(String[]::new);
      this.field_29973 = var1;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 120, 200, 20, class_1402.field_7625, var1 -> this.method_27012())
      );
      this.field_29973.method_38676(false);
      this.field_29970 = new class_6935(() -> this.field_29972[this.field_29971], var1 -> {
         this.field_29972[this.field_29971] = var1;
         this.field_29973.method_38677(this.field_29971, new StringTextComponent(var1));
      }, class_6935.method_31712(this.field_943), class_6935.method_31713(this.field_943), var1 -> this.field_943.field_9668.method_45395(var1) <= 90);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
      class_1092 var3 = this.field_943.method_8614();
      if (var3 != null) {
         var3.method_4813(new class_1020(this.field_29973.method_17399(), this.field_29972[0], this.field_29972[1], this.field_29972[2], this.field_29972[3]));
      }

      this.field_29973.method_38676(true);
   }

   @Override
   public void method_5312() {
      this.field_29969++;
      if (!this.field_29973.method_17405().method_448(this.field_29973.method_17403().method_8360())) {
         this.method_27012();
      }
   }

   private void method_27012() {
      this.field_29973.method_17407();
      this.field_943.method_8609((class_266)null);
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      this.field_29970.method_31714(var1);
      return true;
   }

   @Override
   public void method_1156() {
      this.method_27012();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 265) {
         if (var1 != 264 && var1 != 257 && var1 != 335) {
            return !this.field_29970.method_31732(var1) ? super.method_26946(var1, var2, var3) : true;
         } else {
            this.field_29971 = this.field_29971 + 1 & 3;
            this.field_29970.method_31721();
            return true;
         }
      } else {
         this.field_29971 = this.field_29971 - 1 & 3;
         this.field_29970.method_31721();
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      class_2083.method_9716();
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 40, 16777215);
      var1.method_36063();
      var1.method_36065((double)(this.field_941 / 2), 0.0, 50.0);
      float var7 = 93.75F;
      var1.method_36062(93.75F, -93.75F, 93.75F);
      var1.method_36065(0.0, -1.3125, 0.0);
      class_2522 var8 = this.field_29973.method_17403();
      boolean var9 = var8.method_8360() instanceof class_8973;
      if (!var9) {
         var1.method_36065(0.0, -0.3125, 0.0);
      }

      boolean var10 = this.field_29969 / 6 % 2 == 0;
      float var11 = 0.6666667F;
      var1.method_36063();
      var1.method_36062(0.6666667F, -0.6666667F, -0.6666667F);
      class_3758 var12 = this.field_943.method_8589().method_13796();
      class_2843 var13 = class_3913.method_18118(var8.method_8360());
      class_7907 var14 = var13.method_12943(var12, this.field_29968::method_45498);
      this.field_29968.field_34525.method_7060(var1, var14, 15728880, class_5367.field_27381);
      if (var9) {
         this.field_29968.field_34523.method_7060(var1, var14, 15728880, class_5367.field_27381);
      }

      var1.method_36064();
      float var15 = 0.010416667F;
      var1.method_36065(0.0, 0.33333334F, 0.046666667F);
      var1.method_36062(0.010416667F, -0.010416667F, 0.010416667F);
      int var16 = this.field_29973.method_38681().method_41791();
      int var17 = this.field_29970.method_31729();
      int var18 = this.field_29970.method_31716();
      int var19 = this.field_29971 * 10 - this.field_29972.length * 5;
      class_8107 var20 = var1.method_36058().method_28620();

      for (int var21 = 0; var21 < this.field_29972.length; var21++) {
         String var22 = this.field_29972[var21];
         if (var22 != null) {
            if (this.field_948.method_45383()) {
               var22 = this.field_948.method_45403(var22);
            }

            float var23 = (float)(-this.field_943.field_9668.method_45395(var22) / 2);
            this.field_943
               .field_9668
               .method_45396(var22, var23, (float)(var21 * 10 - this.field_29972.length * 5), var16, false, var20, var12, false, 0, 15728880, false);
            if (var21 == this.field_29971 && var17 >= 0 && var10) {
               int var24 = this.field_943.field_9668.method_45395(var22.substring(0, Math.max(Math.min(var17, var22.length()), 0)));
               int var25 = var24 - this.field_943.field_9668.method_45395(var22) / 2;
               if (var17 >= var22.length()) {
                  this.field_943.field_9668.method_45396("_", (float)var25, (float)var19, var16, false, var20, var12, false, 0, 15728880, false);
               }
            }
         }
      }

      var12.method_17415();

      for (int var33 = 0; var33 < this.field_29972.length; var33++) {
         String var34 = this.field_29972[var33];
         if (var34 != null && var33 == this.field_29971 && var17 >= 0) {
            int var35 = this.field_943.field_9668.method_45395(var34.substring(0, Math.max(Math.min(var17, var34.length()), 0)));
            int var36 = var35 - this.field_943.field_9668.method_45395(var34) / 2;
            if (var10 && var17 < var34.length()) {
               method_9774(var1, var36, var19 - 1, var36 + 1, var19 + 9, 0xFF000000 | var16);
            }

            if (var18 != var17) {
               int var37 = Math.min(var17, var18);
               int var26 = Math.max(var17, var18);
               int var27 = this.field_943.field_9668.method_45395(var34.substring(0, var37)) - this.field_943.field_9668.method_45395(var34) / 2;
               int var28 = this.field_943.field_9668.method_45395(var34.substring(0, var26)) - this.field_943.field_9668.method_45395(var34) / 2;
               int var29 = Math.min(var27, var28);
               int var30 = Math.max(var27, var28);
               class_8042 var31 = class_8042.method_36499();
               class_9633 var32 = var31.method_36501();
               class_3542.method_16354();
               class_3542.method_16466();
               class_3542.method_16407(class_2603.field_12871);
               var32.method_44471(7, class_7985.field_40903);
               var32.method_35762(var20, (float)var29, (float)(var19 + 9), 0.0F).method_35743(0, 0, 255, 255).method_35735();
               var32.method_35762(var20, (float)var30, (float)(var19 + 9), 0.0F).method_35743(0, 0, 255, 255).method_35735();
               var32.method_35762(var20, (float)var30, (float)var19, 0.0F).method_35743(0, 0, 255, 255).method_35735();
               var32.method_35762(var20, (float)var29, (float)var19, 0.0F).method_35743(0, 0, 255, 255).method_35735();
               var32.method_44487();
               class_138.method_554(var32);
               class_3542.method_16409();
               class_3542.method_16432();
            }
         }
      }

      var1.method_36064();
      class_2083.method_9717();
      super.method_6767(var1, var2, var3, var4);
   }
}
