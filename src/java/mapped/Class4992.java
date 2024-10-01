package mapped;

import java.io.IOException;

public class Class4992 extends Class4975 {
   private int[] field22910;
   private int[] field22911;

   public Class4992() {
      super("Padding Bit Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)(var1.readBits(4) + 1L) / 2;
      this.field22910 = new int[var4];
      this.field22911 = new int[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         byte var6 = (byte)var1.readInt();
         this.field22910[var5] = var6 >> 4 & 7;
         this.field22911[var5] = var6 & 7;
      }
   }

   public int[] method15324() {
      return this.field22910;
   }

   public int[] method15325() {
      return this.field22911;
   }
}
