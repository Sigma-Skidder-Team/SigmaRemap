package net.minecraft.util.text;

import com.google.common.collect.Lists;
import mapped.Class9125;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CharacterManager {
   private final CharacterManager$ICharWidthProvider field_238347_a_;

   public CharacterManager(CharacterManager$ICharWidthProvider p_i232243_1_) {
      this.field_238347_a_ = p_i232243_1_;
   }

   public float func_238350_a_(String p_238350_1_) {
      if (p_238350_1_ == null) {
         return 0.0F;
      } else {
         MutableFloat var4 = new MutableFloat();
         TextProcessing.func_238346_c_(p_238350_1_, Style.EMPTY, (p_238363_2_, p_238363_3_, p_238363_4_) -> {
            var4.add(this.field_238347_a_.getWidth(p_238363_4_, p_238363_3_));
            return true;
         });
         return var4.floatValue();
      }
   }

   public float func_238356_a_(ITextProperties p_238356_1_) {
      MutableFloat var4 = new MutableFloat();
      TextProcessing.func_238343_a_(p_238356_1_, Style.EMPTY, (p_238359_2_, p_238359_3_, p_238359_4_) -> {
         var4.add(this.field_238347_a_.getWidth(p_238359_4_, p_238359_3_));
         return true;
      });
      return var4.floatValue();
   }

   public float func_243238_a(Class9125 p_243238_1_) {
      MutableFloat var4 = new MutableFloat();
      p_243238_1_.method34036((p_243243_2_, p_243243_3_, p_243243_4_) -> {
         var4.add(this.field_238347_a_.getWidth(p_243243_4_, p_243243_3_));
         return true;
      });
      return var4.floatValue();
   }

   public int func_238352_a_(String p_238352_1_, int p_238352_2_, Style p_238352_3_) {
      CharacterManager$StringWidthProcessor var6 = new CharacterManager$StringWidthProcessor(this, (float)p_238352_2_);
      TextProcessing.func_238341_a_(p_238352_1_, p_238352_3_, var6);
      return var6.func_238398_a_();
   }

   public String func_238361_b_(String p_238361_1_, int p_238361_2_, Style p_238361_3_) {
      return p_238361_1_.substring(0, this.func_238352_a_(p_238361_1_, p_238361_2_, p_238361_3_));
   }

   public String func_238364_c_(String p_238364_1_, int p_238364_2_, Style p_238364_3_) {
      MutableFloat mutableint = new MutableFloat();
      MutableInt var7 = new MutableInt(p_238364_1_.length());
      TextProcessing.func_238345_b_(p_238364_1_, p_238364_3_, (p_238360_4_, p_238360_5_, p_238360_6_) -> {
         float var9 = mutableint.addAndGet(this.field_238347_a_.getWidth(p_238360_6_, p_238360_5_));
         if (var9 > (float)p_238364_2_) {
            return false;
         } else {
            var7.setValue(p_238360_4_);
            return true;
         }
      });
      return p_238364_1_.substring(var7.intValue());
   }

   @Nullable
   public Style func_238357_a_(ITextProperties p_238357_1_, int p_238357_2_) {
      CharacterManager$StringWidthProcessor var5 = new CharacterManager$StringWidthProcessor(this, (float)p_238357_2_);
      return p_238357_1_.<Style>func_230439_a_(
            (p_238348_1_, p_238348_2_) -> TextProcessing.func_238346_c_(p_238348_2_, p_238348_1_, var5)
                  ? Optional.<Style>empty()
                  : Optional.<Style>of(p_238348_1_),
            Style.EMPTY
         )
         .orElse((Style)null);
   }

   @Nullable
   public Style func_243239_a(Class9125 p_243239_1_, int p_243239_2_) {
      CharacterManager$StringWidthProcessor mutableobject = new CharacterManager$StringWidthProcessor(this, (float)p_243239_2_);
      MutableObject var6 = new MutableObject();
      p_243239_1_.method34036((p_243240_2_, p_243240_3_, p_243240_4_) -> {
         if (!mutableobject.method10739(p_243240_2_, p_243240_3_, p_243240_4_)) {
            var6.setValue(p_243240_3_);
            return false;
         } else {
            return true;
         }
      });
      return (Style)var6.getValue();
   }

   public ITextProperties func_238358_a_(ITextProperties p_238358_1_, int p_238358_2_, Style p_238358_3_) {
      CharacterManager$StringWidthProcessor var6 = new CharacterManager$StringWidthProcessor(this, (float)p_238358_2_);
      return p_238358_1_.<ITextProperties>func_230439_a_(new CharacterManager$1(this, var6), p_238358_3_).orElse(p_238358_1_);
   }

   public static int func_238351_a_(String p_238351_0_, int p_238351_1_, int p_238351_2_, boolean p_238351_3_) {
      int flag = p_238351_2_;
      boolean j = p_238351_1_ < 0;
      int k = Math.abs(p_238351_1_);

      for (int l = 0; l < k; l++) {
         if (j) {
            while (p_238351_3_ && flag > 0 && (p_238351_0_.charAt(flag - 1) == ' ' || p_238351_0_.charAt(flag - 1) == '\n')) {
               flag--;
            }

            while (flag > 0 && p_238351_0_.charAt(flag - 1) != ' ' && p_238351_0_.charAt(flag - 1) != '\n') {
               flag--;
            }
         } else {
            int i1 = p_238351_0_.length();
            int j1 = p_238351_0_.indexOf(32, flag);
            int var12 = p_238351_0_.indexOf(10, flag);
            if (j1 == -1 && var12 == -1) {
               flag = -1;
            } else if (j1 != -1 && var12 != -1) {
               flag = Math.min(j1, var12);
            } else if (j1 != -1) {
               flag = j1;
            } else {
               flag = var12;
            }

            if (flag == -1) {
               flag = i1;
            } else {
               while (p_238351_3_ && flag < i1 && (p_238351_0_.charAt(flag) == ' ' || p_238351_0_.charAt(flag) == '\n')) {
                  flag++;
               }
            }
         }
      }

      return flag;
   }

   public void func_238353_a_(String p_238353_1_, int p_238353_2_, Style p_238353_3_, boolean p_238353_4_, CharacterManager$ISliceAcceptor p_238353_5_) {
      int j = 0;
      int style = p_238353_1_.length();
      Style charactermanager$multilineprocessor = p_238353_3_;

      while (j < style) {
         CharacterManager$MultilineProcessor flag = new CharacterManager$MultilineProcessor(this, (float)p_238353_2_);
         boolean k = TextProcessing.drawString(p_238353_1_, j, charactermanager$multilineprocessor, p_238353_3_, flag);
         if (k) {
            p_238353_5_.accept(charactermanager$multilineprocessor, j, style);
            break;
         }

         int c0 = flag.func_238386_a_();
         char l = p_238353_1_.charAt(c0);
         int var15 = l != '\n' && l != ' ' ? c0 : c0 + 1;
         p_238353_5_.accept(charactermanager$multilineprocessor, j, p_238353_4_ ? var15 : c0);
         j = var15;
         charactermanager$multilineprocessor = flag.func_238389_b_();
      }
   }

   public List<ITextProperties> func_238365_g_(String p_238365_1_, int p_238365_2_, Style p_238365_3_) {
      ArrayList var6 = Lists.newArrayList();
      this.func_238353_a_(
         p_238365_1_,
         p_238365_2_,
         p_238365_3_,
         false,
         (p_238354_2_, p_238354_3_, p_238354_4_) -> var6.add(ITextProperties.func_240653_a_(p_238365_1_.substring(p_238354_3_, p_238354_4_), p_238354_2_))
      );
      return var6;
   }

   public List<ITextProperties> func_238362_b_(ITextProperties p_238362_1_, int p_238362_2_, Style p_238362_3_) {
      ArrayList var6 = Lists.newArrayList();
      this.func_243242_a(p_238362_1_, p_238362_2_, p_238362_3_, (p_243241_1_, p_243241_2_) -> var6.add(p_243241_1_));
      return var6;
   }

   public void func_243242_a(ITextProperties p_243242_1_, int p_243242_2_, Style p_243242_3_, BiConsumer<ITextProperties, Boolean> p_243242_4_) {
      ArrayList charactermanager$substyledtext = Lists.newArrayList();
      p_243242_1_.func_230439_a_((p_238355_1_, p_238355_2_) -> {
         if (!p_238355_2_.isEmpty()) {
            charactermanager$substyledtext.add(new CharacterManager$StyleOverridingTextComponent(p_238355_2_, p_238355_1_));
         }

         return Optional.empty();
      }, p_243242_3_);
      CharacterManager$SubstyledText flag = new CharacterManager$SubstyledText(charactermanager$substyledtext);
      boolean flag1 = true;
      boolean flag2 = false;
      boolean itextproperties1 = false;

      while (flag1) {
         flag1 = false;
         CharacterManager$MultilineProcessor var12 = new CharacterManager$MultilineProcessor(this, (float)p_243242_2_);

         for (CharacterManager$StyleOverridingTextComponent flag3 : CharacterManager$SubstyledText.access$000(flag)) {
            boolean i = TextProcessing.drawString(
               CharacterManager$StyleOverridingTextComponent.access$100(flag3),
               0,
               CharacterManager$StyleOverridingTextComponent.access$200(flag3),
               p_243242_3_,
               var12
            );
            if (!i) {
               int style = var12.func_238386_a_();
               Style c0 = var12.func_238389_b_();
               char flag4 = flag.func_238372_a_(style);
               boolean flag5 = flag4 == '\n';
               boolean itextproperties = flag5 || flag4 == ' ';
               flag2 = flag5;
               ITextProperties var21 = flag.func_238373_a_(style, itextproperties ? 1 : 0, c0);
               p_243242_4_.accept(var21, itextproperties1);
               itextproperties1 = !flag5;
               flag1 = true;
               break;
            }

            var12.func_238387_a_(CharacterManager$StyleOverridingTextComponent.access$100(flag3).length());
         }
      }

      ITextProperties var22 = flag.func_238371_a_();
      if (var22 != null) {
         p_243242_4_.accept(var22, itextproperties1);
      } else if (flag2) {
         p_243242_4_.accept(ITextProperties.field_240651_c_, false);
      }
   }

   // $VF: synthetic method
   public static CharacterManager$ICharWidthProvider access$300(CharacterManager x0) {
      return x0.field_238347_a_;
   }
}
