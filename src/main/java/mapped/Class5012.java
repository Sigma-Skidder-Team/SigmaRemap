package mapped;

import java.io.IOException;

public class Class5012 extends FullBox {
   private long[] field22964;

   public Class5012() {
      super("Chunk Offset Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = this.field23024 != 1668232756L ? 4 : 8;
      int var5 = (int)var1.readBits(4);
      this.field22964 = new long[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field22964[var6] = var1.readBits(var4);
      }
   }

   public long[] method15367() {
      return this.field22964;
   }
}
