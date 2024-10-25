package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5018 extends Class4975 {
   private long[] field22976;
   private long[] field22977;

   public Class5018() {
      super("Time To Sample Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(4);
      this.field22976 = new long[var4];
      this.field22977 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22976[var5] = var1.readBits(4);
         this.field22977[var5] = var1.readBits(4);
      }
   }

   public long[] method15378() {
      return this.field22976;
   }

   public long[] method15379() {
      return this.field22977;
   }
}
