package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4288 implements class_1429 {
   private static final SimpleCommandExceptionType field_20808 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.entity.invalid"));
   public static final Function<String, class_5098> field_20810 = var0 -> new class_3870(var0);
   private final Entity field_20811;

   public class_4288(Entity var1) {
      this.field_20811 = var1;
   }

   @Override
   public void method_6572(CompoundNBT var1) throws CommandSyntaxException {
      if (!(this.field_20811 instanceof PlayerEntity)) {
         UUID var4 = this.field_20811.method_37328();
         this.field_20811.method_37393(var1);
         this.field_20811.method_37377(var4);
      } else {
         throw field_20808.create();
      }
   }

   @Override
   public CompoundNBT method_6573() {
      return class_6000.method_27394(this.field_20811);
   }

   @Override
   public ITextComponent method_6570() {
      return new TranslationTextComponent("commands.data.entity.modified", this.field_20811.method_19839());
   }

   @Override
   public ITextComponent method_6574(class_8406 var1) {
      return new TranslationTextComponent("commands.data.entity.query", this.field_20811.method_19839(), var1.method_38711());
   }

   @Override
   public ITextComponent method_6571(class_9257 var1, double var2, int var4) {
      return new TranslationTextComponent("commands.data.entity.get", var1, this.field_20811.method_19839(), String.format(Locale.ROOT, "%.2f", var2), var4);
   }
}
