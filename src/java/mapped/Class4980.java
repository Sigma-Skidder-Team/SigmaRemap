package mapped;

import java.io.IOException;

public class Class4980 extends FullBox {
   private long[] field22866;

   public Class4980() {
      super("Sync Sample Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(4);
      this.field22866 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22866[var5] = var1.readBits(4);
      }
   }

   public long[] method15277() {
      return this.field22866;
   }
}
