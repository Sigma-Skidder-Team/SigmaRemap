package club.minnced.discord.rpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DiscordUser extends Structure {
   private static final List<String> FIELD_ORDER = Collections.<String>unmodifiableList(Arrays.asList("userId", "username", "discriminator", "avatar"));
   public String userId;
   public String username;
   public String discriminator;
   public String avatar;

   public DiscordUser(String encoding) {
      this.setStringEncoding(encoding);
   }

   public DiscordUser() {
      this("UTF-8");
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof DiscordUser)) {
         return false;
      } else {
         DiscordUser var4 = (DiscordUser)o;
         return Objects.equals(this.userId, var4.userId)
            && Objects.equals(this.username, var4.username)
            && Objects.equals(this.discriminator, var4.discriminator)
            && Objects.equals(this.avatar, var4.avatar);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.userId, this.username, this.discriminator, this.avatar);
   }

   @Override
   public List<String> getFieldOrder() {
      return FIELD_ORDER;
   }
}
