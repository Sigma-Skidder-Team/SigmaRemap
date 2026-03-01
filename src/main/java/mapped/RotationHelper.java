package mapped;

import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
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

    public static float getDirection(float yaw) {
        float directionDegrees = 0.0F;
        float strafe = Module.mc.player.moveStrafing;
        float forward = Module.mc.player.moveForward;
        if (!(strafe > 0.0F)) {
            if (strafe < 0.0F) {
                if (!(forward > 0.0F)) {
                    if (!(forward < 0.0F)) {
                        yaw += 90.0F;
                    } else {
                        yaw -= 45.0F;
                    }
                } else {
                    yaw += 45.0F;
                }
            }
        } else if (!(forward > 0.0F)) {
            if (!(forward < 0.0F)) {
                yaw -= 90.0F;
            } else {
                yaw += 45.0F;
            }
        } else {
            yaw -= 45.0F;
        }

        if (yaw >= 45.0F && yaw <= 135.0F) {
            directionDegrees = 90.0F;
        } else if (yaw >= 135.0F || yaw <= -135.0F) {
            directionDegrees = 180.0F;
        } else if (yaw <= -45.0F && yaw >= -135.0F) {
            directionDegrees = -90.0F;
        } else if (yaw >= -45.0F && yaw <= 45.0F) {
            directionDegrees = 0.0F;
        }

        if (forward < 0.0F) {
            directionDegrees -= 180.0F;
        }

        return directionDegrees + 90.0F;
    }

    public static float[] getBlockCenterRotations(BlockPos blockPos) {
        double dX = (double) blockPos.getX() + 0.5 - Minecraft.getInstance().player.getPosX();
        double dY = (double) blockPos.getY() - 0.25 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight());
        double dZ = (double) blockPos.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ();
        double dist = (double) MathHelper.sqrt(dX * dX + dZ * dZ);

        float yaw = (float) (Math.atan2(dZ, dX) * 180.0 / Math.PI) - 90.0F;
        float pitch = (float) (-(Math.atan2(dY, dist) * 180.0 / Math.PI));

        return new float[]{
                Minecraft.getInstance().player.rotationYaw + MathHelper.wrapDegrees(yaw - Minecraft.getInstance().player.rotationYaw),
                Minecraft.getInstance().player.rotationPitch + MathHelper.wrapDegrees(pitch - Minecraft.getInstance().player.rotationPitch)
        };
    }

    public static float[] getBlockPlacementRotations(BlockPos blockPos, Direction face) {
        float offsetX = 0.0F;
        float offsetZ = 0.0F;
        float offsetY = 0.0F;

        switch (face) {
            case EAST:
                offsetX += 0.49F;
                break;
            case NORTH:
                offsetZ -= 0.49F;
                break;
            case SOUTH:
                offsetZ += 0.49F;
                break;
            case WEST:
                offsetX -= 0.49F;
                break;
            case UP:
                offsetY += 0.0F;
            case DOWN:
                offsetY++;
        }

        double dX = (double) blockPos.getX() + 0.5 - Minecraft.getInstance().player.getPosX() + (double) offsetX;
        double dY = (double) blockPos.getY()
                - 0.02
                - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
                + (double) offsetY;
        double dZ = (double) blockPos.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double) offsetZ;

        double dist = MathHelper.sqrt(dX * dX + dZ * dZ);

        float yaw = (float) (Math.atan2(dZ, dX) * 180.0 / Math.PI) - 90.0F;
        float pitch = (float) (-(Math.atan2(dY, dist) * 180.0 / Math.PI));

        return new float[]{
                Minecraft.getInstance().player.rotationYaw + MathHelper.wrapDegrees(yaw - Minecraft.getInstance().player.rotationYaw),
                Minecraft.getInstance().player.rotationPitch + MathHelper.wrapDegrees(pitch - Minecraft.getInstance().player.rotationPitch)
        };
    }

    public static float[] getBlockRotations(BlockPos targetPos, Direction direction) {
        float offsetX = 0.0F;
        float offsetZ = 0.0F;
        float offsetY = (float) (0.4F + Math.random() * 0.1F);
        switch (direction) {
            case EAST: //east
                offsetX += 0.49F;
                break;
            case NORTH: //north
                offsetZ -= 0.49F;
                break;
            case SOUTH: //south
                offsetZ += 0.49F;
                break;
            case WEST: //west
                offsetX -= 0.49F;
                break;
            case UP: //up
                offsetY = 0.0F;
                offsetX = 0.26F - (float) (Math.random() * 0.2F);
                offsetZ = 0.26F - (float) (Math.random() * 0.2F);
            case DOWN: //down
                offsetY = 1.0F;
                offsetX = 0.26F - (float) (Math.random() * 0.2F);
                offsetZ = 0.26F - (float) (Math.random() * 0.2F);
        }

        if (offsetX == 0.0F) {
            offsetX = (float) (0.1F - Math.sin((double) (System.currentTimeMillis() - 500L) / 1200.0) * 0.2);
        }

        if (offsetZ == 0.0F) {
            offsetZ = (float) (0.1F - Math.sin((double) (System.currentTimeMillis() - 500L) / 1000.0) * 0.2);
        }

        if (offsetY == 0.0F) {
            offsetY = (float) (0.6F - Math.sin((double) (System.currentTimeMillis() - 500L) / 1600.0) * 0.2);
        }

        double dX = (double) targetPos.getX() + 0.5 - Minecraft.getInstance().player.getPosX() + (double) offsetX;
        double dY = (double) targetPos.getY()
                - 0.02
                - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
                + (double) offsetY;
        double dZ = (double) targetPos.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double) offsetZ;
        double dist = (double) MathHelper.sqrt(dX * dX + dZ * dZ);
        float targetYaw = (float) (Math.atan2(dZ, dX) * 180.0 / Math.PI) - 90.0F;
        float targetPitch = (float) (-(Math.atan2(dY, dist) * 180.0 / Math.PI));
        return new float[]{
                Minecraft.getInstance().player.rotationYaw + MathHelper.wrapDegrees(targetYaw - Minecraft.getInstance().player.rotationYaw),
                Minecraft.getInstance().player.rotationPitch + MathHelper.wrapDegrees(targetPitch - Minecraft.getInstance().player.rotationPitch)
        };
    }

    public static BlockRayTraceResult rayTraceBlocksFromRotations(float yaw, float pitch, float reach, EventUpdate event) {
        Vector3d start = new Vector3d(event.getX(), (double) mc.player.getEyeHeight() + event.getY(), event.getZ());
        yaw = (float) Math.toRadians((double) yaw);
        pitch = (float) Math.toRadians((double) pitch);
        float dirX = -MathHelper.sin(yaw) * MathHelper.cos(pitch);
        float dirY = -MathHelper.sin(pitch);
        float dirZ = MathHelper.cos(yaw) * MathHelper.cos(pitch);
        if (reach == 0.0F) {
            reach = mc.playerController.getBlockReachDistance();
        }

        Vector3d end = new Vector3d(
                mc.player.lastReportedPosX + (double) (dirX * reach),
                mc.player.lastReportedPosY + (double) (dirY * reach) + (double) mc.player.getEyeHeight(),
                mc.player.lastReportedPosZ + (double) (dirZ * reach)
        );
        Entity camera = mc.getRenderViewEntity();
        return mc.world.rayTraceBlocks(new RayTraceContext(start, end, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, camera));
    }

    public static Direction getCardinalDirectionToBlock(BlockPos blockPos) {
        // Uses rotations to the block (via UP face) to infer which cardinal direction the player is facing relative to it.
        // Default to UP if pitch is very steep.
        Direction direction = Direction.UP;

        float yawToBlock = MathHelper.wrapDegrees(getBlockFaceRotations(blockPos, Direction.UP)[0]);

        if (yawToBlock >= 45.0F && yawToBlock <= 135.0F) {
            direction = Direction.EAST;
        } else if ((yawToBlock >= 135.0F && yawToBlock <= 180.0F) || (yawToBlock <= -135.0F && yawToBlock >= -180.0F)) {
            direction = Direction.SOUTH;
        } else if (yawToBlock <= -45.0F && yawToBlock >= -135.0F) {
            direction = Direction.WEST;
        } else if ((yawToBlock >= -45.0F && yawToBlock <= 0.0F) || (yawToBlock >= 0.0F && yawToBlock <= 45.0F)) {
            direction = Direction.NORTH;
        }

        // If looking almost straight up/down, return UP.
        float pitchToBlock = MathHelper.wrapDegrees(getBlockFaceRotations(blockPos, Direction.UP)[1]);
        if (pitchToBlock > 75.0F || pitchToBlock < -75.0F) {
            direction = Direction.UP;
        }

        return direction;
    }

    public static float[] getBlockFaceRotations(BlockPos blockPos, Direction face) {
        // Horizontal delta to the center of the targeted face
        double deltaX =
                (double) blockPos.getX() + 0.5
                        - mc.player.getPosX()
                        + (double) face.getXOffset() / 2.0;

        double deltaZ =
                (double) blockPos.getZ() + 0.5
                        - mc.player.getPosZ()
                        + (double) face.getZOffset() / 2.0;

        // Vertical delta from player eye position to block center
        double deltaY =
                mc.player.getPosY() + (double) mc.player.getEyeHeight()
                        - ((double) blockPos.getY() + 0.5);

        double horizontalDistance = (double) MathHelper.sqrt(deltaX * deltaX + deltaZ * deltaZ);

        float yaw =
                (float) (Math.atan2(deltaZ, deltaX) * 180.0 / Math.PI) - 90.0F;

        float pitch =
                (float) (Math.atan2(deltaY, horizontalDistance) * 180.0 / Math.PI);

        if (yaw < 0.0F) {
            yaw += 360.0F;
        }

        return new float[]{yaw, pitch};
    }

    public static float[] getMovementDirectionBlockRotations() {
        BlockRayTraceResult result = BlockUtil.rayTraceBlocksFromFeetYaw(MovementUtil.getMovementDirectionYaw() - 270.0F);
        if (result.getType() != RayTraceResult.Type.MISS) {
            double hitOffsetX = result.getHitVec().x - (double) result.getPos().getX();
            double hitOffsetY = result.getHitVec().z - (double) result.getPos().getZ();
            double hitOffsetZ = result.getHitVec().y - (double) result.getPos().getY();
            double dX = (double) result.getPos().getX() - Minecraft.getInstance().player.getPosX() + hitOffsetX;
            double dY = (double) result.getPos().getY()
                    - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
                    + hitOffsetZ;
            double dZ = (double) result.getPos().getZ() - Minecraft.getInstance().player.getPosZ() + hitOffsetY;
            double dist = (double) MathHelper.sqrt(dX * dX + dZ * dZ);
            float yaw = (float) (Math.atan2(dZ, dX) * 180.0 / Math.PI) - 90.0F;
            float pitch = (float) (-(Math.atan2(dY, dist) * 180.0 / Math.PI));
            return new float[]{
                    Minecraft.getInstance().player.rotationYaw + MathHelper.wrapDegrees(yaw - Minecraft.getInstance().player.rotationYaw),
                    Minecraft.getInstance().player.rotationPitch + MathHelper.wrapDegrees(pitch - Minecraft.getInstance().player.rotationPitch)
            };
        } else {
            return null;
        }
    }

    public static float method16816(float var1) {
        float var4 = 0.0F;
        float var5 = Module.mc.player.moveStrafing;
        float var6 = Module.mc.player.moveForward;
        if (!(var5 > 0.0F)) {
            if (var5 < 0.0F) {
                if (!(var6 > 0.0F)) {
                    if (!(var6 < 0.0F)) {
                        var1 += 90.0F;
                    } else {
                        var1 -= 45.0F;
                    }
                } else {
                    var1 += 45.0F;
                }
            }
        } else if (!(var6 > 0.0F)) {
            if (!(var6 < 0.0F)) {
                var1 -= 90.0F;
            } else {
                var1 += 45.0F;
            }
        } else {
            var1 -= 45.0F;
        }

        if (var1 >= 45.0F && var1 <= 135.0F) {
            var4 = 90.0F;
        } else if (var1 >= 135.0F || var1 <= -135.0F) {
            var4 = 180.0F;
        } else if (var1 <= -45.0F && var1 >= -135.0F) {
            var4 = -90.0F;
        } else if (var1 >= -45.0F && var1 <= 45.0F) {
            var4 = 0.0F;
        }

        if (var6 < 0.0F) {
            var4 -= 180.0F;
        }

        return var4 + 90.0F;
    }

    public static float getDirection23(float var1) {
        float var4 = 0.0F;
        float var5 = Module.mc.player.moveStrafing;
        float var6 = Module.mc.player.moveForward;
        if (!(var5 > 0.0F)) {
            if (var5 < 0.0F) {
                if (!(var6 > 0.0F)) {
                    if (!(var6 < 0.0F)) {
                        var1 += 90.0F;
                    } else {
                        var1 -= 45.0F;
                    }
                } else {
                    var1 += 45.0F;
                }
            }
        } else if (!(var6 > 0.0F)) {
            if (!(var6 < 0.0F)) {
                var1 -= 90.0F;
            } else {
                var1 += 45.0F;
            }
        } else {
            var1 -= 45.0F;
        }

        if (var1 >= 45.0F && var1 <= 135.0F) {
            var4 = 90.0F;
        } else if (var1 >= 135.0F || var1 <= -135.0F) {
            var4 = 180.0F;
        } else if (var1 <= -45.0F && var1 >= -135.0F) {
            var4 = -90.0F;
        } else if (var1 >= -45.0F && var1 <= 45.0F) {
            var4 = 0.0F;
        }

        if (var6 < 0.0F) {
            var4 -= 180.0F;
        }

        return var4 + 90.0F;
    }
}
