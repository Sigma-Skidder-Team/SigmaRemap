package mapped;

import java.io.IOException;

public class Class5077 extends FullBox {
   private long field23121;

   public Class5077() {
      super("Movie Extends Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = this.field22850 != 1 ? 4 : 8;
      this.field23121 = var1.readBits(var4);
   }

   public long method15519() {
      return this.field23121;
   }
}
