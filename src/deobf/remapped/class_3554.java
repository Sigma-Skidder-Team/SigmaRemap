package remapped;

public class class_3554 implements class_3753 {
   private static String[] field_17424;
   private final class_5989 field_17425;
   private final class_3541 field_17422;
   private int field_17423 = 0;

   public class_3554(class_5989 var1, class_3541 var2) {
      this.field_17425 = var1;
      this.field_17422 = var2;
   }

   @Override
   public void method_17366() {
      this.field_17423--;
      if (this.field_17423 <= 0 && this.field_17425.method_37179()) {
         float var3 = this.field_17425.field_41768.field_33033.nextFloat();
         if (!(var3 < 1.0E-4F)) {
            if (!(var3 < 0.001F)) {
               if (var3 < 0.01F) {
                  this.field_17423 = 0;
                  this.field_17422.method_16345(new class_6120(this.field_17425, class_463.field_2710));
               }
            } else {
               this.field_17423 = 0;
               this.field_17422.method_16345(new class_6120(this.field_17425, class_463.field_2184));
            }
         } else {
            this.field_17423 = 0;
            this.field_17422.method_16345(new class_6120(this.field_17425, class_463.field_2736));
         }
      }
   }
}
