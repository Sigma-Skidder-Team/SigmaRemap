package remapped;

public enum class_5872 {
   field_29822(0),
   field_29826(-1),
   field_29825(1);

   private final int field_29821;

   private class_5872(int var3) {
      this.field_29821 = var3;
   }

   public int method_26743() {
      return this.field_29821;
   }

   public static class_5872 method_26744(int var0) {
      switch (var0) {
         case -1:
         default:
            return field_29826;
         case 0:
            return field_29822;
         case 1:
            return field_29825;
      }
   }
}
