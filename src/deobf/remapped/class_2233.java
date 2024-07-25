package remapped;

import java.util.List;

public abstract class class_2233<T> extends class_1621 {
   private class_435 field_11131;

   public class_2233(class_9592 var1, class_404 var2, class_404 var3, class_435 var4) {
      super(var1, var2, var3);
      this.method_10281(var4);
   }

   public abstract List<T> method_10282();

   public class_435 method_10280() {
      return this.field_11131;
   }

   public void method_10281(class_435 var1) {
      if (var1 != null) {
         this.field_11131 = var1;
      } else {
         throw new NullPointerException("Flow style must be provided.");
      }
   }

   public void method_10283(class_404 var1) {
      this.field_8427 = var1;
   }
}
