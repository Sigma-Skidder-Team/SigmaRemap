package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.server.SPlaySoundEffectPacket;
import net.minecraft.network.play.server.SPlaySoundPacket;
import net.minecraft.state.properties.NoteBlockInstrument;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.*;

public class NoteblockPlayer extends PremiumModule {
    public int field23638;
    private Class2403 field23639;
    private List<String> field23640 = new ArrayList<String>();
    private final List<Class6463> field23641 = new ArrayList<Class6463>();
    private final List<BlockPos> field23642 = new ArrayList<BlockPos>();

    public NoteblockPlayer() {
        super("NoteblockPlayer", "Plays noteblocks! Needs NBS files in sigma5/nbs", ModuleCategory.MISC);
        File var3 = new File(Client.getInstance().getFile() + "/nbs");
        if (var3.exists()) {
            this.field23640 = new ArrayList<String>(Arrays.asList(var3.list()));

            for (int var4 = 0; var4 < this.field23640.size(); var4++) {
                if (this.field23640.get(var4).startsWith(".")) {
                    this.field23640.remove(var4);
                    break;
                }
            }

            String[] var5 = new String[this.field23640.size()];
            var5 = this.field23640.toArray(var5);
            if (var5.length > 0) {
                this.registerSetting(new ModeSetting("Song", "songs", 0, var5));
            }
        }
    }

