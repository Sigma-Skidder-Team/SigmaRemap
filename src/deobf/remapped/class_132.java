package remapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_132 {
   private static final Marker field_339 = MarkerManager.getMarker("SOUNDS");
   private static final Logger field_330 = LogManager.getLogger();
   private static final Set<class_4639> field_342 = Sets.newHashSet();
   private final class_3541 field_341;
   private final class_8881 field_334;
   private boolean field_329;
   private final class_3301 field_337 = new class_3301();
   private final class_9285 field_340 = this.field_337.method_15139();
   private final class_866 field_335;
   private final class_2370 field_328 = new class_2370();
   private final class_9779 field_347 = new class_9779(this.field_337, this.field_328);
   private int field_346;
   private final Map<class_3560, class_9046> field_344 = Maps.newHashMap();
   private final Multimap<class_562, class_3560> field_348 = HashMultimap.create();
   private final List<class_6483> field_331 = Lists.newArrayList();
   private final Map<class_3560, Integer> field_333 = Maps.newHashMap();
   private final Map<class_3560, Integer> field_332 = Maps.newHashMap();
   private final List<class_4440> field_343 = Lists.newArrayList();
   private final List<class_6483> field_345 = Lists.newArrayList();
   private final List<class_2049> field_338 = Lists.newArrayList();

   public class_132(class_3541 var1, class_8881 var2, class_7832 var3) {
      this.field_341 = var1;
      this.field_334 = var2;
      this.field_335 = new class_866(var3);
   }

   public void method_418() {
      field_342.clear();

      for (class_8461 var4 : class_8669.field_44369) {
         class_4639 var5 = var4.method_38928();
         if (this.field_341.method_16334(var5) == null) {
            field_330.warn("Missing sound for event: {}", class_8669.field_44369.method_39797(var4));
            field_342.add(var5);
         }
      }

      this.method_431();
      this.method_422();
   }

   private synchronized void method_422() {
      if (!this.field_329) {
         try {
            this.field_337.method_15141();
            this.field_340.method_42754();
            this.field_340.method_42753(this.field_334.method_40885(class_562.field_3326));
            this.field_335.method_3750(this.field_338).thenRun(this.field_338::clear);
            this.field_329 = true;
            field_330.info(field_339, "Sound engine started");
         } catch (RuntimeException var4) {
            field_330.error(field_339, "Error starting SoundSystem. Turning off sounds & music", var4);
         }
      }
   }

   private float method_428(class_562 var1) {
      return var1 != null && var1 != class_562.field_3326 ? this.field_334.method_40885(var1) : 1.0F;
   }

   public void method_421(class_562 var1, float var2) {
      if (this.field_329) {
         if (var1 != class_562.field_3326) {
            this.field_344.forEach((var1x, var2x) -> {
               float var5 = this.method_417(var1x);
               var2x.method_41530(var1xx -> {
                  if (!(var5 <= 0.0F)) {
                     var1xx.method_22340(var5);
                  } else {
                     var1xx.method_22337();
                  }
               });
            });
         } else {
            this.field_340.method_42753(var2);
         }
      }
   }

   public void method_431() {
      if (this.field_329) {
         this.method_440();
         this.field_335.method_3751();
         this.field_337.method_15140();
         this.field_329 = false;
      }
   }

   public void method_423(class_3560 var1) {
      if (this.field_329) {
         class_9046 var4 = this.field_344.get(var1);
         if (var4 != null) {
            var4.method_41530(class_4850::method_22337);
         }
      }
   }

   public void method_440() {
      if (this.field_329) {
         this.field_328.method_10847();
         this.field_344.values().forEach(var0 -> var0.method_41530(class_4850::method_22337));
         this.field_344.clear();
         this.field_347.method_45141();
         this.field_333.clear();
         this.field_331.clear();
         this.field_348.clear();
         this.field_332.clear();
         this.field_345.clear();
      }
   }

   public void method_436(class_4440 var1) {
      this.field_343.add(var1);
   }

   public void method_443(class_4440 var1) {
      this.field_343.remove(var1);
   }

   public void method_434(boolean var1) {
      if (!var1) {
         this.method_441();
      }

      this.field_347.method_45146();
   }

   private void method_441() {
      this.field_346++;
      this.field_345.stream().filter(class_3560::method_16554).forEach(this::method_435);
      this.field_345.clear();

      for (class_6483 var4 : this.field_331) {
         if (!var4.method_16554()) {
            this.method_423(var4);
         }

         var4.method_29511();
         if (var4.method_29512()) {
            this.method_423(var4);
         } else {
            float var5 = this.method_417(var4);
            float var6 = this.method_439(var4);
            class_1343 var7 = new class_1343(var4.method_16548(), var4.method_16557(), var4.method_16561());
            class_9046 var8 = this.field_344.get(var4);
            if (var8 != null) {
               var8.method_41530(var3 -> {
                  var3.method_22340(var5);
                  var3.method_22344(var6);
                  var3.method_22330(var7);
               });
            }
         }
      }

      Iterator var11 = this.field_344.entrySet().iterator();

      while (var11.hasNext()) {
         Entry var12 = (Entry)var11.next();
         class_9046 var14 = (class_9046)var12.getValue();
         class_3560 var16 = (class_3560)var12.getKey();
         float var18 = this.field_334.method_40885(var16.method_16549());
         if (var18 <= 0.0F) {
            var14.method_41530(class_4850::method_22337);
            var11.remove();
         } else if (var14.method_41529()) {
            int var19 = this.field_332.get(var16);
            if (var19 <= this.field_346) {
               if (method_438(var16)) {
                  this.field_333.put(var16, this.field_346 + var16.method_16555());
               }

               var11.remove();
               field_330.debug(field_339, "Removed channel {} because it's not playing anymore", var14);
               this.field_332.remove(var16);

               try {
                  this.field_348.remove(var16.method_16549(), var16);
               } catch (RuntimeException var10) {
               }

               if (var16 instanceof class_6483) {
                  this.field_331.remove(var16);
               }
            }
         }
      }

      Iterator var13 = this.field_333.entrySet().iterator();

      while (var13.hasNext()) {
         Entry var15 = (Entry)var13.next();
         if (this.field_346 >= (Integer)var15.getValue()) {
            class_3560 var17 = (class_3560)var15.getKey();
            if (var17 instanceof class_6483) {
               ((class_6483)var17).method_29511();
            }

            this.method_435(var17);
            var13.remove();
         }
      }
   }

   private static boolean method_426(class_3560 var0) {
      return var0.method_16555() > 0;
   }

   private static boolean method_438(class_3560 var0) {
      return var0.method_16552() && method_426(var0);
   }

   private static boolean method_430(class_3560 var0) {
      return var0.method_16552() && !method_426(var0);
   }

   public boolean method_427(class_3560 var1) {
      if (!this.field_329) {
         return false;
      } else {
         return this.field_332.containsKey(var1) && this.field_332.get(var1) <= this.field_346 ? true : this.field_344.containsKey(var1);
      }
   }

   public void method_435(class_3560 var1) {
      if (this.field_329 && var1.method_16554()) {
         class_7633 var4 = var1.method_16553(this.field_341);
         class_4639 var5 = var1.method_16556();
         if (var4 != null) {
            class_2049 var6 = var1.method_16551();
            if (var6 != class_3541.field_17316) {
               float var7 = var1.method_16562();
               float var8 = Math.max(var7, 1.0F) * (float)var6.method_9582();
               class_562 var9 = var1.method_16549();
               float var10 = this.method_417(var1);
               float var11 = this.method_439(var1);
               class_6656 var12 = var1.method_16559();
               boolean var13 = var1.method_16550();
               if (var10 == 0.0F && !var1.method_16558()) {
                  field_330.debug(field_339, "Skipped playing sound {}, volume was zero.", var6.method_9578());
               } else {
                  class_1343 var14 = new class_1343(var1.method_16548(), var1.method_16557(), var1.method_16561());
                  if (!this.field_343.isEmpty()) {
                     boolean var15 = var13 || var12 == class_6656.field_34443 || this.field_340.method_42755().method_6204(var14) < (double)(var8 * var8);
                     if (!var15) {
                        field_330.debug(field_339, "Did not notify listeners of soundEvent: {}, it is too far away to hear", var5);
                     } else {
                        for (class_4440 var17 : this.field_343) {
                           var17.method_20604(var1, var4);
                        }
                     }
                  }

                  if (!(this.field_340.method_42751() <= 0.0F)) {
                     boolean var19 = method_430(var1);
                     boolean var20 = var6.method_9581();
                     CompletableFuture var21 = this.field_347.method_45143(!var6.method_9581() ? class_8959.field_45896 : class_8959.field_45897);
                     class_9046 var18 = (class_9046)var21.join();
                     if (var18 != null) {
                        field_330.debug(field_339, "Playing sound {} for event {}", var6.method_9578(), var5);
                        this.field_332.put(var1, this.field_346 + 20);
                        this.field_344.put(var1, var18);
                        this.field_348.put(var9, var1);
                        var18.method_41530(var8x -> {
                           var8x.method_22344(var11);
                           var8x.method_22340(var10);
                           if (var12 != class_6656.field_34440) {
                              var8x.method_22336();
                           } else {
                              var8x.method_22332(var8);
                           }

                           var8x.method_22338(var19 && !var20);
                           var8x.method_22330(var14);
                           var8x.method_22335(var13);
                        });
                        if (var20) {
                           this.field_335.method_3747(var6.method_9577(), var19).thenAccept(var1x -> var18.method_41530(var1xx -> {
                                 var1xx.method_22331(var1x);
                                 var1xx.method_22343();
                              }));
                        } else {
                           this.field_335.method_3748(var6.method_9577()).thenAccept(var1x -> var18.method_41530(var1xx -> {
                                 var1xx.method_22329(var1x);
                                 var1xx.method_22343();
                              }));
                        }

                        if (var1 instanceof class_6483) {
                           this.field_331.add(var1);
                        }
                     } else {
                        field_330.warn("Failed to create new sound handle");
                     }
                  } else {
                     field_330.debug(field_339, "Skipped playing soundEvent: {}, master volume was zero", var5);
                  }
               }
            } else if (field_342.add(var5)) {
               field_330.warn(field_339, "Unable to play empty soundEvent: {}", var5);
            }
         } else if (field_342.add(var5)) {
            field_330.warn(field_339, "Unable to play unknown soundEvent: {}", var5);
         }
      }
   }

   public void method_425(class_6483 var1) {
      this.field_345.add(var1);
   }

   public void method_442(class_2049 var1) {
      this.field_338.add(var1);
   }

   private float method_439(class_3560 var1) {
      return class_9299.method_42828(var1.method_16560(), 0.5F, 2.0F);
   }

   private float method_417(class_3560 var1) {
      return class_9299.method_42828(var1.method_16562() * this.method_428(var1.method_16549()), 0.0F, 1.0F);
   }

   public void method_433() {
      if (this.field_329) {
         this.field_347.method_45142(var0 -> var0.forEach(class_4850::method_22339));
      }
   }

   public void method_419() {
      if (this.field_329) {
         this.field_347.method_45142(var0 -> var0.forEach(class_4850::method_22328));
      }
   }

   public void method_429(class_3560 var1, int var2) {
      this.field_333.put(var1, this.field_346 + var2);
   }

   public void method_437(class_9071 var1) {
      if (this.field_329 && var1.method_41642()) {
         class_1343 var4 = var1.method_41627();
         class_2426 var5 = var1.method_41634();
         class_2426 var6 = var1.method_41632();
         this.field_328.execute(() -> {
            this.field_340.method_42756(var4);
            this.field_340.method_42750(var5, var6);
         });
      }
   }

   public void method_424(class_4639 var1, class_562 var2) {
      if (var2 == null) {
         if (var1 != null) {
            for (class_3560 var6 : this.field_344.keySet()) {
               if (var6.method_16556().equals(var1)) {
                  this.method_423(var6);
               }
            }
         } else {
            this.method_440();
         }
      } else {
         for (class_3560 var8 : this.field_348.get(var2)) {
            if (var1 == null || var8.method_16556().equals(var1)) {
               this.method_423(var8);
            }
         }
      }
   }

   public String method_420() {
      return this.field_337.method_15145();
   }
}
