// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.BufferUtils;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Class7777 implements Class7776
{
    private static String[] field31837;
    public static Class6448 field31838;
    public static Class7776 field31839;
    private int field31840;
    private int field31841;
    private int field31842;
    private int field31843;
    private int field31844;
    private int field31845;
    private float field31846;
    private float field31847;
    private boolean field31848;
    private String field31849;
    private String field31850;
    private Class9044 field31851;
    
    public static Class7776 method24927() {
        return Class7777.field31839;
    }
    
    public Class7777() {
    }
    
    public Class7777(final String field31849, final int field31850, final int field31851) {
        this.field31840 = field31850;
        this.field31849 = field31849;
        this.field31841 = field31851;
        Class7777.field31839 = this;
    }
    
    public void method24928(final String field31850) {
        this.field31850 = field31850;
    }
    
    @Override
    public boolean method24914() {
        return this.field31848;
    }
    
    @Override
    public String method24915() {
        return this.field31849;
    }
    
    public void method24929(final boolean field31848) {
        this.field31848 = field31848;
    }
    
    public static void method24930() {
        Class7777.field31839 = null;
        Class7777.field31838.method19264(3553);
    }
    
    public static void method24931() {
        Class7777.field31839 = null;
    }
    
    @Override
    public void method24916() {
        if (Class7777.field31839 != this) {
            Class7777.field31839 = this;
            Class7777.field31838.method19265(3553);
            Class7777.field31838.method19258(this.field31840, this.field31841);
        }
    }
    
    public void method24932(final int field31842) {
        this.field31842 = field31842;
        this.method24936();
    }
    
    public void method24933(final int field31843) {
        this.field31843 = field31843;
        this.method24937();
    }
    
    @Override
    public int method24917() {
        return this.field31842;
    }
    
    @Override
    public int method24918() {
        return this.field31843;
    }
    
    @Override
    public float method24919() {
        return this.field31847;
    }
    
    @Override
    public float method24920() {
        return this.field31846;
    }
    
    @Override
    public int method24921() {
        return this.field31845;
    }
    
    @Override
    public int method24922() {
        return this.field31844;
    }
    
    public void method24934(final int field31845) {
        this.field31845 = field31845;
        this.method24936();
    }
    
    public void method24935(final int field31844) {
        this.field31844 = field31844;
        this.method24937();
    }
    
    private void method24936() {
        if (this.field31845 != 0) {
            this.field31847 = this.field31842 / (float)this.field31845;
        }
    }
    
    private void method24937() {
        if (this.field31844 != 0) {
            this.field31846 = this.field31843 / (float)this.field31844;
        }
    }
    
    @Override
    public void method24923() {
        final IntBuffer method24939 = this.method24939(1);
        method24939.put(this.field31841);
        method24939.flip();
        Class7777.field31838.method19282(method24939);
        if (Class7777.field31839 == this) {
            method24930();
        }
        if (this.field31850 == null) {
            Class7649.method24214().method24218(this.field31849);
        }
        else {
            Class7649.method24214().method24218(this.field31850);
        }
    }
    
    @Override
    public int method24924() {
        return this.field31841;
    }
    
    public void method24938(final int field31841) {
        this.field31841 = field31841;
    }
    
    public IntBuffer method24939(final int n) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4 * n);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asIntBuffer();
    }
    
    @Override
    public byte[] method24925() {
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer((this.method24914() ? 4 : 3) * this.field31844 * this.field31845);
        this.method24916();
        Class7777.field31838.method19286(3553, 0, this.method24914() ? 6408 : 6407, 5121, byteBuffer);
        final byte[] dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst);
        byteBuffer.clear();
        return dst;
    }
    
    @Override
    public void method24926(final int n) {
        this.method24916();
        Class7777.field31838.method19289(this.field31840, 10241, n);
        Class7777.field31838.method19289(this.field31840, 10240, n);
    }
    
    public void method24940(final int n, final int n2, final int n3, final int n4, final ByteBuffer byteBuffer) {
        Class9044.method32521(this.field31851 = new Class9044(this, null), n);
        Class9044.method32522(this.field31851, n2);
        Class9044.method32523(this.field31851, n3);
        Class9044.method32524(this.field31851, n4);
        Class9044.method32525(this.field31851, byteBuffer);
    }
    
    public void method24941() {
        if (this.field31851 != null) {
            this.field31841 = this.field31851.method32520();
        }
    }
    
    static {
        Class7777.field31838 = Class7840.method25330();
    }
}