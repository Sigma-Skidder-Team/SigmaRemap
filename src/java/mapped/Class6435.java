package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;

import java.util.Random;

public class Class6435 extends Class6434 {
   private static String[] field28273;
   public static final Codec<Class6435> field28274 = Codec.unit(() -> Class6435.field28275);
   public static final Class6435 field28275 = new Class6435();

   private Class6435() {
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return true;
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42660;
   }
}
