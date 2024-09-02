package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.commons.lang3.Validate;

import java.util.function.Predicate;

public abstract class Class995 extends Entity {
   public static final Predicate<Entity> field5486 = var0 -> var0 instanceof Class995;
   private int field5487;
   public BlockPos field5488;
   public Direction field5489 = Direction.SOUTH;

   public Class995(EntityType<? extends Class995> var1, World var2) {
      super(var1, var2);
   }

   public Class995(EntityType<? extends Class995> var1, World var2, BlockPos var3) {
      this(var1, var2);
      this.field5488 = var3;
   }

   @Override
   public void registerData() {
   }

   public void method4077(Direction var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.method544().method324());
      this.field5489 = var1;
      this.rotationYaw = (float)(this.field5489.method534() * 90);
      this.prevRotationYaw = this.rotationYaw;
      this.method4078();
   }

   public void method4078() {
      if (this.field5489 != null) {
         double var3 = (double)this.field5488.getX() + 0.5;
         double var5 = (double)this.field5488.getY() + 0.5;
         double var7 = (double)this.field5488.getZ() + 0.5;
         double var9 = 0.46875;
         double var11 = this.method4079(this.method4081());
         double var13 = this.method4079(this.method4082());
         var3 -= (double)this.field5489.method539() * 0.46875;
         var7 -= (double)this.field5489.method541() * 0.46875;
         var5 += var13;
         Direction var15 = this.field5489.method538();
         var3 += var11 * (double)var15.method539();
         var7 += var11 * (double)var15.method541();
         this.method3446(var3, var5, var7);
         double var16 = (double)this.method4081();
         double var18 = (double)this.method4082();
         double var20 = (double)this.method4081();
         if (this.field5489.method544() != Class113.field415) {
            var16 = 1.0;
         } else {
            var20 = 1.0;
         }

         var16 /= 32.0;
         var18 /= 32.0;
         var20 /= 32.0;
         this.method3391(new AxisAlignedBB(var3 - var16, var5 - var18, var7 - var20, var3 + var16, var5 + var18, var7 + var20));
      }
   }

   private double method4079(int var1) {
      return var1 % 32 != 0 ? 0.0 : 0.5;
   }

   @Override
   public void tick() {
      if (!this.world.isRemote) {
         if (this.getPosY() < -64.0) {
            this.method3083();
         }

         if (this.field5487++ == 100) {
            this.field5487 = 0;
            if (!this.removed && !this.method4080()) {
               this.method2904();
               this.method4083((Entity)null);
            }
         }
      }
   }

   public boolean method4080() {
      if (!this.world.method7052(this)) {
         return false;
      } else {
         int var3 = Math.max(1, this.method4081() / 16);
         int var4 = Math.max(1, this.method4082() / 16);
         BlockPos var5 = this.field5488.method8349(this.field5489.method536());
         Direction var6 = this.field5489.method538();
         Mutable var7 = new Mutable();

         for (int var8 = 0; var8 < var3; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               int var10 = (var3 - 1) / -2;
               int var11 = (var4 - 1) / -2;
               var7.method8374(var5).method8380(var6, var8 + var10).method8380(Direction.field673, var9 + var11);
               BlockState var12 = this.world.getBlockState(var7);
               if (!var12.method23384().method31086() && !Class3247.method11672(var12)) {
                  return false;
               }
            }
         }

         return this.world.method6770(this, this.getBoundingBox(), field5486).isEmpty();
      }
   }

   @Override
   public boolean method3139() {
      return true;
   }

   @Override
   public boolean method3361(Entity var1) {
      if (!(var1 instanceof PlayerEntity)) {
         return false;
      } else {
         PlayerEntity var4 = (PlayerEntity)var1;
         return this.world.method6785(var4, this.field5488) ? this.method2741(Class8654.method31117(var4), 0.0F) : true;
      }
   }

   @Override
   public Direction method3386() {
      return this.field5489;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (!this.removed && !this.world.isRemote) {
            this.method2904();
            this.method3141();
            this.method4083(var1.method31109());
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      if (!this.world.isRemote && !this.removed && var2.method11349() > 0.0) {
         this.method2904();
         this.method4083((Entity)null);
      }
   }

   @Override
   public void method3280(double var1, double var3, double var5) {
      if (!this.world.isRemote && !this.removed && var1 * var1 + var3 * var3 + var5 * var5 > 0.0) {
         this.method2904();
         this.method4083((Entity)null);
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      BlockPos var4 = this.method4085();
      var1.method102("TileX", var4.getX());
      var1.method102("TileY", var4.getY());
      var1.method102("TileZ", var4.getZ());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      this.field5488 = new BlockPos(var1.getInt("TileX"), var1.getInt("TileY"), var1.getInt("TileZ"));
   }

   public abstract int method4081();

   public abstract int method4082();

   public abstract void method4083(Entity var1);

   public abstract void method4084();

   @Override
   public ItemEntity method3303(ItemStack var1, float var2) {
      ItemEntity var5 = new ItemEntity(
         this.world,
         this.getPosX() + (double)((float)this.field5489.method539() * 0.15F),
         this.getPosY() + (double)var2,
         this.getPosZ() + (double)((float)this.field5489.method541() * 0.15F),
         var1
      );
      var5.method4131();
      this.world.method6916(var5);
      return var5;
   }

   @Override
   public boolean method3296() {
      return false;
   }

   @Override
   public void setPosition(double var1, double var3, double var5) {
      this.field5488 = new BlockPos(var1, var3, var5);
      this.method4078();
      this.isAirBorne = true;
   }

   public BlockPos method4085() {
      return this.field5488;
   }

   @Override
   public float method3402(Class80 var1) {
      if (this.field5489.method544() != Class113.field414) {
         switch (Class9399.field43617[var1.ordinal()]) {
            case 1:
               this.field5489 = this.field5489.method536();
               break;
            case 2:
               this.field5489 = this.field5489.method538();
               break;
            case 3:
               this.field5489 = this.field5489.method537();
         }
      }

      float var4 = MathHelper.method37792(this.rotationYaw);
      switch (Class9399.field43617[var1.ordinal()]) {
         case 1:
            return var4 + 180.0F;
         case 2:
            return var4 + 90.0F;
         case 3:
            return var4 + 270.0F;
         default:
            return var4;
      }
   }

   @Override
   public float method3403(Class2089 var1) {
      return this.method3402(var1.method8749(this.field5489));
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
   }

   @Override
   public void method3385() {
   }
}
