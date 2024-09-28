package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;

public class Class2602 extends Class2595 {
   private static String[] field16843;
   private int field16844;
   private final Class1046 field16845;
   private PlayerEntity field16846;
   private Class1987 field16847;

   public Class2602(Class1046 var1) {
      this.field16845 = var1;
   }

   @Override
   public boolean method10803() {
      List<BoatEntity> var3 = this.field16845.world.getEntitiesWithinAABB(BoatEntity.class, this.field16845.getBoundingBox().method19664(5.0));
      boolean var4 = false;

      for (BoatEntity var6 : var3) {
         Entity var7 = var6.method3407();
         if (var7 instanceof PlayerEntity && (MathHelper.method37771(((PlayerEntity)var7).moveStrafing) > 0.0F || MathHelper.method37771(((PlayerEntity)var7).moveForward) > 0.0F)
            )
          {
            var4 = true;
            break;
         }
      }

      return this.field16846 != null && (MathHelper.method37771(this.field16846.moveStrafing) > 0.0F || MathHelper.method37771(this.field16846.moveForward) > 0.0F)
         || var4;
   }

   @Override
   public boolean method10808() {
      return true;
   }

   @Override
   public boolean method10806() {
      return this.field16846 != null
         && this.field16846.isPassenger()
         && (MathHelper.method37771(this.field16846.moveStrafing) > 0.0F || MathHelper.method37771(this.field16846.moveForward) > 0.0F);
   }

   @Override
   public void method10804() {
      for (BoatEntity var4 : this.field16845.world.<BoatEntity>getEntitiesWithinAABB(BoatEntity.class, this.field16845.getBoundingBox().method19664(5.0))) {
         if (var4.method3407() != null && var4.method3407() instanceof PlayerEntity) {
            this.field16846 = (PlayerEntity)var4.method3407();
            break;
         }
      }

      this.field16844 = 0;
      this.field16847 = Class1987.field12971;
   }

   @Override
   public void method10807() {
      this.field16846 = null;
   }

   @Override
   public void method10805() {
      boolean var3 = MathHelper.method37771(this.field16846.moveStrafing) > 0.0F || MathHelper.method37771(this.field16846.moveForward) > 0.0F;
      float var4 = this.field16847 != Class1987.field12972 ? 0.015F : (!var3 ? 0.0F : 0.01F);
      this.field16845.moveRelative(var4, new Vector3d((double)this.field16845.moveStrafing, (double)this.field16845.moveVertical, (double)this.field16845.moveForward));
      this.field16845.move(MoverType.SELF, this.field16845.getMotion());
      if (--this.field16844 <= 0) {
         this.field16844 = 10;
         if (this.field16847 != Class1987.field12971) {
            if (this.field16847 == Class1987.field12972) {
               Direction var5 = this.field16846.method3387();
               BlockPos var6 = this.field16846.getPosition().method8350(var5, 10);
               this.field16845.method4230().method21654((double)var6.getX(), (double)(var6.getY() - 1), (double)var6.getZ(), 1.0);
               if (this.field16845.getDistance(this.field16846) > 12.0F) {
                  this.field16844 = 0;
                  this.field16847 = Class1987.field12971;
               }
            }
         } else {
            BlockPos var7 = this.field16846.getPosition().method8349(this.field16846.getHorizontalFacing().getOpposite());
            var7 = var7.method8336(0, -1, 0);
            this.field16845.method4230().method21654((double)var7.getX(), (double)var7.getY(), (double)var7.getZ(), 1.0);
            if (this.field16845.getDistance(this.field16846) < 4.0F) {
               this.field16844 = 0;
               this.field16847 = Class1987.field12972;
            }
         }
      }
   }
}
