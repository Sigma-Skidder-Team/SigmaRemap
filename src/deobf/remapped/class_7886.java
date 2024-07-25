package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class class_7886 extends class_4117 {
   public class_7850 field_40353;

   public class_7886(class_3511 var1, double var2, class_7850 var4) {
      this(var1, (class_2034)null, var2, var4);
   }

   public class_7886(class_3511 var1, class_2034 var2, double var3, class_7850 var5) {
      super(var1, var2, var3);
      this.field_40354 = var1;
      this.field_40353 = var5;
   }

   @Override
   public CompletableFuture<class_8490> method_19129(class_2848 var1) {
      if (!this.field_20070.get()) {
         if (this.field_40354.method_16154()) {
            if (!this.field_20070.get()) {
               class_1343 var4 = this.field_40354.field_17225.method_30747();
               float var5 = (float)var4.field_7336;
               float var6 = (float)var4.field_7333;
               float var7 = (float)var4.field_7334;
               class_8845 var8 = new class_8845();
               Set var9 = this.method_35663(var5, var6, var7, var8, var1);
               class_3511.method_16136(this.field_40354, var9);
               if (!this.field_20070.get()) {
                  ArrayList var10 = Lists.newArrayList();
                  class_8845.method_40701(var8)
                     .forEach(var3 -> var10.add(this.field_40354.field_17225.method_30744(var1.method_12956(var3), this.field_40354.method_16180(var3))));
                  return Util.method_44680(var10).<class_8490>handle((var2, var3) -> {
                     if (var3 != null && !(var3 instanceof CancellationException) && !(var3 instanceof InterruptedException)) {
                        MinecraftClient.getInstance().method_8555(class_159.method_643(var3, "Rendering chunk"));
                     }

                     if (!this.field_20070.get()) {
                        this.field_40354.field_17205.set(var8);
                        return class_8490.field_43498;
                     } else {
                        return class_8490.field_43499;
                     }
                  });
               } else {
                  return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
               }
            } else {
               return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
            }
         } else {
            this.field_40353 = null;
            this.field_40354.method_16169(false);
            this.field_20070.set(true);
            return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
         }
      } else {
         return CompletableFuture.<class_8490>completedFuture(class_8490.field_43499);
      }
   }

   private Set<class_3757> method_35663(float var1, float var2, float var3, class_8845 var4, class_2848 var5) {
      boolean var8 = true;
      BlockPos var9 = class_3511.method_16179(this.field_40354).method_6072();
      BlockPos var10 = var9.method_6104(15, 15, 15);
      class_1521 var11 = new class_1521();
      HashSet var12 = Sets.newHashSet();
      this.field_40353 = null;
      class_7966 var13 = new class_7966();
      if (!class_3511.method_16170(this.field_40354, var9)) {
         class_6705.field_34625++;
         class_1680 var14 = class_3511.method_16140(this.field_40354, var9);
         var14.method_7525();
         RenderLayer[] var15 = new RenderLayer[1];
         class_2174.method_10113();
         Random var16 = new Random();
         class_856 var17 = MinecraftClient.getInstance().method_8505();

         for (class_523 var19 : class_523.method_2546(var9, var10)) {
            class_2522 var20 = var14.method_28262(var19);
            if (!var20.method_8345()) {
               class_6414 var21 = var20.method_8360();
               if (var20.method_8321(var14, var19)) {
                  var11.method_6944(var19);
               }

               if (class_8835.method_40641(var20)) {
                  class_3757 var22 = var14.method_7520(var19, class_1628.field_8476);
                  if (var22 != null) {
                     this.method_35664(var4, var12, var22);
                  }
               }

               class_4774 var37 = var20.method_8364();
               class_1488 var23 = !class_6705.method_30745() ? null : this.method_19132(var19);
               if (!var37.method_22001()) {
                  RenderLayer[] var24 = class_3511.method_16188(this.field_40354, var37, var15);

                  for (int var25 = 0; var25 < var24.length; var25++) {
                     RenderLayer var26 = var24[var25];
                     if (!class_6705.method_30746() || class_7860.method_35566(class_7860.field_39908, var37, var26)) {
                        if (class_6705.method_30725()) {
                           class_7860.method_35547(class_7860.field_40031, var26);
                        }

                        class_9633 var27 = var5.method_12956(var26);
                        var27.method_35736(var26);
                        class_4460 var28 = var27.method_35749(var20, var19);
                        var28.method_20692(var5);
                        var14.method_7517(var28);
                        if (class_8845.method_40701(var4).add(var26)) {
                           class_3511.method_16148(this.field_40354, var27);
                        }

                        if (var17.method_3721(var19, var14, var27, var37)) {
                           class_8845.method_40696(var4, false);
                           class_8845.method_40687(var4).add(var26);
                        }
                     }
                  }
               }

               if (var20.method_8352() != class_7537.field_38470) {
                  RenderLayer[] var38 = class_3511.method_16149(this.field_40354, var20, var15);

                  for (int var39 = 0; var39 < var38.length; var39++) {
                     RenderLayer var40 = var38[var39];
                     if (!class_6705.method_30734() || class_7860.method_35566(class_7860.field_40075, var20, var40)) {
                        if (class_6705.method_30725()) {
                           class_7860.method_35547(class_7860.field_40031, var40);
                        }

                        var40 = class_3511.method_16152(this.field_40354, var14, var20, var19, var40);
                        class_9633 var42 = var5.method_12956(var40);
                        var42.method_35736(var40);
                        class_4460 var43 = var42.method_35749(var20, var19);
                        var43.method_20692(var5);
                        var14.method_7517(var43);
                        if (class_8845.method_40701(var4).add(var40)) {
                           class_3511.method_16148(this.field_40354, var42);
                        }

                        var13.method_36063();
                        var13.method_36065(
                           (double)class_3511.method_16145(this.field_40354) + (double)(var19.getX() & 15),
                           (double)class_3511.method_16144(this.field_40354) + (double)(var19.method_12165() & 15),
                           (double)class_3511.method_16153(this.field_40354) + (double)(var19.method_12185() & 15)
                        );
                        if (var17.method_3720(var20, var19, var14, var13, var42, true, var16, var23)) {
                           class_8845.method_40696(var4, false);
                           class_8845.method_40687(var4).add(var40);
                           if (var43.method_20671()) {
                              class_3511.method_16177(this.field_40354, var5, var4);
                              var43.method_20698(false);
                           }
                        }

                        var13.method_36064();
                     }
                  }
               }

               if (class_6705.method_30725()) {
                  class_7860.method_35547(class_7860.field_40031, (Object[])null);
               }
            }
         }

         if (class_8845.method_40687(var4).contains(RenderLayer.method_16762())) {
            class_9633 var29 = var5.method_12956(RenderLayer.method_16762());
            var29.method_44482(
               (float)class_3511.method_16145(this.field_40354) + var1 - (float)var9.getX(),
               (float)class_3511.method_16144(this.field_40354) + var2 - (float)var9.method_12165(),
               (float)class_3511.method_16153(this.field_40354) + var3 - (float)var9.method_12185()
            );
            class_8845.method_40692(var4, var29.method_44484());
         }

         class_8845.method_40701(var4).stream().<class_9633>map(var5::method_12956).forEach(class_9633::method_44487);

         for (RenderLayer var36 : class_6705.field_34622) {
            var4.method_40700(var36, (BitSet)null);
         }

         for (RenderLayer var33 : class_8845.method_40701(var4)) {
            if (Config.method_14424()) {
               class_2448.method_11186(var5.method_12956(var33));
            }

            class_9633 var35 = var5.method_12956(var33);
            if (var35.field_49059 != null && !var35.field_49059.isEmpty()) {
               var4.method_40700(var33, (BitSet)var35.field_49059.clone());
            }
         }

         var14.method_7516();
         class_2174.method_10095();
      }

      class_8845.method_40695(var4, var11.method_6945());
      return var12;
   }

   private <E extends class_3757> void method_35664(class_8845 var1, Set<class_3757> var2, E var3) {
      class_2255 var6 = class_3569.field_17468.<class_3757>method_16595(var3);
      if (var6 != null) {
         if (!var6.method_10369(var3)) {
            class_8845.method_40702(var1).add(var3);
         } else {
            var2.add(var3);
         }
      }
   }

   @Override
   public void method_19131() {
      this.field_40353 = null;
      if (this.field_20070.compareAndSet(false, true)) {
         this.field_40354.method_16169(false);
      }
   }
}
