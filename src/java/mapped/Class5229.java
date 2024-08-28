package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4429;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class Class5229 extends Module {
    public ModuleCategory field23576;
    public Module field23577;
    private final String field23578 = ">";

    public Class5229() {
        super(ModuleCategory.MOVEMENT, "VClip", "Climp Walls like spiders!");
    }

    public static boolean method16291(String var0) {
        return var0.matches("-?\\d+(\\.\\d+)?");
    }

    @EventTarget
    private void method16289(Class4429 var1) {
        if (this.method15996()) {
            if (mc.gameSettings.field44637.method8509() && var1.method13976() == Class2116.field13791) {
                if (!(mc.player.field5032 < 0.0F)) {
                    this.method16294(this.method16292());
                } else {
                    this.method16294(this.method16293());
                }
            }
        }
    }

    @EventTarget
    private void method16290(Class4402 var1) {
        if (var1.method13932() instanceof Class5522) {
            Class5522 var4 = (Class5522) var1.method13932();
            String var5 = var4.method17359();
            String var6 = "hclip";
            if (!var5.startsWith("/" + var6)) {
                return;
            }

            var1.method13900(true);
            int var7 = 0;
            var5 = var5.replace("/" + var6, "").replaceAll("\\s", "");
            if (method16291(var5)) {
                var7 = Integer.parseInt(var5);
            }

            float var8 = (float) Math.toRadians(mc.player.field5031 + 90.0F);
            double var9 = MathHelper.method37764(var8) * (float) var7;
            double var11 = MathHelper.method37763(var8) * (float) var7;
            mc.player
                    .method3215(mc.player.getPosX() + var9, mc.player.getPosY(), mc.player.getPosZ() + var11);
        }
    }

    private int method16292() {
        boolean var3 = false;
        int var4 = 0;

        for (int var5 = 0; var5 < 10; var5++) {
            BlockPos var6 = new BlockPos(mc.player.getPosX(), mc.player.getPosY() - (double) var5, mc.player.getPosZ());
            if (mc.world.method6738(var6).method23410() && var3) {
                var4 = -var5;
                break;
            }

            var3 = mc.world.method6738(var6).method23410();
        }

        return var4;
    }

    private int method16293() {
        boolean var3 = false;
        int var4 = 0;

        for (int var5 = 10; var5 > 0; var5--) {
            BlockPos var6 = new BlockPos(mc.player.getPosX(), mc.player.getPosY() + (double) var5, mc.player.getPosZ());
            if (mc.world.method6738(var6).method23410() && var3 && !mc.world.method6738(var6.method8313()).method23410()) {
                var4 = var5;
                break;
            }

            var3 = mc.world.method6738(var6).method23410();
        }

        return var4;
    }

    private void method16294(int var1) {
        if (var1 == 0) {
            Class5628.method17678("§cCouldn't VClip");
        } else {
            mc.getClientPlayNetHandler()
                    .sendPacket(
                            new Class5605(mc.player.getPosX(), mc.player.getPosY() + (double) var1, mc.player.getPosZ(), false)
                    );
            mc.player
                    .method3215(mc.player.getPosX(), mc.player.getPosY() + (double) var1, mc.player.getPosZ());
            Client.getInstance().getNotificationManager().post(new Notification("Successfuly VCliped", var1 + " Blocks", 2000, ResourcesDecrypter.directionIconPNG));
        }
    }
}
