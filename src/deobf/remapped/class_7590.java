package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_7590 {
   private static String[] field_38658;
   private class_8932<?> field_38659;
   private final List<class_3482> field_38657 = Lists.newArrayList();
   private float field_38656;

   public void method_34484() {
      this.field_38659 = null;
      this.field_38657.clear();
      this.field_38656 = 0.0F;
   }

   public void method_34491(class_8137 var1, int var2, int var3) {
      this.field_38657.add(new class_3482(this, var1, var2, var3));
   }

   public class_3482 method_34487(int var1) {
      return this.field_38657.get(var1);
   }

   public int method_34492() {
      return this.field_38657.size();
   }

   @Nullable
   public class_8932<?> method_34486() {
      return this.field_38659;
   }

   public void method_34490(class_8932<?> var1) {
      this.field_38659 = var1;
   }

   public void method_34485(class_7966 var1, class_1893 var2, int var3, int var4, boolean var5, float var6) {
      if (!class_266.method_1185()) {
         this.field_38656 += var6;
      }

      for (int var9 = 0; var9 < this.field_38657.size(); var9++) {
         class_3482 var10 = this.field_38657.get(var9);
         int var11 = var10.method_15981() + var3;
         int var12 = var10.method_15979() + var4;
         if (var9 == 0 && var5) {
            class_2089.method_9774(var1, var11 - 4, var12 - 4, var11 + 20, var12 + 20, 822018048);
         } else {
            class_2089.method_9774(var1, var11, var12, var11 + 16, var12 + 16, 822018048);
         }

         class_6098 var13 = var10.method_15980();
         class_8765 var14 = var2.method_8511();
         var14.method_40284(var13, var11, var12);
         class_3542.method_16457(516);
         class_2089.method_9774(var1, var11, var12, var11 + 16, var12 + 16, 822083583);
         class_3542.method_16457(515);
         if (var9 == 0) {
            var14.method_40281(var2.field_9668, var13, var11, var12);
         }
      }
   }
}
