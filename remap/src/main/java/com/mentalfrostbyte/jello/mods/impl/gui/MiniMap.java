// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import java.awt.Color;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.Chunk;
import org.lwjgl.BufferUtils;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import slick2d.TrueTypeFont;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

public class MiniMap extends Module
{
    public ByteBuffer field15832;
    public BufferedImage field15833;
    private int field15834;
    private int field15835;
    private static float field15836;
    private int field15837;
    private int field15838;
    private int field15839;
    private int field15840;
    private int field15841;
    private BlockPos field15842;
    private int field15843;
    public List<Class6824> field15844;
    private double field15845;
    private double field15846;
    
    public MiniMap() {
        super(Category.GUI, "MiniMap", "Shows a mini map");
        this.field15832 = null;
        this.field15833 = null;
        this.field15834 = 95;
        this.field15837 = 150;
        this.field15838 = 150;
        this.field15839 = 10;
        this.field15840 = 260;
        this.field15841 = 1;
        this.field15843 = 10;
        this.field15844 = new ArrayList<Class6824>();
        this.method9915(false);
    }
    
    @EventListener
    public void method10404(final Class5732 class5732) {
        this.field15844.clear();
    }
    
    @Override
    public void onDisable() {
        this.field15844.clear();
    }
    
    @EventListener
    private void method10405(final Class5743 class5743) {
        if (this.isEnabled()) {
            if (MiniMap.mc.player != null) {
                if (MiniMap.mc.world != null) {
                    ++this.field15835;
                    if (MiniMap.field15836 < MiniMap.mc.player.posY) {
                        if (MiniMap.mc.player.onGround) {
                            MiniMap.field15836 += 0.5f;
                        }
                    }
                    if (MiniMap.field15836 > MiniMap.mc.player.posY) {
                        if (MiniMap.mc.player.onGround) {
                            MiniMap.field15836 -= 0.5f;
                        }
                    }
                    if (this.field15835 >= 1) {
                        final ArrayList list = new ArrayList();
                        for (int i = -this.field15843 / 2; i < this.field15843 / 2; ++i) {
                            for (int j = -this.field15843 / 2; j < this.field15843 / 2; ++j) {
                                list.add(MiniMap.mc.world.method6686(MiniMap.mc.player.chunkCoordX + i, MiniMap.mc.player.chunkCoordZ + j));
                            }
                        }
                        final Iterator<Class6824> iterator = this.field15844.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().field26810.method7019().method25436(new ChunkPos(MiniMap.mc.player.chunkCoordX, MiniMap.mc.player.chunkCoordZ)) <= 7) {
                                continue;
                            }
                            iterator.remove();
                        }
                        for (final Chunk class5744 : list) {
                            if (class5744 == null) {
                                return;
                            }
                            int n = 0;
                            final Iterator<Class6824> iterator3 = this.field15844.iterator();
                            while (iterator3.hasNext()) {
                                if (!iterator3.next().method20914(class5744)) {
                                    continue;
                                }
                                n = 1;
                                break;
                            }
                            if (n == 0) {
                                this.field15844.add(new Class6824(class5744));
                                break;
                            }
                        }
                        final Iterator<Class6824> iterator4 = this.field15844.iterator();
                        while (iterator4.hasNext()) {
                            iterator4.next().method20912();
                        }
                        this.field15845 = (MiniMap.mc.player.posX - MiniMap.mc.player.chunkCoordX * 16) / 16.0;
                        this.field15846 = (MiniMap.mc.player.posZ - MiniMap.mc.player.chunkCoordZ * 16) / 16.0;
                        this.field15832 = this.method10407(this.field15834);
                        this.field15842 = MiniMap.mc.player.method1894();
                        this.field15835 = 0;
                    }
                }
            }
        }
    }
    
    @EventListener
    @Class6757
    private void method10406(final Class5740 class5740) throws IOException {
        if (this.isEnabled()) {
            if (MiniMap.mc.player != null) {
                if (MiniMap.mc.world != null) {
                    if (this.field15832 == null) {
                        return;
                    }
                    if (Minecraft.method5277().gameSettings.field23466) {
                        return;
                    }
                    if (!Minecraft.method5277().gameSettings.field23464) {
                        final ByteBuffer field15832 = this.field15832;
                        this.field15840 = class5740.method17028();
                        if (field15832 != null) {
                            final String s = "^";
                            final TrueTypeFont field15833 = ClientFonts.JelloMedium20;
                            final float n = 1.5f;
                            RenderUtil.method26874((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, -7687425);
                            GL11.glPushMatrix();
                            final float n2 = (float)(this.field15838 / this.field15843);
                            final float n3 = (float)(n2 * n * this.field15846);
                            final float n4 = (float)(-n2 * n * this.field15845);
                            GL11.glTranslatef((float)(this.field15839 + this.field15838 / 2), (float)(this.field15840 + this.field15837 / 2), 0.0f);
                            GL11.glRotatef(90.0f - MiniMap.mc.player.rotationYaw, 0.0f, 0.0f, 1.0f);
                            GL11.glTranslatef((float)(-this.field15838 / 2), (float)(-this.field15837 / 2), 0.0f);
                            final float n5 = this.field15838 * n;
                            final float n6 = this.field15837 * n;
                            RenderUtil.method26870(this.field15839, this.field15840, this.field15839 + this.field15838, this.field15840 + this.field15837);
                            RenderUtil.method26905(0.0f, 0.0f, 0.0f, 0.0f, ClientAssets.shout);
                            final float n7 = -n5 / 2.0f + this.field15838 / 2 + n3;
                            final float n8 = -n6 / 2.0f + this.field15837 / 2 + n4;
                            RenderUtil.method26905(0.0f, 0.0f, 0.0f, 0.0f, ClientAssets.gingerbread);
                            RenderUtil.method26903(n7, n8, n5, n6, field15832, ClientColors.LIGHT_GREYISH_BLUE.color, 0.0f, 0.0f, (float)(this.field15843 * 16), (float)(this.field15843 * 16), true, false);
                            RenderUtil.endScissor();
                            GL11.glPopMatrix();
                            RenderUtil.drawString(field15833, (float)(this.field15839 + this.field15838 / 2 - 4), (float)(this.field15840 + this.field15837 / 2 - 8), s, ClientColors.LIGHT_GREYISH_BLUE.color);
                            RenderUtil.drawString(field15833, (float)(this.field15839 + this.field15838 / 2 - 4), (float)(this.field15840 + this.field15837 / 2 - 6), s, 1879048192);
                            RenderUtil.method26914((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, 23.0f, 0.75f);
                            RenderUtil.method26913((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, 8.0f, 0.7f);
                        }
                        class5740.method17030(this.field15837 + 10);
                    }
                }
            }
        }
    }
    
    public ByteBuffer method10407(final int n) {
        final ArrayList list = new ArrayList();
        for (int i = -this.field15843 / 2; i < this.field15843 / 2; ++i) {
            for (int j = -this.field15843 / 2; j < this.field15843 / 2; ++j) {
                list.add(MiniMap.mc.world.method6686(MiniMap.mc.player.chunkCoordX + i, MiniMap.mc.player.chunkCoordZ + j));
            }
        }
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(this.field15843 * 16 * this.field15843 * 16 * 3);
        int n2 = 0;
        int position = byteBuffer.position();
        for (final Chunk class1862 : list) {
            ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer(768);
            method10408(byteBuffer2);
            Class6824 class1863 = null;
            for (final Class6824 class1864 : this.field15844) {
                if (!class1864.method20914(class1862)) {
                    continue;
                }
                class1863 = class1864;
                break;
            }
            if (class1863 != null) {
                if (class1863.field26811 != null) {
                    byteBuffer2 = class1863.field26811;
                }
            }
            int position2 = byteBuffer.position();
            final int position3 = byteBuffer.position();
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                }
                position2 += 16 * this.field15843 * 3;
                if (position2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            position += 48;
            if (position3 + 48 < byteBuffer.limit()) {
                byteBuffer.position();
            }
            if (n2 != position / (48 * this.field15843)) {
                n2 = position / (48 * this.field15843);
                if (256 * this.field15843 * 3 * n2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            byteBuffer2.position();
        }
        byteBuffer.position();
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public static ByteBuffer method10408(final ByteBuffer byteBuffer) {
        final int n = -7687425;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                byteBuffer.put((byte)(n >> 16 & 0xFF));
                byteBuffer.put((byte)(n >> 8 & 0xFF));
                byteBuffer.put((byte)(n & 0xFF));
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public static int method10409(BlockPos method1139) {
        final float n = 1.0f;
        if (MiniMap.mc.world.getBlockState(method1139).method21696() == Blocks.AIR) {
            method1139 = method1139.method1139();
        }
        int n2 = MiniMap.mc.world.getBlockState(method1139).method21697().method26446().field37084;
        final Material method1140 = MiniMap.mc.world.getBlockState(method1139.method1137()).method21697();
        if (method1140 != Material.SNOW) {
            if (method1140 == Material.LAVA) {
                n2 = method1140.method26446().colorValue;
            }
        }
        else {
            n2 = -1;
        }
        int rgba = new Color((n2 & 0xFF0000) >> 16, (n2 & 0xFF00) >> 8, n2 & 0xFF).getRGB();
        final Material method1141 = MiniMap.mc.world.getBlockState(method1139.method1141()).method21697();
        final Material method1142 = MiniMap.mc.world.getBlockState(method1139.method1143()).method21697();
        if (method1141 != Material.AIR && method1141 != Material.SNOW) {
            if (method1142 == Material.AIR || method1142 == Material.SNOW) {
                rgba = ColorUtils.method19109(new Color(rgba, true), Color.WHITE, 0.6f).getRGB();
            }
        }
        else {
            rgba = ColorUtils.method19109(new Color(rgba, true), Color.BLACK, 0.6f).getRGB();
        }
        int rgb;
        if (rgba != -16777216) {
            rgb = ColorUtils.method19109(new Color(rgba, true), Color.BLACK, n).getRGB();
        }
        else {
            rgb = -7687425;
        }
        return rgb;
    }
    
    static {
        MiniMap.field15836 = 64.0f;
    }
}
