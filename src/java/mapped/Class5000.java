package mapped;

import java.io.IOException;

public class Class5000 extends FullBox {
   private long field22937;

   public Class5000() {
      super("Movie Fragment Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22937 = var1.readBits(4);
   }

   public long method15352() {
      return this.field22937;
   }
}
