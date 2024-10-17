package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class2763 extends Class2595 {
   private static String[] field17330;
   private final CreatureEntity field17331;

   public Class2763(CreatureEntity var1) {
      this.field17331 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17331.isOnGround() && !this.field17331.world.getFluidState(this.field17331.getPosition()).method23486(FluidTags.field40469);
   }

   @Override
   public void method10804() {
      BlockPos var3 = null;

      for (BlockPos var5 : BlockPos.method8364(
         MathHelper.floor(this.field17331.getPosX() - 2.0),
         MathHelper.floor(this.field17331.getPosY() - 2.0),
         MathHelper.floor(this.field17331.getPosZ() - 2.0),
         MathHelper.floor(this.field17331.getPosX() + 2.0),
         MathHelper.floor(this.field17331.getPosY()),
         MathHelper.floor(this.field17331.getPosZ() + 2.0)
      )) {
         if (this.field17331.world.getFluidState(var5).method23486(FluidTags.field40469)) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         this.field17331.method4228().method20813((double)var3.getX(), (double)var3.getY(), (double)var3.getZ(), 1.0);
      }
   }
}
