// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7444 extends ValueObject
{
    private static final Logger field28711;
    private boolean field28712;
    private String field28713;
    private String field28714;
    private int field28715;
    
    public Class7444() {
        this.field28713 = "";
        this.field28714 = "";
    }
    
    public static Class7444 method22890(final String s) {
        final Class7444 class7444 = new Class7444();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            class7444.field28712 = JsonUtils.method23910("worldClosed", asJsonObject, false);
            class7444.field28713 = JsonUtils.func_225171_a("token", asJsonObject, null);
            class7444.field28714 = JsonUtils.func_225171_a("uploadEndpoint", asJsonObject, null);
            class7444.field28715 = JsonUtils.method23908("port", asJsonObject, 8080);
        }
        catch (final Exception ex) {
            Class7444.field28711.error("Could not parse UploadInfo: " + ex.getMessage());
        }
        return class7444;
    }
    
    public String method22891() {
        return this.field28713;
    }
    
    public String method22892() {
        return this.field28714;
    }
    
    public boolean method22893() {
        return this.field28712;
    }
    
    public void method22894(final String field28713) {
        this.field28713 = field28713;
    }
    
    public int method22895() {
        return this.field28715;
    }
    
    static {
        field28711 = LogManager.getLogger();
    }
}
