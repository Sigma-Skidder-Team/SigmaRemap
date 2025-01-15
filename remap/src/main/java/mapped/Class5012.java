// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5012 extends Class5009
{
    @Override
    public String method15225() {
        return "dontbugme";
    }
    
    @Override
    public String method15226() {
        return "Toggle checking for updates";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        final Class7496 method34757 = Class8563.method28793().method34757();
        final boolean b = !Class8563.method28792().method23262();
        method34757.method23322("checkforupdates", b);
        method34757.method23323();
        this.method15234(class7671, "&6We will %snotify you about updates.", b ? "&a" : "&cnot ");
        return true;
    }
}
