// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4429
{
    private final Class1795 field19760;
    private final Random field19761;
    private int field19762;
    private int field19763;
    
    public Class4429(final Class1795 field19760, final Random field19761) {
        this.field19760 = field19760;
        this.field19761 = field19761;
    }
    
    public void method13395(final BlockPos field19956, final Class2052 field19957, final List<Class4520> list, final Class8347 class8347) {
        final Class4533 class8348 = new Class4533(null);
        class8348.field19956 = field19956;
        class8348.field19955 = field19957;
        class8348.field19957 = "wall_flat";
        final Class4533 class8349 = new Class4533(null);
        this.method13398(list, class8348);
        class8349.field19956 = class8348.field19956.method1138(8);
        class8349.field19955 = class8348.field19955;
        class8349.field19957 = "wall_window";
        if (list.isEmpty()) {}
        final Class8398 method27822 = Class8347.method27822(class8347);
        final Class8398 method27823 = Class8347.method27823(class8347);
        this.field19762 = Class8347.method27824(class8347) + 1;
        this.field19763 = Class8347.method27825(class8347) + 1;
        final int n = Class8347.method27824(class8347) + 1;
        final int method27824 = Class8347.method27825(class8347);
        this.method13396(list, class8348, method27822, Direction.SOUTH, this.field19762, this.field19763, n, method27824);
        this.method13396(list, class8349, method27822, Direction.SOUTH, this.field19762, this.field19763, n, method27824);
        final Class4533 class8350 = new Class4533(null);
        class8350.field19956 = class8348.field19956.method1138(19);
        class8350.field19955 = class8348.field19955;
        class8350.field19957 = "wall_window";
        for (int n2 = 0, n3 = 0; n3 < Class8398.method28007(method27823) && n2 == 0; ++n3) {
            for (int n4 = Class8398.method28006(method27823) - 1; n4 >= 0 && n2 == 0; --n4) {
                if (Class8347.method27815(method27823, n4, n3)) {
                    class8350.field19956 = class8350.field19956.method1150(field19957.method8142(Direction.SOUTH), 8 + (n3 - this.field19763) * 8);
                    class8350.field19956 = class8350.field19956.method1150(field19957.method8142(Direction.EAST), (n4 - this.field19762) * 8);
                    this.method13399(list, class8350);
                    this.method13396(list, class8350, method27823, Direction.SOUTH, n4, n3, n4, n3);
                    n2 = 1;
                }
            }
        }
        this.method13397(list, field19956.method1138(16), field19957, method27822, method27823);
        this.method13397(list, field19956.method1138(27), field19957, method27823, null);
        if (list.isEmpty()) {}
        final Class6716[] array = { new Class6715(null), new Class6717(null), new Class6718(null) };
        for (int i = 0; i < 3; ++i) {
            final BlockPos method27825 = field19956.method1138(8 * i + ((i != 2) ? 0 : 3));
            final Class8398 class8351 = Class8347.method27826(class8347)[i];
            final Class8398 class8352 = (i != 2) ? method27822 : method27823;
            final String s = (i != 0) ? "carpet_south_2" : "carpet_south_1";
            final String s2 = (i != 0) ? "carpet_west_2" : "carpet_west_1";
            for (int j = 0; j < Class8398.method28007(class8352); ++j) {
                for (int k = 0; k < Class8398.method28006(class8352); ++k) {
                    if (class8352.method28003(k, j) == 1) {
                        final BlockPos method27826 = method27825.method1150(field19957.method8142(Direction.SOUTH), 8 + (j - this.field19763) * 8).method1150(field19957.method8142(Direction.EAST), (k - this.field19762) * 8);
                        list.add(new Class4520(this.field19760, "corridor_floor", method27826, field19957));
                        if (class8352.method28003(k, j - 1) == 1 || (class8351.method28003(k, j - 1) & 0x800000) == 0x800000) {
                            list.add(new Class4520(this.field19760, "carpet_north", method27826.method1150(field19957.method8142(Direction.EAST), 1).method1137(), field19957));
                        }
                        if (class8352.method28003(k + 1, j) == 1 || (class8351.method28003(k + 1, j) & 0x800000) == 0x800000) {
                            list.add(new Class4520(this.field19760, "carpet_east", method27826.method1150(field19957.method8142(Direction.SOUTH), 1).method1150(field19957.method8142(Direction.EAST), 5).method1137(), field19957));
                        }
                        if (class8352.method28003(k, j + 1) == 1 || (class8351.method28003(k, j + 1) & 0x800000) == 0x800000) {
                            list.add(new Class4520(this.field19760, s, method27826.method1150(field19957.method8142(Direction.SOUTH), 5).method1150(field19957.method8142(Direction.WEST), 1), field19957));
                        }
                        if (class8352.method28003(k - 1, j) == 1 || (class8351.method28003(k - 1, j) & 0x800000) == 0x800000) {
                            list.add(new Class4520(this.field19760, s2, method27826.method1150(field19957.method8142(Direction.WEST), 1).method1150(field19957.method8142(Direction.NORTH), 1), field19957));
                        }
                    }
                }
            }
            final String s3 = (i != 0) ? "indoors_wall_2" : "indoors_wall_1";
            final String s4 = (i != 0) ? "indoors_door_2" : "indoors_door_1";
            final ArrayList arrayList = Lists.newArrayList();
            for (int l = 0; l < Class8398.method28007(class8352); ++l) {
                for (int n5 = 0; n5 < Class8398.method28006(class8352); ++n5) {
                    final boolean b = i == 2 && class8352.method28003(n5, l) == 3;
                    if (class8352.method28003(n5, l) == 2 || b) {
                        final int method27827 = class8351.method28003(n5, l);
                        final int n6 = method27827 & 0xF0000;
                        final int n7 = method27827 & 0xFFFF;
                        final boolean b2 = b && (method27827 & 0x800000) == 0x800000;
                        arrayList.clear();
                        if ((method27827 & 0x200000) == 0x200000) {
                            for (final Direction class8353 : Plane.HORIZONTAL) {
                                if (class8352.method28003(n5 + class8353.getXOffset(), l + class8353.getZOffset()) != 1) {
                                    continue;
                                }
                                arrayList.add(class8353);
                            }
                        }
                        Direction field19958 = null;
                        if (arrayList.isEmpty()) {
                            if ((method27827 & 0x100000) == 0x100000) {
                                field19958 = Direction.UP;
                            }
                        }
                        else {
                            field19958 = (Direction)arrayList.get(this.field19761.nextInt(arrayList.size()));
                        }
                        final BlockPos method27828 = method27825.method1150(field19957.method8142(Direction.SOUTH), 8 + (l - this.field19763) * 8).method1150(field19957.method8142(Direction.EAST), -1 + (n5 - this.field19762) * 8);
                        if (Class8347.method27815(class8352, n5 - 1, l)) {
                            if (!class8347.method27816(class8352, n5 - 1, l, i, n7)) {
                                list.add(new Class4520(this.field19760, (field19958 != Direction.WEST) ? s3 : s4, method27828, field19957));
                            }
                        }
                        if (class8352.method28003(n5 + 1, l) == 1) {
                            if (!b2) {
                                list.add(new Class4520(this.field19760, (field19958 != Direction.EAST) ? s3 : s4, method27828.method1150(field19957.method8142(Direction.EAST), 8), field19957));
                            }
                        }
                        if (Class8347.method27815(class8352, n5, l + 1)) {
                            if (!class8347.method27816(class8352, n5, l + 1, i, n7)) {
                                list.add(new Class4520(this.field19760, (field19958 != Direction.SOUTH) ? s3 : s4, method27828.method1150(field19957.method8142(Direction.SOUTH), 7).method1150(field19957.method8142(Direction.EAST), 7), field19957.method8141(Class2052.field11708)));
                            }
                        }
                        if (class8352.method28003(n5, l - 1) == 1) {
                            if (!b2) {
                                list.add(new Class4520(this.field19760, (field19958 != Direction.NORTH) ? s3 : s4, method27828.method1150(field19957.method8142(Direction.NORTH), 1).method1150(field19957.method8142(Direction.EAST), 7), field19957.method8141(Class2052.field11708)));
                            }
                        }
                        if (n6 != 65536) {
                            if (n6 == 131072 && field19958 != null) {
                                this.method13403(list, method27828, field19957, class8347.method27817(class8352, n5, l, i, n7), field19958, array[i], (method27827 & 0x400000) == 0x400000);
                            }
                            else {
                                if (n6 == 262144) {
                                    if (field19958 != null) {
                                        if (field19958 != Direction.UP) {
                                            Direction class8354 = field19958.rotateY();
                                            if (!class8347.method27816(class8352, n5 + class8354.getXOffset(), l + class8354.getZOffset(), i, n7)) {
                                                class8354 = class8354.getOpposite();
                                            }
                                            this.method13404(list, method27828, field19957, class8354, field19958, array[i]);
                                            continue;
                                        }
                                    }
                                }
                                if (n6 == 262144) {
                                    if (field19958 == Direction.UP) {
                                        this.method13405(list, method27828, field19957, array[i]);
                                    }
                                }
                            }
                        }
                        else {
                            this.method13402(list, method27828, field19957, field19958, array[i]);
                        }
                    }
                }
            }
        }
    }
    
    private void method13396(final List<Class4520> list, final Class4533 class4533, final Class8398 class4534, Direction class4535, final int n, final int n2, final int n3, final int n4) {
        int n5 = n;
        int n6 = n2;
        final Direction class4536 = class4535;
        while (true) {
            Label_0143: {
                if (Class8347.method27815(class4534, n5 + class4535.getXOffset(), n6 + class4535.getZOffset())) {
                    if (Class8347.method27815(class4534, n5 + class4535.getXOffset(), n6 + class4535.getZOffset()) && Class8347.method27815(class4534, n5 + class4535.getXOffset() + class4535.method784().getXOffset(), n6 + class4535.getZOffset() + class4535.method784().getZOffset())) {
                        this.method13401(list, class4533);
                        n5 += class4535.getXOffset();
                        n6 += class4535.getZOffset();
                        class4535 = class4535.method784();
                    }
                    else {
                        n5 += class4535.getXOffset();
                        n6 += class4535.getZOffset();
                        if (n5 == n3) {
                            if (n6 == n4) {
                                if (class4536 == class4535) {
                                    break Label_0143;
                                }
                            }
                        }
                        this.method13399(list, class4533);
                    }
                }
                else {
                    this.method13400(list, class4533);
                    class4535 = class4535.rotateY();
                    if (n5 == n3) {
                        if (n6 == n4) {
                            if (class4536 == class4535) {
                                break Label_0143;
                            }
                        }
                    }
                    this.method13399(list, class4533);
                }
            }
            if (n5 != n3) {
                continue;
            }
            if (n6 != n4) {
                continue;
            }
            if (class4536 != class4535) {
                continue;
            }
            break;
        }
    }
    
    private void method13397(final List<Class4520> list, final BlockPos class354, final Class2052 class355, final Class8398 class356, final Class8398 class357) {
        for (int i = 0; i < Class8398.method28007(class356); ++i) {
            for (int j = 0; j < Class8398.method28006(class356); ++j) {
                final BlockPos method1150 = class354.method1150(class355.method8142(Direction.SOUTH), 8 + (i - this.field19763) * 8).method1150(class355.method8142(Direction.EAST), (j - this.field19762) * 8);
                final boolean b = class357 != null && Class8347.method27815(class357, j, i);
                if (Class8347.method27815(class356, j, i)) {
                    if (!b) {
                        list.add(new Class4520(this.field19760, "roof", method1150.method1138(3), class355));
                        if (!Class8347.method27815(class356, j + 1, i)) {
                            list.add(new Class4520(this.field19760, "roof_front", method1150.method1150(class355.method8142(Direction.EAST), 6), class355));
                        }
                        if (!Class8347.method27815(class356, j - 1, i)) {
                            list.add(new Class4520(this.field19760, "roof_front", method1150.method1150(class355.method8142(Direction.EAST), 0).method1150(class355.method8142(Direction.SOUTH), 7), class355.method8141(Class2052.field11709)));
                        }
                        if (!Class8347.method27815(class356, j, i - 1)) {
                            list.add(new Class4520(this.field19760, "roof_front", method1150.method1150(class355.method8142(Direction.WEST), 1), class355.method8141(Class2052.field11710)));
                        }
                        if (!Class8347.method27815(class356, j, i + 1)) {
                            list.add(new Class4520(this.field19760, "roof_front", method1150.method1150(class355.method8142(Direction.EAST), 6).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11708)));
                        }
                    }
                }
            }
        }
        if (class357 != null) {
            for (int k = 0; k < Class8398.method28007(class356); ++k) {
                for (int l = 0; l < Class8398.method28006(class356); ++l) {
                    final BlockPos method1151 = class354.method1150(class355.method8142(Direction.SOUTH), 8 + (k - this.field19763) * 8).method1150(class355.method8142(Direction.EAST), (l - this.field19762) * 8);
                    final boolean method1152 = Class8347.method27815(class357, l, k);
                    if (Class8347.method27815(class356, l, k)) {
                        if (method1152) {
                            if (!Class8347.method27815(class356, l + 1, k)) {
                                list.add(new Class4520(this.field19760, "small_wall", method1151.method1150(class355.method8142(Direction.EAST), 7), class355));
                            }
                            if (!Class8347.method27815(class356, l - 1, k)) {
                                list.add(new Class4520(this.field19760, "small_wall", method1151.method1150(class355.method8142(Direction.WEST), 1).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11709)));
                            }
                            if (!Class8347.method27815(class356, l, k - 1)) {
                                list.add(new Class4520(this.field19760, "small_wall", method1151.method1150(class355.method8142(Direction.WEST), 0).method1150(class355.method8142(Direction.NORTH), 1), class355.method8141(Class2052.field11710)));
                            }
                            if (!Class8347.method27815(class356, l, k + 1)) {
                                list.add(new Class4520(this.field19760, "small_wall", method1151.method1150(class355.method8142(Direction.EAST), 6).method1150(class355.method8142(Direction.SOUTH), 7), class355.method8141(Class2052.field11708)));
                            }
                            if (!Class8347.method27815(class356, l + 1, k)) {
                                if (!Class8347.method27815(class356, l, k - 1)) {
                                    list.add(new Class4520(this.field19760, "small_wall_corner", method1151.method1150(class355.method8142(Direction.EAST), 7).method1150(class355.method8142(Direction.NORTH), 2), class355));
                                }
                                if (!Class8347.method27815(class356, l, k + 1)) {
                                    list.add(new Class4520(this.field19760, "small_wall_corner", method1151.method1150(class355.method8142(Direction.EAST), 8).method1150(class355.method8142(Direction.SOUTH), 7), class355.method8141(Class2052.field11708)));
                                }
                            }
                            if (!Class8347.method27815(class356, l - 1, k)) {
                                if (!Class8347.method27815(class356, l, k - 1)) {
                                    list.add(new Class4520(this.field19760, "small_wall_corner", method1151.method1150(class355.method8142(Direction.WEST), 2).method1150(class355.method8142(Direction.NORTH), 1), class355.method8141(Class2052.field11710)));
                                }
                                if (!Class8347.method27815(class356, l, k + 1)) {
                                    list.add(new Class4520(this.field19760, "small_wall_corner", method1151.method1150(class355.method8142(Direction.WEST), 1).method1150(class355.method8142(Direction.SOUTH), 8), class355.method8141(Class2052.field11709)));
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int n = 0; n < Class8398.method28007(class356); ++n) {
            for (int n2 = 0; n2 < Class8398.method28006(class356); ++n2) {
                final BlockPos method1153 = class354.method1150(class355.method8142(Direction.SOUTH), 8 + (n - this.field19763) * 8).method1150(class355.method8142(Direction.EAST), (n2 - this.field19762) * 8);
                final boolean b2 = class357 != null && Class8347.method27815(class357, n2, n);
                if (Class8347.method27815(class356, n2, n)) {
                    if (!b2) {
                        if (!Class8347.method27815(class356, n2 + 1, n)) {
                            final BlockPos method1154 = method1153.method1150(class355.method8142(Direction.EAST), 6);
                            if (Class8347.method27815(class356, n2, n + 1)) {
                                if (Class8347.method27815(class356, n2 + 1, n + 1)) {
                                    list.add(new Class4520(this.field19760, "roof_inner_corner", method1154.method1150(class355.method8142(Direction.SOUTH), 5), class355));
                                }
                            }
                            else {
                                list.add(new Class4520(this.field19760, "roof_corner", method1154.method1150(class355.method8142(Direction.SOUTH), 6), class355));
                            }
                            if (Class8347.method27815(class356, n2, n - 1)) {
                                if (Class8347.method27815(class356, n2 + 1, n - 1)) {
                                    list.add(new Class4520(this.field19760, "roof_inner_corner", method1153.method1150(class355.method8142(Direction.EAST), 9).method1150(class355.method8142(Direction.NORTH), 2), class355.method8141(Class2052.field11708)));
                                }
                            }
                            else {
                                list.add(new Class4520(this.field19760, "roof_corner", method1154, class355.method8141(Class2052.field11710)));
                            }
                        }
                        if (!Class8347.method27815(class356, n2 - 1, n)) {
                            final BlockPos method1155 = method1153.method1150(class355.method8142(Direction.EAST), 0).method1150(class355.method8142(Direction.SOUTH), 0);
                            if (Class8347.method27815(class356, n2, n + 1)) {
                                if (Class8347.method27815(class356, n2 - 1, n + 1)) {
                                    list.add(new Class4520(this.field19760, "roof_inner_corner", method1155.method1150(class355.method8142(Direction.SOUTH), 8).method1150(class355.method8142(Direction.WEST), 3), class355.method8141(Class2052.field11710)));
                                }
                            }
                            else {
                                list.add(new Class4520(this.field19760, "roof_corner", method1155.method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11708)));
                            }
                            if (Class8347.method27815(class356, n2, n - 1)) {
                                if (Class8347.method27815(class356, n2 - 1, n - 1)) {
                                    list.add(new Class4520(this.field19760, "roof_inner_corner", method1155.method1150(class355.method8142(Direction.SOUTH), 1), class355.method8141(Class2052.field11709)));
                                }
                            }
                            else {
                                list.add(new Class4520(this.field19760, "roof_corner", method1155, class355.method8141(Class2052.field11709)));
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method13398(final List<Class4520> list, final Class4533 class4533) {
        list.add(new Class4520(this.field19760, "entrance", class4533.field19956.method1150(class4533.field19955.method8142(Direction.WEST), 9), class4533.field19955));
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.SOUTH), 16);
    }
    
    private void method13399(final List<Class4520> list, final Class4533 class4533) {
        list.add(new Class4520(this.field19760, class4533.field19957, class4533.field19956.method1150(class4533.field19955.method8142(Direction.EAST), 7), class4533.field19955));
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.SOUTH), 8);
    }
    
    private void method13400(final List<Class4520> list, final Class4533 class4533) {
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.SOUTH), -1);
        list.add(new Class4520(this.field19760, "wall_corner", class4533.field19956, class4533.field19955));
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.SOUTH), -7);
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.WEST), -6);
        class4533.field19955 = class4533.field19955.method8141(Class2052.field11708);
    }
    
    private void method13401(final List<Class4520> list, final Class4533 class4533) {
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.SOUTH), 6);
        class4533.field19956 = class4533.field19956.method1150(class4533.field19955.method8142(Direction.EAST), 8);
        class4533.field19955 = class4533.field19955.method8141(Class2052.field11710);
    }
    
    private void method13402(final List<Class4520> list, final BlockPos class354, final Class2052 class355, final Direction class356, final Class6716 class357) {
        Class2052 class358 = Class2052.field11707;
        String s = class357.method20398(this.field19761);
        if (class356 != Direction.EAST) {
            if (class356 != Direction.NORTH) {
                if (class356 != Direction.WEST) {
                    if (class356 != Direction.SOUTH) {
                        s = class357.method20399(this.field19761);
                    }
                    else {
                        class358 = class358.method8141(Class2052.field11708);
                    }
                }
                else {
                    class358 = class358.method8141(Class2052.field11709);
                }
            }
            else {
                class358 = class358.method8141(Class2052.field11710);
            }
        }
        final BlockPos method19965 = Class6585.method19965(new BlockPos(1, 0, 0), Class2181.field12917, class358, 7, 7);
        final Class2052 method19966 = class358.method8141(class355);
        final BlockPos method19967 = method19965.method1151(class355);
        list.add(new Class4520(this.field19760, s, class354.method1134(method19967.getX(), 0, method19967.getZ()), method19966));
    }
    
    private void method13403(final List<Class4520> list, final BlockPos class354, final Class2052 class355, final Direction class356, final Direction class357, final Class6716 class358, final boolean b) {
        if (class357 == Direction.EAST && class356 == Direction.SOUTH) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 1), class355));
        }
        else if (class357 == Direction.EAST && class356 == Direction.NORTH) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 1).method1150(class355.method8142(Direction.SOUTH), 6), class355, Class2181.field12918));
        }
        else if (class357 == Direction.WEST && class356 == Direction.NORTH) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 7).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11709)));
        }
        else if (class357 == Direction.WEST && class356 == Direction.SOUTH) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 7), class355, Class2181.field12919));
        }
        else if (class357 == Direction.SOUTH && class356 == Direction.EAST) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 1), class355.method8141(Class2052.field11708), Class2181.field12918));
        }
        else if (class357 == Direction.SOUTH && class356 == Direction.WEST) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 7), class355.method8141(Class2052.field11708)));
        }
        else if (class357 == Direction.NORTH && class356 == Direction.WEST) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 7).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11708), Class2181.field12919));
        }
        else if (class357 == Direction.NORTH && class356 == Direction.EAST) {
            list.add(new Class4520(this.field19760, class358.method20400(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 1).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11710)));
        }
        else if (class357 == Direction.SOUTH && class356 == Direction.NORTH) {
            list.add(new Class4520(this.field19760, class358.method20401(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 1).method1150(class355.method8142(Direction.NORTH), 8), class355));
        }
        else if (class357 == Direction.NORTH && class356 == Direction.SOUTH) {
            list.add(new Class4520(this.field19760, class358.method20401(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 7).method1150(class355.method8142(Direction.SOUTH), 14), class355.method8141(Class2052.field11709)));
        }
        else if (class357 == Direction.WEST && class356 == Direction.EAST) {
            list.add(new Class4520(this.field19760, class358.method20401(this.field19761, b), class354.method1150(class355.method8142(Direction.EAST), 15), class355.method8141(Class2052.field11708)));
        }
        else if (class357 == Direction.EAST && class356 == Direction.WEST) {
            list.add(new Class4520(this.field19760, class358.method20401(this.field19761, b), class354.method1150(class355.method8142(Direction.WEST), 7).method1150(class355.method8142(Direction.SOUTH), 6), class355.method8141(Class2052.field11710)));
        }
        else if (class357 == Direction.UP && class356 == Direction.EAST) {
            list.add(new Class4520(this.field19760, class358.method20402(this.field19761), class354.method1150(class355.method8142(Direction.EAST), 15), class355.method8141(Class2052.field11708)));
        }
        else if (class357 == Direction.UP) {
            if (class356 == Direction.SOUTH) {
                list.add(new Class4520(this.field19760, class358.method20402(this.field19761), class354.method1150(class355.method8142(Direction.EAST), 1).method1150(class355.method8142(Direction.NORTH), 0), class355));
            }
        }
    }
    
    private void method13404(final List<Class4520> list, final BlockPos class354, final Class2052 class355, final Direction class356, final Direction class357, final Class6716 class358) {
        int n = 0;
        int n2 = 0;
        Class2052 class359 = class355;
        Class2181 class360 = Class2181.field12917;
        if (class357 == Direction.EAST && class356 == Direction.SOUTH) {
            n = -7;
        }
        else if (class357 == Direction.EAST && class356 == Direction.NORTH) {
            n = -7;
            n2 = 6;
            class360 = Class2181.field12918;
        }
        else if (class357 == Direction.NORTH && class356 == Direction.EAST) {
            n = 1;
            n2 = 14;
            class359 = class355.method8141(Class2052.field11710);
        }
        else if (class357 == Direction.NORTH && class356 == Direction.WEST) {
            n = 7;
            n2 = 14;
            class359 = class355.method8141(Class2052.field11710);
            class360 = Class2181.field12918;
        }
        else if (class357 == Direction.SOUTH && class356 == Direction.WEST) {
            n = 7;
            n2 = -8;
            class359 = class355.method8141(Class2052.field11708);
        }
        else if (class357 == Direction.SOUTH && class356 == Direction.EAST) {
            n = 1;
            n2 = -8;
            class359 = class355.method8141(Class2052.field11708);
            class360 = Class2181.field12918;
        }
        else if (class357 == Direction.WEST && class356 == Direction.NORTH) {
            n = 15;
            n2 = 6;
            class359 = class355.method8141(Class2052.field11709);
        }
        else if (class357 == Direction.WEST) {
            if (class356 == Direction.SOUTH) {
                n = 15;
                class360 = Class2181.field12919;
            }
        }
        list.add(new Class4520(this.field19760, class358.method20403(this.field19761), class354.method1150(class355.method8142(Direction.EAST), n).method1150(class355.method8142(Direction.SOUTH), n2), class359, class360));
    }
    
    private void method13405(final List<Class4520> list, final BlockPos class354, final Class2052 class355, final Class6716 class356) {
        list.add(new Class4520(this.field19760, class356.method20404(this.field19761), class354.method1150(class355.method8142(Direction.EAST), 1), class355, Class2181.field12917));
    }
}
