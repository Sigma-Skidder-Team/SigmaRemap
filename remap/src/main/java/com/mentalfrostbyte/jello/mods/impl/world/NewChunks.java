// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import java.util.Iterator;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.ChunkPos;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;

public class NewChunks extends Module
{
    private ArrayList<ChunkPos> field15875;
    private ArrayList<ChunkPos> field15876;
    
    public NewChunks() {
        super(Category.WORLD, "NewChunks", "Detects new chunks on non vanilla servers");
        this.field15875 = new ArrayList<ChunkPos>();
        this.field15876 = new ArrayList<ChunkPos>();
    }
    
    @EventListener
    private void method10463(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4298) {
                final Class4298 class5724 = (Class4298)class5723.method16998();
                final ChunkPos e = new ChunkPos(class5724.method12909(), class5724.method12910());
                if (!class5724.method12912()) {
                    this.field15876.add(e);
                }
            }
        }
    }
    
    @EventListener
    private void method10464(final Class5739 class5739) {
        if (this.method9906()) {
            final Iterator<ChunkPos> iterator = this.field15876.iterator();
            while (iterator.hasNext()) {
                final ChunkPos class5740 = iterator.next();
                if (!this.field15875.contains(class5740)) {
                    this.field15875.add(class5740);
                }
                iterator.remove();
            }
            final Iterator<ChunkPos> iterator2 = this.field15875.iterator();
            while (iterator2.hasNext()) {
                final ChunkPos class5741 = iterator2.next();
                if (class5741 != null) {
                    final double n = class5741.method25426() - NewChunks.mc.field4644.method5833().method18161().getX();
                    final double n2 = class5741.method25427() - NewChunks.mc.field4644.method5833().method18161().getZ();
                    final double n3 = -NewChunks.mc.field4644.method5833().method18161().getY();
                    GL11.glDisable(2929);
                    final Class7644 class5742 = new Class7644(n, n3, n2, n + 16.0, n3, n2 + 16.0);
                    Class8154.method26909(class5742, Class6430.method19118(Class265.field1285.field1292, 0.1f));
                    Class8154.method26911(class5742, Class6430.method19118(Class265.field1285.field1292, 0.1f));
                    GL11.glColor3f(1.0f, 1.0f, 1.0f);
                    GL11.glEnable(2929);
                    final int n4 = NewChunks.mc.player.chunkCoordX - class5741.field32290;
                    final int n5 = NewChunks.mc.player.chunkCoordZ - class5741.field32291;
                    if (Math.sqrt(n4 * n4 + n5 * n5) <= 30.0) {
                        continue;
                    }
                    iterator2.remove();
                }
            }
        }
    }
    
    @Override
    public void onDisable() {
        this.field15876.clear();
        this.field15875.clear();
    }
}