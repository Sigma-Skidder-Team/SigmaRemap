package net.optifine.config;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.IteratableOption;
import net.minecraft.util.text.ITextComponent;

public class IteratableOptionOF extends IteratableOption {
   public IteratableOptionOF(String var1) {
      super(var1, (BiConsumer<GameSettings, Integer>)null, (BiFunction<GameSettings, IteratableOption, ITextComponent>)null);
      super.field25313 = this::method17943;
      super.field25314 = this::method17944;
   }

   public void method17943(GameSettings var1, int var2) {
      var1.method37157(this, var2);
   }

   public ITextComponent method17944(GameSettings var1, IteratableOption var2) {
      return var1.method37158(var2);
   }
}
