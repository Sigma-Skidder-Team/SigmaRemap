// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class924 extends Thread
{
    private static String[] field4905;
    public final /* synthetic */ Class5072 field4906;
    
    public Class924(final Class5072 field4906, final String name) {
        this.field4906 = field4906;
        super(name);
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        try {
            if (!method35444.method35455().equals(Class2112.field12286)) {
                return;
            }
        }
        catch (final Class2330 class2330) {
            if (class2330.field14069 != 401) {
                Class5072.method15653(false);
            }
            return;
        }
        catch (final IOException ex) {
            Class5072.method15653(false);
            return;
        }
        Class5072.method15654(true);
    }
}
