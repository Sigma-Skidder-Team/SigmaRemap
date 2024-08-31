package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class9753 {
   private static IBakedModel field45513 = null;
   private static IBakedModel field45514 = null;
   private static IBakedModel field45515 = null;
   private static IBakedModel field45516 = null;
   private static IBakedModel field45517 = null;
   private static IBakedModel field45518 = null;
   private static List field45519 = null;
   private static List field45520 = null;
   private static List field45521 = null;
   private static List field45522 = null;
   private static List field45523 = null;
   private static List field45524 = null;
   private static IBakedModel field45525 = null;
   private static IBakedModel field45526 = null;
   private static IBakedModel field45527 = null;
   private static IBakedModel field45528 = null;
   private static IBakedModel field45529 = null;
   private static IBakedModel field45530 = null;
   private static final Random field45531 = new Random();

   public static IBakedModel method38321(IBakedModel var0, BlockState var1) {
      if (Class7944.method26827()) {
         List var4 = var0.method22619(var1, (Direction)null, field45531);
         if (var4 != field45519) {
            if (var4 != field45520) {
               if (var4 != field45521) {
                  if (var4 != field45522) {
                     if (var4 != field45523) {
                        return var4 != field45524 ? var0 : field45530;
                     } else {
                        return field45529;
                     }
                  } else {
                     return field45528;
                  }
               } else {
                  return field45527;
               }
            } else {
               return field45526;
            }
         } else {
            return field45525;
         }
      } else {
         return var0;
      }
   }

   public static boolean method38322(BlockState var0, BlockState var1) {
      if (var0 != var1) {
         Block var4 = var0.getBlock();
         Block var5 = var1.getBlock();
         return var4 == var5;
      } else {
         return true;
      }
   }

   public static void method38323() {
      ArrayList var2 = new ArrayList();
      field45513 = method38325("acacia", var2);
      field45514 = method38325("birch", var2);
      field45515 = method38325("dark_oak", var2);
      field45516 = method38325("jungle", var2);
      field45517 = method38325("oak", var2);
      field45518 = method38325("spruce", var2);
      field45519 = method38324(field45513);
      field45520 = method38324(field45514);
      field45521 = method38324(field45515);
      field45522 = method38324(field45516);
      field45523 = method38324(field45517);
      field45524 = method38324(field45518);
      field45525 = method38326(field45513);
      field45526 = method38326(field45514);
      field45527 = method38326(field45515);
      field45528 = method38326(field45516);
      field45529 = method38326(field45517);
      field45530 = method38326(field45518);
      if (var2.size() > 0) {
         Class7944.method26810("Enable face culling: " + Class7944.method26854(var2.toArray()));
      }
   }

   private static List method38324(IBakedModel var0) {
      return var0 != null ? var0.method22619((BlockState)null, (Direction)null, field45531) : null;
   }

   public static IBakedModel method38325(String var0, List var1) {
      ModelManager var4 = Class7944.method26825();
      if (var4 == null) {
         return null;
      } else {
         ResourceLocation var5 = new ResourceLocation("blockstates/" + var0 + "_leaves.json");
         if (Class7944.method26872(var5)) {
            ResourceLocation var6 = new ResourceLocation("models/block/" + var0 + "_leaves.json");
            if (!Class7944.method26872(var6)) {
               return null;
            } else {
               Class1997 var7 = new Class1997(var0 + "_leaves", "normal");
               IBakedModel var8 = var4.method1023(var7);
               if (var8 != null && var8 != var4.getMissingModel()) {
                  List<Class8557> var9 = var8.method22619((BlockState)null, (Direction)null, field45531);
                  if (var9.size() == 0) {
                     return var8;
                  } else if (var9.size() != 6) {
                     return null;
                  } else {
                     for (Class8557 var11 : var9) {
                        List var12 = var8.method22619((BlockState)null, var11.method30514(), field45531);
                        if (var12.size() > 0) {
                           return null;
                        }

                        var12.add(var11);
                     }

                     var9.clear();
                     var1.add(var0 + "_leaves");
                     return var8;
                  }
               } else {
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   private static IBakedModel method38326(IBakedModel var0) {
      if (var0 == null) {
         return null;
      } else if (var0.method22619((BlockState)null, (Direction)null, field45531).size() > 0) {
         Class7944.method26811(
            "SmartLeaves: Model is not cube, general quads: " + var0.method22619((BlockState)null, (Direction)null, field45531).size() + ", model: " + var0
         );
         return var0;
      } else {
         Direction[] var3 = Direction.field685;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Direction var5 = var3[var4];
            List var6 = var0.method22619((BlockState)null, var5, field45531);
            if (var6.size() != 1) {
               Class7944.method26811("SmartLeaves: Model is not cube, side: " + var5 + ", quads: " + var6.size() + ", model: " + var0);
               return var0;
            }
         }

         IBakedModel var14 = Class9842.method38900(var0);
         List[] var15 = new List[var3.length];

         for (int var16 = 0; var16 < var3.length; var16++) {
            Direction var7 = var3[var16];
            List var8 = var14.method22619((BlockState)null, var7, field45531);
            Class8557 var9 = (Class8557)var8.get(0);
            Class8557 var10 = new Class8557((int[])var9.method30511().clone(), var9.method30513(), var9.method30514(), var9.method30516(), var9.method30515());
            int[] var11 = var10.method30511();
            int[] var12 = (int[])var11.clone();
            int var13 = var11.length / 4;
            System.arraycopy(var11, 0 * var13, var12, 3 * var13, var13);
            System.arraycopy(var11, 1 * var13, var12, 2 * var13, var13);
            System.arraycopy(var11, 2 * var13, var12, 1 * var13, var13);
            System.arraycopy(var11, 3 * var13, var12, 0 * var13, var13);
            System.arraycopy(var12, 0, var11, 0, var12.length);
            var8.add(var10);
         }

         return var14;
      }
   }
}
