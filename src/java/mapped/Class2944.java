package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Class2944 extends Class2898<Class4707> {
   private static final LoadingCache<Long, List<Class9648>> field18007 = CacheBuilder.newBuilder()
      .expireAfterWrite(5L, TimeUnit.MINUTES)
      .build(new Class4561());

   public Class2944(Codec<Class4707> var1) {
      super(var1);
   }

   public static List<Class9648> method11286(ISeedReader var0) {
      Random var3 = new Random(var0.method6967());
      long var4 = var3.nextLong() & 65535L;
      return (List<Class9648>)field18007.getUnchecked(var4);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4707 var5) {
      List<Class9648> var8 = var5.method14776();
      if (var8.isEmpty()) {
         var8 = method11286(var1);
      }

      for (Class9648 var10 : var8) {
         if (var10.method37625(var4)) {
            this.method11287(var1, var3, var5, var10);
         }
      }

      return true;
   }

   private void method11287(Class1659 var1, Random var2, Class4707 var3, Class9648 var4) {
      int var7 = var4.method37628();

      for (BlockPos var9 : BlockPos.method8359(
         new BlockPos(var4.method37626() - var7, 0, var4.method37627() - var7),
         new BlockPos(var4.method37626() + var7, var4.method37629() + 10, var4.method37627() + var7)
      )) {
         if (var9.method8320((double)var4.method37626(), (double)var9.getY(), (double)var4.method37627(), false) <= (double)(var7 * var7 + 1)
            && var9.getY() < var4.method37629()) {
            this.method11217(var1, var9, Blocks.field36527.getDefaultState());
         } else if (var9.getY() > 65) {
            this.method11217(var1, var9, Blocks.AIR.getDefaultState());
         }
      }

      if (var4.method37630()) {
         byte var21 = -2;
         byte var23 = 2;
         byte var10 = 3;
         BlockPos.Mutable var11 = new BlockPos.Mutable();

         for (int var12 = -2; var12 <= 2; var12++) {
            for (int var13 = -2; var13 <= 2; var13++) {
               for (int var14 = 0; var14 <= 3; var14++) {
                  boolean var15 = MathHelper.abs(var12) == 2;
                  boolean var16 = MathHelper.abs(var13) == 2;
                  boolean var17 = var14 == 3;
                  if (var15 || var16 || var17) {
                     boolean var18 = var12 == -2 || var12 == 2 || var17;
                     boolean var19 = var13 == -2 || var13 == 2 || var17;
                     BlockState var20 = Blocks.IRON_BARS
                        .getDefaultState()
                        .with(Class3237.field18680, Boolean.valueOf(var18 && var13 != -2))
                        .with(Class3237.field18682, Boolean.valueOf(var18 && var13 != 2))
                        .with(Class3237.field18683, Boolean.valueOf(var19 && var12 != -2))
                        .with(Class3237.field18681, Boolean.valueOf(var19 && var12 != 2));
                     this.method11217(var1, var11.method8372(var4.method37626() + var12, var4.method37629() + var14, var4.method37627() + var13), var20);
                  }
               }
            }
         }
      }

      EnderCrystalEntity var22 = EntityType.field41023.create(var1.method6970());
      var22.method4142(var3.method14777());
      var22.method3363(var3.method14775());
      var22.setLocationAndAngles((double)var4.method37626() + 0.5, (double)(var4.method37629() + 1), (double)var4.method37627() + 0.5, var2.nextFloat() * 360.0F, 0.0F);
      var1.addEntity(var22);
      this.method11217(var1, new BlockPos(var4.method37626(), var4.method37629(), var4.method37627()), Blocks.BEDROCK.getDefaultState());
   }
}
