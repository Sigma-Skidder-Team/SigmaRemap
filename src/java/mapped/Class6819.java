package mapped;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.Registry;

import java.util.Random;
import java.util.Set;

public abstract class Class6819 {
   public static final Codec<Class6819> field29685 = Registry.field16131.dispatch(Class6819::method20785, Class5984::method18559);
   public final Class8045 field29686;
   public final Class8045 field29687;

   public static <P extends Class6819> P2<Mu<P>, Class8045, Class8045> method20792(Instance<P> var0) {
      return var0.group(
         Class8045.method27630(0, 8, 8).fieldOf("radius").forGetter(var0x -> var0x.field29686),
         Class8045.method27630(0, 8, 8).fieldOf("offset").forGetter(var0x -> var0x.field29687)
      );
   }

   public Class6819(Class8045 var1, Class8045 var2) {
      this.field29686 = var1;
      this.field29687 = var2;
   }

   public abstract Class5984<?> method20785();

   public void method20793(IWorldGenerationReader var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, MutableBoundingBox var9) {
      this.method20786(var1, var2, var3, var4, var5, var6, var7, var8, this.method20794(var2), var9);
   }

   public abstract void method20786(
           IWorldGenerationReader var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, MutableBoundingBox var10
   );

   public abstract int method20788(Random var1, int var2, Class4733 var3);

   public int method20787(Random var1, int var2) {
      return this.field29686.method27633(var1);
   }

   private int method20794(Random var1) {
      return this.field29687.method27633(var1);
   }

   public abstract boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6);

   public boolean method20795(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var9;
      int var10;
      if (!var6) {
         var9 = Math.abs(var2);
         var10 = Math.abs(var4);
      } else {
         var9 = Math.min(Math.abs(var2), Math.abs(var2 - 1));
         var10 = Math.min(Math.abs(var4), Math.abs(var4 - 1));
      }

      return this.method20789(var1, var9, var3, var10, var5, var6);
   }

   public void method20796(IWorldGenerationReader var1, Random var2, Class4733 var3, BlockPos var4, int var5, Set<BlockPos> var6, int var7, boolean var8, MutableBoundingBox var9) {
      int var12 = !var8 ? 0 : 1;
      BlockPos.Mutable var13 = new BlockPos.Mutable();

      for (int var14 = -var5; var14 <= var5 + var12; var14++) {
         for (int var15 = -var5; var15 <= var5 + var12; var15++) {
            if (!this.method20795(var2, var14, var7, var15, var5, var8)) {
               var13.method8378(var4, var14, var7, var15);
               if (Class2903.method11233(var1, var13)) {
                  var1.setBlockState(var13, var3.field22412.method20424(var2, var13), 19);
                  var9.method38392(new MutableBoundingBox(var13, var13));
                  var6.add(var13.toImmutable());
               }
            }
         }
      }
   }
}
