// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.util.Map;

public class Class6638 extends Class6635
{
    private final Map<Long, Class7803<byte[], Class8110>> field26251;
    private static Constructor<?> field26252;
    private static HashMap<Short, Short> field26253;
    
    public Class6638(final Class6108 class6108) {
        super(class6108);
        this.field26251 = this.method20137();
    }
    
    public void method20127(final Class8322 class8322, int shortValue) {
        final Short n = Class6638.field26253.get((short)shortValue);
        if (n != null) {
            shortValue = n;
            final Class7803<byte[], Class8110> method20132 = this.method20132(this.method20134(class8322), false);
            final short method20133 = this.method20136(class8322);
            method20132.method25203()[method20133] = (byte)(shortValue >> 4);
            final Class8110 class8323 = method20132.method25204();
            if (class8323 != null) {
                class8323.method26657(method20133, shortValue);
            }
        }
    }
    
    public int method20128(final Class8322 class8322) {
        final Class7803 class8323 = this.field26251.get(this.method20134(class8322));
        if (class8323 != null) {
            final short method20136 = this.method20136(class8322);
            final Class8110 class8324 = (Class8110)class8323.method25204();
            return Class7559.method23731((((byte[])class8323.method25203())[method20136] & 0xFF) << 4 | ((class8324 != null) ? class8324.method26655(method20136) : 0));
        }
        return 0;
    }
    
    public void method20129(final Class8322 class8322) {
        final long method20134 = this.method20134(class8322);
        final Class7803 class8323 = this.field26251.get(method20134);
        if (class8323 != null) {
            final short method20135 = this.method20136(class8322);
            final Class8110 class8324 = (Class8110)class8323.method25204();
            if (class8324 != null) {
                class8324.method26657(method20135, 0);
                int n = 1;
                for (int i = 0; i < 4096; ++i) {
                    if (class8324.method26655(i) != 0) {
                        n = 0;
                        break;
                    }
                }
                if (n != 0) {
                    class8323.method25206(null);
                }
            }
            ((byte[])class8323.method25203())[method20135] = 0;
            final byte[] array = (byte[])class8323.method25203();
            for (int length = array.length, j = 0; j < length; ++j) {
                if (array[j] != 0) {
                    return;
                }
            }
            this.field26251.remove(method20134);
        }
    }
    
    public void method20130() {
        this.field26251.clear();
    }
    
    public void method20131(final int n, final int n2) {
        for (int i = 0; i < 256; i += 16) {
            this.field26251.remove(this.method20133(n << 4, i, n2 << 4));
        }
    }
    
    private Class7803<byte[], Class8110> method20132(final long n, final boolean b) {
        Class7803 class7803 = this.field26251.get(n);
        if (class7803 == null) {
            class7803 = new Class7803(new byte[4096], null);
            this.field26251.put(n, class7803);
        }
        if (class7803.method25204() == null) {
            if (b) {
                class7803.method25206(new Class8110(4096));
            }
        }
        return class7803;
    }
    
    private long method20133(final int n, final int n2, final int n3) {
        return ((long)(n >> 4) & 0x3FFFFFFL) << 38 | ((long)(n2 >> 4) & 0xFFFL) << 26 | ((long)(n3 >> 4) & 0x3FFFFFFL);
    }
    
    private long method20134(final Class8322 class8322) {
        return this.method20133(class8322.method27704().intValue(), class8322.method27705().intValue(), class8322.method27706().intValue());
    }
    
    private short method20135(final int n, final int n2, final int n3) {
        return (short)((n2 & 0xF) << 8 | (n & 0xF) << 4 | (n3 & 0xF));
    }
    
    private short method20136(final Class8322 class8322) {
        return this.method20135(class8322.method27704().intValue(), class8322.method27705().intValue(), class8322.method27706().intValue());
    }
    
    private <T> Map<Long, T> method20137() {
        if (Class6638.field26252 != null) {
            try {
                return (Map)Class6638.field26252.newInstance(new Object[0]);
            }
            catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
                ex.printStackTrace();
            }
        }
        return new HashMap<Long, T>();
    }
    
    static {
        try {
            Class6638.field26252 = Class.forName("it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap").getConstructor(new Class[0]);
            Class8563.method28793().method34742().info("Using FastUtil Long2ObjectOpenHashMap for block connections");
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {}
        Class6638.field26253 = new HashMap<Short, Short>();
        for (int i = 0; i < 4096; ++i) {
            final int method28390 = Class9526.field41014.method28390(i);
            if (method28390 != -1) {
                Class6638.field26253.put((short)method28390, (short)i);
            }
        }
    }
}
