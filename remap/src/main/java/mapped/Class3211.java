// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class3211 extends Class3167
{
    private int field15646;
    private boolean field15647;
    private float field15648;
    private List<List<Class9407>> field15649;
    
    public Class3211() {
        super(Class8013.field32986, "InfiniteAura", "Basically infinite aura");
        this.method9881(new Class4996("Range", "Range value", 4.0f, Float.class, 8.0f, 120.0f, 1.0f));
        this.method9881(new Class4996("CPS", "CPS value", 8.0f, Float.class, 1.0f, 20.0f, 1.0f));
        this.method9881(new Class4996("Targets", "Number of targets", 4.0f, Float.class, 1.0f, 10.0f, 1.0f));
        this.method9881(new Class4999("Players", "Hit players", true));
        this.method9881(new Class4999("Animals/Monsters", "Hit animals and monsters", false));
        this.method9881(new Class4999("Anti-Bot", "Doesn't hit bots", true));
        this.method9881(new Class4999("Invisible", "Hit invisible entites", true));
        this.method9881(new Class4999("No Swing", "Doesn't swing", false));
        this.field15649 = new ArrayList<List<Class9407>>();
    }
    
    @Override
    public void method9879() {
        this.field15647 = false;
        this.field15646 = (int)(20.0f / this.method9914().method9886("CPS"));
        this.field15648 = (float)this.field15646;
    }
    
    @Override
    public void method9897() {
        this.field15649.clear();
        this.field15647 = false;
    }
    
    @Class6753
    @Class6759
    public void method10091(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        final List<Class8131> method10094 = this.method10094((float)(int)this.method9886("Range"));
        if (method10094 == null || method10094.size() == 0) {
            this.field15647 = false;
            this.field15649.clear();
            return;
        }
        if (this.field15648 < 1.0f) {
            this.field15648 += 20.0f / this.method9914().method9886("CPS");
        }
        ++this.field15646;
        if (this.field15646 >= (int)this.field15648) {
            this.field15646 = 0;
            this.field15649.clear();
            this.field15648 -= (int)this.field15648;
            int n = 0;
            final Entity class5744 = (Class3211.field15514.field4684.method1920() == null) ? Class3211.field15514.field4684 : Class3211.field15514.field4684.method1920();
            final Iterator iterator = method10094.iterator();
            while (iterator.hasNext()) {
                final Entity method10095 = ((Class8131)iterator.next()).method26798();
                if ((int)this.method9886("Targets") < ++n) {
                    break;
                }
                final ArrayList<Class9407> method10096 = Class9147.method33405(new Class9407(method10095.field2395, method10095.field2396, method10095.field2397), new Class9407(class5744.field2395, class5744.field2396, class5744.field2397));
                this.field15649.add(method10096);
                Collections.reverse(method10096);
                this.method10092(method10096, Class9463.method35173().method35189().method21551(Class3261.class).method9906());
                Class6430.method19165(method10095, !this.method9883("No Swing"));
                Collections.reverse(method10096);
                this.method10092(method10096, false);
            }
        }
    }
    
    public void method10092(final List<Class9407> list, final boolean b) {
        final Entity method1920 = Class3211.field15514.field4684.method1920();
        Class9407 class9407 = null;
        final Iterator<Class9407> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Class9407 class9408 = class9407 = iterator.next();
            if (method1920 == null) {
                Class3211.field15514.method5269().method17292(new Class4354(class9408.method34993(), class9408.method34994(), class9408.method34995(), true));
            }
            else {
                method1920.field2395 = class9408.method34993() + 0.5;
                method1920.field2396 = class9408.method34994();
                method1920.field2397 = class9408.method34995() + 0.5;
                Class3211.field15514.method5269().method17292(new Class4302(false, false));
                Class3211.field15514.method5269().method17292(new Class4356(Class3211.field15514.field4684.field2399, Class3211.field15514.field4684.field2400, false));
                Class3211.field15514.method5269().method17292(new Class4254(0.0f, 1.0f, false, false));
                final Class423 class9409 = new Class423(Class3211.field15514.field4683, class9408.method34993() + 0.5, class9408.method34994(), class9408.method34995() + 0.5);
                class9409.field2399 = method1920.field2399;
                class9409.field2400 = method1920.field2400;
                Class3211.field15514.method5269().method17292(new Class4251(class9409));
            }
        }
        if (b) {
            if (class9407 != null) {
                Class3211.field15514.method5269().method17292(new Class4354(class9407.method34993(), class9407.method34994() + 1.0E-14, class9407.method34995(), false));
                Class3211.field15514.method5269().method17292(new Class4354(class9407.method34993(), class9407.method34994(), class9407.method34995(), false));
            }
        }
    }
    
    @Class6753
    public void method10093(final Class5739 class5739) {
        if (this.method9906()) {
            if (this.field15649 != null) {
                if (this.field15649.size() != 0) {
                    for (final List list : this.field15649) {
                        GL11.glPushMatrix();
                        GL11.glEnable(2848);
                        GL11.glBlendFunc(770, 771);
                        GL11.glEnable(3042);
                        GL11.glDisable(3553);
                        GL11.glDisable(2929);
                        GL11.glEnable(32925);
                        GL11.glLineWidth(1.4f);
                        GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
                        GL11.glBegin(3);
                        for (final Class9407 class5740 : list) {
                            GL11.glVertex3d(class5740.method34993() - Class3211.field15514.field4644.method5833().method18161().method16760(), class5740.method34994() - Class3211.field15514.field4644.method5833().method18161().method16761(), class5740.method34995() - Class3211.field15514.field4644.method5833().method18161().method16762());
                        }
                        GL11.glEnd();
                        GL11.glPushMatrix();
                        GL11.glTranslated(Class3211.field15514.field4644.method5833().method18161().method16760(), Class3211.field15514.field4644.method5833().method18161().method16761(), Class3211.field15514.field4644.method5833().method18161().method16762());
                        GL11.glPopMatrix();
                        GL11.glDisable(3042);
                        GL11.glEnable(3553);
                        GL11.glEnable(2929);
                        GL11.glDisable(32925);
                        GL11.glDisable(2848);
                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }
    
    public List<Class8131> method10094(final float n) {
        final ArrayList list = new ArrayList();
        for (final Entity class399 : Class6430.method19138()) {
            list.add(new Class8131(class399, Class8845.method30922(class399)));
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Entity method26798 = ((Class8131)iterator2.next()).method26798();
            if (method26798 != Class3211.field15514.field4684) {
                if (!Class9463.method35173().method35190().method29878(method26798)) {
                    if (method26798 instanceof Class511) {
                        if (((Class511)method26798).method2664() != 0.0f) {
                            if (Class3211.field15514.field4684.method1732(method26798) <= n) {
                                if (Class3211.field15514.field4684.method2646((Class511)method26798)) {
                                    if (!(method26798 instanceof Class857)) {
                                        if (!this.method9883("Players") && method26798 instanceof Class512) {
                                            iterator2.remove();
                                        }
                                        else if (method26798 instanceof Class512 && Class9463.method35173().method35191().method31751(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!this.method9883("Invisible") && method26798.method1823()) {
                                            iterator2.remove();
                                        }
                                        else if (!this.method9883("Animals/Monsters") && !(method26798 instanceof Class512)) {
                                            iterator2.remove();
                                        }
                                        else if (Class3211.field15514.field4684.method1920() != null && Class3211.field15514.field4684.method1920().equals(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!method26798.method1850()) {
                                            if (!(method26798 instanceof Class512)) {
                                                continue;
                                            }
                                            if (!Class9011.method32262((Class512)method26798)) {
                                                continue;
                                            }
                                            if (!Class9463.method35173().method35189().method21551(Class3203.class).method9906()) {
                                                continue;
                                            }
                                            iterator2.remove();
                                        }
                                        else {
                                            iterator2.remove();
                                        }
                                    }
                                    else {
                                        iterator2.remove();
                                    }
                                }
                                else {
                                    iterator2.remove();
                                }
                            }
                            else {
                                iterator2.remove();
                            }
                        }
                        else {
                            iterator2.remove();
                        }
                    }
                    else {
                        iterator2.remove();
                    }
                }
                else {
                    iterator2.remove();
                }
            }
            else {
                iterator2.remove();
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4436(this));
        return list;
    }
    
    public boolean method10095() {
        if (this.field15647) {
            if (Class869.method5277().field4684.method2713() != null) {
                if (Class869.method5277().field4684.method2713().method27622() instanceof Class4077) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method9898() {
        if (this.method9906()) {
            if (this.method10095()) {
                if (Class9463.method35173().method35194().method29229()) {
                    return true;
                }
            }
        }
        return false;
    }
}
