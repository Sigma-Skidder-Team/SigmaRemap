package remapped;

public enum class_6517 {
   field_33180(51, true),
   field_33179(59, true),
   field_33182(10, true),
   field_33185(11, true);

   public int field_33181;
   public boolean field_33183;

   private class_6517(int var3, boolean var4) {
      this.field_33181 = var3;
      this.field_33183 = var4;
   }

   public static boolean method_29694(int var0) {
      for (class_6517 var6 : values()) {
         if (var6.field_33181 == var0) {
            return true;
         }
      }

      return false;
   }
}
