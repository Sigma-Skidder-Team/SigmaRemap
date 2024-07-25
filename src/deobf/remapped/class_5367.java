package remapped;

public class class_5367 implements AutoCloseable {
   private static String[] field_27380;
   public static final int field_27381 = method_24487(0, 10);
   private final class_7884 field_27382 = new class_7884(16, 16, false);

   public class_5367() {
      class_5797 var3 = this.field_27382.method_35651();

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            if (var4 >= 8) {
               int var6 = (int)((1.0F - (float)var5 / 15.0F * 0.75F) * 255.0F);
               var3.method_26242(var5, var4, var6 << 24 | 16777215);
            } else {
               var3.method_26242(var5, var4, -1308622593);
            }
         }
      }

      class_3542.method_16492(33985);
      this.field_27382.method_37048();
      class_3542.method_16463(5890);
      class_3542.method_16476();
      float var7 = 0.06666667F;
      class_3542.method_16403(0.06666667F, 0.06666667F, 0.06666667F);
      class_3542.method_16463(5888);
      this.field_27382.method_37048();
      var3.method_26259(0, 0, 0, 0, 0, var3.method_26228(), var3.method_26253(), false, true, false, false);
      class_3542.method_16492(33984);
   }

   @Override
   public void close() {
      this.field_27382.close();
   }

   public void method_24481() {
      if (!class_6588.method_30191()) {
         class_3542.method_16459(this.field_27382::method_37055, 16);
      }
   }

   public static int method_24485(float var0) {
      return (int)(var0 * 15.0F);
   }

   public static int method_24483(boolean var0) {
      return !var0 ? 10 : 3;
   }

   public static int method_24487(int var0, int var1) {
      return var0 | var1 << 16;
   }

   public static int method_24486(float var0, boolean var1) {
      return method_24487(method_24485(var0), method_24483(var1));
   }

   public void method_24482() {
      if (!class_6588.method_30191()) {
         class_3542.method_16439();
      }
   }
}
