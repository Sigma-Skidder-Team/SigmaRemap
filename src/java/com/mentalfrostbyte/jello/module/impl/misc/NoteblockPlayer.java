package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.NoteBlock;
import net.minecraft.client.Minecraft;
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

public class NoteblockPlayer extends Module {
    public int field23638;
    private Class2403 field23639;
    private List<String> field23640 = new ArrayList<String>();
    private final List<Class6463> field23641 = new ArrayList<Class6463>();
    private final List<BlockPos> field23642 = new ArrayList<BlockPos>();

    public NoteblockPlayer() {
        super(ModuleCategory.MISC, "NoteblockPlayer", "Plays noteblocks! Needs NBS files in sigma5/nbs");
        File var3 = new File(Client.getInstance().file + "/nbs");
        if (var3.exists()) {
            this.field23640 = new ArrayList<>(Arrays.asList(var3.list()));

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
        double var3 = (double) ((float) var0.getX() + 0.5F)
                - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getX();
        double var5 = (double) ((float) var0.getY() + 1.0F)
                - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getY();
        double var7 = (double) ((float) var0.getZ() + 0.5F)
                - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().getPos().getZ();
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

    @Override
    public void onDisable() {
        Rots.rotating = false;
        super.onDisable();
    }

    @EventTarget
    private void method16405(EventUpdate var1) {
        if (this.isEnabled()) {
            if (this.field23639 != null) {
                if (mc.playerController.isInCreativeMode()) {
                    MultiUtilities.addChatMessage("§cNoteBlockPlayer isn't available in creative mode!");
                    this.setEnabled(false);
                } else {
                    if (!this.method16407(this.field23641, var1) && mc.player.ticksExisted % 4 == 0) {
                        this.method16408(this.field23641, var1);
                    }

                    if (this.method16406(this.field23641)) {
                        if (Math.floor((float) mc.player.ticksExisted % this.field23639.method9958()) / 20.0 == 0.0) {
                            if (this.field23638 > this.field23639.method9952()) {
                                this.field23638 = 0;
                            }

                            this.field23642.clear();

                            Rots.rotating = true;

                            for (Class9616 var5 : this.field23639.method9950().values()) {
                                Class8255 var6 = var5.method37433(this.field23638);
                                if (var6 != null) {
                                    for (Class6463 var8 : this.field23641) {
                                        if ((var6.method28780() != 3 && this.method16414(var8) == 0
                                                || var8.method19640() == var6.method28780())
                                                && Class2121.method8807(
                                                        var8.field28402) == (float) (var6.method28782() - 33)
                                                && Math.sqrt(mc.player.getPosition()
                                                        .distanceSq(var8.field28401)) < (double) mc.playerController
                                                                .getBlockReachDistance()) {
                                            float[] var9 = BlockUtil.method34542(var8.field28401, Direction.UP);
                                            if ((double) var8.field28401.getY() > mc.player.getPosY() + 1.0) {
                                                var9 = BlockUtil.method34542(var8.field28401, Direction.DOWN);
                                            }

                                            Rots.prevYaw = var9[0];
                                            Rots.prevPitch = var9[1];
                                            var1.setYaw(var9[0]);
                                            var1.setPitch(var9[1]);
                                            Rots.yaw = var9[0];
                                            Rots.pitch = var9[1];

                                            mc.player.rotationYawHead = var9[0];
                                            mc.player.renderYawOffset = var9[0];

                                            mc.getConnection()
                                                    .sendPacket(new CPlayerDiggingPacket(
                                                            CPlayerDiggingPacket.Action.START_DESTROY_BLOCK,
                                                            var8.field28401, Direction.UP));
                                            mc.player.swingArm(Hand.MAIN_HAND);
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
                    && Math.sqrt(mc.player.getPosition().distanceSq(var5.field28401)) < (double) mc.playerController
                            .getBlockReachDistance()) {
                return false;
            }
        }

        return true;
    }

    public boolean method16407(List<Class6463> var1, EventUpdate event) {
        for (Class6463 var5 : var1) {
            if (var5.field28402 == -1.0F && Math.sqrt(mc.player.getPosition()
                    .distanceSq(var5.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                Rots.rotating = true;
                Rots.prevYaw = var6[0];
                Rots.prevPitch = var6[1];
                event.setYaw(var6[0]);
                event.setPitch(var6[1]);
                Rots.yaw = var6[0];
                Rots.pitch = var6[1];

                mc.player.rotationYawHead = var6[0];
                mc.player.renderYawOffset = var6[0];
                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK,
                        var5.field28401, Direction.UP));
                mc.player.swingArm(Hand.MAIN_HAND);
                this.field23642.clear();
                this.field23642.add(var5.field28401);
                return true;
            }
        }

        return false;
    }

    public void method16407(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (var5.field28402 == -1.0F && Math.sqrt(mc.player.getPosition()
                    .distanceSq(var5.field28401)) < (double) mc.playerController.getBlockReachDistance()) {
                float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                Rots.rotating = true;
                Rots.prevYaw = var6[0];
                Rots.prevPitch = var6[1];
                mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var6[0], var6[1], mc.player.onGround));
                Rots.yaw = var6[0];
                Rots.pitch = var6[1];

                mc.player.rotationYawHead = var6[0];
                mc.player.renderYawOffset = var6[0];
                mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK,
                        var5.field28401, Direction.UP));
                mc.player.swingArm(Hand.MAIN_HAND);
                this.field23642.clear();
                this.field23642.add(var5.field28401);
                return;
            }
        }

    }

    public void method16408(List<Class6463> var1) {
        for (Class6463 var5 : var1) {
            if (this.method16411(var5.field28402, var5.field28403)
                    && Math.sqrt(mc.player.getPosition().distanceSq(var5.field28401)) < (double) mc.playerController
                            .getBlockReachDistance()) {
                float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                mc.player.swingArm(Hand.MAIN_HAND);
                Rots.rotating = true;
                Rots.prevYaw = var6[0];
                Rots.prevPitch = var6[1];
                mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(var6[0], var6[1], mc.player.onGround));
                Rots.yaw = var6[0];
                Rots.pitch = var6[1];

                mc.player.rotationYawHead = var6[0];
                mc.player.renderYawOffset = var6[0];
                mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND,
                        BlockUtil.rayTrace(var6[0], var6[1], mc.playerController.getBlockReachDistance() + 1.0F)));
                this.field23642.clear();
                this.field23642.add(var5.field28401);

                return;
            }
        }

    }

    public void method16408(List<Class6463> var1, EventUpdate event) {
        for (Class6463 var5 : var1) {
            if (this.method16411(var5.field28402, var5.field28403)
                    && Math.sqrt(mc.player.getPosition().distanceSq(var5.field28401)) < (double) mc.playerController
                            .getBlockReachDistance()) {
                float[] var6 = BlockUtil.method34542(var5.field28401, Direction.UP);
                mc.player.swingArm(Hand.MAIN_HAND);
                Rots.rotating = true;
                Rots.prevYaw = var6[0];
                Rots.prevPitch = var6[1];
                event.setYaw(var6[0]);
                event.setPitch(var6[1]);
                Rots.yaw = var6[0];
                Rots.pitch = var6[1];

                mc.player.rotationYawHead = var6[0];
                mc.player.renderYawOffset = var6[0];
                mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND,
                        BlockUtil.rayTrace(var6[0], var6[1], mc.playerController.getBlockReachDistance() + 1.0F)));
                this.field23642.clear();
                this.field23642.add(var5.field28401);

                return;
            }
        }

    }

    @EventTarget
    private void method16409(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (this.field23641 != null) {
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
                        if (var6.field28401
                                .equals(new BlockPos(var4.getPosX(), var4.getPosY(), var4.getPosZ()))) {
                            var6.field28402 = var4.getPitch();
                            this.field23641.set(var5, var6);
                        }
                    }
                }

                if (var1.getPacket() instanceof SPlaySoundPacket) {
                    SPlaySoundPacket var7 = (SPlaySoundPacket) var1.getPacket();

                    for (int var8 = 0; var8 < this.field23641.size(); var8++) {
                        Class6463 var9 = this.field23641.get(var8);
                        if (var9.field28401
                                .equals(new BlockPos(var7.getX(), var7.getY(), var7.getZ()))) {
                            var9.field28402 = var7.getPitch();
                            this.field23641.set(var8, var9);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onEnable() {
        if (!mc.playerController.isInCreativeMode()) {
            if (this.field23640.isEmpty()) {
                MultiUtilities.addChatMessage(
                        "§cNo Song available! Place NBS formated files in sigma5/nbs and restart the client to try again!");
                MultiUtilities.addChatMessage("§cPlaying the only integrated demo song!");
                this.field23639 = Class8471.method29870(
                        ResourceList.readInputStream("com/mentalfrostbyte/gui/resources/music/rememberthis.nbs"));
                if (this.field23639 == null) {
                    MultiUtilities.addChatMessage("§cError loading included song, wtf!");
                    this.setEnabled(false);
                    return;
                }
            } else {
                File var3 = new File(Client.getInstance().file + "/nbs/" + this.getStringSettingValueByName("Song"));
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
                MultiUtilities.addChatMessage(
                        "§cNBS Error! Invalid tempo! (" + this.field23639.method9958() + ") Unpredictable results!");
            }

            this.field23638 = 0;
            this.field23641.clear();

            for (BlockPos var4 : BlockUtil.method34561(mc.playerController.getBlockReachDistance())) {
                BlockState var5 = mc.world.getBlockState(var4);
                if (var5.getBlock() instanceof NoteBlock) {
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

    public static class Class6463 {
        public BlockPos field28401;
        public float field28402 = -1.0F;
        public NoteBlockInstrument field28403;

        public Class6463(BlockPos var1) {
            this.field28401 = var1;
            this.field28403 = NoteBlockInstrument.byState(mc.world.getBlockState(var1.down()));
        }

        public int method19640() {
            return this.field28403.ordinal() - 1;
//            switch (this.field28403) {
//                case BASS:
//                    return 1;
//                case BASEDRUM:
//                    return 2;
//                case SNARE:
//                    return 3;
//                case HAT:
//                    return 4;
//                case GUITAR:
//                    return 5;
//                case FLUTE:
//                    return 6;
//                case BELL:
//                    return 7;
//                case CHIME:
//                    return 8;
//                case XYLOPHONE:
//                    return 9;
//                case IRON_XYLOPHONE:
//                    return 10;
//                case COW_BELL:
//                    return 11;
//                case DIDGERIDOO:
//                    return 12;
//                case BIT:
//                    return 13;
//                case BANJO:
//                    return 14;
//                case PLING:
//                    return 15;
//                default:
//                    return 0;
//            }
        }
    }
}
