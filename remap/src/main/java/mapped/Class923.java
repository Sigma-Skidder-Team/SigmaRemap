// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class923 extends Thread
{
    private static String[] field4902;
    private String field4903;
    private Class6974 field4904;
    
    public Class923(final String field4903, final Class6974 field4904) {
        this.field4903 = null;
        this.field4904 = null;
        this.field4903 = field4903;
        this.field4904 = field4904;
    }
    
    @Override
    public void run() {
        try {
            this.field4904.method21397(this.field4903, Class6579.method19925(this.field4903, Minecraft.method5277().method5289()), null);
        }
        catch (final Exception ex) {
            this.field4904.method21397(this.field4903, null, ex);
        }
    }
    
    public String method5427() {
        return this.field4903;
    }
    
    public Class6974 method5428() {
        return this.field4904;
    }
}
