package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class5120 implements Class5119 {
   private static String[] field23290;
   private final Minecraft field23291;
   private final Map<DimensionType, Map<String, MutableBoundingBox>> field23292 = Maps.newIdentityHashMap();
   private final Map<DimensionType, Map<String, MutableBoundingBox>> field23293 = Maps.newIdentityHashMap();
   private final Map<DimensionType, Map<String, Boolean>> field23294 = Maps.newIdentityHashMap();

   public Class5120(Minecraft var1) {
      this.field23291 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, IRenderTypeBuffer var2, double var3, double var5, double var7) {
      ActiveRenderInfo var11 = this.field23291.gameRenderer.getActiveRenderInfo();
      ClientWorld var12 = this.field23291.world;
      DimensionType var13 = var12.getDimensionType();
      BlockPos var14 = new BlockPos(var11.getPos().x, 0.0, var11.getPos().z);
      IVertexBuilder var15 = var2.getBuffer(RenderType.getLines());
      if (this.field23292.containsKey(var13)) {
         for (MutableBoundingBox var17 : this.field23292.get(var13).values()) {
            if (var14.withinDistance(var17.method38401(), 500.0)) {
               WorldRenderer.method899(
                  var1,
                  var15,
                  (double)var17.minX - var3,
                  (double)var17.minY - var5,
                  (double)var17.minZ - var7,
                  (double)(var17.maxX + 1) - var3,
                  (double)(var17.maxY + 1) - var5,
                  (double)(var17.maxZ + 1) - var7,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      if (this.field23293.containsKey(var13)) {
         for (Entry var22 : this.field23293.get(var13).entrySet()) {
            String var18 = (String)var22.getKey();
            MutableBoundingBox var19 = (MutableBoundingBox)var22.getValue();
            Boolean var20 = this.field23294.get(var13).get(var18);
            if (var14.withinDistance(var19.method38401(), 500.0)) {
               if (!var20) {
                  WorldRenderer.method899(
                     var1,
                     var15,
                     (double)var19.minX - var3,
                     (double)var19.minY - var5,
                     (double)var19.minZ - var7,
                     (double)(var19.maxX + 1) - var3,
                     (double)(var19.maxY + 1) - var5,
                     (double)(var19.maxZ + 1) - var7,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               } else {
                  WorldRenderer.method899(
                     var1,
                     var15,
                     (double)var19.minX - var3,
                     (double)var19.minY - var5,
                     (double)var19.minZ - var7,
                     (double)(var19.maxX + 1) - var3,
                     (double)(var19.maxY + 1) - var5,
                     (double)(var19.maxZ + 1) - var7,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               }
            }
         }
      }
   }

   public void method15815(MutableBoundingBox var1, List<MutableBoundingBox> var2, List<Boolean> var3, DimensionType var4) {
      if (!this.field23292.containsKey(var4)) {
         this.field23292.put(var4, Maps.newHashMap());
      }

      if (!this.field23293.containsKey(var4)) {
         this.field23293.put(var4, Maps.newHashMap());
         this.field23294.put(var4, Maps.newHashMap());
      }

      this.field23292.get(var4).put(var1.toString(), var1);

      for (int var7 = 0; var7 < var2.size(); var7++) {
         MutableBoundingBox var8 = (MutableBoundingBox)var2.get(var7);
         Boolean var9 = (Boolean)var3.get(var7);
         this.field23293.get(var4).put(var8.toString(), var8);
         this.field23294.get(var4).put(var8.toString(), var9);
      }
   }

   @Override
   public void method15814() {
      this.field23292.clear();
      this.field23293.clear();
      this.field23294.clear();
   }
}
