package net.minecraft.util.text;

import mapped.Class2545;

public class CharacterManager$MultilineProcessor implements Class2545 {
   private final float field_238377_b_;
   private int field_238378_c_;
   private Style field_238379_d_;
   private boolean field_238380_e_;
   private float field_238381_f_;
   private int field_238382_g_;
   private Style field_238383_h_;
   private int field_238384_i_;
   private int field_238385_j_;
   public final CharacterManager this$0;

   public CharacterManager$MultilineProcessor(CharacterManager this$0, float p_i232246_2_) {
      this.this$0 = this$0;
      this.field_238378_c_ = -1;
      this.field_238379_d_ = Style.EMPTY;
      this.field_238382_g_ = -1;
      this.field_238383_h_ = Style.EMPTY;
      this.field_238377_b_ = Math.max(p_i232246_2_, 1.0F);
   }

   @Override
   public boolean method10739(int p_accept_1_, Style p_accept_2_, int p_accept_3_) {
      int f = p_accept_1_ + this.field_238385_j_;
      switch (p_accept_3_) {
         case 10:
            return this.func_238388_a_(f, p_accept_2_);
         case 32:
            this.field_238382_g_ = f;
            this.field_238383_h_ = p_accept_2_;
         default:
            float var7 = CharacterManager.access$300(this.this$0).getWidth(p_accept_3_, p_accept_2_);
            this.field_238381_f_ += var7;
            if (this.field_238380_e_ && this.field_238381_f_ > this.field_238377_b_) {
               return this.field_238382_g_ != -1 ? this.func_238388_a_(this.field_238382_g_, this.field_238383_h_) : this.func_238388_a_(f, p_accept_2_);
            } else {
               this.field_238380_e_ |= var7 != 0.0F;
               this.field_238384_i_ = f + Character.charCount(p_accept_3_);
               return true;
            }
      }
   }

   private boolean func_238388_a_(int p_238388_1_, Style p_238388_2_) {
      this.field_238378_c_ = p_238388_1_;
      this.field_238379_d_ = p_238388_2_;
      return false;
   }

   private boolean func_238390_c_() {
      return this.field_238378_c_ != -1;
   }

   public int func_238386_a_() {
      return this.func_238390_c_() ? this.field_238378_c_ : this.field_238384_i_;
   }

   public Style func_238389_b_() {
      return this.field_238379_d_;
   }

   public void func_238387_a_(int p_238387_1_) {
      this.field_238385_j_ += p_238387_1_;
   }
}
