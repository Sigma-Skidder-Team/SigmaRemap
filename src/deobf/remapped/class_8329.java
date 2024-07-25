package remapped;

import java.io.IOException;

public class class_8329 implements Packet<class_392> {
   private static String[] field_42652;
   private int field_42651;
   private int field_42650;

   public class_8329() {
   }

   public class_8329(Entity var1, int var2) {
      this.field_42651 = var1.method_37145();
      this.field_42650 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_42651 = var1.method_37778();
      this.field_42650 = var1.readUnsignedByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_42651);
      var1.writeByte(this.field_42650);
   }

   public void method_38367(class_392 var1) {
      var1.method_1918(this);
   }

   public int method_38366() {
      return this.field_42651;
   }

   public int method_38365() {
      return this.field_42650;
   }
}
