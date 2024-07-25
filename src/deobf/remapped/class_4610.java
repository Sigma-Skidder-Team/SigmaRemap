package remapped;

public abstract class class_4610 {
   private final class_404 field_22425;
   private final class_404 field_22426;

   public class_4610(class_404 var1, class_404 var2) {
      if (var1 != null && var2 != null) {
         this.field_22425 = var1;
         this.field_22426 = var2;
      } else {
         throw new class_5251("Token requires marks.");
      }
   }

   public class_404 method_21372() {
      return this.field_22425;
   }

   public class_404 method_21374() {
      return this.field_22426;
   }

   public abstract class_7523 method_21371();
}
