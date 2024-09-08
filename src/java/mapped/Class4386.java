package mapped;

import com.google.common.collect.*;
import net.minecraft.client.GameSettings;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class Class4386 {
   private static final Marker field21400 = MarkerManager.getMarker("SOUNDS");
   private static final Logger field21401 = LogManager.getLogger();
   private static final Set<ResourceLocation> field21402 = Sets.newHashSet();
   private final SoundHandler field21403;
   private final GameSettings field21404;
   private boolean field21405;
   private final Class7993 field21406 = new Class7993();
   private final Class9675 field21407 = this.field21406.method27287();
   private final Class6672 field21408;
   private final Class319 field21409 = new Class319();
   private final Class9818 field21410 = new Class9818(this.field21406, this.field21409);
   private int field21411;
   private final Map<Class6340, Class9617> field21412 = Maps.newHashMap();
   private final Multimap<Class2266, Class6340> field21413 = HashMultimap.create();
   private final List<Class6341> field21414 = Lists.newArrayList();
   private final Map<Class6340, Integer> field21415 = Maps.newHashMap();
   private final Map<Class6340, Integer> field21416 = Maps.newHashMap();
   private final List<Class1270> field21417 = Lists.newArrayList();
   private final List<Class6341> field21418 = Lists.newArrayList();
   private final List<Class6647> field21419 = Lists.newArrayList();

   public Class4386(SoundHandler var1, GameSettings var2, IResourceManager var3) {
      this.field21403 = var1;
      this.field21404 = var2;
      this.field21408 = new Class6672(var3);
   }

   public void method13755() {
      field21402.clear();

      for (SoundEvent var4 : Registry.field16069) {
         ResourceLocation var5 = var4.method36383();
         if (this.field21403.method997(var5) == null) {
            field21401.warn("Missing sound for event: {}", Registry.field16069.getKey(var4));
            field21402.add(var5);
         }
      }

      this.method13759();
      this.method13756();
   }

   private synchronized void method13756() {
      if (!this.field21405) {
         try {
            this.field21406.method27283();
            this.field21407.method37750();
            this.field21407.method37748(this.field21404.method37147(Class2266.field14728));
            this.field21408.method20336(this.field21419).thenRun(this.field21419::clear);
            this.field21405 = true;
            field21401.info(field21400, "Sound engine started");
         } catch (RuntimeException var4) {
            field21401.error(field21400, "Error starting SoundSystem. Turning off sounds & music", var4);
         }
      }
   }

   private float method13757(Class2266 var1) {
      return var1 != null && var1 != Class2266.field14728 ? this.field21404.method37147(var1) : 1.0F;
   }

   public void method13758(Class2266 var1, float var2) {
      if (this.field21405) {
         if (var1 != Class2266.field14728) {
            this.field21412.forEach((var1x, var2x) -> {
               float var5 = this.method13774(var1x);
               var2x.method37438(var1xx -> {
                  if (!(var5 <= 0.0F)) {
                     var1xx.method30123(var5);
                  } else {
                     var1xx.method30118();
                  }
               });
            });
         } else {
            this.field21407.method37748(var2);
         }
      }
   }

   public void method13759() {
      if (this.field21405) {
         this.method13761();
         this.field21408.method20335();
         this.field21406.method27286();
         this.field21405 = false;
      }
   }

   public void method13760(Class6340 var1) {
      if (this.field21405) {
         Class9617 var4 = this.field21412.get(var1);
         if (var4 != null) {
            var4.method37438(Class8506::method30118);
         }
      }
   }

   public void method13761() {
      if (this.field21405) {
         this.field21409.method1644();
         this.field21412.values().forEach(var0 -> var0.method37438(Class8506::method30118));
         this.field21412.clear();
         this.field21410.method38756();
         this.field21415.clear();
         this.field21414.clear();
         this.field21413.clear();
         this.field21416.clear();
         this.field21418.clear();
      }
   }

   public void method13762(Class1270 var1) {
      this.field21417.add(var1);
   }

   public void method13763(Class1270 var1) {
      this.field21417.remove(var1);
   }

   public void method13764(boolean var1) {
      if (!var1) {
         this.method13765();
      }

      this.field21410.method38755();
   }

   private void method13765() {
      this.field21411++;
      this.field21418.stream().filter(Class6340::method19268).forEach(this::method13770);
      this.field21418.clear();

      for (Class6341 var4 : this.field21414) {
         if (!var4.method19268()) {
            this.method13760(var4);
         }

         var4.method19269();
         if (var4.method19270()) {
            this.method13760(var4);
         } else {
            float var5 = this.method13774(var4);
            float var6 = this.method13773(var4);
            Vector3d var7 = new Vector3d(var4.method19287(), var4.method19288(), var4.method19289());
            Class9617 var8 = this.field21412.get(var4);
            if (var8 != null) {
               var8.method37438(var3 -> {
                  var3.method30123(var5);
                  var3.method30121(var6);
                  var3.method30120(var7);
               });
            }
         }
      }

      Iterator var11 = this.field21412.entrySet().iterator();

      while (var11.hasNext()) {
         Entry var12 = (Entry)var11.next();
         Class9617 var14 = (Class9617)var12.getValue();
         Class6340 var16 = (Class6340)var12.getKey();
         float var18 = this.field21404.method37147(var16.method19282());
         if (var18 <= 0.0F) {
            var14.method37438(Class8506::method30118);
            var11.remove();
         } else if (var14.method37437()) {
            int var19 = this.field21416.get(var16);
            if (var19 <= this.field21411) {
               if (method13767(var16)) {
                  this.field21415.put(var16, this.field21411 + var16.method19284());
               }

               var11.remove();
               field21401.debug(field21400, "Removed channel {} because it's not playing anymore", var14);
               this.field21416.remove(var16);

               try {
                  this.field21413.remove(var16.method19282(), var16);
               } catch (RuntimeException var10) {
               }

               if (var16 instanceof Class6341) {
                  this.field21414.remove(var16);
               }
            }
         }
      }

      Iterator var13 = this.field21415.entrySet().iterator();

      while (var13.hasNext()) {
         Entry var15 = (Entry)var13.next();
         if (this.field21411 >= (Integer)var15.getValue()) {
            Class6340 var17 = (Class6340)var15.getKey();
            if (var17 instanceof Class6341) {
               ((Class6341)var17).method19269();
            }

            this.method13770(var17);
            var13.remove();
         }
      }
   }

   private static boolean method13766(Class6340 var0) {
      return var0.method19284() > 0;
   }

   private static boolean method13767(Class6340 var0) {
      return var0.method19283() && method13766(var0);
   }

   private static boolean method13768(Class6340 var0) {
      return var0.method19283() && !method13766(var0);
   }

   public boolean method13769(Class6340 var1) {
      if (!this.field21405) {
         return false;
      } else {
         return this.field21416.containsKey(var1) && this.field21416.get(var1) <= this.field21411 ? true : this.field21412.containsKey(var1);
      }
   }

   public void method13770(Class6340 var1) {
      if (this.field21405 && var1.method19268()) {
         Class6648 var4 = var1.method19280(this.field21403);
         ResourceLocation var5 = var1.method19279();
         if (var4 != null) {
            Class6647 var6 = var1.method19281();
            if (var6 != SoundHandler.field1051) {
               float var7 = var1.method19285();
               float var8 = Math.max(var7, 1.0F) * (float)var6.method20298();
               Class2266 var9 = var1.method19282();
               float var10 = this.method13774(var1);
               float var11 = this.method13773(var1);
               Class2279 var12 = var1.method19290();
               boolean var13 = var1.method19291();
               if (var10 == 0.0F && !var1.method19274()) {
                  field21401.debug(field21400, "Skipped playing sound {}, volume was zero.", var6.method20291());
               } else {
                  Vector3d var14 = new Vector3d(var1.method19287(), var1.method19288(), var1.method19289());
                  if (!this.field21417.isEmpty()) {
                     boolean var15 = var13 || var12 == Class2279.field14845 || this.field21407.method37746().method11342(var14) < (double)(var8 * var8);
                     if (!var15) {
                        field21401.debug(field21400, "Did not notify listeners of soundEvent: {}, it is too far away to hear", var5);
                     } else {
                        for (Class1270 var17 : this.field21417) {
                           var17.method6000(var1, var4);
                        }
                     }
                  }

                  if (!(this.field21407.method37749() <= 0.0F)) {
                     boolean var19 = method13768(var1);
                     boolean var20 = var6.method20296();
                     CompletableFuture var21 = this.field21410.method38753(!var6.method20296() ? Class2149.field14052 : Class2149.field14053);
                     Class9617 var18 = (Class9617)var21.join();
                     if (var18 != null) {
                        field21401.debug(field21400, "Playing sound {} for event {}", var6.method20291(), var5);
                        this.field21416.put(var1, this.field21411 + 20);
                        this.field21412.put(var1, var18);
                        this.field21413.put(var9, var1);
                        var18.method37438(var8x -> {
                           var8x.method30121(var11);
                           var8x.method30123(var10);
                           if (var12 != Class2279.field14846) {
                              var8x.method30124();
                           } else {
                              var8x.method30125(var8);
                           }

                           var8x.method30122(var19 && !var20);
                           var8x.method30120(var14);
                           var8x.method30126(var13);
                        });
                        if (var20) {
                           this.field21408.method20334(var6.method20292(), var19).thenAccept(var1x -> var18.method37438(var1xx -> {
                                 var1xx.method30128(var1x);
                                 var1xx.method30114();
                              }));
                        } else {
                           this.field21408.method20333(var6.method20292()).thenAccept(var1x -> var18.method37438(var1xx -> {
                                 var1xx.method30127(var1x);
                                 var1xx.method30114();
                              }));
                        }

                        if (var1 instanceof Class6341) {
                           this.field21414.add((Class6341) var1);
                        }
                     } else {
                        field21401.warn("Failed to create new sound handle");
                     }
                  } else {
                     field21401.debug(field21400, "Skipped playing soundEvent: {}, master volume was zero", var5);
                  }
               }
            } else if (field21402.add(var5)) {
               field21401.warn(field21400, "Unable to play empty soundEvent: {}", var5);
            }
         } else if (field21402.add(var5)) {
            field21401.warn(field21400, "Unable to play unknown soundEvent: {}", var5);
         }
      }
   }

   public void method13771(Class6341 var1) {
      this.field21418.add(var1);
   }

   public void method13772(Class6647 var1) {
      this.field21419.add(var1);
   }

   private float method13773(Class6340 var1) {
      return MathHelper.clamp(var1.method19286(), 0.5F, 2.0F);
   }

   private float method13774(Class6340 var1) {
      return MathHelper.clamp(var1.method19285() * this.method13757(var1.method19282()), 0.0F, 1.0F);
   }

   public void method13775() {
      if (this.field21405) {
         this.field21410.method38754(var0 -> var0.forEach(Class8506::method30116));
      }
   }

   public void method13776() {
      if (this.field21405) {
         this.field21410.method38754(var0 -> var0.forEach(Class8506::method30117));
      }
   }

   public void method13777(Class6340 var1, int var2) {
      this.field21415.put(var1, this.field21411 + var2);
   }

   public void method13778(ActiveRenderInfo var1) {
      if (this.field21405 && var1.method37510()) {
         Vector3d var4 = var1.getPos();
         Vector3f var5 = var1.method37516();
         Vector3f var6 = var1.method37517();
         this.field21409.execute(() -> {
            this.field21407.method37745(var4);
            this.field21407.method37747(var5, var6);
         });
      }
   }

   public void method13779(ResourceLocation var1, Class2266 var2) {
      if (var2 == null) {
         if (var1 != null) {
            for (Class6340 var6 : this.field21412.keySet()) {
               if (var6.method19279().equals(var1)) {
                  this.method13760(var6);
               }
            }
         } else {
            this.method13761();
         }
      } else {
         for (Class6340 var8 : this.field21413.get(var2)) {
            if (var1 == null || var8.method19279().equals(var1)) {
               this.method13760(var8);
            }
         }
      }
   }

   public String method13780() {
      return this.field21406.method27290();
   }
}
