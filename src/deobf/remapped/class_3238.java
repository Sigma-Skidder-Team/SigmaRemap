package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3238 implements Predicate<ItemStack> {
   private static final Dynamic2CommandExceptionType field_16102 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("arguments.item.overstacked", var0, var1)
   );
   private final class_2451 field_16103;
   private final class_5734 field_16105;

   public class_3238(class_2451 var1, class_5734 var2) {
      this.field_16103 = var1;
      this.field_16105 = var2;
   }

   public class_2451 method_14834() {
      return this.field_16103;
   }

   public boolean test(ItemStack var1) {
      return var1.method_27960() == this.field_16103 && class_4338.method_20182(this.field_16105, var1.method_27990(), true);
   }

   public ItemStack method_14833(int var1, boolean var2) throws CommandSyntaxException {
      ItemStack var5 = new ItemStack(this.field_16103, var1);
      if (this.field_16105 != null) {
         var5.method_27965(this.field_16105);
      }

      if (var2 && var1 > var5.method_28016()) {
         throw field_16102.create(class_8669.field_44382.method_39797(this.field_16103), var5.method_28016());
      } else {
         return var5;
      }
   }

   public String method_14835() {
      StringBuilder var3 = new StringBuilder(class_8669.field_44382.method_14041(this.field_16103));
      if (this.field_16105 != null) {
         var3.append(this.field_16105);
      }

      return var3.toString();
   }
}
