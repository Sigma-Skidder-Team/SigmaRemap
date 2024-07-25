package remapped;

public final class class_8016 extends class_4610 {
   private final String field_41057;
   private final boolean field_41055;
   private final class_7587 field_41054;

   public class_8016(String var1, class_404 var2, class_404 var3, boolean var4) {
      this(var1, var4, var2, var3, class_7587.field_38646);
   }

   public class_8016(String var1, boolean var2, class_404 var3, class_404 var4, class_7587 var5) {
      super(var3, var4);
      this.field_41057 = var1;
      this.field_41055 = var2;
      if (var5 != null) {
         this.field_41054 = var5;
      } else {
         throw new NullPointerException("Style must be provided.");
      }
   }

   public boolean method_36385() {
      return this.field_41055;
   }

   public String method_36387() {
      return this.field_41057;
   }

   public class_7587 method_36386() {
      return this.field_41054;
   }

   @Override
   public class_7523 method_21371() {
      return class_7523.field_38396;
   }
}
