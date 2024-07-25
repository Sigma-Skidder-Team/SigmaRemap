package remapped;

import java.io.IOException;

public class RotationPacket extends class_4609 {
   private static String[] field_17649;

   public RotationPacket() {
      this.field_22418 = true;
   }

   public RotationPacket(float var1, float var2, boolean var3) {
      this.field_22421 = var1;
      this.field_22422 = var2;
      this.field_22416 = var3;
      this.field_22418 = true;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22421 = var1.readFloat();
      this.field_22422 = var1.readFloat();
      super.method_28775(var1);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeFloat(this.field_22421);
      var1.writeFloat(this.field_22422);
      super.method_28776(var1);
   }
}
