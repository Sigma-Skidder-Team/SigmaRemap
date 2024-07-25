package remapped;

public class class_4105 implements class_6224 {
   private static String[] field_19996;

   public class_4105(class_4829 var1, Runnable var2, Runnable var3) {
      this.field_19999 = var1;
      this.field_19998 = var2;
      this.field_19997 = var3;
   }

   @Override
   public void method_28452(Object... var1) {
      if (!class_1144.method_5061(this.field_19999.field_24106)) {
         this.field_19997.run();
      } else {
         this.field_19998.run();
      }
   }
}
