// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileNotFoundException;
import java.io.Closeable;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;

public final class Class9067
{
    public final String field38399;
    public final long[] field38400;
    public final File[] field38401;
    public final File[] field38402;
    public boolean field38403;
    public Class9541 field38404;
    public long field38405;
    public final /* synthetic */ Class1675 field38406;
    
    public Class9067(final Class1675 field38406, final String s) {
        this.field38406 = field38406;
        this.field38399 = s;
        this.field38400 = new long[field38406.field9488];
        this.field38401 = new File[field38406.field9488];
        this.field38402 = new File[field38406.field9488];
        final StringBuilder append = new StringBuilder(s).append('.');
        final int length = append.length();
        for (int i = 0; i < field38406.field9488; ++i) {
            append.append(i);
            this.field38401[i] = new File(field38406.field9482, append.toString());
            append.append(".tmp");
            this.field38402[i] = new File(field38406.field9482, append.toString());
            append.setLength();
        }
    }
    
    public void method32658(final String[] array) throws IOException {
        if (array.length != this.field38406.field9488) {
            throw this.method32660(array);
        }
        try {
            for (int i = 0; i < array.length; ++i) {
                this.field38400[i] = Long.parseLong(array[i]);
            }
        }
        catch (final NumberFormatException ex) {
            throw this.method32660(array);
        }
    }
    
    public void method32659(final Class1679 class1679) throws IOException {
        final long[] field38400 = this.field38400;
        for (int length = field38400.length, i = 0; i < length; ++i) {
            class1679.method5937(32).method5944(field38400[i]);
        }
    }
    
    private IOException method32660(final String[] a) throws IOException {
        throw new IOException("unexpected journal line: " + Arrays.toString(a));
    }
    
    public Class1668 method32661() {
        if (!Thread.holdsLock(this.field38406)) {
            throw new AssertionError();
        }
        final Class1682[] array = new Class1682[this.field38406.field9488];
        final long[] array2 = this.field38400.clone();
        try {
            for (int i = 0; i < this.field38406.field9488; ++i) {
                array[i] = this.field38406.field9481.method21313(this.field38401[i]);
            }
            return new Class1668(this.field38406, this.field38399, this.field38405, array, array2);
        }
        catch (final FileNotFoundException ex) {
            for (int n = 0; n < this.field38406.field9488 && array[n] != null; ++n) {
                Class7690.method24432(array[n]);
            }
            try {
                this.field38406.method5912(this);
            }
            catch (final IOException ex2) {}
            return null;
        }
    }
}
