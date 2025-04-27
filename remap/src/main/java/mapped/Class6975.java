// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParser;

import java.nio.charset.StandardCharsets;

public class Class6975 implements Class6974
{
    private String field27272;
    
    public Class6975(final String field27272) {
        this.field27272 = null;
        this.field27272 = field27272;
    }
    
    @Override
    public void method21397(final String str, final byte[] bytes, final Throwable t) {
        if (bytes != null) {
            try {
                final Class6554 method26155 = new Class7993(this.field27272).method26155(new JsonParser().parse(new String(bytes, StandardCharsets.US_ASCII)));
                if (method26155 != null) {
                    method26155.method19861(true);
                    Class7569.method23791(this.field27272, method26155);
                }
            }
            catch (final Exception ex) {
                Config.method28847("Error parsing configuration: " + str + ", " + ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
    }
}
