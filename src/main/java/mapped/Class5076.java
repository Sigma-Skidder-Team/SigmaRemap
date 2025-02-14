package mapped;

import java.io.IOException;

public class Class5076 extends FullBox {
   private boolean field23117;
   private int field23118;
   private int field23119;
   private int field23120;

   public Class5076() {
      super("Sample Scale Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23117 = (var1.readInt() & 1) == 1;
      this.field23118 = var1.readInt();
      this.field23119 = (int)var1.readBits(2);
      this.field23120 = (int)var1.readBits(2);
   }

   public boolean method15515() {
      return this.field23117;
   }

   public int method15516() {
      return this.field23119;
   }

   public int method15517() {
      return this.field23120;
   }

   public int method15518() {
      return this.field23118;
   }
}
