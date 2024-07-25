package remapped;

public class class_6880 implements class_6844 {
   private static String[] field_35426;

   public class_6880(class_5678 var1) {
      this.field_35427 = var1;
   }

   @Override
   public int method_31408(int var1) {
      switch (var1) {
         case 0:
            return class_5678.method_25683(this.field_35427);
         case 1:
            return class_5678.method_25685(this.field_35427);
         default:
            return 0;
      }
   }

   @Override
   public void method_31409(int var1, int var2) {
      switch (var1) {
         case 0:
            class_5678.method_25680(this.field_35427, var2);
            break;
         case 1:
            class_5678.method_25681(this.field_35427, var2);
      }
   }

   @Override
   public int method_31410() {
      return 2;
   }
}
