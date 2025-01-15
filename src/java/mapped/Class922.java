// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class922 extends Thread
{
    public final /* synthetic */ Class5083 field4901;
    
    public Class922(final Class5083 field4901, final String name) {
        this.field4901 = field4901;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            Class9513.method35444().method35483(Class5083.method15866(this.field4901).field28675);
        }
        catch (final Class2330 class2330) {
            Class5083.method15868().error("Couldn't delete world");
            Class5083.method15868().error((Object)class2330);
        }
        catch (final IOException ex) {
            Class5083.method15868().error("Couldn't delete world");
            ex.printStackTrace();
        }
        Class7847.method25362(Class5083.method15869(this.field4901));
    }
}
