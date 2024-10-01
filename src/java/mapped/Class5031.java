package mapped;

import java.io.IOException;

public class Class5031 extends Class4975 {
   private int[] field22998;
   private long[] field22999;

   public Class5031() {
      super("FEC Reservoir Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);
      this.field22998 = new int[var4];
      this.field22999 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22998[var5] = (int)var1.readBits(2);
         this.field22999[var5] = var1.readBits(4);
      }
   }

   public int[] method15400() {
      return this.field22998;
   }

   public long[] method15401() {
      return this.field22999;
   }
}
