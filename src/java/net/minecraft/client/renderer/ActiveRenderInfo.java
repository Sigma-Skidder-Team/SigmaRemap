package net.minecraft.client.renderer;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.impl.render.CameraNoClip;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.IBlockReader;

public class ActiveRenderInfo {
   private boolean valid;
   private IBlockReader world;
   private Entity renderViewEntity;
   private Vector3d pos = Vector3d.ZERO;
   private final BlockPos.Mutable blockPos = new BlockPos.Mutable();
   private final Vector3f look = new Vector3f(0.0F, 0.0F, 1.0F);
   private final Vector3f up = new Vector3f(0.0F, 1.0F, 0.0F);
   private final Vector3f left = new Vector3f(1.0F, 0.0F, 0.0F);
   private float pitch;
   private float yaw;
   private final Quaternion rotation = new Quaternion(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean thirdPerson;
   private boolean thirdPersonReverse;
   private float height;
   private float previousHeight;

   public void update(IBlockReader var1, Entity var2, boolean var3, boolean var4, float var5) {
      this.valid = true;
      this.world = var1;
      this.renderViewEntity = var2;
      this.thirdPerson = var3;
      this.thirdPersonReverse = var4;
      this.method37501(var2.getYaw(var5), var2.getPitch(var5));
      this.method37502(
         MathHelper.lerp((double)var5, var2.prevPosX, var2.getPosX()),
         MathHelper.lerp((double)var5, var2.prevPosY, var2.getPosY()) + (double) MathHelper.lerp(var5, this.previousHeight, this.height),
         MathHelper.lerp((double)var5, var2.prevPosZ, var2.getPosZ())
      );
      if (!var3) {
         if (var2 instanceof LivingEntity && ((LivingEntity)var2).isSleeping()) {
            Direction var8 = ((LivingEntity)var2).getBedDirection();
            this.method37501(var8 == null ? 0.0F : var8.getHorizontalAngle() - 180.0F, 0.0F);
            this.method37500(0.0, 0.3, 0.0);
         }
      } else {
         if (var4) {
            this.method37501(this.yaw + 180.0F, -this.pitch);
         }

         this.method37500(-this.method37499(4.0), 0.0, 0.0);
      }
   }

   public void method37498() {
      if (this.renderViewEntity != null) {
         this.previousHeight = this.height;
         this.height = this.height + (this.renderViewEntity.getEyeHeight() - this.height) * 0.5F;
      }
   }

   private double method37499(double var1) {
      for (int var5 = 0; var5 < 8; var5++) {
         float var6 = (float)((var5 & 1) * 2 - 1);
         float var7 = (float)((var5 >> 1 & 1) * 2 - 1);
         float var8 = (float)((var5 >> 2 & 1) * 2 - 1);
         var6 *= 0.1F;
         var7 *= 0.1F;
         var8 *= 0.1F;
         Vector3d var9 = this.pos.add((double)var6, (double)var7, (double)var8);
         Vector3d var10 = new Vector3d(
            this.pos.x - (double)this.look.method25269() * var1 + (double)var6 + (double)var8,
            this.pos.y - (double)this.look.method25270() * var1 + (double)var7,
            this.pos.z - (double)this.look.method25271() * var1 + (double)var8
         );
         BlockRayTraceResult var11 = this.world.rayTraceBlocks(new RayTraceContext(var9, var10, RayTraceContext.BlockMode.VISUAL, RayTraceContext.FluidMode.NONE, this.renderViewEntity));
         if (var11.getType() != RayTraceResult.Type.MISS) {
            double var12 = var11.getHitVec().method11341(this.pos);
            if (var12 < var1 && !Client.getInstance().getModuleManager().getModuleByClass(CameraNoClip.class).isEnabled()) {
               var1 = var12;
            }
         }
      }

      return var1;
   }

   public void method37500(double var1, double var3, double var5) {
      double var9 = (double)this.look.method25269() * var1 + (double)this.up.method25269() * var3 + (double)this.left.method25269() * var5;
      double var11 = (double)this.look.method25270() * var1 + (double)this.up.method25270() * var3 + (double)this.left.method25270() * var5;
      double var13 = (double)this.look.method25271() * var1 + (double)this.up.method25271() * var3 + (double)this.left.method25271() * var5;
      this.method37503(new Vector3d(this.pos.x + var9, this.pos.y + var11, this.pos.z + var13));
   }

   public void method37501(float var1, float var2) {
      this.pitch = var2;
      this.yaw = var1;
      this.rotation.method31185(0.0F, 0.0F, 0.0F, 1.0F);
      this.rotation.method31182(Vector3f.YP.rotationDegrees(-var1));
      this.rotation.method31182(Vector3f.XP.rotationDegrees(var2));
      this.look.method25275(0.0F, 0.0F, 1.0F);
      this.look.method25283(this.rotation);
      this.up.method25275(0.0F, 1.0F, 0.0F);
      this.up.method25283(this.rotation);
      this.left.method25275(1.0F, 0.0F, 0.0F);
      this.left.method25283(this.rotation);
   }

   public void method37502(double var1, double var3, double var5) {
      this.method37503(new Vector3d(var1, var3, var5));
   }

   public void method37503(Vector3d var1) {
      this.pos = var1;
      this.blockPos.method8373(var1.x, var1.y, var1.z);
   }

   public Vector3d getPos() {
      return this.pos;
   }

   public BlockPos getBlockPos() {
      return this.blockPos;
   }

   public float getPitch() {
      return this.pitch;
   }

   public float getYaw() {
      return this.yaw;
   }

   public Quaternion getRotation() {
      return this.rotation;
   }

   public Entity getRenderViewEntity() {
      return this.renderViewEntity;
   }

   public boolean method37510() {
      return this.valid;
   }

   public boolean method37511() {
      return this.thirdPerson;
   }

   public FluidState method37512() {
      if (!this.valid) {
         return Fluids.EMPTY.method25049();
      } else {
         FluidState var3 = this.world.getFluidState(this.blockPos);
         return !var3.isEmpty()
               && this.pos.y >= (double)((float)this.blockPos.getY() + var3.method23475(this.world, this.blockPos))
            ? Fluids.EMPTY.method25049()
            : var3;
      }
   }

   public BlockState method37513() {
      return this.valid ? this.world.getBlockState(this.blockPos) : Blocks.AIR.getDefaultState();
   }

   public void setAnglesInternal(float var1, float var2) {
      this.yaw = var1;
      this.pitch = var2;
   }

   public BlockState method37515() {
      if (this.valid) {
         BlockState var3 = this.world.getBlockState(this.blockPos);
         if (Reflector.field42828.exists()) {
            var3 = (BlockState) Reflector.call(var3, Reflector.field42828, this.world, this.blockPos, this.pos);
         }

         return var3;
      } else {
         return Blocks.AIR.getDefaultState();
      }
   }

   public final Vector3f method37516() {
      return this.look;
   }

   public final Vector3f method37517() {
      return this.up;
   }

   public void method37518() {
      this.world = null;
      this.renderViewEntity = null;
      this.valid = false;
   }
}
