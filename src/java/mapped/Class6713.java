package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class Class6713<T> extends Class6712<T> {
   private static String[] field29418;
   private final Class8904 field29419;

   public static <T> Class6713<T> method20491(DynamicOps<T> var0, Class8904 var1) {
      return new Class6713<T>(var0, var1);
   }

   private Class6713(DynamicOps<T> var1, Class8904 var2) {
      super(var1);
      this.field29419 = var2;
   }

   public <E> DataResult<T> method20492(E var1, T var2, Class8705<? extends Class2348<E>> var3, Codec<E> var4) {
      Optional var7 = this.field29419.method32452(var3);
      if (var7.isPresent()) {
         Class2349 var8 = (Class2349)var7.get();
         Optional var9 = var8.method9182(var1);
         if (var9.isPresent()) {
            Class8705 var10 = (Class8705)var9.get();
            return ResourceLocation.field13020.encode(var10.method31399(), this.field29417, var2);
         }
      }

      return var4.encode(var1, this, var2);
   }
}
