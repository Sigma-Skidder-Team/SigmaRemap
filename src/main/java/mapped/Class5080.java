package mapped;

import java.io.IOException;

public class Class5080 extends FullBox {
   private long[][] field23132;

   public Class5080() {
      super("Shadow Sync Sample Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(4);
      this.field23132 = new long[var4][2];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field23132[var5][0] = var1.readBits(4);
         this.field23132[var5][1] = var1.readBits(4);
      }
   }

   public long[][] method15530() {
      return this.field23132;
   }
}
