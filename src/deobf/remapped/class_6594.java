package remapped;

import java.text.DateFormat;
import java.util.Date;

public class class_6594 extends class_4785<class_6594> {
   private final class_8960 field_34026;

   public class_6594(class_4908 var1, class_8960 var2) {
      this.field_34027 = var1;
      this.field_34026 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_30365(var1, this.field_34026, var4 - 40, var3, var7, var8);
   }

   private void method_30365(class_7966 var1, class_8960 var2, int var3, int var4, int var5, int var6) {
      int var9 = !var2.method_41113() ? 16777215 : -8388737;
      class_4908.method_22491(this.field_34027)
         .method_45385(var1, "Backup (" + class_9539.method_43981(var2.field_45899) + ")", (float)(var3 + 40), (float)(var4 + 1), var9);
      class_4908.method_22482(this.field_34027).method_45385(var1, this.method_30368(var2.field_45899), (float)(var3 + 40), (float)(var4 + 12), 5000268);
      int var10 = this.field_34027.field_941 - 175;
      byte var11 = -3;
      int var12 = var10 - 10;
      boolean var13 = false;
      if (!class_4908.method_22475(this.field_34027).field_39020) {
         this.method_30367(var1, var10, var4 + -3, var5, var6);
      }

      if (!var2.field_45903.isEmpty()) {
         this.method_30366(var1, var12, var4 + 0, var5, var6);
      }
   }

   private String method_30368(Date var1) {
      return DateFormat.getDateTimeInstance(3, 3).format(var1);
   }

   private void method_30367(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 12 && var5 >= var3 && var5 <= var3 + 14 && var5 < this.field_34027.field_940 - 15 && var5 > 32;
      class_4908.method_22488(this.field_34027).method_8577().method_35674(class_4908.method_22476());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16438();
      class_3542.method_16403(0.5F, 0.5F, 0.5F);
      float var9 = !var8 ? 0.0F : 28.0F;
      class_2089.method_9778(var1, var2 * 2, var3 * 2, 0.0F, var9, 23, 28, 23, 56);
      class_3542.method_16489();
      if (var8) {
         class_4908.method_22471(this.field_34027, class_4908.method_22470());
      }
   }

   private void method_30366(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 8 && var5 >= var3 && var5 <= var3 + 8 && var5 < this.field_34027.field_940 - 15 && var5 > 32;
      class_4908.method_22489(this.field_34027).method_8577().method_35674(class_4908.method_22477());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16438();
      class_3542.method_16403(0.5F, 0.5F, 0.5F);
      float var9 = !var8 ? 0.0F : 15.0F;
      class_2089.method_9778(var1, var2 * 2, var3 * 2, 0.0F, var9, 15, 15, 15, 30);
      class_3542.method_16489();
      if (var8) {
         class_4908.method_22471(this.field_34027, class_4908.method_22484());
      }
   }
}
