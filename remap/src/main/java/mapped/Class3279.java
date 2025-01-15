// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
import java.util.HashMap;

public class Class3279 extends Class3167
{
    private HashMap<BlockPos, Class6312> field15778;
    private BlockPos field15779;
    private static Class1780 field15780;
    private static HashMap<String, Class7776> field15781;
    public static Class3279 field15782;
    private List<Entity> field15783;
    private boolean field15784;
    private HashMap<UUID, String> field15785;
    public int field15786;
    
    public Class3279() {
        super(Class8013.field32984, "NameTags", "Render better name tags");
        this.field15778 = new HashMap<BlockPos, Class6312>();
        this.field15783 = new ArrayList<Entity>();
        this.field15784 = false;
        this.field15785 = new HashMap<UUID, String>();
        this.field15786 = Class6430.method19118(Class6430.method19120(Class265.field1278.field1292, Class265.field1273.field1292, 75.0f), 0.5f);
        this.method9881(new Class4999("Magnify", "Scales nametags to keep them readable", true));
        this.method9881(new Class4999("Furnaces", "Shows furnaces info once open", true));
        this.method9881(new Class4999("Mob Owners", "Shows mob owners", true));
        this.method9915(false);
        Class3279.field15782 = this;
    }
    
    @Class6753
    private void method10329(final Class5743 class5743) {
        if (this.method9906()) {
            if (!(this.field15784 = this.method9883("Furnaces"))) {
                this.field15778.clear();
            }
            else {
                final Iterator<Map.Entry<BlockPos, Class6312>> iterator = this.field15778.entrySet().iterator();
                while (iterator.hasNext()) {
                    final Map.Entry<BlockPos, V> entry = (Map.Entry<BlockPos, V>)iterator.next();
                    if (!(Class3279.field15514.field4683.method6701(entry.getKey()).method21696() instanceof Class3951)) {
                        iterator.remove();
                    }
                    ((Class6312)entry.getValue()).method18687();
                }
            }
            this.field15783.clear();
            for (final Entity class5744 : Class4609.method13679(Class6430.method19108())) {
                if (class5744 == Class3279.field15514.field4684) {
                    continue;
                }
                if (class5744 == Class3317.field15901) {
                    continue;
                }
                if (class5744 == Class3276.field15771) {
                    continue;
                }
                if (class5744.method1823()) {
                    continue;
                }
                if (Class9463.method35173().method35191().method31751(class5744)) {
                    continue;
                }
                this.field15783.add(class5744);
            }
        }
    }
    
