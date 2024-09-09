package mapped;

import net.minecraft.block.BlockState;

import java.util.function.Predicate;

public class Class118 implements Predicate<BlockState> {
   private static String[] field424;
   private final Block field425;

   public Class118(Block var1) {
      this.field425 = var1;
   }

   public static Class118 method331(Block var0) {
      return new Class118(var0);
   }

   public boolean test(BlockState var1) {
      return var1 != null && var1.isIn(this.field425);
   }
}
