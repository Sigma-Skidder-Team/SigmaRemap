package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class6000;
import com.mentalfrostbyte.jello.unmapped.Class6002;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.util.*;

public class Class5281 extends Module {
    public boolean field23743;
    public Animation field23751;
    public Vector3d field23752;
    private double field23735;
    private double field23736;
    private double field23737;
    private double field23738;
    private double field23739;
    private double field23740;
    private double field23741;
    private double field23742;
    private long field23744;
    private float field23745;
    private float field23746;
    private float field23747;
    private float field23748;
    private float field23749;
    private float field23750;
    private Entity field23753;

    public Class5281() {
        super(ModuleCategory.MISC, "Test", "A mod for testing things");
        this.method15972(new Class6000("Bezier", "ey", 0.57F, -0.035F, 0.095F, -0.0F));
        this.method15972(
                new Class6004("Test Checkbox", "A test checkbox", true)
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed checkbox: " + var0.method18619()))
        );
        this.method15972(
                new Class6009<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed slider: " + var0.method18619()))
        );
        this.method15972(
                new Class6002("Test Type", "A test type button", 0, "hello", "goodbye")
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed type: " + var0.method18619()))
        );
        this.method15972(
                new Class6007(
                        "Test Suboptions",
                        "A test suboption",
                        false,
                        new Class6004("Test Checkbox", "A test checkbox", true),
                        new Class6009<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
                )
        );
    }

    public static float[] method16562(Entity var0) {
        double var3 = var0.getPosX() - mc.field1339.getPosX();
        double var5 = var0.getPosZ() - mc.field1339.getPosZ();
        double var7 = mc.field1339.getPosY() + (double) mc.field1339.method3393() - (var0.getPosY() + (double) var0.method3393());
        float var9 = (float) Math.toDegrees(Math.atan2(var5, var3)) - 90.0F;
        double var10 = MathHelper.method37766(var3 * var3 + var5 * var5);
        float var12 = (float) (-(Math.atan2(var7, var10) * 180.0 / Math.PI));
        return new float[]{var9, -var12};
    }

    public static float method16563(float var0, double var1, double var3) {
        double var7 = var1 - mc.field1339.getPosX();
        double var9 = var3 - mc.field1339.getPosZ();
        double var11 = 0.0;
        if (var9 < 0.0 && var7 < 0.0) {
            if (var7 != 0.0) {
                var11 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
            }
        } else if (var9 < 0.0 && var7 > 0.0) {
            if (var7 != 0.0) {
                var11 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
            }
        } else if (var9 != 0.0) {
            var11 = Math.toDegrees(-Math.atan(var7 / var9));
        }

        return MathHelper.method37792(-(var0 - (float) var11));
    }

    public static float method16565(float var0, Entity var1, double var2) {
        double var6 = var1.getPosX() - mc.field1339.getPosX();
        double var8 = var1.getPosZ() - mc.field1339.getPosZ();
        double var10 = var2 - 2.2 + (double) var1.method3393() - mc.field1339.getPosY();
        double var12 = MathHelper.method37766(var6 * var6 + var8 * var8);
        double var14 = -Math.toDegrees(Math.atan(var10 / var12));
        return -MathHelper.method37792(var0 - (float) var14) - 2.5F;
    }

    @Override
    public void isInDevelopment() {
        this.field23739 = 0.0;
        this.field23751 = new Animation(1000, 100000, Direction.FORWARDS);
        this.field23745 = MathHelper.method37792(mc.field1339.field5031);
        this.field23745 = 39.0F;
        this.field23746 = mc.field1339.field5032;
        double var3 = mc.field1339.getPosX();
        double var5 = mc.field1339.getPosY();
        double var7 = mc.field1339.getPosZ();
        double var9 = 3200000.000000002;
        this.field23743 = false;
        this.field23738 = 0.0;
    }

