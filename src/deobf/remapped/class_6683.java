package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class class_6683 extends class_1214 {
   private final ReadableByteChannel field_34542;
   private long field_34545 = MemoryUtil.nmemAlloc(128L);
   private int field_34540 = 128;
   private int field_34543;
   private int field_34544;

   private class_6683(ReadableByteChannel var1) {
      this.field_34542 = var1;
   }

   private void method_30655(int var1) throws IOException {
      ByteBuffer var4 = MemoryUtil.memByteBuffer(this.field_34545, this.field_34540);
      if (var1 + this.field_34544 > this.field_34540) {
         this.field_34540 = var1 + this.field_34544;
         var4 = MemoryUtil.memRealloc(var4, this.field_34540);
         this.field_34545 = MemoryUtil.memAddress(var4);
      }

      ((Buffer)var4).position(this.field_34543);

      while (var1 + this.field_34544 > this.field_34543) {
         try {
            int var5 = this.field_34542.read(var4);
            if (var5 == -1) {
               break;
            }
         } finally {
            this.field_34543 = var4.position();
         }
      }
   }

   @Override
   public int method_5382(long var1, int var3) throws IOException {
      this.method_30655(var3);
      if (var3 + this.field_34544 > this.field_34543) {
         var3 = this.field_34543 - this.field_34544;
      }

      MemoryUtil.memCopy(this.field_34545 + (long)this.field_34544, var1, (long)var3);
      this.field_34544 += var3;
      return var3;
   }

   @Override
   public void method_5384(int var1) throws IOException {
      if (var1 > 0) {
         this.method_30655(var1);
         if (var1 + this.field_34544 > this.field_34543) {
            throw new EOFException("Can't skip past the EOF.");
         }
      }

      if (this.field_34544 + var1 >= 0) {
         this.field_34544 += var1;
      } else {
         throw new IOException("Can't seek before the beginning: " + (this.field_34544 + var1));
      }
   }

   @Override
   public void close() throws IOException {
      MemoryUtil.nmemFree(this.field_34545);
      this.field_34542.close();
   }
}
