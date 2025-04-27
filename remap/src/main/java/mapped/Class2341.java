// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.BitstreamException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;

public final class Class2341 implements Class2340
{
    public static byte field14091;
    public static byte field14092;
    private static final int field14093 = 433;
    private final int[] field14094;
    private int field14095;
    private final byte[] field14096;
    private int field14097;
    private int field14098;
    private int field14099;
    private int field14100;
    private boolean field14101;
    private final int[] field14102;
    private final PushbackInputStream field14103;
    private final Class8664 field14104;
    private final byte[] field14105;
    private final Class9410[] field14106;
    private byte[] field14107;
    private boolean field14108;
    
    public Class2341(final InputStream in) {
        this.field14094 = new int[433];
        this.field14096 = new byte[1732];
        this.field14100 = 0;
        this.field14102 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071 };
        this.field14104 = new Class8664();
        this.field14105 = new byte[4];
        this.field14106 = new Class9410[1];
        this.field14107 = null;
        this.field14108 = true;
        if (in != null) {
            final BufferedInputStream in2 = new BufferedInputStream(in);
            this.method9456(in2);
            this.field14108 = true;
            this.field14103 = new PushbackInputStream(in2, 1732);
            this.method9464();
            return;
        }
        throw new NullPointerException("in");
    }
    
    public int method9455() {
        return this.field14100;
    }
    
    private void method9456(final InputStream inputStream) {
        int method9457 = -1;
        try {
            inputStream.mark(10);
            method9457 = this.method9457(inputStream);
            this.field14100 = method9457;
            try {
                inputStream.reset();
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex2) {}
        finally {
            try {
                inputStream.reset();
            }
            catch (final IOException ex3) {}
        }
        try {
            if (method9457 > 0) {
                inputStream.read(this.field14107 = new byte[method9457], 0, this.field14107.length);
            }
        }
        catch (final IOException ex4) {}
    }
    
    private int method9457(final InputStream inputStream) throws IOException {
        final byte[] b = new byte[4];
        int n = -10;
        inputStream.read(b, 0, 3);
        if (b[0] == 73) {
            if (b[1] == 68) {
                if (b[2] == 51) {
                    inputStream.read(b, 0, 3);
                    final byte b2 = b[0];
                    final byte b3 = b[1];
                    inputStream.read(b, 0, 4);
                    n = (b[0] << 21) + (b[1] << 14) + (b[2] << 7) + b[3];
                }
            }
        }
        return n + 10;
    }
    
    public InputStream method9458() {
        if (this.field14107 != null) {
            return new ByteArrayInputStream(this.field14107);
        }
        return null;
    }
    
    public void method9459() throws BitstreamException {
        try {
            this.field14103.close();
        }
        catch (final IOException ex) {
            throw this.method9469(258, ex);
        }
    }
    
    public Class8664 method9460() throws BitstreamException {
        Class8664 class8664 = null;
        try {
            class8664 = this.method9461();
            if (this.field14108) {
                class8664.method29636(this.field14096);
                this.field14108 = false;
            }
        }
        catch (final Class2339 class8665) {
            if (class8665.method9453() == 261) {
                try {
                    this.method9464();
                    class8664 = this.method9461();
                }
                catch (final Class2339 class8666) {
                    if (class8666.method9453() != 260) {
                        throw this.method9469(class8666.method9453(), class8666);
                    }
                }
            }
            else if (class8665.method9453() != 260) {
                throw this.method9469(class8665.method9453(), class8665);
            }
        }
        return class8664;
    }
    
    private Class8664 method9461() throws BitstreamException {
        if (this.field14095 == -1) {
            this.method9462();
        }
        return this.field14104;
    }
    
    private void method9462() throws BitstreamException {
        this.field14104.method29635(this, this.field14106);
    }
    
    public void method9463() throws BitstreamException {
        if (this.field14097 == -1 && this.field14098 == -1 && this.field14095 > 0) {
            try {
                this.field14103.unread(this.field14096, 0, this.field14095);
            }
            catch (final IOException ex) {
                throw this.method9468(258);
            }
        }
    }
    
    public void method9464() {
        this.field14095 = -1;
        this.field14097 = -1;
        this.field14098 = -1;
    }
    
    public boolean method9465(final int n) throws BitstreamException {
        final int method9477 = this.method9477(this.field14105, 0, 4);
        final int n2 = (this.field14105[0] << 24 & 0xFF000000) | (this.field14105[1] << 16 & 0xFF0000) | (this.field14105[2] << 8 & 0xFF00) | (this.field14105[3] << 0 & 0xFF);
        try {
            this.field14103.unread(this.field14105, 0, method9477);
        }
        catch (final IOException ex) {}
        boolean method9478 = false;
        switch (method9477) {
            case 0: {
                method9478 = true;
                break;
            }
            case 4: {
                method9478 = this.method9471(n2, n, this.field14099);
                break;
            }
        }
        return method9478;
    }
    
    public int method9466(final int n) {
        return this.method9474(n);
    }
    
    public int method9467(final int n) {
        return this.method9474(n);
    }
    
    public Class2339 method9468(final int n) {
        return new Class2339(n, null);
    }
    
    public Class2339 method9469(final int n, final Throwable t) {
        return new Class2339(n, t);
    }
    
    public int method9470(final byte b) throws BitstreamException {
        if (this.method9477(this.field14105, 0, 3) != 3) {
            throw this.method9469(260, null);
        }
        int n = (this.field14105[0] << 16 & 0xFF0000) | (this.field14105[1] << 8 & 0xFF00) | (this.field14105[2] << 0 & 0xFF);
        while (true) {
            final int n2 = n << 8;
            if (this.method9477(this.field14105, 3, 1) != 1) {
                throw this.method9469(260, null);
            }
            n = (n2 | (this.field14105[3] & 0xFF));
            if (!this.method9471(n, b, this.field14099)) {
                continue;
            }
            return n;
        }
    }
    
    public boolean method9471(final int n, final int n2, final int n3) {
        boolean b;
        if (n2 != Class2341.field14091) {
            b = ((n & 0xFFF80C00) == n3 && (n & 0xC0) == 0xC0 == this.field14101);
        }
        else {
            b = ((n & 0xFFE00000) == 0xFFE00000);
        }
        if (b) {
            b = ((n >>> 10 & 0x3) != 0x3);
        }
        if (b) {
            b = ((n >>> 17 & 0x3) != 0x0);
        }
        if (b) {
            b = ((n >>> 19 & 0x3) != 0x1);
        }
        return b;
    }
    
    public int method9472(final int field14095) throws BitstreamException {
        final int method9476 = this.method9476(this.field14096, 0, field14095);
        this.field14095 = field14095;
        this.field14097 = -1;
        this.field14098 = -1;
        return method9476;
    }
    
    public void method9473() throws BitstreamException {
        int n = 0;
        final byte[] field14096 = this.field14096;
        for (int field14097 = this.field14095, i = 0; i < field14097; i += 4) {
            int n2 = 0;
            int n3 = 0;
            byte b = 0;
            final byte b2 = field14096[i];
            if (i + 1 < field14097) {
                n2 = field14096[i + 1];
            }
            if (i + 2 < field14097) {
                n3 = field14096[i + 2];
            }
            if (i + 3 < field14097) {
                b = field14096[i + 3];
            }
            this.field14094[n++] = ((b2 << 24 & 0xFF000000) | (n2 << 16 & 0xFF0000) | (n3 << 8 & 0xFF00) | (b & 0xFF));
        }
        this.field14097 = 0;
        this.field14098 = 0;
    }
    
    public int method9474(final int n) {
        final int n2 = this.field14098 + n;
        if (this.field14097 < 0) {
            this.field14097 = 0;
        }
        if (n2 > 32) {
            final int n3 = this.field14094[this.field14097] & 0xFFFF;
            ++this.field14097;
            final int n4 = ((n3 << 16 & 0xFFFF0000) | ((this.field14094[this.field14097] & 0xFFFF0000) >>> 16 & 0xFFFF)) >>> 48 - n2 & this.field14102[n];
            this.field14098 = n2 - 32;
            return n4;
        }
        final int n5 = this.field14094[this.field14097] >>> 32 - n2 & this.field14102[n];
        if ((this.field14098 += n) == 32) {
            this.field14098 = 0;
            ++this.field14097;
        }
        return n5;
    }
    
    public void method9475(final int n) {
        this.field14099 = (n & 0xFFFFFF3F);
        this.field14101 = ((n & 0xC0) == 0xC0);
    }
    
    private int method9476(final byte[] b, int off, int i) throws BitstreamException {
        int n = 0;
        try {
            while (i > 0) {
                final int read = this.field14103.read(b, off, i);
                if (read == -1) {
                    while (i-- > 0) {
                        b[off++] = 0;
                    }
                    break;
                }
                n += read;
                off += read;
                i -= read;
            }
        }
        catch (final IOException ex) {
            throw this.method9469(258, ex);
        }
        return n;
    }
    
    private int method9477(final byte[] b, int off, int i) throws BitstreamException {
        int n = 0;
        try {
            while (i > 0) {
                final int read = this.field14103.read(b, off, i);
                if (read == -1) {
                    break;
                }
                n += read;
                off += read;
                i -= read;
            }
        }
        catch (final IOException ex) {
            throw this.method9469(258, ex);
        }
        return n;
    }
    
    static {
        Class2341.field14091 = 0;
        Class2341.field14092 = 1;
    }
}
