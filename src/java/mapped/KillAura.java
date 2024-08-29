package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class KillAura extends Module {
    public static boolean field23937 = false;
    public static Entity field23948;
    public static Class8012 field23949;
    public static Class7461 field23951 = new Class7461(0.0F, 0.0F);
    public static int field23954;
    public HashMap<Entity, Animation> field23961 = new HashMap<Entity, Animation>();
    private Class9528 field23938;
    private int field23939;
    private int field23940;
    private int field23941;
    private int field23942;
    private int field23943;
    private int field23944;
    private int field23945;
    private int field23946;
    private int field23947;
    private List<Class8012> field23950;
    private Class7461 field23952;
    private Class7461 field23953;
    private double field23955;
    private float field23956;
    private float field23957;
    private float field23958;
    private boolean field23959;
    private double[] field23960;

    public KillAura() {
        super(ModuleCategory.COMBAT, "KillAura", "Automatically attacks entities");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Single", "Switch", "Multi", "Multi2"));
        this.registerSetting(new ModeSetting("Autoblock Mode", "Autoblock Mode", 0, "None", "NCP", "Basic1", "Basic2", "Vanilla"));
        this.registerSetting(new ModeSetting("Sort Mode", "Sort Mode", 0, "Range", "Health", "Angle", "Armor", "Prev Range"));
        this.registerSetting(new ModeSetting("Attack Mode", "Attacks after or before sending the movement", 0, "Pre", "Post"));
        this.registerSetting(new ModeSetting("Rotation Mode", "The way you will look at entities", 0, "NCP", "AAC", "Smooth", "LockView", "Test", "Test2", "None"));
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Block Range", "Block Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.2F));
        this.registerSetting(
                new NumberSetting<Float>("Min CPS", "Min CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F).method18616(var1 -> this.field23938.method36818())
        );
        this.registerSetting(
                new NumberSetting<Float>("Max CPS", "Max CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F).method18616(var1 -> this.field23938.method36818())
        );
        this.registerSetting(new NumberSetting<Float>("Hit box expand", "Hit Box expand", 0.05F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Hit Chance", "Hit Chance", 100.0F, Float.class, 25.0F, 100.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Interact autoblock", "Send interact packet when blocking", true));
        this.registerSetting(new BooleanSetting("Players", "Hit players", true));
        this.registerSetting(new BooleanSetting("Animals", "Hit animals", false));
        this.registerSetting(new BooleanSetting("Monsters", "Hit monsters", false));
        this.registerSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
        this.registerSetting(new BooleanSetting("Raytrace", "Helps the aura become more legit", true));
        this.registerSetting(new BooleanSetting("Cooldown", "Use attack cooldown (1.9+)", false));
        this.registerSetting(new BooleanSetting("No swing", "Hit without swinging", false));
        this.registerSetting(new BooleanSetting("Disable on death", "Disable on death", true));
        this.registerSetting(new BooleanSetting("Through walls", "Target entities through walls", true));
        this.registerSetting(new BooleanSetting("Smart Reach", "Allows you to get more reach (depends on your ping)", true));
        this.registerSetting(new BooleanSetting("Silent", "Silent rotations", true));
        this.registerSetting(new BooleanSetting("ESP", "ESP on targets", true));
        this.registerSetting(new ColorSetting("ESP Color", "The render color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
    }

    // $VF: synthetic method
    public static Minecraft method16837() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16838() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16839() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16840() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16841() {
        return mc;
    }

    // $VF: synthetic method
    public static Class7461 method16842(KillAura var0) {
        return var0.field23953;
    }

    // $VF: synthetic method
    public static Class7461 method16843(KillAura var0) {
        return var0.field23952;
    }

    // $VF: synthetic method
    public static Class9528 method16844(KillAura var0) {
        return var0.field23938;
    }

    // $VF: synthetic method
    public static List<Class8012> method16845(KillAura var0) {
        return var0.field23950;
    }

    // $VF: synthetic method
    public static int method16846(KillAura var0) {
        return var0.field23942;
    }

    // $VF: synthetic method
    public static int method16847(KillAura var0, int var1) {
        return var0.field23942 = var1;
    }

    // $VF: synthetic method
    public static Minecraft method16848() {
        return mc;
    }

    @Override
    public void method15953() {
        this.field23950 = new ArrayList<Class8012>();
        this.field23938 = new Class9528(this);
        super.method15953();
    }

    @Override
    public void onEnable() {
        this.field23950 = new ArrayList<Class8012>();
        field23948 = null;
        field23949 = null;
        this.field23939 = (int) this.field23938.method36819(0);
        this.field23940 = 0;
        this.field23942 = 0;
        field23954 = 0;
        this.field23953 = new Class7461(mc.player.field6122, mc.player.field6123);
        this.field23952 = new Class7461(mc.player.rotationYaw, mc.player.rotationPitch);
        field23951 = new Class7461(mc.player.rotationYaw, mc.player.rotationPitch);
        this.field23957 = -1.0F;
        this.field23938
                .method36814(mc.player.getHeldItem(Hand.MAIN_HAND).getItem() instanceof ItemSword && mc.gameSettings.keyBindUseItem.isKeyDown());
        this.field23959 = false;
        this.field23946 = -1;
        this.field23938.field44349.clear();
        this.field23961.clear();
        if (mc.player.onGround) {
            this.field23941 = 1;
        }

        super.onEnable();
    }

    @Override
    public void onDisable() {
        field23948 = null;
        field23949 = null;
        this.field23950 = null;
        field23937 = false;
        super.onDisable();
    }

    @EventTarget
    public void method16818(WorldLoadEvent var1) {
        if (this.isEnabled() && this.getBooleanValueFromSetttingName("Disable on death")) {
            Client.getInstance().getNotificationManager().post(new Notification("Aura", "Aura disabled due to respawn"));
            this.method16000();
        }
    }

    @EventTarget
    public void method16819(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.field23957 != -1.0F) {
                this.field23957++;
            }

            if (this.getBooleanValueFromSetttingName("Disable on death")) {
                if (!mc.player.method3066()) {
                    this.method16000();
                    Client.getInstance().getNotificationManager().post(new Notification("Aura", "Aura disabled due to death"));
                }
            }
        }
    }

    @EventTarget
    public void method16820(StopUseItemEvent var1) {
        if (this.isEnabled()) {
            if (!this.getStringSettingValueByName("Autoblock Mode").equals("None")
                    && (mc.player.method3090().getItem() instanceof ItemSword || this.field23943 != mc.player.inventory.currentItem)
                    && field23948 != null) {
                var1.method13900(true);
            } else if (mc.player.method3090().getItem() instanceof ItemSword) {
                this.field23945 = 2;
            }
        }
    }

    @EventTarget
    @LowestPriority
    public void method16821(Class4399 var1) {
        if (this.isEnabled() && mc.player != null) {
            if (!var1.method13921()) {
                this.field23943 = mc.player.inventory.currentItem;
                if (field23948 != null && this.field23938.method36817() && this.field23952 != null) {
                    this.field23938.method36815(field23948, this.field23952.field32084, this.field23952.field32085);
                }
            } else {
                if (this.field23945 > 0) {
                    this.field23945--;
                }

                if (field23948 != null && this.field23938.method36813() && Class9567.method37087() && this.getStringSettingValueByName("Autoblock Mode").equals("NCP")) {
                    this.field23938.method36816();
                }

                if (this.field23938.method36813() && (!(mc.player.method3090().getItem() instanceof ItemSword) || field23948 == null)) {
                    this.field23938.method36814(false);
                }

                if (this.field23946 >= 0) {
                    if (this.field23946 == 0) {
                        this.field23938.method36816();
                        this.field23938.method36814(true);
                    }

                    this.field23946--;
                }

                this.method16830();
                if (this.field23950 != null && !this.field23950.isEmpty()) {
                    this.field23939++;
                    float var4 = this.getNumberValueBySettingName("Hit box expand");
                    ModuleWithModuleSettings var5 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(Class5332.class);
                    if (var5.isEnabled() && var5.getStringSettingValueByName("Type").equalsIgnoreCase("Minis")) {
                        this.method16828(var1, var5.method16726().getStringSettingValueByName("Mode"), var5.method16726().getBooleanValueFromSetttingName("Avoid Fall Damage"));
                    }

                    this.method16831();
                    if (var1.method13917() - mc.player.rotationYaw != 0.0F) {
                        this.field23952.field32084 = var1.method13917();
                        this.field23952.field32085 = var1.method13915();
                    }

                    var1.method13918(this.field23952.field32084);
                    var1.method13916(this.field23952.field32085);
                    boolean var6 = this.field23938.method36821(this.field23939);
                    float var7 = !((double) mc.player.method2973() < 1.26) && this.getBooleanValueFromSetttingName("Cooldown") ? mc.player.method2974(0.0F) : 1.0F;
                    boolean var8 = field23954 == 0 && var6 && var7 >= 1.0F;
                    if (var6) {
                        this.field23938.method36822();
                    }

                    if (var8) {
                        Class338 var9 = new Class338(this, var4);
                        boolean var10 = this.getStringSettingValueByName("Attack Mode").equals("Pre");
                        if (!var10) {
                            var1.method13922(var9);
                        } else {
                            var9.run();
                        }

                        this.field23939 = 0;
                    }

                    if (field23954 > 0) {
                        field23954--;
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16822(Class4415 var1) {
        if (field23949 != null && !this.getBooleanValueFromSetttingName("Silent") && !this.getStringSettingValueByName("Rotation Mode").equals("None")) {
            float var4 = MathHelper.method37792(this.field23953.field32084 + (this.field23952.field32084 - this.field23953.field32084) * mc.getRenderPartialTicks());
            float var5 = MathHelper.method37792(this.field23953.field32085 + (this.field23952.field32085 - this.field23953.field32085) * mc.getRenderPartialTicks());
            mc.player.rotationYaw = var4;
            mc.player.rotationPitch = var5;
        }
    }

    @EventTarget
    public void method16823(Class4420 var1) {
        if (this.field23950 != null) {
            Iterator var4 = this.field23961.entrySet().iterator();

            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();

                for (Class8012 var7 : this.field23950) {
                    if (!var5.getKey().equals(var7.method27397())) {
                    }
                }

                ((Animation) var5.getValue()).changeDirection(Direction.BACKWARDS);
                if (((Animation) var5.getValue()).calcPercent() == 0.0F) {
                    var4.remove();
                }
            }

            for (Class8012 var10 : this.field23950) {
                if (var10 != null) {
                    if (!this.field23961.containsKey(var10.method27397())) {
                        this.field23961.put(var10.method27397(), new Animation(250, 250));
                    } else {
                        this.field23961.get(var10.method27397()).changeDirection(Direction.FORWARDS);
                    }
                }
            }

            for (Entry var11 : this.field23961.entrySet()) {
                this.method16825((Entity) var11.getKey());
            }
        }
    }

    @EventTarget
    public void method16824(RecievePacketEvent var1) {
        Packet var4 = var1.getPacket();
        if (!(var4 instanceof Class5476)) {
            if (var4 instanceof Class5464) {
                Class5464 var5 = (Class5464) var4;
                if (var5.method17179() == 3) {
                    this.field23938.field44349.remove(var5.method17178(mc.world));
                }
            }
        } else {
            Class5476 var11 = (Class5476) var4;
            if (var11.method17237() && (var11.field24323 != 0 || var11.field24324 != 0 || var11.field24325 != 0)) {
                for (Entry var7 : this.field23938.field44349.entrySet()) {
                    Entity var8 = (Entity) var7.getKey();
                    List var9 = (List) var7.getValue();
                    if (var11.method17233(mc.world) == var8) {
                        Vector3d var10 = var8.field_242272_av.method11344(2.4414062E-4F);
                        var9.add(new Class9629<Vector3d, Long>(var10, System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    public void method16825(Entity var1) {
        GL11.glPushMatrix();
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glEnable(32925);
        GL11.glEnable(2929);
        GL11.glLineWidth(1.4F);
        double var4 = Minecraft.getInstance().timer.renderPartialTicks;
        if (!var1.method3066()) {
            var4 = 0.0;
        }

        GL11.glTranslated(
                var1.lastTickPosX + (var1.getPosX() - var1.lastTickPosX) * var4,
                var1.lastTickPosY + (var1.getPosY() - var1.lastTickPosY) * var4,
                var1.lastTickPosZ + (var1.getPosZ() - var1.lastTickPosZ) * var4
        );
        GL11.glTranslated(
                -mc.gameRenderer.getActiveRenderInfo().method37504().method11320(),
                -mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                -mc.gameRenderer.getActiveRenderInfo().method37504().method11322()
        );
        GL11.glEnable(32823);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(519, 0.0F);
        short var6 = 1800;
        float var7 = (float) (System.currentTimeMillis() % (long) var6) / (float) var6;
        boolean var8 = var7 > 0.5F;
        var7 = !var8 ? var7 * 2.0F : 1.0F - var7 * 2.0F % 1.0F;
        GL11.glTranslatef(0.0F, (var1.method3430() + 0.4F) * var7, 0.0F);
        float var9 = (float) Math.sin((double) var7 * Math.PI);
        this.method16826(var8, 0.45F * var9, 0.6F, 0.35F * var9, this.field23961.get(var1).calcPercent());
        GL11.glPushMatrix();
        GL11.glTranslated(
                mc.gameRenderer.getActiveRenderInfo().method37504().method11320(),
                mc.gameRenderer.getActiveRenderInfo().method37504().method11321(),
                mc.gameRenderer.getActiveRenderInfo().method37504().method11322()
        );
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(32925);
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }

    public void method16826(boolean var1, float var2, float var3, float var4, float var5) {
        RenderSystem.method27866(7425);
        GL11.glDisable(32823);
        GL11.glDisable(2929);
        GL11.glBegin(5);
        int var8 = (int) (360.0F / (40.0F * var3));
        Color var9 = new Color(this.parseSettingValueToIntBySettingName("ESP Color"));
        float var10 = (float) var9.getRed() / 255.0F;
        float var11 = (float) var9.getGreen() / 255.0F;
        float var12 = (float) var9.getBlue() / 255.0F;

        for (int var13 = 0; var13 <= 360 + var8; var13 += var8) {
            int var14 = var13;
            if (var13 > 360) {
                var14 = 0;
            }

            double var15 = Math.sin((double) var14 * Math.PI / 180.0) * (double) var3;
            double var17 = Math.cos((double) var14 * Math.PI / 180.0) * (double) var3;
            GL11.glColor4f(var10, var11, var12, !var1 ? 0.0F : var4 * var5);
            GL11.glVertex3d(var15, 0.0, var17);
            GL11.glColor4f(var10, var11, var12, var1 ? 0.0F : var4 * var5);
            GL11.glVertex3d(var15, var2, var17);
        }

        GL11.glEnd();
        GL11.glLineWidth(2.2F);
        GL11.glBegin(3);

        for (int var19 = 0; var19 <= 360 + var8; var19 += var8) {
            int var20 = var19;
            if (var19 > 360) {
                var20 = 0;
            }

            double var21 = Math.sin((double) var20 * Math.PI / 180.0) * (double) var3;
            double var22 = Math.cos((double) var20 * Math.PI / 180.0) * (double) var3;
            GL11.glColor4f(var10, var11, var12, (0.5F + 0.5F * var4) * var5);
            GL11.glVertex3d(var21, !var1 ? (double) var2 : 0.0, var22);
        }

        GL11.glEnd();
        GL11.glEnable(2929);
        RenderSystem.method27866(7424);
    }

    public boolean method16827() {
        return field23948 != null
                && mc.player.method3090() != null
                && mc.player.method3090().getItem() instanceof ItemSword
                && !this.getStringSettingValueByName("Autoblock Mode").equals("None");
    }

    @Override
    public boolean method15988() {
        return this.isEnabled() && this.method16827();
    }

    public void method16828(Class4399 var1, String var2, boolean var3) {
        double var6 = !var2.equals("Hypixel") ? 0.0 : 1.0E-14;
        boolean var8 = true;
        if (this.field23940 == 0 && this.field23941 >= 1 && Class5330.field23887 > 1) {
            if (this.field23938.method36820(this.field23939)) {
                this.field23940 = 1;
                var8 = var3;
                var6 = !var2.equals("Cubecraft") ? 0.0626 : Class9567.method37080() / 10.0;
                this.field23960 = new double[]{var1.method13909(), var1.method13911() + var6, var1.method13913()};
            }
        } else if (this.field23940 == 1) {
            this.field23940 = 0;
            var8 = false;
            if (var2.equals("Hypixel") && this.field23960 != null && mc.player.method3433().field18049 < 0.0) {
                mc.getConnection().sendPacket(new Class5605(this.field23960[0], this.field23960[1], this.field23960[2], false));
                this.field23960 = null;
            }
        }

        boolean var9 = !Jesus.method16953() && (mc.player.onGround || Class5628.method17730(mc.player, 0.001F));
        if (!var9) {
            this.field23941 = 0;
            this.field23940 = 0;
        } else {
            this.field23941++;
            if ((
                    !Client.getInstance().getModuleManager().getModuleByClass(Class5341.class).isEnabled()
                            || Client.getInstance().getModuleManager().getModuleByClass(Class5341.class).getStringSettingValueByName("Type").equalsIgnoreCase("Cubecraft")
                            || Client.getInstance().getModuleManager().getModuleByClass(Class5341.class).getStringSettingValueByName("Type").equalsIgnoreCase("Vanilla")
            )
                    && mc.player.collidedVertically
                    && var9
                    && !mc.player.field4981
                    && !mc.player.method3250()
                    && !mc.gameSettings.field44636.isKeyDown()) {
                field23937 = var6 > 0.001;

                var1.method13912(mc.player.getPosY() + var6);
                var1.method13920(var8);
            }
        }
    }

    private Entity method16829(List<Class8012> var1) {
        var1 = this.field23938.method36824(var1);
        return !var1.isEmpty() && var1.get(0).method27397().method3275(mc.player) <= this.getNumberValueBySettingName("Block Range")
                ? var1.get(0).method27397()
                : null;
    }

    private void method16830() {
        float var3 = this.getNumberValueBySettingName("Block Range");
        float var4 = this.getNumberValueBySettingName("Range");
        String var5 = this.getStringSettingValueByName("Mode");
        List var6 = this.field23938.method36823(Math.max(var3, var4));
        var6 = this.field23938.method36824(var6);
        if (this.field23952 == null) {
            this.onEnable();
        }

        if (var6 != null && var6.size() != 0 && !mc.gameSettings.keyBindAttack.isPressed()) {
            field23948 = this.method16829(var6);
            var6 = this.field23938.method36823(var4);
            if (var5.equals("Single") || var5.equals("Multi")) {
                var6 = this.field23938.method36824(var6);
            }

            if (var6.size() == 0) {
                field23949 = null;
                this.field23950.clear();
                this.field23939 = (int) this.field23938.method36819(0);
                this.field23940 = 0;
                field23937 = false;
                this.field23952.field32084 = mc.player.rotationYaw;
                this.field23952.field32085 = mc.player.rotationPitch;
                field23951.field32084 = this.field23952.field32084;
                field23951.field32085 = this.field23952.field32085;
                this.field23957 = -1.0F;
                this.field23955 = Math.random();
                this.field23946 = -1;
            } else {
                if (this.field23957 == -1.0F) {
                    float var7 = Class9142.method34148(Class5628.method17751(((Class8012) var6.get(0)).method27397())).field32084;
                    float var8 = Math.abs(Class5628.method17756(var7, field23951.field32084));
                    this.field23956 = var8 * 1.95F / 50.0F;
                    this.field23957++;
                    this.field23955 = Math.random();
                }

                this.field23950 = var6;
                float var12 = Class9142.method34148(Class5628.method17751(this.field23950.get(0).method27397())).field32084;
                if (!this.field23950.isEmpty() & !var5.equals("Switch")) {
                    if (field23949 != null && field23949.method27397() != this.field23950.get(0).method27397()) {
                        float var13 = Math.abs(Class5628.method17756(var12, field23951.field32084));
                        this.field23956 = var13 * 1.95F / 50.0F;
                        this.field23955 = Math.random();
                    }

                    field23949 = this.field23950.get(0);
                }

                if (!var5.equals("Switch")) {
                    if (!var5.equals("Multi2")) {
                        if (var5.equals("Single")
                                && !this.field23950.isEmpty()
                                && (field23949 == null || field23949.method27397() != this.field23950.get(0).method27397())) {
                            field23949 = this.field23950.get(0);
                        }
                    } else {
                        if (this.field23942 >= this.field23950.size()) {
                            this.field23942 = 0;
                        }

                        field23949 = this.field23950.get(this.field23942);
                    }
                } else if ((
                        field23949 == null
                                || field23949.method27399() == null
                                || field23949.method27398()
                                || !this.field23950.contains(field23949)
                                || mc.player.method3275(field23949.method27397()) > var4
                )
                        && this.field23950.size() > 0) {
                    if (this.field23942 + 1 < this.field23950.size()) {
                        if (field23949 != null && !Client.getInstance().getFriendManager().method26999(this.field23950.get(this.field23942).method27397())) {
                            this.field23942++;
                        }
                    } else {
                        this.field23942 = 0;
                    }

                    Vector3d var14 = Class5628.method17751(this.field23950.get(this.field23942).method27397());
                    float var9 = Math.abs(Class5628.method17756(Class9142.method34148(var14).field32084, field23951.field32084));
                    this.field23956 = var9 * 1.95F / 50.0F;
                    this.field23955 = Math.random();
                    field23949 = new Class8012(
                            this.field23950.get(this.field23942).method27397(), new Class9491(!this.getStringSettingValueByName("Rotation Mode").equals("NCP") ? 500L : 270L)
                    );
                }

                if (this.field23942 >= this.field23950.size()) {
                    this.field23942 = 0;
                }

                if (!var5.equals("Multi")) {
                    this.field23950.clear();
                    this.field23950.add(field23949);
                }
            }
        } else {
            field23949 = null;
            field23948 = null;
            if (this.field23950 != null) {
                this.field23950.clear();
            }

            this.field23939 = (int) this.field23938.method36819(0);
            this.field23940 = 0;
            field23937 = false;
            this.field23952.field32084 = mc.player.rotationYaw;
            this.field23952.field32085 = mc.player.rotationPitch;
            field23951.field32084 = this.field23952.field32084;
            field23951.field32085 = this.field23952.field32085;
            this.field23957 = -1.0F;
            this.field23955 = Math.random();
            this.field23946 = -1;
        }
    }

    private void method16831() {
        Entity var3 = field23949.method27397();
        Class7461 var4 = Class9142.method34150(var3, !this.getBooleanValueFromSetttingName("Through walls"));
        float var5 = Class9142.method34152(this.field23952.field32084, var4.field32084);
        float var6 = var4.field32085 - this.field23952.field32085;
        String var7 = this.getStringSettingValueByName("Rotation Mode");
        switch (var7) {
            case "Test":
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                if (Math.abs(var5) > 80.0F) {
                    float var9 = (float) this.method16832(-10.2, 10.2);
                    float var30 = var5 * var5 * 1.13F / 2.0F + var9;
                    this.field23952.field32084 += var30;
                    this.field23958 = var30;
                } else if (Math.abs(var5) > 30.0F) {
                    float var26 = (float) this.method16832(-10.2, 10.2);
                    float var31 = var5 * 1.03F / 2.0F + var26;
                    this.field23952.field32084 += var31;
                    this.field23958 = var31;
                } else if (Math.abs(var5) > 10.0F) {
                    Entity var27 = Class5628.method17711(
                            this.field23952.field32085, this.field23952.field32084, this.getNumberValueBySettingName("Range"), this.getNumberValueBySettingName("Hit box expand")
                    );
                    double var11 = var27 == null ? 13.4 : 1.4;
                    this.field23958 = (float) ((double) this.field23958 * 0.5296666666666666);
                    if (Math.abs(var5) < 20.0F) {
                        this.field23958 = var5 * 0.5F;
                    }

                    this.field23952.field32084 = this.field23952.field32084 + var5 + this.field23958 + (float) this.method16832(-var11, var11);
                } else {
                    this.field23958 = (float) ((double) this.field23958 * 0.05);
                    double var13 = 0.0;
                    this.field23952.field32084 = this.field23952.field32084 + this.field23958 + (float) this.method16832(-var13, var13);
                }

                if (mc.player.ticksExisted % 5 == 0) {
                    double var32 = 10.0;
                    this.field23952.field32084 = this.field23952.field32084
                            + (float) this.method16832(-var32, var32) / (mc.player.method3275(var3) + 1.0F);
                    this.field23952.field32085 = this.field23952.field32085
                            + (float) this.method16832(-var32, var32) / (mc.player.method3275(var3) + 1.0F);
                }

                if (Math.abs(var6) > 10.0F) {
                    this.field23952.field32085 = (float) ((double) this.field23952.field32085 + (double) var6 * 0.81 + this.method16832(-2.0, 2.0));
                }

                Entity var28 = Class5628.method17711(
                        this.field23953.field32085, this.field23953.field32084, this.getNumberValueBySettingName("Range"), this.getNumberValueBySettingName("Hit box expand")
                );
                if (var28 != null && (double) this.field23947 > this.method16832(2.0, 5.0)) {
                    this.field23947 = 0;
                    Class5628.method17735(var28, true);
                }
                break;
            case "NCP":
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                this.field23952 = var4;
                break;
            case "AAC":
                if (!Class9142.method34149(
                        new Vector3d(var3.getPosX(), var3.getPosY() - 1.6 - this.field23955 + (double) var3.method3393(), var3.getPosZ())
                )) {
                }

                float var29 = this.field23957 / Math.max(1.0F, this.field23956);
                double var33 = var3.getPosX() - var3.lastTickPosX;
                double var34 = var3.getPosZ() - var3.lastTickPosZ;
                float var35 = (float) Math.sqrt(var33 * var33 + var34 * var34);
                float var36 = Class8603.method30791(var29, 0.57, -0.135, 0.095, -0.3);
                float var37 = Math.min(1.0F, Class8603.method30791(var29, 0.57, -0.135, 0.095, -0.3));
                if (this.field23959) {
                    var36 = Class8603.method30791(var29, 0.18, 0.13, 1.0, 1.046);
                    var37 = Math.min(1.0F, Class8603.method30791(var29, 0.18, 0.13, 1.0, 1.04));
                }

                float var38 = Class5628.method17756(field23951.field32084, var4.field32084);
                float var39 = var4.field32085 - field23951.field32085;
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                this.field23952.field32084 = field23951.field32084 + var36 * var38;
                this.field23952.field32085 = (field23951.field32085 + var37 * var39) % 90.0F;
                if (var29 == 0.0F || var29 >= 1.0F || (double) var35 > 0.1 && this.field23956 < 4.0F) {
                    float var41 = Math.abs(Class5628.method17756(var4.field32084, field23951.field32084));
                    this.field23956 = (float) Math.round(var41 * 1.8F / 50.0F);
                    if (this.field23956 <= 1.0F && Math.abs(Class5628.method17756(var4.field32084, this.field23952.field32084)) > 10.0F) {
                    }

                    this.field23957 = 0.0F;
                    if (mc.pointedEntity == null && var29 != 1.0F) {
                        this.field23955 = Math.random() * 0.5 + 0.25;
                    }

                    field23951.field32084 = this.field23952.field32084;
                    field23951.field32085 = this.field23952.field32085;
                }
                break;
            case "Smooth":
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                this.field23952.field32084 = (float) ((double) this.field23952.field32084 + (double) (var5 * 2.0F) / 5.0);
                this.field23952.field32085 = (float) ((double) this.field23952.field32085 + (double) (var6 * 2.0F) / 5.0);
                break;
            case "None":
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                this.field23952.field32084 = mc.player.rotationYaw;
                this.field23952.field32085 = mc.player.rotationPitch;
                break;
            case "LockView":
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                EntityRayTraceResult var40 = Class5628.method17714(
                        var3, this.field23952.field32084, this.field23952.field32085, var0 -> true, this.getNumberValueBySettingName("Range")
                );
                if (var40 == null || var40.getEntity() != var3) {
                    this.field23952 = var4;
                }
                break;
            case "Test2":
                EntityRayTraceResult var24 = Class5628.method17714(
                        var3, this.field23952.field32084, this.field23952.field32085, var0 -> true, this.getNumberValueBySettingName("Range")
                );
                if (var24 != null && var24.getEntity() == var3) {
                    this.field23953.field32084 = this.field23952.field32084;
                    this.field23953.field32085 = this.field23952.field32085;
                    this.field23952.field32084 = (float) ((double) this.field23952.field32084 + (Math.random() - 0.5) * 2.0 + (double) (var5 / 10.0F));
                    this.field23952.field32085 = (float) ((double) this.field23952.field32085 + (Math.random() - 0.5) * 2.0 + (double) (var6 / 10.0F));
                    this.field23957 = 0.0F;
                    this.field23956 = 3.0F;
                    return;
                }

                float var10 = this.field23957 / Math.max(1.0F, this.field23956);
                double var15 = var3.getPosX() - var3.lastTickPosX;
                double var17 = var3.getPosZ() - var3.lastTickPosZ;
                float var19 = (float) Math.sqrt(var15 * var15 + var17 * var17);
                float var20 = Class8603.method30791(var10, 0.57, -0.135, 0.095, -0.3);
                float var21 = Math.min(1.0F, Class8603.method30791(var10, 0.57, -0.135, 0.095, -0.3));
                float var22 = Class5628.method17756(field23951.field32084, var4.field32084);
                float var23 = var4.field32085 - field23951.field32085;
                this.field23953.field32084 = this.field23952.field32084;
                this.field23953.field32085 = this.field23952.field32085;
                this.field23952.field32084 = field23951.field32084 + var20 * var22;
                this.field23952.field32085 = (field23951.field32085 + var21 * var23) % 90.0F;
                if (var10 == 0.0F || var10 >= 1.0F || (double) var19 > 0.1 && this.field23956 < 4.0F) {
                    float var25 = Math.abs(Class5628.method17756(var4.field32084, field23951.field32084));
                    this.field23956 = (float) Math.round(var25 * 1.8F / 50.0F);
                    if (this.field23956 < 3.0F) {
                        this.field23956 = 3.0F;
                    }

                    this.field23957 = 0.0F;
                    if (mc.pointedEntity == null && var10 != 1.0F) {
                        this.field23955 = Math.random() * 0.5 + 0.25;
                    }

                    field23951.field32084 = this.field23952.field32084;
                    field23951.field32085 = this.field23952.field32085;
                }
        }
    }

    private double method16832(double var1, double var3) {
        return var1 + Math.random() * (var3 - var1);
    }
}
