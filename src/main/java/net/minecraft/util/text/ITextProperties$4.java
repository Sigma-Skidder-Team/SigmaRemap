package net.minecraft.util.text;

import java.util.List;
import java.util.Optional;

public final class ITextProperties$4 implements ITextProperties {
   public final List val$p_240654_0_;

   public ITextProperties$4(List var1) {
      this.val$p_240654_0_ = var1;
   }

   @Override
   public <T> Optional<T> func_230438_a_(ITextProperties$ITextAcceptor<T> p_230438_1_) {
      for (ITextProperties optional : (List<ITextProperties>) this.val$p_240654_0_) {
         Optional var6 = optional.<T>func_230438_a_(p_230438_1_);
         if (var6.isPresent()) {
            return var6;
         }
      }

      return Optional.<T>empty();
   }

   @Override
   public <T> Optional<T> func_230439_a_(ITextProperties$IStyledTextAcceptor<T> p_230439_1_, Style p_230439_2_) {
      for (ITextProperties optional : (List<ITextProperties>) this.val$p_240654_0_) {
         Optional var7 = optional.<T>func_230439_a_(p_230439_1_, p_230439_2_);
         if (var7.isPresent()) {
            return var7;
         }
      }

      return Optional.<T>empty();
   }
}
