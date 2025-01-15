// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2333 extends Exception
{
    private static String[] field14075;
    private String field14076;
    
    public Class2333(final String field14076) {
        this.field14076 = field14076;
    }
    
    public Class2333(final Exception ex) {
        this.field14076 = ex.getMessage();
    }
    
    @Override
    public String getMessage() {
        return this.field14076;
    }
}
