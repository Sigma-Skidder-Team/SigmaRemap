package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class Class2783 extends Class2595 {
   private static String[] field17395;
   private final BlazeEntity field17396;
   private int field17397;
   private int field17398;
   private int field17399;

   public Class2783(BlazeEntity var1) {
      this.field17396 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17396.method4232();
      return var3 != null && var3.isAlive() && this.field17396.canAttack(var3);
   }

   @Override
   public void method10804() {
      this.field17397 = 0;
   }

   @Override
   public void method10807() {
      BlazeEntity.method5295(this.field17396, false);
      this.field17399 = 0;
   }

   @Override
   public void method10805() {
      this.field17398--;
      LivingEntity var3 = this.field17396.method4232();
      if (var3 != null) {
         boolean var4 = this.field17396.method4231().method35460(var3);
         if (!var4) {
            this.field17399++;
         } else {
            this.field17399 = 0;
         }

         double var5 = this.field17396.getDistanceSq(var3);
         if (var5 < 4.0) {
            if (!var4) {
               return;
            }

            if (this.field17398 <= 0) {
               this.field17398 = 20;
               this.field17396.attackEntityAsMob(var3);
            }

            this.field17396.method4228().method20813(var3.getPosX(), var3.getPosY(), var3.getPosZ(), 1.0);
         } else if (var5 < this.method10973() * this.method10973() && var4) {
            double var7 = var3.getPosX() - this.field17396.getPosX();
            double var9 = var3.getPosYHeight(0.5) - this.field17396.getPosYHeight(0.5);
            double var11 = var3.getPosZ() - this.field17396.getPosZ();
            if (this.field17398 <= 0) {
               this.field17397++;
               if (this.field17397 != 1) {
                  if (this.field17397 > 4) {
                     this.field17398 = 100;
                     this.field17397 = 0;
                     BlazeEntity.method5295(this.field17396, false);
                  } else {
                     this.field17398 = 6;
                  }
               } else {
                  this.field17398 = 60;
                  BlazeEntity.method5295(this.field17396, true);
               }

               if (this.field17397 > 1) {
                  float var13 = MathHelper.sqrt(MathHelper.sqrt(var5)) * 0.5F;
                  if (!this.field17396.isSilent()) {
                     this.field17396.world.method6869((PlayerEntity)null, 1018, this.field17396.getPosition(), 0);
                  }

                  for (int var14 = 0; var14 < 1; var14++) {
                     SmallFireballEntity var15 = new SmallFireballEntity(
                        this.field17396.world,
                        this.field17396,
                        var7 + this.field17396.getRNG().nextGaussian() * (double)var13,
                        var9,
                        var11 + this.field17396.getRNG().nextGaussian() * (double)var13
                     );
                     var15.setPosition(var15.getPosX(), this.field17396.getPosYHeight(0.5) + 0.5, var15.getPosZ());
                     this.field17396.world.addEntity(var15);
                  }
               }
            }

            this.field17396.method4227().method28040(var3, 10.0F, 10.0F);
         } else if (this.field17399 < 5) {
            this.field17396.method4228().method20813(var3.getPosX(), var3.getPosY(), var3.getPosZ(), 1.0);
         }

         super.method10805();
      }
   }

   private double method10973() {
      return this.field17396.getAttributeValue(Attributes.FOLLOW_RANGE);
   }
}
