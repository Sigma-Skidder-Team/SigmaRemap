package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2973 implements class_2995 {
   private static final Logger field_14616 = LogManager.getLogger();
   private final MinecraftClient field_14620;
   private final Map<BlockPos, class_7942> field_14615 = Maps.newHashMap();
   private final Map<UUID, class_6388> field_14617 = Maps.newHashMap();
   private UUID field_14619;

   public class_2973(MinecraftClient var1) {
      this.field_14620 = var1;
   }

   @Override
   public void method_13699() {
      this.field_14615.clear();
      this.field_14617.clear();
      this.field_14619 = null;
   }

   public void method_13604(class_7942 var1) {
      this.field_14615.put(var1.field_40651, var1);
   }

   public void method_13613(BlockPos var1) {
      this.field_14615.remove(var1);
   }

   public void method_13591(BlockPos var1, int var2) {
      class_7942 var5 = this.field_14615.get(var1);
      if (var5 != null) {
         var5.field_40650 = var2;
      } else {
         field_14616.warn("Strange, setFreeTicketCount was called for an unknown POI: " + var1);
      }
   }

   public void method_13607(class_6388 var1) {
      this.field_14617.put(var1.field_32624, var1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      RenderSystem.method_16438();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16354();
      this.method_13605();
      this.method_13595(var3, var5, var7);
      RenderSystem.method_16432();
      RenderSystem.disableBlend();
      RenderSystem.method_16489();
      if (!this.field_14620.thePlayer.method_37221()) {
         this.method_13608();
      }
   }

   private void method_13605() {
      this.field_14617.entrySet().removeIf(var1 -> {
         Entity var4 = this.field_14620.theWorld.method_29534(var1.getValue().field_32622);
         return var4 == null || var4.field_41751;
      });
   }

   private void method_13595(double var1, double var3, double var5) {
      BlockPos var9 = new BlockPos(var1, var3, var5);
      this.field_14617.values().forEach(var7 -> {
         if (this.method_13612(var7)) {
            this.method_13596(var7, var1, var3, var5);
         }
      });

      for (BlockPos var11 : this.field_14615.keySet()) {
         if (var9.method_12171(var11, 30.0)) {
            method_13610(var11);
         }
      }

      this.field_14615.values().forEach(var2 -> {
         if (var9.method_12171(var2.field_40651, 30.0)) {
            this.method_13598(var2);
         }
      });
      this.method_13597().forEach((var2, var3x) -> {
         if (var9.method_12171(var2, 30.0)) {
            this.method_13603(var2, (List<String>)var3x);
         }
      });
   }

   private static void method_13610(BlockPos var0) {
      float var3 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      class_3372.method_15560(var0, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void method_13603(BlockPos var1, List<String> var2) {
      float var5 = 0.05F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      class_3372.method_15560(var1, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      method_13606("" + var2, var1, 0, -256);
      method_13606("Ghost POI", var1, 1, -65536);
   }

   private void method_13598(class_7942 var1) {
      int var4 = 0;
      Set var5 = this.method_13592(var1);
      if (var5.size() >= 4) {
         method_13601("" + var5.size() + " ticket holders", var1, var4, -256);
      } else {
         method_13601("Owners: " + var5, var1, var4, -256);
      }

      var4++;
      Set var6 = this.method_13611(var1);
      if (var6.size() >= 4) {
         method_13601("" + var6.size() + " potential owners", var1, var4, -23296);
      } else {
         method_13601("Candidates: " + var6, var1, var4, -23296);
      }

      method_13601("Free tickets: " + var1.field_40650, var1, ++var4, -256);
      method_13601(var1.field_40652, var1, ++var4, -1);
   }

   private void method_13609(class_6388 var1, double var2, double var4, double var6) {
      if (var1.field_32613 != null) {
         class_7539.method_34335(var1.field_32613, 0.5F, false, false, var2, var4, var6);
      }
   }

   private void method_13596(class_6388 var1, double var2, double var4, double var6) {
      boolean var10 = this.method_13602(var1);
      int var11 = 0;
      method_13599(var1.field_32616, var11, var1.field_32620, -1, 0.03F);
      var11++;
      if (var10) {
         method_13599(var1.field_32616, var11, var1.field_32617 + " " + var1.field_32627 + " xp", -1, 0.02F);
         var11++;
      }

      if (var10) {
         int var12 = !(var1.field_32621 < var1.field_32618) ? -1 : -23296;
         method_13599(
            var1.field_32616, var11, "health: " + String.format("%.1f", var1.field_32621) + " / " + String.format("%.1f", var1.field_32618), var12, 0.02F
         );
         var11++;
      }

      if (var10 && !var1.field_32615.equals("")) {
         method_13599(var1.field_32616, var11, var1.field_32615, -98404, 0.02F);
         var11++;
      }

      if (var10) {
         for (String var13 : var1.field_32628) {
            method_13599(var1.field_32616, var11, var13, -16711681, 0.02F);
            var11++;
         }
      }

      if (var10) {
         for (String var19 : var1.field_32614) {
            method_13599(var1.field_32616, var11, var19, -16711936, 0.02F);
            var11++;
         }
      }

      if (var1.field_32619) {
         method_13599(var1.field_32616, var11, "Wants Golem", -23296, 0.02F);
         var11++;
      }

      if (var10) {
         for (String var20 : var1.field_32626) {
            if (!var20.startsWith(var1.field_32620)) {
               method_13599(var1.field_32616, var11, var20, -23296, 0.02F);
            } else {
               method_13599(var1.field_32616, var11, var20, -1, 0.02F);
            }

            var11++;
         }
      }

      if (var10) {
         for (String var21 : Lists.reverse(var1.field_32611)) {
            method_13599(var1.field_32616, var11, var21, -3355444, 0.02F);
            var11++;
         }
      }

      if (var10) {
         this.method_13609(var1, var2, var4, var6);
      }
   }

   private static void method_13601(String var0, class_7942 var1, int var2, int var3) {
      BlockPos var6 = var1.field_40651;
      method_13606(var0, var6, var2, var3);
   }

   private static void method_13606(String var0, BlockPos var1, int var2, int var3) {
      double var6 = 1.3;
      double var8 = 0.2;
      double var10 = (double)var1.getX() + 0.5;
      double var12 = (double)var1.method_12165() + 1.3 + (double)var2 * 0.2;
      double var14 = (double)var1.method_12185() + 0.5;
      class_3372.method_15555(var0, var10, var12, var14, var3, 0.02F, true, 0.0F, true);
   }

   private static void method_13599(class_66 var0, int var1, String var2, int var3, float var4) {
      double var7 = 2.4;
      double var9 = 0.25;
      BlockPos var11 = new BlockPos(var0);
      double var12 = (double)var11.getX() + 0.5;
      double var14 = var0.method_60() + 2.4 + (double)var1 * 0.25;
      double var16 = (double)var11.method_12185() + 0.5;
      float var18 = 0.5F;
      class_3372.method_15555(var2, var12, var14, var16, var3, var4, false, 0.5F, true);
   }

   private Set<String> method_13592(class_7942 var1) {
      return this.method_13593(var1.field_40651).stream().<String>map(class_4045::method_18611).collect(Collectors.<String>toSet());
   }

   private Set<String> method_13611(class_7942 var1) {
      return this.method_13594(var1.field_40651).stream().<String>map(class_4045::method_18611).collect(Collectors.<String>toSet());
   }

   private boolean method_13602(class_6388 var1) {
      return Objects.equals(this.field_14619, var1.field_32624);
   }

   private boolean method_13612(class_6388 var1) {
      ClientPlayerEntity var4 = this.field_14620.thePlayer;
      BlockPos var5 = new BlockPos(var4.getPosX(), var1.field_32616.method_60(), var4.getPosZ());
      BlockPos var6 = new BlockPos(var1.field_32616);
      return var5.method_12171(var6, 30.0);
   }

   private Collection<UUID> method_13593(BlockPos var1) {
      return this.field_14617
         .values()
         .stream()
         .filter(var1x -> class_6388.method_29179(var1x, var1))
         .<UUID>map(class_6388::method_29183)
         .collect(Collectors.<UUID>toSet());
   }

   private Collection<UUID> method_13594(BlockPos var1) {
      return this.field_14617
         .values()
         .stream()
         .filter(var1x -> class_6388.method_29180(var1x, var1))
         .<UUID>map(class_6388::method_29183)
         .collect(Collectors.<UUID>toSet());
   }

   private Map<BlockPos, List<String>> method_13597() {
      HashMap var3 = Maps.newHashMap();

      for (class_6388 var5 : this.field_14617.values()) {
         for (BlockPos var7 : Iterables.concat(var5.field_32612, var5.field_32623)) {
            if (!this.field_14615.containsKey(var7)) {
               var3.computeIfAbsent(var7, var0 -> Lists.newArrayList()).add(var5.field_32620);
            }
         }
      }

      return var3;
   }

   private void method_13608() {
      class_3372.method_15558(this.field_14620.getRenderViewEntity(), 8).ifPresent(var1 -> this.field_14619 = var1.method_37328());
   }
}
