package mapped;

import java.io.IOException;

public class Class5015 extends FullBox {
   private long field22969;
   private long field22970;
   private long field22971;
   private Class5072[] field22972;

   public Class5015() {
      super("Sample Group Description Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22969 = var1.readBits(4);
      this.field22970 = this.field22850 != 1 ? 0L : var1.readBits(4);
      int var4 = (int)var1.readBits(4);
   }

   public long method15372() {
      return this.field22969;
   }

   public long method15373() {
      return this.field22970;
   }

   public long method15374() {
      return this.field22971;
   }
}
