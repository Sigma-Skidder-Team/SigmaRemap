package com.mentalfrostbyte.jello.util.world;

import com.google.common.collect.ImmutableList;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SnowBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlockUtil {
    private static final Minecraft mc = Minecraft.getInstance();

    public static boolean isBlockWithinReach(PlayerEntity player, BlockPos blockPos) {
        return getCenteredDistanceToEntity(player, blockPos) < getReachDist();
    }

    public static Block getBlockAt(BlockPos blockPos) {
        return mc.world.getBlockState(blockPos).getBlock();
    }

    public static boolean isBlockedPlacementPosition(Block block, BlockPos pos) {
        VoxelShape collisionShape = block.getDefaultState().getCollisionShape(mc.world, pos);
        return !isValidBlockPosition(pos)
                && mc.world.checkNoEntityCollision(mc.player, collisionShape)
                && pos.getY() <= mc.player.getPosition().getY();
    }

    public static List<BlockPos> sortBlockPositionsByDistanceToPlayer(List<BlockPos> positions) {
        positions.sort((first, second) -> {
            float distanceFirst = getCenteredDistanceToEntity(mc.player, first);
            float distanceSecond = getCenteredDistanceToEntity(mc.player, second);

            if (distanceFirst < distanceSecond) {
                return -1; // nearer first
            } else if (distanceFirst > distanceSecond) {
                return 1; // farther later
            }

            return 0;
        });

        return positions;
    }

    public static List<Entity> sortEntitiesByDistanceAscending(List<Entity> entities) {
        Collections.sort(entities, new NearestEntityComparator());
        return entities;
    }

    public static List<PlayerEntity> sortPlayersByDistanceDescending(List<PlayerEntity> players) {
        Collections.sort(players, new FarthestPlayerComparator());
        return players;
    }

    public static float getCenteredDistanceToEntity(Entity entity, BlockPos pos) {
        return getCenteredDistanceToEntity(entity, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    public static float getCenteredDistanceToEntity(Entity entity, double x, double y, double z) {
        float deltaX = (float) (entity.getPosX() - x);
        float deltaY = (float) (entity.getPosY() - y);
        float deltaZ = (float) (entity.getPosZ() - z);

        return getCenteredLength3D(deltaX, deltaY, deltaZ);
    }

    public static float getCenteredDistance3D(Vector3d vec, double x, double y, double z) {
        float deltaX = (float) (vec.getX() - x);
        float deltaY = (float) (vec.getY() - y);
        float deltaZ = (float) (vec.getZ() - z);

        return getCenteredLength3D(deltaX, deltaY, deltaZ);
    }

    public static float getCenteredDistance2D(Vector3d vec, double x, double z) {
        float deltaX = (float) (vec.getX() - x);
        float deltaZ = (float) (vec.getZ() - z);

        return getCenteredLength2D(deltaX, deltaZ);
    }

    private static float getCenteredLength2D(float x, float z) {
        return MathHelper.sqrt(
                (x - 0.5F) * (x - 0.5F) +
                        (z - 0.5F) * (z - 0.5F)
        );
    }

    private static float getCenteredLength3D(float x, float y, float z) {
        return MathHelper.sqrt(
                (x - 0.5F) * (x - 0.5F) +
                        (y - 0.5F) * (y - 0.5F) +
                        (z - 0.5F) * (z - 0.5F)
        );
    }

    public static float getReachDist() {
        return mc.playerController.getBlockReachDistance();
    }

    public static List<BlockPos> getBlockPositionsAroundPlayer(float radius) {
        List<BlockPos> positions = new ArrayList<>();

        for (float offsetY = -radius; offsetY <= radius; offsetY++) {
            for (float offsetX = -radius; offsetX <= radius; offsetX++) {
                for (float offsetZ = -radius; offsetZ <= radius; offsetZ++) {
                    BlockPos pos = new BlockPos(
                            mc.player.getPosX() + (double) offsetX,
                            mc.player.getPosY() + (double) offsetY,
                            mc.player.getPosZ() + (double) offsetZ
                    );
                    positions.add(pos);
                }
            }
        }

        return positions;
    }

    public static BlockPos getBlockPosFromRayTrace(float yawDegrees, float pitchDegrees, float reachDistance) {
        BlockRayTraceResult result = rayTrace(yawDegrees, pitchDegrees, reachDistance);
        return result != null ? result.getPos() : null;
    }

    public static BlockRayTraceResult rayTraceBlocksFromFeetYaw(float yaw) {
        Vector3d start = new Vector3d(mc.player.lastReportedPosX, mc.player.lastReportedPosY - 0.8F, mc.player.lastReportedPosZ);
        yaw = (float) Math.toRadians((double) yaw);
        float pitch = 0.0F;
        float dirX = -MathHelper.sin(yaw) * MathHelper.cos(pitch);
        float dirZ = MathHelper.cos(yaw) * MathHelper.cos(pitch);
        float reach = 2.3F;
        Vector3d end = new Vector3d(
                mc.player.lastReportedPosX + (double) (dirX * reach),
                mc.player.lastReportedPosY - 0.8F - (double) (!mc.player.isJumping ? 0.0F : 0.6F),
                mc.player.lastReportedPosZ + (double) (dirZ * reach)
        );
        Entity camera = mc.getRenderViewEntity();
        return mc.world.rayTraceBlocks(new RayTraceContext(start, end, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, camera));
    }

    public static BlockRayTraceResult rayTrace(float yawDeg, float pitchDeg, float reach) {
        Vector3d start = new Vector3d(
                mc.player.lastReportedPosX, mc.player.lastReportedPosY + (double) mc.player.getEyeHeight(), mc.player.lastReportedPosZ
        );
        yawDeg = (float) Math.toRadians(yawDeg);
        pitchDeg = (float) Math.toRadians(pitchDeg);
        float dirX = -MathHelper.sin(yawDeg) * MathHelper.cos(pitchDeg);
        float dirY = -MathHelper.sin(pitchDeg);
        float dirZ = MathHelper.cos(yawDeg) * MathHelper.cos(pitchDeg);
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

    public static RayTraceResult rayTraceBlocksFromEye(float yaw, float pitch, float reach, float forwardOffset) {
        double offsetX = Math.cos((double) MovementUtil.getMovementDirectionYaw() * Math.PI / 180.0) * (double) forwardOffset;
        double offsetZ = Math.sin((double) MovementUtil.getMovementDirectionYaw() * Math.PI / 180.0) * (double) forwardOffset;
        Vector3d start = new Vector3d(
                mc.player.getPosX() + offsetX,
                mc.player.getPosY() + (double) mc.player.getEyeHeight(),
                mc.player.getPosZ() + offsetZ
        );
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
        Entity cameraEntity = mc.getRenderViewEntity();
        return mc.world.rayTraceBlocks(new RayTraceContext(start, end, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, cameraEntity));
    }

    public static RayTraceResult method34570(BlockPos pos) {
        Vector3d start = new Vector3d(
                mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ()
        );
        Vector3d end = new Vector3d(
                (double) pos.getX() + 0.5 + RandomUtils.nextDouble(0.01, 0.04),
                (double) pos.getY(),
                (double) pos.getZ() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)
        );
        return mc.world.rayTraceBlocks(new RayTraceContext(start, end, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, mc.getRenderViewEntity()));
    }

    public static Vector3d getRandomHitVecOnFace(Direction face, BlockPos blockPos) {
        float positiveXOffset = (float) Math.max(0, face.getXOffset());
        float positiveZOffset = (float) Math.max(0, face.getZOffset());

        float x = (float) blockPos.getX()
                + positiveXOffset
                + (face.getXOffset() != 0 ? 0.0F : (float) Math.random());

        float y = (float) blockPos.getY()
                + (face.getYOffset() != 0
                ? (face.getYOffset() == 1 ? 1.0F : 0.0F)
                : (float) Math.random());

        float z = (float) blockPos.getZ()
                + positiveZOffset
                + (face.getZOffset() != 0 ? 0.0F : (float) Math.random());

        return new Vector3d((double) x, (double) y, (double) z);
    }

    public static int getBlockStateIndex(BlockState state) {
        Block block = state.getBlock();
        StateContainer stateManager = block.getStateContainer();
        ImmutableList<?> states = stateManager.getValidStates();
        return states.indexOf(state);
    }

    public static PositionFacing findPlaceableNeighbor(BlockPos pos, boolean disallowDownFace) {
        Vector3i[] baseOffsets = new Vector3i[]{
                new Vector3i(0, 0, 0), new Vector3i(-1, 0, 0), new Vector3i(1, 0, 0), new Vector3i(0, 0, 1), new Vector3i(0, 0, -1)
        };
        PlacementPattern[] searchPatterns = new PlacementPattern[]{
                new PlacementPattern(1, 1, 1, false),
                new PlacementPattern(2, 1, 2, false),
                new PlacementPattern(3, 1, 3, false),
                new PlacementPattern(4, 1, 4, false),
                new PlacementPattern(0, -1, 0, true)
        };

        for (PlacementPattern pattern : searchPatterns) {
            for (Vector3i baseOffset : baseOffsets) {
                Vector3i candidateOffset = !pattern.isAdditive
                        ? new Vector3i(baseOffset.getX() * pattern.offsetX, baseOffset.getY() * pattern.offsetY, baseOffset.getZ() * pattern.offsetZ)
                        : new Vector3i(baseOffset.getX() + pattern.offsetX, baseOffset.getY() + pattern.offsetY, baseOffset.getZ() + pattern.offsetZ);

                for (Direction face : Direction.values()) {
                    if ((face != Direction.DOWN || !disallowDownFace) && isValidBlockPosition(pos.add(candidateOffset).offset(face, -1))) {
                        return new PositionFacing(pos.add(candidateOffset).offset(face, -1), face);
                    }
                }
            }
        }

        return null;
    }

    public static boolean isValidBlockPosition(BlockPos pos) {
        if (pos != null) {
            Block block = mc.world.getBlockState(pos).getBlock();
            return !block.getDefaultState().isSolid() && block.getDefaultState().getMaterial().isReplaceable()
                    ? false
                    : !(block instanceof SnowBlock) || getBlockStateIndex(mc.world.getBlockState(pos)) != 0;
        } else {
            return false;
        }
    }

    public static Minecraft getMC() {
        return mc;
    }

    public static double[] getExtend(float extend) {
        double startX = mc.player.getPosX();
        double startZ = mc.player.getPosZ();
        double forward = mc.player.movementInput.moveForward;
        double strafe = mc.player.movementInput.moveStrafe;
        float yaw = mc.player.rotationYaw;
        BlockPos belowCandidate = new BlockPos(startX, mc.player.getPosY() - 1.0, startZ);
        double candidateX = startX;
        double candidateZ = startZ;
        double stepIndex = 0.0;

        for (double maxSteps = extend * 2.0F;
             isValidBlockPosition(belowCandidate);
             belowCandidate = new BlockPos(candidateX, mc.player.getPosY() - 1.0, candidateZ)
        ) {
            if (++stepIndex > maxSteps) {
                stepIndex = maxSteps;
            }

            candidateX = startX
                    + (forward * 0.45 * Math.cos(Math.toRadians(yaw + 90.0F)) + strafe * 0.45 * Math.sin(Math.toRadians(yaw + 90.0F))) * stepIndex;
            candidateZ = startZ
                    + (forward * 0.45 * Math.sin(Math.toRadians(yaw + 90.0F)) - strafe * 0.45 * Math.cos(Math.toRadians(yaw + 90.0F))) * stepIndex;
            if (stepIndex == maxSteps) {
                break;
            }
        }

        return new double[]{candidateX, candidateZ};
    }
}
