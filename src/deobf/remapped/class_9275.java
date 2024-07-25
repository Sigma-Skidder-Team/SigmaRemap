package remapped;

import java.io.IOException;

public class class_9275 implements Packet<class_392> {
   private static String[] field_47309;
   private class_423 field_47310;
   private boolean field_47311;

   public class_9275() {
   }

   public class_9275(class_423 var1, boolean var2) {
      this.field_47310 = var1;
      this.field_47311 = var2;
   }

   public void method_42730(class_392 var1) {
      var1.method_1959(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_47310 = class_423.method_2100(var1.readUnsignedByte());
      this.field_47311 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_47310.method_2097());
      var1.writeBoolean(this.field_47311);
   }

   public boolean method_42731() {
      return this.field_47311;
   }

   public class_423 method_42728() {
      return this.field_47310;
   }
}
