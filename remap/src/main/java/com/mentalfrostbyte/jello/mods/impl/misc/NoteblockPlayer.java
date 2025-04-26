// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import java.util.HashMap;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.TrueTypeFont;

import java.util.Iterator;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NoteblockPlayer extends PremiumModule
{
    public int field16033;
    private Class2308 field16034;
    private List<String> field16035;
    private List<Class9486> field16036;
    private List<BlockPos> field16037;
    
    public NoteblockPlayer() {
        super("NoteblockPlayer", "Plays noteblocks! Needs NBS files in sigma5/nbs", Category.MISC);
        this.field16035 = new ArrayList<String>();
        this.field16036 = new ArrayList<Class9486>();
        this.field16037 = new ArrayList<BlockPos>();
        final File file = new File(Client.getInstance().getFile() + "/nbs");
        if (file.exists()) {
            this.field16035 = new ArrayList<String>(Arrays.asList(file.list()));
            for (int i = 0; i < this.field16035.size(); ++i) {
                if (this.field16035.get(i).startsWith(".")) {
                    this.field16035.remove(i);
                    break;
                }
            }
            final String[] array = this.field16035.toArray(new String[this.field16035.size()]);
            if (array.length > 0) {
                this.addSetting(new StringSetting("Song", "songs", 0, array));
            }
        }
    }
    
    @EventListener
    private void method10704(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field16034 == null) {
            return;
        }
        if (NoteblockPlayer.mc.playerController.method27332()) {
            ColorUtils.method19106("§cNoteBlockPlayer isn't available in creative mode!");
            this.method9909(false);
            return;
        }
        if (!this.method10706(this.field16036)) {
            if (NoteblockPlayer.mc.player.ticksExisted % 4 == 0) {
                this.method10707(this.field16036);
            }
        }
        if (!this.method10705(this.field16036)) {
            return;
        }
        if (Math.floor(NoteblockPlayer.mc.player.ticksExisted % this.field16034.method9383()) / 20.0 == 0.0) {
            if (this.field16033 > this.field16034.method9377()) {
                this.field16033 = 0;
            }
            this.field16037.clear();
            final Iterator<Class9501> iterator = this.field16034.method9375().values().iterator();
            while (iterator.hasNext()) {
                final Class9110 method35385 = iterator.next().method35385(this.field16033);
                if (method35385 != null) {
                    for (final Class9486 class5744 : this.field16036) {
                        if (method35385.method32948() == 3 || this.method10713(class5744) != 0) {
                            if (class5744.method35311() != method35385.method32948()) {
                                continue;
                            }
                        }
                        if (Class2059.method8149(class5744.field40774) != method35385.method32950() - 33) {
                            continue;
                        }
                        if (Math.sqrt(NoteblockPlayer.mc.player.method1894().distanceSq(class5744.field40773)) >= NoteblockPlayer.mc.playerController.method27315()) {
                            continue;
                        }
                        float[] array = Class4609.method13672(class5744.field40773, Direction.UP);
                        if (class5744.field40773.getY() > NoteblockPlayer.mc.player.posY + 1.0) {
                            array = Class4609.method13672(class5744.field40773, Direction.DOWN);
                        }
                        NoteblockPlayer.mc.method5269().method17292(new Class4356(array[0], array[1], NoteblockPlayer.mc.player.onGround));
                        NoteblockPlayer.mc.method5269().method17292(new Class4399(Class2003.field11240, class5744.field40773, Direction.UP));
                        NoteblockPlayer.mc.method5269().method17292(new Class4380(Class316.field1877));
                        this.field16037.add(class5744.field40773);
                    }
                }
            }
            ++this.field16033;
        }
    }
    
    public boolean method10705(final List<Class9486> list) {
        for (final Class9486 class9486 : list) {
            if (class9486.field40774 != -1.0f && !this.method10710(class9486.field40774, class9486.field40775)) {
                continue;
            }
            if (Math.sqrt(NoteblockPlayer.mc.player.method1894().distanceSq(class9486.field40773)) >= NoteblockPlayer.mc.playerController.method27315()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public boolean method10706(final List<Class9486> list) {
        for (final Class9486 class9486 : list) {
            if (class9486.field40774 == -1.0f && Math.sqrt(NoteblockPlayer.mc.player.method1894().distanceSq(class9486.field40773)) < NoteblockPlayer.mc.playerController.method27315()) {
                final float[] method13672 = Class4609.method13672(class9486.field40773, Direction.UP);
                NoteblockPlayer.mc.method5269().method17292(new Class4356(method13672[0], method13672[1], NoteblockPlayer.mc.player.onGround));
                NoteblockPlayer.mc.method5269().method17292(new Class4399(Class2003.field11240, class9486.field40773, Direction.UP));
                this.field16037.clear();
                this.field16037.add(class9486.field40773);
                return true;
            }
        }
        return false;
    }
    
    public boolean method10707(final List<Class9486> list) {
        for (final Class9486 class9486 : list) {
            if (this.method10710(class9486.field40774, class9486.field40775) && Math.sqrt(NoteblockPlayer.mc.player.method1894().distanceSq(class9486.field40773)) < NoteblockPlayer.mc.playerController.method27315()) {
                if (NoteblockPlayer.mc.player.ticksExisted % 1 == 0) {
                    final float[] method13672 = Class4609.method13672(class9486.field40773, Direction.UP);
                    NoteblockPlayer.mc.player.method2707(Class316.field1877);
                    NoteblockPlayer.mc.method5269().method17292(new Class4356(method13672[0], method13672[1], NoteblockPlayer.mc.player.onGround));
                    NoteblockPlayer.mc.method5269().method17292(new Class4329(Class316.field1877, Class4609.method13697(method13672[0], method13672[1], NoteblockPlayer.mc.playerController.method27315() + 1.0f)));
                    this.field16037.clear();
                    this.field16037.add(class9486.field40773);
                }
                return true;
            }
        }
        return false;
    }
    
    @EventListener
    private void method10708(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field16036 != null) {
            for (Class9486 class5740 : this.field16036) {}
            final Iterator<BlockPos> iterator2 = this.field16037.iterator();
            while (iterator2.hasNext()) {
                method10709(iterator2.next());
            }
        }
    }
    
    public static void method10709(final BlockPos class354) {
        final double n = class354.getX() + 0.5f - Minecraft.getInstance().field4644.method5833().method18161().getX();
        final double n2 = class354.getY() + 1.0f - Minecraft.getInstance().field4644.method5833().method18161().getY();
        final double n3 = class354.getZ() + 0.5f - Minecraft.getInstance().field4644.method5833().method18161().getZ();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glLineWidth(1.0f);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        final Vec3d method16755 = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-(float)Math.toRadians(Minecraft.getInstance().player.rotationPitch)).rotateYaw(-(float)Math.toRadians(Minecraft.getInstance().player.rotationYaw));
        GL11.glBegin(1);
        GL11.glVertex3d(method16755.x, method16755.y, method16755.z);
        GL11.glVertex3d(n, n2, n3);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    public boolean method10710(final float n, final Class185 class185) {
        int n2 = 0;
        for (final Class9486 class186 : this.field16036) {
            if (class186.field40774 != n) {
                continue;
            }
            if (n == -1.0f) {
                continue;
            }
            if (class186.field40775 != class185) {
                continue;
            }
            ++n2;
        }
        return n2 > 1;
    }
    
    @EventListener
    private void method10711(final Class5723 class5723) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field16036 != null) {
            if (class5723.method16998() instanceof Class4282) {
                final Class4282 class5724 = (Class4282)class5723.method16998();
                for (int i = 0; i < this.field16036.size(); ++i) {
                    final Class9486 class5725 = this.field16036.get(i);
                    if (class5725.field40773.equals(new BlockPos(class5724.method12865(), class5724.method12866(), class5724.method12867()))) {
                        class5725.field40774 = class5724.method12869();
                        this.field16036.set(i, class5725);
                    }
                }
            }
            if (class5723.method16998() instanceof Class4342) {
                final Class4342 class5726 = (Class4342)class5723.method16998();
                for (int j = 0; j < this.field16036.size(); ++j) {
                    final Class9486 class5727 = this.field16036.get(j);
                    if (class5727.field40773.equals(new BlockPos(class5726.method13040(), class5726.method13041(), class5726.method13042()))) {
                        class5727.field40774 = class5726.method13044();
                        this.field16036.set(j, class5727);
                    }
                }
            }
        }
    }
    
    public void method10712(final double n, final double n2, final double n3, final String s) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(n - NoteblockPlayer.mc.field4644.method5833().method18161().getX() + 0.5, n2 - NoteblockPlayer.mc.field4644.method5833().method18161().getY() + 1.0, n3 - NoteblockPlayer.mc.field4644.method5833().method18161().getZ() + 0.5);
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glRotatef(NoteblockPlayer.mc.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
        GL11.glRotatef(NoteblockPlayer.mc.field4644.method5833().method18163(), 1.0f, 0.0f, 0.0f);
        final TrueTypeFont field40314 = ClientFonts.JelloLight25;
        GL11.glPushMatrix();
        GL11.glScalef(-0.01f, -0.01f, -0.01f);
        RenderUtil.method26876((float)(-field40314.getWidth(s) / 2 - 10), 0.0f, (float)(field40314.getWidth(s) / 2 + 10), (float)(field40314.getHeight() + 2), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.4f));
        GL11.glTranslated((double)(-field40314.getWidth(s) / 2), 0.0, 0.0);
        RenderUtil.drawString(field40314, 0.0f, 0.0f, s, ClientColors.LIGHT_GREYISH_BLUE.color);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    @Override
    public void onEnable() {
        if (!NoteblockPlayer.mc.playerController.method27332()) {
            if (this.field16035.isEmpty()) {
                ColorUtils.method19106("§cNo Song available! Place NBS formated files in sigma5/nbs and restart the client to try again!");
                ColorUtils.method19106("§cPlaying the only integrated demo song!");
                this.field16034 = Class9377.method34815(ClientAssets.method25394("com/mentalfrostbyte/gui/resources/music/rememberthis.nbs"));
                if (this.field16034 == null) {
                    ColorUtils.method19106("§cError loading included song, wtf!");
                    this.method9909(false);
                    return;
                }
            }
            else {
                this.field16034 = Class9377.method34814(new File(Client.getInstance().getFile() + "/nbs/" + this.getStringSettingValueByName("Song")));
                if (this.field16034 == null) {
                    ColorUtils.method19106("§cError loading song! Make sure song is saved as <= V3 format");
                    this.method9909(false);
                    return;
                }
            }
            System.out.println(this.field16034.method9378());
            ColorUtils.method19106("Now Playing: " + this.field16034.method9378());
            if (Math.floor(20.0f / this.field16034.method9383()) != 20.0f / this.field16034.method9383()) {
                ColorUtils.method19106("§cNBS Error! Invalid tempo! (" + this.field16034.method9383() + ") Unpredictable results!");
            }
            this.field16033 = 0;
            this.field16036.clear();
            for (final BlockPos class354 : Class4609.method13691(NoteblockPlayer.mc.playerController.method27315())) {
                if (!(NoteblockPlayer.mc.world.getBlockState(class354).method21696() instanceof Class3984)) {
                    continue;
                }
                if (this.method10713(new Class9486(class354)) > 24) {
                    continue;
                }
                this.field16036.add(new Class9486(class354));
            }
            this.method10706(this.field16036);
            this.method10707(this.field16036);
            return;
        }
        ColorUtils.method19106("§cNoteBlockPlayer isn't available in creative mode!");
        this.method9909(false);
    }
    
    private int method10713(final Class9486 class9486) {
        final HashMap hashMap = new HashMap();
        for (final Class9486 class9487 : this.field16036) {
            hashMap.put(class9487.field40775, (int)hashMap.getOrDefault(class9487.field40775, 0));
        }
        return hashMap.getOrDefault(class9486.field40775, 0);
    }
}
