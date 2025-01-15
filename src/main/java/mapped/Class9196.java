// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class9196
{
    private static String[] field38973;
    private Class9383 field38974;
    private boolean field38975;
    public final /* synthetic */ Class8399 field38976;
    
    public Class9196(final Class8399 field38976) {
        this.field38976 = field38976;
    }
    
    public boolean method33648() {
        return this.field38975;
    }
    
    public void method33649(final Consumer<Class9383> consumer) {
        Class8399.method28016(this.field38976).execute(() -> {
            if (this.field38974 != null) {
                consumer2.accept(this.field38974);
            }
        });
    }
    
    public void method33650() {
        this.field38975 = true;
        Class8399.method28017(this.field38976).method22314(this.field38974);
        this.field38974 = null;
    }
}
