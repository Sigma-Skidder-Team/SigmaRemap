package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5049 extends Class5046 {
   private int field23038;
   private int field23039;
   private long field23040;

   public Class5049() {
      super("RTP Hint Sample Entry");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23038 = (int)var1.readBits(2);
      this.field23039 = (int)var1.readBits(2);
      this.field23040 = var1.readBits(4);
   }

   public long method15452() {
      return this.field23040;
   }
}
