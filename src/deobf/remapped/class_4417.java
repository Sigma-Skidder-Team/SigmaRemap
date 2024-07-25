package remapped;

public final class class_4417 extends class_5399 {
   private final String field_21603;
   private final class_7587 field_21600;
   private final String field_21601;
   private final class_2798 field_21602;

   public class_4417(String var1, String var2, class_2798 var3, String var4, class_404 var5, class_404 var6, class_7587 var7) {
      super(var1, var5, var6);
      this.field_21603 = var2;
      this.field_21602 = var3;
      this.field_21601 = var4;
      if (var7 != null) {
         this.field_21600 = var7;
      } else {
         throw new NullPointerException("Style must be provided.");
      }
   }

   public String method_20550() {
      return this.field_21603;
   }

   public class_7587 method_20551() {
      return this.field_21600;
   }

   public String method_20548() {
      return this.field_21601;
   }

   public class_2798 method_20549() {
      return this.field_21602;
   }

   @Override
   public String method_36727() {
      return super.method_36727() + ", tag=" + this.field_21603 + ", " + this.field_21602 + ", value=" + this.field_21601;
   }

   @Override
   public boolean method_36724(class_3467 var1) {
      return class_3467.field_16982 == var1;
   }

   public boolean method_20547() {
      return this.field_21600 == class_7587.field_38646;
   }
}
