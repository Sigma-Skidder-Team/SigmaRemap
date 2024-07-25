package remapped;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class class_1423 {
   private static String[] field_7701;

   public static synchronized ByteBuffer method_6528(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static FloatBuffer method_6529(int var0) {
      return method_6528(var0 << 2).asFloatBuffer();
   }
}