    @Class6753
    private void method10330(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4329) {
                final Class4329 class5722 = (Class4329)class5721.method16990();
                if (Class3279.field15514.field4683.method6701(class5722.method13000().method21447()).method21696() instanceof Class3951) {
                    this.field15779 = class5722.method13000().method21447();
                }
            }
            if (class5721.method16990() instanceof Class4256) {
                final Class6312 method10332 = this.method10332(((Class4256)class5721.method16990()).method12773());
                if (method10332 == null) {
                    return;
                }
                if (Class3279.field15514.field4700 instanceof Class522) {
                    final Class522 class5723 = (Class522)Class3279.field15514.field4700;
                    method10332.field25240 = class5723.method2993().method10878(0).method20053();
                    method10332.field25241 = new Class8321(class5723.method2993().method10878(1).method20053().method27622());
                    method10332.field25241.field34176 = class5723.method2993().method10878(1).method20053().field34176;
                    method10332.field25242 = class5723.method2993().method10878(2).method20053();
                }
            }
        }
    }
    
    @Class6753
    private void method10331(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (class5723.method16998() instanceof Class4308) {
            final Class4308 class5724 = (Class4308)class5723.method16998();
            if (class5724.method12952() != Class8471.field34768) {
                return;
            }
            this.field15778.put(this.field15779, new Class6312(class5724.method12951()));
        }
        if (class5723.method16998() instanceof Class4272) {
            final Class4272 class5725 = (Class4272)class5723.method16998();
            final Class6312 method10332 = this.method10332(class5725.method12819());
            if (method10332 == null) {
                return;
            }
            if (class5725.method12820() == 0) {
                method10332.field25240 = new Class8321(class5725.method12821().method27622());
                method10332.field25240.field34176 = class5725.method12821().field34176;
            }
            else if (class5725.method12820() == 1) {
                method10332.field25241 = new Class8321(class5725.method12821().method27622());
                method10332.field25241.field34176 = class5725.method12821().field34176;
            }
            else if (class5725.method12820() == 2) {
                method10332.field25242 = new Class8321(class5725.method12821().method27622());
                method10332.field25242.field34176 = class5725.method12821().field34176;
            }
        }
        if (class5723.method16998() instanceof Class4311) {
            final Class4311 class5726 = (Class4311)class5723.method16998();
            final Class6312 method10333 = this.method10332(class5726.method12960());
            if (method10333 == null) {
                return;
            }
            switch (class5726.method12961()) {
                case 1: {
                    method10333.field25238 = class5726.method12962();
                    break;
                }
                case 3: {
                    method10333.field25236 = (float)class5726.method12962();
                    break;
                }
                case 0: {
                    method10333.field25239 = class5726.method12962();
                    break;
                }
                case 2: {
                    method10333.field25237 = (float)class5726.method12962();
                    break;
                }
            }
        }
    }
    
    private Class6312 method10332(final int n) {
        for (final Map.Entry<K, Class6312> entry : this.field15778.entrySet()) {
            if (entry.getValue().field25235 != n) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
    
    @Class6753
    public void method10333(final Class5739 class5739) {
        if (this.method9906()) {
            Class8726.method30084(33986, 240.0f, 240.0f);
            final boolean method9883 = this.method9883("Magnify");
            for (final Entity class5740 : this.field15783) {
                float n = 1.0f;
                if (method9883) {
                    n = (float)Math.max(1.0, Math.sqrt(Class8591.method29091(class5740) / 30.0));
                }
                this.method10336(Class8591.method29093(class5740).field38854, Class8591.method29093(class5740).field38855 + class5740.method1931(), Class8591.method29093(class5740).field38856, class5740, n, null);
                class5740.method1650().method33569(Entity.field2436, false);
            }
            for (final Map.Entry<BlockPos, V> entry : this.field15778.entrySet()) {
                float n2 = 1.0f;
                if (method9883) {
                    n2 = (float)Math.max(0.800000011920929, Math.sqrt(Class8591.method29092(entry.getKey()) / 30.0));
                }
                this.method10335(entry.getKey(), (Class6312)entry.getValue(), n2);
            }
            if (this.method9883("Mob Owners")) {
                for (final Entity class5741 : Class3279.field15514.field4683.method6806()) {
                    if (class5741 != Class3279.field15514.field4684) {
                        continue;
                    }
                    if (!(class5741 instanceof Class794) && !(class5741 instanceof Class808)) {
                        continue;
                    }
                    final UUID uuid = (class5741 instanceof Class794) ? ((Class794)class5741).method4485() : ((Class808)class5741).method4716();
                    if (uuid == null) {
                        continue;
                    }
                    if (!this.field15785.containsKey(uuid)) {
                        this.field15785.put(uuid, null);
                        new Thread(() -> {
                            try {
                                Class6430.method19130(key.toString());
                                final List list;
                                if (list != null && !list.isEmpty()) {
                                    this.field15785.put(key, list.get(list.size() - 1));
                                }
                            }
                            catch (final Exception ex) {
                                ex.printStackTrace();
                            }
                            return;
                        }).start();
                    }
                    if (this.field15785.get(uuid) == null) {
                        continue;
                    }
                    float n3 = 1.0f;
                    if (this.method9883("Magnify")) {
                        n3 = (float)Math.max(1.0, Math.sqrt(Class8591.method29091(class5741) / 30.0));
                    }
                    this.method10336(Class8591.method29093(class5741).field38854, Class8591.method29093(class5741).field38855 + class5741.method1931(), Class8591.method29093(class5741).field38856, class5741, n3, this.field15785.get(uuid));
                    class5741.method1650().method33569(Entity.field2436, false);
                }
            }
            GL11.glDisable(2896);
            Class8726.method30084(33986, 240.0f, 240.0f);
            Class7777.method24931();
            final Class1663 method9884 = Class3279.field15514.method5290();
            Class3279.field15514.method5290();
            method9884.method5849(Class1663.field9428);
        }
    }
    
    private void method10334(final float n, final float n2, final float n3, final float n4) {
        GL11.glColor4f(n / 255.0f, n2 / 255.0f, n3 / 255.0f, n4);
        GL11.glTranslatef(0.0f, 0.0f, 0.3f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.0f);
        GL11.glVertex2f(0.0f, 0.5f);
        GL11.glVertex2f(0.5f, 0.5f);
        GL11.glVertex2f(0.5f, 0.0f);
        GL11.glEnd();
    }
    
    public void method10335(final BlockPos class354, final Class6312 class355, final float n) {
        final Class7524 field40314 = Class9400.field40314;
        if (class355.field25240 != null) {
            new StringBuilder().append(class355.field25240.field34176).append(" ").append(class355.field25240.method27664()).toString();
        }
        final float n2 = (float)(class354.getX() - Class3279.field15514.field4644.method5833().method18161().method16760() + 0.5);
        final float n3 = (float)(class354.getY() - Class3279.field15514.field4644.method5833().method18161().method16761() + 1.0);
        final float n4 = (float)(class354.getZ() - Class3279.field15514.field4644.method5833().method18161().method16762() + 0.5);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        final float min = Math.min(class355.field25237 / class355.field25236, 1.0f);
        final float min2 = Math.min(class355.field25239 / (float)class355.field25238, 1.0f);
        final int n5 = 14;
        GL11.glPushMatrix();
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glTranslated((double)n2, (double)(n3 + 0.6f - 0.33333334f * (1.0f - n)), (double)n4);
        GL11.glRotatef(Class3279.field15514.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
        GL11.glRotatef(Class3279.field15514.field4644.method5833().method18163(), 1.0f, 0.0f, 0.0f);
        GL11.glPushMatrix();
        final float n6 = 0.008f;
        GL11.glScalef(-n6 * n, -n6 * n, -n6 * n);
        final Class8321 method18690 = class355.method18690();
        int max;
        if (method18690 != null) {
            max = Math.max(Class9400.field40313.method23505(method18690.method27664().method8459()), 50);
        }
        else {
            max = 37;
        }
        final int n7 = 51 + max + n5 * 2;
        final int n8 = 85 + n5 * 2;
        GL11.glTranslated((double)(-n7 / 2), (double)(-n8 / 2), 0.0);
        Class8154.method26876(0.0f, 0.0f, (float)n7, (float)n8, this.field15786);
        Class8154.method26913(0.0f, 0.0f, (float)n7, (float)n8, 20.0f, 0.5f);
        Class8154.method26889(field40314, (float)n5, (float)(n5 - 5), "Furnace", Class265.field1278.field1292);
        if (method18690 == null) {
            Class8154.method26889(Class9400.field40313, (float)(n5 + 15), (float)(n5 + 40), "Empty", Class6430.method19118(Class265.field1278.field1292, 0.6f));
        }
        final Class8321 method18691 = class355.method18690();
        if (method18691 != null) {
            Class8154.method26929(method18691, n5, n5 + 27, 45, 45);
            Class8154.method26889(Class9400.field40313, (float)(n5 + 51), 40.0f, method18691.method27664().method8459(), Class265.field1278.field1292);
            Class8154.method26889(Class9400.field40311, (float)(n5 + 51), 62.0f, "Count: " + method18691.field34176, Class265.field1278.field1292);
        }
        Class8154.method26876(0.0f, n8 - 12.0f, Math.min(n7 * min2, (float)n7), n8 - 6.0f, Class6430.method19118(-106750, 0.3f));
        Class8154.method26876(0.0f, n8 - 6.0f, Math.min(n7 * min, (float)n7), (float)n8, Class6430.method19118(Class265.field1278.field1292, 0.75f));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    public void method10336(final double n, final double n2, final double n3, final Entity class399, final float n4, final String s) {
        final Class7524 field40314 = Class9400.field40314;
        String method9887 = (s == null) ? class399.method1841().method8459().replaceAll("§.", "") : s;
        if (Class9463.method35173().method35189().method21551(Class3230.class).method9906()) {
            if (method9887.equals(Class3279.field15514.method5287().method33692())) {
                method9887 = Class9463.method35173().method35189().method21551(Class3230.class).method9887("Username");
            }
        }
        if (method9887.length() != 0) {
            final float n5 = (float)(n - Class3279.field15514.field4644.method5833().method18161().method16760());
            final float n6 = (float)(n2 - Class3279.field15514.field4644.method5833().method18161().method16761());
            final float n7 = (float)(n3 - Class3279.field15514.field4644.method5833().method18161().method16762());
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            final String string = Math.round(((Class511)class399).method2664() * 10.0f) / 10.0f + "";
            final float min = Math.min(((Class511)class399).method2664() / ((Class511)class399).method2701(), 1.0f);
            GL11.glPushMatrix();
            GL11.glAlphaFunc(519, 0.0f);
            GL11.glTranslated((double)n5, (double)(n6 + 0.6f - 0.33333334f * (1.0f - n4)), (double)n7);
            GL11.glRotatef(Class3279.field15514.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
            GL11.glRotatef(Class3279.field15514.field4644.method5833().method18163(), 1.0f, 0.0f, 0.0f);
            GL11.glScalef(-0.009f * n4, -0.009f * n4, -0.009f * n4);
            int n8 = this.field15786;
            if (!Class9463.method35173().method35190().method29878(class399)) {
                if (Class9463.method35173().method35190().method29880(class399)) {
                    n8 = Class6430.method19118(-6750208, 0.5f);
                }
            }
            else {
                n8 = Class6430.method19118(-16171506, 0.5f);
            }
            final int method9888 = Class6430.method19118((class399 instanceof Class512) ? new Color(Class9011.method32263((Class512)class399)).getRGB() : Class265.field1278.field1292, 0.5f);
            final int n9 = field40314.method23505(method9887) / 2;
            if (!Class3279.field15781.containsKey(method9887)) {
                Class8154.method26913((float)(-n9 - 10), -25.0f, (float)(n9 * 2 + 20), (float)(field40314.method23539() + 27), 20.0f, 0.5f);
            }
            else {
                Class8154.method26899((float)(-n9 - 10 - 31), -25.0f, (float)(field40314.method23539() + 27), (float)(field40314.method23539() + 27), Class3279.field15781.get(method9887), Class6430.method19118(Color.getHSBColor(System.currentTimeMillis() % 10000L / 10000.0f, 0.5f, 1.0f).getRGB(), 0.7f));
                Class8154.method26899((float)(-n9 - 10 - 31 + field40314.method23539() + 27), -25.0f, 14.0f, (float)(field40314.method23539() + 27), Class7853.field32170, Class6430.method19118(Class265.field1278.field1292, 0.6f));
                Class8154.method26913((float)(-n9 - 10 - 31), -25.0f, (float)(n9 * 2 + 20 + 31 + 27), (float)(field40314.method23539() + 27), 20.0f, 0.5f);
                GL11.glTranslatef(27.0f, 0.0f, 0.0f);
            }
            Class8154.method26876((float)(-n9 - 10), -25.0f, (float)(n9 + 10), (float)(field40314.method23539() + 2), n8);
            Class8154.method26876((float)(-n9 - 10), field40314.method23539() - 1 - ((Class511)class399).field2938 / 3.0f, Math.min((n9 * 2 + 20) * (min - 0.5f), (float)(n9 + 10)), (float)(field40314.method23539() + 2), method9888);
            GL11.glPushMatrix();
            GL11.glTranslated((double)(-field40314.method23505(method9887) / 2), 0.0, 0.0);
            final int method9889 = Class9400.field40311.method23505("Health: 20.0");
            String str = "Health: ";
            if (method9889 > field40314.method23505(method9887)) {
                str = "H: ";
            }
            Class8154.method26889(field40314, 0.0f, -20.0f, method9887, Class265.field1278.field1292);
            Class8154.method26889(Class9400.field40311, 0.0f, 10.0f, str + string, Class265.field1278.field1292);
            final Class6538 method9890 = Class9463.method35173().method35201().field25697.method33657(class399);
            if (method9890 != null) {
                Class8154.method26889(Class9400.field40311, 0.0f, -30.0f, method9890.field25986, Class265.field1278.field1292);
            }
            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
        }
    }
    
    @Class6753
    public void method10337(final Class5749 class5749) {
        if (this.method9906()) {
            if (class5749.method17056() instanceof Class512) {
                class5749.method16961(true);
            }
        }
    }
    
    static {
        Class3279.field15780 = new Class1780();
        (Class3279.field15781 = new HashMap<String, Class7776>()).put("Tomygaims", Class7853.field32206);
        Class3279.field15781.put("Andro24", Class7853.field32207);
        Class3279.field15781.put("Gretorm", Class7853.field32208);
        Class3279.field15781.put("Flyinqq", Class7853.field32210);
        Class3279.field15781.put("cxbot", Class7853.field32209);
    }
}
