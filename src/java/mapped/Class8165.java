// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public final class Class8165
{
    private static final int field33634 = 1;
    private static final int field33635 = 2;
    public static final Class1929 field33636;
    public static final Class1929 field33637;
    private static final long field33638 = 32L;
    public RandomAccessFile field33639;
    public Thread field33640;
    public Class1682 field33641;
    public final Class1680 field33642;
    public long field33643;
    public boolean field33644;
    private final Class1929 field33645;
    public final Class1680 field33646;
    public final long field33647;
    public int field33648;
    
    private Class8165(final RandomAccessFile field33639, final Class1682 field33640, final long field33641, final Class1929 field33642, final long field33643) {
        this.field33642 = new Class1680();
        this.field33646 = new Class1680();
        this.field33639 = field33639;
        this.field33641 = field33640;
        this.field33644 = (field33640 == null);
        this.field33643 = field33641;
        this.field33645 = field33642;
        this.field33647 = field33643;
    }
    
    public static Class8165 method26993(final File file, final Class1682 class1682, final Class1929 class1683, final long n) throws IOException {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        final Class8165 class1684 = new Class8165(randomAccessFile, class1682, 0L, class1683, n);
        randomAccessFile.setLength(0L);
        class1684.method26995(Class8165.field33637, -1L, -1L);
        return class1684;
    }
    
    public static Class8165 method26994(final File file) throws IOException {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        final Class9414 class9414 = new Class9414(randomAccessFile.getChannel());
        final Class1680 class9415 = new Class1680();
        class9414.method35012(0L, class9415, 32L);
        if (class9415.method5975(Class8165.field33636.method7766()).equals(Class8165.field33636)) {
            final long method5968 = class9415.method5968();
            final long method5969 = class9415.method5968();
            final Class1680 class9416 = new Class1680();
            class9414.method35012(32L + method5968, class9416, method5969);
            return new Class8165(randomAccessFile, null, method5968, class9416.method5974(), 0L);
        }
        throw new IOException("unreadable cache file");
    }
    
    private void method26995(final Class1929 class1929, final long n, final long n2) throws IOException {
        final Class1680 class1930 = new Class1680();
        class1930.method5996(class1929);
        class1930.method6009(n);
        class1930.method6009(n2);
        if (class1930.method5949() == 32L) {
            new Class9414(this.field33639.getChannel()).method35011(0L, class1930, 32L);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    private void method26996(final long n) throws IOException {
        final Class1680 class1680 = new Class1680();
        class1680.method5996(this.field33645);
        new Class9414(this.field33639.getChannel()).method35011(32L + n, class1680, this.field33645.method7766());
    }
    
    public void method26997(final long n) throws IOException {
        this.method26996(n);
        this.field33639.getChannel().force(false);
        this.method26995(Class8165.field33636, n, this.field33645.method7766());
        this.field33639.getChannel().force(false);
        synchronized (this) {
            this.field33644 = true;
        }
        Class7690.method24432(this.field33641);
        this.field33641 = null;
    }
    
    public boolean method26998() {
        return this.field33639 == null;
    }
    
    public Class1929 method26999() {
        return this.field33645;
    }
    
    public Class1682 method27000() {
        synchronized (this) {
            if (this.field33639 == null) {
                return null;
            }
            ++this.field33648;
        }
        return new Class1699(this);
    }
    
    static {
        field33636 = Class1929.method7741("OkHttp cache v1\n");
        field33637 = Class1929.method7741("OkHttp DIRTY :(\n");
    }
}
