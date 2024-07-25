package remapped;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class class_4728 implements class_1155 {
   private static String[] field_22917;
   private int field_22918;
   private int field_22919;

   public class_4728(int var1, int var2) {
      this.field_22918 = var1;
      this.field_22919 = var2;
   }

   @Override
   public int method_5154() {
      return 32;
   }

   @Override
   public int method_5153() {
      return this.field_22919;
   }

   @Override
   public ByteBuffer method_5152() {
      return BufferUtils.createByteBuffer(this.method_5150() * this.method_5151() * 4);
   }

   @Override
   public int method_5151() {
      return class_8256.method_37851(this.field_22919);
   }

   @Override
   public int method_5150() {
      return class_8256.method_37851(this.field_22918);
   }

   @Override
   public int method_5155() {
      return this.field_22918;
   }
}
