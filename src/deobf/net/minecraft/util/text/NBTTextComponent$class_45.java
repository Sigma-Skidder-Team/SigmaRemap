package net.minecraft.util.text;

import java.util.Objects;
import java.util.stream.Stream;
import remapped.Identifier;
import remapped.CompoundNBT;
import remapped.class_9155;
import remapped.class_9257;

public class NBTTextComponent$class_45 extends NBTTextComponent {
   private final Identifier field_229725_e_;

   public NBTTextComponent$class_45(String p_i226087_1_, boolean p_i226087_2_, Identifier p_i226087_3_) {
      super(p_i226087_1_, p_i226087_2_);
      this.field_229725_e_ = p_i226087_3_;
   }

   public NBTTextComponent$class_45(String p_i226086_1_, class_9257 p_i226086_2_, boolean p_i226086_3_, Identifier p_i226086_4_) {
      super(p_i226086_1_, p_i226086_2_, p_i226086_3_);
      this.field_229725_e_ = p_i226086_4_;
   }

   public Identifier func_229726_k_() {
      return this.field_229725_e_;
   }

   public NBTTextComponent$class_45 copyRaw() {
      return new NBTTextComponent$class_45(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_229725_e_);
   }

   @Override
   public Stream<CompoundNBT> func_218673_a(class_9155 p_218673_1_) {
      CompoundNBT var4 = p_218673_1_.method_42177().method_1678().method_29742(this.field_229725_e_);
      return Stream.<CompoundNBT>of(var4);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$class_45)) {
         return false;
      } else {
         NBTTextComponent$class_45 var4 = (NBTTextComponent$class_45)p_equals_1_;
         return Objects.equals(this.field_229725_e_, var4.field_229725_e_)
            && Objects.equals(this.field_218679_c, var4.field_218679_c)
            && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "StorageNbtComponent{id='"
         + this.field_229725_e_
         + '\''
         + "path='"
         + this.field_218679_c
         + '\''
         + ", siblings="
         + this.siblings
         + ", style="
         + this.getStyle()
         + '}';
   }
}
