package remapped;

import com.google.common.base.Charsets;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_9326 implements class_2231 {
   private static final List<class_7154> field_47626 = ImmutableList.of(
      class_7154.field_36845, class_7154.field_36843, class_7154.field_36846, class_7154.field_36847, class_7154.field_36844
   );
   public ClientWorld field_47617;
   private final Map<class_7154, Queue<class_9733>> field_47619 = Maps.newIdentityHashMap();
   private final Queue<class_3705> field_47621 = Queues.newArrayDeque();
   private final TextureManager field_47623;
   private final Random field_47620 = new Random();
   private final Map<Identifier, class_5256<?>> field_47624 = new HashMap<Identifier, class_5256<?>>();
   private final Queue<class_9733> field_47625 = Queues.newArrayDeque();
   private final Map<Identifier, class_9838> field_47622 = Maps.newHashMap();
   private final class_8359 field_47616 = new class_8359(class_8359.field_42805);

   public class_9326(ClientWorld var1, TextureManager var2) {
      var2.method_35682(this.field_47616.method_38519(), this.field_47616);
      this.field_47617 = var1;
      this.field_47623 = var2;
      this.method_43061();
   }

   private void method_43061() {
      this.method_43056(class_3090.field_15364, class_2494::new);
      this.method_43056(class_3090.field_15352, class_3810::new);
      this.method_43055(class_3090.field_15327, new class_8429());
      this.method_43055(class_3090.field_15325, new class_6058());
      this.method_43056(class_3090.field_15340, class_9857::new);
      this.method_43056(class_3090.field_15382, class_7931::new);
      this.method_43056(class_3090.field_15347, class_2232::new);
      this.method_43056(class_3090.field_15333, class_6672::new);
      this.method_43056(class_3090.field_15320, class_3898::new);
      this.method_43056(class_3090.field_15385, class_3306::new);
      this.method_43056(class_3090.field_15384, class_5323::new);
      this.method_43056(class_3090.field_15322, class_2224::new);
      this.method_43056(class_3090.field_15363, class_3843::new);
      this.method_43056(class_3090.field_15323, class_4193::new);
      this.method_43056(class_3090.field_15315, class_2867::new);
      this.method_43056(class_3090.field_15378, class_3984::new);
      this.method_43056(class_3090.field_15336, class_5929::new);
      this.method_43056(class_3090.field_15359, class_5510::new);
      this.method_43056(class_3090.field_15331, class_3328::new);
      this.method_43056(class_3090.field_15358, class_715::new);
      this.method_43056(class_3090.field_15329, class_2375::new);
      this.method_43056(class_3090.field_15317, class_6925::new);
      this.method_43056(class_3090.field_15338, class_6904::new);
      this.method_43055(class_3090.field_15335, new class_7700());
      this.method_43056(class_3090.field_15360, class_5373::new);
      this.method_43056(class_3090.field_15354, class_5413::new);
      this.method_43056(class_3090.field_15332, class_4796::new);
      this.method_43056(class_3090.field_15353, class_390::new);
      this.method_43055(class_3090.field_15377, new class_5751());
      this.method_43056(class_3090.field_15339, class_5860::new);
      this.method_43056(class_3090.field_15371, class_6721::new);
      this.method_43056(class_3090.field_15366, class_8520::new);
      this.method_43056(class_3090.field_15341, class_5682::new);
      this.method_43056(class_3090.field_15321, class_2852::new);
      this.method_43056(class_3090.field_15380, class_4826::new);
      this.method_43056(class_3090.field_15365, class_2852::new);
      this.method_43056(class_3090.field_15345, class_9011::new);
      this.method_43056(class_3090.field_15361, class_7435::new);
      this.method_43056(class_3090.field_15348, class_6183::new);
      this.method_43056(class_3090.field_15324, class_2333::new);
      this.method_43055(class_3090.field_15351, new class_2836());
      this.method_43055(class_3090.field_15313, new class_7800());
      this.method_43055(class_3090.field_15370, new class_6144());
      this.method_43056(class_3090.field_15319, class_2396::new);
      this.method_43056(class_3090.field_15372, class_8110::new);
      this.method_43056(class_3090.field_15328, class_9312::new);
      this.method_43056(class_3090.field_15357, class_8885::new);
      this.method_43056(class_3090.field_15374, class_1021::new);
      this.method_43056(class_3090.field_15343, class_3667::new);
      this.method_43056(class_3090.field_15356, class_905::new);
      this.method_43056(class_3090.field_15386, class_7681::new);
      this.method_43056(class_3090.field_15376, class_8349::new);
      this.method_43056(class_3090.field_15326, class_5581::new);
      this.method_43056(class_3090.field_15383, class_3135::new);
      this.method_43056(class_3090.field_15362, class_9130::new);
      this.method_43056(class_3090.field_15334, class_79::new);
      this.method_43056(class_3090.field_15368, class_4700::new);
      this.method_43056(class_3090.field_15350, class_3866::new);
      this.method_43056(class_3090.field_15346, class_9537::new);
      this.method_43056(class_3090.field_15342, class_5159::new);
      this.method_43056(class_3090.field_15316, class_1894::new);
      this.method_43056(class_3090.field_15337, class_1848::new);
      this.method_43056(class_3090.field_15349, class_284::new);
      this.method_43056(class_3090.field_15344, class_346::new);
      this.method_43056(class_3090.field_15375, class_7815::new);
      this.method_43056(class_3090.field_15367, class_8967::new);
      this.method_43056(class_3090.field_15379, class_2861::new);
      this.method_43056(class_3090.field_15369, class_7697::new);
      this.method_43056(class_3090.field_15330, class_820::new);
      this.method_43056(class_3090.field_15314, class_1797::new);
      this.method_43056(class_3090.field_15381, class_2226::new);
      this.method_43056(class_3090.field_15373, class_8152::new);
   }

   private <T extends class_5079> void method_43055(class_8583<T> var1, class_5256<T> var2) {
      this.field_47624.put(class_8669.field_44387.method_39797(var1), var2);
   }

   private <T extends class_5079> void method_43056(class_8583<T> var1, class_7074<T> var2) {
      class_9838 var5 = new class_9838(this, null);
      this.field_47622.put(class_8669.field_44387.method_39797(var1), var5);
      this.field_47624.put(class_8669.field_44387.method_39797(var1), var2.method_32573(var5));
   }

   @Override
   public CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      ConcurrentMap var9 = Maps.newConcurrentMap();
      CompletableFuture[] var10 = class_8669.field_44387
         .method_39805()
         .stream()
         .<CompletableFuture<Void>>map(var4x -> CompletableFuture.runAsync(() -> this.method_43047(var2, var4x, var9), var5))
         .<CompletableFuture>toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf(var10)
         .<class_3930>thenApplyAsync(var4x -> {
            var3.method_16059();
            var3.startSection("stitching");
            class_3930 var7 = this.field_47616.method_38516(var2, var9.values().stream().<Identifier>flatMap(Collection::stream), var3, 0);
            var3.endSection();
            var3.method_16052();
            return var7;
         }, var5)
         .<class_3930>thenCompose(var1::method_31587)
         .thenAcceptAsync(
            var3x -> {
               this.field_47619.clear();
               var4.method_16059();
               var4.startSection("upload");
               this.field_47616.method_38520(var3x);
               var4.method_16050("bindSpriteSets");
               class_5155 var6x = this.field_47616.method_38528(class_2008.method_9327());
               var9.forEach(
                  (var2xx, var3xx) -> {
                     ImmutableList var6xx = !var3xx.isEmpty()
                        ? var3xx.stream().<class_5155>map(this.field_47616::method_38528).collect(ImmutableList.toImmutableList())
                        : ImmutableList.of(var6x);
                     this.field_47622.get(var2xx).method_45331(var6xx);
                  }
               );
               var4.endSection();
               var4.method_16052();
            },
            var6
         );
   }

   public void method_43060() {
      this.field_47616.method_38518();
   }

   private void method_43047(class_7832 var1, Identifier var2, Map<Identifier, List<Identifier>> var3) {
      Identifier var6 = new Identifier(var2.method_21461(), "particles/" + var2.method_21456() + ".json");

      try (
         class_4038 var7 = var1.method_35458(var6);
         InputStreamReader var9 = new InputStreamReader(var7.method_18576(), Charsets.UTF_8);
      ) {
         class_4963 var11 = class_4963.method_22720(class_6539.method_29805(var9));
         List var12 = var11.method_22719();
         boolean var13 = this.field_47622.containsKey(var2);
         if (var12 == null) {
            if (var13) {
               throw new IllegalStateException("Missing texture list for particle " + var2);
            }
         } else {
            if (!var13) {
               throw new IllegalStateException("Redundant texture list for particle " + var2);
            }

            var3.put(
               var2,
               var12.stream().<Identifier>map(var0 -> new Identifier(var0.method_21461(), "particle/" + var0.method_21456())).collect(Collectors.toList())
            );
         }
      } catch (IOException var41) {
         throw new IllegalStateException("Failed to load description for particle " + var2, var41);
      }
   }

   public void method_43051(Entity var1, class_5079 var2) {
      this.field_47621.add(new class_3705(this.field_47617, var1, var2));
   }

   public void method_43042(Entity var1, class_5079 var2, int var3) {
      this.field_47621.add(new class_3705(this.field_47617, var1, var2, var3));
   }

   @Nullable
   public class_9733 method_43062(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      class_9733 var16 = this.method_43049(var1, var2, var4, var6, var8, var10, var12);
      if (var16 == null) {
         return null;
      } else {
         this.method_43044(var16);
         return var16;
      }
   }

   @Nullable
   private <T extends class_5079> class_9733 method_43049(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      class_5256 var16 = this.field_47624.get(class_8669.field_44387.method_39797(var1.method_23357()));
      return var16 != null ? var16.method_24021(var1, this.field_47617, var2, var4, var6, var8, var10, var12) : null;
   }

   public void method_43044(class_9733 var1) {
      if (var1 != null && (!(var1 instanceof class_5820) || Config.method_14429())) {
         this.field_47625.add(var1);
      }
   }

   public void method_43057() {
      this.field_47619.forEach((var1, var2) -> {
         this.field_47617.method_29599().startSection(var1.toString());
         this.method_43043(var2);
         this.field_47617.method_29599().endSection();
      });
      if (!this.field_47621.isEmpty()) {
         ArrayList var3 = Lists.newArrayList();

         for (class_3705 var5 : this.field_47621) {
            var5.method_44949();
            if (!var5.method_44946()) {
               var3.add(var5);
            }
         }

         this.field_47621.removeAll(var3);
      }

      class_9733 var6;
      if (!this.field_47625.isEmpty()) {
         while ((var6 = this.field_47625.poll()) != null) {
            Queue var7 = this.field_47619.computeIfAbsent(var6.method_44957(), var0 -> EvictingQueue.create(16384));
            if (!(var6 instanceof class_3752) || !this.method_43050(var6, var7)) {
               var7.add(var6);
            }
         }
      }
   }

   private void method_43043(Collection<class_9733> var1) {
      if (!var1.isEmpty()) {
         long var4 = System.currentTimeMillis();
         int var6 = var1.size();
         Iterator var7 = var1.iterator();

         while (var7.hasNext()) {
            class_9733 var8 = (class_9733)var7.next();
            this.method_43052(var8);
            if (!var8.method_44946()) {
               var7.remove();
            }

            var6--;
            if (System.currentTimeMillis() > var4 + 20L) {
               break;
            }
         }

         if (var6 > 0) {
            int var11 = var6;

            for (Iterator var9 = var1.iterator(); var9.hasNext() && var11 > 0; var11--) {
               class_9733 var10 = (class_9733)var9.next();
               var10.method_44948();
               var9.remove();
            }
         }
      }
   }

   private void method_43052(class_9733 var1) {
      try {
         var1.method_44949();
      } catch (Throwable var7) {
         class_159 var5 = class_159.method_643(var7, "Ticking Particle");
         class_6544 var6 = var5.method_639("Particle being ticked");
         var6.method_29851("Particle", var1::toString);
         var6.method_29851("Particle Type", var1.method_44957()::toString);
         throw new class_3297(var5);
      }
   }

   public void method_43045(class_7966 var1, class_3758 var2, class_5778 var3, Camera var4, float var5) {
      this.method_43046(var1, var2, var3, var4, var5, (class_2359)null);
   }

   public void method_43046(class_7966 var1, class_3758 var2, class_5778 var3, Camera var4, float var5, class_2359 var6) {
      var3.method_26126();
      Runnable var9 = () -> {
         RenderSystem.enableAlphaTest();
         RenderSystem.method_16433();
         RenderSystem.enableDepthTest();
         RenderSystem.enableFog();
         if (class_7860.field_40161.method_45472()) {
            RenderSystem.method_16492(33986);
            RenderSystem.method_16432();
            RenderSystem.method_16492(33984);
         }
      };
      class_4774 var10 = var4.method_41626();
      boolean var11 = var10.method_22007(class_6503.field_33094);
      RenderSystem.method_16438();
      RenderSystem.multMatrix(var1.method_36058().method_28620());
      Object var12 = field_47626;
      if (class_7860.field_40161.method_45472()) {
         var12 = this.field_47619.keySet();
      }

      for (class_7154 var14 : var12) {
         if (var14 != class_7154.field_36842) {
            var9.run();
            Iterable var15 = this.field_47619.get(var14);
            if (var15 != null) {
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               class_8042 var16 = class_8042.method_36499();
               class_9633 var17 = var16.method_36501();
               var14.method_32845(var17, this.field_47623);

               for (class_9733 var19 : var15) {
                  if (var6 == null || !var19.method_44959() || var6.method_10824(var19.method_44945())) {
                     try {
                        if (var11 || !(var19 instanceof class_6019) || var19.field_49481 != 0.0 || var19.field_49486 != 0.0 || var19.field_49471 != 0.0) {
                           var19.method_44951(var17, var4, var5);
                        }
                     } catch (Throwable var23) {
                        class_159 var21 = class_159.method_643(var23, "Rendering Particle");
                        class_6544 var22 = var21.method_639("Particle being rendered");
                        var22.method_29851("Particle", var19::toString);
                        var22.method_29851("Particle Type", var14::toString);
                        throw new class_3297(var21);
                     }
                  }
               }

               var14.method_32846(var16);
            }
         }
      }

      RenderSystem.method_16489();
      RenderSystem.method_16387(true);
      RenderSystem.method_16457(515);
      RenderSystem.disableBlend();
      RenderSystem.method_16433();
      var3.method_26122();
      RenderSystem.disableFog();
      RenderSystem.enableDepthTest();
   }

   public void method_43041(ClientWorld var1) {
      this.field_47617 = var1;
      this.field_47619.clear();
      this.field_47621.clear();
   }

   public void method_43048(BlockPos var1, class_2522 var2) {
      boolean var6;
      if (class_7860.field_40197.method_3596() && class_7860.field_39999.method_3596()) {
         class_6414 var5 = var2.method_8360();
         var6 = !class_7860.method_35565(var2, class_7860.field_39999, this.field_47617, var1)
            && !class_7860.method_35565(var2, class_7860.field_40197, this.field_47617, var1, this);
      } else {
         var6 = !var2.method_8345();
      }

      if (var6) {
         class_4190 var9 = var2.method_8334(this.field_47617, var1);
         double var7 = 0.25;
         var9.method_19500(
            (var3, var5x, var7x, var9x, var11, var13) -> {
               double var17 = Math.min(1.0, var9x - var3);
               double var19 = Math.min(1.0, var11 - var5x);
               double var21 = Math.min(1.0, var13 - var7x);
               int var23 = Math.max(2, MathHelper.ceil(var17 / 0.25));
               int var24 = Math.max(2, MathHelper.ceil(var19 / 0.25));
               int var25 = Math.max(2, MathHelper.ceil(var21 / 0.25));

               for (int var26 = 0; var26 < var23; var26++) {
                  for (int var27 = 0; var27 < var24; var27++) {
                     for (int var28 = 0; var28 < var25; var28++) {
                        double var29 = ((double)var26 + 0.5) / (double)var23;
                        double var31 = ((double)var27 + 0.5) / (double)var24;
                        double var33 = ((double)var28 + 0.5) / (double)var25;
                        double var35 = var29 * var17 + var3;
                        double var37 = var31 * var19 + var5x;
                        double var39 = var33 * var21 + var7x;
                        this.method_43044(
                           new class_4919(
                                 this.field_47617,
                                 (double)var1.getX() + var35,
                                 (double)var1.getY() + var37,
                                 (double)var1.getZ() + var39,
                                 var29 - 0.5,
                                 var31 - 0.5,
                                 var33 - 0.5,
                                 var2
                              )
                              .method_22530(var1)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void method_43058(BlockPos var1, Direction var2) {
      class_2522 var5 = this.field_47617.method_28262(var1);
      if (var5.method_8352() != class_7537.field_38470) {
         int var6 = var1.getX();
         int var7 = var1.getY();
         int var8 = var1.getZ();
         float var9 = 0.1F;
         Box var10 = var5.method_8334(this.field_47617, var1).method_19483();
         double var11 = (double)var6 + this.field_47620.nextDouble() * (var10.field_19940 - var10.field_19941 - 0.2F) + 0.1F + var10.field_19941;
         double var13 = (double)var7 + this.field_47620.nextDouble() * (var10.field_19939 - var10.field_19937 - 0.2F) + 0.1F + var10.field_19937;
         double var15 = (double)var8 + this.field_47620.nextDouble() * (var10.field_19942 - var10.field_19938 - 0.2F) + 0.1F + var10.field_19938;
         if (var2 == Direction.field_802) {
            var13 = (double)var7 + var10.field_19937 - 0.1F;
         }

         if (var2 == Direction.field_817) {
            var13 = (double)var7 + var10.field_19939 + 0.1F;
         }

         if (var2 == Direction.field_818) {
            var15 = (double)var8 + var10.field_19938 - 0.1F;
         }

         if (var2 == Direction.field_800) {
            var15 = (double)var8 + var10.field_19942 + 0.1F;
         }

         if (var2 == Direction.field_809) {
            var11 = (double)var6 + var10.field_19941 - 0.1F;
         }

         if (var2 == Direction.field_804) {
            var11 = (double)var6 + var10.field_19940 + 0.1F;
         }

         this.method_43044(new class_4919(this.field_47617, var11, var13, var15, 0.0, 0.0, 0.0, var5).method_22530(var1).method_44963(0.2F).method_44947(0.6F));
      }
   }

   public String method_43053() {
      return String.valueOf(this.field_47619.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean method_43050(class_9733 var1, Queue<class_9733> var2) {
      for (class_9733 var6 : var2) {
         if (var6 instanceof class_3752 && var1.field_49459 == var6.field_49459 && var1.field_49480 == var6.field_49480 && var1.field_49479 == var6.field_49479
            )
          {
            var6.field_49475 = 0;
            return true;
         }
      }

      return false;
   }

   public void method_43059(BlockPos var1, class_9529 var2) {
      class_2522 var5 = this.field_47617.method_28262(var1);
      if (var5 != null) {
         boolean var6 = class_7860.method_35565(var5, class_7860.field_39850, this.field_47617, var2, this);
         if (!var6) {
            Direction var7 = var2.method_43956();
            this.method_43058(var1, var7);
         }
      }
   }
}
