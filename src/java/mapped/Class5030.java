package mapped;

import java.io.IOException;

public class Class5030 extends FullBox {
   private int[] field22997;

   public Class5030() {
      super("Degradation Priority Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = ((Class4996)this.field23026.method15438(1937011578L)).method15342();
      this.field22997 = new int[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22997[var5] = (int)var1.readBits(2);
      }
   }

   public int[] method15399() {
      return this.field22997;
   }
}
