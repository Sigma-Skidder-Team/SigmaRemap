package remapped;

public class class_5273 {
   private static String[] field_26946;
   private final String field_26947;

   public class_5273(String var1) {
      this.field_26947 = var1;
   }

   public class_1451 method_24063() {
      try {
         double var3 = Double.parseDouble(this.field_26947);
      } catch (NullPointerException | NumberFormatException var6) {
         return class_1451.field_7816;
      }

      return class_1451.field_7814;
   }

   public double method_24062() {
      try {
         return Double.parseDouble(this.field_26947);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0;
      }
   }

   public float method_24061() {
      try {
         return (float)Double.parseDouble(this.field_26947);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0F;
      }
   }

   public int method_24059() {
      try {
         return (int)Double.parseDouble(this.field_26947);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0;
      }
   }

   public String method_24060() {
      return this.field_26947;
   }
}
