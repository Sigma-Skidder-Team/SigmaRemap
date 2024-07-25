package net.minecraft.util.text;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class CharacterManager$class_39 {
   private final List<CharacterManager$class_38> field_238369_a_;
   private String field_238370_b_;

   public CharacterManager$class_39(List<CharacterManager$class_38> p_i232245_1_) {
      this.field_238369_a_ = p_i232245_1_;
      this.field_238370_b_ = p_i232245_1_.stream()
         .<CharSequence>map(p_238375_0_ -> CharacterManager$class_38.access$100(p_238375_0_))
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
         CharacterManager$class_38 s = (CharacterManager$class_38)i.next();
         String j = CharacterManager$class_38.access$100(s);
         int s2 = j.length();
         if (!charactermanager$styleoverridingtextcomponent) {
            if (flag > s2) {
               listiterator.func_238155_a_(s);
               i.remove();
               flag -= s2;
            } else {
               String var13 = j.substring(0, flag);
               if (!var13.isEmpty()) {
                  listiterator.func_238155_a_(ITextProperties.func_240653_a_(var13, CharacterManager$class_38.access$200(s)));
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
                  i.set(new CharacterManager$class_38(var14, p_238373_3_));
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
}
