package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;

public class Class3600 implements Comparator<ChunkPos> {
   private static String[] field19553;
   private int field19554;
   private int field19555;
   private double field19556;
   private double field19557;

   public Class3600(int var1, int var2, double var3, double var5) {
      this.field19554 = var1;
      this.field19555 = var2;
      this.field19556 = var3;
      this.field19557 = 1.0 - MathHelper.clamp(Math.abs(var5) / (Math.PI / 2), 0.0, 1.0);
   }

   public int compare(ChunkPos var1, ChunkPos var2) {
      int var5 = this.method12201(var1);
      int var6 = this.method12201(var2);
      return var5 - var6;
   }

   private int method12201(ChunkPos var1) {
      int var4 = var1.x - this.field19554;
      int var5 = var1.z - this.field19555;
      int var6 = var4 * var4 + var5 * var5;
      double var7 = MathHelper.method37814((double)var5, (double)var4);
      double var9 = Math.abs(var7 - this.field19556);
      if (var9 > Math.PI) {
         var9 = (Math.PI * 2) - var9;
      }

      return (int)((double)var6 * 1000.0 * this.field19557 * var9 * var9);
   }
}
