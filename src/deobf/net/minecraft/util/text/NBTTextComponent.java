package net.minecraft.util.text;

import com.google.common.base.Joiner;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_4235;
import remapped.class_5734;
import remapped.class_8145;
import remapped.class_8406;
import remapped.class_9155;
import remapped.class_9257;

public abstract class NBTTextComponent extends TextComponent implements ITargetedTextComponent {
   private static final Logger field_218681_e = LogManager.getLogger();
   public final boolean field_218678_b;
   public final String field_218679_c;
   public final class_9257 field_218680_d;

   @Nullable
   private static class_9257 func_218672_b(String p_218672_0_) {
      try {
         return new class_4235().parse(new StringReader(p_218672_0_));
      } catch (CommandSyntaxException var4) {
         return null;
      }
   }

   public NBTTextComponent(String p_i50781_1_, boolean p_i50781_2_) {
      this(p_i50781_1_, func_218672_b(p_i50781_1_), p_i50781_2_);
   }

   public NBTTextComponent(String p_i50782_1_, class_9257 p_i50782_2_, boolean p_i50782_3_) {
      this.field_218679_c = p_i50782_1_;
      this.field_218680_d = p_i50782_2_;
      this.field_218678_b = p_i50782_3_;
   }

   public abstract Stream<class_5734> func_218673_a(class_9155 var1) throws CommandSyntaxException;

   public String func_218676_i() {
      return this.field_218679_c;
   }

   public boolean func_218677_j() {
      return this.field_218678_b;
   }

   @Override
   public IFormattableTextComponent func_230535_a_(class_9155 p_230535_1_, class_8145 p_230535_2_, int p_230535_3_) throws CommandSyntaxException {
      if (p_230535_1_ != null && this.field_218680_d != null) {
         Stream var6 = this.func_218673_a(p_230535_1_).<class_8406>flatMap(p_218675_1_ -> {
            try {
               return this.field_218680_d.method_42652(p_218675_1_).stream();
            } catch (CommandSyntaxException var5) {
               return Stream.empty();
            }
         }).<String>map(class_8406::method_38710);
         return (IFormattableTextComponent)(this.field_218678_b
            ? var6.<IFormattableTextComponent>flatMap(p_223137_3_ -> {
               try {
                  IFormattableTextComponent var6x = ITextComponent$class_40.func_240643_a_(p_223137_3_);
                  return Stream.of(TextComponentUtils.func_240645_a_(p_230535_1_, var6x, p_230535_2_, p_230535_3_));
               } catch (Exception var7) {
                  field_218681_e.warn("Failed to parse component: " + p_223137_3_, var7);
                  return Stream.of();
               }
            }).reduce((p_240704_0_, p_240704_1_) -> p_240704_0_.appendString(", ").append(p_240704_1_)).orElse(new StringTextComponent(""))
            : new StringTextComponent(Joiner.on(", ").join(var6.iterator())));
      } else {
         return new StringTextComponent("");
      }
   }
}