    public static void method16410(BlockPos var0) {
        double var3 = (double) ((float) var0.getX() + 0.5F) - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getX();
        double var5 = (double) ((float) var0.getY() + 1.0F) - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getY();
        double var7 = (double) ((float) var0.getZ() + 0.5F) - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getZ();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        Vector3d var9 = new Vector3d(0.0, 0.0, 1.0)
                .method11350(-((float) Math.toRadians(Minecraft.getInstance().player.rotationPitch)))
                .method11351(-((float) Math.toRadians(Minecraft.getInstance().player.rotationYaw)));
        GL11.glBegin(1);
        GL11.glVertex3d(var9.x, var9.y, var9.z);
        GL11.glVertex3d(var3, var5, var7);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    // $VF: synthetic method
    public static Minecraft method16415() {
        return mc;
    }

    @EventTarget
    private void method16405(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.field23639 != null) {
                if (mc.playerController.isInCreativeMode()) {
                    MultiUtilities.addChatMessage("§cNoteBlockPlayer isn't available in creative mode!");
                    this.setEnabled(false);
                } else {
                    if (!this.method16407(this.field23641) && mc.player.ticksExisted % 4 == 0) {
                        this.method16408(this.field23641);
                    }

                    if (this.method16406(this.field23641)) {
                        if (Math.floor((float) mc.player.ticksExisted % this.field23639.method9958()) / 20.0 == 0.0) {
                            if (this.field23638 > this.field23639.method9952()) {
                                this.field23638 = 0;
                            }

                            this.field23642.clear();

                            for (Class9616 var5 : this.field23639.method9950().values()) {
                                Class8255 var6 = var5.method37433(this.field23638);
                                if (var6 != null) {
                                    for (Class6463 var8 : this.field23641) {
                                        if ((var6.method28780() != 3 && this.method16414(var8) == 0 || var8.method19640() == var6.method28780())
                                                && Class2121.method8807(var8.field28402) == (float) (var6.method28782() - 33)
                                                && Math.sqrt(mc.player.getPosition().method8318(var8.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                                            float[] var9 = BlockUtil.method34542(var8.field28401, Direction.UP);
                                            if ((double) var8.field28401.getY() > mc.player.getPosY() + 1.0) {
                                                var9 = BlockUtil.method34542(var8.field28401, Direction.DOWN);
                                            }

                                            mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var9[0], var9[1], mc.player.onGround));
                                            mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, var8.field28401, Direction.UP));
                                            mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                                            this.field23642.add(var8.field28401);
                                        }
                                    }
                                }
                            }

                            this.field23638++;
                        }
                    }
                }
            }
        }
    }

    public boolean method16406(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if ((var5.field28402 == -1.0F || this.method16411(var5.field28402, var5.field28403))
                    && Math.sqrt(mc.player.getPosition().method8318(var5.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                return false;
            }
        }

        return true;
    }

    public boolean method16407(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (var5.field28402 == -1.0F && Math.sqrt(mc.player.getPosition().method8318(var5.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var6[0], var6[1], mc.player.onGround));
                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, var5.field28401, Direction.UP));
                this.field23642.clear();
                this.field23642.add(var5.field28401);
                return true;
            }
        }

        return false;
    }

    public boolean method16408(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (this.method16411(var5.field28402, var5.field28403)
                    && Math.sqrt(mc.player.getPosition().method8318(var5.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                if (0 == 0) {
                    float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                    mc.player.swingArm(Hand.MAIN_HAND);
                    mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var6[0], var6[1], mc.player.onGround));
                    mc.getConnection()
                            .sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, BlockUtil.rayTrace(var6[0], var6[1], mc.playerController.getBlockReachDistance() + 1.0F)));
                    this.field23642.clear();
                    this.field23642.add(var5.field28401);
                }

                return true;
            }
        }

        return false;
    }

    @EventTarget
    private void method16409(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (this.field23641 != null) {
                for (Class6463 var5 : this.field23641) {
                }

                for (BlockPos var7 : this.field23642) {
                    method16410(var7);
                }
            }
        }
    }

    public boolean method16411(float var1, NoteBlockInstrument var2) {
        int var5 = 0;

        for (Class6463 var7 : this.field23641) {
            if (var7.field28402 == var1 && var1 != -1.0F && var7.field28403 == var2) {
                var5++;
            }
        }

        return var5 > 1;
    }

    @EventTarget
    private void method16412(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (this.field23641 != null) {
                if (var1.getPacket() instanceof SPlaySoundEffectPacket) {
                    SPlaySoundEffectPacket var4 = (SPlaySoundEffectPacket) var1.getPacket();

                    for (int var5 = 0; var5 < this.field23641.size(); var5++) {
                        Class6463 var6 = this.field23641.get(var5);
                        if (var6.field28401.equals(new BlockPos(var4.method17551(), var4.method17552(), var4.method17553()))) {
                            var6.field28402 = var4.method17555();
                            this.field23641.set(var5, var6);
                        }
                    }
                }

                if (var1.getPacket() instanceof SPlaySoundPacket) {
                    SPlaySoundPacket var7 = (SPlaySoundPacket) var1.getPacket();

                    for (int var8 = 0; var8 < this.field23641.size(); var8++) {
                        Class6463 var9 = this.field23641.get(var8);
                        if (var9.field28401.equals(new BlockPos(var7.method17224(), var7.method17225(), var7.method17226()))) {
                            var9.field28402 = var7.method17228();
                            this.field23641.set(var8, var9);
                        }
                    }
                }
            }
        }
    }

    public void method16413(double var1, double var3, double var5, String var7) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(
                var1 - mc.gameRenderer.getActiveRenderInfo().getPos().getX() + 0.5,
                var3 - mc.gameRenderer.getActiveRenderInfo().getPos().getY() + 1.0,
                var5 - mc.gameRenderer.getActiveRenderInfo().getPos().getZ() + 0.5
        );
        GL11.glAlphaFunc(519, 0.0F);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getYaw(), 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(mc.gameRenderer.getActiveRenderInfo().getPitch(), 1.0F, 0.0F, 0.0F);
        ClientResource var10 = ResourceRegistry.JelloLightFont25;
        GL11.glPushMatrix();
        GL11.glScalef(-0.01F, -0.01F, -0.01F);
        RenderUtil.drawRect(
                (float) (-var10.method23942(var7) / 2 - 10),
                0.0F,
                (float) (var10.method23942(var7) / 2 + 10),
                (float) (var10.method23952() + 2),
                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.4F)
        );
        GL11.glTranslated(-var10.method23942(var7) / 2, 0.0, 0.0);
        RenderUtil.drawString(var10, 0.0F, 0.0F, var7, ClientColors.LIGHT_GREYISH_BLUE.getColor);
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
        if (!mc.playerController.isInCreativeMode()) {
            if (this.field23640.isEmpty()) {
                MultiUtilities.addChatMessage("§cNo Song available! Place NBS formated files in sigma5/nbs and restart the client to try again!");
                MultiUtilities.addChatMessage("§cPlaying the only integrated demo song!");
                this.field23639 = Class8471.method29870(ResourcesDecrypter.readInputStream("com/mentalfrostbyte/gui/resources/music/rememberthis.nbs"));
                if (this.field23639 == null) {
                    MultiUtilities.addChatMessage("§cError loading included song, wtf!");
                    this.setEnabled(false);
                    return;
                }
            } else {
                File var3 = new File(Client.getInstance().getFile() + "/nbs/" + this.getStringSettingValueByName("Song"));
                this.field23639 = Class8471.method29869(var3);
                if (this.field23639 == null) {
                    MultiUtilities.addChatMessage("§cError loading song! Make sure song is saved as <= V3 format");
                    this.setEnabled(false);
                    return;
                }
            }

            System.out.println(this.field23639.method9953());
            MultiUtilities.addChatMessage("Now Playing: " + this.field23639.method9953());
            if (Math.floor(20.0F / this.field23639.method9958()) != (double) (20.0F / this.field23639.method9958())) {
                MultiUtilities.addChatMessage("§cNBS Error! Invalid tempo! (" + this.field23639.method9958() + ") Unpredictable results!");
            }

            this.field23638 = 0;
            this.field23641.clear();

            for (BlockPos var4 : BlockUtil.method34561(mc.playerController.getBlockReachDistance())) {
                BlockState var5 = mc.world.getBlockState(var4);
                if (var5.getBlock() instanceof Class3426) {
                    Class6463 var6 = new Class6463(var4);
                    if (this.method16414(var6) <= 24) {
                        this.field23641.add(new Class6463(var4));
                    }
                }
            }

            this.method16407(this.field23641);
            this.method16408(this.field23641);
        } else {
            MultiUtilities.addChatMessage("§cNoteBlockPlayer isn't available in creative mode!");
            this.setEnabled(false);
        }
    }

    private int method16414(Class6463 var1) {
        Map<NoteBlockInstrument, Integer> var4 = new HashMap<>();

        for (Class6463 var6 : this.field23641) {
            int var7 = var4.getOrDefault(var6.field28403, 0);
            var4.put(var6.field28403, var7);
        }

        return var4.getOrDefault(var1.field28403, 0);
    }
}
