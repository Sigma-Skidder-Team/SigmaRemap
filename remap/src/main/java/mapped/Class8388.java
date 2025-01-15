// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.IntPriorityQueue;
import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import net.minecraft.util.Direction;

import java.util.EnumSet;
import java.util.Set;
import java.util.BitSet;

public class Class8388
{
    private static String[] field34383;
    private static final int field34384;
    private static final int field34385;
    private static final int field34386;
    private static final Direction[] field34387;
    private final BitSet field34388;
    private static final int[] field34389;
    private int field34390;
    
    public Class8388() {
        this.field34388 = new BitSet(4096);
        this.field34390 = 4096;
    }
    
    public void method27958(final BlockPos class354) {
        this.field34388.set(method27959(class354), true);
        --this.field34390;
    }
    
    private static int method27959(final BlockPos class354) {
        return method27960(class354.getX() & 0xF, class354.getY() & 0xF, class354.getZ() & 0xF);
    }
    
    private static int method27960(final int n, final int n2, final int n3) {
        return n << 0 | n2 << 8 | n3 << 4;
    }
    
    public Class8336 method27961() {
        final Class8336 class8336 = new Class8336();
        if (4096 - this.field34390 >= 256) {
            if (this.field34390 != 0) {
                for (final int bitIndex : Class8388.field34389) {
                    if (!this.field34388.get(bitIndex)) {
                        class8336.method27779(this.method27963(bitIndex));
                    }
                }
            }
            else {
                class8336.method27781(false);
            }
        }
        else {
            class8336.method27781(true);
        }
        return class8336;
    }
    
    public Set<Direction> method27962(final BlockPos class354) {
        return this.method27963(method27959(class354));
    }
    
    private Set<Direction> method27963(final int bitIndex) {
        final EnumSet<Direction> none = EnumSet.noneOf(Direction.class);
        final IntArrayFIFOQueue intArrayFIFOQueue = new IntArrayFIFOQueue(384);
        ((IntPriorityQueue)intArrayFIFOQueue).enqueue(bitIndex);
        this.field34388.set(bitIndex, true);
        while (!((IntPriorityQueue)intArrayFIFOQueue).isEmpty()) {
            final int dequeueInt = ((IntPriorityQueue)intArrayFIFOQueue).dequeueInt();
            this.method27964(dequeueInt, none);
            final Direction[] field34387 = Class8388.field34387;
            for (int length = field34387.length, i = 0; i < length; ++i) {
                final int method27965 = this.method27965(dequeueInt, field34387[i]);
                if (method27965 >= 0) {
                    if (!this.field34388.get(method27965)) {
                        this.field34388.set(method27965, true);
                        ((IntPriorityQueue)intArrayFIFOQueue).enqueue(method27965);
                    }
                }
            }
        }
        return none;
    }
    
    private void method27964(final int n, final Set<Direction> set) {
        final int n2 = n >> 0 & 0xF;
        if (n2 != 0) {
            if (n2 == 15) {
                set.add(Direction.EAST);
            }
        }
        else {
            set.add(Direction.WEST);
        }
        final int n3 = n >> 8 & 0xF;
        if (n3 != 0) {
            if (n3 == 15) {
                set.add(Direction.UP);
            }
        }
        else {
            set.add(Direction.DOWN);
        }
        final int n4 = n >> 4 & 0xF;
        if (n4 != 0) {
            if (n4 == 15) {
                set.add(Direction.SOUTH);
            }
        }
        else {
            set.add(Direction.NORTH);
        }
    }
    
    private int method27965(final int n, final Direction class179) {
        switch (Class8133.field33506[class179.ordinal()]) {
            case 1: {
                if ((n >> 8 & 0xF) == 0x0) {
                    return -1;
                }
                return n - Class8388.field34386;
            }
            case 2: {
                if ((n >> 8 & 0xF) == 0xF) {
                    return -1;
                }
                return n + Class8388.field34386;
            }
            case 3: {
                if ((n >> 4 & 0xF) == 0x0) {
                    return -1;
                }
                return n - Class8388.field34385;
            }
            case 4: {
                if ((n >> 4 & 0xF) == 0xF) {
                    return -1;
                }
                return n + Class8388.field34385;
            }
            case 5: {
                if ((n >> 0 & 0xF) == 0x0) {
                    return -1;
                }
                return n - Class8388.field34384;
            }
            case 6: {
                if ((n >> 0 & 0xF) == 0xF) {
                    return -1;
                }
                return n + Class8388.field34384;
            }
            default: {
                return -1;
            }
        }
    }
    
    static {
        field34384 = (int)Math.pow(16.0, 0.0);
        field34385 = (int)Math.pow(16.0, 1.0);
        field34386 = (int)Math.pow(16.0, 2.0);
        field34387 = Direction.values();
        field34389 = Class8349.method27851(new int[1352], array -> {
            int i = 0;
            while (i < 16) {
                int j = 0;
                while (j < 16) {
                    int k = 0;
                    while (k < 16) {
                        Label_0127_1: {
                            if (i != 0) {
                                if (i != 15) {
                                    if (j != 0) {
                                        if (j != 15) {
                                            if (k != 0) {
                                                if (k != 15) {
                                                    break Label_0127_1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int n = 0;
                            n++;
                            final int n2;
                            array[n2] = method27960(i, j, k);
                        }
                        ++k;
                    }
                    ++j;
                }
                ++i;
            }
        });
    }
}
