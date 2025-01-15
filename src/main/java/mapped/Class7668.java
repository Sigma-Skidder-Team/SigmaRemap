// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Class7668
{
    public static final int field30458 = 4096;
    public static final int field30459 = 2048;
    private List<Integer> field30460;
    private Map<Integer, Integer> field30461;
    private final int[] field30462;
    private Class8110 field30463;
    private Class8110 field30464;
    private int field30465;
    
    public Class7668() {
        this.field30460 = new ArrayList<Integer>();
        this.field30461 = new HashMap<Integer, Integer>();
        this.field30462 = new int[4096];
        this.field30463 = new Class8110(4096);
        this.method24331(0);
    }
    
    public void method24318(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.method24333(method24342(n, n2, n3), n4 << 4 | (n5 & 0xF));
    }
    
    public void method24319(final int n, final int n2, final int n3, final int n4) {
        this.method24333(method24342(n, n2, n3), n4);
    }
    
    public int method24320(final int n, final int n2, final int n3) {
        return this.method24322(n, n2, n3) >> 4;
    }
    
    public int method24321(final int n, final int n2, final int n3) {
        return this.method24322(n, n2, n3) & 0xF;
    }
    
    public int method24322(final int n, final int n2, final int n3) {
        return this.field30460.get(this.field30462[method24342(n, n2, n3)]);
    }
    
    public int method24323(final int n) {
        return this.field30460.get(this.field30462[n]);
    }
    
    public void method24324(final int n, final int n2, final int n3) {
        this.method24333(n, n2 << 4 | (n3 & 0xF));
    }
    
    public void method24325(final int n, final int n2) {
        this.field30462[n] = n2;
    }
    
    public int method24326(final int n) {
        return this.field30462[n];
    }
    
    public int method24327() {
        return this.field30460.size();
    }
    
    public int method24328(final int n) {
        if (n >= 0 && n < this.field30460.size()) {
            return this.field30460.get(n);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public void method24329(final int i, final int n) {
        if (i < 0 || i >= this.field30460.size()) {
            throw new IndexOutOfBoundsException();
        }
        final int intValue = this.field30460.set(i, n);
        if (intValue != n) {
            this.field30461.put(n, i);
            if (this.field30461.get(intValue) == i) {
                this.field30461.remove(intValue);
                for (int j = 0; j < this.field30460.size(); ++j) {
                    if (this.field30460.get(j) == intValue) {
                        this.field30461.put(intValue, j);
                        break;
                    }
                }
            }
        }
    }
    
    public void method24330(final int i, final int n) {
        final Integer n2 = this.field30461.remove(i);
        if (n2 != null) {
            this.field30461.put(n, n2);
            for (int j = 0; j < this.field30460.size(); ++j) {
                if (this.field30460.get(j) == i) {
                    this.field30460.set(j, n);
                }
            }
        }
    }
    
    public void method24331(final int n) {
        this.field30461.put(n, this.field30460.size());
        this.field30460.add(n);
    }
    
    public void method24332() {
        this.field30460.clear();
        this.field30461.clear();
    }
    
    public void method24333(final int n, final int i) {
        Integer value = this.field30461.get(i);
        if (value == null) {
            value = this.field30460.size();
            this.field30460.add(i);
            this.field30461.put(i, value);
        }
        this.field30462[n] = value;
    }
    
    public void method24334(final byte[] array) {
        if (array.length == 2048) {
            if (this.field30463 != null) {
                this.field30463.method26662(array);
            }
            else {
                this.field30463 = new Class8110(array);
            }
            return;
        }
        throw new IllegalArgumentException("Data length != 2048");
    }
    
    public void method24335(final byte[] array) {
        if (array.length == 2048) {
            if (this.field30464 != null) {
                this.field30464.method26662(array);
            }
            else {
                this.field30464 = new Class8110(array);
            }
            return;
        }
        throw new IllegalArgumentException("Data length != 2048");
    }
    
    public byte[] method24336() {
        return (byte[])((this.field30463 != null) ? this.field30463.method26661() : null);
    }
    
    public Class8110 method24337() {
        return this.field30463;
    }
    
    public byte[] method24338() {
        return (byte[])((this.field30464 != null) ? this.field30464.method26661() : null);
    }
    
    public Class8110 method24339() {
        return this.field30464;
    }
    
    public void method24340(final ByteBuf byteBuf) {
        if (this.field30463 == null) {
            this.field30463 = new Class8110(4096);
        }
        byteBuf.readBytes(this.field30463.method26661());
    }
    
    public void method24341(final ByteBuf byteBuf) {
        if (this.field30464 == null) {
            this.field30464 = new Class8110(4096);
        }
        byteBuf.readBytes(this.field30464.method26661());
    }
    
    public static int method24342(final int n, final int n2, final int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
    
    public void method24343(final ByteBuf byteBuf) {
        byteBuf.writeBytes(this.field30463.method26661());
    }
    
    public void method24344(final ByteBuf byteBuf) {
        byteBuf.writeBytes(this.field30464.method26661());
    }
    
    public boolean method24345() {
        return this.field30464 != null;
    }
    
    public boolean method24346() {
        return this.field30463 != null;
    }
    
    public int method24347() {
        return this.field30465;
    }
    
    public void method24348(final int field30465) {
        this.field30465 = field30465;
    }
}
