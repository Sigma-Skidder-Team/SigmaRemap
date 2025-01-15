// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4854 extends Class4841
{
    private List<String> field20797;
    private Class4817 field20798;
    private Class4831 field20799;
    private boolean field20800;
    
    public Class4854(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean field20800, final String... array) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20797 = new ArrayList<String>();
        this.field20800 = field20800;
        this.method14239(this.field20799 = new Class4831(this, "textbox", 0, 0, n3, 32, Class4831.field20670, "", "Search...", Class9400.field40311));
        this.field20799.method14317(Class9400.field40312);
        this.field20799.method14473(class4831 -> this.method14560(this.field20799.method14314()));
        this.method14562(array);
        this.method14560("");
    }
    
    public void method14560(final String s) {
        this.method14225(() -> {
            if (this.field20798 != null) {
                this.method14245(this.field20798);
            }
            final Class4817 field20798 = new Class4817(this, "scrollview", 0, 40, this.field20480, this.field20481 - 40);
            this.method14239(this.field20798 = field20798);
            final ArrayList list = new ArrayList();
            Class90.field211.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
            new Class4036(Class7521.field29341, new Class8959().method31786(Class7207.field27997));
            final Class4036 class4036;
            final Object o;
            ((List<Class4036>)o).add(class4036);
            new Class4036(Class7521.field29401, new Class8959().method31786(Class7207.field27997));
            final Class4036 class4037;
            final Object o2;
            ((List<Class4036>)o2).add(class4037);
            method14561(list, s2).iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final Class3820 class4038 = iterator2.next();
                if (class4038 != Class7739.field30754) {
                    if (this.field20800 && !(class4038 instanceof Class4036)) {
                        continue;
                    }
                    else {
                        Class90.field211.method503(class4038);
                        final Class1932 class4039;
                        String str;
                        if (class4038 instanceof Class4036 && class4039.method7797().equals("air")) {
                            str = Class90.field208.method503(((Class4036)class4038).method12240()).toString();
                        }
                        else {
                            str = class4039.toString();
                        }
                        final Class4817 field20799 = this.field20798;
                        final int n;
                        new Class4902(this, "btn" + str, 0, 0, n, n, class4038.method11741());
                        final Class4803 class4040;
                        field20799.method14239(class4040);
                        final Class4902 class4041;
                        class4041.method14725(this.field20797.contains(str), false);
                        class4041.method14516(class4903 -> {
                            final int size = this.field20797.size();
                            this.field20797.remove(str);
                            if (class4041.method14723()) {
                                this.field20797.add(str);
                            }
                            if (size != this.field20797.size()) {
                                this.method14517();
                            }
                        });
                    }
                }
            }
            this.field20798.method14396().method14255(new Class6801(0));
        });
    }
    
    public static List<Class3820> method14561(final List<Class3820> list, String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.length() != 0) {
            final ArrayList list2 = new ArrayList();
            final Iterator<Class3820> iterator = list.iterator();
            while (iterator.hasNext()) {
                final Class3820 class3820 = iterator.next();
                if (!class3820.method11715().getString().toLowerCase().startsWith(lowerCase.toLowerCase())) {
                    continue;
                }
                list2.add(class3820);
                iterator.remove();
            }
            final Iterator<Class3820> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final Class3820 class3821 = iterator2.next();
                if (!class3821.method11715().getString().toLowerCase().contains(lowerCase.toLowerCase())) {
                    continue;
                }
                list2.add(class3821);
                iterator2.remove();
            }
            list2.addAll(list);
            return list2;
        }
        return list;
    }
    
    @Override
    public void method14205(final float n) {
        super.method14205(n);
    }
    
    public void method14562(final String... a) {
        this.field20797.clear();
        this.field20797.addAll(Arrays.asList(a));
    }
    
    public List<String> method14563() {
        return this.field20797;
    }
}
