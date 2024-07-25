package remapped;

public class class_8437 extends class_1621 {
   private class_7587 field_43166;
   private String field_43167;

   public class_8437(class_9592 var1, String var2, class_404 var3, class_404 var4, class_7587 var5) {
      this(var1, true, var2, var3, var4, var5);
   }

   public class_8437(class_9592 var1, boolean var2, String var3, class_404 var4, class_404 var5, class_7587 var6) {
      super(var1, var4, var5);
      if (var3 != null) {
         this.field_43167 = var3;
         if (var6 != null) {
            this.field_43166 = var6;
            this.field_8429 = var2;
         } else {
            throw new NullPointerException("Scalar style must be provided.");
         }
      } else {
         throw new NullPointerException("value in a Node is required.");
      }
   }

   public class_7587 method_38817() {
      return this.field_43166;
   }

   @Override
   public class_99 method_7221() {
      return class_99.field_235;
   }

   public String method_38816() {
      return this.field_43167;
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + " (tag=" + this.method_7232() + ", value=" + this.method_38816() + ")>";
   }

   public boolean method_38815() {
      return this.field_43166 == class_7587.field_38646;
   }
}
