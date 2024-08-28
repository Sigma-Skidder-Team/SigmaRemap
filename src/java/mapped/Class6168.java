package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6168 extends Class6166 {
   private static String[] field27595;
   public static final Codec<Class6168> field27596 = Codec.unit(() -> Class6168.field27597);
   public static final Class6168 field27597 = new Class6168();

   @Override
   public Class9269<?> method19062() {
      return Class9269.field42638;
   }

   @Override
   public void method19061(Class1660 var1, BlockPos var2, Class7380 var3, Random var4) {
      var1.method6725(var2, var3, 2);
   }
}
