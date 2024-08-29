package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class5120 implements Class5119 {
   private static String[] field23290;
   private final Minecraft field23291;
   private final Map<DimensionType, Map<String, Class9764>> field23292 = Maps.newIdentityHashMap();
   private final Map<DimensionType, Map<String, Class9764>> field23293 = Maps.newIdentityHashMap();
   private final Map<DimensionType, Map<String, Boolean>> field23294 = Maps.newIdentityHashMap();

   public Class5120(Minecraft var1) {
      this.field23291 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      Class9624 var11 = this.field23291.gameRenderer.getActiveRenderInfo();
      ClientWorld var12 = this.field23291.world;
      DimensionType var13 = var12.method6812();
      BlockPos var14 = new BlockPos(var11.method37504().field18048, 0.0, var11.method37504().field18050);
      Class5422 var15 = var2.method25597(RenderType.method14345());
      if (this.field23292.containsKey(var13)) {
         for (Class9764 var17 : this.field23292.get(var13).values()) {
            if (var14.method8316(var17.method38401(), 500.0)) {
               WorldRenderer.method899(
                  var1,
                  var15,
                  (double)var17.field45678 - var3,
                  (double)var17.field45679 - var5,
                  (double)var17.field45680 - var7,
                  (double)(var17.field45681 + 1) - var3,
                  (double)(var17.field45682 + 1) - var5,
                  (double)(var17.field45683 + 1) - var7,
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
            Class9764 var19 = (Class9764)var22.getValue();
            Boolean var20 = this.field23294.get(var13).get(var18);
            if (var14.method8316(var19.method38401(), 500.0)) {
               if (!var20) {
                  WorldRenderer.method899(
                     var1,
                     var15,
                     (double)var19.field45678 - var3,
                     (double)var19.field45679 - var5,
                     (double)var19.field45680 - var7,
                     (double)(var19.field45681 + 1) - var3,
                     (double)(var19.field45682 + 1) - var5,
                     (double)(var19.field45683 + 1) - var7,
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
                     (double)var19.field45678 - var3,
                     (double)var19.field45679 - var5,
                     (double)var19.field45680 - var7,
                     (double)(var19.field45681 + 1) - var3,
                     (double)(var19.field45682 + 1) - var5,
                     (double)(var19.field45683 + 1) - var7,
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

   public void method15815(Class9764 var1, List<Class9764> var2, List<Boolean> var3, DimensionType var4) {
      if (!this.field23292.containsKey(var4)) {
         this.field23292.put(var4, Maps.newHashMap());
      }

      if (!this.field23293.containsKey(var4)) {
         this.field23293.put(var4, Maps.newHashMap());
         this.field23294.put(var4, Maps.newHashMap());
      }

      this.field23292.get(var4).put(var1.toString(), var1);

      for (int var7 = 0; var7 < var2.size(); var7++) {
         Class9764 var8 = (Class9764)var2.get(var7);
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