    @Override
    public void method15965() {
        mc.field1284.field40360 = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16547(Class4435 var1) {
        if (this.method15996()) {
            double var4 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
            Class5628.method17725(var1.method13994());
        }
    }

    @EventTarget
    public void method16548(Class4399 var1) {
        if (!this.method15996() || !var1.method13921()) {
        }
    }

    @EventTarget
    public void method16549(TickEvent var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    public void method16550(Class4415 var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    public void method16551(Class4420 var1) {
    }

    @EventTarget
    public void method16552(Class4401 var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    public void method16553(Class4417 var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    @LowestPriority
    public void method16554(Class4418 var1) {
    }

    @EventTarget
    @LowestPriority
    public void method16555(Class4430 var1) {
        if (!this.method15996()) {
        }
    }

    @EventTarget
    @LowestPriority
    public void method16556(Class4429 var1) {
        if (!this.method15996() || mc.field1355 != null) {
        }
    }

    @EventTarget
    public void method16557(Class4420 var1) {
    }

    @EventTarget
    @LowestPriority
    public void method16558(Class4402 var1) {
        Packet var4 = var1.method13932();
        if (this.method15996() && mc.field1339 != null) {
            if (!(var4 instanceof CUseEntityPacket)) {
                if (!(var4 instanceof Class5603)) {
                    if (!(var4 instanceof Class5539)) {
                        if (!(var4 instanceof Class5555)) {
                            if (!(var4 instanceof CAnimateHandPacket)) {
                                if (!(var4 instanceof Class5570)) {
                                    if (!(var4 instanceof Class5492)) {
                                        if (!(var4 instanceof Class5482)) {
                                            if (!(var4 instanceof CClientStatusPacket)) {
                                                if (!(var4 instanceof Class5522)) {
                                                    if (!(var4 instanceof Class5561)) {
                                                        if (!(var4 instanceof Class5600) && var4 instanceof Class5594) {
                                                            Class5594 var5 = (Class5594) var4;
                                                        }
                                                    } else {
                                                        Class5561 var11 = (Class5561) var4;
                                                    }
                                                } else {
                                                    new Class5522();
                                                }
                                            } else {
                                                CClientStatusPacket var12 = (CClientStatusPacket) var4;
                                                if (var12.getStatus() != CClientStatusPacketState.field14279) {
                                                }
                                            }
                                        }
                                    } else {
                                        Class5492 var13 = (Class5492) var4;
                                        if (var13.method17274() != Class2070.field13489) {
                                        }
                                    }
                                } else {
                                    Class5570 var14 = (Class5570) var4;
                                }
                            }
                        } else {
                            Class5555 var15 = (Class5555) var4;
                            if (var15.method17472() != Hand.field183) {
                            }
                        }
                    } else {
                        Class5539 var16 = (Class5539) var4;
                    }
                } else {
                    Class5603 var17 = (Class5603) var4;
                    double var8 = var17.method17626(0.0);
                    String var10 = !var17.method17630() ? "§c" : "§a";
                    Class8906.method32487(var10 + var8);
                }
            } else {
                CUseEntityPacket var18 = (CUseEntityPacket) var4;
                Entity var6 = var18.getEntityFromWorld(mc.field1338);
                if (var6 != null) {
                    var6.getName().getString();
                } else {
                    String var10000 = "null";
                }

                if (var18.getAction() != CUseEntityPacketAction.ATTACK) {
                }
            }

            if (!(var4 instanceof Class5603) && !(var4 instanceof Class5600) && var4 instanceof Class5493) {
            }
        }
    }

    @EventTarget
    public void method16559(Class4396 var1) {
        Packet var4 = var1.method13898();
        if (this.method15996()) {
            if (!(var4 instanceof Class5476)) {
            }

            if (!(var4 instanceof Class5554)) {
                if (!(var4 instanceof Class5542)) {
                    if (!(var4 instanceof Class5473)) {
                        if (!(var4 instanceof Class5556)) {
                            if (!(var4 instanceof Class5615)) {
                                if (!(var4 instanceof Class5581)) {
                                    if (!(var4 instanceof Class5590)) {
                                        if (var4 instanceof Class5515 && this.method15974("Explosions")) {
                                            Class5515 var5 = (Class5515) var1.method13898();
                                        }
                                    } else {
                                        Class5590 var8 = (Class5590) var1.method13898();
                                        if (var8.method17565() != mc.field1339.method3205()) {
                                        }
                                    }
                                } else {
                                    Class5581 var9 = (Class5581) var4;
                                    if (var9.method17525().startsWith("team_")) {
                                    }

                                    for (String var7 : var9.method17527()) {
                                        if (!var7.contains("§") && var7.length() < 2) {
                                        }
                                    }
                                }
                            } else {
                                Class5615 var10 = (Class5615) var4;
                            }
                        } else {
                            Class5556 var11 = (Class5556) var4;
                        }
                    } else {
                        Class5473 var12 = (Class5473) var4;
                    }
                } else {
                    Class5542 var13 = (Class5542) var4;
                }
            } else {
                Class5554 var14 = (Class5554) var4;
            }

            ArrayList var15 = new ArrayList<Class>(
                    Arrays.asList(
                            Class5554.class,
                            Class5542.class,
                            Class5473.class,
                            Class5588.class,
                            Class5547.class,
                            Class5549.class,
                            SChatPacket.class,
                            Class5516.class,
                            Class5590.class
                    )
            );
            if (var15.contains(var4.getClass())) {
            }

            if (!(var4 instanceof Class5472)) {
            }
        }
    }

    public List<Entity> method16560(float var1) {
        List var4 = Class5628.method17708();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 != mc.field1339) {
                if (!Client.getInstance().getFriendManager().method26997(var6)) {
                    if (var6 instanceof Class880) {
                        if (((Class880) var6).method3042() != 0.0F) {
                            if (!(mc.field1339.method3275(var6) > var1)) {
                                if (mc.field1339.method3026((Class880) var6)) {
                                    if (!(var6 instanceof Class1005) && !(var6 instanceof PlayerEntity)) {
                                        if (var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var6)) {
                                            var5.remove();
                                        } else if (mc.field1339.getRidingEntity() != null && mc.field1339.getRidingEntity().equals(var6)) {
                                            var5.remove();
                                        } else if (!var6.method3362()) {
                                            if (var6 instanceof PlayerEntity && Class8781.method31662((PlayerEntity) var6)) {
                                                var5.remove();
                                            }
                                        } else {
                                            var5.remove();
                                        }
                                    } else {
                                        var5.remove();
                                    }
                                } else {
                                    var5.remove();
                                }
                            } else {
                                var5.remove();
                            }
                        } else {
                            var5.remove();
                        }
                    } else {
                        var5.remove();
                    }
                } else {
                    var5.remove();
                }
            } else {
                var5.remove();
            }
        }

        Collections.sort(var4, new Class3597(this));
        return var4;
    }

    public Entity method16561(float var1) {
        List var4 = Class5628.method17708();
        Entity var5 = null;
        Iterator var6 = var4.iterator();

        while (var6.hasNext()) {
            Entity var7 = (Entity) var6.next();
            if (var7 != mc.field1339) {
                if (!Client.getInstance().getFriendManager().method26997(var7)) {
                    if (var7 instanceof Class880) {
                        if (((Class880) var7).method3042() != 0.0F) {
                            if (!(mc.field1339.method3275(var7) > var1)) {
                                if (mc.field1339.method3026((Class880) var7)) {
                                    if (!(var7 instanceof Class1005)) {
                                        if (var7 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var7)) {
                                            var6.remove();
                                        } else if (mc.field1339.getRidingEntity() != null && mc.field1339.getRidingEntity().equals(var7)) {
                                            var6.remove();
                                        } else if (!var7.method3362()) {
                                            if (var5 == null || mc.field1339.method3275(var7) < mc.field1339.method3275(var5)) {
                                                var5 = var7;
                                            }
                                        } else {
                                            var6.remove();
                                        }
                                    } else {
                                        var6.remove();
                                    }
                                } else {
                                    var6.remove();
                                }
                            } else {
                                var6.remove();
                            }
                        } else {
                            var6.remove();
                        }
                    } else {
                        var6.remove();
                    }
                } else {
                    var6.remove();
                }
            } else {
                var6.remove();
            }
        }

        return var5;
    }

    private double method16564(double var1, double var3) {
        return var1 + Math.random() * (var3 - var1);
    }
}
