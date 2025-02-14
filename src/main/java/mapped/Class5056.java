package mapped;

import java.io.IOException;

public abstract class Class5056 extends Class5041 {
   private long field23059;
   private int field23060;

   public Class5056(String var1) {
      super(var1);
   }

   public void method15468(MP4InputStream var1) throws IOException {
      this.field23059 = var1.readBits(4);
      this.field23060 = var1.readInt();
   }

   public long method15469() {
      return this.field23059;
   }

   public int method15470() {
      return this.field23060;
   }
}
