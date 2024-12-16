package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class Class943 extends TileEntity implements Class942, ITickableTileEntity {
   private static String[] field5317;
   public float field5318;
   public float field5319;
   public int field5320;
   private int field5321;

   public Class943() {
      super(TileEntityType.field21424);
   }

   @Override
   public void tick() {
      if (++this.field5321 % 20 * 4 == 0) {
         this.world.addBlockEvent(this.pos, Blocks.ENDER_CHEST, 1, this.field5320);
      }

      this.field5319 = this.field5318;
      int var3 = this.pos.getX();
      int var4 = this.pos.getY();
      int var5 = this.pos.getZ();
      float var6 = 0.1F;
      if (this.field5320 > 0 && this.field5318 == 0.0F) {
         double var7 = (double)var3 + 0.5;
         double var9 = (double)var5 + 0.5;
         this.world
            .playSound(
               (PlayerEntity)null,
               var7,
               (double)var4 + 0.5,
               var9,
               SoundEvents.field26535,
               SoundCategory.field14732,
               0.5F,
               this.world.rand.nextFloat() * 0.1F + 0.9F
            );
      }

      if (this.field5320 == 0 && this.field5318 > 0.0F || this.field5320 > 0 && this.field5318 < 1.0F) {
         float var11 = this.field5318;
         if (this.field5320 <= 0) {
            this.field5318 -= 0.1F;
         } else {
            this.field5318 += 0.1F;
         }

         if (this.field5318 > 1.0F) {
            this.field5318 = 1.0F;
         }

         float var12 = 0.5F;
         if (this.field5318 < 0.5F && var11 >= 0.5F) {
            double var15 = (double)var3 + 0.5;
            double var13 = (double)var5 + 0.5;
            this.world
               .playSound(
                  (PlayerEntity)null,
                  var15,
                  (double)var4 + 0.5,
                  var13,
                  SoundEvents.field26534,
                  SoundCategory.field14732,
                  0.5F,
                  this.world.rand.nextFloat() * 0.1F + 0.9F
               );
         }

         if (this.field5318 < 0.0F) {
            this.field5318 = 0.0F;
         }
      }
   }

   @Override
   public boolean receiveClientEvent(int var1, int var2) {
      if (var1 != 1) {
         return super.receiveClientEvent(var1, var2);
      } else {
         this.field5320 = var2;
         return true;
      }
   }

   @Override
   public void method3765() {
      this.method3780();
      super.method3765();
   }

   public void method3766() {
      this.field5320++;
      this.world.addBlockEvent(this.pos, Blocks.ENDER_CHEST, 1, this.field5320);
   }

   public void method3767() {
      this.field5320--;
      this.world.addBlockEvent(this.pos, Blocks.ENDER_CHEST, 1, this.field5320);
   }

   public boolean method3768(PlayerEntity var1) {
      return this.world.getTileEntity(this.pos) == this
         ? !(
            var1.getDistanceNearest((double)this.pos.getX() + 0.5, (double)this.pos.getY() + 0.5, (double)this.pos.getZ() + 0.5)
               > 64.0
         )
         : false;
   }

   @Override
   public float getLidAngle(float var1) {
      return MathHelper.lerp(var1, this.field5319, this.field5318);
   }
}
