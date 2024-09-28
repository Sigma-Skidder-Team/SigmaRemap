package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.Comparator;
import java.util.Random;

public abstract class Class6777 extends Class6768<Class8278> {
   private long field29560;
   private ImmutableMap<BlockState, Class7689> field29561 = ImmutableMap.of();
   private ImmutableMap<BlockState, Class7689> field29562 = ImmutableMap.of();
   private Class7689 field29563;

   public Class6777(Codec<Class8278> var1) {
      super(var1);
   }

   public void method20654(
      Random var1,
      IChunk var2,
      Biome var3,
      int var4,
      int var5,
      int var6,
      double var7,
      BlockState var9,
      BlockState var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      int var17 = var11 + 1;
      int var18 = var4 & 15;
      int var19 = var5 & 15;
      int var20 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var21 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      double var22 = 0.03125;
      boolean var24 = this.field29563.method25310((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      BlockState var25 = (BlockState)this.field29562
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((Class7689)var3x.getValue()).method25310((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      BlockState var26 = (BlockState)this.field29561
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((Class7689)var3x.getValue()).method25310((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      BlockPos.Mutable var27 = new BlockPos.Mutable();
      BlockState var28 = var2.getBlockState(var27.method8372(var18, 128, var19));

      for (int var29 = 127; var29 >= 0; var29--) {
         var27.method8372(var18, var29, var19);
         BlockState var30 = var2.getBlockState(var27);
         if (var28.isIn(var9.getBlock()) && (var30.isAir() || var30 == var10)) {
            for (int var31 = 0; var31 < var20; var31++) {
               var27.method8379(Direction.UP);
               if (!var2.getBlockState(var27).isIn(var9.getBlock())) {
                  break;
               }

               var2.setBlockState(var27, var25, false);
            }

            var27.method8372(var18, var29, var19);
         }

         if ((var28.isAir() || var28 == var10) && var30.isIn(var9.getBlock())) {
            for (int var32 = 0; var32 < var21 && var2.getBlockState(var27).isIn(var9.getBlock()); var32++) {
               if (var24 && var29 >= var17 - 4 && var29 <= var17 + 1) {
                  var2.setBlockState(var27, this.method20664(), false);
               } else {
                  var2.setBlockState(var27, var26, false);
               }

               var27.method8379(Direction.DOWN);
            }
         }

         var28 = var30;
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29560 != var1 || this.field29563 == null || this.field29561.isEmpty() || this.field29562.isEmpty()) {
         this.field29561 = method20661(this.method20662(), var1);
         this.field29562 = method20661(this.method20663(), var1 + (long)this.field29561.size());
         this.field29563 = new Class7689(new Class2420(var1 + (long)this.field29561.size() + (long)this.field29562.size()), ImmutableList.of(0));
      }

      this.field29560 = var1;
   }

   private static ImmutableMap<BlockState, Class7689> method20661(ImmutableList<BlockState> var0, long var1) {
      Builder var5 = new Builder();
      UnmodifiableIterator var6 = var0.iterator();

      while (var6.hasNext()) {
         BlockState var7 = (BlockState)var6.next();
         var5.put(var7, new Class7689(new Class2420(var1), ImmutableList.of(-4)));
         var1++;
      }

      return var5.build();
   }

   public abstract ImmutableList<BlockState> method20662();

   public abstract ImmutableList<BlockState> method20663();

   public abstract BlockState method20664();
}
