package net.minecraft.util.text;

import mapped.Class9125;

import java.util.Map;
import java.util.Optional;

public final class LanguageMap$1 extends LanguageMap {
   public final Map val$map;

   public LanguageMap$1(Map var1) {
      this.val$map = var1;
   }

   @Override
   public String func_230503_a_(String p_230503_1_) {
      return (String) this.val$map.getOrDefault(p_230503_1_, p_230503_1_);
   }

   @Override
   public boolean func_230506_b_(String p_230506_1_) {
      return this.val$map.containsKey(p_230506_1_);
   }

   @Override
   public boolean func_230505_b_() {
      return false;
   }

   @Override
   public Class9125 func_241870_a(ITextProperties p_241870_1_) {
      return p_244262_1_ -> p_241870_1_.func_230439_a_(
               (p_244261_1_, p_244261_2_) -> TextProcessing.func_238346_c_(p_244261_2_, p_244261_1_, p_244262_1_)
                     ? Optional.empty()
                     : ITextProperties.field_240650_b_,
               Style.EMPTY
            )
            .isPresent();
   }
}
