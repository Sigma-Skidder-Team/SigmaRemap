package remapped;

public enum class_6512 {
   field_33112(0),
   field_33117(1),
   field_33116(2);

   public int field_33115;

   private class_6512(int var3) {
      this.field_33115 = var3;
   }

   public class_6512 method_29666() {
      for (class_6512 var6 : values()) {
         if (var6.field_33115 == this.field_33115 + 1) {
            return var6;
         }
      }

      return field_33112;
   }

   public static class_6512 method_29668(int var0) {
      for (class_6512 var6 : values()) {
         if (var6.field_33115 == var0) {
            return var6;
         }
      }

      return field_33117;
   }
}
