// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6649 extends Class6635
{
    private String field26284;
    
    public Class6649(final Class6108 class6108) {
        super(class6108);
        this.field26284 = "";
    }
    
    public String method20203() {
        return this.field26284;
    }
    
    public void method20204(final String field26284) {
        this.field26284 = field26284;
    }
    
    @Override
    public String toString() {
        return "ResourcePackTracker(lastHash=" + this.method20203() + ")";
    }
}
