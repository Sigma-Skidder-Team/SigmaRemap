// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6085 extends Class6086 implements Class6084
{
    private String field24698;
    
    public Class6085() {
        this.field24698 = "*";
    }
    
    @Override
    public void method18143(final String field24698) {
        if (field24698 != null) {
            this.field24698 = field24698;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
    
    @Override
    public String method18142() {
        return this.field24698;
    }
}
