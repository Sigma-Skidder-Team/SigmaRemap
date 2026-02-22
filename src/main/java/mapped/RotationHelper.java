package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;

public class RotationHelper {
    private static final Minecraft mc = Minecraft.getInstance();

    public static float clampYawPitchChange(float currentAngle, float targetAngle, float maxStep) {
        var delta = MathHelper.wrapDegrees(targetAngle - currentAngle);
        if (delta > maxStep) {
            delta = maxStep;
        }
        if (delta < -maxStep) {
            delta = -maxStep;
        }
        return currentAngle + delta;
    }

    public static float[] getRotationsToEntityInterpolated(Entity target) {
        var playerX = mc.player.getPosX() + (mc.player.getPosX() - mc.player.lastTickPosX) * (double) mc.getRenderPartialTicks();
        var playerZ = mc.player.getPosZ() + (mc.player.getPosZ() - mc.player.lastTickPosZ) * (double) mc.getRenderPartialTicks();
        var playerY = mc.player.getPosY() + (mc.player.getPosY() - mc.player.lastTickPosY) * (double) mc.getRenderPartialTicks();
        return getRotationsToEntityFrom(target, playerX, playerY, playerZ);
    }

    public static float[] getRotationsToEntityFrom(Entity target, double playerX, double playerY, double playerZ) {
        var targetX = target.getPosX() + (target.getPosX() - target.lastTickPosX) * mc.getRenderPartialTicks();
        var targetZ = target.getPosZ() + (target.getPosZ() - target.lastTickPosZ) * mc.getRenderPartialTicks();
        var targetY = target.getPosY() + (target.getPosY() - target.lastTickPosY) * mc.getRenderPartialTicks();

        var deltaX = targetX - playerX;
        var deltaZ = targetZ - playerZ;
        var deltaY = targetY - mc.player.getEyeHeight() - 0.02F + target.getEyeHeight() - playerY;

        var horizontalDistance = MathHelper.sqrt(deltaX * deltaX + deltaZ * deltaZ);

        var yaw = clampYawPitchChange(
                mc.player.rotationYaw,
                (float) (Math.atan2(deltaZ, deltaX) * 180.0 / Math.PI) - 90.0F,
                360.0F
        );
        var pitch = clampYawPitchChange(
                mc.player.rotationPitch,
                (float) (-(Math.atan2(deltaY, horizontalDistance) * 180.0 / Math.PI)),
                360.0F
        );

        return new float[]{yaw, pitch};
    }

    public static float getSignedAngleDelta(float fromAngle, float toAngle) {
        var diff = Math.abs(fromAngle - toAngle) % 360.0F;
        var shortest = diff > 180.0F ? 360.0F - diff : diff;

        var raw = fromAngle - toAngle;
        var sign = (raw >= 0.0F && raw <= 180.0F) || (raw <= -180.0F && raw >= -360.0F) ? -1 : 1;

        return shortest * (float) sign;
    }

    public static float getAngleDistance(float a, float b) {
        var diff = Math.abs(a - b) % 360.0F;
        return diff > 180.0F ? 360.0F - diff : diff;
    }

    public static float[] getRotationsToCoordinates(double x, double z, double y) {
        var deltaX = x - mc.player.getPosX();
        var deltaZ = z - mc.player.getPosZ();
        var deltaY = y - mc.player.getPosY() - 1.2;

        var horizontalDistance = MathHelper.sqrt(deltaX * deltaX + deltaZ * deltaZ);

        var yaw = (float) (Math.atan2(deltaZ, deltaX) * 180.0 / Math.PI) - 90.0F;
        var pitch = (float) (-(Math.atan2(deltaY, horizontalDistance) * 180.0 / Math.PI));

        return new float[]{yaw, pitch};
    }

    public static float[] getRotationsBetween(Vector3d from, Vector3d to) {
        var dx = to.x - from.x;
        var dz = to.z - from.z;
        var dy = to.y - from.y;

        var horizontalDistance = MathHelper.sqrt(dx * dx + dz * dz);

        var yaw = clampYawPitchChange(0.0F, (float) (Math.atan2(dz, dx) * 180.0 / Math.PI) - 90.0F, 360.0F);
        var pitch = clampYawPitchChange(mc.player.rotationPitch, (float) (-(Math.atan2(dy, horizontalDistance) * 180.0 / Math.PI)), 360.0F);

        return new float[]{yaw, pitch};
    }

    public static float[] getLeadRotationsToEntity(LivingEntity target) {
        var playerX = mc.player.getPosX() + (mc.player.getPosX() - mc.player.lastTickPosX) * (double) mc.getRenderPartialTicks();
        var playerZ = mc.player.getPosZ() + (mc.player.getPosZ() - mc.player.lastTickPosZ) * (double) mc.getRenderPartialTicks();
        var playerY = mc.player.getPosY() + (mc.player.getPosY() - mc.player.lastTickPosY) * (double) mc.getRenderPartialTicks();

        var targetX = target.getPosX() + (target.getPosX() - target.lastTickPosX) * (double) mc.getRenderPartialTicks();
        var targetZ = target.getPosZ() + (target.getPosZ() - target.lastTickPosZ) * (double) mc.getRenderPartialTicks();
        var targetY = target.getPosY() + (target.getPosY() - target.lastTickPosY) * (double) mc.getRenderPartialTicks();

        var targetMotionX = (targetX - target.lastTickPosX) * 0.4;
        var targetMotionZ = (targetZ - target.lastTickPosZ) * 0.4;

        var distance = mc.player.getDistance(target);
        distance -= distance % 0.8f;

        var sprintMultiplier = target.isSprinting() ? 1.25 : 1.0;
        var leadX = distance / 0.8 * targetMotionX * sprintMultiplier;
        var leadZ = distance / 0.8 * targetMotionZ * sprintMultiplier;

        var dx = targetX + leadX - playerX;
        var dz = targetZ + leadZ - playerZ;
        var dy = playerY + (double) mc.player.getEyeHeight() - (targetY + (double) target.getHeight());

        var targetDistance = mc.player.getDistance(target);
        var yaw = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0F;

        var horizontalDistance = MathHelper.sqrt(dx * dx + dz * dz);
        var pitch = (float) (-(Math.atan2(dy, horizontalDistance) * 180.0 / Math.PI)) + (float) targetDistance * 0.14F;

        return new float[]{yaw, -pitch};
    }

