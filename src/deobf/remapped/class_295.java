package remapped;

import java.io.IOException;

public class class_295 implements Packet<class_392> {
   private static String[] field_1076;
   private int field_1078;
   private byte field_1077;

   public class_295() {
   }

   public class_295(Entity var1, byte var2) {
      this.field_1078 = var1.method_37145();
      this.field_1077 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_1078 = var1.readInt();
      this.field_1077 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_1078);
      var1.writeByte(this.field_1077);
   }

   public void method_1332(class_392 var1) {
      var1.method_1906(this);
   }

   public Entity method_1331(World var1) {
      return var1.method_29534(this.field_1078);
   }

   public byte method_1329() {
      return this.field_1077;
   }
}
