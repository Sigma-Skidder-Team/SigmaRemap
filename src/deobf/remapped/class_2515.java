package remapped;

import java.io.IOException;

public class class_2515 extends class_527 {
   private static String[] field_12473;

   public class_2515() {
      this.field_3210 = true;
   }

   public class_2515(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.field_3212 = var2;
      this.field_3214 = var3;
      this.field_3210 = true;
      this.field_3211 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      super.method_28775(var1);
      this.field_3212 = var1.readByte();
      this.field_3214 = var1.readByte();
      this.field_3211 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      super.method_28776(var1);
      var1.writeByte(this.field_3212);
      var1.writeByte(this.field_3214);
      var1.writeBoolean(this.field_3211);
   }
}
