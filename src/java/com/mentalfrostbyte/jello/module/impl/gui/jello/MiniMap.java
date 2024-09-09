package com.mentalfrostbyte.jello.module.impl.gui.jello;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiniMap extends Module {
    private static float field23708 = 64.0F;
    public ByteBuffer field23704 = null;
    public BufferedImage field23705 = null;
    public List<Class8444> field23716 = new ArrayList<Class8444>();
    private final int field23706 = 95;
    private int field23707;
    private final int field23709 = 150;
    private final int field23710 = 150;
    private final int field23711 = 10;
    private int field23712 = 260;
    private final int field23713 = 1;
    private BlockPos field23714;
    private final int field23715 = 10;
    private double field23717;
    private double field23718;

    public MiniMap() {
        super(ModuleCategory.GUI, "MiniMap", "Shows a mini map");
        this.method16005(false);
    }

    public static ByteBuffer method16503(ByteBuffer var0) {
        int var3 = -7687425;

        for (int var4 = 0; var4 < 16; var4++) {
            for (int var5 = 0; var5 < 16; var5++) {
                var0.put((byte) (var3 >> 16 & 0xFF));
                var0.put((byte) (var3 >> 8 & 0xFF));
                var0.put((byte) (var3 & 0xFF));
            }
        }

        var0.flip();
        return var0;
    }

    // $VF: synthetic method
    public static Minecraft getMC() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft getMC2() {
        return mc;
    }

    @EventTarget
    public void onWorldLoad(WorldLoadEvent var1) {
        this.field23716.clear();
    }

    @Override
    public void onDisable() {
        this.field23716.clear();
    }

    @EventTarget
    private void method16500(TickEvent var1) {
        if (this.isEnabled() && mc.player != null && mc.world != null) {
            this.field23707++;
            if ((double) field23708 < mc.player.getPosY() && mc.player.onGround) {
                field23708 += 0.5F;
            }

            if ((double) field23708 > mc.player.getPosY() && mc.player.onGround) {
                field23708 -= 0.5F;
            }

            if (this.field23707 >= 1) {
                List<Chunk> var4 = new ArrayList();

                for (int var5 = -this.field23715 / 2; var5 < this.field23715 / 2; var5++) {
                    for (int var6 = -this.field23715 / 2; var6 < this.field23715 / 2; var6++) {
                        var4.add(mc.world.getChunk(mc.player.chunkCoordX + var5, mc.player.chunkCoordZ + var6));
                    }
                }

                Iterator var11 = this.field23716.iterator();

                while (var11.hasNext()) {
                    Class8444 var12 = (Class8444) var11.next();
                    int var7 = var12.field36184.method7072().method24365(new ChunkPos(mc.player.chunkCoordX, mc.player.chunkCoordZ));
                    if (var7 > 7) {
                        var11.remove();
                    }
                }

                for (Chunk var15 : var4) {
                    if (var15 == null) {
                        return;
                    }

                    boolean var8 = false;

                    for (Class8444 var10 : this.field23716) {
                        if (var10.method29698(var15)) {
                            var8 = true;
                            break;
                        }
                    }

                    if (!var8) {
                        this.field23716.add(new Class8444(var15));
                        break;
                    }
                }

                for (Class8444 var16 : this.field23716) {
                    var16.method29696();
                }

                this.field23717 = (mc.player.getPosX() - (double) (mc.player.chunkCoordX * 16)) / 16.0;
                this.field23718 = (mc.player.getPosZ() - (double) (mc.player.chunkCoordZ * 16)) / 16.0;
                this.field23704 = this.method16502(this.field23706);
                this.field23714 = mc.player.getPosition();
                this.field23707 = 0;
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16501(EventRender var1) throws IOException {
        if (this.isEnabled() && mc.player != null && mc.world != null) {
            if (this.field23704 != null) {
                if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                    if (!Minecraft.getInstance().gameSettings.hideGUI) {
                        ByteBuffer var4 = this.field23704;
                        this.field23712 = var1.method13960();
                        if (var4 != null) {
                            String var5 = "^";
                            ClientResource var6 = ResourceRegistry.JelloMediumFont20;
                            float var7 = 1.5F;
                            RenderUtil.method11424((float) this.field23711, (float) this.field23712, (float) this.field23710, (float) this.field23709, -7687425);
                            GL11.glPushMatrix();
                            float var8 = (float) (this.field23710 / this.field23715);
                            float var9 = (float) ((double) (var8 * var7) * this.field23718);
                            float var10 = (float) ((double) (-var8 * var7) * this.field23717);
                            GL11.glTranslatef((float) (this.field23711 + this.field23710 / 2), (float) (this.field23712 + this.field23709 / 2), 0.0F);
                            GL11.glRotatef(90.0F - mc.player.rotationYaw, 0.0F, 0.0F, 1.0F);
                            GL11.glTranslatef((float) (-this.field23710 / 2), (float) (-this.field23709 / 2), 0.0F);
                            float var11 = (float) this.field23710 * var7;
                            float var12 = (float) this.field23709 * var7;
                            RenderUtil.method11420(this.field23711, this.field23712, this.field23711 + this.field23710, this.field23712 + this.field23709);
                            RenderUtil.method11455(0.0F, 0.0F, 0.0F, 0.0F, ResourcesDecrypter.shoutIconPNG);
                            float var13 = -var11 / 2.0F + (float) (this.field23710 / 2) + var9;
                            float var14 = -var12 / 2.0F + (float) (this.field23709 / 2) + var10;
                            RenderUtil.method11455(0.0F, 0.0F, 0.0F, 0.0F, ResourcesDecrypter.gingerbreadIconPNG);
                            RenderUtil.method11453(
                                    var13,
                                    var14,
                                    var11,
                                    var12,
                                    var4,
                                    ClientColors.LIGHT_GREYISH_BLUE.getColor,
                                    0.0F,
                                    0.0F,
                                    (float) (this.field23715 * 16),
                                    (float) (this.field23715 * 16),
                                    true,
                                    false
                            );
                            RenderUtil.endScissor();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            int var15 = (int) MovementUtils.method37083()[0];
                            GL11.glTranslatef((float) (this.field23711 + this.field23710 / 2 + 1), (float) (this.field23712 + this.field23709 / 2 + 3), 0.0F);
                            GL11.glRotatef((float) (270 + var15) - mc.player.rotationYaw, 0.0F, 0.0F, 1.0F);
                            GL11.glTranslatef((float) (-(this.field23711 + this.field23710 / 2 + 1)), (float) (-(this.field23712 + this.field23709 / 2)), 0.0F);
                            RenderUtil.drawString(
                                    var6, (float) (this.field23711 + this.field23710 / 2 - 4), (float) (this.field23712 + this.field23709 / 2 - 8), var5, 1879048192
                            );
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glTranslatef((float) (this.field23711 + this.field23710 / 2 + 1), (float) (this.field23712 + this.field23709 / 2), 0.0F);
                            GL11.glRotatef((float) (270 + var15) - mc.player.rotationYaw, 0.0F, 0.0F, 1.0F);
                            GL11.glTranslatef((float) (-(this.field23711 + this.field23710 / 2 + 1)), (float) (-(this.field23712 + this.field23709 / 2)), 0.0F);
                            RenderUtil.drawString(
                                    var6,
                                    (float) (this.field23711 + this.field23710 / 2 - 4),
                                    (float) (this.field23712 + this.field23709 / 2 - 8),
                                    var5,
                                    ClientColors.LIGHT_GREYISH_BLUE.getColor
                            );
                            GL11.glPopMatrix();
                            RenderUtil.method11464((float) this.field23711, (float) this.field23712, (float) this.field23710, (float) this.field23709, 23.0F, 0.75F);
                            RenderUtil.method11463((float) this.field23711, (float) this.field23712, (float) this.field23710, (float) this.field23709, 8.0F, 0.7F);
                        }

                        var1.method13962(this.field23709 + 10);
                    }
                }
            }
        }
    }

    public ByteBuffer method16502(int var1) {
        List<Chunk> var4 = new ArrayList();

        for (int var5 = -this.field23715 / 2; var5 < this.field23715 / 2; var5++) {
            for (int var6 = -this.field23715 / 2; var6 < this.field23715 / 2; var6++) {
                var4.add(mc.world.getChunk(mc.player.chunkCoordX + var5, mc.player.chunkCoordZ + var6));
            }
        }

        ByteBuffer var16 = BufferUtils.createByteBuffer(this.field23715 * 16 * this.field23715 * 16 * 3);
        int var17 = 0;
        int var7 = var16.position();

        for (Chunk var9 : var4) {
            ByteBuffer var10 = BufferUtils.createByteBuffer(768);
            method16503(var10);
            Class8444 var11 = null;

            for (Class8444 var13 : this.field23716) {
                if (var13.method29698(var9)) {
                    var11 = var13;
                    break;
                }
            }

            if (var11 != null && var11.field36185 != null) {
                var10 = var11.field36185;
            }

            int var18 = var16.position();
            int var19 = var16.position();

            for (int var14 = 0; var14 < 16; var14++) {
                for (int var15 = 0; var15 < 16; var15++) {
                    var16.put(var10.get());
                    var16.put(var10.get());
                    var16.put(var10.get());
                }

                var18 += 16 * this.field23715 * 3;
                if (var18 < var16.limit()) {
                    var16.position(var18);
                }
            }

            var7 += 48;
            if (var19 + 48 < var16.limit()) {
                var16.position(var19 + 48);
            }

            if (var17 != var7 / (48 * this.field23715)) {
                var17 = var7 / (48 * this.field23715);
                if (256 * this.field23715 * 3 * var17 < var16.limit()) {
                    var16.position(256 * this.field23715 * 3 * var17);
                }
            }

            var10.position(0);
        }

        var16.position(16 * this.field23715 * 16 * this.field23715 * 3);
        var16.flip();
        return var16;
    }
}
