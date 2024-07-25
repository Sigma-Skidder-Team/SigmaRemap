package remapped;

import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class NormalChatListener implements IChatListener {
   private static String[] field_4517;
   private final MinecraftClient field_4518;

   public NormalChatListener(MinecraftClient var1) {
      this.field_4518 = var1;
   }

   @Override
   public void method_44914(ChatType var1, ITextComponent var2, UUID var3) {
      if (var1 == ChatType.CHAT) {
         this.field_4518.field_9614.method_13991().method_18682(var2);
      } else {
         this.field_4518.field_9614.method_13991().method_18676(var2);
      }
   }
}
