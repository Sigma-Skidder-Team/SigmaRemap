// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Class8385
{
    private static String[] field34367;
    private Class8422 field34368;
    private Class8422 field34369;
    private ArrayList<Class8903> field34370;
    private ArrayList<Class8903> field34371;
    private ArrayList<Class8903> field34372;
    private double field34373;
    private boolean field34374;
    private static Class869 field34375;
    private static Class8422[] field34376;
    
    public Class8385(final Class8422 class8422, final Class8422 class8423) {
        this.field34370 = new ArrayList<Class8903>();
        this.field34371 = new ArrayList<Class8903>();
        this.field34372 = new ArrayList<Class8903>();
        this.field34373 = 9.0;
        this.field34374 = true;
        this.field34368 = class8422.method28115(0.0, 0.0, 0.0).method28116();
        this.field34369 = class8423.method28115(0.0, 0.0, 0.0).method28116();
    }
    
    public ArrayList<Class8903> method27942() {
        return this.field34370;
    }
    
    public void method27943() {
        this.method27944(2000, 4);
    }
    
    public void method27944(final int n, final int n2) {
        this.field34370.clear();
        this.field34372.clear();
        final ArrayList list = new ArrayList();
        list.add(this.field34368);
        this.field34372.add(new Class8903(this.field34368, null, list, this.field34368.method28118(this.field34369), Class2239.field13763, 0.0, 0.0));
    Label_0080:
        for (int i = 0; i < n; ++i) {
            Collections.sort(this.field34372, new Class4441(this));
            int n3 = 0;
            if (this.field34372.size() == 0) {
                break;
            }
            for (final Class8903 class8903 : new ArrayList(this.field34372)) {
                if (++n3 > n2) {
                    break;
                }
                this.field34372.remove(class8903);
                this.field34371.add(class8903);
                for (final Class8422 class8904 : Class8385.field34376) {
                    final Class2239 method27949 = this.method27949(class8903, class8904, false);
                    if (this.method27949(class8903, class8904, false) != Class2239.field13762 && this.method27954(class8903, class8904, method27949, (method27949 != Class2239.field13764) ? 0.0 : 1.0)) {
                        break Label_0080;
                    }
                }
            }
        }
        if (this.field34374) {
            Collections.sort(this.field34371, new Class4441(this));
            this.field34370 = this.method27945();
        }
    }
    
    public ArrayList<Class8903> method27945() {
        Collections.sort(this.field34371, new Class4441(this));
        Class8903 method31354 = this.field34371.get(0);
        final ArrayList list = new ArrayList();
        while (method31354.method31354() != null) {
            list.add(method31354);
            method31354 = method31354.method31354();
        }
        return list;
    }
    
    public static ArrayList<Class8903> method27946(final Class8422 class8422, final Class8422 class8423) {
        final Class8385 class8424 = new Class8385(class8422, class8423);
        class8424.method27943();
        return class8424.method27942();
    }
    
    public boolean method27947(final BlockPos class354) {
        for (final Class8422 class355 : Class8385.field34376) {
            final Class7096 method6701 = Class8385.field34375.field4683.method6701(class354.add(class355.field34567, class355.field34568, class355.field34569));
            if (method6701.method21696() == Class7521.field29173 || method6701.method21696() == Class7521.field29174) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method27948(final int n, final int n2, final int n3) {
        final BlockPos class354 = new BlockPos(n, n2, n3);
        return Class8385.field34375.field4683.method6701(new BlockPos(n, n2 - 1, n3)).method21696() != Class7521.field29147 && (!this.method27947(class354) && !this.method27947(class354.method1137()));
    }
    
    public Class2239 method27949(final Class8903 class8903, final Class8422 class8904, final boolean b) {
        final Class8422 method28116 = class8903.method31353().method28119(class8904).method28116();
        if (method27952((int)method28116.method28112(), (int)method28116.method28113(), (int)method28116.method28114())) {
            if (class8903.method31354().method31352() == Class2239.field13763) {
                if (this.method27948((int)method28116.method28112(), (int)method28116.method28113(), (int)method28116.method28114())) {
                    return Class2239.field13765;
                }
            }
        }
        else {
            if (this.method27950(method28116)) {
                return Class2239.field13763;
            }
            if (this.method27951(class8903)) {
                if (class8904.field34568 <= 0.0 || this.method27950(class8903.method31353())) {
                    return Class2239.field13764;
                }
            }
        }
        return Class2239.field13762;
    }
    
    public boolean method27950(final Class8422 class8422) {
        return Class8385.field34375.field4683.method6701(new BlockPos((int)class8422.method28112(), (int)class8422.method28113() - 1, (int)class8422.method28114())).method21696() != Class7521.field29147;
    }
    
    public boolean method27951(Class8903 method31354) {
        for (int i = 0; i < 2; ++i) {
            if (method31354.method31354() == null || method31354.method31354().method31352() == Class2239.field13763) {
                return true;
            }
            method31354 = method31354.method31354();
        }
        return false;
    }
    
    public static boolean method27952(final int n, final int n2, final int n3) {
        return Class8385.field34375.field4683.method6701(new BlockPos(n, n2 + 1, n3)).method21696() != Class7521.field29147 || Class8385.field34375.field4683.method6701(new BlockPos(n, n2, n3)).method21696() != Class7521.field29147;
    }
    
    public Class8903 method27953(final Class8422 class8422, final Class2239 class8423) {
        for (final Class8903 class8424 : this.field34371) {
            if (class8424.method31353().method28112() != class8422.method28112()) {
                continue;
            }
            if (class8424.method31353().method28113() != class8422.method28113()) {
                continue;
            }
            if (class8424.method31353().method28114() != class8422.method28114()) {
                continue;
            }
            if (class8424.method31352() != class8423) {
                continue;
            }
            return class8424;
        }
        for (final Class8903 class8425 : this.field34372) {
            if (class8425.method31353().method28112() != class8422.method28112()) {
                continue;
            }
            if (class8425.method31353().method28113() != class8422.method28113()) {
                continue;
            }
            if (class8425.method31353().method28114() != class8422.method28114()) {
                continue;
            }
            if (class8425.method31352() != class8423) {
                continue;
            }
            return class8425;
        }
        return null;
    }
    
    public boolean method27954(final Class8903 class8903, final Class8422 class8904, final Class2239 class8905, final double n) {
        final Class8422 method28116 = class8903.method31353().method28119(class8904).method28116();
        final Class8903 method28117 = this.method27953(method28116, class8905);
        double n2 = n;
        if (class8903 != null) {
            n2 += class8903.method31363();
        }
        if (method28117 == null || method28117.method31352() == Class2239.field13764) {
            if (method28116.method28112() == this.field34369.method28112()) {
                if (method28116.method28113() == this.field34369.method28113()) {
                    if (method28116.method28114() == this.field34369.method28114()) {
                        return true;
                    }
                }
            }
            if (this.field34373 == 0.0 || method28116.method28118(this.field34369) > this.field34373) {
                final ArrayList list = new ArrayList((Collection<? extends E>)class8903.method31355());
                list.add(method28116);
                this.field34372.add(new Class8903(method28116, class8903, list, method28116.method28118(this.field34369), class8905, n, n2));
                return false;
            }
            return true;
        }
        if (method28117.method31357() > n) {
            final ArrayList list2 = new ArrayList((Collection<? extends E>)class8903.method31355());
            list2.add(method28116);
            method28117.method31358(method28116);
            method28117.method31359(class8903);
            method28117.method31360(list2);
            method28117.method31361(method28116.method28118(this.field34369));
            method28117.method31362(n);
            method28117.method31364(n2);
        }
        return false;
    }
    
    static {
        Class8385.field34375 = Class869.method5277();
        Class8385.field34376 = new Class8422[] { new Class8422(1.0, 0.0, 0.0), new Class8422(-1.0, 0.0, 0.0), new Class8422(0.0, 0.0, 1.0), new Class8422(0.0, 0.0, -1.0), new Class8422(0.0, -1.0, 0.0), new Class8422(0.0, 1.0, 0.0) };
    }
}
