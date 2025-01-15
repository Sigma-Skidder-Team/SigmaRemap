// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public final class Class8939
{
    public final boolean field37604;
    public final Class1681 field37605;
    public final Class7480 field37606;
    public boolean field37607;
    public int field37608;
    public long field37609;
    public long field37610;
    public boolean field37611;
    public boolean field37612;
    public boolean field37613;
    public final byte[] field37614;
    public final byte[] field37615;
    
    public Class8939(final boolean field37604, final Class1681 field37605, final Class7480 field37606) {
        this.field37614 = new byte[4];
        this.field37615 = new byte[8192];
        if (field37605 == null) {
            throw new NullPointerException("source == null");
        }
        if (field37606 != null) {
            this.field37604 = field37604;
            this.field37605 = field37605;
            this.field37606 = field37606;
            return;
        }
        throw new NullPointerException("frameCallback == null");
    }
    
    public void method31702() throws IOException {
        this.method31703();
        if (!this.field37612) {
            this.method31705();
        }
        else {
            this.method31704();
        }
    }
    
    private void method31703() throws IOException {
        if (this.field37607) {
            throw new IOException("closed");
        }
        final long method26298 = this.field37605.method5921().method26298();
        this.field37605.method5921().method26303();
        int n;
        try {
            n = (this.field37605.method5964() & 0xFF);
        }
        finally {
            this.field37605.method5921().method26297(method26298, TimeUnit.NANOSECONDS);
        }
        this.field37608 = (n & 0xF);
        this.field37611 = ((n & 0x80) != 0x0);
        this.field37612 = ((n & 0x8) != 0x0);
        if (this.field37612 && !this.field37611) {
            throw new ProtocolException("Control frames must be final.");
        }
        final boolean b = (n & 0x40) != 0x0;
        final boolean b2 = (n & 0x20) != 0x0;
        final boolean b3 = (n & 0x10) != 0x0;
        if (b || b2 || b3) {
            throw new ProtocolException("Reserved flags are unsupported.");
        }
        final int n2 = this.field37605.method5964() & 0xFF;
        this.field37613 = ((n2 & 0x80) != 0x0);
        if (this.field37613 == this.field37604) {
            throw new ProtocolException(this.field37604 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
        }
        this.field37609 = (n2 & 0x7F);
        if (this.field37609 == 126L) {
            this.field37609 = ((long)this.field37605.method5966() & 0xFFFFL);
        }
        else if (this.field37609 == 127L) {
            this.field37609 = this.field37605.method5968();
            if (this.field37609 < 0L) {
                throw new ProtocolException("Frame length 0x" + Long.toHexString(this.field37609) + " > 0x7FFFFFFFFFFFFFFF");
            }
        }
        this.field37610 = 0L;
        if (this.field37612 && this.field37609 > 125L) {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        if (this.field37613) {
            this.field37605.method5992(this.field37614);
        }
    }
    
    private void method31704() throws IOException {
        final Class1680 class1680 = new Class1680();
        if (this.field37610 < this.field37609) {
            if (this.field37604) {
                this.field37605.method5978(class1680, this.field37609);
            }
            else {
                while (this.field37610 < this.field37609) {
                    final int method5993 = this.field37605.method5993(this.field37615, 0, (int)Math.min(this.field37609 - this.field37610, this.field37615.length));
                    if (method5993 == -1) {
                        throw new EOFException();
                    }
                    Class8402.method28020(this.field37615, method5993, this.field37614, this.field37610);
                    class1680.method6003(this.field37615, 0, method5993);
                    this.field37610 += method5993;
                }
            }
        }
        switch (this.field37608) {
            case 9: {
                this.field37606.method23123(class1680.method5974());
                break;
            }
            case 10: {
                this.field37606.method23124(class1680.method5974());
                break;
            }
            case 8: {
                int method5994 = 1005;
                String method5995 = "";
                final long method5996 = class1680.method5949();
                if (method5996 == 1L) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (method5996 != 0L) {
                    method5994 = class1680.method5966();
                    method5995 = class1680.method5980();
                    final String method5997 = Class8402.method28021(method5994);
                    if (method5997 != null) {
                        throw new ProtocolException(method5997);
                    }
                }
                this.field37606.method23125(method5994, method5995);
                this.field37607 = true;
                break;
            }
            default: {
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.field37608));
            }
        }
    }
    
    private void method31705() throws IOException {
        final int field37608 = this.field37608;
        if (field37608 != 1 && field37608 != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(field37608));
        }
        final Class1680 class1680 = new Class1680();
        this.method31707(class1680);
        if (field37608 != 1) {
            this.field37606.method23122(class1680.method5974());
        }
        else {
            this.field37606.method23121(class1680.method5980());
        }
    }
    
    public void method31706() throws IOException {
        while (!this.field37607) {
            this.method31703();
            if (!this.field37612) {
                break;
            }
            this.method31704();
        }
    }
    
    private void method31707(final Class1680 class1680) throws IOException {
        while (!this.field37607) {
            if (this.field37610 == this.field37609) {
                if (this.field37611) {
                    return;
                }
                this.method31706();
                if (this.field37608 != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.field37608));
                }
                if (this.field37611) {
                    if (this.field37609 == 0L) {
                        return;
                    }
                }
            }
            final long a = this.field37609 - this.field37610;
            long method6014;
            if (!this.field37613) {
                method6014 = this.field37605.method6014(class1680, a);
                if (method6014 == -1L) {
                    throw new EOFException();
                }
            }
            else {
                method6014 = this.field37605.method5993(this.field37615, 0, (int)Math.min(a, this.field37615.length));
                if (method6014 == -1L) {
                    throw new EOFException();
                }
                Class8402.method28020(this.field37615, method6014, this.field37614, this.field37610);
                class1680.method6003(this.field37615, 0, (int)method6014);
            }
            this.field37610 += method6014;
        }
        throw new IOException("closed");
    }
}
