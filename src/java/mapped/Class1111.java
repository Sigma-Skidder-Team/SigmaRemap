package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public abstract class Class1111 extends Class1006 {
   public Class1111(EntityType<? extends Class1111> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public void method2915(Vector3d var1) {
      if (!this.method3250()) {
         if (!this.method3264()) {
            float var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571()
                  * 0.91F;
            }

            float var5 = 0.16277137F / (var4 * var4 * var4);
            var4 = 0.91F;
            if (this.onGround) {
               var4 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).getBlock().method11571()
                  * 0.91F;
            }

            this.method3265(!this.onGround ? 0.02F : 0.1F * var5, var1);
            this.move(Class2107.field13742, this.method3433());
            this.method3434(this.method3433().method11344((double)var4));
         } else {
            this.method3265(0.02F, var1);
            this.move(Class2107.field13742, this.method3433());
            this.method3434(this.method3433().method11344(0.5));
         }
      } else {
         this.method3265(0.02F, var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.8F));
      }

      this.method3108(this, false);
   }

   @Override
   public boolean method3063() {
      return false;
   }
}
