// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4441 implements Comparator<Class8903>
{
    private static String[] field19779;
    public final /* synthetic */ Class8385 field19780;
    
    public Class4441(final Class8385 field19780) {
        this.field19780 = field19780;
    }
    
    @Override
    public int compare(final Class8903 class8903, final Class8903 class8904) {
        return (int)(class8903.method31356() + class8903.method31363() - (class8904.method31356() + class8904.method31363()));
    }
}
