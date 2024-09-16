package mapped;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7015 implements Class7016 {
   private static final Logger field30309 = LogManager.getLogger();
   private boolean field30310;
   private Class2110 field30311 = Class2110.field13768;
   private int field30312;
   private int field30313;
   private int field30314;
   private int field30315;
   private int field30316;

   @Override
   public int method21742(ServerWorld var1, boolean var2, boolean var3) {
      if (!var1.method6740() && var2) {
         float var6 = var1.method7001(0.0F);
         if ((double)var6 == 0.5) {
            this.field30311 = var1.rand.nextInt(10) != 0 ? Class2110.field13768 : Class2110.field13767;
         }

         if (this.field30311 != Class2110.field13768) {
            if (!this.field30310) {
               if (!this.method21743(var1)) {
                  return 0;
               }

               this.field30310 = true;
            }

            if (this.field30313 <= 0) {
               this.field30313 = 2;
               if (this.field30312 <= 0) {
                  this.field30311 = Class2110.field13768;
               } else {
                  this.method21744(var1);
                  this.field30312--;
               }

               return 1;
            } else {
               this.field30313--;
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         this.field30311 = Class2110.field13768;
         this.field30310 = false;
         return 0;
      }
   }

   private boolean method21743(ServerWorld var1) {
      for (PlayerEntity var5 : var1.method6870()) {
         if (!var5.isSpectator()) {
            BlockPos var6 = var5.getPosition();
            if (var1.method6952(var6) && var1.getBiome(var6).getCategory() != Class100.field289) {
               for (int var7 = 0; var7 < 10; var7++) {
                  float var8 = var1.rand.nextFloat() * (float) (Math.PI * 2);
                  this.field30314 = var6.getX() + MathHelper.method37767(MathHelper.cos(var8) * 32.0F);
                  this.field30315 = var6.getY();
                  this.field30316 = var6.getZ() + MathHelper.method37767(MathHelper.sin(var8) * 32.0F);
                  if (this.method21745(var1, new BlockPos(this.field30314, this.field30315, this.field30316)) != null) {
                     this.field30313 = 0;
                     this.field30312 = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void method21744(ServerWorld var1) {
      Vector3d var4 = this.method21745(var1, new BlockPos(this.field30314, this.field30315, this.field30316));
      if (var4 != null) {
         ZombieEntity var5;
         try {
            var5 = new ZombieEntity(var1);
            var5.method4276(var1, var1.method6807(var5.getPosition()), Class2202.field14398, (Class5093)null, (CompoundNBT)null);
         } catch (Exception var7) {
            field30309.warn("Failed to create zombie for village siege at {}", var4, var7);
            return;
         }

         var5.setLocationAndAngles(var4.x, var4.y, var4.z, var1.rand.nextFloat() * 360.0F, 0.0F);
         var1.method6995(var5);
      }
   }

   @Nullable
   private Vector3d method21745(ServerWorld var1, BlockPos var2) {
      for (int var5 = 0; var5 < 10; var5++) {
         int var6 = var2.getX() + var1.rand.nextInt(16) - 8;
         int var7 = var2.getZ() + var1.rand.nextInt(16) - 8;
         int var8 = var1.method6736(Heightmap.Type.field296, var6, var7);
         BlockPos var9 = new BlockPos(var6, var8, var7);
         if (var1.method6952(var9) && Class1009.method4341(EntityType.field41107, var1, Class2202.field14398, var9, var1.rand)) {
            return Vector3d.method11330(var9);
         }
      }

      return null;
   }
}
