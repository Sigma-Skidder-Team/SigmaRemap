package mapped;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Class7137 {
   private static String[] field30693;

   public static synchronized ByteBuffer method22266(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static FloatBuffer method22267(int var0) {
      return method22266(var0 << 2).asFloatBuffer();
   }
}
