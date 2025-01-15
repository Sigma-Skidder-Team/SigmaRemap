// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TimerTask;

public class Class1619 extends TimerTask
{
    private static String[] field9045;
    public final /* synthetic */ Class1072 field9046;
    
    public Class1619(final Class1072 field9046) {
        this.field9046 = field9046;
    }
    
    @Override
    public void run() {
        Runtime.getRuntime().halt(1);
    }
}
