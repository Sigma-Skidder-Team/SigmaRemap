package remapped;

public class class_7306 implements class_6844 {
   private static String[] field_37358;

   public class_7306(class_7933 var1) {
      this.field_37357 = var1;
   }

   @Override
   public int method_31408(int var1) {
      switch (var1) {
         case 0:
            return class_7933.method_35881(this.field_37357);
         case 1:
            return class_7933.method_35880(this.field_37357);
         case 2:
            return class_7933.method_35872(this.field_37357);
         case 3:
            return class_7933.method_35866(this.field_37357);
         default:
            return 0;
      }
   }

   @Override
   public void method_31409(int var1, int var2) {
      switch (var1) {
         case 0:
            class_7933.method_35870(this.field_37357, var2);
            break;
         case 1:
            class_7933.method_35875(this.field_37357, var2);
            break;
         case 2:
            class_7933.method_35871(this.field_37357, var2);
            break;
         case 3:
            class_7933.method_35882(this.field_37357, var2);
      }
   }

   @Override
   public int method_31410() {
      return 4;
   }
}
