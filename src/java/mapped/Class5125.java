package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Class5125 implements Class5119 {
   private final Minecraft field23306;
   private final Map<BlockPos, Class8974> field23307 = Maps.newHashMap();
   private final Map<UUID, Class6986> field23308 = Maps.newHashMap();
   private UUID field23309;

   public Class5125(Minecraft var1) {
      this.field23306 = var1;
   }

   @Override
   public void method15814() {
      this.field23307.clear();
      this.field23308.clear();
      this.field23309 = null;
   }

   public void method15824(Class8974 var1) {
      this.field23307.put(var1.field40567, var1);
   }

   public void method15825(Class6986 var1) {
      this.field23308.put(var1.field30219, var1);
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.disableTexture();
      this.method15827();
      this.method15826();
      this.method15828();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      if (!this.field23306.player.isSpectator()) {
         this.method15847();
      }
   }

   private void method15826() {
      this.field23308.entrySet().removeIf(var1 -> this.field23306.world.method6774(var1.getValue().field30220) == null);
   }

   private void method15827() {
      long var3 = this.field23306.world.method6783() - 20L;
      this.field23307.entrySet().removeIf(var2 -> var2.getValue().field40572 < var3);
   }

   private void method15828() {
      BlockPos var3 = this.method15841().method37505();
      this.field23308.values().forEach(var1 -> {
         if (this.method15844(var1)) {
            this.method15837(var1);
         }
      });
      this.method15830();

      for (BlockPos var5 : this.field23307.keySet()) {
         if (var3.method8316(var5, 30.0)) {
            method15832(var5);
         }
      }

      Map var6 = this.method15829();
      this.field23307.values().forEach(var3x -> {
         if (var3.method8316(var3x.field40567, 30.0)) {
            Set var6x = (Set)var6.get(var3x.field40567);
            this.method15835(var3x, (Collection<UUID>)(var6x != null ? var6x : Sets.newHashSet()));
         }
      });
      this.method15846().forEach((var2, var3x) -> {
         if (var3.method8316(var2, 30.0)) {
            this.method15833(var2, (List<String>)var3x);
         }
      });
   }

   private Map<BlockPos, Set<UUID>> method15829() {
      Map<BlockPos, Set<UUID>> var3 = Maps.newHashMap();
      this.field23308
         .values()
         .forEach(var1 -> var1.field30227.forEach(var2 -> var3.computeIfAbsent(var2, var0xx -> Sets.newHashSet()).add(var1.method21607())));
      return var3;
   }

   private void method15830() {
      Map<BlockPos, Set<UUID>> var3 = Maps.newHashMap();
      this.field23308
         .values()
         .stream()
         .filter(Class6986::method21609)
         .forEach(var1 -> var3.computeIfAbsent(var1.field30224, var0x -> Sets.newHashSet()).add(var1.method21607()));
      var3.entrySet().forEach(var0 -> {
         BlockPos var3x = var0.getKey();
         Set<UUID> var4 = var0.getValue();
         Set<String> var5 = var4.stream().map(Class8249::method28763).collect(Collectors.toSet());
         int var6 = 1;
         method15839(var5.toString(), var3x, var6++, -256);
         method15839("Flower", var3x, var6++, -1);
         float var7 = 0.05F;
         method15834(var3x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private static String method15831(Collection<UUID> var0) {
      if (!var0.isEmpty()) {
         return var0.size() <= 3 ? var0.stream().<String>map(Class8249::method28763).collect(Collectors.toSet()).toString() : "" + var0.size() + " bees";
      } else {
         return "-";
      }
   }

   private static void method15832(BlockPos var0) {
      float var3 = 0.05F;
      method15834(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void method15833(BlockPos var1, List<String> var2) {
      float var5 = 0.05F;
      method15834(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      method15839("" + var2, var1, 0, -256);
      method15839("Ghost Hive", var1, 1, -65536);
   }

   private static void method15834(BlockPos var0, float var1, float var2, float var3, float var4, float var5) {
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      DebugRenderer.method27456(var0, var1, var2, var3, var4, var5);
   }

   private void method15835(Class8974 var1, Collection<UUID> var2) {
      int var5 = 0;
      if (!var2.isEmpty()) {
         method15838("Blacklisted by " + method15831(var2), var1, var5++, -65536);
      }

      method15838("Out: " + method15831(this.method15845(var1.field40567)), var1, var5++, -3355444);
      if (var1.field40569 != 0) {
         if (var1.field40569 != 1) {
            method15838("In: " + var1.field40569 + " bees", var1, var5++, -256);
         } else {
            method15838("In: 1 bee", var1, var5++, -256);
         }
      } else {
         method15838("In: -", var1, var5++, -256);
      }

      method15838("Honey: " + var1.field40570, var1, var5++, -23296);
      method15838(var1.field40568 + (!var1.field40571 ? "" : " (sedated)"), var1, var5++, -1);
   }

   private void method15836(Class6986 var1) {
      if (var1.field30222 != null) {
         Class5135.method15903(
            var1.field30222,
            0.5F,
            false,
            false,
            this.method15841().method37504().method11320(),
            this.method15841().method37504().method11321(),
            this.method15841().method37504().method11322()
         );
      }
   }

   private void method15837(Class6986 var1) {
      boolean var4 = this.method15843(var1);
      int var5 = 0;
      method15840(var1.field30221, var5++, var1.toString(), -1, 0.03F);
      if (var1.field30223 != null) {
         method15840(var1.field30221, var5++, "Hive: " + this.method15842(var1, var1.field30223), -256, 0.02F);
      } else {
         method15840(var1.field30221, var5++, "No hive", -98404, 0.02F);
      }

      if (var1.field30224 != null) {
         method15840(var1.field30221, var5++, "Flower: " + this.method15842(var1, var1.field30224), -256, 0.02F);
      } else {
         method15840(var1.field30221, var5++, "No flower", -98404, 0.02F);
      }

      for (String var7 : var1.field30226) {
         method15840(var1.field30221, var5++, var7, -16711936, 0.02F);
      }

      if (var4) {
         this.method15836(var1);
      }

      if (var1.field30225 > 0) {
         int var12 = var1.field30225 >= 600 ? -23296 : -3355444;
         method15840(var1.field30221, var5++, "Travelling: " + var1.field30225 + " ticks", var12, 0.02F);
      }
   }

   private static void method15838(String var0, Class8974 var1, int var2, int var3) {
      BlockPos var6 = var1.field40567;
      method15839(var0, var6, var2, var3);
   }

   private static void method15839(String var0, BlockPos var1, int var2, int var3) {
      double var6 = 1.3;
      double var8 = 0.2;
      double var10 = (double)var1.getX() + 0.5;
      double var12 = (double)var1.getY() + 1.3 + (double)var2 * 0.2;
      double var14 = (double)var1.getZ() + 0.5;
      DebugRenderer.method27462(var0, var10, var12, var14, var3, 0.02F, true, 0.0F, true);
   }

   private static void method15840(Class2955 var0, int var1, String var2, int var3, float var4) {
      double var7 = 2.4;
      double var9 = 0.25;
      BlockPos var11 = new BlockPos(var0);
      double var12 = (double)var11.getX() + 0.5;
      double var14 = var0.method11321() + 2.4 + (double)var1 * 0.25;
      double var16 = (double)var11.getZ() + 0.5;
      float var18 = 0.5F;
      DebugRenderer.method27462(var2, var12, var14, var16, var3, var4, false, 0.5F, true);
   }

   private Class9624 method15841() {
      return this.field23306.gameRenderer.getActiveRenderInfo();
   }

   private String method15842(Class6986 var1, BlockPos var2) {
      float var5 = MathHelper.method37766(var2.method8320(var1.field30221.method11320(), var1.field30221.method11321(), var1.field30221.method11322(), true));
      double var6 = (double)Math.round(var5 * 10.0F) / 10.0;
      return var2.method8323() + " (dist " + var6 + ")";
   }

   private boolean method15843(Class6986 var1) {
      return Objects.equals(this.field23309, var1.field30219);
   }

   private boolean method15844(Class6986 var1) {
      ClientPlayerEntity var4 = this.field23306.player;
      BlockPos var5 = new BlockPos(var4.getPosX(), var1.field30221.method11321(), var4.getPosZ());
      BlockPos var6 = new BlockPos(var1.field30221);
      return var5.method8316(var6, 30.0);
   }

   private Collection<UUID> method15845(BlockPos var1) {
      return this.field23308.values().stream().filter(var1x -> var1x.method21606(var1)).<UUID>map(Class6986::method21607).collect(Collectors.<UUID>toSet());
   }

   private Map<BlockPos, List<String>> method15846() {
      Map<BlockPos, List<String>> var3 = Maps.newHashMap();

      for (Class6986 var5 : this.field23308.values()) {
         if (var5.field30223 != null && !this.field23307.containsKey(var5.field30223)) {
            var3.computeIfAbsent(var5.field30223, var0 -> Lists.newArrayList()).add(var5.method21608());
         }
      }

      return var3;
   }

   private void method15847() {
      DebugRenderer.method27454(this.field23306.getRenderViewEntity(), 8).ifPresent(var1 -> this.field23309 = var1.getUniqueID());
   }
}
