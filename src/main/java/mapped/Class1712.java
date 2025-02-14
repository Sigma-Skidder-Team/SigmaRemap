package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class Class1712 extends Class1710 {
   private final SeekableByteChannel field9323;

   public Class1712(SeekableByteChannel var1) {
       this.field9323 = var1;
   }

   @Override
   public int method7452(long var1, int var3) throws IOException {
      ByteBuffer var6 = MemoryUtil.memByteBuffer(var1, var3);
      return this.field9323.read(var6);
   }

   @Override
   public void method7453(int var1) throws IOException {
      this.field9323.position(this.field9323.position() + (long)var1);
   }

   @Override
   public int method7451(long var1) {
      return super.method7451(var1) != 0 && this.field9323.isOpen() ? 1 : 0;
   }

   @Override
   public void close() throws IOException {
      this.field9323.close();
   }
}
