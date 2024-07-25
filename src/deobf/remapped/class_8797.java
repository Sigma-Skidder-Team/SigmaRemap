package remapped;

import java.util.function.Consumer;

public class class_8797 implements class_6685 {
   private static String[] field_45012;

   public class_8797(class_8604 var1, Consumer var2) {
      this.field_45010 = var1;
      this.field_45011 = var2;
   }

   @Override
   public void method_30658(class_4085 var1) {
   }

   @Override
   public void method_30657(class_4085 var1) {
      this.field_45011.accept(var1);
   }
}
