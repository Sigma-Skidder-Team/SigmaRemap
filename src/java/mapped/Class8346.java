package mapped;

import net.minecraft.block.Blocks;

import java.util.Random;

public class Class8346 extends Class8347 {
   private static String[] field35873;

   public Class8346() {
   }

   @Override
   public void method29258(Random var1, int var2, int var3, int var4, boolean var5) {
      if (!(var1.nextFloat() < 0.4F)) {
         this.field35874 = Blocks.field36526.getDefaultState();
      } else {
         this.field35874 = Blocks.COBBLESTONE.getDefaultState();
      }
   }
}
