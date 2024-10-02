package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.ITextComponent;

public class Class9373 {
   private static String[] field43502;
   private final int field43503;
   private final int field43504;
   private final Class8429 field43505;

   public Class9373(int var1, int var2, Class8429 var3) {
      this.field43503 = var1;
      this.field43504 = var2;
      this.field43505 = var3;
   }

   public int method35555() {
      return this.field43503;
   }

   public int method35556() {
      return this.field43504;
   }

   @Nullable
   public ITextComponent method35557(CommandSource var1) throws CommandSyntaxException {
      return Class8429.method29623(this.field43505.method29617(var1));
   }
}