    public static Rotations getRotationsToEntity(Entity target) {
        var angles = getRotationsToEntityFrom(target, mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        return new Rotations(angles[0], angles[1]);
    }

    public static Rotations getRotationsToVector(Vector3d target) {
        var from = mc.player.getPositionVec().add(0.0, (double) mc.player.getEyeHeight(), 0.0);
        var angles = getRotationsBetween(from, target);
        return new Rotations(angles[0], angles[1]);
    }

    public static boolean canSeeVector(Vector3d target) {
        var from = new Vector3d(
                mc.player.getPosX(),
                mc.player.getPosY() + (double) mc.player.getEyeHeight(),
                mc.player.getPosZ()
        );

        var context = new RayTraceContext(from, target, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, mc.player);
        BlockRayTraceResult result = mc.world.rayTraceBlocks(context);

        return result.getType() == RayTraceResult.Type.MISS || result.getType() == RayTraceResult.Type.ENTITY;
    }

    public static Rotations getRotationsToTarget(Entity target, boolean allowThroughWalls) {
        var preferredAimPoint = MultiUtilities.getBestVisiblePoint(target);

        if (allowThroughWalls && !canSeeVector(preferredAimPoint)) {
            for (int verticalIndex = -1; verticalIndex < 2; verticalIndex++) {
                var yOffset = (double) verticalIndex;
                if (verticalIndex != -1) {
                    yOffset *= target.boundingBox.getYSize();
                } else {
                    yOffset = target.getEyeHeight() - 0.02F;
                }

                var x = target.getPosX();
                var z = target.getPosZ();
                var y = target.getPosY() + yOffset + 0.05;

                var dx = x - mc.player.getPosX();
                var dz = z - mc.player.getPosZ();
                var dy = y - (double) mc.player.getEyeHeight() - 0.02F - mc.player.getPosY();

                var horizontalDistance = MathHelper.sqrt(dx * dx + dz * dz);

                var yaw = clampYawPitchChange(
                        mc.player.rotationYaw,
                        (float) (Math.atan2(dz, dx) * 180.0 / Math.PI) - 90.0F,
                        360.0F
                );
                var pitch = clampYawPitchChange(
                        mc.player.rotationPitch,
                        (float) (-(Math.atan2(dy, horizontalDistance) * 180.0 / Math.PI)),
                        360.0F
                );

                if (canSeeVector(new Vector3d(x, y, z))) {
                    return new Rotations(yaw, pitch);
                }

                for (int side = -1; side < 2; side += 2) {
                    x = target.getPosX() + (target.getPosX() - target.lastTickPosX) * (double) mc.getRenderPartialTicks();
                    z = target.getPosZ() + (target.getPosZ() - target.lastTickPosZ) * (double) mc.getRenderPartialTicks();
                    y = target.getPosY() + 0.05 + (target.getPosY() - target.lastTickPosY) * (double) mc.getRenderPartialTicks() + yOffset;

                    var halfX = target.boundingBox.getXSize() / 2.5 * (double) side;
                    var halfZ = target.boundingBox.getZSize() / 2.5 * (double) side;

                    if (mc.player.getPosX() < x + halfX) {
                        if (mc.player.getPosZ() > z + halfZ) {
                            x += halfX;
                        } else {
                            x -= halfX;
                        }

                        if (mc.player.getPosX() < x - halfX) {
                            z += halfZ;
                        } else {
                            z -= halfZ;
                        }
                    } else if (mc.player.getPosX() > x + halfX) {
                        if (mc.player.getPosZ() < z - halfZ) {
                            x += halfX;
                        } else {
                            x -= halfX;
                        }

                        if (mc.player.getPosX() > x + halfX) {
                            z -= halfZ;
                        } else {
                            z += halfZ;
                        }
                    } else {
                        if (mc.player.getPosZ() > z + halfZ) {
                            x += halfX;
                        } else {
                            x -= halfX;
                        }

                        if (mc.player.getPosX() < x - halfX) {
                            z -= halfZ;
                        } else {
                            z += halfZ;
                        }
                    }

                    dx = x - mc.player.getPosX();
                    dz = z - mc.player.getPosZ();
                    dy = y - (double) mc.player.getEyeHeight() - 0.02 - mc.player.getPosY();
                    horizontalDistance = MathHelper.sqrt(dx * dx + dz * dz);

                    yaw = clampYawPitchChange(
                            mc.player.rotationYaw,
                            (float) (Math.atan2(dz, dx) * 180.0 / Math.PI) - 90.0F,
                            360.0F
                    );
                    pitch = clampYawPitchChange(
                            mc.player.rotationPitch,
                            (float) (-(Math.atan2(dy, horizontalDistance) * 180.0 / Math.PI)),
                            360.0F
                    );

                    if (canSeeVector(new Vector3d(x, y, z))) {
                        return new Rotations(yaw, pitch);
                    }
                }
            }

            return null;
        }

        return getRotationsToVector(preferredAimPoint);
    }

    public static float getWrappedAngleDelta(float fromAngle, float toAngle) {
        return MathHelper.wrapDegrees(-(fromAngle - toAngle));
    }
}
