package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;

import java.util.*;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class Class2011 extends Class2009 {
   public Class1677 field13080;
   public final Class8066 field13078;

   public Class2011(Class8066 var1, double var2, Class1677 var4) {
      this(var1, (Class7481)null, var2, var4);
   }

   public Class2011(Class8066 var1, Class7481 var2, double var3, Class1677 var5) {
      super(var1, var2, var3);
      this.field13078 = var1;
      this.field13080 = var5;
   }

   @Override
   public CompletableFuture<Class2046> method8527(Class7828 var1) {
      if (!this.field13076.get()) {
         if (this.field13078.method27709()) {
            if (!this.field13076.get()) {
               Vector3d var4 = this.field13078.field34637.method33322();
               float var5 = (float)var4.field18048;
               float var6 = (float)var4.field18049;
               float var7 = (float)var4.field18050;
               Class7457 var8 = new Class7457();
               Set<TileEntity> var9 = this.method8532(var5, var6, var7, var8, var1);
               Class8066.method27753(this.field13078, var9);
               if (!this.field13076.get()) {
                  List<CompletableFuture<Void>> var10 = Lists.newArrayList();
                  Class7457.method24116(var8)
                     .forEach(var3 -> var10.add(this.field13078.field34637.method33327(var1.method26203(var3), this.field13078.method27711(var3))));
                  return Util.gather(var10).handle((var2, var3) -> {
                     if (var3 != null && !(var3 instanceof CancellationException) && !(var3 instanceof InterruptedException)) {
                        Minecraft.getInstance().crashed(CrashReport.makeCrashReport(var3, "Rendering chunk"));
                     }

                     if (!this.field13076.get()) {
                        this.field13078.field34609.set(var8);
                        return Class2046.field13358;
                     } else {
                        return Class2046.field13359;
                     }
                  });
               } else {
                  return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
               }
            } else {
               return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
            }
         } else {
            this.field13080 = null;
            this.field13078.method27719(false);
            this.field13076.set(true);
            return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
         }
      } else {
         return CompletableFuture.<Class2046>completedFuture(Class2046.field13359);
      }
   }

   private Set<TileEntity> method8532(float var1, float var2, float var3, Class7457 var4, Class7828 var5) {
      boolean var8 = true;
      BlockPos var9 = Class8066.method27754(this.field13078).method8353();
      BlockPos var10 = var9.method8336(15, 15, 15);
      Class7212 var11 = new Class7212();
      HashSet var12 = Sets.newHashSet();
      this.field13080 = null;
      MatrixStack var13 = new MatrixStack();
      if (!Class8066.method27755(this.field13078, var9)) {
         Class9016.field41247++;
         Class1664 var14 = Class8066.method27756(this.field13078, var9);
         var14.method7024();
         RenderType[] var15 = new RenderType[1];
         Class7551.method24692();
         Random var16 = new Random();
         BlockRendererDispatcher var17 = Minecraft.getInstance().getBlockRendererDispatcher();

         for (BlockPos var19 : Class2001.method8359(var9, var10)) {
            BlockState var20 = var14.getBlockState(var19);
            if (!var20.isAir()) {
               Block var21 = var20.getBlock();
               if (var20.method23409(var14, var19)) {
                  var11.method22646(var19);
               }

               if (Class9561.method37045(var20)) {
                  TileEntity var22 = var14.method7029(var19, Class2206.field14423);
                  if (var22 != null) {
                     this.method8533(var4, var12, var22);
                  }
               }

               FluidState var37 = var20.method23449();
               Class7180 var23 = !Class9016.method33345() ? null : this.method8529(var19);
               if (!var37.method23474()) {
                  RenderType[] var24 = Class8066.method27757(this.field13078, var37, var15);

                  for (int var25 = 0; var25 < var24.length; var25++) {
                     RenderType var26 = var24[var25];
                     if (!Class9016.method33348() || Class9299.method35056(Class9299.field42941, var37, var26)) {
                        if (Class9016.method33350()) {
                           Class9299.method35055(Class9299.field42895, var26);
                        }

                        BufferBuilder var27 = var5.method26203(var26);
                        var27.method17044(var26);
                        Class8391 var28 = var27.method17022(var20, var19);
                        var28.method29435(var5);
                        var14.method7031(var28);
                        if (Class7457.method24116(var4).add(var26)) {
                           Class8066.method27758(this.field13078, var27);
                        }

                        if (var17.method811(var19, var14, var27, var37)) {
                           Class7457.method24117(var4, false);
                           Class7457.method24118(var4).add(var26);
                        }
                     }
                  }
               }

               if (var20.getRenderType() != BlockRenderType.field9885) {
                  RenderType[] var38 = Class8066.method27759(this.field13078, var20, var15);

                  for (int var39 = 0; var39 < var38.length; var39++) {
                     RenderType var40 = var38[var39];
                     if (!Class9016.method33349() || Class9299.method35056(Class9299.field42940, var20, var40)) {
                        if (Class9016.method33350()) {
                           Class9299.method35055(Class9299.field42895, var40);
                        }

                        var40 = Class8066.method27760(this.field13078, var14, var20, var19, var40);
                        BufferBuilder var42 = var5.method26203(var40);
                        var42.method17044(var40);
                        Class8391 var43 = var42.method17022(var20, var19);
                        var43.method29435(var5);
                        var14.method7031(var43);
                        if (Class7457.method24116(var4).add(var40)) {
                           Class8066.method27758(this.field13078, var42);
                        }

                        var13.push();
                        var13.translate(
                           (double)Class8066.method27761(this.field13078) + (double)(var19.getX() & 15),
                           (double)Class8066.method27762(this.field13078) + (double)(var19.getY() & 15),
                           (double)Class8066.method27763(this.field13078) + (double)(var19.getZ() & 15)
                        );
                        if (var17.method810(var20, var19, var14, var13, var42, true, var16, var23)) {
                           Class7457.method24117(var4, false);
                           Class7457.method24118(var4).add(var40);
                           if (var43.method29437()) {
                              Class8066.method27764(this.field13078, var5, var4);
                              var43.method29438(false);
                           }
                        }

                        var13.method35295();
                     }
                  }
               }

               if (Class9016.method33350()) {
                  Class9299.method35055(Class9299.field42895, (Object[])null);
               }
            }
         }

         if (Class7457.method24118(var4).contains(RenderType.method14304())) {
            BufferBuilder var29 = var5.method26203(RenderType.method14304());
            var29.method17058(
               (float)Class8066.method27761(this.field13078) + var1 - (float)var9.getX(),
               (float)Class8066.method27762(this.field13078) + var2 - (float)var9.getY(),
               (float)Class8066.method27763(this.field13078) + var3 - (float)var9.getZ()
            );
            Class7457.method24119(var4, var29.method17060());
         }

         Class7457.method24116(var4).stream().map(var5::method26203).forEach(BufferBuilder::method17065);

         for (RenderType var36 : Class9016.field41242) {
            var4.method24108(var36, (BitSet)null);
         }

         for (RenderType var33 : Class7457.method24116(var4)) {
            if (Class7944.method26921()) {
               Class7698.method25386(var5.method26203(var33));
            }

            BufferBuilder var35 = var5.method26203(var33);
            if (var35.field24134 != null && !var35.field24134.isEmpty()) {
               var4.method24108(var33, (BitSet)var35.field24134.clone());
            }
         }

         var14.method7026();
         Class7551.method24693();
      }

      Class7457.method24120(var4, var11.method22649());
      return var12;
   }

   private <E extends TileEntity> void method8533(Class7457 var1, Set<TileEntity> var2, E var3) {
      Class5942 var6 = TileEntityRendererDispatcher.instance.<TileEntity>method27960(var3);
      if (var6 != null) {
         if (!var6.method18461(var3)) {
            Class7457.method24121(var1).add(var3);
         } else {
            var2.add(var3);
         }
      }
   }

   @Override
   public void method8528() {
      this.field13080 = null;
      if (this.field13076.compareAndSet(false, true)) {
         this.field13078.method27719(false);
      }
   }
}
