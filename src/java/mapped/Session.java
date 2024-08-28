package mapped;

import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;

import java.util.Map;
import java.util.UUID;

public class Session {
   public String username;
   public String playerID;
   public String token;
   private final Type sessionType;

   public Session(String var1, String var2, String var3, String var4) {
      this.username = var1;
      this.playerID = var2;
      this.token = var3;
      this.sessionType = Type.setSessionType(var4);
   }

   @Override
   public String toString() {
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
         UUID var3 = UUIDTypeAdapter.fromString(this.getPlayerID());
         return new GameProfile(var3, this.getUsername());
      } catch (IllegalArgumentException var4) {
         return new GameProfile((UUID)null, this.getUsername());
      }
   }

   public static enum Type
   {
      LEGACY("legacy"),
      MOJANG("mojang");

      private static final Map<String, Session.Type> SESSION_TYPES = Maps.<String, Session.Type>newHashMap();
      private final String sessionType;

      private Type(String sessionTypeIn)
      {
         this.sessionType = sessionTypeIn;
      }

      public static Session.Type setSessionType(String sessionTypeIn)
      {
         return (Session.Type)SESSION_TYPES.get(sessionTypeIn.toLowerCase());
      }

      static {
         for (Session.Type session$type : values())
         {
            SESSION_TYPES.put(session$type.sessionType, session$type);
         }
      }
   }
}
