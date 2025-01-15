// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class909 extends Thread
{
    public final /* synthetic */ Class5078 field4864;
    
    public Class909(final Class5078 field4864, final String name) {
        this.field4864 = field4864;
        super(name);
    }
    
    @Override
    public void run() {
        Class9513.method35444();
        try {
            Class7847.method25361(() -> {
                final Class9513 class2335;
                class2335.method35464(1, 10, Class271.field1471);
                class2335.method35464(1, 10, Class271.field1473);
                class2335.method35464(1, 10, Class271.field1474);
                class2335.method35464(1, 10, Class271.field1475);
                Class5078.method15733(this.field4864, class2331);
                Class5078.method15734(this.field4864, class2332);
                Class5078.method15735(this.field4864, class2333);
                Class5078.method15736(this.field4864, class2334);
            });
        }
        catch (final Class2330 class2330) {
            Class5078.method15732().error("Couldn't fetch templates in reset world", (Throwable)class2330);
        }
    }
}
