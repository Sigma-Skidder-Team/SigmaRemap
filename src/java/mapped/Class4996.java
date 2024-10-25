package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;
import java.util.Arrays;

public class Class4996 extends Class4975 {
   private long field22927;
   private long[] field22928;

   public Class4996() {
      super("Sample Size Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      boolean var4 = this.field23024 == 1937013298L;
      int var5;
      if (!var4) {
         var5 = (int)var1.readBits(4);
      } else {
         var1.skipBytes(3L);
         var5 = var1.readInt();
      }

      this.field22927 = var1.readBits(4);
      this.field22928 = new long[(int)this.field22927];
      if (!var4) {
         if (var5 != 0) {
            Arrays.fill(this.field22928, (long)var5);
         } else {
            this.method15341(var1, 4);
         }
      } else if (var5 != 4) {
         this.method15341(var1, var5 / 8);
      } else {
         for (int var6 = 0; (long)var6 < this.field22927; var6 += 2) {
            int var7 = var1.readInt();
            this.field22928[var6] = (long)(var7 >> 4 & 15);
            this.field22928[var6 + 1] = (long)(var7 & 15);
         }
      }
   }

   private void method15341(MP4InputStream var1, int var2) throws IOException {
      for (int var5 = 0; (long)var5 < this.field22927; var5++) {
         this.field22928[var5] = var1.readBits(var2);
      }
   }

   public int method15342() {
      return (int)this.field22927;
   }

   public long[] method15343() {
      return this.field22928;
   }
}
