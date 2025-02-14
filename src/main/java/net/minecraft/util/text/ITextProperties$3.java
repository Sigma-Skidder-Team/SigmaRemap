package net.minecraft.util.text;

import java.util.Optional;

public final class ITextProperties$3 implements ITextProperties {
   public final String val$p_240653_0_;
   public final Style val$p_240653_1_;

   public ITextProperties$3(String var1, Style var2) {
      this.val$p_240653_0_ = var1;
      this.val$p_240653_1_ = var2;
   }

   @Override
   public <T> Optional<T> func_230438_a_(ITextProperties$ITextAcceptor<T> p_230438_1_) {
      return p_230438_1_.accept(this.val$p_240653_0_);
   }

   @Override
   public <T> Optional<T> func_230439_a_(ITextProperties$IStyledTextAcceptor<T> p_230439_1_, Style p_230439_2_) {
      return p_230439_1_.accept(this.val$p_240653_1_.mergeStyle(p_230439_2_), this.val$p_240653_0_);
   }
}
