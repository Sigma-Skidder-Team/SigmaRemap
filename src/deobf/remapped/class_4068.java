package remapped;

public enum class_4068 implements class_3354 {
   field_19816;

   private static final class_5797 field_19815 = class_9665.<class_5797>method_44659(new class_5797(class_5810.field_29333, 5, 8, false), var0 -> {
      for (int var3 = 0; var3 < 8; var3++) {
         for (int var4 = 0; var4 < 5; var4++) {
            if (var4 != 0 && var4 + 1 != 5 && var3 != 0 && var3 + 1 != 8) {
               boolean var6 = false;
            } else {
               boolean var5 = true;
            }

            var0.method_26242(var4, var3, -1);
         }
      }

      var0.method_26245();
   });

   @Override
   public int method_15371() {
      return 5;
   }

   @Override
   public int method_15366() {
      return 8;
   }

   @Override
   public float method_25220() {
      return 6.0F;
   }

   @Override
   public float method_15365() {
      return 1.0F;
   }

   @Override
   public void method_15364(int var1, int var2) {
      field_19815.method_26260(0, var1, var2, false);
   }

   @Override
   public boolean method_15370() {
      return true;
   }
}
