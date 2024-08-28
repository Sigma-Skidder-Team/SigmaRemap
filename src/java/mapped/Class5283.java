package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class5283 extends Module {
    private int field23755;
    private final Animation field23756 = new Animation(1500, 1500, Direction.BACKWARDS);

    public Class5283() {
        super(ModuleCategory.GUI, "Cords", "Displays coordinates");
    }

    @EventTarget
    private void method16578(TickEvent var1) {
        if (this.method15996()) {
            if (Class5628.method17705() > this.field23755 && mc.player.field5055 % 3 == 0) {
                this.field23755++;
            }

            if (Class5628.method17705() < this.field23755 && mc.player.field5055 % 3 == 0) {
                this.field23755--;
            }

            boolean var4 = Class9567.method37087() || mc.player.field4981 || mc.player.method3331();
            if (!var4) {
                if (this.field23756.calcPercent() == 1.0F && this.field23756.method25319() == Direction.FORWARDS) {
                    this.field23756.changeDirection(Direction.BACKWARDS);
                }
            } else {
                this.field23756.changeDirection(Direction.FORWARDS);
            }
        }
    }

    @EventTarget
    @LowestPriority
    private void method16579(Class4415 var1) {
        if (this.method15996()) {
            if (mc.player != null) {
                if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
                    if (!Minecraft.getInstance().gameSettings.field44662) {
                        float var4 = Math.min(1.0F, 0.6F + this.field23756.calcPercent() * 4.0F);
                        String var5 = mc.player.method3432().method8304()
                                + " "
                                + mc.player.method3432().getY()
                                + " "
                                + mc.player.method3432().method8306();
                        byte var6 = 85;
                        int var7 = var1.method13960();
                        short var8 = 150;
                        float var9 = (float) ResourceRegistry.JelloLightFont18.method23942(var5);
                        float var10 = Math.min(1.0F, (float) var8 / var9);
                        if (this.field23756.method25319() != Direction.FORWARDS) {
                            var10 *= 0.9F + Class9782.method38556(Math.min(1.0F, this.field23756.calcPercent() * 8.0F), 0.0F, 1.0F, 1.0F) * 0.1F;
                        } else {
                            var10 *= 0.9F + Class9747.method38214(Math.min(1.0F, this.field23756.calcPercent() * 7.0F), 0.0F, 1.0F, 1.0F) * 0.1F;
                        }

                        GL11.glPushMatrix();
                        GL11.glTranslatef(var6, (float) (var7 + 10), 0.0F);
                        GL11.glScalef(var10, var10, 1.0F);
                        GL11.glTranslatef((float) (-var6), (float) (-var7 - 10), 0.0F);
                        Class3192.method11440(
                                ResourceRegistry.JelloLightFont18_1,
                                var6,
                                (float) var7,
                                var5,
                                Class5628.method17688(-16777216, 0.5F * var4),
                                Class2218.field14492,
                                Class2218.field14488
                        );
                        Class3192.method11440(
                                ResourceRegistry.JelloLightFont18,
                                var6,
                                (float) var7,
                                var5,
                                Class5628.method17688(Class1979.field12896.field12910, 0.8F * var4),
                                Class2218.field14492,
                                Class2218.field14488
                        );
                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }
}