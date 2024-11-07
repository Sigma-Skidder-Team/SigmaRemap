package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.*;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import lol.ClientColors;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Nuker extends Module {
    private BlockPos targetBlock;
    private List<BlockPos> blocksToDestroy;

    public Nuker() {
        super(ModuleCategory.WORLD, "Nuker", "Destroys blocks around you");
        registerSetting(new NumberSetting<>("Range", "Range value for nuker", 6.0F, Float.class, 2.0F, 10.0F, 1.0F));
        registerSetting(new ModeSetting("Mode", "Mode", 0, "All", "One hit", "Bed", "Egg"));
        registerSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", false));
        registerSetting(new BooleanListSetting("Blocks", "Blocks to destroy", true));
        this.registerSetting(new ColorSetting("Color", "The rendered block color", ClientColors.MID_GREY.getColor, true));    }

    public static void destroyBlock(BlockPos blockPos) {
        mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, blockPos, Direction.UP));
        mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, blockPos, Direction.UP));
        mc.world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
    }

    @EventTarget
    private void onUpdate(EventUpdate event) {
        if (isEnabled() && event.isPre()) {
            blocksToDestroy = findBlocksToDestroy(getNumberValueBySettingName("Range") / 2.0F);
            if (blocksToDestroy.isEmpty()) {
                targetBlock = null;
            } else if (mc.playerController.getCurrentGameType() != GameType.CREATIVE) {
                if (targetBlock != null) {
                    if (mc.world.getBlockState(targetBlock).isAir() || playerTooFar(targetBlock)) {
                        targetBlock = blocksToDestroy.get(0);
                    }
                    setRotation(event, targetBlock);
                    handleBlockInteraction(event);
                } else {
                    targetBlock = blocksToDestroy.get(0);
                    setRotation(event, targetBlock);
                    handleBlockInteraction(event);
                }
            } else {
                destroyAllBlocks();
            }
        }
    }

    private boolean playerTooFar(BlockPos blockPos) {
        return Math.sqrt(mc.player.getDistanceSq(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5)) > 6.0;
    }

    private void setRotation(EventUpdate event, BlockPos blockPos) {
        float[] rotations = RotationHelper.method34144(blockPos.getX(), blockPos.getZ(), blockPos.getY());
        event.setYaw(rotations[0]);
        event.setPitch(rotations[1]);
    }

    private void handleBlockInteraction(EventUpdate event) {
        EventKeyPress keyPressEvent = new EventKeyPress(0, false, targetBlock);
        Client.getInstance().getEventManager().call(keyPressEvent);
        mc.playerController.onPlayerDamageBlock(targetBlock, BlockUtil.method34580(targetBlock));
        if (!getBooleanValueFromSettingName("NoSwing")) {
            mc.player.swingArm(Hand.MAIN_HAND);
        } else {
            mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
        }
    }

    private void destroyAllBlocks() {
        for (BlockPos blockPos : blocksToDestroy) {
            mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, blockPos, BlockUtil.method34580(blockPos)));
            if (!getBooleanValueFromSettingName("NoSwing")) {
                mc.player.swingArm(Hand.MAIN_HAND);
            } else {
                mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
            }
        }
    }

    @EventTarget
    public void onRender(Render3DEvent event) {
        if (targetBlock != null && !mc.world.getBlockState(targetBlock).isAir()) {
            int color = MultiUtilities.applyAlpha(parseSettingValueToIntBySettingName("Color"), 0.4F);
            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            renderBlockOutline(targetBlock, color);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glPopMatrix();
        }
    }

    private void renderBlockOutline(BlockPos blockPos, int color) {
        double x = blockPos.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
        double y = blockPos.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
        double z = blockPos.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
        AxisAlignedBB boundingBox = mc.world.getBlockState(blockPos).method23414(mc.world, blockPos).getBoundingBox();
        Box3D box = new Box3D(
                x + boundingBox.minX, y + boundingBox.minY, z + boundingBox.minZ,
                x + boundingBox.maxX, y + boundingBox.maxY, z + boundingBox.maxZ
        );
        RenderUtil.render3DColoredBox(box, color);
    }

    private boolean isReplaceable(BlockPos blockPos) {
        Block block = mc.world.getBlockState(blockPos).getBlock();
        return mc.world.getBlockState(blockPos).getMaterial().isReplaceable() || block instanceof BushBlock;
    }

    private List<BlockPos> findBlocksToDestroy(float range) {
        ArrayList<BlockPos> validBlocks = new ArrayList<>();
        for (float y = range + 2.0F; y >= -range + 1.0F; y--) {
            for (float x = -range; x <= range; x++) {
                for (float z = -range; z <= range; z++) {
                    BlockPos blockPos = new BlockPos(mc.player.getPosX() + x, mc.player.getPosY() + y, mc.player.getPosZ() + z);
                    if (isValidBlock(blockPos, range)) {
                        String mode = getStringSettingValueByName("Mode");
                        if (isBlockTypeValid(mode, blockPos)) {
                            validBlocks.add(blockPos);
                        }
                    }
                }
            }
        }
        return validBlocks;
    }

    private boolean isValidBlock(BlockPos blockPos, float range) {
        return !mc.world.getBlockState(blockPos).isAir() &&
                mc.world.getBlockState(blockPos).getFluidState().isEmpty() &&
                Math.sqrt(mc.player.getDistanceSq(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5)) < range;
    }

    private boolean isBlockTypeValid(String mode, BlockPos blockPos) {
        switch (mode) {
            case "One hit":
                return !isReplaceable(blockPos);
            case "Bed":
                return mc.world.getBlockState(blockPos).getBlock() instanceof Class3250;
            case "Egg":
                return mc.world.getBlockState(blockPos).getBlock() instanceof Class3214;
            default:
                return true;
        }
    }
}
