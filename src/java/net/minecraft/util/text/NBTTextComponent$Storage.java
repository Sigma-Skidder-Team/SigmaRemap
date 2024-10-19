package net.minecraft.util.text;

import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.command.CommandSource;
import mapped.Class9670;

import java.util.Objects;
import java.util.stream.Stream;

public class NBTTextComponent$Storage extends NBTTextComponent {
   private final ResourceLocation field_229725_e_;

   public NBTTextComponent$Storage(String p_i226087_1_, boolean p_i226087_2_, ResourceLocation p_i226087_3_) {
      super(p_i226087_1_, p_i226087_2_);
      this.field_229725_e_ = p_i226087_3_;
   }

   public NBTTextComponent$Storage(String p_i226086_1_, Class9670 p_i226086_2_, boolean p_i226086_3_, ResourceLocation p_i226086_4_) {
      super(p_i226086_1_, p_i226086_2_, p_i226086_3_);
      this.field_229725_e_ = p_i226086_4_;
   }

   public ResourceLocation func_229726_k_() {
      return this.field_229725_e_;
   }

   public NBTTextComponent$Storage copyRaw() {
      return new NBTTextComponent$Storage(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_229725_e_);
   }

   @Override
   public Stream<CompoundNBT> func_218673_a(CommandSource p_218673_1_) {
      CompoundNBT var4 = p_218673_1_.getServer().method1410().method32748(this.field_229725_e_);
      return Stream.<CompoundNBT>of(var4);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$Storage)) {
         return false;
      } else {
         NBTTextComponent$Storage var4 = (NBTTextComponent$Storage)p_equals_1_;
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
