package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.network.play.server.SChunkDataPacket;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;

public class NewChunks extends Module {
    private final ArrayList<ChunkPos> field23905 = new ArrayList<ChunkPos>();
    private final ArrayList<ChunkPos> field23906 = new ArrayList<ChunkPos>();

    public NewChunks() {
        super(ModuleCategory.WORLD, "NewChunks", "Detects new chunks on non vanilla servers");
    }

    @EventTarget
    private void method16786(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SChunkDataPacket) {
                SChunkDataPacket var4 = (SChunkDataPacket) var1.getPacket();
                ChunkPos var5 = new ChunkPos(var4.method17378(), var4.method17379());
                if (!var4.method17381()) {
                    this.field23906.add(var5);
                }
            }
        }
    }

    @EventTarget
    private void method16787(Render3DEvent var1) {
        if (this.isEnabled()) {
            for (Iterator var4 = this.field23906.iterator(); var4.hasNext(); var4.remove()) {
                ChunkPos var5 = (ChunkPos) var4.next();
                if (!this.field23905.contains(var5)) {
                    this.field23905.add(var5);
                }
            }

            Iterator var18 = this.field23905.iterator();

            while (var18.hasNext()) {
                ChunkPos var6 = (ChunkPos) var18.next();
                if (var6 != null) {
                    double var7 = (double) var6.method24356() - mc.gameRenderer.getActiveRenderInfo().getPos().getX();
                    double var9 = (double) var6.method24357() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
                    double var11 = -mc.gameRenderer.getActiveRenderInfo().getPos().getY();
                    GL11.glDisable(2929);
                    Box3D var13 = new Box3D(var7, var11, var9, var7 + 16.0, var11, var9 + 16.0);
                    RenderUtil.render3DColoredBox(var13, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                    RenderUtil.renderWireframeBox(var13, ColorUtils.applyAlpha(ClientColors.PALE_ORANGE.getColor, 0.1F));
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                    GL11.glEnable(2929);
                    int var14 = mc.player.chunkCoordX - var6.field32174;
                    int var15 = mc.player.chunkCoordZ - var6.field32175;
                    double var16 = Math.sqrt(var14 * var14 + var15 * var15);
                    if (var16 > 30.0) {
                        var18.remove();
                    }
                }
            }
        }
    }

    @Override
    public void onDisable() {
        this.field23906.clear();
        this.field23905.clear();
    }
}
