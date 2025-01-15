// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class Class9541
{
    private static String[] field41071;
    public final Class9067 field41072;
    public final boolean[] field41073;
    private boolean field41074;
    public final /* synthetic */ Class1675 field41075;
    
    public Class9541(final Class1675 field41075, final Class9067 field41076) {
        this.field41075 = field41075;
        this.field41072 = field41076;
        this.field41073 = (boolean[])(field41076.field38403 ? null : new boolean[field41075.field9488]);
    }
    
    public void method35618() {
        if (this.field41072.field38404 == this) {
            for (int i = 0; i < this.field41075.field9488; ++i) {
                try {
                    this.field41075.field9481.method21316(this.field41072.field38402[i]);
                }
                catch (final IOException ex) {}
            }
            this.field41072.field38404 = null;
        }
    }
    
    public Class1682 method35619(final int n) {
        synchronized (this.field41075) {
            if (this.field41074) {
                throw new IllegalStateException();
            }
            if (!this.field41072.field38403 || this.field41072.field38404 != this) {
                return null;
            }
            try {
                return this.field41075.field9481.method21313(this.field41072.field38401[n]);
            }
            catch (final FileNotFoundException ex) {
                return null;
            }
        }
    }
    
    public Class1676 method35620(final int n) {
        synchronized (this.field41075) {
            if (this.field41074) {
                throw new IllegalStateException();
            }
            if (this.field41072.field38404 != this) {
                return Class8753.method30287();
            }
            if (!this.field41072.field38403) {
                this.field41073[n] = true;
            }
            final File file = this.field41072.field38402[n];
            Class1676 method21314;
            try {
                method21314 = this.field41075.field9481.method21314(file);
            }
            catch (final FileNotFoundException ex) {
                return Class8753.method30287();
            }
            return new Class1705(this, method21314);
        }
    }
    
    public void method35621() throws IOException {
        synchronized (this.field41075) {
            if (this.field41074) {
                throw new IllegalStateException();
            }
            if (this.field41072.field38404 == this) {
                this.field41075.method5909(this, true);
            }
            this.field41074 = true;
        }
    }
    
    public void method35622() throws IOException {
        synchronized (this.field41075) {
            if (this.field41074) {
                throw new IllegalStateException();
            }
            if (this.field41072.field38404 == this) {
                this.field41075.method5909(this, false);
            }
            this.field41074 = true;
        }
    }
    
    public void method35623() {
        synchronized (this.field41075) {
            if (!this.field41074 && this.field41072.field38404 == this) {
                try {
                    this.field41075.method5909(this, false);
                }
                catch (final IOException ex) {}
            }
        }
    }
}
