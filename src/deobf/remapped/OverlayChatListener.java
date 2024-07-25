package remapped;

import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class OverlayChatListener implements IChatListener {
   private static String[] field_35611;
   private final MinecraftClient field_35610;

   public OverlayChatListener(MinecraftClient var1) {
      this.field_35610 = var1;
   }

   @Override
   public void method_44914(ChatType var1, ITextComponent var2, UUID var3) {
      this.field_35610.field_9614.method_13982(var2, false);
   }
}
