// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6639 extends Class6635 implements Class6640
{
    private static String[] field26254;
    private final Map<Integer, Class266> field26255;
    private final Map<Integer, Byte> field26256;
    private final Map<Integer, Byte> field26257;
    private final Map<Integer, Byte> field26258;
    private int field26259;
    private int field26260;
    private boolean field26261;
    private int field26262;
    private int field26263;
    
    public Class6639(final Class6108 class6108) {
        super(class6108);
        this.field26255 = new ConcurrentHashMap<Integer, Class266>();
        this.field26256 = new ConcurrentHashMap<Integer, Byte>();
        this.field26257 = new ConcurrentHashMap<Integer, Byte>();
        this.field26258 = new ConcurrentHashMap<Integer, Byte>();
        this.field26261 = true;
    }
    
    public void method20138(final int n) {
        this.field26255.remove(n);
        this.field26256.remove(n);
        this.field26257.remove(n);
        this.field26258.remove(n);
    }
    
    public void method20139(final int i, final Class266 class266) {
        this.field26255.put(i, class266);
    }
    
    public byte method20140(final int i) {
        final Byte b = this.field26256.get(i);
        return (byte)((b != null) ? ((byte)b) : 0);
    }
    
    public void method20141(final int i, final byte b) {
        this.field26256.put(i, b);
    }
    
    private static byte method20142(final Byte b) {
        if (b != null) {
            return b;
        }
        return 0;
    }
    
    public boolean method20143(final int i) {
        return (method20142(this.field26257.get(i)) & 0x1) != 0x0;
    }
    
    public void method20144(final int i, final boolean b) {
        final byte b2 = (byte)((method20142(this.field26257.get(i)) & 0xFFFFFFFE) | (b ? 1 : 0));
        if (b2 != 0) {
            this.field26257.put(i, b2);
        }
        else {
            this.field26257.remove(i);
        }
    }
    
    public boolean method20145(final int i) {
        return (method20142(this.field26257.get(i)) & 0x2) != 0x0;
    }
    
    public void method20146(final int i, final boolean b) {
        final byte b2 = (byte)((method20142(this.field26257.get(i)) & 0xFFFFFFFD) | (b ? 2 : 0));
        if (b2 != 0) {
            this.field26257.put(i, b2);
        }
        else {
            this.field26257.remove(i);
        }
    }
    
    public boolean method20147(final int i) {
        return this.field26255.containsKey(i);
    }
    
    public Optional<Class266> method20148(final int i) {
        return (Optional<Class266>)Optional.fromNullable((Object)this.field26255.get(i));
    }
    
    @Override
    public void method20099(final int n) {
        this.field26260 = n;
        this.field26255.put(n, Class266.field1309);
        final Class8699 class8699 = new Class8699(65, null, this.method20121());
        class8699.method29823(Class5260.field22312, 64);
        try {
            class8699.method29831(Class5213.class, true, true);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public byte method20149(final int i) {
        return method20142(this.field26258.get(i));
    }
    
    public void method20150(final int i, final byte b) {
        this.field26258.put(i, b);
    }
    
    public int method20151() {
        return this.field26259;
    }
    
    public void method20152(final int field26259) {
        this.field26259 = field26259;
    }
    
    public int method20153() {
        return this.field26260;
    }
    
    public void method20154(final int field26260) {
        this.field26260 = field26260;
    }
    
    public boolean method20155() {
        return this.field26261;
    }
    
    public void method20156(final boolean field26261) {
        this.field26261 = field26261;
    }
    
    public int method20157() {
        return this.field26262;
    }
    
    public int method20158() {
        return this.field26263;
    }
    
    public void method20159(final int field26262) {
        this.field26262 = field26262;
    }
    
    public void method20160(final int field26263) {
        this.field26263 = field26263;
    }
}
