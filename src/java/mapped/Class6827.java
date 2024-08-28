package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class Class6827 extends Class6819 {
   public static final Codec<Class6827> field29702 = RecordCodecBuilder.create(
      var0 -> method20792(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.field29703)).apply(var0, Class6827::new)
   );
   public final int field29703;

   public Class6827(Class8045 var1, Class8045 var2, int var3) {
      super(var1, var2);
      this.field29703 = var3;
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26065;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, Class9764 var10
   ) {
      int var13 = !var5.method35439() ? 1 + var2.nextInt(2) : var6;

      for (int var14 = var9; var14 >= var9 - var13; var14--) {
         int var15 = var7 + var5.method35438() + 1 - var14;
         this.method20796(var1, var2, var3, var5.method35437(), var15, var8, var14, var5.method35439(), var10);
      }
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return this.field29703;
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 < 7 ? var2 * var2 + var4 * var4 > var5 * var5 : true;
   }
}
