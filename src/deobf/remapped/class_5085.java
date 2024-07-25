package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class class_5085 {
   private static String[] field_26255;
   private static final int field_26254 = 8192;
   private final byte[] field_26257 = new byte[8192];
   private final ByteBuffer field_26258 = ByteBuffer.wrap(this.field_26257);
   private final FileChannel field_26256;

   public class_5085(FileChannel var1) {
      this.field_26256 = var1;
   }

   public void method_23372(long var1, class_7059 var3, long var4) throws IOException {
      if (var4 >= 0L && var4 <= var3.method_32468()) {
         while (var4 > 0L) {
            try {
               int var8 = (int)Math.min(8192L, var4);
               var3.method_36578(this.field_26257, 0, var8);
               ((Buffer)this.field_26258).limit(var8);

               do {
                  int var9 = this.field_26256.write(this.field_26258, var1);
                  var1 += (long)var9;
               } while (this.field_26258.hasRemaining());

               var4 -= (long)var8;
            } finally {
               ((Buffer)this.field_26258).clear();
            }
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method_23371(long var1, class_7059 var3, long var4) throws IOException {
      if (var4 < 0L) {
         throw new IndexOutOfBoundsException();
      } else {
         while (var4 > 0L) {
            try {
               ((Buffer)this.field_26258).limit((int)Math.min(8192L, var4));
               if (this.field_26256.read(this.field_26258, var1) == -1) {
                  throw new EOFException();
               }

               int var8 = this.field_26258.position();
               var3.method_32489(this.field_26257, 0, var8);
               var1 += (long)var8;
               var4 -= (long)var8;
            } finally {
               ((Buffer)this.field_26258).clear();
            }
         }
      }
   }
}
