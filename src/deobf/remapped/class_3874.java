package remapped;

public class class_3874 implements class_6844 {
   private static String[] field_18864;

   public class_3874(class_1100 var1) {
      this.field_18863 = var1;
   }

   @Override
   public int method_31408(int var1) {
      switch (var1) {
         case 0:
            return class_1100.method_4879(this.field_18863);
         case 1:
            return class_1425.method_6536(class_1100.method_4882(this.field_18863));
         case 2:
            return class_1425.method_6536(class_1100.method_4881(this.field_18863));
         default:
            return 0;
      }
   }

   @Override
   public void method_31409(int var1, int var2) {
      switch (var1) {
         case 0:
            class_1100.method_4885(this.field_18863, var2);
            break;
         case 1:
            if (!this.field_18863.field_18364.field_33055 && !class_1100.method_4889(this.field_18863).isEmpty()) {
               this.field_18863.method_4883(class_463.field_2620);
            }

            class_1100.method_4888(this.field_18863, class_1100.method_4878(var2));
            break;
         case 2:
            class_1100.method_4884(this.field_18863, class_1100.method_4878(var2));
      }
   }

   @Override
   public int method_31410() {
      return 3;
   }
}
