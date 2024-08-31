package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

public class Class993 extends AbstractMinecartEntity {
   private int field5480 = -1;

   public Class993(EntityType<? extends Class993> var1, World var2) {
      super(var1, var2);
   }

   public Class993(World var1, double var2, double var4, double var6) {
      super(EntityType.field41056, var1, var2, var4, var6);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.TNT;
   }

   @Override
   public BlockState method3604() {
      return Blocks.TNT.method11579();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5480 <= 0) {
         if (this.field5480 == 0) {
            this.method4071(method3234(this.method3433()));
         }
      } else {
         this.field5480--;
         this.world.method6746(Class7940.field34092, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
      }

      if (this.collidedHorizontally) {
         double var3 = method3234(this.method3433());
         if (var3 >= 0.01F) {
            this.method4071(var3);
         }
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      Entity var5 = var1.method31113();
      if (var5 instanceof AbstractArrowEntity) {
         AbstractArrowEntity var6 = (AbstractArrowEntity)var5;
         if (var6.method3327()) {
            this.method4071(var6.method3433().method11349());
         }
      }

      return super.method2741(var1, var2);
   }

   @Override
   public void method3586(Class8654 var1) {
      double var4 = method3234(this.method3433());
      if (!var1.method31141() && !var1.method31131() && !(var4 >= 0.01F)) {
         super.method3586(var1);
         if (!var1.method31131() && this.world.method6789().method17135(Class5462.field24229)) {
            this.method3300(Blocks.TNT);
         }
      } else if (this.field5480 < 0) {
         this.method4072();
         this.field5480 = this.rand.nextInt(20) + this.rand.nextInt(20);
      }
   }

   public void method4071(double var1) {
      if (!this.world.isRemote) {
         double var5 = Math.sqrt(var1);
         if (var5 > 5.0) {
            var5 = 5.0;
         }

         this.world
            .method6755(
               this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)(4.0 + this.rand.nextDouble() * 1.5 * var5), Class2141.field14015
            );
         this.method2904();
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      if (var1 >= 3.0F) {
         float var5 = var1 / 10.0F;
         this.method4071((double)(var5 * var5));
      }

      return super.method2921(var1, var2);
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.field5480 < 0) {
         this.method4072();
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 10) {
         super.method2866(var1);
      } else {
         this.method4072();
      }
   }

   public void method4072() {
      this.field5480 = 80;
      if (!this.world.isRemote) {
         this.world.method6786(this, (byte)10);
         if (!this.method3245()) {
            this.world
               .method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), Sounds.field27146, Class2266.field14732, 1.0F, 1.0F);
         }
      }
   }

   public int method4073() {
      return this.field5480;
   }

   public boolean method4074() {
      return this.field5480 > -1;
   }

   @Override
   public float method3368(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, FluidState var5, float var6) {
      return this.method4074() && (var4.method23446(BlockTags.field32766) || var2.getBlockState(var3.up()).method23446(BlockTags.field32766))
         ? 0.0F
         : super.method3368(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method3369(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, float var5) {
      return this.method4074() && (var4.method23446(BlockTags.field32766) || var2.getBlockState(var3.up()).method23446(BlockTags.field32766))
         ? false
         : super.method3369(var1, var2, var3, var4, var5);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("TNTFuse", 99)) {
         this.field5480 = var1.method122("TNTFuse");
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("TNTFuse", this.field5480);
   }
}
