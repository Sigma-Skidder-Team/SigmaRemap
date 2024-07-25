package remapped;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class class_7685 {
   private static String[] field_39045;

   public static Iterator<class_3511> method_34827(ClientWorld var0, double var1, Entity var3, int var4, class_7626 var5) {
      float var8 = class_6588.method_30251();
      if (!(var8 <= 0.0F) && !(var8 >= (float)((var4 - 1) * 16))) {
         int var19 = MathHelper.ceil(var8 / 16.0F) + 1;
         float var10 = var0.method_29553((float)var1);
         float var11 = class_6588.field_33824 * MathHelper.deg2Rad;
         float var12 = var10 > MathHelper.PId2 && var10 < 3.0F * MathHelper.PId2 ? var10 + MathHelper.PI : var10;
         float var13 = -MathHelper.sin(var12);
         float var14 = MathHelper.cos(var12) * MathHelper.cos(var11);
         float var15 = -MathHelper.cos(var12) * MathHelper.sin(var11);
         BlockPos var16 = new BlockPos(
            MathHelper.floor(var3.getPosX()) >> 4,
            MathHelper.floor(var3.method_37309()) >> 4,
            MathHelper.floor(var3.getPosZ()) >> 4
         );
         BlockPos var17 = var16.method_6103((double)(-var13 * (float)var19), (double)(-var14 * (float)var19), (double)(-var15 * (float)var19));
         BlockPos var18 = var16.method_6103((double)(var13 * (float)var4), (double)(var14 * (float)var4), (double)(var15 * (float)var4));
         return new class_5126(var5, var17, var18, var19, var19);
      } else {
         List var9 = Arrays.<class_3511>asList(var5.field_38807);
         return var9.iterator();
      }
   }
}
