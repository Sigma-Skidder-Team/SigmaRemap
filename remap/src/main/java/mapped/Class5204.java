// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import com.google.common.collect.Lists;
import java.util.List;

public class Class5204
{
    private final Class7689 field22213;
    private final String field22214;
    private final List<Class8943> field22215;
    private StackTraceElement[] field22216;
    
    public Class5204(final Class7689 field22213, final String field22214) {
        this.field22215 = Lists.newArrayList();
        this.field22216 = new StackTraceElement[0];
        this.field22213 = field22213;
        this.field22214 = field22214;
    }
    
    public static String method16293(final double d, final double d2, final double d3) {
        return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", d, d2, d3, method16294(new BlockPos(d, d2, d3)));
    }
    
    public static String method16294(final BlockPos class354) {
        return method16295(class354.getX(), class354.getY(), class354.getZ());
    }
    
    public static String method16295(final int i, final int j, final int k) {
        final StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format("World: (%d,%d,%d)", i, j, k));
        }
        catch (final Throwable t) {
            sb.append("(Error finding world loc)");
        }
        sb.append(", ");
        try {
            final int l = i >> 4;
            final int m = k >> 4;
            sb.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", i & 0xF, j >> 4, k & 0xF, l, m, l << 4, m << 4, (l + 1 << 4) - 1, (m + 1 << 4) - 1));
        }
        catch (final Throwable t2) {
            sb.append("(Error finding chunk loc)");
        }
        sb.append(", ");
        try {
            final int i2 = i >> 9;
            final int i3 = k >> 9;
            sb.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", i2, i3, i2 << 5, i3 << 5, (i2 + 1 << 5) - 1, (i3 + 1 << 5) - 1, i2 << 9, i3 << 9, (i2 + 1 << 9) - 1, (i3 + 1 << 9) - 1));
        }
        catch (final Throwable t3) {
            sb.append("(Error finding world loc)");
        }
        return sb.toString();
    }
    
    public Class5204 method16296(final String s, final Class7077<String> class7077) {
        try {
            this.method16297(s, class7077.call());
        }
        catch (final Throwable t) {
            this.method16298(s, t);
        }
        return this;
    }
    
    public Class5204 method16297(final String s, final Object o) {
        this.field22215.add(new Class8943(s, o));
        return this;
    }
    
    public void method16298(final String s, final Throwable t) {
        this.method16297(s, t);
    }
    
    public int method16299(final int n) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 0) {
            System.arraycopy(stackTrace, 3 + n, this.field22216 = new StackTraceElement[stackTrace.length - 3 - n], 0, this.field22216.length);
            return this.field22216.length;
        }
        return 0;
    }
    
    public boolean method16300(final StackTraceElement stackTraceElement, final StackTraceElement obj) {
        if (this.field22216.length != 0 && stackTraceElement != null) {
            final StackTraceElement stackTraceElement2 = this.field22216[0];
            if (stackTraceElement2.isNativeMethod() == stackTraceElement.isNativeMethod()) {
                if (stackTraceElement2.getClassName().equals(stackTraceElement.getClassName())) {
                    if (stackTraceElement2.getFileName().equals(stackTraceElement.getFileName())) {
                        if (stackTraceElement2.getMethodName().equals(stackTraceElement.getMethodName())) {
                            if (obj != null != this.field22216.length > 1) {
                                return false;
                            }
                            if (obj != null && !this.field22216[1].equals(obj)) {
                                return false;
                            }
                            this.field22216[0] = stackTraceElement;
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public void method16301(final int n) {
        final StackTraceElement[] field22216 = new StackTraceElement[this.field22216.length - n];
        System.arraycopy(this.field22216, 0, field22216, 0, field22216.length);
        this.field22216 = field22216;
    }
    
    public void method16302(final StringBuilder sb) {
        sb.append("-- ").append(this.field22214).append(" --\n");
        sb.append("Details:");
        for (final Class8943 class8943 : this.field22215) {
            sb.append("\n\t");
            sb.append(class8943.method31734());
            sb.append(": ");
            sb.append(class8943.method31735());
        }
        if (this.field22216 != null) {
            if (this.field22216.length > 0) {
                sb.append("\nStacktrace:");
                for (final StackTraceElement obj : this.field22216) {
                    sb.append("\n\tat ");
                    sb.append(obj);
                }
            }
        }
    }
    
    public StackTraceElement[] method16303() {
        return this.field22216;
    }
    
    public static void method16304(final Class5204 class5204, final BlockPos class5205, final Class7096 class5206) {
        if (class5206 != null) {
            class5204.method16296("Block", class5206::toString);
        }
        class5204.method16296("Block location", () -> method16294(class5207));
    }
}
