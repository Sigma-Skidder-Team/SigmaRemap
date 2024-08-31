package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class8464 {
   private static String[] field36282;
   private static final List<Class8557> field36283 = ImmutableList.of();

   public static IBakedModel method29765(IBakedModel var0, BlockState var1, Class8391 var2) {
      if (var2.method29427()) {
         var0 = Class9753.method38321(var0, var1);
      }

      return var0;
   }

   public static List<Class8557> method29766(
           List<Class8557> var0, Class1663 var1, BlockState var2, BlockPos var3, Direction var4, RenderType var5, long var6, Class8391 var8
   ) {
      if (var4 != null) {
         if (var8.method29427() && Class9753.method38322(var1.getBlockState(var3.method8349(var4)), var2)) {
            return field36283;
         }

         if (!var8.method29417(var0) && Class7944.method26876()) {
            var0 = Class9422.method36148(var1, var2, var3, var4, var0);
         }
      }

      List var11 = var8.method29428();
      var11.clear();

      for (int var12 = 0; var12 < var0.size(); var12++) {
         Class8557 var13 = (Class8557)var0.get(var12);
         Class8557[] var14 = method29768(var13, var1, var2, var3, var4, var6, var8);
         if (var12 == 0 && var0.size() == 1 && var14.length == 1 && var14[0] == var13 && var13.method30532() == null) {
            return var0;
         }

         for (int var15 = 0; var15 < var14.length; var15++) {
            Class8557 var16 = var14[var15];
            var11.add(var16);
            if (var16.method30532() != null) {
               var8.method29436(method29767(var5)).method37212(var16.method30532(), var2);
               var8.method29438(true);
            }
         }
      }

      return var11;
   }

   private static RenderType method29767(RenderType var0) {
      return var0 != null && var0 != Class9025.field41288 ? var0 : Class9025.field41289;
   }

   private static Class8557[] method29768(Class8557 var0, Class1663 var1, BlockState var2, BlockPos var3, Direction var4, long var5, Class8391 var7) {
      if (var7.method29418(var0)) {
         return var7.method29429(var0);
      } else {
         Class8557 var10 = var0;
         if (Class7944.method26915()) {
            Class8557[] var11 = Class9619.method37442(var1, var2, var3, var0, var7);
            if (var11.length != 1 || var11[0] != var0) {
               return var11;
            }
         }

         if (Class7944.method26916()) {
            var0 = Class8052.method27655(var3, var0);
            if (var0 != var10) {
               return var7.method29429(var0);
            }
         }

         return var7.method29429(var0);
      }
   }
}
