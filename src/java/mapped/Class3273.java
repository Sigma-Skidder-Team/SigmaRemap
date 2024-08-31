package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;

public class Class3273 extends Item {
   private static String[] field18773;

   public Class3273(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      boolean var7 = false;
      if (!Class3244.method11656(var6)) {
         var5 = var5.method8349(var1.method18354());
         if (AbstractFireBlock.method12012(var4, var5, var1.method18350())) {
            this.method11796(var4, var5);
            var4.setBlockState(var5, AbstractFireBlock.method12009(var4, var5));
            var7 = true;
         }
      } else {
         this.method11796(var4, var5);
         var4.setBlockState(var5, var6.method23465(Class3244.field18698, Boolean.valueOf(true)));
         var7 = true;
      }

      if (!var7) {
         return ActionResultType.FAIL;
      } else {
         var1.method18357().method32182(1);
         return ActionResultType.method9002(var4.isRemote);
      }
   }

   private void method11796(World var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Sounds.field26572, Class2266.field14732, 1.0F, (field18735.nextFloat() - field18735.nextFloat()) * 0.2F + 1.0F);
   }
}
