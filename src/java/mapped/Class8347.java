// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Random;

public class Class8347
{
    private static String[] field34257;
    private final Random field34258;
    private final Class8398 field34259;
    private final Class8398 field34260;
    private final Class8398[] field34261;
    private final int field34262;
    private final int field34263;
    
    public Class8347(final Random field34258) {
        this.field34258 = field34258;
        this.field34262 = 7;
        this.field34263 = 4;
        (this.field34259 = new Class8398(11, 11, 5)).method28002(this.field34262, this.field34263, this.field34262 + 1, this.field34263 + 1, 3);
        this.field34259.method28002(this.field34262 - 1, this.field34263, this.field34262 - 1, this.field34263 + 1, 2);
        this.field34259.method28002(this.field34262 + 2, this.field34263 - 2, this.field34262 + 3, this.field34263 + 3, 5);
        this.field34259.method28002(this.field34262 + 1, this.field34263 - 2, this.field34262 + 1, this.field34263 - 1, 1);
        this.field34259.method28002(this.field34262 + 1, this.field34263 + 2, this.field34262 + 1, this.field34263 + 3, 1);
        this.field34259.method28001(this.field34262 - 1, this.field34263 - 1, 1);
        this.field34259.method28001(this.field34262 - 1, this.field34263 + 2, 1);
        this.field34259.method28002(0, 0, 11, 1, 5);
        this.field34259.method28002(0, 9, 11, 11, 5);
        this.method27818(this.field34259, this.field34262, this.field34263 - 2, Class179.field515, 6);
        this.method27818(this.field34259, this.field34262, this.field34263 + 3, Class179.field515, 6);
        this.method27818(this.field34259, this.field34262 - 2, this.field34263 - 1, Class179.field515, 3);
        this.method27818(this.field34259, this.field34262 - 2, this.field34263 + 2, Class179.field515, 3);
        while (this.method27819(this.field34259)) {}
        (this.field34261 = new Class8398[3])[0] = new Class8398(11, 11, 5);
        this.field34261[1] = new Class8398(11, 11, 5);
        this.field34261[2] = new Class8398(11, 11, 5);
        this.method27821(this.field34259, this.field34261[0]);
        this.method27821(this.field34259, this.field34261[1]);
        this.field34261[0].method28002(this.field34262 + 1, this.field34263, this.field34262 + 1, this.field34263 + 1, 8388608);
        this.field34261[1].method28002(this.field34262 + 1, this.field34263, this.field34262 + 1, this.field34263 + 1, 8388608);
        this.field34260 = new Class8398(Class8398.method28006(this.field34259), Class8398.method28007(this.field34259), 5);
        this.method27820();
        this.method27821(this.field34260, this.field34261[2]);
    }
    
