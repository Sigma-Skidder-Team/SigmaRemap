package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class Class5185 extends Module {
    public int field23484;
    public int field23487;
    public int field23488;
    public int field23489;
    public Class8711 field23490;
    public Thread field23491;
    public Class9823 field23492;
    private List<Class9510> field23485;
    private Class9110 field23486;

    public Class5185() {
        super(ModuleCategory.RENDER, "PathFinder", "You know what it is");
    }

    @EventTarget
    public void method16142(TickEvent var1) {
        this.field23490 = Class9217.method34567(mc.player.field5031, mc.player.field5032, 200.0F);
        if (this.field23491 != null && this.field23492 != null) {
            Client.getInstance()
                    .getNotificationManager()
                    .post(new Notification("AutoMiner", "Computing... (" + this.field23492.field45900 + ")", ResourcesDecrypter.directionIconPNG));
        }
    }

    @EventTarget
    public void method16143(Class4420 var1) {
        if (this.method15996()) {
            if (this.field23490 != null) {
                int var4 = Class5628.method17688(Class1979.field12901.field12910, 0.14F);
                GL11.glPushMatrix();
                GL11.glDisable(2929);
                BlockPos var5 = this.field23490.method31423();
                double var6 = (double) var5.method8304() - mc.gameRenderer.getActiveRenderInfo().method37504().method11320();
                double var8 = (double) var5.getY() - mc.gameRenderer.getActiveRenderInfo().method37504().method11321();
                double var10 = (double) var5.method8306() - mc.gameRenderer.getActiveRenderInfo().method37504().method11322();
                Class9388 var12 = new Class9388(var6, var8, var10, var6 + 1.0, var8 + 1.0, var10 + 1.0);
                Class3192.method11459(var12, var4);
                GL11.glEnable(2929);
                GL11.glPopMatrix();
            }
        }
    }
}