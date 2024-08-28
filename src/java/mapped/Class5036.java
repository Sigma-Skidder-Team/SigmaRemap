package mapped;

import java.awt.Color;
import java.io.IOException;

public class Class5036 extends Class4975 {
   private long field23012;
   private Color field23013;

   public Class5036() {
      super("Video Media Header Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23012 = var1.method31863(2);
      int[] var4 = new int[3];

      for (int var5 = 0; var5 < 3; var5++) {
         var4[var5] = var1.method31861() & 0xFF | var1.method31861() << 8 & 0xFF;
      }

      this.field23013 = new Color(var4[0], var4[1], var4[2]);
   }

   public long method15414() {
      return this.field23012;
   }

   public Color method15415() {
      return this.field23013;
   }
}
