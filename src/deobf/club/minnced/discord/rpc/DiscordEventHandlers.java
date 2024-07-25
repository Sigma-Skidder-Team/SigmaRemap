package club.minnced.discord.rpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DiscordEventHandlers extends Structure {
   private static final List<String> FIELD_ORDER = Collections.<String>unmodifiableList(
      Arrays.asList("ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest")
   );
   public DiscordEventHandlers$class_3 ready;
   public DiscordEventHandlers$class_4 disconnected;
   public DiscordEventHandlers$class_4 errored;
   public DiscordEventHandlers$class_1 joinGame;
   public DiscordEventHandlers$class_1 spectateGame;
   public DiscordEventHandlers$class_2 joinRequest;

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof DiscordEventHandlers)) {
         return false;
      } else {
         DiscordEventHandlers var4 = (DiscordEventHandlers)o;
         return Objects.equals(this.ready, var4.ready)
            && Objects.equals(this.disconnected, var4.disconnected)
            && Objects.equals(this.errored, var4.errored)
            && Objects.equals(this.joinGame, var4.joinGame)
            && Objects.equals(this.spectateGame, var4.spectateGame)
            && Objects.equals(this.joinRequest, var4.joinRequest);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.ready, this.disconnected, this.errored, this.joinGame, this.spectateGame, this.joinRequest);
   }

   @Override
   public List<String> getFieldOrder() {
      return FIELD_ORDER;
   }
}
