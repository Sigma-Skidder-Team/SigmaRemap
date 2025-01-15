// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;

public final class Class6905
{
    public boolean field27083;
    public boolean field27084;
    public int field27085;
    public int field27086;
    public int field27087;
    public boolean field27088;
    public boolean field27089;
    public boolean field27090;
    
    public Class6905() {
        this.field27085 = -1;
        this.field27086 = -1;
        this.field27087 = -1;
    }
    
    public Class6905 method21260() {
        this.field27083 = true;
        return this;
    }
    
    public Class6905 method21261() {
        this.field27084 = true;
        return this;
    }
    
    public Class6905 method21262(final int i, final TimeUnit timeUnit) {
        if (i >= 0) {
            final long seconds = timeUnit.toSeconds(i);
            this.field27085 = ((seconds <= 2147483647L) ? ((int)seconds) : Integer.MAX_VALUE);
            return this;
        }
        throw new IllegalArgumentException("maxAge < 0: " + i);
    }
    
    public Class6905 method21263(final int i, final TimeUnit timeUnit) {
        if (i >= 0) {
            final long seconds = timeUnit.toSeconds(i);
            this.field27086 = ((seconds <= 2147483647L) ? ((int)seconds) : Integer.MAX_VALUE);
            return this;
        }
        throw new IllegalArgumentException("maxStale < 0: " + i);
    }
    
    public Class6905 method21264(final int i, final TimeUnit timeUnit) {
        if (i >= 0) {
            final long seconds = timeUnit.toSeconds(i);
            this.field27087 = ((seconds <= 2147483647L) ? ((int)seconds) : Integer.MAX_VALUE);
            return this;
        }
        throw new IllegalArgumentException("minFresh < 0: " + i);
    }
    
    public Class6905 method21265() {
        this.field27088 = true;
        return this;
    }
    
    public Class6905 method21266() {
        this.field27089 = true;
        return this;
    }
    
    public Class6905 method21267() {
        this.field27090 = true;
        return this;
    }
    
    public Class6668 method21268() {
        return new Class6668(this);
    }
}
