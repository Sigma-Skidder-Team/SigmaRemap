package remapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

public class class_9548 extends STBIWriteCallback {
   private static String[] field_48569;
   private final WritableByteChannel field_48570;
   private IOException field_48568;

   private class_9548(WritableByteChannel var1) {
      this.field_48570 = var1;
   }

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var8 = getData(var3, var5);

      try {
         this.field_48570.write(var8);
      } catch (IOException var10) {
         this.field_48568 = var10;
      }
   }

   public void method_44065() throws IOException {
      if (this.field_48568 != null) {
         throw this.field_48568;
      }
   }
}
