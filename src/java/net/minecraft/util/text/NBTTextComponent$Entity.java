package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.*;
import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class NBTTextComponent$Entity extends NBTTextComponent {
   private final String field_218688_e;
   private final Class8429 field_218689_f;

   public NBTTextComponent$Entity(String p_i51292_1_, boolean p_i51292_2_, String p_i51292_3_) {
      super(p_i51292_1_, p_i51292_2_);
      this.field_218688_e = p_i51292_3_;
      this.field_218689_f = func_218686_b(p_i51292_3_);
   }

   @Nullable
   private static Class8429 func_218686_b(String p_218686_0_) {
      try {
         Class8533 var3 = new Class8533(new StringReader(p_218686_0_));
         return var3.method30303();
      } catch (CommandSyntaxException var4) {
         return null;
      }
   }

   private NBTTextComponent$Entity(String p_i51293_1_, Class9670 p_i51293_2_, boolean p_i51293_3_, String p_i51293_4_, Class8429 p_i51293_5_) {
      super(p_i51293_1_, p_i51293_2_, p_i51293_3_);
      this.field_218688_e = p_i51293_4_;
      this.field_218689_f = p_i51293_5_;
   }

   public String func_218687_k() {
      return this.field_218688_e;
   }

   public NBTTextComponent$Entity copyRaw() {
      return new NBTTextComponent$Entity(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_218688_e, this.field_218689_f);
   }

   @Override
   public Stream<CompoundNBT> func_218673_a(Class6619 p_218673_1_) throws CommandSyntaxException {
      if (this.field_218689_f != null) {
         List<? extends Entity> var4 = this.field_218689_f.method29617(p_218673_1_);
         return var4.stream().map(Class8811::method31813);
      } else {
         return Stream.<CompoundNBT>empty();
      }
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$Entity)) {
         return false;
      } else {
         NBTTextComponent$Entity var4 = (NBTTextComponent$Entity)p_equals_1_;
         return Objects.equals(this.field_218688_e, var4.field_218688_e)
            && Objects.equals(this.field_218679_c, var4.field_218679_c)
            && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "EntityNbtComponent{selector='"
         + this.field_218688_e
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
