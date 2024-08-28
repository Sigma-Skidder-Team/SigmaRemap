package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum ChatVisibility {
   FULL(0, "options.chat.visibility.full"),
   SYSTEM(1, "options.chat.visibility.system"),
   HIDDEN(2, "options.chat.visibility.hidden");

   private static final ChatVisibility[] field_221255_d = Arrays.stream(values())
      .sorted(Comparator.comparingInt(ChatVisibility::getId))
      .toArray(ChatVisibility[]::new
      );
   private final int id;
   private final String resourceKey;

    private ChatVisibility(int var3, String var4) {
      this.id = var3;
      this.resourceKey = var4;
   }

   public int getId() {
      return this.id;
   }

   public String getResourceKey() {
      return this.resourceKey;
   }

   public static ChatVisibility getValue(int var0) {
      return field_221255_d[MathHelper.normalizeAngle(var0, field_221255_d.length)];
   }
}
