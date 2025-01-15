// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class3353 extends Class3167
{
    private int field15979;
    private int field15980;
    private int field15981;
    private int field15982;
    
    public Class3353() {
        super(Class8013.field32992, "AutoPotion", "Automatically throws potion to regen or speed up");
        this.method9881(new Class4996("Health", "Maximum health before healing.", 6.0f, Float.class, 0.5f, 10.0f, 0.5f));
        this.method9881(new Class4999("Predict", "Predicts where to pot when moving.", true));
        this.method9881(new Class4999("Instant", "Instant potting (more packets).", false));
        this.method9881(new Class4999("Speed", "Uses Speed pots.", true));
        this.method9881(new Class4999("Regen", "Uses Regen pots.", true));
        this.method9881(new Class4999("Custom potion", "Allow the use of custom potions", false));
        this.method9881(new Class4999("In fight", "Allows using autopot with killaura", true));
    }
    
    @Override
    public void method9879() {
        this.field15982 = 0;
    }
    
    @Class6753
    @Class6755
    private void method10613(final Class5744 class5744) {
        if (!this.method9906() || !class5744.method17046()) {
            return;
        }
        if (!this.method9883("In fight") && (Class3376.field16061 != null || Class3376.field16060 != null)) {
            return;
        }
        final int method10615 = this.method10615();
        ++this.field15979;
        final int[] array = { 6, -1, -1 };
        if (this.method9883("Regen")) {
            array[1] = 10;
        }
        if (this.method9883("Speed")) {
            array[2] = 1;
        }
        if (!Class3353.field15514.field4684.field2404) {
            this.field15980 = 0;
        }
        else {
            ++this.field15980;
        }
        if (this.field15982 != 1) {
            if (this.field15982 >= 2) {
                Class3353.field15514.field4684.field3006.field2743 = this.field15981;
                Class3353.field15514.field4682.method27318();
                this.field15982 = 0;
            }
            if (this.field15980 > 1) {
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] != -1) {
                        if (array[i] != 6 && array[i] != 10) {
                            if (this.field15979 > 60) {
                                this.method10618(class5744, method10615, array[i]);
                            }
                        }
                        else if (this.field15979 > 18) {
                            if (!Class3353.field15514.field4684.method2653(Class5328.method16450(array[i]))) {
                                if (Class3353.field15514.field4684.method2664() < this.method9886("Health") * 2.0f) {
                                    this.method10618(class5744, method10615, array[i]);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        ++this.field15982;
        Class3353.field15514.method5269().method17292(new Class4307(Class316.field1877));
    }
    
    public float[] method10614() {
        final double n = Class3353.field15514.field4684.field2395 + Class3353.field15514.field4684.method1935().x * 26.0;
        final double n2 = Class3353.field15514.field4684.field2403.field25074 - 3.6;
        final double n3 = Class3353.field15514.field4684.field2397 + Class3353.field15514.field4684.method1935().z * 26.0;
        if (!this.method9883("Predict")) {
            return new float[] { Class3353.field15514.field4684.field2399, 90.0f };
        }
        return Class8845.method30919(n, n3, n2);
    }
    
    public int method10615() {
        int n = 5;
        for (int i = 36; i < 45; ++i) {
            if (!Class3353.field15514.field4684.field3008.method10878(i).method20054()) {
                n = i - 36;
                break;
            }
        }
        return n;
    }
    
    public int method10616(final int n) {
        final int n2 = 0;
        final int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        for (int i = 9; i < 45; ++i) {
            if (Class3353.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3353.field15514.field4684.field3008.method10878(i).method20053();
                if (method20053.method27622() instanceof Class4089) {
                    final List<Class1948> method20054 = Class8639.method29355(method20053);
                    final int method20055 = this.method10617(method20054);
                    if (method20054 != null) {
                        if (!method20054.isEmpty()) {
                            if (this.method9883("Custom potion") || method20055 == 1) {
                                for (final Class1948 class1948 : method20054) {
                                    final int method20056 = Class5328.method16451(class1948.method7906());
                                    final int method20057 = class1948.method7908();
                                    final int method20058 = class1948.method7907();
                                    if (method20056 != n) {
                                        continue;
                                    }
                                    if (!Class8639.method29356(method20053)) {
                                        continue;
                                    }
                                    if (method20057 <= n2) {
                                        if (method20057 == n2 && method20058 > n3) {
                                            n4 = i;
                                            n5 = method20055;
                                        }
                                        else {
                                            if (n5 <= method20055) {
                                                continue;
                                            }
                                            if (method20057 < n2) {
                                                continue;
                                            }
                                            n5 = method20055;
                                        }
                                    }
                                    else {
                                        n4 = i;
                                        n5 = method20055;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Class3353.field15514.field4684.method2653(Class5328.method16450(n)) && Class3353.field15514.field4684.method2654(Class5328.method16450(n)).method7908() >= n2) {
            return -1;
        }
        return n4;
    }
    
    private int method10617(final List<Class1948> list) {
        final ArrayList list2 = new ArrayList();
        int n = 0;
        final Iterator<Class1948> iterator = list.iterator();
        while (iterator.hasNext()) {
            final int method16451 = Class5328.method16451(iterator.next().method7906());
            if (list2.contains(method16451)) {
                continue;
            }
            ++n;
            list2.add(method16451);
        }
        return n;
    }
    
    public void method10618(final Class5744 class5744, final int n, final int n2) {
        final int method10616 = this.method10616(n2);
        if (method10616 != -1) {
            if (method10616 < 36) {
                Class8639.method29370(method10616, n);
            }
            else {
                this.field15979 = 0;
                final int field2743 = Class3353.field15514.field4684.field3006.field2743;
                final boolean b = Class9463.method35173().method35189().method21551(Class3261.class).method9906() && Class9463.method35173().method35189().method21551(Class3261.class).method9887("Type").equalsIgnoreCase("NoGround");
                final float[] method10617 = this.method10614();
                Class3353.field15514.field4684.field3006.field2743 = method10616 - 36;
                Class3353.field15514.field4682.method27318();
                if (!this.method9883("Instant")) {
                    this.field15982 = 1;
                    class5744.method17043(method10617[0]);
                    class5744.method17041(method10617[1]);
                }
                else {
                    Class3353.field15514.method5269().method17292(new Class4356(method10617[0], method10617[1], !b && Class3353.field15514.field4684.field2404));
                    Class3353.field15514.method5269().method17292(new Class4307(Class316.field1877));
                    Class3353.field15514.method5269().method17292(new Class4307(Class316.field1878));
                    Class3353.field15514.field4684.field3006.field2743 = field2743;
                    Class3353.field15514.field4682.method27318();
                    Class3376.field16066 = 1;
                }
                this.field15981 = field2743;
            }
        }
    }
}
