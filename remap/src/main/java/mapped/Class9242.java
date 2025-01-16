// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.ConcurrentModificationException;

public class Class9242
{
    private static String[] field39630;
    public static final int field39631 = 63;
    public static final Direction[][] field39632;
    public static final Direction[][] field39633;
    private static int field39634;
    private static int field39635;
    private static int field39636;
    private static World field39637;
    private static int field39638;
    private static int field39639;
    
    public static int method34073(final World field39637, final Entity class399, final int n) {
        final int field39638 = MathHelper.floor(class399.getPosX()) >> 4;
        final int n2 = MathHelper.floor(class399.getPosY()) >> 4;
        final int field39639 = MathHelper.floor(class399.getPosZ()) >> 4;
        final Class1862 method6686 = field39637.method6686(field39638, field39639);
        int n3 = field39638 - n;
        int n4 = field39638 + n;
        int n5 = field39639 - n;
        int n6 = field39639 + n;
        if (field39637 != Class9242.field39637 || field39638 != Class9242.field39638 || field39639 != Class9242.field39639) {
            Class9242.field39634 = 0;
            Class9242.field39636 = 16;
            Class9242.field39637 = field39637;
            Class9242.field39638 = field39638;
            Class9242.field39639 = field39639;
        }
        if (Class9242.field39634 == 0) {
            Class9242.field39635 = -1;
        }
        int n7 = Class9242.field39635;
        switch (Class9242.field39634) {
            case 0: {
                n4 = field39638;
                n6 = field39639;
                break;
            }
            case 1: {
                n3 = field39638;
                n6 = field39639;
                break;
            }
            case 2: {
                n4 = field39638;
                n5 = field39639;
                break;
            }
            case 3: {
                n3 = field39638;
                n5 = field39639;
                break;
            }
        }
        for (int i = n3; i < n4; ++i) {
            for (int j = n5; j < n6; ++j) {
                final Class1862 method6687 = field39637.method6686(i, j);
                if (!method6687.method7062()) {
                    final Class8199[] method6688 = method6687.method7014();
                    int k = method6688.length - 1;
                    while (k > n7) {
                        final Class8199 class400 = method6688[k];
                        if (class400 != null && !class400.method27154()) {
                            if (k > n7) {
                                n7 = k;
                                break;
                            }
                            break;
                        }
                        else {
                            --k;
                        }
                    }
                    try {
                        final Map<BlockPos, TileEntity> method6689 = method6687.method7066();
                        if (!method6689.isEmpty()) {
                            final Iterator iterator = method6689.keySet().iterator();
                            while (iterator.hasNext()) {
                                final int n8 = ((BlockPos)iterator.next()).getY() >> 4;
                                if (n8 > n7) {
                                    n7 = n8;
                                }
                            }
                        }
                    }
                    catch (final ConcurrentModificationException ex) {}
                    final Class80<Entity>[] method6690 = method6687.method7067();
                    int l = method6690.length - 1;
                    while (l > n7) {
                        final Class80<Entity> class401 = method6690[l];
                        if (!class401.isEmpty() && (method6687 != method6686 || l != n2 || class401.size() != 1)) {
                            if (l > n7) {
                                n7 = l;
                                break;
                            }
                            break;
                        }
                        else {
                            --l;
                        }
                    }
                }
            }
        }
        if (Class9242.field39634 < 3) {
            Class9242.field39635 = n7;
            n7 = Class9242.field39636;
        }
        else {
            Class9242.field39636 = n7;
            Class9242.field39635 = -1;
        }
        Class9242.field39634 = (Class9242.field39634 + 1) % 4;
        return n7 << 4;
    }
    
    public static boolean method34074() {
        return Class9242.field39634 == 0;
    }
    
    private static Direction[][] method34075(final boolean b) {
        final int n = 64;
        final Direction[][] array = new Direction[n][];
        for (int i = 0; i < n; ++i) {
            final ArrayList list = new ArrayList();
            for (int j = 0; j < Direction.VALUES.length; ++j) {
                final Direction class179 = Direction.VALUES[j];
                if ((i & 1 << (b ? class179.getOpposite() : class179).ordinal()) != 0x0) {
                    list.add(class179);
                }
            }
            array[i] = (Direction[])list.toArray(new Direction[list.size()]);
        }
        return array;
    }
    
    public static Direction[] method34076(final int n) {
        return Class9242.field39633[~n & 0x3F];
    }
    
    public static void method34077() {
        Class9242.field39637 = null;
    }
    
    static {
        field39632 = method34075(false);
        field39633 = method34075(true);
        Class9242.field39634 = 0;
        Class9242.field39635 = -1;
        Class9242.field39636 = 16;
        Class9242.field39637 = null;
        Class9242.field39638 = Integer.MIN_VALUE;
        Class9242.field39639 = Integer.MIN_VALUE;
    }
}
