// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5014 extends Class5009
{
    @Override
    public String method15225() {
        return "debug";
    }
    
    @Override
    public String method15226() {
        return "Toggle debug mode";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        Class8563.method28794().method33563(!Class8563.method28794().method33559());
        this.method15234(class7671, "&6Debug mode is now %s", Class8563.method28794().method33559() ? "&aenabled" : "&cdisabled");
        return true;
    }
}
