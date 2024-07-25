package remapped;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_987<WC extends class_9472> {
   private static String[] field_5027;
   public static final Codec<class_987<?>> field_5032 = class_8669.field_44368.dispatch(var0 -> var0.field_5028, class_6062::method_27729);
   public static final Codec<Supplier<class_987<?>>> field_5029 = class_6833.<Supplier<class_987<?>>>method_31333(class_8669.field_44406, field_5032);
   public static final Codec<List<Supplier<class_987<?>>>> field_5030 = class_6833.<class_987<?>>method_31334(class_8669.field_44406, field_5032);
   private final class_6062<WC> field_5028;
   private final WC field_5031;

   public class_987(class_6062<WC> var1, WC var2) {
      this.field_5028 = var1;
      this.field_5031 = (WC)var2;
   }

   public WC method_4313() {
      return this.field_5031;
   }

   public boolean method_4310(Random var1, int var2, int var3) {
      return this.field_5028.method_27726(var1, var2, var3, this.field_5031);
   }

   public boolean method_4312(
           class_5990 var1, Function<BlockPos, class_6325> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9
   ) {
      return this.field_5028.method_27722(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.field_5031);
   }
}
