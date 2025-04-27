// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.time.ZonedDateTime;
import com.google.gson.JsonObject;
import java.util.Date;
import org.apache.logging.log4j.Logger;
import com.mojang.bridge.game.GameVersion;

public class Class8164 implements GameVersion
{
    private static final Logger field33625;
    private final String field33626;
    private final String field33627;
    private final boolean field33628;
    private final int field33629;
    private final int field33630;
    private final int field33631;
    private final Date field33632;
    private final String field33633;
    
    public Class8164() {
        this.field33626 = "1.15.2";
        this.field33627 = "1.15.2";
        this.field33628 = true;
        this.field33629 = 2230;
        this.field33630 = 578;
        this.field33631 = 5;
        this.field33632 = new Date();
        this.field33633 = "1.15.2";
    }
    
    public Class8164(final JsonObject jsonObject) {
        this.field33626 = Class9583.method35895(jsonObject, "id");
        this.field33627 = Class9583.method35895(jsonObject, "name");
        this.field33633 = Class9583.method35895(jsonObject, "release_target");
        this.field33628 = Class9583.method35900(jsonObject, "stable");
        this.field33629 = Class9583.method35909(jsonObject, "world_version");
        this.field33630 = Class9583.method35909(jsonObject, "protocol_version");
        this.field33631 = Class9583.method35909(jsonObject, "pack_version");
        this.field33632 = Date.from(ZonedDateTime.parse(Class9583.method35895(jsonObject, "build_time")).toInstant());
    }
    
    public static GameVersion method26992() {
        return new Class8164();
    }
    
    public String getId() {
        return this.field33626;
    }
    
    public String getName() {
        return this.field33627;
    }
    
    public String getReleaseTarget() {
        return this.field33633;
    }
    
    public int getWorldVersion() {
        return this.field33629;
    }
    
    public int getProtocolVersion() {
        return this.field33630;
    }
    
    public int getPackVersion() {
        return this.field33631;
    }
    
    public Date getBuildTime() {
        return this.field33632;
    }
    
    public boolean isStable() {
        return this.field33628;
    }
    
    static {
        field33625 = LogManager.getLogger();
    }
}
