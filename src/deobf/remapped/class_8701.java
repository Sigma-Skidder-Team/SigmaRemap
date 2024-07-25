package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_8701 implements class_2995 {
   private static String[] field_44609;
   private final Set<class_6979> field_44608 = Sets.newHashSet();

   @Override
   public void method_13699() {
      this.field_44608.clear();
   }

   public void method_39940(class_6979 var1) {
      this.field_44608.add(var1);
   }

   public void method_39937(class_6979 var1) {
      this.field_44608.remove(var1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      RenderSystem.method_16438();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16354();
      this.method_39939(var3, var5, var7);
      RenderSystem.method_16432();
      RenderSystem.method_16448();
      RenderSystem.method_16489();
   }

   private void method_39939(double var1, double var3, double var5) {
      class_1331 var9 = new class_1331(var1, var3, var5);
      this.field_44608.forEach(var1x -> {
         if (var9.method_12171(var1x.method_31892(), 60.0)) {
            method_39938(var1x);
         }
      });
   }

   private static void method_39938(class_6979 var0) {
      float var3 = 1.0F;
      class_1331 var4 = var0.method_31892();
      class_1331 var5 = var4.method_6103(-1.0, -1.0, -1.0);
      class_1331 var6 = var4.method_6103(1.0, 1.0, 1.0);
      class_3372.method_15561(var5, var6, 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
