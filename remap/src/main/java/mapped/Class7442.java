// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import java.util.Date;
import org.apache.logging.log4j.Logger;

public class Class7442 extends ValueObject
{
    private static final Logger field28702;
    public String field28703;
    public String field28704;
    public String field28705;
    public String field28706;
    public Date field28707;
    
    public static Class7442 method22889(final JsonObject jsonObject) {
        final Class7442 class7442 = new Class7442();
        try {
            class7442.field28703 = JsonUtils.func_225171_a("invitationId", jsonObject, "");
            class7442.field28704 = JsonUtils.func_225171_a("worldName", jsonObject, "");
            class7442.field28705 = JsonUtils.func_225171_a("worldOwnerName", jsonObject, "");
            class7442.field28706 = JsonUtils.func_225171_a("worldOwnerUuid", jsonObject, "");
            class7442.field28707 = JsonUtils.func_225173_a("date", jsonObject);
        }
        catch (final Exception ex) {
            Class7442.field28702.error("Could not parse PendingInvite: " + ex.getMessage());
        }
        return class7442;
    }
    
    static {
        field28702 = LogManager.getLogger();
    }
}
