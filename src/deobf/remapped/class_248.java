package remapped;

public enum class_248 {
   field_877(0, 0.0, 0.0, 0.0),
   field_873(1, 0.7, 0.7, 0.8),
   field_876(2, 0.4, 0.3, 0.35),
   field_881(3, 0.7, 0.5, 0.2),
   field_875(4, 0.3, 0.3, 0.8),
   field_874(5, 0.1, 0.1, 0.2);

   private final int field_878;
   private final double[] field_879;

   private class_248(int var3, double var4, double var6, double var8) {
      this.field_878 = var3;
      this.field_879 = new double[]{var4, var6, var8};
   }

   public static class_248 method_1084(int var0) {
      for (class_248 var6 : values()) {
         if (var0 == var6.field_878) {
            return var6;
         }
      }

      return field_877;
   }
}