    public static boolean method27815(final Class8398 class8398, final int n, final int n2) {
        final int method28003 = class8398.method28003(n, n2);
        if (method28003 != 1) {
            if (method28003 != 2) {
                if (method28003 != 3) {
                    if (method28003 != 4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean method27816(final Class8398 class8398, final int n, final int n2, final int n3, final int n4) {
        return (this.field34261[n3].method28003(n, n2) & 0xFFFF) == n4;
    }
    
    @Nullable
    public Class179 method27817(final Class8398 class8398, final int n, final int n2, final int n3, final int n4) {
        for (final Class179 class8399 : Class98.field268) {
            if (!this.method27816(class8398, n + class8399.method785(), n2 + class8399.method787(), n3, n4)) {
                continue;
            }
            return class8399;
        }
        return null;
    }
    
    private void method27818(final Class8398 class8398, final int n, final int n2, final Class179 class8399, final int n3) {
        if (n3 > 0) {
            class8398.method28001(n, n2, 1);
            class8398.method28004(n + class8399.method785(), n2 + class8399.method787(), 0, 1);
            for (int i = 0; i < 8; ++i) {
                final Class179 method793 = Class179.method793(this.field34258.nextInt(4));
                if (method793 != class8399.method782()) {
                    if (method793 != Class179.field516 || !this.field34258.nextBoolean()) {
                        final int n4 = n + class8399.method785();
                        final int n5 = n2 + class8399.method787();
                        if (class8398.method28003(n4 + method793.method785(), n5 + method793.method787()) == 0) {
                            if (class8398.method28003(n4 + method793.method785() * 2, n5 + method793.method787() * 2) == 0) {
                                this.method27818(class8398, n + class8399.method785() + method793.method785(), n2 + class8399.method787() + method793.method787(), method793, n3 - 1);
                                break;
                            }
                        }
                    }
                }
            }
            final Class179 method794 = class8399.method783();
            final Class179 method795 = class8399.method784();
            class8398.method28004(n + method794.method785(), n2 + method794.method787(), 0, 2);
            class8398.method28004(n + method795.method785(), n2 + method795.method787(), 0, 2);
            class8398.method28004(n + class8399.method785() + method794.method785(), n2 + class8399.method787() + method794.method787(), 0, 2);
            class8398.method28004(n + class8399.method785() + method795.method785(), n2 + class8399.method787() + method795.method787(), 0, 2);
            class8398.method28004(n + class8399.method785() * 2, n2 + class8399.method787() * 2, 0, 2);
            class8398.method28004(n + method794.method785() * 2, n2 + method794.method787() * 2, 0, 2);
            class8398.method28004(n + method795.method785() * 2, n2 + method795.method787() * 2, 0, 2);
        }
    }
    
    private boolean method27819(final Class8398 class8398) {
        boolean b = false;
        for (int i = 0; i < Class8398.method28007(class8398); ++i) {
            for (int j = 0; j < Class8398.method28006(class8398); ++j) {
                if (class8398.method28003(j, i) == 0) {
                    final int n = 0 + (method27815(class8398, j + 1, i) ? 1 : 0) + (method27815(class8398, j - 1, i) ? 1 : 0) + (method27815(class8398, j, i + 1) ? 1 : 0) + (method27815(class8398, j, i - 1) ? 1 : 0);
                    if (n < 3) {
                        if (n == 2) {
                            if (0 + (method27815(class8398, j + 1, i + 1) ? 1 : 0) + (method27815(class8398, j - 1, i + 1) ? 1 : 0) + (method27815(class8398, j + 1, i - 1) ? 1 : 0) + (method27815(class8398, j - 1, i - 1) ? 1 : 0) <= 1) {
                                class8398.method28001(j, i, 2);
                                b = true;
                            }
                        }
                    }
                    else {
                        class8398.method28001(j, i, 2);
                        b = true;
                    }
                }
            }
        }
        return b;
    }
    
    private void method27820() {
        final ArrayList arrayList = Lists.newArrayList();
        final Class8398 class8398 = this.field34261[1];
        for (int i = 0; i < Class8398.method28007(this.field34260); ++i) {
            for (int j = 0; j < Class8398.method28006(this.field34260); ++j) {
                final int method28003 = class8398.method28003(j, i);
                if ((method28003 & 0xF0000) == 0x20000) {
                    if ((method28003 & 0x200000) == 0x200000) {
                        arrayList.add(new Class8554(j, i));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            final Class8554 class8399 = (Class8554)arrayList.get(this.field34258.nextInt(arrayList.size()));
            final int method28004 = class8398.method28003(class8399.method28745(), class8399.method28746());
            class8398.method28001(class8399.method28745(), class8399.method28746(), method28004 | 0x400000);
            final Class179 method28005 = this.method27817(this.field34259, class8399.method28745(), class8399.method28746(), 1, method28004 & 0xFFFF);
            final int n = class8399.method28745() + method28005.method785();
            final int n2 = class8399.method28746() + method28005.method787();
            for (int k = 0; k < Class8398.method28007(this.field34260); ++k) {
                for (int l = 0; l < Class8398.method28006(this.field34260); ++l) {
                    if (method27815(this.field34259, l, k)) {
                        if (l == class8399.method28745() && k == class8399.method28746()) {
                            this.field34260.method28001(l, k, 3);
                        }
                        else if (l == n) {
                            if (k == n2) {
                                this.field34260.method28001(l, k, 3);
                                this.field34261[2].method28001(l, k, 8388608);
                            }
                        }
                    }
                    else {
                        this.field34260.method28001(l, k, 5);
                    }
                }
            }
            final ArrayList arrayList2 = Lists.newArrayList();
            for (final Class179 class8400 : Class98.field268) {
                if (this.field34260.method28003(n + class8400.method785(), n2 + class8400.method787()) != 0) {
                    continue;
                }
                arrayList2.add(class8400);
            }
            if (!arrayList2.isEmpty()) {
                final Class179 class8401 = (Class179)arrayList2.get(this.field34258.nextInt(arrayList2.size()));
                this.method27818(this.field34260, n + class8401.method785(), n2 + class8401.method787(), class8401, 4);
                while (this.method27819(this.field34260)) {}
            }
            else {
                this.field34260.method28002(0, 0, Class8398.method28006(this.field34260), Class8398.method28007(this.field34260), 5);
                class8398.method28001(class8399.method28745(), class8399.method28746(), method28004);
            }
        }
        else {
            this.field34260.method28002(0, 0, Class8398.method28006(this.field34260), Class8398.method28007(this.field34260), 5);
        }
    }
    
    private void method27821(final Class8398 class8398, final Class8398 class8399) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < Class8398.method28007(class8398); ++i) {
            for (int j = 0; j < Class8398.method28006(class8398); ++j) {
                if (class8398.method28003(j, i) == 2) {
                    arrayList.add(new Class8554(j, i));
                }
            }
        }
        Collections.shuffle(arrayList, this.field34258);
        int n = 10;
        for (final Class8554 class8400 : arrayList) {
            final int intValue = (int)class8400.method28745();
            final int intValue2 = (int)class8400.method28746();
            if (class8399.method28003(intValue, intValue2) != 0) {
                continue;
            }
            int n2 = intValue;
            int n3 = intValue;
            int n4 = intValue2;
            int n5 = intValue2;
            int n6 = 65536;
            Label_0286: {
                if (class8399.method28003(intValue + 1, intValue2) == 0) {
                    if (class8399.method28003(intValue, intValue2 + 1) == 0) {
                        if (class8399.method28003(intValue + 1, intValue2 + 1) == 0) {
                            if (class8398.method28003(intValue + 1, intValue2) == 2) {
                                if (class8398.method28003(intValue, intValue2 + 1) == 2) {
                                    if (class8398.method28003(intValue + 1, intValue2 + 1) == 2) {
                                        n3 = intValue + 1;
                                        n5 = intValue2 + 1;
                                        n6 = 262144;
                                        break Label_0286;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class8399.method28003(intValue - 1, intValue2) == 0) {
                    if (class8399.method28003(intValue, intValue2 + 1) == 0) {
                        if (class8399.method28003(intValue - 1, intValue2 + 1) == 0) {
                            if (class8398.method28003(intValue - 1, intValue2) == 2) {
                                if (class8398.method28003(intValue, intValue2 + 1) == 2) {
                                    if (class8398.method28003(intValue - 1, intValue2 + 1) == 2) {
                                        n2 = intValue - 1;
                                        n5 = intValue2 + 1;
                                        n6 = 262144;
                                        break Label_0286;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class8399.method28003(intValue - 1, intValue2) == 0) {
                    if (class8399.method28003(intValue, intValue2 - 1) == 0) {
                        if (class8399.method28003(intValue - 1, intValue2 - 1) == 0) {
                            if (class8398.method28003(intValue - 1, intValue2) == 2) {
                                if (class8398.method28003(intValue, intValue2 - 1) == 2) {
                                    if (class8398.method28003(intValue - 1, intValue2 - 1) == 2) {
                                        n2 = intValue - 1;
                                        n4 = intValue2 - 1;
                                        n6 = 262144;
                                        break Label_0286;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class8399.method28003(intValue + 1, intValue2) == 0 && class8398.method28003(intValue + 1, intValue2) == 2) {
                    n3 = intValue + 1;
                    n6 = 131072;
                }
                else if (class8399.method28003(intValue, intValue2 + 1) == 0 && class8398.method28003(intValue, intValue2 + 1) == 2) {
                    n5 = intValue2 + 1;
                    n6 = 131072;
                }
                else if (class8399.method28003(intValue - 1, intValue2) == 0 && class8398.method28003(intValue - 1, intValue2) == 2) {
                    n2 = intValue - 1;
                    n6 = 131072;
                }
                else if (class8399.method28003(intValue, intValue2 - 1) == 0) {
                    if (class8398.method28003(intValue, intValue2 - 1) == 2) {
                        n4 = intValue2 - 1;
                        n6 = 131072;
                    }
                }
            }
            int n7 = this.field34258.nextBoolean() ? n2 : n3;
            int n8 = this.field34258.nextBoolean() ? n4 : n5;
            int n9 = 2097152;
            if (!class8398.method28005(n7, n8, 1)) {
                n7 = ((n7 != n2) ? n2 : n3);
                n8 = ((n8 != n4) ? n4 : n5);
                if (!class8398.method28005(n7, n8, 1)) {
                    n8 = ((n8 != n4) ? n4 : n5);
                    if (!class8398.method28005(n7, n8, 1)) {
                        n7 = ((n7 != n2) ? n2 : n3);
                        n8 = ((n8 != n4) ? n4 : n5);
                        if (!class8398.method28005(n7, n8, 1)) {
                            n9 = 0;
                            n7 = n2;
                            n8 = n4;
                        }
                    }
                }
            }
            for (int k = n4; k <= n5; ++k) {
                for (int l = n2; l <= n3; ++l) {
                    if (l == n7 && k == n8) {
                        class8399.method28001(l, k, 0x100000 | n9 | n6 | n);
                    }
                    else {
                        class8399.method28001(l, k, n6 | n);
                    }
                }
            }
            ++n;
        }
    }
}
