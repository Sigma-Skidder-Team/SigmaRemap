package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5133 implements Class5119 {
   private static final Logger field23329 = LogManager.getLogger();
   private final Minecraft field23330;
   private final Map<BlockPos, Class9321> field23331 = Maps.newHashMap();
   private final Map<UUID, Class8918> field23332 = Maps.newHashMap();
   private UUID field23333;

   public Class5133(Minecraft var1) {
      this.field23330 = var1;
   }

   @Override
   public void method15814() {
      this.field23331.clear();
      this.field23332.clear();
      this.field23333 = null;
   }

   public void method15871(Class9321 var1) {
      this.field23331.put(var1.field43269, var1);
   }

   public void method15872(BlockPos var1) {
      this.field23331.remove(var1);
   }

   public void method15873(BlockPos var1, int var2) {
      Class9321 var5 = this.field23331.get(var1);
      if (var5 != null) {
         var5.field43271 = var2;
      } else {
         field23329.warn("Strange, setFreeTicketCount was called for an unknown POI: " + var1);
      }
   }

   public void method15874(Class8918 var1) {
      this.field23332.put(var1.field40362, var1);
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.method15875();
      this.method15876(var3, var5, var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!this.field23330.player.isSpectator()) {
         this.method15892();
      }
   }

   private void method15875() {
      this.field23332.entrySet().removeIf(var1 -> {
         Entity var4 = this.field23330.world.method6774(var1.getValue().field40363);
         return var4 == null || var4.removed;
      });
   }

   private void method15876(double var1, double var3, double var5) {
      BlockPos var9 = new BlockPos(var1, var3, var5);
      this.field23332.values().forEach(var7 -> {
         if (this.method15888(var7)) {
            this.method15881(var7, var1, var3, var5);
         }
      });

      for (BlockPos var11 : this.field23331.keySet()) {
         if (var9.method8316(var11, 30.0)) {
            method15877(var11);
         }
      }

      this.field23331.values().forEach(var2 -> {
         if (var9.method8316(var2.field43269, 30.0)) {
            this.method15879(var2);
         }
      });
      this.method15891().forEach((var2, var3x) -> {
         if (var9.method8316(var2, 30.0)) {
            this.method15878(var2, (List<String>)var3x);
         }
      });
   }

   private static void method15877(BlockPos var0) {
      float var3 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      DebugRenderer.method27456(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void method15878(BlockPos var1, List<String> var2) {
      float var5 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      DebugRenderer.method27456(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      method15883("" + var2, var1, 0, -256);
      method15883("Ghost POI", var1, 1, -65536);
   }

   private void method15879(Class9321 var1) {
      int var4 = 0;
      Set var5 = this.method15885(var1);
      if (var5.size() >= 4) {
         method15882("" + var5.size() + " ticket holders", var1, var4, -256);
      } else {
         method15882("Owners: " + var5, var1, var4, -256);
      }

      var4++;
      Set var6 = this.method15886(var1);
      if (var6.size() >= 4) {
         method15882("" + var6.size() + " potential owners", var1, var4, -23296);
      } else {
         method15882("Candidates: " + var6, var1, var4, -23296);
      }

      method15882("Free tickets: " + var1.field43271, var1, ++var4, -256);
      method15882(var1.field43270, var1, ++var4, -1);
   }

   private void method15880(Class8918 var1, double var2, double var4, double var6) {
      if (var1.field40371 != null) {
         Class5135.method15903(var1.field40371, 0.5F, false, false, var2, var4, var6);
      }
   }

   private void method15881(Class8918 var1, double var2, double var4, double var6) {
      boolean var10 = this.method15887(var1);
      int var11 = 0;
      method15884(var1.field40369, var11, var1.field40364, -1, 0.03F);
      var11++;
      if (var10) {
         method15884(var1.field40369, var11, var1.field40365 + " " + var1.field40366 + " xp", -1, 0.02F);
         var11++;
      }

      if (var10) {
         int var12 = !(var1.field40367 < var1.field40368) ? -1 : -23296;
         method15884(var1.field40369, var11, "health: " + String.format("%.1f", var1.field40367) + " / " + String.format("%.1f", var1.field40368), var12, 0.02F);
         var11++;
      }

      if (var10 && !var1.field40370.equals("")) {
         method15884(var1.field40369, var11, var1.field40370, -98404, 0.02F);
         var11++;
      }

      if (var10) {
         for (String var13 : var1.field40374) {
            method15884(var1.field40369, var11, var13, -16711681, 0.02F);
            var11++;
         }
      }

      if (var10) {
         for (String var19 : var1.field40373) {
            method15884(var1.field40369, var11, var19, -16711936, 0.02F);
            var11++;
         }
      }

      if (var1.field40372) {
         method15884(var1.field40369, var11, "Wants Golem", -23296, 0.02F);
         var11++;
      }

      if (var10) {
         for (String var20 : var1.field40376) {
            if (!var20.startsWith(var1.field40364)) {
               method15884(var1.field40369, var11, var20, -23296, 0.02F);
            } else {
               method15884(var1.field40369, var11, var20, -1, 0.02F);
            }

            var11++;
         }
      }

      if (var10) {
         for (String var21 : Lists.reverse(var1.field40375)) {
            method15884(var1.field40369, var11, var21, -3355444, 0.02F);
            var11++;
         }
      }

      if (var10) {
         this.method15880(var1, var2, var4, var6);
      }
   }

   private static void method15882(String var0, Class9321 var1, int var2, int var3) {
      BlockPos var6 = var1.field43269;
      method15883(var0, var6, var2, var3);
   }

   private static void method15883(String var0, BlockPos var1, int var2, int var3) {
      double var6 = 1.3;
      double var8 = 0.2;
      double var10 = (double)var1.getX() + 0.5;
      double var12 = (double)var1.getY() + 1.3 + (double)var2 * 0.2;
      double var14 = (double)var1.getZ() + 0.5;
      DebugRenderer.method27462(var0, var10, var12, var14, var3, 0.02F, true, 0.0F, true);
   }

   private static void method15884(Class2955 var0, int var1, String var2, int var3, float var4) {
      double var7 = 2.4;
      double var9 = 0.25;
      BlockPos var11 = new BlockPos(var0);
      double var12 = (double)var11.getX() + 0.5;
      double var14 = var0.method11321() + 2.4 + (double)var1 * 0.25;
      double var16 = (double)var11.getZ() + 0.5;
      float var18 = 0.5F;
      DebugRenderer.method27462(var2, var12, var14, var16, var3, var4, false, 0.5F, true);
   }

   private Set<String> method15885(Class9321 var1) {
      return this.method15889(var1.field43269).stream().<String>map(Class8249::method28763).collect(Collectors.<String>toSet());
   }

   private Set<String> method15886(Class9321 var1) {
      return this.method15890(var1.field43269).stream().<String>map(Class8249::method28763).collect(Collectors.<String>toSet());
   }

   private boolean method15887(Class8918 var1) {
      return Objects.equals(this.field23333, var1.field40362);
   }

   private boolean method15888(Class8918 var1) {
      ClientPlayerEntity var4 = this.field23330.player;
      BlockPos var5 = new BlockPos(var4.getPosX(), var1.field40369.method11321(), var4.getPosZ());
      BlockPos var6 = new BlockPos(var1.field40369);
      return var5.method8316(var6, 30.0);
   }

   private Collection<UUID> method15889(BlockPos var1) {
      return this.field23332
         .values()
         .stream()
         .filter(var1x -> Class8918.method32595(var1x, var1))
         .<UUID>map(Class8918::method32593)
         .collect(Collectors.<UUID>toSet());
   }

   private Collection<UUID> method15890(BlockPos var1) {
      return this.field23332
         .values()
         .stream()
         .filter(var1x -> Class8918.method32594(var1x, var1))
         .<UUID>map(Class8918::method32593)
         .collect(Collectors.<UUID>toSet());
   }

   private Map<BlockPos, List<String>> method15891() {
      Map<BlockPos, List<String>> var3 = Maps.newHashMap();

      for (Class8918 var5 : this.field23332.values()) {
         for (BlockPos var7 : Iterables.concat(var5.field40377, var5.field40378)) {
            if (!this.field23331.containsKey(var7)) {
               var3.computeIfAbsent(var7, var0 -> Lists.newArrayList()).add(var5.field40364);
            }
         }
      }

      return var3;
   }

   private void method15892() {
      DebugRenderer.method27454(this.field23330.getRenderViewEntity(), 8).ifPresent(var1 -> this.field23333 = var1.getUniqueID());
   }
}
