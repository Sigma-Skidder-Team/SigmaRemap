// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class Class6027 extends Class6022<GameProfile>
{
    public Class6027(final GameProfile gameProfile) {
        super(gameProfile);
    }
    
    public Class6027(final JsonObject jsonObject) {
        super(method17954(jsonObject), jsonObject);
    }
    
    @Override
    public void method17944(final JsonObject jsonObject) {
        if (this.method17942() != null) {
            jsonObject.addProperty("uuid", (this.method17942().getId() != null) ? this.method17942().getId().toString() : "");
            jsonObject.addProperty("name", this.method17942().getName());
            super.method17944(jsonObject);
        }
    }
    
    private static GameProfile method17954(final JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            final String asString = jsonObject.get("uuid").getAsString();
            UUID fromString;
            try {
                fromString = UUID.fromString(asString);
            }
            catch (final Throwable t) {
                return null;
            }
            return new GameProfile(fromString, jsonObject.get("name").getAsString());
        }
        return null;
    }
}
