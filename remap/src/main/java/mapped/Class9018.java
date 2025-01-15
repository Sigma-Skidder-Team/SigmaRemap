// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.UnmodifiableIterator;
import java.nio.ByteBuffer;

public class Class9018
{
    public static String method32305(final Class4148 class4148) {
        final int method12417 = class4148.method12417();
        String str;
        int n;
        if (method12417 != 7) {
            if (method12417 != 4) {
                return "Invalid draw mode: " + method12417;
            }
            str = "triangle";
            n = 3;
        }
        else {
            str = "quad";
            n = 4;
        }
        final StringBuffer sb = new StringBuffer();
        for (int method12418 = class4148.method12418(), i = 0; i < method12418; ++i) {
            if (i % n == 0) {
                sb.append(str + " " + i / n + "\n");
            }
            sb.append(method32306(i, class4148));
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static String method32306(final int n, final Class4148 class4148) {
        final StringBuffer sb = new StringBuffer();
        final ByteBuffer method12423 = class4148.method12423();
        final Class9272 method12424 = class4148.method12428();
        int n2 = class4148.method12429() + n * method12424.method34194();
        for (final Class7187 class4149 : method12424.method34195()) {
            if (class4149.method22050() > 0) {
                sb.append("(");
            }
            for (int i = 0; i < class4149.method22050(); ++i) {
                if (i > 0) {
                    sb.append(" ");
                }
                switch (Class7642.field30331[class4149.method22048().ordinal()]) {
                    case 1: {
                        sb.append(method12423.getFloat(n2));
                        break;
                    }
                    case 2:
                    case 3: {
                        sb.append(method12423.get(n2));
                        break;
                    }
                    case 4:
                    case 5: {
                        sb.append(method12423.getShort(n2));
                        break;
                    }
                    case 6:
                    case 7: {
                        sb.append(method12423.getShort(n2));
                        break;
                    }
                    default: {
                        sb.append("??");
                        break;
                    }
                }
                n2 += class4149.method22048().method951();
            }
            if (class4149.method22050() > 0) {
                sb.append(")");
            }
        }
        return sb.toString();
    }
}
