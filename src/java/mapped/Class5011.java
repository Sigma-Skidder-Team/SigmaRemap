// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5011 extends Class5009
{
    @Override
    public String method15225() {
        return "autoteam";
    }
    
    @Override
    public String method15226() {
        return "Toggle automatically teaming to prevent colliding.";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        final Class7496 method34757 = Class8563.method28793().method34757();
        final boolean b = !Class8563.method28792().method23274();
        method34757.method23322("auto-team", b);
        method34757.method23323();
        this.method15234(class7671, "&6We will %s", b ? "&aautomatically team players" : "&cno longer auto team players");
        this.method15234(class7671, "&6All players will need to re-login for the change to take place.", new Object[0]);
        return true;
    }
}
