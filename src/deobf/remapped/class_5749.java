package remapped;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5749 implements class_1429 {
   private static final SimpleCommandExceptionType field_29111 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.block.invalid"));
   public static final Function<String, class_5098> field_29109 = var0 -> new class_5953(var0);
   private final class_3757 field_29110;
   private final BlockPos field_29107;

   public class_5749(class_3757 var1, BlockPos var2) {
      this.field_29110 = var1;
      this.field_29107 = var2;
   }

   @Override
   public void method_6572(CompoundNBT var1) {
      var1.putInt("x", this.field_29107.method_12173());
      var1.putInt("y", this.field_29107.method_12165());
      var1.putInt("z", this.field_29107.method_12185());
      class_2522 var4 = this.field_29110.method_17402().method_28262(this.field_29107);
      this.field_29110.method_17394(var4, var1);
      this.field_29110.method_17407();
      this.field_29110.method_17402().method_29572(this.field_29107, var4, var4, 3);
   }

   @Override
   public CompoundNBT method_6573() {
      return this.field_29110.method_17396(new CompoundNBT());
   }

   @Override
   public ITextComponent method_6570() {
      return new TranslationTextComponent(
         "commands.data.block.modified", this.field_29107.method_12173(), this.field_29107.method_12165(), this.field_29107.method_12185()
      );
   }

   @Override
   public ITextComponent method_6574(class_8406 var1) {
      return new TranslationTextComponent(
         "commands.data.block.query", this.field_29107.method_12173(), this.field_29107.method_12165(), this.field_29107.method_12185(), var1.method_38711()
      );
   }

   @Override
   public ITextComponent method_6571(class_9257 var1, double var2, int var4) {
      return new TranslationTextComponent(
         "commands.data.block.get",
         var1,
         this.field_29107.method_12173(),
         this.field_29107.method_12165(),
         this.field_29107.method_12185(),
         String.format(Locale.ROOT, "%.2f", var2),
         var4
      );
   }
}
