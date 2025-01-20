package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import com.mentalfrostbyte.jello.util.world.schematics.SchematicFile;
import mapped.Box3D;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.DataPacket;
import mapped.RenderUtil;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JelloEdit extends Module {
    private SchematicFile schematicFile;
    private BlockPos pos;
    private BlockPos currentPosition;
    private List<String> schematicNameList = new ArrayList<>();
    private int currentIndex;

    public JelloEdit() {
        super(ModuleCategory.WORLD, "JelloEdit", "Client side world edit");

        File schematicsFolder = new File(Client.getInstance().file + "/shematics");
        if (schematicsFolder.exists() && schematicsFolder.isDirectory()) {
            String[] files = schematicsFolder.list();
            if (files != null) {
                this.schematicNameList = new ArrayList<>(Arrays.asList(files));

                this.schematicNameList.removeIf(name -> name.startsWith("."));

                if (!this.schematicNameList.isEmpty()) {
                    String[] schematicNames = this.schematicNameList.toArray(new String[0]);
                    this.registerSetting(new ModeSetting("Shematics", "shematics", 0, schematicNames));
                } else {
                    MultiUtilities.addChatMessage("No valid schematic files found.");
                }
            } else {
                MultiUtilities.addChatMessage("Unable to list files in schematics folder.");
            }
        } else {
            MultiUtilities.addChatMessage("Schematics folder does not exist or is not a directory.");
        }
    }

    private BlockPos getAdjustedPosition(int packetIndex) {
        if (this.schematicFile == null || this.schematicFile.getDataPackets().isEmpty()) {
            return null;
        }
        return new BlockPos(
                this.pos.getX() + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedX(),
                this.pos.getY() + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedY(),
                this.pos.getZ()
                        + this.schematicFile.getDataPackets().get(packetIndex).getIntegerVector().getRoundedZ());
    }

    private BlockPos updateAndGetNextPosition() {
        if (this.schematicFile == null || this.schematicFile.getDataPackets().isEmpty()) {
            return null; // Or handle accordingly
        }
        this.currentPosition = this.getAdjustedPosition(this.currentIndex++);
        return this.currentPosition;
    }

    @Override
    public void onEnable() {
        Object schematicSetting = this.getSettingValueBySettingName("Shematics");
        if (schematicSetting == null) {
            MultiUtilities.addChatMessage("No schematic selected.");
            return;
        }

        File schematicFile = new File(Client.getInstance().file + "/shematics/" + schematicSetting);
        if (schematicFile.exists() && schematicFile.isFile()) {
            this.schematicFile = new SchematicFile(schematicFile);
            if (this.schematicFile.method31836() && !this.schematicFile.getDataPackets().isEmpty()) {
                MultiUtilities
                        .addChatMessage(this.schematicFile.getDataPackets().size() + " blocks loaded from schematic");
                this.pos = new BlockPos(
                        mc.player.getPosX() + this.schematicFile.getVectorCore().getX() * 0.0,
                        mc.player.getPosY() + this.schematicFile.getVectorCore().getY() * 0.0,
                        mc.player.getPosZ() + this.schematicFile.getVectorCore().getZ() * 0.0);
                this.updateAndGetNextPosition();
            } else {
                MultiUtilities.addChatMessage("Unable to load schematic or schematic data is empty.");
                this.toggle();
            }
        } else {
            MultiUtilities.addChatMessage("Schematic file does not exist.");
            this.toggle();
        }
    }

    @EventTarget
    private void onRender(Render3DEvent event) {
        if (this.isEnabled() && this.schematicFile != null && !this.schematicFile.getDataPackets().isEmpty()) {
            GL11.glAlphaFunc(516, 0.0F);

            for (DataPacket data : this.schematicFile.getDataPackets()) {
                BlockPos block = new BlockPos(
                        this.pos.getX() + data.getIntegerVector().getX(),
                        this.pos.getY() + data.getIntegerVector().getY(),
                        this.pos.getZ() + data.getIntegerVector().getZ());
                if (BlockUtil.getBlockFromPosition(block) == Blocks.AIR) {
                    double x = block.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                    double y = block.getY() - mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                    double z = block.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                    Box3D box3D = new Box3D(x, y, z, x + 1.0, y + 1.0, z + 1.0);
                    RenderUtil.render3DColoredBox(box3D,
                            MultiUtilities.applyAlpha(ClientColors.PALE_ORANGE.getColor(), 0.02F));
                    GL11.glEnable(GL11.GL_LINE_SMOOTH);
                    RenderUtil.renderWireframeBox(box3D,
                            MultiUtilities.applyAlpha(ClientColors.PALE_ORANGE.getColor(), 0.03F));
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                }
            }
        }
    }
}