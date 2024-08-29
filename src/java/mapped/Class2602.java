package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

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
      List<BoatEntity> var3 = this.field16845.world.method7182(BoatEntity.class, this.field16845.getBoundingBox().method19664(5.0));
      boolean var4 = false;

      for (BoatEntity var6 : var3) {
         Entity var7 = var6.method3407();
         if (var7 instanceof PlayerEntity && (MathHelper.method37771(((PlayerEntity)var7).field4982) > 0.0F || MathHelper.method37771(((PlayerEntity)var7).field4984) > 0.0F)
            )
          {
            var4 = true;
            break;
         }
      }

      return this.field16846 != null && (MathHelper.method37771(this.field16846.field4982) > 0.0F || MathHelper.method37771(this.field16846.field4984) > 0.0F)
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
         && (MathHelper.method37771(this.field16846.field4982) > 0.0F || MathHelper.method37771(this.field16846.field4984) > 0.0F);
   }

   @Override
   public void method10804() {
      for (BoatEntity var4 : this.field16845.world.<BoatEntity>method7182(BoatEntity.class, this.field16845.getBoundingBox().method19664(5.0))) {
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
      boolean var3 = MathHelper.method37771(this.field16846.field4982) > 0.0F || MathHelper.method37771(this.field16846.field4984) > 0.0F;
      float var4 = this.field16847 != Class1987.field12972 ? 0.015F : (!var3 ? 0.0F : 0.01F);
      this.field16845.method3265(var4, new Vector3d((double)this.field16845.field4982, (double)this.field16845.field4983, (double)this.field16845.field4984));
      this.field16845.move(Class2107.field13742, this.field16845.method3433());
      if (--this.field16844 <= 0) {
         this.field16844 = 10;
         if (this.field16847 != Class1987.field12971) {
            if (this.field16847 == Class1987.field12972) {
               Direction var5 = this.field16846.method3387();
               BlockPos var6 = this.field16846.getPosition().method8350(var5, 10);
               this.field16845.method4230().method21654((double)var6.getX(), (double)(var6.getY() - 1), (double)var6.getZ(), 1.0);
               if (this.field16845.method3275(this.field16846) > 12.0F) {
                  this.field16844 = 0;
                  this.field16847 = Class1987.field12971;
               }
            }
         } else {
            BlockPos var7 = this.field16846.getPosition().method8349(this.field16846.method3386().method536());
            var7 = var7.method8336(0, -1, 0);
            this.field16845.method4230().method21654((double)var7.getX(), (double)var7.getY(), (double)var7.getZ(), 1.0);
            if (this.field16845.method3275(this.field16846) < 4.0F) {
               this.field16844 = 0;
               this.field16847 = Class1987.field12972;
            }
         }
      }
   }
}
