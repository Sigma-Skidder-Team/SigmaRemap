package mapped;

import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class Class6686 implements Class6687 {
   private static String[] field29298;
   private final Minecraft field29299;

   public Class6686(Minecraft var1) {
      this.field29299 = var1;
   }

   @Override
   public void method20400(ChatType var1, ITextComponent var2, UUID var3) {
      if (var1 == ChatType.CHAT) {
         this.field29299.ingameGUI.getChatGUI().method5950(var2);
      } else {
         this.field29299.ingameGUI.getChatGUI().method5930(var2);
      }
   }
}
