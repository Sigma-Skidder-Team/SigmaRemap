package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.*;
import java.util.Map.Entry;

public class Class5132 implements Class5119 {
   private static String[] field23326;
   private final Minecraft field23327;
   private final Map<Long, Map<BlockPos, Integer>> field23328 = Maps.newTreeMap(Ordering.natural().reverse());

   public Class5132(Minecraft var1) {
      this.field23327 = var1;
   }

   public void method15869(long var1, BlockPos var3) {
      Map<BlockPos, Integer> var6 = this.field23328.computeIfAbsent(var1, var0 -> Maps.newHashMap());
      int var7 = var6.getOrDefault(var3, 0);
      var6.put(var3, var7 + 1);
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      long var11 = this.field23327.world.getGameTime();
      short var13 = 200;
      double var14 = 0.0025;
      Set var16 = Sets.newHashSet();
      Map<BlockPos, Integer> var17 = Maps.newHashMap();
      IVertexBuilder var18 = var2.method25597(RenderType.getLines());
      Iterator<Entry<Long, Map<BlockPos, Integer>>> var19 = this.field23328.entrySet().iterator();

      while (var19.hasNext()) {
         Entry<Long, Map<BlockPos, Integer>> var20 = var19.next();
         Long var21 = var20.getKey();
         Map<BlockPos, Integer> var22 = var20.getValue();
         long var23 = var11 - var21;
         if (var23 <= 200L) {
            for (Entry<BlockPos, Integer> var26 : var22.entrySet()) {
               BlockPos var27 = var26.getKey();
               Integer var28 = (Integer)var26.getValue();
               if (var16.add(var27)) {
                  AxisAlignedBB var29 = new AxisAlignedBB(BlockPos.ZERO)
                     .grow(0.002)
                     .shrink(0.0025 * (double)var23)
                     .offset((double)var27.getX(), (double)var27.getY(), (double)var27.getZ())
                     .offset(-var3, -var5, -var7);
                  WorldRenderer.method898(
                     var1,
                     var18,
                     var29.minX,
                     var29.minY,
                     var29.minZ,
                     var29.maxX,
                     var29.maxY,
                     var29.maxZ,
                     1.0F,
                     1.0F,
                     1.0F,
                     1.0F
                  );
                  var17.put(var27, var28);
               }
            }
         } else {
            var19.remove();
         }
      }

      for (Entry var32 : var17.entrySet()) {
         BlockPos var33 = (BlockPos)var32.getKey();
         Integer var30 = (Integer)var32.getValue();
         DebugRenderer.method27459(String.valueOf(var30), var33.getX(), var33.getY(), var33.getZ(), -1);
      }
   }
}
