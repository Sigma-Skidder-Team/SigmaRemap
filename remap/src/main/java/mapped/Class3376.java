// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class3376 extends Class3167
{
    public static boolean field16049;
    private Class8866 field16050;
    private int field16051;
    private int field16052;
    private int field16053;
    private int field16054;
    private int field16055;
    private int field16056;
    private int field16057;
    private int field16058;
    private int field16059;
    public static Entity field16060;
    public static Class8131 field16061;
    private List<Class8131> field16062;
    public static Class7988 field16063;
    private Class7988 field16064;
    private Class7988 field16065;
    public static int field16066;
    private double field16067;
    private float field16068;
    private float field16069;
    private float field16070;
    private boolean field16071;
    private double[] field16072;
    public HashMap<Entity, Class9572> field16073;
    
    public Class3376() {
        super(Class8013.field32986, "KillAura", "Automatically attacks entities");
        this.field16073 = new HashMap<Entity, Class9572>();
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Single", "Switch", "Multi", "Multi2" }));
        this.method9881(new Class5001("Autoblock Mode", "Autoblock Mode", 0, new String[] { "None", "NCP", "Basic1", "Basic2", "Vanilla" }));
        this.method9881(new Class5001("Sort Mode", "Sort Mode", 0, new String[] { "Range", "Health", "Angle", "Armor", "Prev Range" }));
        this.method9881(new Class5001("Attack Mode", "Attacks after or before sending the movement", 0, new String[] { "Pre", "Post" }));
        this.method9881(new Class5001("Rotation Mode", "The way you will look at entities", 0, new String[] { "NCP", "AAC", "Smooth", "Test", "None" }));
        this.method9881(new Class4996("Range", "Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.01f));
        this.method9881(new Class4996("Block Range", "Block Range value", 4.0f, Float.class, 2.8f, 8.0f, 0.2f));
        this.method9881(new Class4996("Min CPS", "Min CPS value", 8.0f, Float.class, 1.0f, 20.0f, 1.0f).method15195(class4997 -> this.field16050.method31133()));
        this.method9881(new Class4996("Max CPS", "Max CPS value", 8.0f, Float.class, 1.0f, 20.0f, 1.0f).method15195(class4997 -> this.field16050.method31133()));
        this.method9881(new Class4996("Hit box expand", "Hit Box expand", 0.05f, Float.class, 0.0f, 1.0f, 0.01f));
        this.method9881(new Class4996("Hit Chance", "Hit Chance", 100.0f, Float.class, 25.0f, 100.0f, 1.0f));
        this.method9881(new Class4999("Interact autoblock", "Send interact packet when blocking", true));
        this.method9881(new Class4999("Players", "Hit players", true));
        this.method9881(new Class4999("Animals/Monsters", "Hit animals and monsters", false));
        this.method9881(new Class4999("Invisible", "Hit invisible entites", true));
        this.method9881(new Class4999("Raytrace", "Helps the aura become more legit", true));
        this.method9881(new Class4999("Cooldown", "Use attack cooldown (1.9+)", false));
        this.method9881(new Class4999("No swing", "Hit without swinging", false));
        this.method9881(new Class4999("Disable on death", "Disable on death", true));
        this.method9881(new Class4999("Through walls", "Target entities through walls", true));
        this.method9881(new Class4999("ESP", "ESP on targets", true));
        this.method9881(new Class5003("ESP Color", "The render color", Class265.field1278.field1292));
    }
    
    @Override
    public void method9917() {
        this.field16062 = new ArrayList<Class8131>();
        this.field16050 = new Class8866(this);
        super.method9917();
    }
    
    @Override
    public void method9879() {
        this.field16062 = new ArrayList<Class8131>();
        Class3376.field16060 = null;
        Class3376.field16061 = null;
        this.field16051 = (int)this.field16050.method31134(0);
        this.field16052 = 0;
        this.field16054 = 0;
        Class3376.field16066 = 0;
        this.field16065 = new Class7988(Class3376.field15514.field4684.field4077, Class3376.field15514.field4684.field4078);
        this.field16064 = new Class7988(Class3376.field15514.field4684.rotationYaw, Class3376.field15514.field4684.rotationPitch);
        Class3376.field16063 = new Class7988(Class3376.field15514.field4684.rotationYaw, Class3376.field15514.field4684.rotationPitch);
        this.field16069 = -1.0f;
        this.field16050.method31129(Class3376.field15514.field4684.method2715(Class316.field1877).getItem() instanceof Class4077 && Class3376.field15514.field4648.field23445.method1056());
        this.field16071 = false;
        this.field16058 = -1;
        super.method9879();
    }
    
    @Override
    public void method9897() {
        Class3376.field16060 = null;
        Class3376.field16061 = null;
        this.field16062 = null;
        Class3376.field16049 = false;
        super.method9897();
    }
    
    @Class6753
    public void method10743(final Class5732 class5732) {
        if (this.method9906() && this.method9883("Disable on death")) {
            Class9463.method35173().method35197().method25776(new Class6224("Aura", "Aura disabled due to respawn"));
            this.method9910();
        }
    }
    
    @Class6753
    public void method10744(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (this.field16069 != -1.0f) {
            ++this.field16069;
        }
        if (!this.method9883("Disable on death")) {
            return;
        }
        if (Class3376.field15514.field4684.method1768()) {
            return;
        }
        this.method9910();
        Class9463.method35173().method35197().method25776(new Class6224("Aura", "Aura disabled due to death"));
    }
    
    @Class6753
    public void method10745(final Class5751 class5751) {
        if (this.method9906()) {
            if (!this.method9887("Autoblock Mode").equals("None")) {
                if (Class3376.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077 || this.field16055 != Class3376.field15514.field4684.field3006.field2743) {
                    if (Class3376.field16060 != null) {
                        class5751.method16961(true);
                        return;
                    }
                }
            }
            if (Class3376.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077) {
                this.field16057 = 2;
            }
        }
    }
    
    @Class6753
    @Class6755
    public void method10746(final Class5744 class5744) {
        if (!this.method9906() || Class3376.field15514.field4684 == null) {
            return;
        }
        if (class5744.method17046()) {
            if (this.field16057 > 0) {
                --this.field16057;
            }
            if (Class3376.field16060 != null) {
                if (this.field16050.method31128()) {
                    if (Class7482.method23148()) {
                        if (this.method9887("Autoblock Mode").equals("NCP")) {
                            this.field16050.method31131();
                        }
                    }
                }
            }
            if (this.field16050.method31128()) {
                if (!(Class3376.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077) || Class3376.field16060 == null) {
                    this.field16050.method31129(false);
                }
            }
            if (this.field16058 >= 0) {
                if (this.field16058 == 0) {
                    this.field16050.method31131();
                    this.field16050.method31129(true);
                }
                --this.field16058;
            }
            this.method10753();
            if (this.field16062 != null) {
                if (!this.field16062.isEmpty()) {
                    final float method9886 = this.method9886("Hit box expand");
                    final Class3247 class5745 = (Class3247)Class9463.method35173().method35189().method21551(Class3261.class);
                    if (class5745.method9906()) {
                        if (class5745.method9887("Type").equalsIgnoreCase("Minis")) {
                            this.method10751(class5744, class5745.method10260().method9883("Hypixel"), class5745.method10260().method9883("Avoid Fall Damage"));
                        }
                    }
                    this.method10754();
                    if (class5744.method17042() - Class3376.field15514.field4684.rotationYaw != 0.0f) {
                        this.field16064.field32884 = class5744.method17042();
                        this.field16064.field32885 = class5744.method17040();
                    }
                    class5744.method17043(this.field16064.field32884);
                    class5744.method17041(this.field16064.field32885);
                    ++this.field16051;
                    final boolean method9887 = this.field16050.method31135(this.field16051);
                    final float n = (Class3376.field15514.field4684.method2903() >= 1.26) ? Class3376.field15514.field4684.method2904(0.0f) : 1.0f;
                    boolean b = false;
                    Label_0596: {
                        if (class5745.method9906()) {
                            if (class5745.method9887("Type").equalsIgnoreCase("Minis")) {
                                if (this.field16052 != 0) {
                                    if (this.field16050.method31134(0) >= 2.0f) {
                                        b = false;
                                        break Label_0596;
                                    }
                                }
                            }
                        }
                        b = true;
                    }
                    int n2 = 0;
                    Label_0656: {
                        if (b) {
                            if (Class3376.field16066 == 0) {
                                if (method9887) {
                                    if (n >= 1.0f || !this.method9883("Cooldown")) {
                                        n2 = 1;
                                        break Label_0656;
                                    }
                                }
                            }
                        }
                        n2 = 0;
                    }
                    int n3 = n2;
                    final Class3247 class5746 = (Class3247)Class9463.method35173().method35189().method21551(Class3259.class);
                    if (class5746.method9906()) {
                        if (class5746.method9887("Type").equals("Hypixel")) {
                            if (Class6430.method19146()) {
                                if (Class3378.field16077 != 0.0) {
                                    n3 = 0;
                                }
                            }
                        }
                    }
                    if (method9887) {
                        this.field16050.method31136();
                    }
                    if (n3 != 0) {
                        final Class1590 class5747 = new Class1590(this, method9886);
                        if (!this.method9887("Attack Mode").equals("Pre")) {
                            class5744.method17047(class5747);
                        }
                        else {
                            class5747.run();
                        }
                        this.field16051 = 0;
                        if (this.method9887("Mode").equals("Multi2")) {
                            ++this.field16054;
                        }
                    }
                    if (Class3376.field16066 > 0) {
                        --Class3376.field16066;
                    }
                }
            }
            return;
        }
        this.field16055 = Class3376.field15514.field4684.field3006.field2743;
        if (Class3376.field16060 != null) {
            if (this.field16050.method31132()) {
                if (this.field16064 != null) {
                    this.field16050.method31130(Class3376.field16060, this.field16064.field32884, this.field16064.field32885);
                }
            }
        }
    }
    
    @Class6753
    public void method10747(final Class5739 class5739) {
        if (this.method9906()) {
            if (this.field16062 != null) {
                final Iterator<Map.Entry<Entity, Class9572>> iterator = this.field16073.entrySet().iterator();
                while (iterator.hasNext()) {
                    final Map.Entry entry = iterator.next();
                    final Iterator<Class8131> iterator2 = this.field16062.iterator();
                    while (iterator2.hasNext()) {
                        if (!((Entity)entry.getKey()).equals(iterator2.next().method26798())) {
                            continue;
                        }
                    }
                    ((Class9572)entry.getValue()).method35855(Class2186.field12965);
                    if (((Class9572)entry.getValue()).method35858() != 0.0f) {
                        continue;
                    }
                    iterator.remove();
                }
                for (final Class8131 class5740 : this.field16062) {
                    if (class5740 != null) {
                        if (!this.field16073.containsKey(class5740.method26798())) {
                            this.field16073.put(class5740.method26798(), new Class9572(250, 250));
                        }
                        else {
                            this.field16073.get(class5740.method26798()).method35855(Class2186.field12964);
                        }
                    }
                }
                final Iterator<Map.Entry<Entity, Class9572>> iterator4 = this.field16073.entrySet().iterator();
                while (iterator4.hasNext()) {
                    this.method10748(((Map.Entry<Entity, V>)iterator4.next()).getKey());
                }
            }
        }
    }
    
    public void method10748(final Entity key) {
        GL11.glPushMatrix();
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glEnable(32925);
        GL11.glEnable(2929);
        GL11.glLineWidth(1.4f);
        double n = Class869.method5277().field4633.field26528;
        if (!key.method1768()) {
            n = 0.0;
        }
        GL11.glTranslated(key.lastTickPosX + (key.posX - key.lastTickPosX) * n, key.lastTickPosY + (key.posY - key.lastTickPosY) * n, key.lastTickPosZ + (key.posZ - key.lastTickPosZ) * n);
        GL11.glTranslated(-Class3376.field15514.field4644.method5833().method18161().getX(), -Class3376.field15514.field4644.method5833().method18161().getY(), -Class3376.field15514.field4644.method5833().method18161().getZ());
        GL11.glEnable(32823);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(519, 0.0f);
        final int n2 = 1800;
        final float n3 = System.currentTimeMillis() % n2 / (float)n2;
        final boolean b = n3 > 0.5f;
        final float n4 = b ? (1.0f - n3 * 2.0f % 1.0f) : (n3 * 2.0f);
        GL11.glTranslatef(0.0f, (key.method1931() + 0.4f) * n4, 0.0f);
        final float n5 = (float)Math.sin(n4 * 3.141592653589793);
        this.method10749(b, 0.45f * n5, 0.6f, 0.35f * n5, this.field16073.get(key).method35858());
        GL11.glPushMatrix();
        GL11.glTranslated(Class3376.field15514.field4644.method5833().method18161().getX(), Class3376.field15514.field4644.method5833().method18161().getY(), Class3376.field15514.field4644.method5833().method18161().getZ());
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(32925);
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }
    
    public void method10749(final boolean b, final float n, final float n2, final float n3, final float n4) {
        Class8726.method30045(7425);
        GL11.glDisable(32823);
        GL11.glDisable(2929);
        GL11.glBegin(5);
        final int n5 = (int)(360.0f / (40.0f * n2));
        final Color color = new Color(this.method9885("ESP Color"));
        final float n6 = color.getRed() / 255.0f;
        final float n7 = color.getGreen() / 255.0f;
        final float n8 = color.getBlue() / 255.0f;
        for (int i = 0; i <= 360 + n5; i += n5) {
            int n9 = i;
            if (n9 > 360) {
                n9 = 0;
            }
            final double n10 = Math.sin(n9 * 3.141592653589793 / 180.0) * n2;
            final double n11 = Math.cos(n9 * 3.141592653589793 / 180.0) * n2;
            GL11.glColor4f(n6, n7, n8, b ? (n3 * n4) : 0.0f);
            GL11.glVertex3d(n10, 0.0, n11);
            GL11.glColor4f(n6, n7, n8, b ? 0.0f : (n3 * n4));
            GL11.glVertex3d(n10, (double)n, n11);
        }
        GL11.glEnd();
        GL11.glLineWidth(2.2f);
        GL11.glBegin(3);
        for (int j = 0; j <= 360 + n5; j += n5) {
            int n12 = j;
            if (n12 > 360) {
                n12 = 0;
            }
            final double n13 = Math.sin(n12 * 3.141592653589793 / 180.0) * n2;
            final double n14 = Math.cos(n12 * 3.141592653589793 / 180.0) * n2;
            GL11.glColor4f(n6, n7, n8, (0.5f + 0.5f * n3) * n4);
            GL11.glVertex3d(n13, b ? 0.0 : ((double)n), n14);
        }
        GL11.glEnd();
        GL11.glEnable(2929);
        Class8726.method30045(7424);
    }
    
    public boolean method10750() {
        if (Class3376.field16060 != null) {
            if (Class3376.field15514.field4684.getHeldItemMainhand() != null) {
                if (Class3376.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077) {
                    if (!this.method9887("Autoblock Mode").equals("None")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method9898() {
        return this.method9906() && this.method10750();
    }
    
    public void method10751(final Class5744 class5744, final boolean b, final boolean b2) {
        double n = b ? 1.0E-14 : 0.0;
        boolean b3 = true;
        Label_0077: {
            if (Class3376.field15514.field4684.method2903() > 1.26f && this.method9883("Cooldown")) {
                if (this.field16052 != 1) {
                    if (this.field16052 == 0) {
                        boolean b4 = false;
                        Label_0229: {
                            if (Math.round(Class3376.field15514.field4684.method2903() - Class3376.field15514.field4684.field2944) <= (float)(this.method9887("Attack Mode").equals("Pre") ? 2 : 1)) {
                                if (this.field16053 >= 1) {
                                    if (Class3265.field15758 > 1) {
                                        b4 = true;
                                        break Label_0229;
                                    }
                                }
                            }
                            b4 = false;
                        }
                        if (b4) {
                            n = 0.2;
                            b3 = false;
                            ++this.field16052;
                        }
                    }
                }
                else {
                    this.field16052 = 0;
                    b3 = false;
                }
                if (!Class3295.method10433() && (!Class3376.field15514.field4684.onGround && !Class6430.method19160(Class3376.field15514.field4684, 0.001f))) {
                    ++this.field16053;
                }
                else {
                    this.field16053 = 0;
                    this.field16052 = 0;
                }
            }
            else {
                int n2 = (int)this.field16050.method31134(0);
                final boolean equals = this.method9887("Attack Mode").equals("Pre");
                if (!equals) {
                    ++n2;
                }
                if (this.field16052 != 1) {
                    if (this.field16052 == 0) {
                        if (this.field16053 >= 1) {
                            if (Class3265.field15758 > 1) {
                                final float method31134 = this.field16050.method31134(0);
                                final float method31135 = this.field16050.method31134(1);
                                final float n3 = equals ? this.field16050.method31134(2) : 0.0f;
                                final int n4 = (int)(method31135 + method31134 - (int)method31134);
                                Label_0523: {
                                    if (this.field16051 != n2 - 3) {
                                        if (this.field16051 + 1 >= n2) {
                                            if (n4 <= 2) {
                                                if (n4 != 1) {
                                                    break Label_0523;
                                                }
                                            }
                                        }
                                        if (method31134 >= 2.0f) {
                                            break Label_0077;
                                        }
                                        if (method31135 >= 2.0f) {
                                            break Label_0077;
                                        }
                                        if (n3 >= 2.0f) {
                                            break Label_0077;
                                        }
                                        if (n4 >= 2) {
                                            break Label_0077;
                                        }
                                    }
                                }
                                this.field16052 = 1;
                                b3 = b2;
                                n = 0.0626;
                                this.field16072 = new double[] { class5744.method17034(), class5744.method17036() + n, class5744.method17038() };
                            }
                        }
                    }
                }
                else {
                    this.field16052 = 0;
                    b3 = false;
                    if (b) {
                        if (this.field16072 != null) {
                            if (Class3376.field15514.field4684.getMotion().y < 0.0) {
                                Class3376.field15514.method5269().method17292(new Class4354(this.field16072[0], this.field16072[1], this.field16072[2], false));
                                this.field16072 = null;
                            }
                        }
                    }
                }
            }
        }
        final boolean b5 = !Class3295.method10433() && (Class3376.field15514.field4684.onGround || Class6430.method19160(Class3376.field15514.field4684, 0.001f));
        if (b5) {
            ++this.field16053;
            if (!Class9463.method35173().method35189().method21551(Class3256.class).method9906() || Class9463.method35173().method35189().method21551(Class3256.class).method9887("Type").equalsIgnoreCase("Cubecraft")) {
                if (Class3376.field15514.field4684.collidedVertically) {
                    if (b5) {
                        if (!Class3376.field15514.field4684.field2967) {
                            if (!Class3376.field15514.field4684.method1706()) {
                                if (!Class3376.field15514.field4648.field23439.field2162) {
                                    if (n <= 0.001) {
                                        Class3376.field16049 = false;
                                    }
                                    else {
                                        Class3376.field16049 = true;
                                    }
                                    class5744.method17037(Class3376.field15514.field4684.posY + n);
                                    class5744.method17045(b3);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.field16053 = 0;
        this.field16052 = 0;
    }
    
    private Entity method10752(final List<Class8131> list) {
        final List<Class8131> method31138 = this.field16050.method31138(list);
        if (!method31138.isEmpty() && ((Class8131)method31138.get(0)).method26798().method1732(Class3376.field15514.field4684) <= this.method9886("Block Range")) {
            return ((Class8131)method31138.get(0)).method26798();
        }
        return null;
    }
    
    private void method10753() {
        final float method9886 = this.method9886("Block Range");
        final float method9887 = this.method9886("Range");
        final String method9888 = this.method9887("Mode");
        final List<Class8131> method9889 = this.field16050.method31138(this.field16050.method31137(Math.max(method9886, method9887)));
        if (this.field16064 == null) {
            this.method9879();
        }
        if (method9889 != null) {
            if (method9889.size() != 0) {
                if (!Class3376.field15514.field4648.field23446.method1058()) {
                    Class3376.field16060 = this.method10752(method9889);
                    List<Class8131> field16062 = this.field16050.method31137(method9887);
                    if (method9888.equals("Single") || method9888.equals("Multi")) {
                        field16062 = this.field16050.method31138(field16062);
                    }
                    if (field16062.size() != 0) {
                        if (this.field16069 == -1.0f) {
                            this.field16068 = Math.abs(this.method10755(((Class8131)field16062.get(0)).method26799().field32884, Class3376.field16063.field32884)) * 1.95f / 50.0f;
                            ++this.field16069;
                            this.field16067 = Math.random();
                        }
                        this.field16062 = field16062;
                        if (!this.field16062.isEmpty()) {
                            if (!method9888.equals("Switch")) {
                                if (Class3376.field16061 != null && Class3376.field16061.method26798() != this.field16062.get(0).method26798()) {
                                    this.field16068 = Math.abs(this.method10755(this.field16062.get(0).method26799().field32884, Class3376.field16063.field32884)) * 1.95f / 50.0f;
                                    this.field16067 = Math.random();
                                    final Class7007 method9890 = Class6430.method19142(this.field16064.field32884, this.field16064.field32885, this.method9886("Range"), this.method9886("Hit box expand"));
                                    if (method9890 == null || method9890.method21452() != Class3376.field16061.method26798()) {
                                        Class3376.field16066 = 1;
                                    }
                                }
                                else if (Class3376.field16061 == null) {
                                    final Class7007 method9891 = Class6430.method19142(this.field16064.field32884, this.field16064.field32885, this.method9886("Range"), this.method9886("Hit box expand"));
                                    if (method9891 == null || method9891.method21452() != this.field16062.get(0).method26798()) {
                                        Class3376.field16066 = 1;
                                    }
                                }
                                Class3376.field16061 = this.field16062.get(0);
                            }
                        }
                        Label_0355: {
                            if (!method9888.equals("Switch")) {
                                if (!method9888.equals("Multi2")) {
                                    if (method9888.equals("Single")) {
                                        if (!this.field16062.isEmpty() && (Class3376.field16061 == null || Class3376.field16061.method26798() != this.field16062.get(0).method26798())) {
                                            Class3376.field16061 = this.field16062.get(0);
                                            if (!this.method9883("Through walls")) {
                                                final Class7988 method9892 = Class8845.method30924(Class3376.field16061.method26798());
                                                if (method9892 == null) {
                                                    Class3376.field16061 = new Class8131(this.field16062.get(0).method26798(), method9892, new Class6938(270L));
                                                }
                                                else {
                                                    Class3376.field16061.method26802(method9892);
                                                }
                                            }
                                        }
                                        else {
                                            Class7988 class7988 = Class8845.method30922(this.field16062.get(0).method26798());
                                            if (!this.method9883("Through walls")) {
                                                class7988 = Class8845.method30924(Class3376.field16061.method26798());
                                            }
                                            Class3376.field16061.method26802(class7988);
                                        }
                                    }
                                }
                                else {
                                    if (this.field16054 >= this.field16062.size()) {
                                        this.field16054 = 0;
                                    }
                                    Class3376.field16061 = this.field16062.get(this.field16054);
                                }
                            }
                            else {
                                if (Class3376.field16061 != null) {
                                    if (Class3376.field16061.method26801() != null) {
                                        if (!Class3376.field16061.method26800()) {
                                            if (this.field16062.contains(Class3376.field16061)) {
                                                if (Class3376.field15514.field4684.method1732(Class3376.field16061.method26798()) <= method9887) {
                                                    if (this.method9883("Through walls")) {
                                                        Class3376.field16061.method26802(Class8845.method30922(Class3376.field16061.method26798()));
                                                        break Label_0355;
                                                    }
                                                    final Class7988 method9893 = Class8845.method30924(Class3376.field16061.method26798());
                                                    if (method9893 == null) {
                                                        for (int size = this.field16062.size(), i = 0; i < size; ++i) {
                                                            final Class7988 method9894 = Class8845.method30924(this.field16062.get(i).method26798());
                                                            if (method9894 != null) {
                                                                Class3376.field16061 = new Class8131(this.field16062.get(i).method26798(), method9894, new Class6938(270L));
                                                                break;
                                                            }
                                                            ++this.field16054;
                                                            if (this.field16054 >= this.field16062.size()) {
                                                                this.field16054 = 0;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        Class3376.field16061.method26802(method9893);
                                                    }
                                                    break Label_0355;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field16062.size() > 0) {
                                    if (this.field16054 + 1 < this.field16062.size()) {
                                        if (method9888.equals("Switch")) {
                                            if (Class3376.field16061 != null) {
                                                if (!Class9463.method35173().method35190().method29880(this.field16062.get(this.field16054).method26798())) {
                                                    ++this.field16054;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        this.field16054 = 0;
                                    }
                                    final int size2 = this.field16062.size();
                                    int j = 0;
                                    while (j < size2) {
                                        final Class7988 method9895 = Class8845.method30924(this.field16062.get(this.field16054).method26798());
                                        if (method9895 == null) {
                                            if (this.method9883("Through walls")) {
                                                Class3376.field16061 = new Class8131(this.field16062.get(this.field16054).method26798(), Class8845.method30922(this.field16062.get(this.field16054).method26798()), new Class6938(this.method9887("Rotation Mode").equals("NCP") ? 270L : 500L));
                                            }
                                            ++this.field16054;
                                            if (this.field16054 >= this.field16062.size()) {
                                                this.field16054 = 0;
                                            }
                                            ++j;
                                        }
                                        else {
                                            Class3376.field16061 = new Class8131(this.field16062.get(this.field16054).method26798(), method9895, new Class6938(this.method9887("Rotation Mode").equals("NCP") ? 270L : 500L));
                                            if (!this.method9887("Attack Mode").equals("Pre")) {
                                                break;
                                            }
                                            final Class7007 method9896 = Class6430.method19142(this.field16064.field32884, this.field16064.field32885, this.method9886("Range"), this.method9886("Hit box expand"));
                                            if (method9896 == null || method9896.method21452() != Class3376.field16061.method26798()) {
                                                Class3376.field16066 = 1;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (this.field16054 >= this.field16062.size()) {
                            this.field16054 = 0;
                        }
                        if (!method9888.equals("Multi")) {
                            this.field16062.clear();
                            this.field16062.add(Class3376.field16061);
                        }
                        return;
                    }
                    Class3376.field16061 = null;
                    this.field16062.clear();
                    this.field16051 = (int)this.field16050.method31134(0);
                    this.field16052 = 0;
                    Class3376.field16049 = false;
                    this.field16064.field32884 = Class3376.field15514.field4684.rotationYaw;
                    this.field16064.field32885 = Class3376.field15514.field4684.rotationPitch;
                    Class3376.field16063.field32884 = this.field16064.field32884;
                    Class3376.field16063.field32885 = this.field16064.field32885;
                    this.field16069 = -1.0f;
                    this.field16067 = Math.random();
                    this.field16058 = -1;
                    return;
                }
            }
        }
        Class3376.field16061 = null;
        Class3376.field16060 = null;
        if (this.field16062 != null) {
            this.field16062.clear();
        }
        this.field16051 = (int)this.field16050.method31134(0);
        this.field16052 = 0;
        Class3376.field16049 = false;
        this.field16064.field32884 = Class3376.field15514.field4684.rotationYaw;
        this.field16064.field32885 = Class3376.field15514.field4684.rotationPitch;
        Class3376.field16063.field32884 = this.field16064.field32884;
        Class3376.field16063.field32885 = this.field16064.field32885;
        this.field16069 = -1.0f;
        this.field16067 = Math.random();
        this.field16058 = -1;
    }
    
    private void method10754() {
        final Class7988 method26799 = Class3376.field16061.method26799();
        final Entity method26800 = Class3376.field16061.method26798();
        final float method26801 = Class8845.method30925(this.field16064.field32884, Class3376.field16061.method26798().posX, Class3376.field16061.method26798().posZ);
        final float method26802 = Class8845.method30927(this.field16064.field32885, Class3376.field16061.method26798(), Class3376.field16061.method26798().posY);
        final String method26803 = this.method9887("Rotation Mode");
        switch (method26803) {
            case "Test": {
                this.field16065.field32884 = this.field16064.field32884;
                this.field16065.field32885 = this.field16064.field32885;
                if (Math.abs(method26801) > 80.0f) {
                    final float field16070 = method26801 * method26801 * 1.13f / 2.0f + (float)this.method10757(-10.2, 10.2);
                    final Class7988 field16071 = this.field16064;
                    field16071.field32884 += field16070;
                    this.field16070 = field16070;
                }
                else if (Math.abs(method26801) > 30.0f) {
                    final float field16072 = method26801 * 1.03f / 2.0f + (float)this.method10757(-10.2, 10.2);
                    final Class7988 field16073 = this.field16064;
                    field16073.field32884 += field16072;
                    this.field16070 = field16072;
                }
                else if (Math.abs(method26801) > 10.0f) {
                    final double n2 = (Class6430.method19141(this.field16064.field32885, this.field16064.field32884, this.method9886("Range"), this.method9886("Hit box expand")) == null) ? 13.4 : 3.4;
                    this.field16070 *= (float)0.5296666666666666;
                    if (Math.abs(method26801) < 20.0f) {
                        this.field16070 = method26801 * 0.5f;
                    }
                    final Class7988 field16074 = this.field16064;
                    field16074.field32884 += method26801 + this.field16070 + (float)this.method10757(-n2, n2);
                }
                else {
                    this.field16070 *= (float)0.05;
                    final double n3 = 0.0;
                    final Class7988 field16075 = this.field16064;
                    field16075.field32884 += this.field16070 + (float)this.method10757(-n3, n3);
                }
                if (Class3376.field15514.field4684.ticksExisted % 5 == 0) {
                    final Class7988 field16076 = this.field16064;
                    field16076.field32884 += (float)this.method10757(-25.0, 25.0) / (Class3376.field15514.field4684.method1732(method26800) + 1.0f);
                    final Class7988 field16077 = this.field16064;
                    field16077.field32885 += (float)this.method10757(-25.0, 25.0) / (Class3376.field15514.field4684.method1732(method26800) + 1.0f);
                }
                if (Math.abs(method26802) > 10.0f) {
                    final Class7988 field16078 = this.field16064;
                    field16078.field32885 += (float)(method26802 * 0.81 + this.method10757(-2.0, 2.0));
                }
                final Entity method26804 = Class6430.method19141(this.field16065.field32885, this.field16065.field32884, this.method9886("Range"), this.method9886("Hit box expand"));
                if (method26804 != null && this.field16059 > this.method10757(2.0, 5.0)) {
                    this.field16059 = 0;
                    Class6430.method19165(method26804, true);
                    break;
                }
                break;
            }
            case "NCP": {
                this.field16065.field32884 = this.field16064.field32884;
                this.field16065.field32885 = this.field16064.field32885;
                this.field16064 = method26799;
                break;
            }
            case "AAC": {
                final Class7988 method26805 = this.method10756(method26800);
                if (!Class8845.method30923(new Vec3d(method26800.posX, method26800.posY - 1.6 - this.field16067 + method26800.method1892(), method26800.posZ))) {}
                final float n4 = this.field16069 / Math.max(1.0f, this.field16068);
                final double n5 = method26800.posX - method26800.lastTickPosX;
                final double n6 = method26800.posZ - method26800.lastTickPosZ;
                final float n7 = (float)Math.sqrt(n5 * n5 + n6 * n6);
                float n8 = Class8862.method31033(n4, 0.57, -0.135, 0.095, -0.3);
                float n9 = Math.min(1.0f, Class8862.method31033(n4, 0.57, -0.135, 0.095, -0.3));
                if (this.field16071) {
                    n8 = Class8862.method31033(n4, 0.18, 0.13, 1.0, 1.046);
                    n9 = Math.min(1.0f, Class8862.method31033(n4, 0.18, 0.13, 1.0, 1.04));
                }
                final float method26806 = this.method10755(Class3376.field16063.field32884, method26805.field32884);
                final float n10 = method26805.field32885 - Class3376.field16063.field32885;
                this.field16065.field32884 = this.field16064.field32884;
                this.field16065.field32885 = this.field16064.field32885;
                this.field16064.field32884 = Class3376.field16063.field32884 + n8 * method26806;
                this.field16064.field32885 = (Class3376.field16063.field32885 + n9 * n10) % 90.0f;
                if (n4 == 0.0f || n4 >= 1.0f || (n7 > 0.1 && this.field16068 < 4.0f)) {
                    this.field16068 = (float)Math.round(Math.abs(this.method10755(method26805.field32884, Class3376.field16063.field32884)) * 1.8f / 50.0f);
                    if (this.field16068 > 1.0f || Math.abs(this.method10755(method26805.field32884, this.field16064.field32884)) > 10.0f) {}
                    this.field16069 = 0.0f;
                    if (Class3376.field15514.field4690 == null && n4 != 1.0f) {
                        this.field16067 = Math.random() * 0.5 + 0.25;
                    }
                    Class3376.field16063.field32884 = this.field16064.field32884;
                    Class3376.field16063.field32885 = this.field16064.field32885;
                    break;
                }
                break;
            }
            case "Smooth": {
                this.field16065.field32884 = this.field16064.field32884;
                this.field16065.field32885 = this.field16064.field32885;
                final Class7988 field16079 = this.field16064;
                field16079.field32884 += (float)(method26801 * 2.0f / 5.0);
                final Class7988 field16080 = this.field16064;
                field16080.field32885 += (float)(method26802 * 2.0f / 5.0);
                break;
            }
            case "None": {
                this.field16065.field32884 = this.field16064.field32884;
                this.field16065.field32885 = this.field16064.field32885;
                this.field16064.field32884 = Class3376.field15514.field4684.rotationYaw;
                this.field16064.field32885 = Class3376.field15514.field4684.rotationPitch;
                break;
            }
        }
    }
    
    private float method10755(float n, float n2) {
        n %= 360.0f;
        n2 %= 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        if (n2 < 0.0f) {
            n2 += 360.0f;
        }
        final float n3 = n2 - n;
        return (n3 <= 180.0f) ? ((n3 >= -180.0f) ? n3 : (n3 + 360.0f)) : (n3 - 360.0f);
    }
    
    public Class7988 method10756(final Entity class399) {
        final double x = class399.posX - Class3376.field15514.field4684.posX + Math.cos((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        final double y = class399.posY - 1.6 - this.field16067 + class399.method1892() - Class3376.field15514.field4684.posY;
        final double y2 = class399.posZ - Class3376.field15514.field4684.posZ + Math.sin((class399.method1844() + 90.0f) * 3.141592653589793 / 180.0) * 0.14;
        return new Class7988(Class8845.method30910(this.field16064.field32884, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), Class8845.method30910(this.field16064.field32885, (float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f));
    }
    
    private double method10757(final double n, final double n2) {
        return n + Math.random() * (n2 - n);
    }
    
    static {
        Class3376.field16049 = false;
        Class3376.field16063 = new Class7988(0.0f, 0.0f);
    }
}