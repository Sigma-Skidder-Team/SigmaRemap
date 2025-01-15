// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayDeque;

public class Class9234
{
    private static String[] field39586;
    private final Class1794 field39587;
    private final Class7492 field39588;
    private final Class6782 field39589;
    
    public Class9234(final Class1794 field39587, final Class7492 field39588, final Class6782 field39589) {
        this.field39587 = field39587;
        this.field39588 = field39588;
        this.field39589 = field39589;
    }
    
    public void method34051(final ArrayDeque<Class9234> arrayDeque, final int n) {
        try {
            this.field39589.method20737(this.field39587, this.field39588, arrayDeque, n);
        }
        catch (final Throwable t) {}
    }
    
    @Override
    public String toString() {
        return this.field39589.toString();
    }
}
