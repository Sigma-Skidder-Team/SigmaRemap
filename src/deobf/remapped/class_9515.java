package remapped;

import java.io.IOException;

public class class_9515 extends class_4609 {
   private static String[] field_48447;

   public class_9515() {
      this.field_22417 = true;
   }

   public class_9515(double var1, double var3, double var5, boolean var7) {
      this.field_22423 = var1;
      this.field_22424 = var3;
      this.field_22419 = var5;
      this.field_22416 = var7;
      this.field_22417 = true;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22423 = var1.readDouble();
      this.field_22424 = var1.readDouble();
      this.field_22419 = var1.readDouble();
      super.method_28775(var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeDouble(this.field_22423);
      var1.writeDouble(this.field_22424);
      var1.writeDouble(this.field_22419);
      super.method_28776(var1);
   }
}
