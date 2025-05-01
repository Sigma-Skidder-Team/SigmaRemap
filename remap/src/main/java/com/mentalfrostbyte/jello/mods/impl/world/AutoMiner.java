// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import java.util.Collections;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class AutoMiner extends Module
{
    public List<Class8938> field16103;
    public Set<ChunkPos> field16104;
    public Class9416 field16105;
    public Thread field16106;
    private BlockPos field16107;
    public int field16108;
    public List<Class8797> field16109;
    public List<Class8797> field16110;
    
    public AutoMiner() {
        super(Category.WORLD, "AutoMiner", "Automatically mines blocks");
        this.field16103 = new ArrayList<Class8938>();
        this.field16104 = new HashSet<ChunkPos>();
        this.field16109 = new ArrayList<Class8797>();
        this.field16110 = new ArrayList<Class8797>();
    }
    
    @EventListener
    public void method10815(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4271) {
                this.method10816(AutoMiner.mc.world.method6685(((Class4271) eventReceivePacket.getPacket()).method12818()).method7019());
            }
            if (eventReceivePacket.getPacket() instanceof Class4312) {
                this.method10816(((Class4312) eventReceivePacket.getPacket()).field19330);
            }
            if (eventReceivePacket.getPacket() instanceof Class4298) {
                if (Minecraft.getInstance().world != null) {
                    final Class4298 class5724 = (Class4298) eventReceivePacket.getPacket();
                    this.method10816(new ChunkPos(class5724.method12909(), class5724.method12910()));
                }
            }
        }
    }
    
    public void method10816(final ChunkPos class7859) {
        for (final Class8938 class7860 : this.field16103) {
            if (!class7860.method31699(class7859)) {
                continue;
            }
            this.field16104.add(class7860.method31701());
        }
    }
    
    @EventListener
    public void method10817(final EventLoadWorld eventLoadWorld) {
        this.field16103.clear();
        this.field16104.clear();
    }
    
    public List<BlockPos> method10818(final ChunkPos class7859) {
        final ArrayList list = new ArrayList();
        final int n = class7859.field32290 * 16;
        final int n2 = class7859.field32291 * 16;
        final int n3 = 1;
        final int n4 = n + 15;
        final int n5 = n2 + 15;
        final int n6 = 255;
        for (float n7 = (float)n3; n7 <= n6 && n7 <= 100.0f; ++n7) {
            for (float n8 = (float)n; n8 <= n4; ++n8) {
                for (float n9 = (float)n2; n9 <= n5; ++n9) {
                    final BlockPos class7860 = new BlockPos(n8, n7, n9);
                    if (AutoMiner.mc.world.getBlockState(class7860).method21696() == Blocks.DIAMOND_ORE) {
                        list.add(class7860);
                    }
                }
            }
        }
        return list;
    }
    
    @EventListener
    public void method10819(final EventPlayerTick eventPlayerTick) {
        if (!this.isEnabled()) {
            return;
        }
        if (AutoMiner.mc.player.ticksExisted >= 20) {
            final int n = (int)this.getNumberSettingValueByName("Chunk Range");
            final ArrayList list = new ArrayList();
            for (int i = -4; i < 4; ++i) {
                for (int j = -4; j < 4; ++j) {
                    list.add(new ChunkPos(AutoMiner.mc.player.chunkCoordX + i, AutoMiner.mc.player.chunkCoordZ + j));
                }
            }
            final Iterator<Class8938> iterator = this.field16103.iterator();
            while (iterator.hasNext()) {
                final Class8938 class5744 = iterator.next();
                if (class5744.method31700(new ChunkPos(AutoMiner.mc.player.chunkCoordX, AutoMiner.mc.player.chunkCoordZ)) <= 7 && !this.field16104.contains(class5744.method31701())) {
                    continue;
                }
                iterator.remove();
            }
            this.field16104.clear();
            int n2 = 0;
        Label_0262:
            for (final ChunkPos class5745 : list) {
                final Iterator<Class8938> iterator3 = this.field16103.iterator();
                while (iterator3.hasNext()) {
                    if (!iterator3.next().method31699(class5745)) {
                        continue;
                    }
                    continue Label_0262;
                }
                this.field16103.add(new Class8938(class5745.field32290, class5745.field32291, this.method10818(class5745)));
                n2 = 1;
                break;
            }
            if (n2 == 0) {
                if (AutoMiner.mc.player.onGround) {
                    if (!Client.getInstance().getMovementManager().method26559()) {
                        if (this.field16106 == null) {
                            this.method10821();
                            Client.getInstance().getNotificationManager().send(new Notification("AutoMiner", "Computing...", ClientAssets.direction));
                            (this.field16106 = new Thread(() -> {
                                list2.iterator();
                                final Iterator iterator4;
                                while (iterator4.hasNext()) {
                                    final BlockPos class5746 = iterator4.next();
                                    try {
                                        this.field16105 = new Class9416();
                                        new Class8733(new Class8797(AutoMiner.mc.player.method1894()));
                                        new Class8733(new Class8797(class5746));
                                        final Class8733 class5748;
                                        final Class8733 class5749;
                                        final int n3 = (int)Math.min(70000.0, 5000.0 + class5748.field36684.method30688(class5749.field36684) * 1200.0);
                                        final Class6973 class5750 = new Class6973(class5749, class5748);
                                        class5750.field27263 = n3;
                                        class5750.field27266 = true;
                                        class5750.field27269 = 40;
                                        class5750.field27267 = true;
                                        this.field16105.method35017(class5750);
                                        final List list3;
                                        if (list3.size() > 1) {
                                            Client.getInstance().getMovementManager().method26556(list3);
                                            Client.getInstance().getNotificationManager();
                                            new Notification("AutoMiner", "Solved in " + list3.size() + " steps! (" + this.field16105.field40407 + ":" + n3 + ")", ClientAssets.direction);
                                            final Notification class5751;
                                            final Object o2;
                                            ((NotificationManager)o2).send(class5751);
                                            break;
                                        }
                                        else {
                                            continue;
                                        }
                                    }
                                    catch (final Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                try {
                                    final boolean b;
                                    if (!b) {
                                        Client.getInstance().getNotificationManager();
                                        new Notification("AutoMiner", "Could not fin any safe path. (" + list2.size() + ")", ClientAssets.direction);
                                        final Notification class5752;
                                        final Object o3;
                                        ((NotificationManager)o3).send(class5752);
                                        Thread.sleep(1000L);
                                    }
                                }
                                catch (final InterruptedException ex2) {}
                                this.field16106 = null;
                            })).start();
                        }
                    }
                }
            }
            if (this.isEnabled()) {
                if (this.field16105 != null) {
                    if (this.field16106 != null) {
                        if (AutoMiner.mc.player.ticksExisted % 20 == 0) {
                            this.field16110 = this.field16109;
                            this.field16109 = this.method10825();
                        }
                        Client.getInstance().getNotificationManager().send(new Notification("AutoMiner", "Computing... (" + this.field16105.field40407 + ")", ClientAssets.direction));
                    }
                }
            }
            return;
        }
        this.field16103.clear();
    }
    
    public BlockPos method10820(final float n) {
        final ArrayList list = new ArrayList();
        final Iterator<Class8938> iterator = this.field16103.iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next().field37603);
        }
        Class4609.method13675(list);
        if (list.size() <= 0) {
            return null;
        }
        return (BlockPos)list.get(0);
    }
    
    public List<BlockPos> method10821() {
        final ArrayList list = new ArrayList();
        final Iterator<Class8938> iterator = this.field16103.iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next().field37603);
        }
        Class4609.method13675(list);
        if (list.size() > 1) {
            final ArrayList list2 = new ArrayList();
            list2.add(list.get(0));
            for (final BlockPos class354 : list) {
                if (Math.sqrt(class354.distanceSq((Vec3i)list2.get(list2.size() - 1))) <= 4.0) {
                    continue;
                }
                if (Class8797.method30695(class354)) {
                    continue;
                }
                list2.add(class354);
            }
            return list2;
        }
        return list;
    }
    
    @Override
    public void onEnable() {
        if (this.field16106 != null) {
            this.field16106.interrupt();
        }
        this.field16106 = null;
        this.field16103.clear();
        this.field16104.clear();
        Client.getInstance().getMovementManager().method26555();
        Client.getInstance().getNotificationManager().send(new Notification("AutoMiner", "Scanning Terrain..."));
    }
    
    @Override
    public void onDisable() {
        if (this.field16106 != null) {
            this.field16106.interrupt();
        }
        this.field16106 = null;
        this.field16103.clear();
        this.field16104.clear();
        Client.getInstance().getMovementManager().method26555();
    }
    
    private void method10822() {
        final Color[] array = { new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(124, 189, 72), new Color(103, 181, 75), new Color(136, 217, 72), new Color(103, 181, 75), null, null };
        for (int i = 0; i <= 315; i += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)i, 0.0f, 1.0f, 0.0f);
            final int n = i / 45;
            this.method10823(array[n].getRed() / 255.0f, array[n].getGreen() / 255.0f, array[n].getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        for (int j = 0; j <= 315; j += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)j, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            final Color color = new Color(AllUtils.method19121(array[j / 45].getRGB(), 0.2f), false);
            this.method10823(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f);
            GL11.glPopMatrix();
        }
    }
    
    private void method10823(final float n, final float n2, final float n3) {
        GL11.glColor3f(n, n2, n3);
        GL11.glTranslatef(0.0f, 0.0f, 0.25f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.5f);
        GL11.glVertex2f(-0.105f, 0.0f);
        GL11.glVertex2f(0.105f, 0.0f);
        GL11.glEnd();
    }
    
    @EventListener
    public void method10824(final Custom3DRenderEvent custom3DRenderEvent) {
        if (this.isEnabled()) {
            this.method10826();
        }
    }
    
    private List<Class8797> method10825() {
        final ArrayList list = new ArrayList();
        for (Class8733 class8733 = this.field16105.field40405; class8733 != null; class8733 = class8733.field36690) {
            list.add(class8733.field36684);
        }
        Collections.reverse(list);
        return list;
    }
    
    public void method10826() {
        if (this.isEnabled()) {
            if (this.field16105 != null) {
                if (this.field16106 != null) {
                    GL11.glPushMatrix();
                    GL11.glEnable(2848);
                    GL11.glBlendFunc(770, 771);
                    GL11.glEnable(3042);
                    GL11.glDisable(3553);
                    GL11.glDisable(2929);
                    GL11.glEnable(32925);
                    GL11.glLineWidth(1.4f);
                    GL11.glColor4d(1.0, 1.0, 1.0, 0.4399999976158142);
                    GL11.glBegin(3);
                    final float min = Math.min(1.0f, (AutoMiner.mc.player.ticksExisted % 20 + AutoMiner.mc.timer.field26528) / 20.0f);
                    for (int i = 0; i < (int)(this.field16109.size() * min); ++i) {
                        final Class8797 class8797 = this.field16109.get(i);
                        Class8797 class8798;
                        if (this.field16110.size() - 1 >= i) {
                            class8798 = this.field16110.get(i);
                        }
                        else {
                            class8798 = class8797;
                        }
                        GL11.glVertex3d(class8798.method30683() + (class8797.method30683() - class8798.method30683()) - AutoMiner.mc.field4644.method5833().method18161().getX() + 0.5, class8798.method30684() + (class8797.method30684() - class8798.method30684()) - AutoMiner.mc.field4644.method5833().method18161().getY(), class8798.method30685() + (class8797.method30685() - class8798.method30685()) - AutoMiner.mc.field4644.method5833().method18161().getZ() + 0.5);
                    }
                    GL11.glEnd();
                    GL11.glPushMatrix();
                    GL11.glTranslated(AutoMiner.mc.field4644.method5833().method18161().getX(), AutoMiner.mc.field4644.method5833().method18161().getY(), AutoMiner.mc.field4644.method5833().method18161().getZ());
                    GL11.glPopMatrix();
                    GL11.glDisable(3042);
                    GL11.glEnable(3553);
                    GL11.glEnable(2929);
                    GL11.glDisable(32925);
                    GL11.glDisable(2848);
                    GL11.glPopMatrix();
                    return;
                }
            }
        }
        this.field16109.clear();
    }
}
