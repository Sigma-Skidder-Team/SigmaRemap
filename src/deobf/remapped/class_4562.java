package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class class_4562 implements class_2995 {
   private final MinecraftClient field_22226;
   private final Map<BlockPos, class_6569> field_22223 = Maps.newHashMap();
   private final Map<UUID, class_1236> field_22222 = Maps.newHashMap();
   private UUID field_22224;

   public class_4562(MinecraftClient var1) {
      this.field_22226 = var1;
   }

   @Override
   public void method_13699() {
      this.field_22223.clear();
      this.field_22222.clear();
      this.field_22224 = null;
   }

   public void method_21160(class_6569 var1) {
      this.field_22223.put(var1.field_33507, var1);
   }

   public void method_21178(class_1236 var1) {
      this.field_22222.put(var1.field_6814, var1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      RenderSystem.method_16438();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16354();
      this.method_21179();
      this.method_21171();
      this.method_21180();
      RenderSystem.method_16432();
      RenderSystem.disableBlend();
      RenderSystem.method_16489();
      if (!this.field_22226.thePlayer.method_37221()) {
         this.method_21170();
      }
   }

   private void method_21171() {
      this.field_22222.entrySet().removeIf(var1 -> this.field_22226.theWorld.method_29534(var1.getValue().field_6815) == null);
   }

   private void method_21179() {
      long var3 = this.field_22226.theWorld.method_29546() - 20L;
      this.field_22223.entrySet().removeIf(var2 -> var2.getValue().field_33508 < var3);
   }

   private void method_21180() {
      BlockPos var3 = this.method_21176().method_41630();
      this.field_22222.values().forEach(var1 -> {
         if (this.method_21174(var1)) {
            this.method_21164(var1);
         }
      });
      this.method_21183();

      for (BlockPos var5 : this.field_22223.keySet()) {
         if (var3.method_12171(var5, 30.0)) {
            method_21161(var5);
         }
      }

      Map var6 = this.method_21175();
      this.field_22223.values().forEach(var3x -> {
         if (var3.method_12171(var3x.field_33507, 30.0)) {
            Set var6x = (Set)var6.get(var3x.field_33507);
            this.method_21172(var3x, (Collection<UUID>)(var6x != null ? var6x : Sets.newHashSet()));
         }
      });
      this.method_21166().forEach((var2, var3x) -> {
         if (var3.method_12171(var2, 30.0)) {
            this.method_21181(var2, (List<String>)var3x);
         }
      });
   }

   private Map<BlockPos, Set<UUID>> method_21175() {
      HashMap var3 = Maps.newHashMap();
      this.field_22222
         .values()
         .forEach(var1 -> var1.field_6822.forEach(var2 -> var3.computeIfAbsent(var2, var0xx -> Sets.newHashSet()).add(var1.method_5489())));
      return var3;
   }

   private void method_21183() {
      HashMap var3 = Maps.newHashMap();
      this.field_22222
         .values()
         .stream()
         .filter(class_1236::method_5487)
         .forEach(var1 -> var3.computeIfAbsent(var1.field_6816, var0x -> Sets.newHashSet()).add(var1.method_5489()));
      var3.entrySet().forEach(var0 -> {
         BlockPos var3x = (BlockPos)var0.getKey();
         Set var4 = (Set)var0.getValue();
         Set var5 = var4.stream().<String>map(class_4045::method_18611).collect(Collectors.toSet());
         int var6 = 1;
         method_21159(var5.toString(), var3x, var6++, -256);
         method_21159("Flower", var3x, var6++, -1);
         float var7 = 0.05F;
         method_21182(var3x, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private static String method_21165(Collection<UUID> var0) {
      if (!var0.isEmpty()) {
         return var0.size() <= 3 ? var0.stream().<String>map(class_4045::method_18611).collect(Collectors.toSet()).toString() : "" + var0.size() + " bees";
      } else {
         return "-";
      }
   }

   private static void method_21161(BlockPos var0) {
      float var3 = 0.05F;
      method_21182(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void method_21181(BlockPos var1, List<String> var2) {
      float var5 = 0.05F;
      method_21182(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      method_21159("" + var2, var1, 0, -256);
      method_21159("Ghost Hive", var1, 1, -65536);
   }

   private static void method_21182(BlockPos var0, float var1, float var2, float var3, float var4, float var5) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      class_3372.method_15560(var0, var1, var2, var3, var4, var5);
   }

   private void method_21172(class_6569 var1, Collection<UUID> var2) {
      int var5 = 0;
      if (!var2.isEmpty()) {
         method_21162("Blacklisted by " + method_21165(var2), var1, var5++, -65536);
      }

      method_21162("Out: " + method_21165(this.method_21168(var1.field_33507)), var1, var5++, -3355444);
      if (var1.field_33503 != 0) {
         if (var1.field_33503 != 1) {
            method_21162("In: " + var1.field_33503 + " bees", var1, var5++, -256);
         } else {
            method_21162("In: 1 bee", var1, var5++, -256);
         }
      } else {
         method_21162("In: -", var1, var5++, -256);
      }

      method_21162("Honey: " + var1.field_33505, var1, var5++, -23296);
      method_21162(var1.field_33509 + (!var1.field_33504 ? "" : " (sedated)"), var1, var5++, -1);
   }

   private void method_21169(class_1236 var1) {
      if (var1.field_6820 != null) {
         class_7539.method_34335(
            var1.field_6820,
            0.5F,
            false,
            false,
            this.method_21176().method_41627().method_61(),
            this.method_21176().method_41627().method_60(),
            this.method_21176().method_41627().method_62()
         );
      }
   }

   private void method_21164(class_1236 var1) {
      boolean var4 = this.method_21163(var1);
      int var5 = 0;
      method_21167(var1.field_6819, var5++, var1.toString(), -1, 0.03F);
      if (var1.field_6821 != null) {
         method_21167(var1.field_6819, var5++, "Hive: " + this.method_21173(var1, var1.field_6821), -256, 0.02F);
      } else {
         method_21167(var1.field_6819, var5++, "No hive", -98404, 0.02F);
      }

      if (var1.field_6816 != null) {
         method_21167(var1.field_6819, var5++, "Flower: " + this.method_21173(var1, var1.field_6816), -256, 0.02F);
      } else {
         method_21167(var1.field_6819, var5++, "No flower", -98404, 0.02F);
      }

      for (String var7 : var1.field_6817) {
         method_21167(var1.field_6819, var5++, var7, -16711936, 0.02F);
      }

      if (var4) {
         this.method_21169(var1);
      }

      if (var1.field_6823 > 0) {
         int var12 = var1.field_6823 >= 600 ? -23296 : -3355444;
         method_21167(var1.field_6819, var5++, "Travelling: " + var1.field_6823 + " ticks", var12, 0.02F);
      }
   }

   private static void method_21162(String var0, class_6569 var1, int var2, int var3) {
      BlockPos var6 = var1.field_33507;
      method_21159(var0, var6, var2, var3);
   }

   private static void method_21159(String var0, BlockPos var1, int var2, int var3) {
      double var6 = 1.3;
      double var8 = 0.2;
      double var10 = (double)var1.getX() + 0.5;
      double var12 = (double)var1.getY() + 1.3 + (double)var2 * 0.2;
      double var14 = (double)var1.getZ() + 0.5;
      class_3372.method_15555(var0, var10, var12, var14, var3, 0.02F, true, 0.0F, true);
   }

   private static void method_21167(class_66 var0, int var1, String var2, int var3, float var4) {
      double var7 = 2.4;
      double var9 = 0.25;
      BlockPos var11 = new BlockPos(var0);
      double var12 = (double)var11.getX() + 0.5;
      double var14 = var0.method_60() + 2.4 + (double)var1 * 0.25;
      double var16 = (double)var11.getZ() + 0.5;
      float var18 = 0.5F;
      class_3372.method_15555(var2, var12, var14, var16, var3, var4, false, 0.5F, true);
   }

   private Camera method_21176() {
      return this.field_22226.gameRenderer.method_35949();
   }

   private String method_21173(class_1236 var1, BlockPos var2) {
      float var5 = MathHelper.sqrt(var2.method_12178(var1.field_6819.method_61(), var1.field_6819.method_60(), var1.field_6819.method_62(), true));
      double var6 = (double)Math.round(var5 * 10.0F) / 10.0;
      return var2.method_12175() + " (dist " + var6 + ")";
   }

   private boolean method_21163(class_1236 var1) {
      return Objects.equals(this.field_22224, var1.field_6814);
   }

   private boolean method_21174(class_1236 var1) {
      ClientPlayerEntity var4 = this.field_22226.thePlayer;
      BlockPos var5 = new BlockPos(var4.getPosX(), var1.field_6819.method_60(), var4.getPosZ());
      BlockPos var6 = new BlockPos(var1.field_6819);
      return var5.method_12171(var6, 30.0);
   }

   private Collection<UUID> method_21168(BlockPos var1) {
      return this.field_22222.values().stream().filter(var1x -> var1x.method_5488(var1)).<UUID>map(class_1236::method_5489).collect(Collectors.<UUID>toSet());
   }

   private Map<BlockPos, List<String>> method_21166() {
      HashMap var3 = Maps.newHashMap();

      for (class_1236 var5 : this.field_22222.values()) {
         if (var5.field_6821 != null && !this.field_22223.containsKey(var5.field_6821)) {
            var3.computeIfAbsent(var5.field_6821, var0 -> Lists.newArrayList()).add(var5.method_5486());
         }
      }

      return var3;
   }

   private void method_21170() {
      class_3372.method_15558(this.field_22226.getRenderViewEntity(), 8).ifPresent(var1 -> this.field_22224 = var1.method_37328());
   }
}
