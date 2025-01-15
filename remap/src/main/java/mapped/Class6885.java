// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class6885
{
    public static final Class1929 field26977;
    public static final int field26978 = 16384;
    public static final byte field26979 = 0;
    public static final byte field26980 = 1;
    public static final byte field26981 = 2;
    public static final byte field26982 = 3;
    public static final byte field26983 = 4;
    public static final byte field26984 = 5;
    public static final byte field26985 = 6;
    public static final byte field26986 = 7;
    public static final byte field26987 = 8;
    public static final byte field26988 = 9;
    public static final byte field26989 = 0;
    public static final byte field26990 = 1;
    public static final byte field26991 = 1;
    public static final byte field26992 = 4;
    public static final byte field26993 = 4;
    public static final byte field26994 = 8;
    public static final byte field26995 = 32;
    public static final byte field26996 = 32;
    private static final String[] field26997;
    public static final String[] field26998;
    public static final String[] field26999;
    
    private Class6885() {
    }
    
    public static IllegalArgumentException method21139(final String s, final Object... array) {
        throw new IllegalArgumentException(Class7690.method24456(s, array));
    }
    
    public static IOException method21140(final String s, final Object... array) throws IOException {
        throw new IOException(Class7690.method24456(s, array));
    }
    
    public static String method21141(final boolean b, final int i, final int j, final byte b2, final byte b3) {
        return Class7690.method24456("%s 0x%08x %5d %-13s %s", b ? "<<" : ">>", i, j, (b2 >= Class6885.field26997.length) ? Class7690.method24456("0x%02x", b2) : Class6885.field26997[b2], method21142(b2, b3));
    }
    
    public static String method21142(final byte b, final byte b2) {
        if (b2 == 0) {
            return "";
        }
        switch (b) {
            case 4:
            case 6: {
                return (b2 == 1) ? "ACK" : Class6885.field26999[b2];
            }
            case 2:
            case 3:
            case 7:
            case 8: {
                return Class6885.field26999[b2];
            }
            default: {
                final String s = (b2 < Class6885.field26998.length) ? Class6885.field26998[b2] : Class6885.field26999[b2];
                if (b == 5 && (b2 & 0x4) != 0x0) {
                    return s.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b == 0 && (b2 & 0x20) != 0x0) {
                    return s.replace("PRIORITY", "COMPRESSED");
                }
                return s;
            }
        }
    }
    
    static {
        field26977 = Class1929.method7741("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        field26997 = new String[] { "DATA", Class6885.\u7a60\uc350\u9388\uff74\u63ae\u415c[6], Class6885.\u7a60\uc350\u9388\uff74\u63ae\u415c[8], "RST_STREAM", "SETTINGS", Class6885.\u7a60\uc350\u9388\uff74\u63ae\u415c[7], "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        field26998 = new String[64];
        field26999 = new String[256];
        for (int i = 0; i < Class6885.field26999.length; ++i) {
            Class6885.field26999[i] = Class7690.method24456("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        Class6885.field26998[0] = Class6885.\u7a60\uc350\u9388\uff74\u63ae\u415c[4];
        Class6885.field26998[1] = "END_STREAM";
        final int[] array = { 1 };
        Class6885.field26998[8] = "PADDED";
        for (final int n : array) {
            Class6885.field26998[n | 0x8] = Class6885.field26998[n] + "|PADDED";
        }
        Class6885.field26998[4] = "END_HEADERS";
        Class6885.field26998[32] = Class6885.\u7a60\uc350\u9388\uff74\u63ae\u415c[8];
        Class6885.field26998[36] = "END_HEADERS|PRIORITY";
        for (final int n2 : new int[] { 4, 32, 36 }) {
            for (final int n3 : array) {
                Class6885.field26998[n3 | n2] = Class6885.field26998[n3] + '|' + Class6885.field26998[n2];
                Class6885.field26998[n3 | n2 | 0x8] = Class6885.field26998[n3] + '|' + Class6885.field26998[n2] + "|PADDED";
            }
        }
        for (int n4 = 0; n4 < Class6885.field26998.length; ++n4) {
            if (Class6885.field26998[n4] == null) {
                Class6885.field26998[n4] = Class6885.field26999[n4];
            }
        }
    }
}
