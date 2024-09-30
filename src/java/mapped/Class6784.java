package mapped;

import net.minecraft.world.chunk.NibbleArray;

public class Class6784 extends NibbleArray {
   private static String[] field29577;

   public Class6784() {
      super(128);
   }

   public Class6784(NibbleArray var1, int var2) {
      super(128);
      System.arraycopy(var1.method20669(), var2 * 128, this.field29578, 0, 128);
   }

   @Override
   public int method20668(int var1, int var2, int var3) {
      return var3 << 4 | var1;
   }

   @Override
   public byte[] method20669() {
      byte[] var3 = new byte[2048];

      for (int var4 = 0; var4 < 16; var4++) {
         System.arraycopy(this.field29578, 0, var3, var4 * 128, 128);
      }

      return var3;
   }
}
