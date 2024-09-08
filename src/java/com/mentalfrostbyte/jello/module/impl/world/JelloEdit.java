package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import com.mentalfrostbyte.jello.util.world.schematics.SchematicFile;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JelloEdit extends Module {
    //private List<PositionFacing> positionFacingList;
    private SchematicFile schematicFile;
    private BlockPos pos;
    private BlockPos currentPosition;
    private List<String> schematicNameList = new ArrayList<>();
    private int currentIndex;

    public JelloEdit() {
        super(ModuleCategory.WORLD, "JelloEdit", "Client side world edit");

        File schematicsFolder = new File(Client.getInstance().getFile() + "/shematics");
        if (schematicsFolder.exists()) {
            this.schematicNameList = new ArrayList<>(Arrays.asList(schematicsFolder.list()));

            for (int i = 0; i < this.schematicNameList.size(); i++) {
                if (this.schematicNameList.get(i).startsWith(".")) {
                    this.schematicNameList.remove(i);
                    break;
                }
            }

            String[] schematicNames = new String[this.schematicNameList.size()];
            schematicNames = this.schematicNameList.toArray(schematicNames);
            this.registerSetting(new ModeSetting("Shematics", "shematics", 0, schematicNames));
        }
    }

    private BlockPos getAdjustedPosition(int packetIndex) {
        return new BlockPos(
                this.pos.getX() + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedX(),
                this.pos.getY() + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedY(),
                this.pos.getZ() + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedZ()
        );
    }

    private BlockPos updateAndGetNextPosition() {
        this.currentPosition = this.getAdjustedPosition(this.currentIndex++);
        return this.currentPosition;
    }

    @Override
    public void onEnable() {
        if (this.getSettingValueBySettingName("Shematics") == null) {
            return;
        }
        File var3 = new File(Client.getInstance().getFile() + "/shematics/" + (String) this.getSettingValueBySettingName("Shematics"));
        if (var3.exists()) {
            this.schematicFile = new SchematicFile(var3);
            if (this.schematicFile.method31836() && !this.schematicFile.getDataPackets().isEmpty()) {
                ColorUtils.addChatMessage(this.schematicFile.getDataPackets().size() + " blocks loaded from schematic");
                this.pos = new BlockPos(
                        mc.player.getPosX() + this.schematicFile.getVectorCore().getX() * 0.0,
                        mc.player.getPosY() + this.schematicFile.getVectorCore().getY() * 0.0,
                        mc.player.getPosZ() + this.schematicFile.getVectorCore().getZ() * 0.0
                );
                this.updateAndGetNextPosition();
            } else {
                ColorUtils.addChatMessage("Unable to load schematic");
                this.method16000();
            }
        } else {
            ColorUtils.addChatMessage("Schematic does not exist");
            this.method16000();
        }
    }

    @EventTarget
    private void onRender(Render3DEvent event) {
        if (this.isEnabled()) {
            GL11.glAlphaFunc(516, 0.0F);

            for (DataPacket data : this.schematicFile.getDataPackets()) {
                BlockPos block = new BlockPos(
                        (double) this.pos.getX() + data.getIntegerVector().getX(),
                        (double) this.pos.getY() + data.getIntegerVector().getY(),
                        (double) this.pos.getZ() + data.getIntegerVector().getZ()
                );
                if (BlockUtil.getBlockFromPosition(block) == Blocks.AIR) {
                    double x = (double) block.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                    double y = (double) block.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                    double z = (double) block.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                    Box3D box3D = new Box3D(x, y, z, x + 1.0, y + 1.0, z + 1.0);
                    RenderUtil.render3DColoredBox(box3D, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.02F));
                    GL11.glEnable(2848);
                    RenderUtil.renderWireframeBox(box3D, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.03F));
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                }
            }

            /*
            Commented out because positionFacingList is never filled with data
            for (PositionFacing facing : this.positionFacingList) {
                BlockPos blockPos = facing.blockPos;
                double x = (double) blockPos.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                double y = (double) blockPos.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                double z = (double) blockPos.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                Box3D box3D = new Box3D(x, y, z, x + 1.0, y + 1.0, z + 1.0);
                RenderUtil.render3DColoredBox(box3D, ColorUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.getColor, 0.1F));
                RenderUtil.renderWireframeBox(box3D, ColorUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.getColor, 0.2F));
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }

             */
        }
    }
}
