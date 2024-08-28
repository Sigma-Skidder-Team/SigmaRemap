package net.minecraft.util.text;

import java.util.Optional;

public final class ITextProperties$2 implements ITextProperties {
   public final String val$p_240652_0_;

   public ITextProperties$2(String var1) {
      this.val$p_240652_0_ = var1;
   }

   @Override
   public <T> Optional<T> func_230438_a_(ITextProperties$ITextAcceptor<T> p_230438_1_) {
      return p_230438_1_.accept(this.val$p_240652_0_);
   }

   @Override
   public <T> Optional<T> func_230439_a_(ITextProperties$IStyledTextAcceptor<T> p_230439_1_, Style p_230439_2_) {
      return p_230439_1_.accept(p_230439_2_, this.val$p_240652_0_);
   }
}
