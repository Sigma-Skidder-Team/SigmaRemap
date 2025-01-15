// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class3206 extends Class3167
{
    public static final Class9572 field15637;
    public Class9572 field15638;
    private Class9572 field15639;
    private List<Class8013> field15640;
    private int field15641;
    private static List<Class8221> field15642;
    
    public Class3206() {
        super(Class8013.field32991, "TabGUI", "Manage mods without opening the ClickGUI");
        this.field15638 = new Class9572(500, 0, Class2186.field12965);
        this.field15639 = new Class9572(300, 300, Class2186.field12965);
        this.field15640 = new ArrayList<Class8013>();
        this.field15641 = 0;
    }
    
    @Override
    public void method9917() {
        this.field15640.add(Class8013.field32986);
        this.field15640.add(Class8013.field32985);
        this.field15640.add(Class8013.field32990);
        this.field15640.add(Class8013.field32984);
        this.field15640.add(Class8013.field32987);
        this.field15640.add(Class8013.field32988);
        final ArrayList list = new ArrayList();
        final Iterator<Class8013> iterator = this.field15640.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().method26228());
        }
        Class3206.field15642.add(0, new Class8222(list, 0));
    }
    
    @Class6753
    private void method10063(final Class5752 class5752) {
        if (!this.method9906()) {
            return;
        }
        final Class2164 method10069 = method10069(class5752.method17061());
        if (method10069 == null) {
            return;
        }
        Class3206.field15637.method35855(Class2186.field12964);
        this.field15641 = 80;
        final int method10070 = this.method10076();
        final Class8221 class5753 = Class3206.field15642.get(method10070 - 1);
        if (method10069 != Class2164.field12876 && ((!this.method10078() && method10069 != Class2164.field12874) || method10070 != 3)) {
            this.field15638 = new Class9572(500, 200, Class2186.field12965);
        }
        switch (Class8971.field37805[method10069.ordinal()]) {
            case 1: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10077(false);
                    break;
                }
                if (method10070 > 1) {
                    if (Class3206.field15642.get(Class3206.field15642.size() - 1).method27237()) {
                        Class3206.field15642.remove(Class3206.field15642.size() - 1);
                    }
                    class5753.method27236();
                    break;
                }
                break;
            }
            case 2: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10064(true);
                    break;
                }
                if (class5753 instanceof Class8222) {
                    ((Class8222)class5753).method27245();
                    break;
                }
                break;
            }
            case 3: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10064(false);
                    break;
                }
                if (class5753 instanceof Class8222) {
                    ((Class8222)class5753).method27244();
                    break;
                }
                break;
            }
            case 4: {
                if (method10070 == 1) {
                    this.method10071(this.field15640.get(((Class8222)class5753).field33778));
                    break;
                }
                if (method10070 == 2 && class5753 instanceof Class8222) {
                    this.method10072(Class9463.method35173().method35189().method21554(this.field15640.get(Class3206.field15642.get(0).field33778)).get(((Class8222)class5753).field33778));
                    break;
                }
                if (method10070 == 3) {
                    this.method10077(true);
                    break;
                }
                break;
            }
            case 5: {
                if (method10070 == 2 && class5753 instanceof Class8222) {
                    final Class3167 class5754 = Class9463.method35173().method35189().method21554(this.field15640.get(Class3206.field15642.get(0).field33778)).get(((Class8222)class5753).field33778);
                    class5754.method9909(!class5754.method9906());
                    break;
                }
                break;
            }
        }
    }
    
    private void method10064(final boolean b) {
        final Class8222 class8222 = Class3206.field15642.get(0);
        final Class8222 class8223 = Class3206.field15642.get(1);
        final Class8222 class8224 = Class3206.field15642.get(2);
        final Class3167 class8225 = Class9463.method35173().method35189().method21554(this.field15640.get(class8222.field33778)).get(class8223.field33778);
        final Class4997 class8226 = this.method10075(class8225).get(class8224.field33778);
        if (!(class8226 instanceof Class5001)) {
            if (!(class8226 instanceof Class4999)) {
                if (class8226 instanceof Class4996) {
                    final Class4996 class8227 = (Class4996)class8226;
                    if (class8227.method15198() instanceof Float) {
                        final Float n = (Float)class8227.method15198();
                        Float n2;
                        if (b) {
                            n2 = n - class8227.method15191();
                        }
                        else {
                            n2 = n + class8227.method15191();
                        }
                        class8227.method15199(Math.min(Math.max(n2, class8227.method15187()), class8227.method15189()));
                    }
                }
            }
            else {
                final Class4999 class8228 = (Class4999)class8226;
                class8228.method15199(!class8228.method15208());
            }
        }
        else {
            final Class5001 class8229 = (Class5001)class8226;
            int method15213 = class8229.method15213();
            if (!b) {
                --method15213;
            }
            else {
                ++method15213;
            }
            if (method15213 > class8229.method15215().size() - 1) {
                method15213 = 0;
            }
            if (method15213 < 0) {
                method15213 = class8229.method15215().size() - 1;
            }
            class8229.method15214(method15213);
        }
        class8224.method27242(this.method10074(class8225));
    }
    
    @Class6753
    private void method10065(final Class5743 class5743) {
        if (this.method9906()) {
            if (this.field15641 <= 0) {
                Class3206.field15637.method35855(Class2186.field12965);
                this.field15638.method35855(Class2186.field12965);
            }
            else {
                --this.field15641;
            }
        }
    }
    
    @Class6753
    @Class6763
    private void method10066(final Class5740 class5740) {
        if (!this.method9906() || Class3206.field15514.field4684 == null) {
            return;
        }
        if (Class869.method5277().field4648.field23466) {
            return;
        }
        if (!Class869.method5277().field4648.field23464) {
            this.method10067();
            final Iterator<Class8221> iterator = Class3206.field15642.iterator();
            while (iterator.hasNext()) {
                iterator.next().method27240((float)(0.5 + Class3206.field15637.method35858() * 0.5));
            }
            this.method10068((float)(0.5 + Class3206.field15637.method35858() * 0.5));
            Class8154.method26874(12.0f, 30.0f, 90.0f, 1.0f, Class265.field1278.field1292);
        }
    }
    
    private void method10067() {
        if (Class3206.field15642.size() >= 2) {
            final Class8222 class8222 = Class3206.field15642.get(1);
            final Class8013 class8223 = this.field15640.get(Class3206.field15642.get(0).field33778);
            int n = 0;
            for (final Class3167 class8224 : Class9463.method35173().method35189().method21554(class8223)) {
                class8222.method27241(n++, (class8224.method9906() ? "" : "§7") + class8224.method9900());
            }
        }
    }
    
    private void method10068(final float n) {
        final int method10076 = this.method10076();
        if (method10076 == 2 || method10076 == 3) {
            final Class8222 class8222 = Class3206.field15642.get(0);
            final Class8222 class8223 = Class3206.field15642.get(1);
            final Class8222 class8224 = (method10076 != 3) ? null : Class3206.field15642.get(2);
            Class8222 class8225 = class8223;
            if (class8224 != null) {
                class8225 = class8224;
            }
            if (class8225.method27246()) {
                if (Class3206.field15637.method35857() == Class2186.field12964) {
                    if (this.method10076() == Class3206.field15642.size()) {
                        this.field15638.method35855(Class2186.field12964);
                    }
                    else if (Class3206.field15642.get(Class3206.field15642.size() - 1).method27238()) {
                        this.field15638.method35855(Class2186.field12964);
                    }
                }
            }
            final Class3167 class8226 = Class9463.method35173().method35189().method21554(this.field15640.get(class8222.field33778)).get(class8223.field33778);
            String s = class8226.method9902();
            if (method10076 == 3) {
                s = this.method10075(class8226).get(class8224.field33778).method15205();
            }
            float method10077 = Class8468.method28270(this.field15639.method35858(), 0.0f, 1.0f, 1.0f) * Class3206.field15637.method35858();
            if (this.field15639.method35857() == Class2186.field12965) {
                method10077 = Class8468.method28269(this.field15639.method35858(), 0.0f, 1.0f, 1.0f);
            }
            final float n2 = class8225.method27234() + (float)class8225.method27233() + 14.0f * method10077;
            final float n3 = class8225.method27235() + 16.0f;
            class8225.getClass();
            Class8154.method26885(n2, n3 + 25 * class8225.field33778, 24.0f * method10077, Class6430.method19118(Class265.field1273.field1292, n * 0.6f), Class6430.method19118(Class265.field1273.field1292, n * 0.6f));
            final int n4 = class8225.method27234() + class8225.method27233() + 4 + Math.round(method10077 * 28.0f);
            final int method10078 = class8225.method27235();
            class8225.getClass();
            final int n5 = method10078 + 25 * class8225.field33778 + 4;
            final int n6 = class8225.field33770.method23505(s) + 8;
            final float method10079 = Class8468.method28270(this.field15638.method35858(), 0.0f, 1.0f, 1.0f);
            final float n7 = (float)n4;
            final float n8 = (float)n5;
            final float n9 = n6 * method10079;
            class8225.getClass();
            Class8154.method26874(n7, n8, n9, 25.0f, Class6430.method19118(Class265.field1273.field1292, n * 0.6f));
            final float n10 = (float)n4;
            final float n11 = (float)n5;
            final float n12 = n6 * method10079;
            class8225.getClass();
            Class8154.method26869(n10, n11, n12, 25.0f);
            Class8154.method26889(class8225.field33770, (float)(n4 + 4), (float)(n5 + 2), s, Class6430.method19118(Class265.field1278.field1292, Math.min(1.0f, n * 1.7f)));
            Class8154.method26872();
        }
    }
    
    public static Class2164 method10069(final int n) {
        switch (n) {
            case 264: {
                return Class2164.field12878;
            }
            case 265: {
                return Class2164.field12877;
            }
            case 257: {
                return Class2164.field12876;
            }
            case 263: {
                return Class2164.field12875;
            }
            case 262: {
                return Class2164.field12874;
            }
            default: {
                return null;
            }
        }
    }
    
    public static int method10070(final int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 += Class3206.field15642.get(i).method27233();
        }
        return 4 + n2 + 5 * n;
    }
    
    public void method10071(final Class8013 class8013) {
        final ArrayList list = new ArrayList();
        final Iterator<Class3167> iterator = Class9463.method35173().method35189().method21554(class8013).iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().method9900());
        }
        this.method10073(1);
        Class3206.field15642.add(1, new Class8222(list, 1));
    }
    
    public void method10072(final Class3167 class3167) {
        final List<String> method10074 = this.method10074(class3167);
        if (method10074.size() != 0) {
            this.method10073(2);
            Class3206.field15642.add(2, new Class8222(method10074, 2));
        }
    }
    
    public void method10073(final int n) {
        final Iterator<Class8221> iterator = Class3206.field15642.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().field33771 < n) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Override
    public void method9897() {
        Class3206.field15637.method35855(Class2186.field12965);
        this.field15641 = 0;
    }
    
    @Override
    public void method9879() {
        Class3206.field15637.method35855(Class2186.field12964);
        this.field15641 = 40;
    }
    
    public List<String> method10074(final Class3167 class3167) {
        final ArrayList list = new ArrayList();
        for (final Class4997 class3168 : this.method10075(class3167)) {
            list.add(class3168.method15204() + " " + class3168.method15198());
        }
        return list;
    }
    
    public List<Class4997> method10075(final Class3167 class3167) {
        final ArrayList list = new ArrayList((Collection<? extends E>)class3167.method9899().values());
        if (class3167 instanceof Class3247) {
            final Class3247 class3168 = (Class3247)class3167;
            class3168.method10258();
            if (class3168.method10260() != null) {
                list.addAll(class3168.method10260().method9899().values());
            }
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((Class4997)iterator.next()).method15204().equals("Keybind")) {
                continue;
            }
            iterator.remove();
        }
        return list;
    }
    
    private int method10076() {
        final Class8221 class8221 = Class3206.field15642.get(Class3206.field15642.size() - 1);
        int size = Class3206.field15642.size();
        if (class8221.method27237()) {
            --size;
        }
        return size;
    }
    
    private void method10077(final boolean b) {
        this.field15639.method35855(b ? Class2186.field12964 : Class2186.field12965);
    }
    
    private boolean method10078() {
        return this.field15639.method35857() == Class2186.field12964;
    }
    
    static {
        field15637 = new Class9572(200, 200, Class2186.field12965);
        Class3206.field15642 = new ArrayList<Class8221>();
    }
}
