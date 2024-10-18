package mapped;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.Random;
import java.util.Set;

public class Class6824 extends Class6819 {
   public static final Codec<Class6824> field29696 = RecordCodecBuilder.create(var0 -> method20805(var0).apply(var0, Class6824::new));
   public final int field29697;

   public static <P extends Class6824> P3<Mu<P>, Class8045, Class8045, Integer> method20805(Instance<P> var0) {
      return method20792(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.field29697));
   }

   public Class6824(Class8045 var1, Class8045 var2, int var3) {
      super(var1, var2);
      this.field29697 = var3;
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26059;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, MutableBoundingBox var10
   ) {
      for (int var13 = var9; var13 >= var9 - var6; var13--) {
         int var14 = Math.max(var7 + var5.method35438() - 1 - var13 / 2, 0);
         this.method20796(var1, var2, var3, var5.method35437(), var14, var8, var13, var5.method35439(), var10);
      }
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return this.field29697;
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && (var1.nextInt(2) == 0 || var3 == 0);
   }
}
