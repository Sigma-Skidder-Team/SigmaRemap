// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public final class Class8511
{
    private static String[] field34912;
    private final long field34913;
    private final Class101 field34914;
    private final boolean field34915;
    private final boolean field34916;
    private final Class9505 field34917;
    private boolean field34918;
    private boolean field34919;
    private JsonElement field34920;
    
    public Class8511(final long field34913, final Class101 field34914, final boolean field34915, final boolean field34916, final Class9505 field34917) {
        this.field34920 = (JsonElement)new JsonObject();
        this.field34913 = field34913;
        this.field34914 = field34914;
        this.field34915 = field34915;
        this.field34916 = field34916;
        this.field34917 = field34917;
    }
    
    public Class8511(final Class8660 class8660) {
        this(class8660.method29534(), class8660.method29564(), class8660.method29565(), class8660.method29568(), class8660.method29570());
    }
    
    public Class8511 method28431() {
        this.field34919 = true;
        return this;
    }
    
    public Class8511 method28432() {
        this.field34918 = true;
        return this;
    }
    
    public Class8511 method28433(final JsonElement field34920) {
        this.field34920 = field34920;
        return this;
    }
    
    public boolean method28434() {
        return this.field34919;
    }
    
    public long method28435() {
        return this.field34913;
    }
    
    public Class101 method28436() {
        return this.field34914;
    }
    
    public boolean method28437() {
        return this.field34916;
    }
    
    public boolean method28438() {
        return this.field34915;
    }
    
    public Class9505 method28439() {
        return this.field34917;
    }
    
    public boolean method28440() {
        return this.field34918;
    }
    
    public JsonElement method28441() {
        return this.field34920;
    }
}
