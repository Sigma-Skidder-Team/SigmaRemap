package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import remapped.class_1024;
import remapped.BlockPos;
import remapped.class_1808;
import remapped.class_3757;
import remapped.CompoundNBT;
import remapped.class_6331;
import remapped.class_9155;
import remapped.class_9257;

public class NBTTextComponent$class_43 extends NBTTextComponent {
   private final String field_218684_e;
   private final class_1808 field_218685_f;

   public NBTTextComponent$class_43(String p_i51294_1_, boolean p_i51294_2_, String p_i51294_3_) {
      super(p_i51294_1_, p_i51294_2_);
      this.field_218684_e = p_i51294_3_;
      this.field_218685_f = this.func_218682_b(this.field_218684_e);
   }

   @Nullable
   private class_1808 func_218682_b(String p_218682_1_) {
      try {
         return class_1024.method_4522().parse(new StringReader(p_218682_1_));
      } catch (CommandSyntaxException var5) {
         return null;
      }
   }

   private NBTTextComponent$class_43(String p_i51295_1_, class_9257 p_i51295_2_, boolean p_i51295_3_, String p_i51295_4_, class_1808 p_i51295_5_) {
      super(p_i51295_1_, p_i51295_2_, p_i51295_3_);
      this.field_218684_e = p_i51295_4_;
      this.field_218685_f = p_i51295_5_;
   }

   @Nullable
   public String func_218683_k() {
      return this.field_218684_e;
   }

   public NBTTextComponent$class_43 copyRaw() {
      return new NBTTextComponent$class_43(this.field_218679_c, this.field_218680_d, this.field_218678_b, this.field_218684_e, this.field_218685_f);
   }

   @Override
   public Stream<CompoundNBT> func_218673_a(class_9155 p_218673_1_) {
      if (this.field_218685_f != null) {
         class_6331 blockpos = p_218673_1_.method_42198();
         BlockPos tileentity = this.field_218685_f.method_8024(p_218673_1_);
         if (blockpos.method_29585(tileentity)) {
            class_3757 var6 = blockpos.method_28260(tileentity);
            if (var6 != null) {
               return Stream.<CompoundNBT>of(var6.method_17396(new CompoundNBT()));
            }
         }
      }

      return Stream.<CompoundNBT>empty();
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof NBTTextComponent$class_43)) {
         return false;
      } else {
         NBTTextComponent$class_43 var4 = (NBTTextComponent$class_43)p_equals_1_;
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
