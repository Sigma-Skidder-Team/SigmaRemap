package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class Class1711 extends Class1710 {
   private final ReadableByteChannel field9317;
   private long field9318 = MemoryUtil.nmemAlloc(128L);
   private int field9319 = 128;
   private int field9320;
   private int field9321;

   public Class1711(ReadableByteChannel var1) {
      this.field9317 = var1;
   }

   private void method7454(int var1) throws IOException {
      ByteBuffer var4 = MemoryUtil.memByteBuffer(this.field9318, this.field9319);
      if (var1 + this.field9321 > this.field9319) {
         this.field9319 = var1 + this.field9321;
         var4 = MemoryUtil.memRealloc(var4, this.field9319);
         this.field9318 = MemoryUtil.memAddress(var4);
      }

      ((Buffer)var4).position(this.field9320);

      while (var1 + this.field9321 > this.field9320) {
         try {
            int var5 = this.field9317.read(var4);
            if (var5 == -1) {
               break;
            }
         } finally {
            this.field9320 = var4.position();
         }
      }
   }

   @Override
   public int method7452(long var1, int var3) throws IOException {
      this.method7454(var3);
      if (var3 + this.field9321 > this.field9320) {
         var3 = this.field9320 - this.field9321;
      }

      MemoryUtil.memCopy(this.field9318 + (long)this.field9321, var1, (long)var3);
      this.field9321 += var3;
      return var3;
   }

   @Override
   public void method7453(int var1) throws IOException {
      if (var1 > 0) {
         this.method7454(var1);
         if (var1 + this.field9321 > this.field9320) {
            throw new EOFException("Can't skip past the EOF.");
         }
      }

      if (this.field9321 + var1 >= 0) {
         this.field9321 += var1;
      } else {
         throw new IOException("Can't seek before the beginning: " + (this.field9321 + var1));
      }
   }

   @Override
   public void close() throws IOException {
      MemoryUtil.nmemFree(this.field9318);
      this.field9317.close();
   }
}
