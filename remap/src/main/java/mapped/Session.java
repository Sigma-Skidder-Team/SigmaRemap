// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.GameProfile;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Session {
    private final String username;
    private final String playerID;
    private final String token;
    private final Type sessionType;

    public Session(String usernameIn, String playerIDIn, String tokenIn, String sessionTypeIn) {
        this.username = usernameIn;
        this.playerID = playerIDIn;
        this.token = tokenIn;
        this.sessionType = Type.setSessionType(sessionTypeIn);
    }

    public String getSessionID() {
        return "token:" + this.token + ":" + this.playerID;
    }

    public String getPlayerID() {
        return this.playerID;
    }

    public String getUsername() {
        return this.username;
    }

    public String getToken() {
        return this.token;
    }

    public GameProfile getProfile() {
        try {
            return new GameProfile(UUIDTypeAdapter.fromString(this.getPlayerID()), this.getUsername());
        } catch (final IllegalArgumentException ex) {
            return new GameProfile(null, this.getUsername());
        }
    }

    public enum Type {
        LEGACY("legacy"),
        MOJANG("mojang");

        private static final Map<String, Type> SESSION_TYPES;
        private final String sessionType;

        Type(final String sessionType) {
            this.sessionType = sessionType;
        }

        @Nullable
        public static Type setSessionType(final String s) {
            return Type.SESSION_TYPES.get(s.toLowerCase(Locale.ROOT));
        }

        static {
            SESSION_TYPES = Arrays.stream(values()).collect(Collectors.toMap(type -> type.sessionType, Function.identity()));
        }
    }
}
