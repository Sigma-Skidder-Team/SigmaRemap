package net.minecraft.util.text;

import remapped.class_5255;

public class CharacterManager$class_37 implements class_5255 {
   private float field_238396_b_;
   private int field_238397_c_;

   public CharacterManager$class_37(CharacterManager this$0, float p_i232248_2_) {
      this.this$0 = this$0;
      this.field_238396_b_ = p_i232248_2_;
   }

   public boolean 钘댠醧䖼䕦娍(int p_accept_1_, Style p_accept_2_, int p_accept_3_) {
      this.field_238396_b_ = this.field_238396_b_ - CharacterManager.access$300(this.this$0).getWidth(p_accept_3_, p_accept_2_);
      if (this.field_238396_b_ >= 0.0F) {
         this.field_238397_c_ = p_accept_1_ + Character.charCount(p_accept_3_);
         return true;
      } else {
         return false;
      }
   }

   public int func_238398_a_() {
      return this.field_238397_c_;
   }

   public void func_238399_b_() {
      this.field_238397_c_ = 0;
   }
}
