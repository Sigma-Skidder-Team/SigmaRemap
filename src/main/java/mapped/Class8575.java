package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class Class8575 {
   private static String[] field38553;
   private static final int field38554 = 8192;
   private final byte[] field38555 = new byte[8192];
   private final ByteBuffer field38556 = ByteBuffer.wrap(this.field38555);
   private final FileChannel field38557;

   public Class8575(FileChannel var1) {
      this.field38557 = var1;
   }

   public void method30645(long var1, Class1734 var3, long var4) throws IOException {
      if (var4 >= 0L && var4 <= var3.method7582()) {
         while (var4 > 0L) {
            try {
               int var8 = (int)Math.min(8192L, var4);
               var3.method7625(this.field38555, 0, var8);
               ((Buffer)this.field38556).limit(var8);

               do {
                  int var9 = this.field38557.write(this.field38556, var1);
                  var1 += (long)var9;
               } while (this.field38556.hasRemaining());

               var4 -= (long)var8;
            } finally {
               ((Buffer)this.field38556).clear();
            }
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method30646(long var1, Class1734 var3, long var4) throws IOException {
      if (var4 < 0L) {
         throw new IndexOutOfBoundsException();
      } else {
         while (var4 > 0L) {
            try {
               ((Buffer)this.field38556).limit((int)Math.min(8192L, var4));
               if (this.field38557.read(this.field38556, var1) == -1) {
                  throw new EOFException();
               }

               int var8 = this.field38556.position();
               var3.method7631(this.field38555, 0, var8);
               var1 += (long)var8;
               var4 -= (long)var8;
            } finally {
               ((Buffer)this.field38556).clear();
            }
         }
      }
   }
}
