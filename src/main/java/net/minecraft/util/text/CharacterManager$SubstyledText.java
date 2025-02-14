package net.minecraft.util.text;

import javax.annotation.Nullable;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CharacterManager$SubstyledText {
   private final List<CharacterManager$StyleOverridingTextComponent> field_238369_a_;
   private String field_238370_b_;

   public CharacterManager$SubstyledText(List<CharacterManager$StyleOverridingTextComponent> p_i232245_1_) {
      this.field_238369_a_ = p_i232245_1_;
      this.field_238370_b_ = p_i232245_1_.stream()
         .<CharSequence>map(p_238375_0_ -> CharacterManager$StyleOverridingTextComponent.access$100(p_238375_0_))
         .collect(Collectors.joining());
   }

   public char func_238372_a_(int p_238372_1_) {
      return this.field_238370_b_.charAt(p_238372_1_);
   }

   public ITextProperties func_238373_a_(int p_238373_1_, int p_238373_2_, Style p_238373_3_) {
      TextPropertiesManager listiterator = new TextPropertiesManager();
      ListIterator i = this.field_238369_a_.listIterator();
      int flag = p_238373_1_;
      boolean charactermanager$styleoverridingtextcomponent = false;

      while (i.hasNext()) {
         CharacterManager$StyleOverridingTextComponent s = (CharacterManager$StyleOverridingTextComponent)i.next();
         String j = CharacterManager$StyleOverridingTextComponent.access$100(s);
         int s2 = j.length();
         if (!charactermanager$styleoverridingtextcomponent) {
            if (flag > s2) {
               listiterator.func_238155_a_(s);
               i.remove();
               flag -= s2;
            } else {
               String var13 = j.substring(0, flag);
               if (!var13.isEmpty()) {
                  listiterator.func_238155_a_(ITextProperties.func_240653_a_(var13, CharacterManager$StyleOverridingTextComponent.access$200(s)));
               }

               flag += p_238373_2_;
               charactermanager$styleoverridingtextcomponent = true;
            }
         }

         if (charactermanager$styleoverridingtextcomponent) {
            if (flag <= s2) {
               String var14 = j.substring(flag);
               if (var14.isEmpty()) {
                  i.remove();
               } else {
                  i.set(new CharacterManager$StyleOverridingTextComponent(var14, p_238373_3_));
               }
               break;
            }

            i.remove();
            flag -= s2;
         }
      }

      this.field_238370_b_ = this.field_238370_b_.substring(p_238373_1_ + p_238373_2_);
      return listiterator.func_238156_b_();
   }

   @Nullable
   public ITextProperties func_238371_a_() {
      TextPropertiesManager var3 = new TextPropertiesManager();
      this.field_238369_a_.forEach(var3::func_238155_a_);
      this.field_238369_a_.clear();
      return var3.func_238154_a_();
   }

   // $VF: synthetic method
   public static List<CharacterManager$StyleOverridingTextComponent> access$000(CharacterManager$SubstyledText x0) {
      return x0.field_238369_a_;
   }
}
