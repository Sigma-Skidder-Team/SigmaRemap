package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import remapped.class_4550;
import remapped.class_4964;
import remapped.class_5734;
import remapped.class_6000;
import remapped.class_9155;
import remapped.class_9257;

public class NBTTextComponent$class_44 extends NBTTextComponent {
   private final String field_218688_e;
   private final class_4550 field_218689_f;

   public NBTTextComponent$class_44(String p_i51292_1_, boolean p_i51292_2_, String p_i51292_3_) {
      super(p_i51292_1_, p_i51292_2_);
      this.field_218688_e = p_i51292_3_;
      this.field_218689_f = func_218686_b(p_i51292_3_);
   }

   @Nullable
   private static class_4550 func_218686_b(String p_218686_0_) {
      try {
         class_4964 var3 = new class_4964(new StringReader(p_218686_0_));
         return var3.method_22744();
      } catch (CommandSyntaxException var4) {
         return null;
      }
   }

   private NBTTextComponent$class_44(String p_i51293_1_, class_9257 p_i51293_2_, boolean p_i51293_3_, String p_i51293_4_, class_4550 p_i51293_5_) {
      super(p_i51293_1_, p_i51293_2_, p_i51293_3_);
      this.field_218688_e = p_i51293_4_;
      this.field_218689_f = p_i51293_5_;
   }

   public String func_218687_k() {
      return this.field_218688_e;
   }

   public NBTTextComponent$class_44 copyRaw() {
      return new NBTTextComponent$class_44(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_218688_e, this.field_218689_f);
   }

   @Override
   public Stream<class_5734> func_218673_a(class_9155 p_218673_1_) throws CommandSyntaxException {
      if (this.field_218689_f != null) {
         List var4 = this.field_218689_f.method_21106(p_218673_1_);
         return var4.stream().<class_5734>map(class_6000::method_27394);
      } else {
         return Stream.<class_5734>empty();
      }
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$class_44)) {
         return false;
      } else {
         NBTTextComponent$class_44 var4 = (NBTTextComponent$class_44)p_equals_1_;
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
