// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class873 extends Class872<Runnable>
{
    public final /* synthetic */ Class1909 field4721;
    
    private Class873(final Class1909 field4721, final Class1847 class1847) {
        this.field4721 = field4721;
        super("Chunk source main thread executor for " + Class90.field226.method503(class1847.method6789().method20487()));
    }
    
    @Override
    public Runnable method1601(final Runnable runnable) {
        return runnable;
    }
    
    @Override
    public boolean method1600(final Runnable runnable) {
        return true;
    }
    
    @Override
    public boolean method1560() {
        return true;
    }
    
    @Override
    public Thread method1561() {
        return Class1909.method7459(this.field4721);
    }
    
    @Override
    public void run(final Runnable runnable) {
        Class1909.method7460(this.field4721).method6796().method15302("runTask");
        super.run(runnable);
    }
    
    @Override
    public boolean method1461() {
        if (!Class1909.method7461(this.field4721)) {
            Class1909.method7462(this.field4721).method7261();
            return super.method1461();
        }
        return true;
    }
}
