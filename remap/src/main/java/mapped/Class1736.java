// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Closeable;

public final class Class1736 implements Closeable
{
    public static final Logger field9686;
    private final Class1681 field9687;
    private final Class1697 field9688;
    private final boolean field9689;
    public final Class8916 field9690;
    
    public Class1736(final Class1681 field9687, final boolean field9688) {
        this.field9687 = field9687;
        this.field9689 = field9688;
        this.field9688 = new Class1697(this.field9687);
        this.field9690 = new Class8916(4096, this.field9688);
    }
    
    public void method6135(final Class1584 class1584) throws IOException {
        if (!this.field9689) {
            final Class1929 method5975 = this.field9687.method5975(Class6885.field26977.method7766());
            if (Class1736.field9686.isLoggable(Level.FINE)) {
                Class1736.field9686.fine(Class7690.method24456("<< CONNECTION %s", method5975.method7757()));
            }
            if (!Class6885.field26977.equals(method5975)) {
                throw Class6885.method21140("Expected a connection header but was %s", method5975.method7743());
            }
        }
        else if (!this.method6136(true, class1584)) {
            throw Class6885.method21140("Required SETTINGS preface not received", new Object[0]);
        }
    }
    
    public boolean method6136(final boolean b, final Class1584 class1584) throws IOException {
        try {
            this.field9687.method5952(9L);
        }
        catch (final IOException ex) {
            return false;
        }
        final int method6148 = method6148(this.field9687);
        if (method6148 < 0 || method6148 > 16384) {
            throw Class6885.method21140("FRAME_SIZE_ERROR: %s", method6148);
        }
        final byte b2 = (byte)(this.field9687.method5964() & 0xFF);
        if (b && b2 != 4) {
            throw Class6885.method21140("Expected a SETTINGS frame but was %s", b2);
        }
        final byte b3 = (byte)(this.field9687.method5964() & 0xFF);
        final int n = this.field9687.method5967() & Integer.MAX_VALUE;
        if (Class1736.field9686.isLoggable(Level.FINE)) {
            Class1736.field9686.fine(Class6885.method21141(true, n, method6148, b2, b3));
        }
        switch (b2) {
            case 0: {
                this.method6139(class1584, method6148, b3, n);
                break;
            }
            case 1: {
                this.method6137(class1584, method6148, b3, n);
                break;
            }
            case 2: {
                this.method6140(class1584, method6148, b3, n);
                break;
            }
            case 3: {
                this.method6142(class1584, method6148, b3, n);
                break;
            }
            case 4: {
                this.method6143(class1584, method6148, b3, n);
                break;
            }
            case 5: {
                this.method6144(class1584, method6148, b3, n);
                break;
            }
            case 6: {
                this.method6145(class1584, method6148, b3, n);
                break;
            }
            case 7: {
                this.method6146(class1584, method6148, b3, n);
                break;
            }
            case 8: {
                this.method6147(class1584, method6148, b3, n);
                break;
            }
            default: {
                this.field9687.method5995(method6148);
                break;
            }
        }
        return true;
    }
    
