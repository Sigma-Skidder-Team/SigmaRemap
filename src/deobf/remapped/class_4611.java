package remapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class class_4611 extends class_1214 {
   private static String[] field_22428;
   private final SeekableByteChannel field_22427;

   private class_4611(SeekableByteChannel var1) {
      this.field_22427 = var1;
   }

   @Override
   public int method_5382(long var1, int var3) throws IOException {
      ByteBuffer var6 = MemoryUtil.memByteBuffer(var1, var3);
      return this.field_22427.read(var6);
   }

   @Override
   public void method_5384(int var1) throws IOException {
      this.field_22427.position(this.field_22427.position() + (long)var1);
   }

   @Override
   public int method_5385(long var1) {
      return super.method_5385(var1) != 0 && this.field_22427.isOpen() ? 1 : 0;
   }

   @Override
   public void close() throws IOException {
      this.field_22427.close();
   }
}
