package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class Class5261 extends PremiumModule {
    private static final String field23664 = "Show in GUI";
    private static final String field23665 = "Smart Visibility";
    private static final String field23666 = "Size";
    public static Framebuffer field23663;
    public Animation field23662;
    public int field23667 = 0;

    public Class5261() {
        super("RearView", "See behind you", ModuleCategory.GUI);
        this.field23662 = new Animation(230, 200, Direction.BACKWARDS);
        this.method15972(new Class6004("Show in GUI", "Makes the Rear View visible in guis", false));
        this.method15972(new Class6004("Smart Visibility", "Only pops up when a player is behind you", false));
        this.method15972(new Class6009<Integer>("Size", "The rear view width", 400.0F, Integer.class, 120.0F, 1000.0F, 1.0F));
        this.method16005(false);
    }

    @EventTarget
    public void method16447(Class4428 var1) {
        if (this.method15996()) {
            if (field23663 != null && (field23663.field35732 != field23386.field1283.method8041() || field23663.field35733 != field23386.field1283.method8042())) {
                this.method15966();
            }

            if (this.method15974("Smart Visibility")) {
                List var4 = field23386.field1338
                        .method6772(
                                PlayerEntity.class,
                                field23386.field1339.method3389().method19664(14.0),
                                var1x -> var1x.method3275(field23386.field1339) < 12.0F
                                        && !this.method16448(var1x)
                                        && field23386.field1339 != var1x
                                        && !Client.getInstance().getCombatManager().method29346(var1x)
                        );
                if (var4.isEmpty()) {
                    if (this.field23667 > 0) {
                        this.field23667--;
                    }
                } else {
                    this.field23667 = 5;
                }
            }
        }
    }

    public boolean method16448(Class880 var1) {
        float var4 = Class9142.method34138(var1, field23386.field1339.getPosX(), field23386.field1339.getPosY(), field23386.field1339.getPosZ())[0];
        return this.method16449(field23386.field1339.field5031, var4) <= 90.0F;
    }

    public float method16449(float var1, float var2) {
        float var5 = Math.abs(var2 - var1) % 360.0F;
        return !(var5 > 180.0F) ? var5 : 360.0F - var5;
    }

    @EventTarget
    public void method16450(Class4415 var1) {
        if (field23663 != null) {
            if (this.method15996()) {
                if (!Minecraft.getInstance().field1299.field44662) {
                    if (!this.method15974("Smart Visibility")) {
                        this.field23662.changeDirection(field23386.field1355 != null && !this.method15974("Show in GUI") ? Direction.BACKWARDS : Direction.FORWARDS);
                    } else {
                        this.field23662.changeDirection(this.field23667 <= 0 ? Direction.BACKWARDS : Direction.FORWARDS);
                    }

                    float var4 = (float) field23386.field1283.method8043() / (float) field23386.field1283.method8044();
                    int var5 = (int) this.method15977("Size");
                    int var6 = (int) ((float) var5 / var4);
                    int var7 = 10;
                    int var8 = -var7 - var6;
                    if (this.field23662.calcPercent() == 0.0F && this.field23662.calcPercent() == 1.0F) {
                        if (this.field23662.calcPercent() == 0.0F) {
                            return;
                        }
                    } else if (this.field23662.method25319() != Direction.FORWARDS) {
                        var8 = (int) ((float) var8 * Class8603.method30791(this.field23662.calcPercent(), 0.49, 0.59, 0.16, 1.04));
                    } else {
                        var8 = (int) ((float) var8 * Class8603.method30791(this.field23662.calcPercent(), 0.3, 0.88, 0.47, 1.0));
                    }

                    Class3192.method11463(
                            (float) (field23386.field1283.method8043() - var7 - var5),
                            (float) (field23386.field1283.method8044() + var8),
                            (float) var5,
                            (float) (var6 - 1),
                            14.0F,
                            this.field23662.calcPercent()
                    );
                    var5 = (int) ((float) var5 * GuiManager.field41348);
                    var6 = (int) ((float) var6 * GuiManager.field41348);
                    var7 = (int) ((float) var7 * GuiManager.field41348);
                    var8 = (int) ((float) var8 * GuiManager.field41348);
                    RenderSystem.pushMatrix();
                    this.method16451(
                            field23663, var5, var6, field23386.field1283.method8041() - var7 - var5, field23386.field1283.method8042() + var8
                    );
                    RenderSystem.popMatrix();
                    RenderSystem.method27877(256, Minecraft.field1272);
                    RenderSystem.method27878(5889);
                    RenderSystem.method27879();
                    RenderSystem.method27882(
                            0.0,
                            (double) field23386.field1283.method8041() / field23386.field1283.method8049(),
                            (double) field23386.field1283.method8042() / field23386.field1283.method8049(),
                            0.0,
                            1000.0,
                            3000.0
                    );
                    RenderSystem.method27878(5888);
                    RenderSystem.method27879();
                    RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
                    GL11.glScaled(
                            1.0 / field23386.field1283.method8049() * (double) GuiManager.field41348,
                            1.0 / field23386.field1283.method8049() * (double) GuiManager.field41348,
                            1.0
                    );
                    field23663.method29114();
                    field23386.method1464().method29112(true);
                }
            }
        }
    }

    public void method16451(Framebuffer var1, int var2, int var3, double var4, double var6) {
        var6 = var6 - (double) field23386.field1283.method8042() + (double) var3;
        RenderSystem.method27870(true, true, true, false);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.method27878(5889);
        RenderSystem.method27879();
        RenderSystem.method27882(0.0, (double) var2 + var4, var3, 0.0, 1000.0, 3000.0);
        RenderSystem.method27878(5888);
        RenderSystem.method27879();
        RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
        RenderSystem.method27869(0, 0, var2 + (int) var4, var3 - (int) var6);
        RenderSystem.method27861();
        RenderSystem.method27821();
        RenderSystem.method27817();
        RenderSystem.disableBlend();
        RenderSystem.method27822();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        var1.method29110();
        float var10 = (float) var2;
        float var11 = (float) var3;
        float var12 = (float) var1.field35732 / (float) var1.field35730;
        float var13 = (float) var1.field35733 / (float) var1.field35731;
        Class9352 var14 = RenderSystem.method27937();
        Class5425 var15 = var14.method35411();
        var15.method17063(7, Class9337.field43346);
        var15.method17025(var4, (double) var11 + var6, 0.0).method17027(0.0F, 0.0F).method17026(255, 255, 255, 255).method17031();
        var15.method17025((double) var10 + var4, (double) var11 + var6, 0.0).method17027(var12, 0.0F).method17026(255, 255, 255, 255).method17031();
        var15.method17025((double) var10 + var4, var6, 0.0).method17027(var12, var13).method17026(255, 255, 255, 255).method17031();
        var15.method17025(var4, var6, 0.0).method17027(0.0F, var13).method17026(255, 255, 255, 255).method17031();
        var14.method35410();
        var1.method29111();
        RenderSystem.depthMask(true);
        RenderSystem.method27870(true, true, true, true);
    }

    @EventTarget
    public void method16452(Class4422 var1) {
        if (this.method15996()) {
            if (field23663 != null) {
                if (field23386.field1355 == null || this.method15974("Show in GUI") || this.field23667 != 0) {
                    Class3192.method11468();
                    RenderSystem.pushMatrix();
                    RenderSystem.method27877(16640, false);
                    field23663.method29112(true);
                    RenderSystem.method27861();
                    RenderSystem.method27822();
                    int var4 = field23386.field1299.field44576;
                    int var5 = Math.min(Minecraft.method1586(), var4);
                    var5 = Math.max(var5, 60);
                    long var6 = Util.method38488() - var1.field21555;
                    float var8 = field23386.field1339.field5031;
                    field23386.field1339.field5031 += 180.0F;
                    RenderSystem.enableDepthTest();
                    GL11.glAlphaFunc(519, 0.0F);
                    double var9 = field23386.field1299.field44669;
                    field23386.field1299.field44669 = 114.0;
                    field23386.field1295.field814 = false;
                    Client.field28993 = true;
                    Framebuffer var11 = field23386.field1287.field959;
                    field23386.field1287.field959 = null;
                    field23386.field1295.method754(var1.field21554, Util.method38488(), new Class9332());
                    field23386.field1287.field959 = var11;
                    Client.field28993 = false;
                    field23386.field1295.field814 = true;
                    field23386.field1299.field44669 = var9;
                    field23386.field1339.field5031 = var8;
                    RenderSystem.popMatrix();
                    field23386.method1464().method29112(true);
                }
            } else {
                this.method15966();
            }
        }
    }

    @Override
    public void method15966() {
        Class3192.method11469(field23386.method1464());
        field23663 = new Framebuffer(field23386.field1283.method8041(), field23386.field1283.method8042(), true, Minecraft.field1272);
        field23663.method29115(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void method15965() {
        this.field23662.changeDirection(Direction.BACKWARDS);
    }
}
