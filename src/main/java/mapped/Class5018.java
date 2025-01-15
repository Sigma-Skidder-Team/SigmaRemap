// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5018 extends Class5009
{
    @Override
    public String method15225() {
        return "probe";
    }
    
    @Override
    public String method15226() {
        return "Forces ViaVersion to scan server protocol versions " + ((((Class7494)Class8563.method28792()).method23317() != -1) ? "(Also happens at an interval)" : "");
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        Class1632.method5678().run();
        this.method15234(class7671, "&6Started searching for protocol versions", new Object[0]);
        return true;
    }
}
