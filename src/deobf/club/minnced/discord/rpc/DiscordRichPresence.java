package club.minnced.discord.rpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DiscordRichPresence extends Structure {
   private static final List<String> FIELD_ORDER = Collections.<String>unmodifiableList(
      Arrays.asList(
         "state",
         "details",
         "startTimestamp",
         "endTimestamp",
         "largeImageKey",
         "largeImageText",
         "smallImageKey",
         "smallImageText",
         "partyId",
         "partySize",
         "partyMax",
         "matchSecret",
         "joinSecret",
         "spectateSecret",
         "instance"
      )
   );
   public String state;
   public String details;
   public long startTimestamp;
   public long endTimestamp;
   public String largeImageKey;
   public String largeImageText;
   public String smallImageKey;
   public String smallImageText;
   public String partyId;
   public int partySize;
   public int partyMax;
   public String matchSecret;
   public String joinSecret;
   public String spectateSecret;
   public byte instance;

   public DiscordRichPresence(String encoding) {
      this.setStringEncoding(encoding);
   }

   public DiscordRichPresence() {
      this("UTF-8");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof DiscordRichPresence)) {
         return false;
      } else {
         DiscordRichPresence var4 = (DiscordRichPresence)o;
         return this.startTimestamp == var4.startTimestamp
            && this.endTimestamp == var4.endTimestamp
            && this.partySize == var4.partySize
            && this.partyMax == var4.partyMax
            && this.instance == var4.instance
            && Objects.equals(this.state, var4.state)
            && Objects.equals(this.details, var4.details)
            && Objects.equals(this.largeImageKey, var4.largeImageKey)
            && Objects.equals(this.largeImageText, var4.largeImageText)
            && Objects.equals(this.smallImageKey, var4.smallImageKey)
            && Objects.equals(this.smallImageText, var4.smallImageText)
            && Objects.equals(this.partyId, var4.partyId)
            && Objects.equals(this.matchSecret, var4.matchSecret)
            && Objects.equals(this.joinSecret, var4.joinSecret)
            && Objects.equals(this.spectateSecret, var4.spectateSecret);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.state,
         this.details,
         this.startTimestamp,
         this.endTimestamp,
         this.largeImageKey,
         this.largeImageText,
         this.smallImageKey,
         this.smallImageText,
         this.partyId,
         this.partySize,
         this.partyMax,
         this.matchSecret,
         this.joinSecret,
         this.spectateSecret,
         this.instance
      );
   }

   @Override
   public List<String> getFieldOrder() {
      return FIELD_ORDER;
   }
}
