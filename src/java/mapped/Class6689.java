package mapped;

import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class Class6689 implements Class6687 {
   private static String[] field29304;
   private final Minecraft field29305;

   public Class6689(Minecraft var1) {
      this.field29305 = var1;
   }

   @Override
   public void method20400(ChatType var1, ITextComponent var2, UUID var3) {
      this.field29305.field1298.method5985(var2, false);
   }
}
