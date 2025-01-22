package com.mentalfrostbyte.jello.util.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effects;
import net.minecraft.util.MovementInput;
import mapped.RotationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class MovementUtil {
    public static Minecraft mc = Minecraft.getInstance();

   /**
    * Calculates the player's current movement speed, taking into account various factors such as sprinting, potion effects, sneaking, and being in water.
    *
    * @return The calculated movement speed as a double value.
    */
   public static double getSpeed() {
      double speed = 0.2873;
      float multiplier = 1.0F;
      ModifiableAttributeInstance var5 = mc.player.getAttribute(Attributes.MOVEMENT_SPEED);
      multiplier = (float)((double)multiplier * ((var5.getValue() / (double) mc.player.abilities.getWalkSpeed() + 1.0) / 2.0));
      if (mc.player.isSprinting()) {
         multiplier = (float)((double)multiplier - 0.15);
      }

      if (mc.player.isPotionActive(Effects.SPEED) && mc.player.isSprinting()) {
         multiplier = (float)((double)multiplier - 0.03000002 * (double)(mc.player.getActivePotionEffect(Effects.SPEED).getAmplifier() + 1));
      }

      if (mc.player.isSneaking()) {
         speed *= 0.25;
      }

      if (isInWater()) {
         speed *= 0.3;
      }

      return speed * (double)multiplier;
   }

   public static double method37076() {
      double var2 = 0.2873 + (double) getSpeedBoost() * 0.057;
      if (mc.player.isSneaking()) {
         var2 *= 0.25;
      }

      return var2;
   }

   public static double method37077() {
      double var2 = 0.2873;
      if (mc.player.isSneaking()) {
         var2 *= 0.25;
      }

      if (isInWater()) {
         var2 *= 0.3;
      }

      return var2;
   }

   public static int getSpeedBoost() {
      return ! mc.player.isPotionActive(Effects.SPEED) ? 0 : mc.player.getActivePotionEffect(Effects.SPEED).getAmplifier() + 1;
   }

   public static int getJumpBoost() {
      return ! mc.player.isPotionActive(Effects.JUMP_BOOST) ? 0 : mc.player.getActivePotionEffect(Effects.JUMP_BOOST).getAmplifier() + 1;
   }

   public static double getJumpValue() {
      return 0.42F + (double) getJumpBoost() * 0.1;
   }

   public static boolean isInWater() {
      return mc.player.isInWater();
   }

   public static float[] lenientStrafe() {
      MovementInput input = mc.player.movementInput;
      float forward = input.moveForward;
      float strafe = input.moveStrafe;
      return getAdjustedStrafe(forward, strafe);
   }

   public static float[] otherStrafe() {
      MovementInput input = mc.player.movementInput;
      float forward = input.moveForward;
      float strafe = input.moveStrafe;
      return getAdjustedStrafe2(forward, strafe);
   }

   public static float[] getAdjustedStrafe(float forward, float strafe) {
      float yaw = mc.player.rotationYaw + 90.0F;
      if (Client.getInstance().getOrientation().getAdjustedYaw() != -999.0F) {
         yaw = Client.getInstance().getOrientation().getAdjustedYaw() + 90.0F;
      }

      if (forward != 0.0F) {
         if (!(strafe >= 1.0F)) {
            if (strafe <= -1.0F) {
               yaw += (float)(!(forward > 0.0F) ? -45 : 45);
               strafe = 0.0F;
            }
         } else {
            yaw += (float)(!(forward > 0.0F) ? 45 : -45);
            strafe = 0.0F;
         }

         if (!(forward > 0.0F)) {
            if (forward < 0.0F) {
               forward = -1.0F;
            }
         } else {
            forward = 1.0F;
         }
      }

      if (Client.getInstance().getOrientation().method31742()
         && !Client.getInstance().getOrientation().method31741()
         && (mc.player.moveForward != 0.0F || mc.player.moveStrafing != 0.0F)) {
         forward = 1.0F;
      }

      return new float[]{yaw, forward, strafe};
   }

   public static float[] getAdjustedStrafe2(float var0, float var1) {
      float var4 = mc.player.rotationYaw + 90.0F;
      if (var0 == 0.0F) {
         if (var1 != 0.0F) {
            var4 += (float)(!(var1 > 0.0F) ? 90 : -90);
            var1 = 0.0F;
         }
      } else {
         if (!(var1 >= 1.0F)) {
            if (var1 <= -1.0F) {
               var4 += (float)(!(var0 > 0.0F) ? -45 : 45);
               var1 = 0.0F;
            }
         } else {
            var4 += (float)(!(var0 > 0.0F) ? 45 : -45);
            var1 = 0.0F;
         }

         if (!(var0 > 0.0F)) {
            if (var0 < 0.0F) {
               var0 = -1.0F;
               var4 -= 180.0F;
            }
         } else {
            var0 = 1.0F;
         }
      }

      return new float[]{var4, var0, var1};
   }

   public static float method37086() {
      float var2 = mc.player.moveForward;
      float var3 = mc.player.moveStrafing;
      float var4 = mc.player.rotationYaw + 90.0F;
      if (var2 > 0.0F && mc.gameSettings.keyBindBack.isKeyDown()) {
         var2 = -1.0F;
      }

      if (var3 != 0.0F && var3 > 0.0F) {
         var4 -= 90.0F;
      } else if (var3 != 0.0F && var3 < 0.0F) {
         var4 += 90.0F;
      }

      if (var2 != 0.0F) {
         if (var3 != 0.0F && var3 > 0.0F) {
            var4 -= (float)(!(var2 > 0.0F) ? 45 : -45);
         } else if (var3 != 0.0F && var3 < 0.0F) {
            var4 -= (float)(!(var2 > 0.0F) ? -45 : 45);
         }
      }

      if (var2 < 0.0F && var3 == 0.0F) {
         var4 -= 180.0F;
      }

      return var4;
   }

   public static boolean isMoving() {
      boolean var2 = mc.gameSettings.keyBindForward.isKeyDown();
      boolean var3 = mc.gameSettings.keyBindLeft.isKeyDown();
      boolean var4 = mc.gameSettings.keyBindRight.isKeyDown();
      boolean var5 = mc.gameSettings.keyBindBack.isKeyDown();
      return var2 || var3 || var4 || var5;
   }

   public static void setSpeed(EventMove moveEvent, double motionSpeed) {
      float[] var5 = lenientStrafe();
      float var6 = var5[1];
      float var7 = var5[2];
      float var8 = var5[0];
      if (var6 == 0.0F && var7 == 0.0F) {
         moveEvent.setX(0.0);
         moveEvent.setZ(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var8));
      double var11 = Math.sin(Math.toRadians((double)var8));
      double var13 = ((double)var6 * var9 + (double)var7 * var11) * motionSpeed;
      double var15 = ((double)var6 * var11 - (double)var7 * var9) * motionSpeed;
      moveEvent.setX(var13);
      moveEvent.setZ(var15);
      MultiUtilities.setPlayerXMotion(moveEvent.getX());
      MultiUtilities.setPlayerZMotion(moveEvent.getZ());
   }

   public static void method37089(EventMove var0, double var1, float var3) {
      float[] var6 = lenientStrafe();
      float var7 = var6[1];
      float var8 = var6[2];
      if (var7 == 0.0F && var8 == 0.0F) {
         var0.setX(0.0);
         var0.setZ(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var3));
      double var11 = Math.sin(Math.toRadians((double)var3));
      double var13 = var9 * var1;
      double var15 = var11 * var1;
      var0.setX(var13);
      var0.setZ(var15);
      MultiUtilities.setPlayerXMotion(var0.getX());
      MultiUtilities.setPlayerZMotion(var0.getZ());
   }

   public static void strafe(double speed) {
      float[] var4 = lenientStrafe();
      float var5 = var4[1];
      float var6 = var4[2];
      float var7 = var4[0];
      if (var5 == 0.0F && var6 == 0.0F) {
         MultiUtilities.setPlayerXMotion(0.0);
         MultiUtilities.setPlayerZMotion(0.0);
      }

      double var8 = Math.cos(Math.toRadians((double)var7));
      double var10 = Math.sin(Math.toRadians((double)var7));
      double var12 = ((double)var5 * var8 + (double)var6 * var10) * speed;
      double var14 = ((double)var5 * var10 - (double)var6 * var8) * speed;
      MultiUtilities.setPlayerXMotion(var12);
      MultiUtilities.setPlayerZMotion(var14);
   }

   public static void method37091() {
      double var2 = mc.player.getPosX();
      double var4 = mc.player.getPosY();
      double var6 = mc.player.getPosZ();

      for (int var8 = 0; var8 < 49 + getJumpBoost() * 17; var8++) {
         mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var2, var4 + 0.06248, var6, false));
         mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var2, var4, var6, false));
      }

      mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var2, var4, var6, true));
   }

   public static float method37092(EventMove var0, double var1, float var3, float var4, float var5) {
      float var8 = RotationHelper.angleDiff(var4, var3);
      if (!(var8 > var5)) {
         var4 = var3;
      } else {
         var4 += !(MathHelper.wrapDegrees(var3 - var4) > 0.0F) ? -var5 : var5;
      }

      float var9 = (var4 - 90.0F) * (float) (Math.PI / 180.0);
      var0.setX((double)(-MathHelper.sin(var9)) * var1);
      var0.setZ((double) MathHelper.cos(var9) * var1);
      MultiUtilities.setPlayerXMotion(var0.getX());
      MultiUtilities.setPlayerZMotion(var0.getZ());
      return var4;
   }

   public static float method37093(double var0, float var2, float var3, float var4) {
      float var7 = RotationHelper.angleDiff(var3, var2);
      if (!(var7 > var4)) {
         var3 = var2;
      } else {
         var3 += !(MathHelper.wrapDegrees(var2 - var3) > 0.0F) ? -var4 : var4;
      }

      float var8 = (var3 - 90.0F) * (float) (Math.PI / 180.0);
      MultiUtilities.setPlayerXMotion((double)(-MathHelper.sin(var8)) * var0);
      MultiUtilities.setPlayerZMotion((double) MathHelper.cos(var8) * var0);
      return var3;
   }

   public static Vector3d method37094(boolean var0, double var1, double var3) {
      Vector3d var7 = new Vector3d(var1, (double) mc.player.moveVertical, var3);
      double var8 = var7.lengthSquared();
      float var10 = 0.6F;
      double var11 = !var0 ? (double) mc.player.jumpMovementFactor : (double)(mc.player.getAIMoveSpeed() * (0.21600002F / (var10 * var10 * var10)));
      Vector3d var13 = (!(var8 > 1.0) ? var7 : var7.method11333()).scale(var11);
      float var14 = MathHelper.sin(mc.player.rotationYaw * (float) (Math.PI / 180.0));
      float var15 = MathHelper.cos(mc.player.rotationYaw * (float) (Math.PI / 180.0));
      return new Vector3d(
         var13.x * (double)var15 - var13.z * (double)var14,
         var13.y,
         var13.z * (double)var15 + var13.x * (double)var14
      );
   }

   public static void method37095(double var0) {
      double forward = (double) mc.player.movementInput.moveForward;
      double strafe = (double) mc.player.movementInput.moveStrafe;
      float yaw = mc.player.rotationYaw;
      if (forward != 0.0) {
         if (!(strafe > 0.0)) {
            if (strafe < 0.0) {
               yaw += (float)(!(forward > 0.0) ? -45 : 45);
            }
         } else {
            yaw += (float)(!(forward > 0.0) ? 45 : -45);
         }

         strafe = 0.0;
         if (!(forward > 0.0)) {
            if (forward < 0.0) {
               forward = -1.0;
            }
         } else {
            forward = 1.0;
         }
      }

      double var9 = mc.player.getPosX();
      double var11 = mc.player.getPosY();
      double var13 = mc.player.getPosZ();
      double var15 = forward * var0 * Math.cos(Math.toRadians((double)(yaw + 90.0F))) + strafe * var0 * Math.sin(Math.toRadians((double)(yaw + 90.0F)));
      double var17 = forward * var0 * Math.sin(Math.toRadians((double)(yaw + 90.0F))) - strafe * var0 * Math.cos(Math.toRadians((double)(yaw + 90.0F)));
      mc.player.setPosition(var9 + var15, var11, var13 + var17);
   }
}
