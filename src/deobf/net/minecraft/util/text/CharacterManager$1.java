package net.minecraft.util.text;

import java.util.Optional;

public class CharacterManager$1 implements ITextProperties$class_41<ITextProperties> {
   private final TextPropertiesManager field_238368_c_;

   public CharacterManager$1(CharacterManager this$0, CharacterManager$class_37 var2) {
      this.this$0 = this$0;
      this.val$charactermanager$stringwidthprocessor = var2;
      this.field_238368_c_ = new TextPropertiesManager();
   }

   @Override
   public Optional<ITextProperties> accept(Style p_accept_1_, String p_accept_2_) {
      this.val$charactermanager$stringwidthprocessor.func_238399_b_();
      if (!TextProcessing.func_238346_c_(p_accept_2_, p_accept_1_, this.val$charactermanager$stringwidthprocessor)) {
         String var5 = p_accept_2_.substring(0, this.val$charactermanager$stringwidthprocessor.func_238398_a_());
         if (!var5.isEmpty()) {
            this.field_238368_c_.func_238155_a_(ITextProperties.func_240653_a_(var5, p_accept_1_));
         }

         return Optional.<ITextProperties>of(this.field_238368_c_.func_238156_b_());
      } else {
         if (!p_accept_2_.isEmpty()) {
            this.field_238368_c_.func_238155_a_(ITextProperties.func_240653_a_(p_accept_2_, p_accept_1_));
         }

         return Optional.<ITextProperties>empty();
      }
   }
}
