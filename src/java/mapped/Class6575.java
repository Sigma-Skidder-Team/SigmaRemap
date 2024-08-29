package mapped;

import net.minecraft.util.math.BlockPos;

public class Class6575<T> {
   private final T field28942;
   public final BlockPos field28943;
   public final int field28944;
   public final Class2199 field28945;

   public Class6575(T var1, BlockPos var2, int var3, Class2199 var4) {
      this.field28942 = (T)var1;
      this.field28943 = var2;
      this.field28944 = var3;
      this.field28945 = var4;
   }

   @Override
   public String toString() {
      return this.field28942 + ": " + this.field28943 + ", " + this.field28944 + ", " + this.field28945;
   }

   // $VF: synthetic method
   public static Object method19905(Class6575 var0) {
      return var0.field28942;
   }
}
