package remapped;

public enum class_6871 {
   field_35386(-1, "invalid"),
   field_35394(0, "No channel"),
   field_35389(1, "Mono"),
   field_35385(2, "Stereo"),
   field_35392(3, "Stereo+Center"),
   field_35388(4, "Stereo+Center+Rear"),
   field_35383(5, "Five channels"),
   field_35384(6, "Five channels+LF"),
   field_35391(8, "Seven channels+LF");

   private final int field_35390;
   private final String field_35393;

   public static class_6871 method_31523(int var0) {
      class_6871 var3;
      switch (var0) {
         case 0:
            var3 = field_35394;
            break;
         case 1:
            var3 = field_35389;
            break;
         case 2:
            var3 = field_35385;
            break;
         case 3:
            var3 = field_35392;
            break;
         case 4:
            var3 = field_35388;
            break;
         case 5:
            var3 = field_35383;
            break;
         case 6:
            var3 = field_35384;
            break;
         case 7:
         case 8:
            var3 = field_35391;
            break;
         default:
            var3 = field_35386;
      }

      return var3;
   }

   private class_6871(int var3, String var4) {
      this.field_35390 = var3;
      this.field_35393 = var4;
   }

   public int method_31522() {
      return this.field_35390;
   }

   public String method_31520() {
      return this.field_35393;
   }

   @Override
   public String toString() {
      return this.field_35393;
   }
}
