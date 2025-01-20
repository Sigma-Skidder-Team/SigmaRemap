package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.Box3D;
import net.minecraft.util.math.ChunkPos;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.RenderUtil;
import net.minecraft.network.play.server.SChunkDataPacket;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;

public class NewChunks extends Module {
    private final ArrayList<ChunkPos> newChunks = new ArrayList<>();
    private final ArrayList<ChunkPos> updatedChunks = new ArrayList<>();

    public NewChunks() {
        super(ModuleCategory.WORLD, "NewChunks", "Detects new chunks on non vanilla servers");
    }

    @EventTarget
    private void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            if (event.getPacket() instanceof SChunkDataPacket) {
                SChunkDataPacket packet = (SChunkDataPacket) event.getPacket();
                ChunkPos chunkPos = new ChunkPos(packet.getChunkX(), packet.getChunkZ());
                if (!packet.isFullChunk()) {
                    this.updatedChunks.add(chunkPos);
                }
            }
        }
    }

    @EventTarget
    private void onRender3D(Render3DEvent event) {
        if (this.isEnabled()) {
            for (Iterator<ChunkPos> iterator = this.updatedChunks.iterator(); iterator.hasNext(); iterator.remove()) {
                ChunkPos chunkPos = iterator.next();
                if (!this.newChunks.contains(chunkPos)) {
                    this.newChunks.add(chunkPos);
                }
            }

            Iterator<ChunkPos> chunkIterator = this.newChunks.iterator();
            while (chunkIterator.hasNext()) {
                ChunkPos chunkPos = chunkIterator.next();
                if (chunkPos != null) {
                    double x = chunkPos.getX() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                    double z = chunkPos.getZ() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                    double y = -mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                    GL11.glDisable(GL11.GL_DEPTH_TEST);
                    Box3D box = new Box3D(x, y, z, x + 16.0, y + 16.0, z + 16.0);
                    RenderUtil.render3DColoredBox(box, MultiUtilities.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                    RenderUtil.renderWireframeBox(box, MultiUtilities.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                    GL11.glEnable(GL11.GL_DEPTH_TEST);

                    int dx = mc.player.chunkCoordX - chunkPos.getX();
                    int dz = mc.player.chunkCoordZ - chunkPos.getZ();
                    double distance = Math.sqrt(dx * dx + dz * dz);
                    if (distance > 30.0) {
                        chunkIterator.remove();
                    }
                }
            }
        }
    }

    @Override
    public void onDisable() {
        this.updatedChunks.clear();
        this.newChunks.clear();
    }
}
