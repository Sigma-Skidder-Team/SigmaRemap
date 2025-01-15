// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Class3379 extends Class3167
{
    private double field16082;
    private double field16083;
    private double field16084;
    private double field16085;
    private double field16086;
    private double field16087;
    private double field16088;
    private double field16089;
    public boolean field16090;
    private long field16091;
    private float field16092;
    private float field16093;
    private float field16094;
    private float field16095;
    private float field16096;
    private float field16097;
    public Class9572 field16098;
    private Entity field16099;
    
    public Class3379() {
        super(Class8013.field32988, "Test", "A mod for testing things");
        this.method9881(new Class5002("Bezier", "ey", 0.57f, -0.035f, 0.095f, -0.0f));
        this.method9881(new Class4999("Test Checkbox", "A test checkbox", true).method15195(class4997 -> Class9463.method35173().method35187().method20240("Changed checkbox: " + class4997.method15198())));
        this.method9881(new Class4996("Test Slider", "A test slider", 0.5f, Float.class, 0.0f, 1.0f, 0.1f).method15195(class4997 -> Class9463.method35173().method35187().method20240("Changed slider: " + class4997.method15198())));
        this.method9881(new Class5004("Test Type", "A test type button", 0, new String[] { "hello", "goodbye" }).method15195(class4997 -> Class9463.method35173().method35187().method20240("Changed type: " + class4997.method15198())));
        this.method9881(new Class5007("Test Suboptions", "A test suboption", false, new Class4997[] { new Class4999("Test Checkbox", "A test checkbox", true), new Class4996("Test Slider", "A test slider", 0.5f, Float.class, 0.0f, 1.0f, 0.1f) }));
    }
    
    @Override
    public void method9879() {
        this.field16086 = 0.0;
        this.field16098 = new Class9572(1000, 100000, Class2186.field12964);
        this.field16092 = Class3379.field15514.field4684.field2399;
        this.field16093 = Class3379.field15514.field4684.field2400;
        final double field2395 = Class3379.field15514.field4684.field2395;
        final double field2396 = Class3379.field15514.field4684.field2396;
        final double field2397 = Class3379.field15514.field4684.field2397;
        this.field16090 = false;
        this.field16085 = 0.0;
    }
    
    @Override
    public void method9897() {
    }
    
    @Class6753
    @Class6759
    public void method10775(final Class5717 class5717) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    public void method10776(final Class5743 class5743) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    public void method10777(final Class5740 class5740) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    public void method10778(final Class5751 class5751) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    public void method10779(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            final Entity method10786 = this.method10786(3.3f);
            if (this.method10786(8.0f) != null) {
                if (this.field16087 < 1.0) {
                    this.field16087 += 20.0f / MathHelper.method35658(new Random(), 4, 8);
                }
                ++this.field16085;
            }
            if (method10786 == null) {
                if (this.method10786(8.0f) != null) {
                    if (this.field16085 >= (int)this.field16087) {
                        Class9274.method34209("" + this.method10786(8.0f));
                        Class3379.field15514.field4684.method2707(Class316.field1877);
                        this.field16087 -= (int)this.field16087;
                        this.field16085 = 0.0;
                    }
                }
            }
            else {
                final float[] method10787 = Class8845.method30912(method10786);
                Class3379.field15514.field4684.field2399 = method10787[0];
                Class3379.field15514.field4684.field2400 = method10787[1];
                if (this.field16099 != null) {
                    this.field16087 -= (int)this.field16087;
                    Class6430.method19165(this.field16099, true);
                }
            }
            this.field16099 = method10786;
        }
    }
    
    @Class6753
    @Class6755
    public void method10780(final Class5732 class5732) {
    }
    
    @Class6753
    @Class6755
    public void method10781(final Class5752 class5752) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Class6753
    @Class6755
    public void method10782(final Class5748 class5748) {
        if (this.method9906() && Class3379.field15514.field4700 == null) {
            if (this.field16099 != null) {
                this.field16090 = true;
            }
        }
    }
    
    @Class6753
    @Class6755
    public void method10783(final Class5721 class5721) {
        final Class4252 method16990 = class5721.method16990();
        if (this.method9906() && Class3379.field15514.field4684 != null) {
            if (!(method16990 instanceof Class4381)) {
                if (!(method16990 instanceof Class4353)) {
                    if (!(method16990 instanceof Class4321)) {
                        if (!(method16990 instanceof Class4307)) {
                            if (!(method16990 instanceof Class4380)) {
                                if (!(method16990 instanceof Class4329)) {
                                    if (!(method16990 instanceof Class4399)) {
                                        if (!(method16990 instanceof Class4389)) {
                                            if (!(method16990 instanceof Class4323)) {
                                                if (method16990 instanceof Class4317) {
                                                    final Class4317 class5722 = new Class4317();
                                                }
                                            }
                                            else if (((Class4323)method16990).method12987() != Class2218.field13623) {}
                                        }
                                    }
                                    else if (((Class4399)method16990).method13239() != Class2003.field11245) {}
                                }
                                else {
                                    final Class4329 class5723 = (Class4329)method16990;
                                }
                            }
                            else {
                                Class9274.method34209("swing");
                            }
                        }
                        else {
                            final Class4307 class5724 = (Class4307)method16990;
                        }
                    }
                    else {
                        final Class4321 class5725 = (Class4321)method16990;
                    }
                }
                else {
                    final Class4353 class5726 = (Class4353)method16990;
                    final double field19500 = class5726.field19500;
                    Class9274.method34209((class5726.method13083() ? "§a" : "§c") + class5726.field19500);
                }
            }
            else {
                final Entity method16991 = ((Class4381)method16990).method13170(Class3379.field15514.field4683);
                final String str = (method16991 != null) ? method16991.method1841().method8461() : "null";
                if (this.field16090) {
                    class5721.method16961(true);
                }
                Class9274.method34209("§chit : " + str);
            }
            if (!(method16990 instanceof Class4353)) {
                if (!(method16990 instanceof Class4303)) {
                    if (method16990 instanceof Class4255) {}
                }
            }
        }
    }
    
    @Class6753
    public void method10784(final Class5723 class5723) {
        final Class4252 method16998 = class5723.method16998();
        if (this.method9906()) {
            if (!(method16998 instanceof Class4396)) {
                if (!(method16998 instanceof Class4393)) {
                    if (method16998 instanceof Class4328) {
                        final Class4328 class5724 = (Class4328)method16998;
                    }
                }
                else {
                    final Class4393 class5725 = (Class4393)method16998;
                }
            }
            else {
                final Class4396 class5726 = (Class4396)method16998;
            }
            if (new ArrayList(Arrays.asList(Class4396.class, Class4393.class, Class4328.class, Class4402.class, Class4278.class, Class4312.class, Class4378.class, Class4364.class, Class4273.class)).contains(((Class4396)method16998).getClass())) {}
            if (!(method16998 instanceof Class4301)) {}
        }
    }
    
    public List<Entity> method10785(final float n) {
        final List<Entity> method19138 = Class6430.method19138();
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = iterator.next();
            if (class399 != Class3379.field15514.field4684) {
                if (!Class9463.method35173().method35190().method29878(class399)) {
                    if (class399 instanceof Class511) {
                        if (((Class511)class399).method2664() != 0.0f) {
                            if (Class3379.field15514.field4684.method1732(class399) <= n) {
                                if (Class3379.field15514.field4684.method2646((Class511)class399)) {
                                    if (!(class399 instanceof Class857) && !(class399 instanceof Class512)) {
                                        if (class399 instanceof Class512 && Class9463.method35173().method35191().method31751(class399)) {
                                            iterator.remove();
                                        }
                                        else if (Class3379.field15514.field4684.method1920() != null && Class3379.field15514.field4684.method1920().equals(class399)) {
                                            iterator.remove();
                                        }
                                        else if (!class399.method1850()) {
                                            if (!(class399 instanceof Class512)) {
                                                continue;
                                            }
                                            if (!Class9011.method32262((Class512)class399)) {
                                                continue;
                                            }
                                            iterator.remove();
                                        }
                                        else {
                                            iterator.remove();
                                        }
                                    }
                                    else {
                                        iterator.remove();
                                    }
                                }
                                else {
                                    iterator.remove();
                                }
                            }
                            else {
                                iterator.remove();
                            }
                        }
                        else {
                            iterator.remove();
                        }
                    }
                    else {
                        iterator.remove();
                    }
                }
                else {
                    iterator.remove();
                }
            }
            else {
                iterator.remove();
            }
        }
        Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4439(this));
        return method19138;
    }
    
    public Entity method10786(final float n) {
        final List<Entity> method19138 = Class6430.method19138();
        Entity class399 = null;
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class400 = iterator.next();
            if (class400 != Class3379.field15514.field4684) {
                if (!Class9463.method35173().method35190().method29878(class400)) {
                    if (class400 instanceof Class511) {
                        if (((Class511)class400).method2664() != 0.0f) {
                            if (Class3379.field15514.field4684.method1732(class400) <= n) {
                                if (Class3379.field15514.field4684.method2646((Class511)class400)) {
                                    if (!(class400 instanceof Class857)) {
                                        if (class400 instanceof Class512 && Class9463.method35173().method35191().method31751(class400)) {
                                            iterator.remove();
                                        }
                                        else if (Class3379.field15514.field4684.method1920() != null && Class3379.field15514.field4684.method1920().equals(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!class400.method1850()) {
                                            if (class399 != null && Class3379.field15514.field4684.method1732(class400) >= Class3379.field15514.field4684.method1732(class399)) {
                                                continue;
                                            }
                                            class399 = class400;
                                        }
                                        else {
                                            iterator.remove();
                                        }
                                    }
                                    else {
                                        iterator.remove();
                                    }
                                }
                                else {
                                    iterator.remove();
                                }
                            }
                            else {
                                iterator.remove();
                            }
                        }
                        else {
                            iterator.remove();
                        }
                    }
                    else {
                        iterator.remove();
                    }
                }
                else {
                    iterator.remove();
                }
            }
            else {
                iterator.remove();
            }
        }
        return class399;
    }
    
    public static float[] method10787(final Entity class399) {
        final double x = class399.field2395 - Class3379.field15514.field4684.field2395;
        final double y = class399.field2397 - Class3379.field15514.field4684.field2397;
        return new float[] { (float)Math.toDegrees(Math.atan2(y, x)) - 90.0f, -(float)(-(Math.atan2(Class3379.field15514.field4684.field2396 + Class3379.field15514.field4684.method1892() - (class399.field2396 + class399.method1892()), MathHelper.method35641(x * x + y * y)) * 180.0 / 3.141592653589793)) };
    }
    
    public static float method10788(final float n, final double n2, final double n3) {
        final double n4 = n2 - Class3379.field15514.field4684.field2395;
        final double n5 = n3 - Class3379.field15514.field4684.field2397;
        double degrees = 0.0;
        if (n5 < 0.0 && n4 < 0.0) {
            if (n4 != 0.0) {
                degrees = 90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 < 0.0 && n4 > 0.0) {
            if (n4 != 0.0) {
                degrees = -90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 != 0.0) {
            degrees = Math.toDegrees(-Math.atan(n4 / n5));
        }
        return MathHelper.method35668(-(n - (float)degrees));
    }
    
    private double method10789(final double n, final double n2) {
        return n + Math.random() * (n2 - n);
    }
    
    public static float method10790(final float n, final Entity class399, final double n2) {
        final double n3 = class399.field2395 - Class3379.field15514.field4684.field2395;
        final double n4 = class399.field2397 - Class3379.field15514.field4684.field2397;
        return -MathHelper.method35668(n - (float)(-Math.toDegrees(Math.atan((n2 - 2.2 + class399.method1892() - Class3379.field15514.field4684.field2396) / MathHelper.method35641(n3 * n3 + n4 * n4))))) - 2.5f;
    }
}
