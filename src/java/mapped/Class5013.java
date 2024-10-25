package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5013 extends Class4975 {
   private long[] field22965;
   private long[] field22966;
   private long[] field22967;

   public Class5013() {
      super("Sample To Chunk Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(4);
      this.field22965 = new long[var4];
      this.field22966 = new long[var4];
      this.field22967 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22965[var5] = var1.readBits(4);
         this.field22966[var5] = var1.readBits(4);
         this.field22967[var5] = var1.readBits(4);
      }
   }

   public long[] method15368() {
      return this.field22965;
   }

   public long[] method15369() {
      return this.field22966;
   }

   public long[] method15370() {
      return this.field22967;
   }
}
