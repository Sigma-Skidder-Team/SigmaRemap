package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.*;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.stream.Stream;

public class NBTTextComponent$Block extends NBTTextComponent {
   private final String field_218684_e;
   private final Class7329 field_218685_f;

   public NBTTextComponent$Block(String p_i51294_1_, boolean p_i51294_2_, String p_i51294_3_) {
      super(p_i51294_1_, p_i51294_2_);
      this.field_218684_e = p_i51294_3_;
      this.field_218685_f = this.func_218682_b(this.field_218684_e);
   }

   @Nullable
   private Class7329 func_218682_b(String p_218682_1_) {
      try {
         return Class6849.method20826().parse(new StringReader(p_218682_1_));
      } catch (CommandSyntaxException var5) {
         return null;
      }
   }

   private NBTTextComponent$Block(String p_i51295_1_, Class9670 p_i51295_2_, boolean p_i51295_3_, String p_i51295_4_, Class7329 p_i51295_5_) {
      super(p_i51295_1_, p_i51295_2_, p_i51295_3_);
      this.field_218684_e = p_i51295_4_;
      this.field_218685_f = p_i51295_5_;
   }

   @Nullable
   public String func_218683_k() {
      return this.field_218684_e;
   }

   public NBTTextComponent$Block copyRaw() {
      return new NBTTextComponent$Block(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_218684_e, this.field_218685_f);
   }

   @Override
   public Stream<Class39> func_218673_a(Class6619 p_218673_1_) {
      if (this.field_218685_f != null) {
         Class1657 blockpos = p_218673_1_.method20172();
         BlockPos tileentity = this.field_218685_f.method23230(p_218673_1_);
         if (blockpos.method6763(tileentity)) {
            Class944 var6 = blockpos.method6759(tileentity);
            if (var6 != null) {
               return Stream.<Class39>of(var6.method3646(new Class39()));
            }
         }
      }

      return Stream.<Class39>empty();
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$Block)) {
         return false;
      } else {
         NBTTextComponent$Block var4 = (NBTTextComponent$Block)p_equals_1_;
         return Objects.equals(this.field_218684_e, var4.field_218684_e)
            && Objects.equals(this.field_218679_c, var4.field_218679_c)
            && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "BlockPosArgument{pos='"
         + this.field_218684_e
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
