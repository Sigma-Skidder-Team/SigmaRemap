package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class4979 extends Class4975 {
   private long[][] field22864;
   private long[][] field22865;

   public Class4979() {
      super("FD Session Group Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);
      this.field22864 = new long[var4][];
      this.field22865 = new long[var4][];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.readInt();
         this.field22864[var5] = new long[var6];

         for (int var7 = 0; var7 < var6; var7++) {
            this.field22864[var5][var7] = var1.readBits(4);
         }

         int var8 = (int)var1.readBits(2);
         this.field22865[var5] = new long[var8];

         for (int var9 = 0; var9 < var8; var9++) {
            this.field22865[var5][var9] = var1.readBits(4);
         }
      }
   }

   public long[][] method15275() {
      return this.field22864;
   }

   public long[][] method15276() {
      return this.field22865;
   }
}
