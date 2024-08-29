package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7154 implements Class7151 {
   private static final SimpleCommandExceptionType field30731 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.entity.invalid"));
   public static final Function<String, Class8196> field30732 = var0 -> new Class8195(var0);
   private final Entity field30733;

   public Class7154(Entity var1) {
      this.field30733 = var1;
   }

   @Override
   public void method22311(CompoundNBT var1) throws CommandSyntaxException {
      if (!(this.field30733 instanceof PlayerEntity)) {
         UUID var4 = this.field30733.getUniqueID();
         this.field30733.method3295(var1);
         this.field30733.method3374(var4);
      } else {
         throw field30731.create();
      }
   }

   @Override
   public CompoundNBT method22312() {
      return Class8811.method31813(this.field30733);
   }

   @Override
   public ITextComponent method22313() {
      return new TranslationTextComponent("commands.data.entity.modified", this.field30733.getDisplayName());
   }

   @Override
   public ITextComponent method22314(Class30 var1) {
      return new TranslationTextComponent("commands.data.entity.query", this.field30733.getDisplayName(), var1.method82());
   }

   @Override
   public ITextComponent method22315(Class9670 var1, double var2, int var4) {
      return new TranslationTextComponent("commands.data.entity.get", var1, this.field30733.getDisplayName(), String.format(Locale.ROOT, "%.2f", var2), var4);
   }
}
