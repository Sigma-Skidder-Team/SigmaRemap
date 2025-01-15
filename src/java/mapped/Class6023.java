// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class Class6023 extends Class6022<GameProfile>
{
    private final int field24512;
    private final boolean field24513;
    
    public Class6023(final GameProfile gameProfile, final int field24512, final boolean field24513) {
        super(gameProfile);
        this.field24512 = field24512;
        this.field24513 = field24513;
    }
    
    public Class6023(final JsonObject jsonObject) {
        super(method17947(jsonObject), jsonObject);
        this.field24512 = (jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0);
        this.field24513 = (jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean());
    }
    
    public int method17945() {
        return this.field24512;
    }
    
    public boolean method17946() {
        return this.field24513;
    }
    
    @Override
    public void method17944(final JsonObject jsonObject) {
        if (this.method17942() != null) {
            jsonObject.addProperty("uuid", (this.method17942().getId() != null) ? this.method17942().getId().toString() : "");
            jsonObject.addProperty("name", this.method17942().getName());
            super.method17944(jsonObject);
            jsonObject.addProperty("level", (Number)this.field24512);
            jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.field24513));
        }
    }
    
    private static GameProfile method17947(final JsonObject jsonObject) {
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
