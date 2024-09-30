package mapped;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import net.minecraft.world.lighting.LevelBasedGraph;

public class Class2359 extends LongLinkedOpenHashSet {
   private static String[] field16173;
   public final int field16174;
   public final LevelBasedGraph field16175;

   public Class2359(LevelBasedGraph var1, int var2, float var3, int var4) {
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
