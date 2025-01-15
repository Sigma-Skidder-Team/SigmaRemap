// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class8176
{
    private static String[] field33682;
    private final Class6095<?> field33683;
    
    public Class8176(final Class6095<?> field33683) {
        this.field33683 = field33683;
    }
    
    public static Class8176 method27072(final Class6095<?> class6095) {
        return new Class8176(class6095);
    }
    
    public void method27073(final Consumer<Class5763> consumer, final String s) {
        consumer.accept(new Class5766(this, s));
    }
}
