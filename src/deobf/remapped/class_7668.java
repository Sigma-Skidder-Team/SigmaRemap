package remapped;

public class class_7668 extends class_2269 {
   private final MinecraftClient field_38987 = MinecraftClient.method_8510();

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var13 = var3 + var6 / 2 - 4;
      this.field_38987
         .field_9668
         .method_45378(
            var1,
            class_4116.method_19123(),
            (float)(this.field_38987.field_9623.field_941 / 2 - this.field_38987.field_9668.method_45379(class_4116.method_19123()) / 2),
            (float)var13,
            16777215
         );
      String var14;
      switch ((int)(class_9665.method_44650() / 300L % 4L)) {
         case 0:
         default:
            var14 = "O o o";
            break;
         case 1:
         case 3:
            var14 = "o O o";
            break;
         case 2:
            var14 = "o o O";
      }

      this.field_38987
         .field_9668
         .method_45385(
            var1, var14, (float)(this.field_38987.field_9623.field_941 / 2 - this.field_38987.field_9668.method_45395(var14) / 2), (float)(var13 + 9), 8421504
         );
   }
}
