package remapped;

public abstract class class_369 extends class_5399 {
   private final String field_1421;
   private final boolean field_1422;
   private final class_435 field_1423;

   public class_369(String var1, String var2, boolean var3, class_404 var4, class_404 var5, class_435 var6) {
      super(var1, var4, var5);
      this.field_1421 = var2;
      this.field_1422 = var3;
      if (var6 != null) {
         this.field_1423 = var6;
      } else {
         throw new NullPointerException("Flow style must be provided.");
      }
   }

   public String method_1815() {
      return this.field_1421;
   }

   public boolean method_1814() {
      return this.field_1422;
   }

   public class_435 method_1813() {
      return this.field_1423;
   }

   @Override
   public String method_36727() {
      return super.method_36727() + ", tag=" + this.field_1421 + ", implicit=" + this.field_1422;
   }

   public boolean method_1812() {
      return class_435.field_1826 == this.field_1423;
   }
}
