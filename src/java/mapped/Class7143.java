package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class7143 extends Class7139 {
   private static String[] field30704;
   public static final Codec<Class7143> field30705 = Codec.unit(() -> Class7143.field30706);
   public static final Class7143 field30706 = new Class7143();

   @Override
   public Class9542<?> method22268() {
      return Class9542.field44428;
   }

   @Override
   public void method22269(Class1658 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, Class9764 var6) {
      var3.forEach(var5x -> {
         if (var2.nextInt(3) > 0) {
            BlockPos var8 = var5x.method8345();
            if (Class2898.method11221(var1, var8)) {
               this.method22273(var1, var8, Class3402.field19066, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            BlockPos var9 = var5x.method8347();
            if (Class2898.method11221(var1, var9)) {
               this.method22273(var1, var9, Class3402.field19068, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            BlockPos var10 = var5x.method8341();
            if (Class2898.method11221(var1, var10)) {
               this.method22273(var1, var10, Class3402.field19067, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            BlockPos var11 = var5x.method8343();
            if (Class2898.method11221(var1, var11)) {
               this.method22273(var1, var11, Class3402.field19065, var5, var6);
            }
         }
      });
   }
}
