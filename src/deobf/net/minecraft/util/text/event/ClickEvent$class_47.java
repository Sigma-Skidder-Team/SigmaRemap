package net.minecraft.util.text.event;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum ClickEvent$class_47 {
   OPEN_URL("open_url", true),
   OPEN_FILE("open_file", false),
   RUN_COMMAND("run_command", true),
   SUGGEST_COMMAND("suggest_command", true),
   CHANGE_PAGE("change_page", true),
   COPY_TO_CLIPBOARD("copy_to_clipboard", true);

   private static final Map<String, ClickEvent$class_47> NAME_MAPPING = Arrays.<ClickEvent$class_47>stream(values())
      .collect(Collectors.toMap(ClickEvent$class_47::getCanonicalName, p_199851_0_ -> (ClickEvent$class_47)p_199851_0_));
   private final boolean allowedInChat;
   private final String canonicalName;

   private ClickEvent$class_47(String canonicalNameIn, boolean allowedInChatIn) {
      this.canonicalName = canonicalNameIn;
      this.allowedInChat = allowedInChatIn;
   }

   public boolean shouldAllowInChat() {
      return this.allowedInChat;
   }

   public String getCanonicalName() {
      return this.canonicalName;
   }

   public static ClickEvent$class_47 getValueByCanonicalName(String canonicalNameIn) {
      return NAME_MAPPING.get(canonicalNameIn);
   }
}
