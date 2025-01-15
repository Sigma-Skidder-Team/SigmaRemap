package net.minecraft.server.management;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class ProfileBanEntry extends BanEntry<GameProfile>
{
    public ProfileBanEntry(GameProfile p_i3457_1_)
    {
        this(p_i3457_1_, (Date)null, (String)null, (Date)null, (String)null);
    }

    public ProfileBanEntry(GameProfile p_i3458_1_, @Nullable Date p_i3458_2_, @Nullable String p_i3458_3_, @Nullable Date p_i3458_4_, @Nullable String p_i3458_5_)
    {
        super(p_i3458_1_, p_i3458_2_, p_i3458_3_, p_i3458_4_, p_i3458_5_);
    }

    public ProfileBanEntry(JsonObject p_i3459_1_)
    {
        super(toGameProfile(p_i3459_1_), p_i3459_1_);
    }

    protected void onSerialization(JsonObject data)
    {
        if (this.getValue() != null)
        {
            data.addProperty("uuid", this.getValue().getId() == null ? "" : this.getValue().getId().toString());
            data.addProperty("name", this.getValue().getName());
            super.onSerialization(data);
        }
    }

    public ITextComponent getDisplayName()
    {
        GameProfile gameprofile = this.getValue();
        return new StringTextComponent(gameprofile.getName() != null ? gameprofile.getName() : Objects.toString(gameprofile.getId(), "(Unknown)"));
    }

    private static GameProfile toGameProfile(JsonObject json)
    {
        if (json.has("uuid") && json.has("name"))
        {
            String s = json.get("uuid").getAsString();
            UUID uuid;

            try
            {
                uuid = UUID.fromString(s);
            }
            catch (Throwable var4)
            {
                return null;
            }

            return new GameProfile(uuid, json.get("name").getAsString());
        }
        else
        {
            return null;
        }
    }
}
