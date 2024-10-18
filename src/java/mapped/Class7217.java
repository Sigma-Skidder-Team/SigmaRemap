package mapped;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;

public class Class7217 {
   private static String[] field31024;
   private boolean field31025;
   private final Long2IntLinkedOpenHashMap field31026 = Util.<Long2IntLinkedOpenHashMap>make(() -> {
      Class22 var3 = new Class22(this, 100, 0.25F);
      var3.defaultReturnValue(Integer.MAX_VALUE);
      return var3;
   });
   private final Long2FloatLinkedOpenHashMap field31027 = Util.<Long2FloatLinkedOpenHashMap>make(() -> {
      Class13 var3 = new Class13(this, 100, 0.25F);
      var3.defaultReturnValue(Float.NaN);
      return var3;
   });

   public Class7217() {
   }

   public void method22662() {
      this.field31025 = true;
   }

   public void method22663() {
      this.field31025 = false;
      this.field31026.clear();
      this.field31027.clear();
   }

   public int method22664(BlockState var1, IBlockDisplayReader var2, BlockPos var3) {
      long var6 = var3.toLong();
      if (this.field31025) {
         int var8 = this.field31026.get(var6);
         if (var8 != Integer.MAX_VALUE) {
            return var8;
         }
      }

      int var9 = WorldRenderer.method945(var2, var1, var3);
      if (this.field31025) {
         if (this.field31026.size() == 100) {
            this.field31026.removeFirstInt();
         }

         this.field31026.put(var6, var9);
      }

      return var9;
   }

   public float method22665(BlockState var1, IBlockDisplayReader var2, BlockPos var3) {
      long var6 = var3.toLong();
      if (this.field31025) {
         float var8 = this.field31027.get(var6);
         if (!Float.isNaN(var8)) {
            return var8;
         }
      }

      float var9 = var1.method23399(var2, var3);
      if (this.field31025) {
         if (this.field31027.size() == 100) {
            this.field31027.removeFirstFloat();
         }

         this.field31027.put(var6, var9);
      }

      return var9;
   }
}
