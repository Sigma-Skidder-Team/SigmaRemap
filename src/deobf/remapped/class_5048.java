package remapped;

public enum class_5048 {
   public class_5048(String var3) {
   }

   @Override
   public float method_297(BlockPos var1, float var2) {
      double var5 = class_6325.method_28867().method_31321((double)var1.getX() * 0.05, (double)var1.getZ() * 0.05, false) * 7.0;
      double var7 = class_6325.field_32304.method_31321((double)var1.getX() * 0.2, (double)var1.getZ() * 0.2, false);
      double var9 = var5 + var7;
      if (var9 < 0.3) {
         double var11 = class_6325.field_32304.method_31321((double)var1.getX() * 0.09, (double)var1.getZ() * 0.09, false);
         if (var11 < 0.8) {
            return 0.2F;
         }
      }

      return var2;
   }
}
