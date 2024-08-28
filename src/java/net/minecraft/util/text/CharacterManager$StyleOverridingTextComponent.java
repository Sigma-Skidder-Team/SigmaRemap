package net.minecraft.util.text;

import java.util.Optional;

public class CharacterManager$StyleOverridingTextComponent implements ITextProperties {
   private final String field_238391_a_;
   private final Style field_238392_d_;

   public CharacterManager$StyleOverridingTextComponent(String p_i232247_1_, Style p_i232247_2_) {
      this.field_238391_a_ = p_i232247_1_;
      this.field_238392_d_ = p_i232247_2_;
   }

   @Override
   public <T> Optional<T> func_230438_a_(ITextProperties$ITextAcceptor<T> p_230438_1_) {
      return p_230438_1_.accept(this.field_238391_a_);
   }

   @Override
   public <T> Optional<T> func_230439_a_(ITextProperties$IStyledTextAcceptor<T> p_230439_1_, Style p_230439_2_) {
      return p_230439_1_.accept(this.field_238392_d_.mergeStyle(p_230439_2_), this.field_238391_a_);
   }

   // $VF: synthetic method
   public static String access$100(CharacterManager$StyleOverridingTextComponent x0) {
      return x0.field_238391_a_;
   }

   // $VF: synthetic method
   public static Style access$200(CharacterManager$StyleOverridingTextComponent x0) {
      return x0.field_238392_d_;
   }
}
