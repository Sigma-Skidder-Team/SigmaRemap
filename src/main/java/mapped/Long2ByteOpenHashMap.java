package mapped;

import net.minecraft.world.lighting.LevelBasedGraph;

public class Long2ByteOpenHashMap extends it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap {
   private static String[] field37;
   public final int field38;
   public final LevelBasedGraph field39;

   public Long2ByteOpenHashMap(LevelBasedGraph var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field39 = var1;
      this.field38 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field38) {
         super.rehash(var1);
      }
   }
}
