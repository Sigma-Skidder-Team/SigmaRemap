package remapped;

import java.io.IOException;

public class class_1514 extends class_4609 {
   private static String[] field_8074;

   public class_1514() {
      this.field_22417 = true;
      this.field_22418 = true;
   }

   public class_1514(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.field_22423 = var1;
      this.field_22424 = var3;
      this.field_22419 = var5;
      this.field_22421 = var7;
      this.field_22422 = var8;
      this.field_22416 = var9;
      this.field_22418 = true;
      this.field_22417 = true;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22423 = var1.readDouble();
      this.field_22424 = var1.readDouble();
      this.field_22419 = var1.readDouble();
      this.field_22421 = var1.readFloat();
      this.field_22422 = var1.readFloat();
      super.method_28775(var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeDouble(this.field_22423);
      var1.writeDouble(this.field_22424);
      var1.writeDouble(this.field_22419);
      var1.writeFloat(this.field_22421);
      var1.writeFloat(this.field_22422);
      super.method_28776(var1);
   }
}
