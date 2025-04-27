// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4471 extends Class4469
{
    private static String[] field19843;
    private Class8123 field19844;
    private Class8123 field19845;
    private final List<Class4469> field19846;
    
    public Class4471(final Random random, final int n, final int n2, final Direction class179) {
        super(Class9520.field40982, 0);
        this.field19846 = Lists.newArrayList();
        this.method13456(class179);
        final Direction method13455 = this.method13455();
        if (method13455.getAxis() != Direction.Axis.Z) {
            this.field19849 = new MutableBoundingBox(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
        }
        else {
            this.field19849 = new MutableBoundingBox(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
        }
        final List<Class8123> method13456 = this.method13422(random);
        Class8123.method26746(this.field19844, true);
        this.field19846.add(new Class4528(method13455, this.field19844));
        this.field19846.add(new Class4531(method13455, this.field19845));
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class7329(null));
        arrayList.add(new Class7332(null));
        arrayList.add(new Class7331(null));
        arrayList.add(new Class7325(null));
        arrayList.add(new Class7328(null));
        arrayList.add(new Class7330(null));
        arrayList.add(new Class7327(null));
        for (final Class8123 class180 : method13456) {
            if (Class8123.method26747(class180)) {
                continue;
            }
            if (class180.method26741()) {
                continue;
            }
            for (final Class7326 class181 : arrayList) {
                if (!class181.method22483(class180)) {
                    continue;
                }
                this.field19846.add(class181.method22484(method13455, class180, random));
                break;
            }
        }
        final int field27294 = this.field19849.minY;
        final int method13457 = this.method13437(9, 22);
        final int method13458 = this.method13439(9, 22);
        final Iterator<Class4469> iterator3 = this.field19846.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().method13432().offset(method13457, field27294, method13458);
        }
        final MutableBoundingBox method13459 = MutableBoundingBox.createProper(this.method13437(1, 1), this.method13438(1), this.method13439(1, 1), this.method13437(23, 21), this.method13438(8), this.method13439(23, 21));
        final MutableBoundingBox method13460 = MutableBoundingBox.createProper(this.method13437(34, 1), this.method13438(1), this.method13439(34, 1), this.method13437(56, 21), this.method13438(8), this.method13439(56, 21));
        final MutableBoundingBox method13461 = MutableBoundingBox.createProper(this.method13437(22, 22), this.method13438(13), this.method13439(22, 22), this.method13437(35, 35), this.method13438(17), this.method13439(35, 35));
        int nextInt = random.nextInt();
        this.field19846.add(new Class4527(method13455, method13459, nextInt++));
        this.field19846.add(new Class4527(method13455, method13460, nextInt++));
        this.field19846.add(new Class4524(method13455, method13461));
    }
    
    public Class4471(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40982, class1796);
        this.field19846 = Lists.newArrayList();
    }
    
    private List<Class8123> method13422(final Random rnd) {
        final Class8123[] array = new Class8123[75];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                final int method13414 = Class4469.method13414(i, 0, j);
                array[method13414] = new Class8123(method13414);
            }
        }
        for (int k = 0; k < 5; ++k) {
            for (int l = 0; l < 4; ++l) {
                final int method13415 = Class4469.method13414(k, 1, l);
                array[method13415] = new Class8123(method13415);
            }
        }
        for (int n = 1; n < 4; ++n) {
            for (int n2 = 0; n2 < 2; ++n2) {
                final int method13416 = Class4469.method13414(n, 2, n2);
                array[method13416] = new Class8123(method13416);
            }
        }
        this.field19844 = array[Class4471.field19836];
        for (int n3 = 0; n3 < 5; ++n3) {
            for (int n4 = 0; n4 < 5; ++n4) {
                for (int n5 = 0; n5 < 3; ++n5) {
                    final int method13417 = Class4469.method13414(n3, n5, n4);
                    if (array[method13417] != null) {
                        for (final Direction class179 : Direction.values()) {
                            final int n7 = n3 + class179.getXOffset();
                            final int n8 = n5 + class179.getYOffset();
                            final int n9 = n4 + class179.getZOffset();
                            if (n7 >= 0) {
                                if (n7 < 5) {
                                    if (n9 >= 0) {
                                        if (n9 < 5) {
                                            if (n8 >= 0) {
                                                if (n8 < 3) {
                                                    final int method13418 = Class4469.method13414(n7, n8, n9);
                                                    if (array[method13418] != null) {
                                                        if (n9 != n4) {
                                                            array[method13417].method26738(class179.getOpposite(), array[method13418]);
                                                        }
                                                        else {
                                                            array[method13417].method26738(class179, array[method13418]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final Class8123 class180 = new Class8123(1003);
        final Class8123 class181 = new Class8123(1001);
        final Class8123 class182 = new Class8123(1002);
        array[Class4471.field19837].method26738(Direction.UP, class180);
        array[Class4471.field19838].method26738(Direction.SOUTH, class181);
        array[Class4471.field19839].method26738(Direction.SOUTH, class182);
        Class8123.method26746(class180, true);
        Class8123.method26746(class181, true);
        Class8123.method26746(class182, true);
        Class8123.method26748(this.field19844, true);
        Class8123.method26746(this.field19845 = array[Class4469.method13414(rnd.nextInt(4), 0, 2)], true);
        Class8123.method26746(Class8123.method26743(this.field19845)[Direction.EAST.getIndex()], true);
        Class8123.method26746(Class8123.method26743(this.field19845)[Direction.NORTH.getIndex()], true);
        Class8123.method26746(Class8123.method26743(Class8123.method26743(this.field19845)[Direction.EAST.getIndex()])[Direction.NORTH.getIndex()], true);
        Class8123.method26746(Class8123.method26743(this.field19845)[Direction.UP.getIndex()], true);
        Class8123.method26746(Class8123.method26743(Class8123.method26743(this.field19845)[Direction.EAST.getIndex()])[Direction.UP.getIndex()], true);
        Class8123.method26746(Class8123.method26743(Class8123.method26743(this.field19845)[Direction.NORTH.getIndex()])[Direction.UP.getIndex()], true);
        Class8123.method26746(Class8123.method26743(Class8123.method26743(Class8123.method26743(this.field19845)[Direction.EAST.getIndex()])[Direction.NORTH.getIndex()])[Direction.UP.getIndex()], true);
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class8123 class183 : array) {
            if (class183 != null) {
                class183.method26739();
                arrayList.add(class183);
            }
        }
        class180.method26739();
        Collections.shuffle(arrayList, rnd);
        int n11 = 1;
        for (final Class8123 class184 : arrayList) {
            int n12 = 0;
            int n13 = 0;
            while (n12 < 2 && n13 < 5) {
                ++n13;
                final int nextInt = rnd.nextInt(6);
                if (!Class8123.method26745(class184)[nextInt]) {
                    continue;
                }
                final int method13419 = Direction.byIndex(nextInt).getOpposite().getIndex();
                Class8123.method26745(class184)[nextInt] = false;
                Class8123.method26745(Class8123.method26743(class184)[nextInt])[method13419] = false;
                if (class184.method26740(n11++) && Class8123.method26743(class184)[nextInt].method26740(n11++)) {
                    ++n12;
                }
                else {
                    Class8123.method26745(class184)[nextInt] = true;
                    Class8123.method26745(Class8123.method26743(class184)[nextInt])[method13419] = true;
                }
            }
        }
        arrayList.add(class180);
        arrayList.add(class181);
        arrayList.add(class182);
        return arrayList;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13416(class1851, class1853, 0, 0, 0, 58, Math.max(class1851.method6743(), 64) - this.field19849.minY, 58);
        this.method13423(false, 0, class1851, random, class1853);
        this.method13423(true, 33, class1851, random, class1853);
        this.method13424(class1851, random, class1853);
        this.method13425(class1851, random, class1853);
        this.method13426(class1851, random, class1853);
        this.method13427(class1851, random, class1853);
        this.method13428(class1851, random, class1853);
        this.method13429(class1851, random, class1853);
        for (int i = 0; i < 7; ++i) {
            int j = 0;
            while (j < 7) {
                if (j == 0) {
                    if (i == 3) {
                        j = 6;
                    }
                }
                final int n = i * 9;
                final int n2 = j * 9;
                for (int k = 0; k < 4; ++k) {
                    for (int l = 0; l < 4; ++l) {
                        this.method13440(class1851, Class4471.field19830, n + k, 0, n2 + l, class1853);
                        this.method13449(class1851, Class4471.field19830, n + k, -1, n2 + l, class1853);
                    }
                }
                if (i != 0 && i != 6) {
                    j += 6;
                }
                else {
                    ++j;
                }
            }
        }
        for (int n3 = 0; n3 < 5; ++n3) {
            this.method13416(class1851, class1853, -1 - n3, n3 * 2, -1 - n3, -1 - n3, 23, 58 + n3);
            this.method13416(class1851, class1853, 58 + n3, n3 * 2, -1 - n3, 58 + n3, 23, 58 + n3);
            this.method13416(class1851, class1853, -n3, n3 * 2, -1 - n3, 57 + n3, 23, -1 - n3);
            this.method13416(class1851, class1853, -n3, n3 * 2, 58 + n3, 57 + n3, 23, 58 + n3);
        }
        for (final Class4469 class1855 : this.field19846) {
            if (!class1855.method13432().intersectsWith(class1853)) {
                continue;
            }
            class1855.method13421(class1851, class1852, random, class1853, class1854);
        }
        return true;
    }
    
    private void method13423(final boolean b, final int n, final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, n, 0, n + 23, 20)) {
            this.method13444(class1851, class1852, n, 0, 0, n + 24, 0, 20, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, n, 1, 0, n + 24, 10, 20);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, n + i, i + 1, i, n + i, i + 1, 20, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, n + i + 7, i + 5, i + 7, n + i + 7, i + 5, 20, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, n + 17 - i, i + 5, i + 7, n + 17 - i, i + 5, 20, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, n + 24 - i, i + 1, i, n + 24 - i, i + 1, 20, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, n + i + 1, i + 1, i, n + 23 - i, i + 1, i, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, n + i + 8, i + 5, i + 7, n + 16 - i, i + 5, i + 7, Class4471.field19830, Class4471.field19830, false);
            }
            this.method13444(class1851, class1852, n + 4, 4, 4, n + 6, 4, 20, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, n + 7, 4, 4, n + 17, 4, 6, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, n + 18, 4, 4, n + 20, 4, 20, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, n + 11, 8, 11, n + 13, 8, 20, Class4471.field19829, Class4471.field19829, false);
            this.method13440(class1851, Class4471.field19832, n + 12, 9, 12, class1852);
            this.method13440(class1851, Class4471.field19832, n + 12, 9, 15, class1852);
            this.method13440(class1851, Class4471.field19832, n + 12, 9, 18, class1852);
            final int n2 = n + (b ? 19 : 5);
            final int n3 = n + (b ? 5 : 19);
            for (int j = 20; j >= 5; j -= 3) {
                this.method13440(class1851, Class4471.field19832, n2, 5, j, class1852);
            }
            for (int k = 19; k >= 7; k -= 3) {
                this.method13440(class1851, Class4471.field19832, n3, 5, k, class1852);
            }
            for (int l = 0; l < 4; ++l) {
                this.method13440(class1851, Class4471.field19832, b ? (n + 24 - (17 - l * 3)) : (n + 17 - l * 3), 5, 5, class1852);
            }
            this.method13440(class1851, Class4471.field19832, n3, 5, 5, class1852);
            this.method13444(class1851, class1852, n + 11, 1, 12, n + 13, 7, 12, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, n + 12, 1, 11, n + 12, 7, 13, Class4471.field19829, Class4471.field19829, false);
        }
    }
    
    private void method13424(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 22, 5, 35, 17)) {
            this.method13416(class1851, class1852, 25, 0, 0, 32, 8, 20);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, Class4471.field19830, Class4471.field19830, false);
                this.method13440(class1851, Class4471.field19830, 25, 5, 5 + i * 4, class1852);
                this.method13440(class1851, Class4471.field19830, 26, 6, 5 + i * 4, class1852);
                this.method13440(class1851, Class4471.field19833, 26, 5, 5 + i * 4, class1852);
                this.method13444(class1851, class1852, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, Class4471.field19830, Class4471.field19830, false);
                this.method13440(class1851, Class4471.field19830, 32, 5, 5 + i * 4, class1852);
                this.method13440(class1851, Class4471.field19830, 31, 6, 5 + i * 4, class1852);
                this.method13440(class1851, Class4471.field19833, 31, 5, 5 + i * 4, class1852);
                this.method13444(class1851, class1852, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, Class4471.field19829, Class4471.field19829, false);
            }
        }
    }
    
    private void method13425(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 15, 20, 42, 21)) {
            this.method13444(class1851, class1852, 15, 0, 21, 42, 0, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 26, 1, 21, 31, 3, 21);
            this.method13444(class1851, class1852, 21, 12, 21, 36, 12, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 17, 11, 21, 40, 11, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 16, 10, 21, 41, 10, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 15, 7, 21, 42, 9, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 16, 6, 21, 41, 6, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 17, 5, 21, 40, 5, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 21, 4, 21, 36, 4, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 22, 3, 21, 26, 3, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 31, 3, 21, 35, 3, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 23, 2, 21, 25, 2, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 32, 2, 21, 34, 2, 21, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 28, 4, 20, 29, 4, 21, Class4471.field19830, Class4471.field19830, false);
            this.method13440(class1851, Class4471.field19830, 27, 3, 21, class1852);
            this.method13440(class1851, Class4471.field19830, 30, 3, 21, class1852);
            this.method13440(class1851, Class4471.field19830, 26, 2, 21, class1852);
            this.method13440(class1851, Class4471.field19830, 31, 2, 21, class1852);
            this.method13440(class1851, Class4471.field19830, 25, 1, 21, class1852);
            this.method13440(class1851, Class4471.field19830, 32, 1, 21, class1852);
            for (int i = 0; i < 7; ++i) {
                this.method13440(class1851, Class4471.field19831, 28 - i, 6 + i, 21, class1852);
                this.method13440(class1851, Class4471.field19831, 29 + i, 6 + i, 21, class1852);
            }
            for (int j = 0; j < 4; ++j) {
                this.method13440(class1851, Class4471.field19831, 28 - j, 9 + j, 21, class1852);
                this.method13440(class1851, Class4471.field19831, 29 + j, 9 + j, 21, class1852);
            }
            this.method13440(class1851, Class4471.field19831, 28, 12, 21, class1852);
            this.method13440(class1851, Class4471.field19831, 29, 12, 21, class1852);
            for (int k = 0; k < 3; ++k) {
                this.method13440(class1851, Class4471.field19831, 22 - k * 2, 8, 21, class1852);
                this.method13440(class1851, Class4471.field19831, 22 - k * 2, 9, 21, class1852);
                this.method13440(class1851, Class4471.field19831, 35 + k * 2, 8, 21, class1852);
                this.method13440(class1851, Class4471.field19831, 35 + k * 2, 9, 21, class1852);
            }
            this.method13416(class1851, class1852, 15, 13, 21, 42, 15, 21);
            this.method13416(class1851, class1852, 15, 1, 21, 15, 6, 21);
            this.method13416(class1851, class1852, 16, 1, 21, 16, 5, 21);
            this.method13416(class1851, class1852, 17, 1, 21, 20, 4, 21);
            this.method13416(class1851, class1852, 21, 1, 21, 21, 3, 21);
            this.method13416(class1851, class1852, 22, 1, 21, 22, 2, 21);
            this.method13416(class1851, class1852, 23, 1, 21, 24, 1, 21);
            this.method13416(class1851, class1852, 42, 1, 21, 42, 6, 21);
            this.method13416(class1851, class1852, 41, 1, 21, 41, 5, 21);
            this.method13416(class1851, class1852, 37, 1, 21, 40, 4, 21);
            this.method13416(class1851, class1852, 36, 1, 21, 36, 3, 21);
            this.method13416(class1851, class1852, 33, 1, 21, 34, 1, 21);
            this.method13416(class1851, class1852, 35, 1, 21, 35, 2, 21);
        }
    }
    
    private void method13426(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 21, 21, 36, 36)) {
            this.method13444(class1851, class1852, 21, 0, 22, 36, 0, 36, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 21, 1, 22, 36, 23, 36);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, Class4471.field19830, Class4471.field19830, false);
                this.method13444(class1851, class1852, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, Class4471.field19830, Class4471.field19830, false);
            }
            this.method13444(class1851, class1852, 25, 16, 25, 32, 16, 32, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 25, 17, 25, 25, 19, 25, Class4471.field19830, Class4471.field19830, false);
            this.method13444(class1851, class1852, 32, 17, 25, 32, 19, 25, Class4471.field19830, Class4471.field19830, false);
            this.method13444(class1851, class1852, 25, 17, 32, 25, 19, 32, Class4471.field19830, Class4471.field19830, false);
            this.method13444(class1851, class1852, 32, 17, 32, 32, 19, 32, Class4471.field19830, Class4471.field19830, false);
            this.method13440(class1851, Class4471.field19830, 26, 20, 26, class1852);
            this.method13440(class1851, Class4471.field19830, 27, 21, 27, class1852);
            this.method13440(class1851, Class4471.field19833, 27, 20, 27, class1852);
            this.method13440(class1851, Class4471.field19830, 26, 20, 31, class1852);
            this.method13440(class1851, Class4471.field19830, 27, 21, 30, class1852);
            this.method13440(class1851, Class4471.field19833, 27, 20, 30, class1852);
            this.method13440(class1851, Class4471.field19830, 31, 20, 31, class1852);
            this.method13440(class1851, Class4471.field19830, 30, 21, 30, class1852);
            this.method13440(class1851, Class4471.field19833, 30, 20, 30, class1852);
            this.method13440(class1851, Class4471.field19830, 31, 20, 26, class1852);
            this.method13440(class1851, Class4471.field19830, 30, 21, 27, class1852);
            this.method13440(class1851, Class4471.field19833, 30, 20, 27, class1852);
            this.method13444(class1851, class1852, 28, 21, 27, 29, 21, 27, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 27, 21, 28, 27, 21, 29, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 28, 21, 30, 29, 21, 30, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 30, 21, 28, 30, 21, 29, Class4471.field19829, Class4471.field19829, false);
        }
    }
    
    private void method13427(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 0, 21, 6, 58)) {
            this.method13444(class1851, class1852, 0, 0, 21, 6, 0, 57, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 0, 1, 21, 6, 7, 57);
            this.method13444(class1851, class1852, 4, 4, 21, 6, 4, 53, Class4471.field19829, Class4471.field19829, false);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, i, i + 1, 21, i, i + 1, 57 - i, Class4471.field19830, Class4471.field19830, false);
            }
            for (int j = 23; j < 53; j += 3) {
                this.method13440(class1851, Class4471.field19832, 5, 5, j, class1852);
            }
            this.method13440(class1851, Class4471.field19832, 5, 5, 52, class1852);
            for (int k = 0; k < 4; ++k) {
                this.method13444(class1851, class1852, k, k + 1, 21, k, k + 1, 57 - k, Class4471.field19830, Class4471.field19830, false);
            }
            this.method13444(class1851, class1852, 4, 1, 52, 6, 3, 52, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 5, 1, 51, 5, 3, 53, Class4471.field19829, Class4471.field19829, false);
        }
        if (this.method13419(class1852, 51, 21, 58, 58)) {
            this.method13444(class1851, class1852, 51, 0, 21, 57, 0, 57, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 51, 1, 21, 57, 7, 57);
            this.method13444(class1851, class1852, 51, 4, 21, 53, 4, 53, Class4471.field19829, Class4471.field19829, false);
            for (int l = 0; l < 4; ++l) {
                this.method13444(class1851, class1852, 57 - l, l + 1, 21, 57 - l, l + 1, 57 - l, Class4471.field19830, Class4471.field19830, false);
            }
            for (int n = 23; n < 53; n += 3) {
                this.method13440(class1851, Class4471.field19832, 52, 5, n, class1852);
            }
            this.method13440(class1851, Class4471.field19832, 52, 5, 52, class1852);
            this.method13444(class1851, class1852, 51, 1, 52, 53, 3, 52, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 52, 1, 51, 52, 3, 53, Class4471.field19829, Class4471.field19829, false);
        }
        if (this.method13419(class1852, 0, 51, 57, 57)) {
            this.method13444(class1851, class1852, 7, 0, 51, 50, 0, 57, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 7, 1, 51, 50, 10, 57);
            for (int n2 = 0; n2 < 4; ++n2) {
                this.method13444(class1851, class1852, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, Class4471.field19830, Class4471.field19830, false);
            }
        }
    }
    
    private void method13428(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 7, 21, 13, 50)) {
            this.method13444(class1851, class1852, 7, 0, 21, 13, 0, 50, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 7, 1, 21, 13, 10, 50);
            this.method13444(class1851, class1852, 11, 8, 21, 13, 8, 53, Class4471.field19829, Class4471.field19829, false);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, i + 7, i + 5, 21, i + 7, i + 5, 54, Class4471.field19830, Class4471.field19830, false);
            }
            for (int j = 21; j <= 45; j += 3) {
                this.method13440(class1851, Class4471.field19832, 12, 9, j, class1852);
            }
        }
        if (this.method13419(class1852, 44, 21, 50, 54)) {
            this.method13444(class1851, class1852, 44, 0, 21, 50, 0, 50, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 44, 1, 21, 50, 10, 50);
            this.method13444(class1851, class1852, 44, 8, 21, 46, 8, 53, Class4471.field19829, Class4471.field19829, false);
            for (int k = 0; k < 4; ++k) {
                this.method13444(class1851, class1852, 50 - k, k + 5, 21, 50 - k, k + 5, 54, Class4471.field19830, Class4471.field19830, false);
            }
            for (int l = 21; l <= 45; l += 3) {
                this.method13440(class1851, Class4471.field19832, 45, 9, l, class1852);
            }
        }
        if (this.method13419(class1852, 8, 44, 49, 54)) {
            this.method13444(class1851, class1852, 14, 0, 44, 43, 0, 50, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 14, 1, 44, 43, 10, 50);
            for (int n = 12; n <= 45; n += 3) {
                this.method13440(class1851, Class4471.field19832, n, 9, 45, class1852);
                this.method13440(class1851, Class4471.field19832, n, 9, 52, class1852);
                if (n != 12) {
                    if (n != 18) {
                        if (n != 24) {
                            if (n != 33) {
                                if (n != 39) {
                                    if (n != 45) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                this.method13440(class1851, Class4471.field19832, n, 9, 47, class1852);
                this.method13440(class1851, Class4471.field19832, n, 9, 50, class1852);
                this.method13440(class1851, Class4471.field19832, n, 10, 45, class1852);
                this.method13440(class1851, Class4471.field19832, n, 10, 46, class1852);
                this.method13440(class1851, Class4471.field19832, n, 10, 51, class1852);
                this.method13440(class1851, Class4471.field19832, n, 10, 52, class1852);
                this.method13440(class1851, Class4471.field19832, n, 11, 47, class1852);
                this.method13440(class1851, Class4471.field19832, n, 11, 50, class1852);
                this.method13440(class1851, Class4471.field19832, n, 12, 48, class1852);
                this.method13440(class1851, Class4471.field19832, n, 12, 49, class1852);
            }
            for (int n2 = 0; n2 < 3; ++n2) {
                this.method13444(class1851, class1852, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, Class4471.field19829, Class4471.field19829, false);
            }
            this.method13444(class1851, class1852, 11, 8, 54, 46, 8, 54, Class4471.field19830, Class4471.field19830, false);
            this.method13444(class1851, class1852, 14, 8, 44, 43, 8, 53, Class4471.field19829, Class4471.field19829, false);
        }
    }
    
    private void method13429(final Class1851 class1851, final Random random, final MutableBoundingBox class1852) {
        if (this.method13419(class1852, 14, 21, 20, 43)) {
            this.method13444(class1851, class1852, 14, 0, 21, 20, 0, 43, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 14, 1, 22, 20, 14, 43);
            this.method13444(class1851, class1852, 18, 12, 22, 20, 12, 39, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 18, 12, 21, 20, 12, 21, Class4471.field19830, Class4471.field19830, false);
            for (int i = 0; i < 4; ++i) {
                this.method13444(class1851, class1852, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, Class4471.field19830, Class4471.field19830, false);
            }
            for (int j = 23; j <= 39; j += 3) {
                this.method13440(class1851, Class4471.field19832, 19, 13, j, class1852);
            }
        }
        if (this.method13419(class1852, 37, 21, 43, 43)) {
            this.method13444(class1851, class1852, 37, 0, 21, 43, 0, 43, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 37, 1, 22, 43, 14, 43);
            this.method13444(class1851, class1852, 37, 12, 22, 39, 12, 39, Class4471.field19829, Class4471.field19829, false);
            this.method13444(class1851, class1852, 37, 12, 21, 39, 12, 21, Class4471.field19830, Class4471.field19830, false);
            for (int k = 0; k < 4; ++k) {
                this.method13444(class1851, class1852, 43 - k, k + 9, 21, 43 - k, k + 9, 43 - k, Class4471.field19830, Class4471.field19830, false);
            }
            for (int l = 23; l <= 39; l += 3) {
                this.method13440(class1851, Class4471.field19832, 38, 13, l, class1852);
            }
        }
        if (this.method13419(class1852, 15, 37, 42, 43)) {
            this.method13444(class1851, class1852, 21, 0, 37, 36, 0, 43, Class4471.field19829, Class4471.field19829, false);
            this.method13416(class1851, class1852, 21, 1, 37, 36, 14, 43);
            this.method13444(class1851, class1852, 21, 12, 37, 36, 12, 39, Class4471.field19829, Class4471.field19829, false);
            for (int n = 0; n < 4; ++n) {
                this.method13444(class1851, class1852, 15 + n, n + 9, 43 - n, 42 - n, n + 9, 43 - n, Class4471.field19830, Class4471.field19830, false);
            }
            for (int n2 = 21; n2 <= 36; n2 += 3) {
                this.method13440(class1851, Class4471.field19832, n2, 13, 38, class1852);
            }
        }
    }
}
