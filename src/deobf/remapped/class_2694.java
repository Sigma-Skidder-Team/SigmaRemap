package remapped;

public enum class_2694 implements class_413 {
   field_13182;

   @Override
   public int method_2060(class_2431 var1, int var2, int var3) {
      class_5652 var6 = var1.method_11083();
      double var7 = var6.method_25572((double)var2 / 8.0, (double)var3 / 8.0, 0.0, 0.0, 0.0);
      if (!(var7 > 0.4)) {
         if (!(var7 > 0.2)) {
            if (!(var7 < -0.4)) {
               return !(var7 < -0.2) ? 0 : 46;
            } else {
               return 10;
            }
         } else {
            return 45;
         }
      } else {
         return 44;
      }
   }
}
