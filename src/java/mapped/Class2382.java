// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class2382 extends RuntimeException
{
    private static String[] field14182;
    public static final Class2382 field14183;
    
    private Class2382() {
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    static {
        field14183 = new Class2382();
    }
}
