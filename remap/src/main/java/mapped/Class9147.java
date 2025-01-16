// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Class9147
{
    private static String[] field38767;
    private Class9407 field38768;
    private Class9407 field38769;
    private ArrayList<Class9407> field38770;
    private ArrayList<Class9035> field38771;
    private ArrayList<Class9035> field38772;
    private double field38773;
    private boolean field38774;
    private static Minecraft field38775;
    private static Class9407[] field38776;
    
    public Class9147(final Class9407 class9407, final Class9407 class9408) {
        this.field38770 = new ArrayList<Class9407>();
        this.field38771 = new ArrayList<Class9035>();
        this.field38772 = new ArrayList<Class9035>();
        this.field38773 = 9.0;
        this.field38774 = true;
        this.field38768 = class9407.method34996(0.0, 0.0, 0.0).method34997();
        this.field38769 = class9408.method34996(0.0, 0.0, 0.0).method34997();
    }
    
    public ArrayList<Class9407> method33402() {
        return this.field38770;
    }
    
    public void method33403() {
        this.method33404(1000, 4);
    }
    
    public void method33404(final int n, final int n2) {
        this.field38770.clear();
        this.field38772.clear();
        final ArrayList list = new ArrayList();
        list.add(this.field38768);
        this.field38772.add(new Class9035(this.field38768, null, list, this.field38768.method34998(this.field38769), 0.0, 0.0));
    Label_0077:
        for (int i = 0; i < n; ++i) {
            Collections.sort(this.field38772, new Class4460(this));
            int n3 = 0;
            if (this.field38772.size() == 0) {
                break;
            }
            for (final Class9035 class9035 : new ArrayList(this.field38772)) {
                if (++n3 > n2) {
                    break;
                }
                this.field38772.remove(class9035);
                this.field38771.add(class9035);
                final Class9407[] field38776 = Class9147.field38776;
                for (int length = field38776.length, j = 0; j < length; ++j) {
                    final Class9407 method34997 = class9035.method32467().method34999(field38776[j]).method34997();
                    if (method33406(method34997, false) && this.method33409(class9035, method34997, 0.0)) {
                        break Label_0077;
                    }
                }
                final Class9407 method34998 = class9035.method32467().method34996(0.0, 1.0, 0.0).method34997();
                if (method33406(method34998, false) && this.method33409(class9035, method34998, 0.0)) {
                    break Label_0077;
                }
                final Class9407 method34999 = class9035.method32467().method34996(0.0, -1.0, 0.0).method34997();
                if (method33406(method34999, false) && this.method33409(class9035, method34999, 0.0)) {
                    break Label_0077;
                }
            }
        }
        if (this.field38774) {
            Collections.sort(this.field38771, new Class4460(this));
            this.field38770 = this.field38771.get(0).method32469();
        }
    }
    
    public static ArrayList<Class9407> method33405(final Class9407 class9407, final Class9407 class9408) {
        final Class9147 class9409 = new Class9147(class9407, class9408);
        class9409.method33403();
        final int n = 5;
        int n2 = 0;
        Class9407 class9410 = null;
        Class9407 class9411 = null;
        final ArrayList list = new ArrayList();
        final ArrayList<Class9407> method33402 = class9409.method33402();
        for (final Class9407 class9412 : method33402) {
            if (n2 != 0 && n2 != method33402.size() - 1) {
                int n3 = 1;
                Label_0286: {
                    if (class9412.method34998(class9411) <= n * n) {
                        final double min = Math.min(class9411.method34993(), class9412.method34993());
                        final double min2 = Math.min(class9411.method34994(), class9412.method34994());
                        final double min3 = Math.min(class9411.method34995(), class9412.method34995());
                        final double max = Math.max(class9411.method34993(), class9412.method34993());
                        final double max2 = Math.max(class9411.method34994(), class9412.method34994());
                        final double max3 = Math.max(class9411.method34995(), class9412.method34995());
                        for (int n4 = (int)min; n4 <= max; ++n4) {
                            for (int n5 = (int)min2; n5 <= max2; ++n5) {
                                for (int n6 = (int)min3; n6 <= max3; ++n6) {
                                    if (!method33407(n4, n5, n6, false)) {
                                        n3 = 0;
                                        break Label_0286;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        n3 = 0;
                    }
                }
                if (n3 == 0) {
                    list.add(class9410.method34996(0.5, 0.0, 0.5));
                    class9411 = class9410;
                }
            }
            else {
                if (class9410 != null) {
                    list.add(class9410.method34996(0.5, 0.0, 0.5));
                }
                list.add(class9412.method34996(0.5, 0.0, 0.5));
                class9411 = class9412;
            }
            class9410 = class9412;
            ++n2;
        }
        return list;
    }
    
    public static boolean method33406(final Class9407 class9407, final boolean b) {
        return method33407((int)class9407.method34993(), (int)class9407.method34994(), (int)class9407.method34995(), b);
    }
    
    public static boolean method33407(final int n, final int n2, final int n3, final boolean b) {
        final AxisAlignedBB class6221 = (Class9147.field38775.player.method1920() != null) ? Class9147.field38775.player.method1920().getBoundingBox() : Class9147.field38775.player.getBoundingBox();
        return Class9147.field38775.world.method6981(Class9147.field38775.player, new AxisAlignedBB(n + 0.5f - class6221.getXSize() / 2.0, n2, n3 + 0.5f - class6221.getZSize() / 2.0, n + 0.5f + class6221.getXSize() / 2.0, n2 + class6221.getYSize(), n3 + 0.5f + class6221.getZSize() / 2.0)).count() == 0L;
    }
    
    public Class9035 method33408(final Class9407 class9407) {
        for (final Class9035 class9408 : this.field38771) {
            if (class9408.method32467().method34993() != class9407.method34993()) {
                continue;
            }
            if (class9408.method32467().method34994() != class9407.method34994()) {
                continue;
            }
            if (class9408.method32467().method34995() != class9407.method34995()) {
                continue;
            }
            return class9408;
        }
        for (final Class9035 class9409 : this.field38772) {
            if (class9409.method32467().method34993() != class9407.method34993()) {
                continue;
            }
            if (class9409.method32467().method34994() != class9407.method34994()) {
                continue;
            }
            if (class9409.method32467().method34995() != class9407.method34995()) {
                continue;
            }
            return class9409;
        }
        return null;
    }
    
    public boolean method33409(final Class9035 class9035, final Class9407 e, final double n) {
        final Class9035 method33408 = this.method33408(e);
        double n2 = n;
        if (class9035 != null) {
            n2 += class9035.method32477();
        }
        if (method33408 == null) {
            Label_0157: {
                if (e.method34993() == this.field38769.method34993()) {
                    if (e.method34994() == this.field38769.method34994()) {
                        if (e.method34995() == this.field38769.method34995()) {
                            break Label_0157;
                        }
                    }
                }
                if (this.field38773 == 0.0 || e.method34998(this.field38769) > this.field38773) {
                    final ArrayList list = new ArrayList((Collection<? extends E>)class9035.method32469());
                    list.add(e);
                    this.field38772.add(new Class9035(e, class9035, list, e.method34998(this.field38769), n, n2));
                    return false;
                }
            }
            this.field38770.clear();
            (this.field38770 = class9035.method32469()).add(e);
            return true;
        }
        if (method33408.method32471() > n) {
            final ArrayList list2 = new ArrayList((Collection<? extends E>)class9035.method32469());
            list2.add(e);
            method33408.method32472(e);
            method33408.method32473(class9035);
            method33408.method32474(list2);
            method33408.method32475(e.method34998(this.field38769));
            method33408.method32476(n);
            method33408.method32478(n2);
        }
        return false;
    }
    
    static {
        Class9147.field38775 = Minecraft.method5277();
        Class9147.field38776 = new Class9407[] { new Class9407(1.0, 0.0, 0.0), new Class9407(-1.0, 0.0, 0.0), new Class9407(0.0, 0.0, 1.0), new Class9407(0.0, 0.0, -1.0) };
    }
}
