package remapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class class_6323 implements class_2995 {
   private final MinecraftClient field_32283;
   private Collection<class_1331> field_32285 = Lists.newArrayList();

   public class_6323(MinecraftClient var1) {
      this.field_32283 = var1;
   }

   public void method_28819(Collection<class_1331> var1) {
      this.field_32285 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_1331 var11 = this.method_28820().method_41630();

      for (class_1331 var13 : this.field_32285) {
         if (var11.method_12171(var13, 160.0)) {
            method_28817(var13);
         }
      }
   }

   private static void method_28817(class_1331 var0) {
      class_3372.method_15561(var0.method_6103(-0.5, -0.5, -0.5), var0.method_6103(1.5, 1.5, 1.5), 1.0F, 0.0F, 0.0F, 0.15F);
      method_28818("Raid center", var0, -65536);
   }

   private static void method_28818(String var0, class_1331 var1, int var2) {
      double var5 = (double)var1.method_12173() + 0.5;
      double var7 = (double)var1.method_12165() + 1.3;
      double var9 = (double)var1.method_12185() + 0.5;
      class_3372.method_15555(var0, var5, var7, var9, var2, 0.04F, true, 0.0F, true);
   }

   private class_9071 method_28820() {
      return this.field_32283.gameRenderer.method_35949();
   }
}
