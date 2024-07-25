package net.minecraft.util.text;

import java.util.Optional;

public class CharacterManager$class_38 implements ITextProperties {
   private final String field_238391_a_;
   private final Style field_238392_d_;

   public CharacterManager$class_38(String p_i232247_1_, Style p_i232247_2_) {
      this.field_238391_a_ = p_i232247_1_;
      this.field_238392_d_ = p_i232247_2_;
   }

   @Override
   public <T> Optional<T> func_230438_a_(ITextProperties$class_42<T> p_230438_1_) {
      return p_230438_1_.accept(this.field_238391_a_);
   }

   @Override
   public <T> Optional<T> func_230439_a_(ITextProperties$class_41<T> p_230439_1_, Style p_230439_2_) {
      return p_230439_1_.accept(this.field_238392_d_.mergeStyle(p_230439_2_), this.field_238391_a_);
   }
}
