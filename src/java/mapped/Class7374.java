package mapped;

import javax.annotation.Nullable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7374 extends Class7361 {
   private static final Logger field31553 = LogManager.getLogger();
   private int field31554;
   private Class8238 field31555;
   private Vector3d field31556;
   private LivingEntity field31557;
   private boolean field31558;

   public Class7374(Class1007 var1) {
      super(var1);
   }

   @Override
   public void method23360() {
      if (this.field31557 != null) {
         if (this.field31555 != null && this.field31555.method28693()) {
            double var3 = this.field31557.getPosX();
            double var5 = this.field31557.getPosZ();
            double var7 = var3 - this.field31519.getPosX();
            double var9 = var5 - this.field31519.getPosZ();
            double var11 = (double) MathHelper.sqrt(var7 * var7 + var9 * var9);
            double var13 = Math.min(0.4F + var11 / 80.0 - 1.0, 10.0);
            this.field31556 = new Vector3d(var3, this.field31557.getPosY() + var13, var5);
         }

         double var33 = this.field31556 != null
            ? this.field31556.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ())
            : 0.0;
         if (var33 < 100.0 || var33 > 22500.0) {
            this.method23379();
         }

         double var34 = 64.0;
         if (!(this.field31557.getDistanceSq(this.field31519) < 4096.0)) {
            if (this.field31554 > 0) {
               this.field31554--;
            }
         } else if (!this.field31519.canEntityBeSeen(this.field31557)) {
            if (this.field31554 > 0) {
               this.field31554--;
            }
         } else {
            this.field31554++;
            Vector3d var15 = new Vector3d(
                  this.field31557.getPosX() - this.field31519.getPosX(), 0.0, this.field31557.getPosZ() - this.field31519.getPosZ()
               )
               .method11333();
            Vector3d var16 = new Vector3d(
                  (double) MathHelper.sin(this.field31519.rotationYaw * (float) (Math.PI / 180.0)),
                  0.0,
                  (double)(-MathHelper.cos(this.field31519.rotationYaw * (float) (Math.PI / 180.0)))
               )
               .method11333();
            float var17 = (float)var16.dotProduct(var15);
            float var18 = (float)(Math.acos((double)var17) * 180.0F / (float)Math.PI);
            var18 += 0.5F;
            if (this.field31554 >= 5 && var18 >= 0.0F && var18 < 10.0F) {
               double var35 = 1.0;
               Vector3d var19 = this.field31519.getLook(1.0F);
               double var20 = this.field31519.field5624.getPosX() - var19.x * 1.0;
               double var22 = this.field31519.field5624.getPosYHeight(0.5) + 0.5;
               double var24 = this.field31519.field5624.getPosZ() - var19.z * 1.0;
               double var26 = this.field31557.getPosX() - var20;
               double var28 = this.field31557.getPosYHeight(0.5) - var22;
               double var30 = this.field31557.getPosZ() - var24;
               if (!this.field31519.isSilent()) {
                  this.field31519.world.method6869((PlayerEntity)null, 1017, this.field31519.getPosition(), 0);
               }

               Class903 var32 = new Class903(this.field31519.world, this.field31519, var26, var28, var30);
               var32.setLocationAndAngles(var20, var22, var24, 0.0F, 0.0F);
               this.field31519.world.addEntity(var32);
               this.field31554 = 0;
               if (this.field31555 != null) {
                  while (!this.field31555.method28693()) {
                     this.field31555.method28691();
                  }
               }

               this.field31519.method4336().method32671(Class9598.field44896);
            }
         }
      } else {
         field31553.warn("Skipping player strafe phase because no player was found");
         this.field31519.method4336().method32671(Class9598.field44896);
      }
   }

   private void method23379() {
      if (this.field31555 == null || this.field31555.method28693()) {
         int var3 = this.field31519.method4328();
         int var4 = var3;
         if (this.field31519.getRNG().nextInt(8) == 0) {
            this.field31558 = !this.field31558;
            var4 = var3 + 6;
         }

         if (!this.field31558) {
            var4--;
         } else {
            var4++;
         }

         if (this.field31519.method4337() != null && this.field31519.method4337().method26125() > 0) {
            var4 %= 12;
            if (var4 < 0) {
               var4 += 12;
            }
         } else {
            var4 -= 12;
            var4 &= 7;
            var4 += 12;
         }

         this.field31555 = this.field31519.method4330(var3, var4, (Class7176)null);
         if (this.field31555 != null) {
            this.field31555.method28691();
         }
      }

      this.method23380();
   }

   private void method23380() {
      if (this.field31555 != null && !this.field31555.method28693()) {
         BlockPos var3 = this.field31555.method28704();
         this.field31555.method28691();
         double var4 = (double)var3.getX();
         double var6 = (double)var3.getZ();

         double var8;
         do {
            var8 = (double)((float)var3.getY() + this.field31519.getRNG().nextFloat() * 20.0F);
         } while (var8 < (double)var3.getY());

         this.field31556 = new Vector3d(var4, var8, var6);
      }
   }

   @Override
   public void method23362() {
      this.field31554 = 0;
      this.field31556 = null;
      this.field31555 = null;
      this.field31557 = null;
   }

   public void method23381(LivingEntity var1) {
      this.field31557 = var1;
      int var4 = this.field31519.method4328();
      int var5 = this.field31519.method4329(this.field31557.getPosX(), this.field31557.getPosY(), this.field31557.getPosZ());
      int var6 = MathHelper.floor(this.field31557.getPosX());
      int var7 = MathHelper.floor(this.field31557.getPosZ());
      double var8 = (double)var6 - this.field31519.getPosX();
      double var10 = (double)var7 - this.field31519.getPosZ();
      double var12 = (double) MathHelper.sqrt(var8 * var8 + var10 * var10);
      double var14 = Math.min(0.4F + var12 / 80.0 - 1.0, 10.0);
      int var16 = MathHelper.floor(this.field31557.getPosY() + var14);
      Class7176 var17 = new Class7176(var6, var16, var7);
      this.field31555 = this.field31519.method4330(var4, var5, var17);
      if (this.field31555 != null) {
         this.field31555.method28691();
         this.method23380();
      }
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31556;
   }

   @Override
   public Class9598<Class7374> method23368() {
      return Class9598.field44897;
   }
}
