package remapped;

public class class_4839 {
   private static String[] field_24149;
   private final Vector3d field_24148;
   private final Entity field_24150;
   private final class_6139 field_24147;

   public class_4839(Entity var1, class_6139 var2) {
      this.field_24150 = var1;
      this.field_24147 = var2;
      this.field_24148 = var2.method_28187(var1);
   }

   public class_4839(Vector3d var1) {
      this.field_24150 = null;
      this.field_24148 = var1;
      this.field_24147 = null;
   }

   public void method_22262(class_9155 var1, Entity var2) {
      if (this.field_24150 == null) {
         var2.method_37332(var1.method_42181(), this.field_24148);
      } else if (!(var2 instanceof class_9359)) {
         var2.method_37332(var1.method_42181(), this.field_24148);
      } else {
         ((class_9359)var2).method_43282(var1.method_42181(), this.field_24150, this.field_24147);
      }
   }
}
