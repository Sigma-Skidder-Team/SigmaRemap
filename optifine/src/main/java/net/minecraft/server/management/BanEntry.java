package net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public abstract class BanEntry<T> extends UserListEntry<T>
{
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    protected final Date banStartDate;
    protected final String bannedBy;
    protected final Date banEndDate;
    protected final String reason;

    public BanEntry(T p_i4154_1_, @Nullable Date p_i4154_2_, @Nullable String p_i4154_3_, @Nullable Date p_i4154_4_, @Nullable String p_i4154_5_)
    {
        super(p_i4154_1_);
        this.banStartDate = p_i4154_2_ == null ? new Date() : p_i4154_2_;
        this.bannedBy = p_i4154_3_ == null ? "(Unknown)" : p_i4154_3_;
        this.banEndDate = p_i4154_4_;
        this.reason = p_i4154_5_ == null ? "Banned by an operator." : p_i4154_5_;
    }

    protected BanEntry(T p_i4155_1_, JsonObject p_i4155_2_)
    {
        super(p_i4155_1_, p_i4155_2_);
        Date date;

        try
        {
            date = p_i4155_2_.has("created") ? DATE_FORMAT.parse(p_i4155_2_.get("created").getAsString()) : new Date();
        }
        catch (ParseException var7)
        {
            date = new Date();
        }

        this.banStartDate = date;
        this.bannedBy = p_i4155_2_.has("source") ? p_i4155_2_.get("source").getAsString() : "(Unknown)";
        Date date1;

        try
        {
            date1 = p_i4155_2_.has("expires") ? DATE_FORMAT.parse(p_i4155_2_.get("expires").getAsString()) : null;
        }
        catch (ParseException var6)
        {
            date1 = null;
        }

        this.banEndDate = date1;
        this.reason = p_i4155_2_.has("reason") ? p_i4155_2_.get("reason").getAsString() : "Banned by an operator.";
    }

    public String getBannedBy()
    {
        return this.bannedBy;
    }

    public Date getBanEndDate()
    {
        return this.banEndDate;
    }

    public String getBanReason()
    {
        return this.reason;
    }

    public abstract ITextComponent getDisplayName();

    boolean hasBanExpired()
    {
        return this.banEndDate == null ? false : this.banEndDate.before(new Date());
    }

    protected void onSerialization(JsonObject data)
    {
        data.addProperty("created", DATE_FORMAT.format(this.banStartDate));
        data.addProperty("source", this.bannedBy);
        data.addProperty("expires", this.banEndDate == null ? "forever" : DATE_FORMAT.format(this.banEndDate));
        data.addProperty("reason", this.reason);
    }
}
