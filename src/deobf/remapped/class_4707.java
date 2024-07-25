package remapped;

public final class class_4707 extends class_4696 {
   private final int field_22865;

   public class_4707(int var1) {
      super("portal_texturing", () -> {
         class_3542.method_16463(5890);
         class_3542.method_16438();
         class_3542.method_16476();
         class_3542.method_16413(0.5F, 0.5F, 0.0F);
         class_3542.method_16403(0.5F, 0.5F, 1.0F);
         class_3542.method_16413(17.0F / (float)var1, (2.0F + (float)var1 / 1.5F) * ((float)(class_9665.method_44650() % 800000L) / 800000.0F), 0.0F);
         class_3542.method_16410(((float)(var1 * var1) * 4321.0F + (float)var1 * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
         class_3542.method_16403(4.5F - (float)var1 / 4.0F, 4.5F - (float)var1 / 4.0F, 1.0F);
         class_3542.method_16408();
         class_3542.method_16463(5888);
         class_3542.method_16445();
      }, () -> {
         class_3542.method_16463(5890);
         class_3542.method_16489();
         class_3542.method_16463(5888);
         class_3542.method_16479();
      });
      this.field_22865 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_4707 var4 = (class_4707)var1;
            return this.field_22865 == var4.field_22865;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field_22865);
   }
}
