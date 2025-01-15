package net.minecraft.util;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Session
{
    private final String username;
    private final String playerID;
    private final String token;
    private final Session.Type sessionType;

    public Session(String p_i3987_1_, String p_i3987_2_, String p_i3987_3_, String p_i3987_4_)
    {
        this.username = p_i3987_1_;
        this.playerID = p_i3987_2_;
        this.token = p_i3987_3_;
        this.sessionType = Session.Type.setSessionType(p_i3987_4_);
    }

    public String getSessionID()
    {
        return "token:" + this.token + ":" + this.playerID;
    }

    public String getPlayerID()
    {
        return this.playerID;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getToken()
    {
        return this.token;
    }

    public GameProfile getProfile()
    {
        try
        {
            UUID uuid = UUIDTypeAdapter.fromString(this.getPlayerID());
            return new GameProfile(uuid, this.getUsername());
        }
        catch (IllegalArgumentException var2)
        {
            return new GameProfile((UUID)null, this.getUsername());
        }
    }

    public static enum Type
    {
        LEGACY("legacy"),
        MOJANG("mojang");

        private static final Map<String, Session.Type> SESSION_TYPES = Arrays.stream(values()).collect(Collectors.toMap((p_199876_0_) -> {
            return p_199876_0_.sessionType;
        }, Function.identity()));
        private final String sessionType;

        private Type(String p_i2975_3_)
        {
            this.sessionType = p_i2975_3_;
        }

        @Nullable
        public static Session.Type setSessionType(String sessionTypeIn)
        {
            return SESSION_TYPES.get(sessionTypeIn.toLowerCase(Locale.ROOT));
        }
    }
}
