package remapped;

import java.io.IOException;

public class class_457 implements Packet<class_392> {
   private static String[] field_1903;
   private int field_1902;
   private byte field_1904;

   public class_457() {
   }

   public class_457(Entity var1, byte var2) {
      this.field_1902 = var1.method_37145();
      this.field_1904 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_1902 = var1.method_37778();
      this.field_1904 = var1.readByte();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_1902);
      var1.writeByte(this.field_1904);
   }

   public void method_2194(class_392 var1) {
      var1.method_1981(this);
   }

   public Entity method_2192(World var1) {
      return var1.method_29534(this.field_1902);
   }

   public byte method_2191() {
      return this.field_1904;
   }
}
