package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class IPBanEntry extends BanEntry<String>
{
    public IPBanEntry(String p_i932_1_)
    {
        this(p_i932_1_, (Date)null, (String)null, (Date)null, (String)null);
    }

    public IPBanEntry(String p_i933_1_, @Nullable Date p_i933_2_, @Nullable String p_i933_3_, @Nullable Date p_i933_4_, @Nullable String p_i933_5_)
    {
        super(p_i933_1_, p_i933_2_, p_i933_3_, p_i933_4_, p_i933_5_);
    }

    public ITextComponent getDisplayName()
    {
        return new StringTextComponent(this.getValue());
    }

    public IPBanEntry(JsonObject p_i934_1_)
    {
        super(getIPFromJson(p_i934_1_), p_i934_1_);
    }

    private static String getIPFromJson(JsonObject json)
    {
        return json.has("ip") ? json.get("ip").getAsString() : null;
    }

    protected void onSerialization(JsonObject data)
    {
        if (this.getValue() != null)
        {
            data.addProperty("ip", this.getValue());
            super.onSerialization(data);
        }
    }
}
