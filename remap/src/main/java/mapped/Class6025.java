// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.util.Date;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;

public class Class6025 extends Class6024<GameProfile>
{
    public Class6025(final GameProfile gameProfile) {
        this(gameProfile, null, null, null, null);
    }
    
    public Class6025(final GameProfile gameProfile, final Date date, final String s, final Date date2, final String s2) {
        super(gameProfile, date, s, date2, s2);
    }
    
    public Class6025(final JsonObject jsonObject) {
        super(method17952(jsonObject), jsonObject);
    }
    
    @Override
    public void method17944(final JsonObject jsonObject) {
        if (this.method17942() != null) {
            jsonObject.addProperty("uuid", (this.method17942().getId() != null) ? this.method17942().getId().toString() : "");
            jsonObject.addProperty("name", this.method17942().getName());
            super.method17944(jsonObject);
        }
    }
    
    @Override
    public ITextComponent method17951() {
        final GameProfile gameProfile = this.method17942();
        return new StringTextComponent((gameProfile.getName() == null) ? Objects.toString(gameProfile.getId(), "(Unknown)") : gameProfile.getName());
    }
    
    private static GameProfile method17952(final JsonObject jsonObject) {
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
