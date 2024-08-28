package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.*;

import javax.annotation.Nullable;
import java.util.List;

public class ScoreTextComponent extends TextComponent implements ITargetedTextComponent {
   private final String name;
   private final Class8429 selector;
   private final String objective;

   @Nullable
   private static Class8429 func_240707_c_(String p_240707_0_) {
      try {
         return new Class8533(new StringReader(p_240707_0_)).method30303();
      } catch (CommandSyntaxException var4) {
         return null;
      }
   }

   public ScoreTextComponent(String nameIn, String objectiveIn) {
      this(nameIn, func_240707_c_(nameIn), objectiveIn);
   }

   private ScoreTextComponent(String p_i232569_1_, Class8429 p_i232569_2_, String p_i232569_3_) {
      this.name = p_i232569_1_;
      this.selector = p_i232569_2_;
      this.objective = p_i232569_3_;
   }

   public String getName() {
      return this.name;
   }

   public String getObjective() {
      return this.objective;
   }

   private String func_240705_a_(Class6619 p_240705_1_) throws CommandSyntaxException {
      if (this.selector != null) {
         List var4 = this.selector.method29617(p_240705_1_);
         if (!var4.isEmpty()) {
            if (var4.size() != 1) {
               throw Class8700.field39260.create();
            }

            return ((Entity)var4.get(0)).method2956();
         }
      }

      return this.name;
   }

   private String func_240706_a_(String p_240706_1_, Class6619 p_240706_2_) {
      MinecraftServer scoreboard = p_240706_2_.method20177();
      if (scoreboard != null) {
         Class6887 scoreobjective = scoreboard.method1409();
         Class8375 score = scoreobjective.method20976(this.objective);
         if (scoreobjective.method20979(p_240706_1_, score)) {
            Class9411 var8 = scoreobjective.method20980(p_240706_1_, score);
            return Integer.toString(var8.method36050());
         }
      }

      return "";
   }

   public ScoreTextComponent copyRaw() {
      return new ScoreTextComponent(this.name, this.selector, this.objective);
   }

   @Override
   public IFormattableTextComponent func_230535_a_(Class6619 p_230535_1_, Entity p_230535_2_, int p_230535_3_) throws CommandSyntaxException {
      if (p_230535_1_ == null) {
         return new StringTextComponent("");
      } else {
         String s1 = this.func_240705_a_(p_230535_1_);
         String var7 = p_230535_2_ != null && s1.equals("*") ? p_230535_2_.method2956() : s1;
         return new StringTextComponent(this.func_240706_a_(var7, p_230535_1_));
      }
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof ScoreTextComponent)) {
         return false;
      } else {
         ScoreTextComponent var4 = (ScoreTextComponent)p_equals_1_;
         return this.name.equals(var4.name) && this.objective.equals(var4.objective) && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "ScoreComponent{name='"
         + this.name
         + '\''
         + "objective='"
         + this.objective
         + '\''
         + ", siblings="
         + this.siblings
         + ", style="
         + this.getStyle()
         + '}';
   }
}
