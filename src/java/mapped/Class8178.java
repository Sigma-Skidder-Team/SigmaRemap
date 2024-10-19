package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Optional;
import javax.annotation.Nullable;

public final class Class8178 implements Class8176 {
   private final Class8788 field35172 = new Class8788(null);
   private final Class8788 field35173 = new Class8788(null);

   @Override
   public float method28467(ItemStack var1, ClientWorld var2, LivingEntity var3) {
      Object var6 = var3 == null ? var1.method32168() : var3;
      if (var6 == null) {
         return 0.0F;
      } else {
         if (var2 == null && ((Entity)var6).world instanceof ClientWorld) {
            var2 = (ClientWorld)((Entity)var6).world;
         }

         BlockPos var7 = !Class3271.method11789(var1) ? this.method28469(var2) : this.method28470(var2, var1.getOrCreateTag());
         long var8 = var2.getGameTime();
         if (var7 != null
            && !(
               ((Entity)var6).getPositionVec()
                     .method11343((double)var7.getX() + 0.5, ((Entity)var6).getPositionVec().getY(), (double)var7.getZ() + 0.5)
                  < 1.0E-5F
            )) {
            boolean var12 = var3 instanceof PlayerEntity && ((PlayerEntity)var3).method2905();
            double var13 = 0.0;
            if (!var12) {
               if (!(var6 instanceof ItemFrameEntity)) {
                  if (!(var6 instanceof ItemEntity)) {
                     if (var3 != null) {
                        var13 = (double)var3.renderYawOffset;
                     }
                  } else {
                     var13 = (double)(180.0F - ((ItemEntity)var6).method4138(0.5F) / (float) (Math.PI * 2) * 360.0F);
                  }
               } else {
                  var13 = this.method28471((ItemFrameEntity)var6);
               }
            } else {
               var13 = (double)var3.rotationYaw;
            }

            var13 = MathHelper.method37790(var13 / 360.0, 1.0);
            double var15 = this.method28472(Vector3d.method11328(var7), (Entity)var6) / (float) (Math.PI * 2);
            double var17;
            if (!var12) {
               var17 = 0.5 - (var13 - 0.25 - var15);
            } else {
               if (Class8788.method31720(this.field35172, var8)) {
                  Class8788.method31721(this.field35172, var8, 0.5 - (var13 - 0.25));
               }

               var17 = var15 + Class8788.method31722(this.field35172);
            }

            return MathHelper.method37789((float)var17, 1.0F);
         } else {
            if (Class8788.method31720(this.field35173, var8)) {
               Class8788.method31721(this.field35173, var8, Math.random());
            }

            double var10 = Class8788.method31722(this.field35173) + (double)((float)var1.hashCode() / 2.1474836E9F);
            return MathHelper.method37789((float)var10, 1.0F);
         }
      }
   }

   @Nullable
   private BlockPos method28469(ClientWorld var1) {
      return !var1.getDimensionType().isNatural() ? null : var1.method6880();
   }

   @Nullable
   private BlockPos method28470(World var1, CompoundNBT var2) {
      boolean var5 = var2.contains("LodestonePos");
      boolean var6 = var2.contains("LodestoneDimension");
      if (var5 && var6) {
         Optional var7 = Class3271.method11790(var2);
         if (var7.isPresent() && var1.getDimensionKey() == var7.get()) {
            return NBTUtil.method29283(var2.getCompound("LodestonePos"));
         }
      }

      return null;
   }

   private double method28471(ItemFrameEntity var1) {
      Direction var4 = var1.getHorizontalFacing();
      int var5 = !var4.getAxis().method323() ? 0 : 90 * var4.getAxisDirection().getOffset();
      return (double) MathHelper.method37791(180 + var4.getHorizontalIndex() * 90 + var1.method4093() * 45 + var5);
   }

   private double method28472(Vector3d var1, Entity var2) {
      return Math.atan2(var1.getZ() - var2.getPosZ(), var1.getX() - var2.getPosX());
   }
}
