package mapped;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class6815<WC extends Class4729> {
   private static String[] field29673;
   public static final Codec<Class6815<?>> field29674 = Class2348.field16110.dispatch(var0 -> var0.field29677, Class7195::method22606);
   public static final Codec<Supplier<Class6815<?>>> field29675 = Class9054.method33671(Class2348.field16101, field29674);
   public static final Codec<List<Supplier<Class6815<?>>>> field29676 = Class9054.<Class6815<?>>method33672(Class2348.field16101, field29674);
   private final Class7195<WC> field29677;
   private final WC field29678;

   public Class6815(Class7195<WC> var1, WC var2) {
      this.field29677 = var1;
      this.field29678 = (WC)var2;
   }

   public WC method20775() {
      return this.field29678;
   }

   public boolean method20776(Random var1, int var2, int var3) {
      return this.field29677.method22602(var1, var2, var3, this.field29678);
   }

   public boolean method20777(Class1670 var1, Function<BlockPos, Class8907> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9) {
      return this.field29677.method22603(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.field29678);
   }
}
