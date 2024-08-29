package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class6169 extends Class6166 {
   private static String[] field27598;
   public static final Codec<Class6169> field27599 = Codec.unit(() -> Class6169.field27600);
   public static final Class6169 field27600 = new Class6169();

   @Override
   public Class9269<?> method19062() {
      return Class9269.field42639;
   }

   @Override
   public void method19061(Class1660 var1, BlockPos var2, BlockState var3, Random var4) {
      ((Class3456)var3.getBlock()).method12129(var1, var2, 2);
   }
}
