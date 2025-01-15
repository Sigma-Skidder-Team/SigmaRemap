// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.PasswordAuthentication;
import java.net.Authenticator;

public final class Class7488 extends Authenticator
{
    private static String[] field28914;
    public final /* synthetic */ String field28915;
    public final /* synthetic */ String field28916;
    
    public Class7488(final String field28915, final String field28916) {
        this.field28915 = field28915;
        this.field28916 = field28916;
    }
    
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.field28915, this.field28916.toCharArray());
    }
}
