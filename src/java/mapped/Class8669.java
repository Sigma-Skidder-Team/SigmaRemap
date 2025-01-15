// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class8669
{
    private static final Logger field36449;
    private String field36450;
    private int field36451;
    
    public Class8669(final String str) {
        try {
            final JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            this.field36450 = Class7610.method23907("errorMsg", asJsonObject, "");
            this.field36451 = Class7610.method23908("errorCode", asJsonObject, -1);
        }
        catch (final Exception ex) {
            Class8669.field36449.error("Could not parse RealmsError: " + ex.getMessage());
            Class8669.field36449.error("The error was: " + str);
        }
    }
    
    public String method29677() {
        return this.field36450;
    }
    
    public int method29678() {
        return this.field36451;
    }
    
    static {
        field36449 = LogManager.getLogger();
    }
}
