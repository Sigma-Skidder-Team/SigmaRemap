package mapped;

import net.minecraft.world.lighting.LevelBasedGraph;

public class LongLinkedOpenHashSet extends it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet {
   public final int field16174;
   public final LevelBasedGraph field16175;

   public LongLinkedOpenHashSet(LevelBasedGraph var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field16175 = var1;
      this.field16174 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field16174) {
         super.rehash(var1);
      }
   }
}