    private void method6137(final Class1584 class1584, int method6149, final byte b, final int n) throws IOException {
        if (n != 0) {
            final boolean b2 = (b & 0x1) != 0x0;
            final short n2 = (short)(((b & 0x8) == 0x0) ? 0 : ((short)(this.field9687.method5964() & 0xFF)));
            if ((b & 0x20) != 0x0) {
                this.method6141(class1584, n);
                method6149 -= 5;
            }
            method6149 = method6149(method6149, b, n2);
            class1584.method5665(b2, n, -1, this.method6138(method6149, n2, b, n));
            return;
        }
        throw Class6885.method21140("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }
    
    private List<Class8975> method6138(final int n, final short field9569, final byte field9570, final int field9571) throws IOException {
        final Class1697 field9572 = this.field9688;
        this.field9688.field9568 = n;
        field9572.field9565 = n;
        this.field9688.field9569 = field9569;
        this.field9688.field9566 = field9570;
        this.field9688.field9567 = field9571;
        this.field9690.method31429();
        return this.field9690.method31430();
    }
    
    private void method6139(final Class1584 class1584, int method6149, final byte b, final int n) throws IOException {
        if (n == 0) {
            throw Class6885.method21140("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        final boolean b2 = (b & 0x1) != 0x0;
        if ((b & 0x20) == 0x0) {
            final short n2 = (short)(((b & 0x8) == 0x0) ? 0 : ((short)(this.field9687.method5964() & 0xFF)));
            method6149 = method6149(method6149, b, n2);
            class1584.method5664(b2, n, this.field9687, method6149);
            this.field9687.method5995(n2);
            return;
        }
        throw Class6885.method21140("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
    }
    
    private void method6140(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (i != 5) {
            throw Class6885.method21140("TYPE_PRIORITY length: %d != 5", i);
        }
        if (n != 0) {
            this.method6141(class1584, n);
            return;
        }
        throw Class6885.method21140("TYPE_PRIORITY streamId == 0", new Object[0]);
    }
    
    private void method6141(final Class1584 class1584, final int n) throws IOException {
        class1584.method5673(n, this.field9687.method5967() & Integer.MAX_VALUE, (this.field9687.method5964() & 0xFF) + 1, false);
    }
    
    private void method6142(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (i != 4) {
            throw Class6885.method21140("TYPE_RST_STREAM length: %d != 4", i);
        }
        if (n == 0) {
            throw Class6885.method21140("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        final int method5967 = this.field9687.method5967();
        final Class2082 method5968 = Class2082.method8204(method5967);
        if (method5968 != null) {
            class1584.method5666(n, method5968);
            return;
        }
        throw Class6885.method21140("TYPE_RST_STREAM unexpected error code: %d", method5967);
    }
    
    private void method6143(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (n != 0) {
            throw Class6885.method21140("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 0x1) != 0x0) {
            if (i != 0) {
                throw Class6885.method21140("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            class1584.method5669();
        }
        else {
            if (i % 6 != 0) {
                throw Class6885.method21140("TYPE_SETTINGS length %% 6 != 0: %s", i);
            }
            final Class8703 class1585 = new Class8703();
            for (int j = 0; j < i; j += 6) {
                int method5966 = this.field9687.method5966();
                final int method5967 = this.field9687.method5967();
                switch (method5966) {
                    case 2: {
                        if (method5967 != 0 && method5967 != 1) {
                            throw Class6885.method21140("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    }
                    case 3: {
                        method5966 = 4;
                        break;
                    }
                    case 4: {
                        method5966 = 7;
                        if (method5967 < 0) {
                            throw Class6885.method21140("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    }
                    case 5: {
                        if (method5967 < 16384 || method5967 > 16777215) {
                            throw Class6885.method21140("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", method5967);
                        }
                        break;
                    }
                }
                class1585.method29861(method5966, method5967);
            }
            class1584.method5667(false, class1585);
        }
    }
    
    private void method6144(final Class1584 class1584, int method6149, final byte b, final int n) throws IOException {
        if (n != 0) {
            final short n2 = (short)(((b & 0x8) == 0x0) ? 0 : ((short)(this.field9687.method5964() & 0xFF)));
            final int n3 = this.field9687.method5967() & Integer.MAX_VALUE;
            method6149 -= 4;
            method6149 = method6149(method6149, b, n2);
            class1584.method5674(n, n3, this.method6138(method6149, n2, b, n));
            return;
        }
        throw Class6885.method21140("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }
    
    private void method6145(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (i != 8) {
            throw Class6885.method21140("TYPE_PING length != 8: %s", i);
        }
        if (n == 0) {
            class1584.method5670((b & 0x1) != 0x0, this.field9687.method5967(), this.field9687.method5967());
            return;
        }
        throw Class6885.method21140("TYPE_PING streamId != 0", new Object[0]);
    }
    
    private void method6146(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (i < 8) {
            throw Class6885.method21140("TYPE_GOAWAY length < 8: %s", i);
        }
        if (n != 0) {
            throw Class6885.method21140("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        final int method5967 = this.field9687.method5967();
        final int method5968 = this.field9687.method5967();
        final int n2 = i - 8;
        final Class2082 method5969 = Class2082.method8204(method5968);
        if (method5969 != null) {
            Class1929 class1585 = Class1929.field10532;
            if (n2 > 0) {
                class1585 = this.field9687.method5975(n2);
            }
            class1584.method5671(method5967, method5969, class1585);
            return;
        }
        throw Class6885.method21140("TYPE_GOAWAY unexpected error code: %d", method5968);
    }
    
    private void method6147(final Class1584 class1584, final int i, final byte b, final int n) throws IOException {
        if (i != 4) {
            throw Class6885.method21140("TYPE_WINDOW_UPDATE length !=4: %s", i);
        }
        final long l = (long)this.field9687.method5967() & 0x7FFFFFFFL;
        if (l != 0L) {
            class1584.method5672(n, l);
            return;
        }
        throw Class6885.method21140("windowSizeIncrement was 0", l);
    }
    
    @Override
    public void close() throws IOException {
        this.field9687.close();
    }
    
    public static int method6148(final Class1681 class1681) throws IOException {
        return (class1681.method5964() & 0xFF) << 16 | (class1681.method5964() & 0xFF) << 8 | (class1681.method5964() & 0xFF);
    }
    
    public static int method6149(final int i, final byte b, final short s) throws IOException {
        if (s <= i) {
            return (short)(i - s);
        }
        throw Class6885.method21140("PROTOCOL_ERROR padding %s > remaining length %s", s, i);
    }
    
    static {
        field9686 = Logger.getLogger(Class6885.class.getName());
    }
}
