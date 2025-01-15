// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.File;
import java.io.Flushable;
import java.io.Closeable;

public final class Class1726 implements Closeable, Flushable
{
    private static final int field9648 = 201105;
    private static final int field9649 = 0;
    private static final int field9650 = 1;
    private static final int field9651 = 2;
    public final Class8674 field9652;
    public final Class1675 field9653;
    public int field9654;
    public int field9655;
    private int field9656;
    private int field9657;
    private int field9658;
    
    public Class1726(final File file, final long n) {
        this(file, n, Class6940.field27177);
    }
    
    public Class1726(final File file, final long n, final Class6940 class6940) {
        this.field9652 = new Class8675(this);
        this.field9653 = Class1675.method5896(class6940, file, 201105, 2, n);
    }
    
    public static String method6074(final Class8846 class8846) {
        return Class1929.method7741(class8846.toString()).method7746().method7757();
    }
    
    @Nullable
    public Class1753 method6075(final Class8596 class8596) {
        final String method6074 = method6074(class8596.method29109());
        Class1668 method6075;
        try {
            method6075 = this.field9653.method5902(method6074);
            if (method6075 == null) {
                return null;
            }
        }
        catch (final IOException ex) {
            return null;
        }
        Class7722 class8597;
        try {
            class8597 = new Class7722(method6075.method5883(0));
        }
        catch (final IOException ex2) {
            Class7690.method24432(method6075);
            return null;
        }
        final Class1753 method6076 = class8597.method24657(method6075);
        if (!class8597.method24656(class8596, method6076)) {
            Class7690.method24432(method6076.method6197());
            return null;
        }
        return method6076;
    }
    
    @Nullable
    public Class6050 method6076(final Class1753 class1753) {
        final String method29110 = class1753.method6186().method29110();
        if (Class8196.method27142(class1753.method6186().method29110())) {
            try {
                this.method6077(class1753.method6186());
            }
            catch (final IOException ex) {}
            return null;
        }
        if (!method29110.equals("GET")) {
            return null;
        }
        if (Class9558.method35755(class1753)) {
            return null;
        }
        final Class7722 class1754 = new Class7722(class1753);
        Class9541 method29111 = null;
        try {
            method29111 = this.field9653.method5903(method6074(class1753.method6186().method29109()));
            if (method29111 == null) {
                return null;
            }
            class1754.method24652(method29111);
            return new Class6051(this, method29111);
        }
        catch (final IOException ex2) {
            this.method6079(method29111);
            return null;
        }
    }
    
    public void method6077(final Class8596 class8596) throws IOException {
        this.field9653.method5911(method6074(class8596.method29109()));
    }
    
    public void method6078(final Class1753 class1753, final Class1753 class1754) {
        final Class7722 class1755 = new Class7722(class1754);
        final Class1668 field9813 = ((Class1763)class1753.method6197()).field9813;
        Class9541 method5882 = null;
        try {
            method5882 = field9813.method5882();
            if (method5882 != null) {
                class1755.method24652(method5882);
                method5882.method35621();
            }
        }
        catch (final IOException ex) {
            this.method6079(method5882);
        }
    }
    
    private void method6079(final Class9541 class9541) {
        try {
            if (class9541 != null) {
                class9541.method35622();
            }
        }
        catch (final IOException ex) {}
    }
    
    public void method6080() throws IOException {
        this.field9653.method5895();
    }
    
    public void method6081() throws IOException {
        this.field9653.method5916();
    }
    
    public void method6082() throws IOException {
        this.field9653.method5917();
    }
    
    public Iterator<String> method6083() throws IOException {
        return new Class7251(this);
    }
    
    public synchronized int method6084() {
        return this.field9655;
    }
    
    public synchronized int method6085() {
        return this.field9654;
    }
    
    public long method6086() throws IOException {
        return this.field9653.method5908();
    }
    
    public long method6087() {
        return this.field9653.method5906();
    }
    
    @Override
    public void flush() throws IOException {
        this.field9653.flush();
    }
    
    @Override
    public void close() throws IOException {
        this.field9653.close();
    }
    
    public File method6088() {
        return this.field9653.method5905();
    }
    
    public boolean method6089() {
        return this.field9653.method5913();
    }
    
    public synchronized void method6090(final Class8016 class8016) {
        ++this.field9658;
        if (class8016.field33021 == null) {
            if (class8016.field33022 != null) {
                ++this.field9657;
            }
        }
        else {
            ++this.field9656;
        }
    }
    
    public synchronized void method6091() {
        ++this.field9657;
    }
    
    public synchronized int method6092() {
        return this.field9656;
    }
    
    public synchronized int method6093() {
        return this.field9657;
    }
    
    public synchronized int method6094() {
        return this.field9658;
    }
    
    public static int method6095(final Class1681 class1681) throws IOException {
        try {
            final long method5972 = class1681.method5972();
            final String method5973 = class1681.method5985();
            if (method5972 < 0L || method5972 > 2147483647L || !method5973.isEmpty()) {
                throw new IOException("expected an int but was \"" + method5972 + method5973 + "\"");
            }
            return (int)method5972;
        }
        catch (final NumberFormatException ex) {
            throw new IOException(ex.getMessage());
        }
    }
}
