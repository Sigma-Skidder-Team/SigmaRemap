package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

public class Class9744 extends STBIWriteCallback {
   private static String[] field45490;
   private final WritableByteChannel field45491;
   private IOException field45492;

   public Class9744(WritableByteChannel var1) {
      this.field45491 = var1;
   }

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var8 = getData(var3, var5);

      try {
         this.field45491.write(var8);
      } catch (IOException var10) {
         this.field45492 = var10;
      }
   }

   public void method38211() throws IOException {
      if (this.field45492 != null) {
         throw this.field45492;
      }
   }
}
