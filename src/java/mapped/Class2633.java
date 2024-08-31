package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class Class2633 extends Class2632 {
   private static String[] field16944;
   public final Class1038 field16948;

   public Class2633(Class1038 var1, Class1046 var2, double var3, int var5) {
      super(Blocks.field36964, var2, var3, var5);
      this.field16948 = var1;
   }

   @Override
   public void method10842(Class1660 var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Sounds.field27288, Class2266.field14733, 0.5F, 0.9F + Class1038.method4665(this.field16948).nextFloat() * 0.2F);
   }

   @Override
   public void method10843(World var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Sounds.field27167, Class2266.field14732, 0.7F, 0.9F + var1.rand.nextFloat() * 0.2F);
   }

   @Override
   public double method10835() {
      return 1.14;
   }
}
