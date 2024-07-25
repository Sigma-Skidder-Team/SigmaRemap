package remapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class class_4874 implements class_2995 {
   private static String[] field_24261;
   private final MinecraftClient field_24262;

   public class_4874(MinecraftClient var1) {
      this.field_24262 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_174 var11 = this.field_24262.field_9601;
      class_3542.method_16438();
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16354();
      class_1331 var12 = new class_1331(var3, var5, var7);
      LongOpenHashSet var13 = new LongOpenHashSet();

      for (class_1331 var15 : class_1331.method_6076(var12.method_6104(-10, -10, -10), var12.method_6104(10, 10, 10))) {
         int var16 = var11.method_25266(class_2957.field_14437, var15);
         float var17 = (float)(15 - var16) / 15.0F * 0.5F + 0.16F;
         int var18 = class_9299.method_42792(var17, 0.9F, 0.9F);
         long var19 = class_6979.method_31903(var15.method_6077());
         if (var13.add(var19)) {
            class_3372.method_15554(
               var11.method_43363().method_14813().method_21564(class_2957.field_14437, class_6979.method_31920(var19)),
               (double)(class_6979.method_31895(var19) * 16 + 8),
               (double)(class_6979.method_31929(var19) * 16 + 8),
               (double)(class_6979.method_31916(var19) * 16 + 8),
               16711680,
               0.3F
            );
         }

         if (var16 != 15) {
            class_3372.method_15553(
               String.valueOf(var16), (double)var15.method_12173() + 0.5, (double)var15.method_12165() + 0.25, (double)var15.method_12185() + 0.5, var18
            );
         }
      }

      class_3542.method_16432();
      class_3542.method_16489();
   }
}
