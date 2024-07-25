package remapped;

import java.util.Arrays;
import java.util.List;

public class class_131 extends class_4785<class_131> {
   private static String[] field_327;
   private final class_2926 field_325;
   private final List<class_1543> field_326;

   public class_131(class_4502 var1, class_2926 var2) {
      this.field_324 = var1;
      this.field_325 = var2;
      this.field_326 = Arrays.<class_1543>asList(new class_461(this), new class_3517(this));
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_404(var1, this.field_325, var4, var3, var7, var8);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      class_1543.method_6995(class_4502.method_20917(this.field_324), this, this.field_326, var5, var1, var3);
      return true;
   }

   private void method_404(class_7966 var1, class_2926 var2, int var3, int var4, int var5, int var6) {
      class_4502.method_20920(this.field_324).method_45385(var1, var2.field_14265, (float)(var3 + 38), (float)(var4 + 1), 16777215);
      class_4502.method_20915(this.field_324).method_45385(var1, var2.field_14261, (float)(var3 + 38), (float)(var4 + 12), 7105644);
      class_4502.method_20922(this.field_324).method_45385(var1, class_9539.method_43981(var2.field_14263), (float)(var3 + 38), (float)(var4 + 24), 7105644);
      class_1543.method_6994(var1, this.field_326, class_4502.method_20917(this.field_324), var3, var4, var5, var6);
      class_3570.method_16603(var2.field_14260, () -> {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9780(var1, var3, var4, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
         class_2089.method_9780(var1, var3, var4, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
      });
   }
}
