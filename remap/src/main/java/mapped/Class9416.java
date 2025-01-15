// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class9416
{
    public int field40396;
    public int field40397;
    public int field40398;
    public float field40399;
    public int field40400;
    public Class7799 field40401;
    private static Class869 field40402;
    public Vec3i field40403;
    public Class8797 field40404;
    public Class8733 field40405;
    public Class6973 field40406;
    public int field40407;
    
    public Class9416() {
        this.field40396 = 40;
        this.field40397 = 20;
        this.field40398 = 10000;
        this.field40399 = 0.1f;
        this.field40400 = 150;
        this.field40407 = 0;
    }
    
    public float method35014(final Class8733 class8733, final Class8797 class8734) {
        return class8733.field36684.method30688(class8734);
    }
    
    public List<Class8733> method35015(final Class8733 class8733, final Class6973 class8734) {
        this.field40405 = class8733;
        this.field40404 = class8733.field36684;
        this.field40404.field36992 = class8733;
        final boolean method30693 = this.field40404.method30690(0.0f, 2.0f, 0.0f).method30693();
        final ArrayList list = new ArrayList();
        final Iterator<Class2234> iterator = (class8734.field27264 ? Class2234.method8428() : Class2234.method8429()).iterator();
        final int n = 3;
        final int n2 = 2;
        final int field27269 = class8734.field27269;
        if (!class8734.field27264) {
            while (iterator.hasNext()) {
                final Class2234 class8735 = iterator.next();
                this.field40403 = class8735.field13727;
                final Class8797 method30694 = this.method35016(0.0f, 1);
                final Class8797 method30695 = this.method35016(1.0f, 1);
                final boolean method30696 = this.method35016(0.0f, -1).method30700();
                final Class8797 method30697 = this.method35016(1.0f, 0);
                if (!method30697.method30693()) {
                    if (method30695.method30693()) {
                        if (method30694.method30693()) {
                            if (method30696) {
                                if (!method30697.method30700()) {
                                    continue;
                                }
                                if (this.method35016(1.0f, 1).method30693()) {
                                    list.add(new Class8733(method30695, n, Class2049.field11677));
                                    continue;
                                }
                                continue;
                            }
                        }
                    }
                }
                final Class8797 method30698 = this.method35016(1.0f, -1);
                if (method30698.method30700() && method30697.method30693()) {
                    int n3 = 1;
                    if (this.field40405.field36690 != null) {
                        if (this.field40405.field36690.field36691 == Class2049.field11676) {
                            if (class8735 != this.field40405.field36690.field36692) {
                                n3 = 0;
                            }
                        }
                    }
                    list.add(new Class8733(method30697, n3, Class2049.field11676, class8735));
                }
                else {
                    if (class8734.field27266) {
                        if (method30696) {
                            if (!method30697.method30693()) {
                                if (!method30697.method30698()) {
                                    if (method30698.method30700()) {
                                        list.add(new Class8733(method30697, field27269, Class2049.field11676).method30168(method30697, true));
                                    }
                                }
                            }
                        }
                        final Class8797 method30699 = this.method35016(0.0f, 1);
                        final Class8797 method30700 = this.method35016(0.0f, 2);
                        final Class8797 method30701 = this.method35016(1.0f, 1);
                        final Class8797 method30702 = this.method35016(1.0f, 0);
                        if (method30696) {
                            if (method30702.method30700()) {
                                if (!method30701.method30698()) {
                                    if (!method30699.method30698()) {
                                        list.add(new Class8733(method30701, field27269, Class2049.field11677).method30168(method30701, true).method30168(method30700, false));
                                    }
                                }
                            }
                        }
                    }
                    if (!method30697.method30693()) {
                        continue;
                    }
                    final Class8797 method30703 = this.method35016(1.0f, -2);
                    if (method30698.method30693()) {
                        if (!method30703.method30700()) {
                            if (method30703.method30693()) {
                                if (method30696) {
                                    final Class8797 method30704 = this.method35016(1.0f, -3);
                                    if (!method30704.method30700()) {
                                        if (method30704.method30693()) {
                                            if (method30696) {
                                                if (this.method35016(1.0f, -4).method30700()) {
                                                    list.add(new Class8733(method30704, n2));
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        list.add(new Class8733(method30703, n2));
                                    }
                                }
                            }
                        }
                        else {
                            list.add(new Class8733(method30698, n2));
                        }
                    }
                    final Class8797 method30705 = this.method35016(1.0f, 2);
                    final Class8797 method30706 = this.method35016(2.0f, 2);
                    final Class8797 method30707 = this.method35016(2.0f, 1);
                    final Class8797 method30708 = this.method35016(2.0f, 0);
                    final Class8797 method30709 = this.method35016(2.0f, -1);
                    final Class8797 method30710 = this.method35016(2.0f, -2);
                    boolean b = false;
                    if (method30707.method30693()) {
                        if (method30708.method30693()) {
                            if (method30709.method30693()) {
                                if (method30710.method30700()) {
                                    b = true;
                                    list.add(new Class8733(method30709, n2));
                                }
                            }
                        }
                    }
                    boolean b2 = false;
                    if (method30703.method30693()) {
                        final Class8797 method30711 = this.method35016(2.0f, -3);
                        if (method30708.method30693()) {
                            if (method30709.method30693()) {
                                if (method30710.method30693()) {
                                    if (method30711.method30700()) {
                                        b2 = true;
                                        list.add(new Class8733(method30710, n2));
                                    }
                                }
                            }
                        }
                        final Class8797 method30712 = this.method35016(2.0f, -4);
                        if (method30709.method30693()) {
                            if (method30710.method30693()) {
                                if (method30711.method30693()) {
                                    if (method30712.method30700()) {
                                        list.add(new Class8733(method30711, n2));
                                    }
                                }
                            }
                        }
                    }
                    boolean b3 = false;
                    Label_1183: {
                        if (method30693) {
                            if (method30705.method30693()) {
                                if (method30706.method30693()) {
                                    b3 = true;
                                    break Label_1183;
                                }
                            }
                        }
                        b3 = false;
                    }
                    final boolean b4 = b3;
                    if (b4) {
                        if (method30707.method30693()) {
                            if (method30708.method30700()) {
                                if (method30696) {
                                    list.add(new Class8733(method30707, n, Class2049.field11677));
                                }
                            }
                        }
                    }
                    int n4 = 0;
                    Label_1284: {
                        if (b4) {
                            if (method30708.method30693()) {
                                if (method30707.method30693()) {
                                    n4 = 1;
                                    break Label_1284;
                                }
                            }
                        }
                        n4 = 0;
                    }
                    int n5 = n4;
                    if (n5 != 0) {
                        if (method30709.method30700()) {
                            if (method30696) {
                                list.add(new Class8733(method30708, n, Class2049.field11677));
                                n5 = 0;
                            }
                        }
                    }
                    if (n5 != 0) {
                        if (method30696) {
                            final Class8797 method30713 = this.method35016(3.0f, 1);
                            final Class8797 method30714 = this.method35016(3.0f, 0);
                            final Class8797 method30715 = this.method35016(3.0f, -1);
                            if (method30714.method30700() && method30713.method30693()) {
                                list.add(new Class8733(method30713, n + 2, Class2049.field11678));
                                continue;
                            }
                            if (method30713.method30693()) {
                                if (method30714.method30693()) {
                                    if (method30715.method30700()) {
                                        list.add(new Class8733(method30714, n, Class2049.field11678));
                                        continue;
                                    }
                                }
                            }
                            final Class8797 method30716 = this.method35016(3.0f, -2);
                            if (!b) {
                                if (method30714.method30693()) {
                                    if (method30715.method30693()) {
                                        if (method30716.method30700()) {
                                            list.add(new Class8733(method30715, n, Class2049.field11678));
                                            continue;
                                        }
                                    }
                                }
                            }
                            final Class8797 method30717 = this.method35016(3.0f, -3);
                            if (!b2) {
                                if (method30715.method30693()) {
                                    if (method30716.method30693()) {
                                        if (method30717.method30700()) {
                                            list.add(new Class8733(method30716, n, Class2049.field11678));
                                            continue;
                                        }
                                    }
                                }
                            }
                            final Class8797 method30718 = this.method35016(4.0f, 0);
                            if (this.method35016(4.0f, -1).method30700()) {
                                if (method30718.method30693()) {
                                    list.add(new Class8733(method30718, n + 2, Class2049.field11678));
                                }
                            }
                        }
                    }
                    if (!class8734.field27268) {
                        continue;
                    }
                    if (method30698.method30700()) {
                        continue;
                    }
                    if (!method30697.method30693()) {
                        continue;
                    }
                    list.add(new Class8733(method30697, 20, Class2049.field11679, class8735).method30169(method30698));
                }
            }
            if (class8734.field27266) {
                final Class8797 method30719 = this.method35016(0.0f, -1);
                final Class8797 method30720 = this.method35016(0.0f, -2);
                if (method30719.method30700()) {
                    if (!method30719.method30698()) {
                        if (method30720.method30700()) {
                            list.add(new Class8733(method30719, field27269, Class2049.field11676).method30168(method30719, false));
                        }
                    }
                }
            }
        }
        else {
            while (iterator.hasNext()) {
                this.field40403 = iterator.next().field13727;
                final Class8797 method30721 = this.method35016(1.0f, this.field40403.getY());
                if (!method30721.method30693()) {
                    continue;
                }
                list.add(new Class8733(method30721, Math.abs(this.field40403.getY())));
            }
        }
        return list;
    }
    
    private Class8797 method35016(final float n, final int n2) {
        return this.field40404.method30690(this.field40403.getX() * n, (float)n2, this.field40403.getZ() * n);
    }
    
    public List<Class8733> method35017(final Class6973 field40406) throws Exception {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        this.field40406 = field40406;
        this.field40401 = field40406.field27271;
        field40406.field27270.field36687 = (float)this.field40401.method25202(field40406.field27270.field36684);
        field40406.field27270.field36688 = field40406.field27270.field36687;
        set.add(field40406.field27270);
        this.field40407 = 0;
        Class8733 field40407;
        while (true) {
            field40407 = null;
            if (this.field40407 > field40406.field27263) {
                System.out.println("canceled");
                break;
            }
            if (set.size() == 0) {
                throw new RuntimeException("no route");
            }
            for (final Class8733 class8733 : set) {
                if (field40407 != null && class8733.field36688 >= field40407.field36688) {
                    continue;
                }
                field40407 = class8733;
            }
            if (this.field40401.method25201(field40407.field36684)) {
                break;
            }
            set.remove(field40407);
            set2.add(field40407);
            for (final Class8733 class8734 : this.method35015(field40407, field40406)) {
                if (class8734 != null) {
                    final int field40408 = field40407.field36686 + class8734.field36689;
                    if (field40408 < class8734.field36686) {
                        set.remove(class8734);
                        set2.remove(class8734);
                    }
                    if (set.contains(class8734)) {
                        continue;
                    }
                    if (set2.contains(class8734)) {
                        continue;
                    }
                    class8734.field36686 = field40408;
                    class8734.field36687 = (float)(this.field40401.method25202(class8734.field36684) * 0.75);
                    class8734.field36688 = class8734.field36686 + class8734.field36687;
                    class8734.field36690 = field40407;
                    class8734.field36694.addAll(field40407.field36694);
                    class8734.field36695.addAll(field40407.field36695);
                    set.add(class8734);
                    ++this.field40407;
                }
            }
        }
        final ArrayList list = new ArrayList();
        while (field40407 != null && field40407.field36690 != null) {
            list.add(field40407);
            field40407 = field40407.field36690;
        }
        list.add(field40406.field27270);
        if (!field40406.field27267) {
            return list;
        }
        return method35018(list);
    }
    
    public static List<Class8733> method35018(final List<Class8733> list) {
        int n = 0;
        final int n2 = 6;
        final int n3 = 2;
        Class8733 class8733 = null;
        Class8733 class8734 = null;
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final Class8733 e = list.get(i);
            Class2049 class8735 = Class2049.field11676;
            if (i + 1 < list.size()) {
                class8735 = list.get(i).field36691;
            }
            if (n != 0 && n != list.size() - 1) {
                boolean b = true;
                Label_0754: {
                    Label_0146: {
                        if (class8734.field36691 == e.field36691) {
                            if (class8735 != Class2049.field11676) {
                                if (class8735 != Class2049.field11679) {
                                    if (e.field36691 != Class2049.field11680) {
                                        break Label_0146;
                                    }
                                }
                            }
                            if (e.field36691 == Class2049.field11676 && e.field36684.method30689(class8734.field36684) <= n2 * n2) {
                                final double min = Math.min(class8734.field36684.method30683(), e.field36684.method30683());
                                final double min2 = Math.min(class8734.field36684.method30684(), e.field36684.method30684());
                                final double min3 = Math.min(class8734.field36684.method30685(), e.field36684.method30685());
                                final double max = Math.max(class8734.field36684.method30683(), e.field36684.method30683());
                                final double max2 = Math.max(class8734.field36684.method30684(), e.field36684.method30684());
                                final double max3 = Math.max(class8734.field36684.method30685(), e.field36684.method30685());
                            Label_0427:
                                for (int n4 = (int)min; n4 <= max; ++n4) {
                                    for (int n5 = (int)min2; n5 <= max2; ++n5) {
                                        for (int n6 = (int)min3; n6 <= max3; ++n6) {
                                            if (!new Class8797(n4, n5, n6, e).method30694()) {
                                                b = false;
                                                break Label_0427;
                                            }
                                        }
                                    }
                                }
                                break Label_0754;
                            }
                            if (e.field36691 == Class2049.field11679 || e.field36691 == Class2049.field11680) {
                                if (e.field36684.method30689(class8734.field36684) <= n3 * n3) {
                                    final double min4 = Math.min(class8734.field36684.method30683(), e.field36684.method30683());
                                    final double min5 = Math.min(class8734.field36684.method30684(), e.field36684.method30684());
                                    final double min6 = Math.min(class8734.field36684.method30685(), e.field36684.method30685());
                                    final double max4 = Math.max(class8734.field36684.method30683(), e.field36684.method30683());
                                    final double max5 = Math.max(class8734.field36684.method30684(), e.field36684.method30684());
                                    final double max6 = Math.max(class8734.field36684.method30685(), e.field36684.method30685());
                                Label_0670:
                                    for (int n7 = (int)min4; n7 <= max4; ++n7) {
                                        for (int n8 = (int)min5; n8 <= max5; ++n8) {
                                            for (int n9 = (int)min6; n9 <= max6; ++n9) {
                                                if (!new Class8797(n7, n8, n9, e).method30693()) {
                                                    b = false;
                                                    break Label_0670;
                                                }
                                            }
                                        }
                                    }
                                    break Label_0754;
                                }
                            }
                            b = false;
                            break Label_0754;
                        }
                    }
                    b = false;
                }
                if (!b) {
                    list2.add(class8733);
                    class8734 = class8733;
                }
            }
            else {
                if (class8733 != null) {
                    list2.add(class8733);
                }
                list2.add(e);
                class8734 = e;
            }
            class8733 = e;
            ++n;
        }
        return list2;
    }
    
    public static List<Class8797> method35019(final List<Class8733> list) {
        int n = 0;
        final int n2 = 5;
        Class8797 field36684 = null;
        Class8797 field36685 = null;
        final ArrayList list2 = new ArrayList();
        for (final Class8733 class8733 : list) {
            if (n != 0 && n != list.size() - 1) {
                int n3 = 1;
                Label_0289: {
                    if (class8733.field36684.method30689(field36685) <= n2 * n2) {
                        final double min = Math.min(field36685.method30683(), class8733.field36684.method30683());
                        final double min2 = Math.min(field36685.method30684(), class8733.field36684.method30684());
                        final double min3 = Math.min(field36685.method30685(), class8733.field36684.method30685());
                        final double max = Math.max(field36685.method30683(), class8733.field36684.method30683());
                        final double max2 = Math.max(field36685.method30684(), class8733.field36684.method30684());
                        final double max3 = Math.max(field36685.method30685(), class8733.field36684.method30685());
                        for (int n4 = (int)min; n4 <= max; ++n4) {
                            for (int n5 = (int)min2; n5 <= max2; ++n5) {
                                for (int n6 = (int)min3; n6 <= max3; ++n6) {
                                    if (!Class9147.method33407(n4, n5, n6, false)) {
                                        n3 = 0;
                                        break Label_0289;
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
                    list2.add(field36684.method30679(0.5, 0.0, 0.5));
                    field36685 = field36684;
                }
            }
            else {
                if (field36684 != null) {
                    list2.add(field36684.method30679(0.5, 0.0, 0.5));
                }
                list2.add(class8733.field36684.method30679(0.5, 0.0, 0.5));
                field36685 = class8733.field36684;
            }
            field36684 = class8733.field36684;
            ++n;
        }
        return list2;
    }
    
    static {
        Class9416.field40402 = Class869.method5277();
    }
}
