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
    private final ArrayList<Class7481> field23905 = new ArrayList<Class7481>();
    private final ArrayList<Class7481> field23906 = new ArrayList<Class7481>();

    public NewChunks() {
        super(ModuleCategory.WORLD, "NewChunks", "Detects new chunks on non vanilla servers");
    }

    @EventTarget
    private void method16786(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SChunkDataPacket) {
                SChunkDataPacket var4 = (SChunkDataPacket) var1.getPacket();
                Class7481 var5 = new Class7481(var4.method17378(), var4.method17379());
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
                Class7481 var5 = (Class7481) var4.next();
                if (!this.field23905.contains(var5)) {
                    this.field23905.add(var5);
                }
            }

            Iterator var18 = this.field23905.iterator();

            while (var18.hasNext()) {
                Class7481 var6 = (Class7481) var18.next();
                if (var6 != null) {
                    double var7 = (double) var6.method24356() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                    double var9 = (double) var6.method24357() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                    double var11 = -mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
                    GL11.glDisable(2929);
                    Class9388 var13 = new Class9388(var7, var11, var9, var7 + 16.0, var11, var9 + 16.0);
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
