package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_8126 {
   private static String[] field_41627;
   private final int field_41625;
   private final int field_41628;
   private final class_4550 field_41626;

   public class_8126(int var1, int var2, class_4550 var3) {
      this.field_41625 = var1;
      this.field_41628 = var2;
      this.field_41626 = var3;
   }

   public int method_36969() {
      return this.field_41625;
   }

   public int method_36970() {
      return this.field_41628;
   }

   @Nullable
   public ITextComponent method_36971(class_9155 var1) throws CommandSyntaxException {
      return class_4550.method_21101(this.field_41626.method_21106(var1));
   }
}
