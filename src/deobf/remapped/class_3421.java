package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3421 {
   private static final class_7912 field_16844 = new class_1553(null);
   private static final class_7912 field_16848 = new class_9123(-1, true);
   private static final class_7912 field_16843 = new class_9123(1, true);
   private static final class_7912 field_16847 = new class_9123(1, false);
   private static final ITextComponent field_16846 = new TranslationTextComponent("spectatorMenu.close");
   private static final ITextComponent field_16841 = new TranslationTextComponent("spectatorMenu.previous_page");
   private static final ITextComponent field_16838 = new TranslationTextComponent("spectatorMenu.next_page");
   public static final class_7912 field_16839 = new class_7388();
   private final class_3796 field_16842;
   private class_4439 field_16849;
   private int field_16837 = -1;
   private int field_16845;

   public class_3421(class_3796 var1) {
      this.field_16849 = new class_4645();
      this.field_16842 = var1;
   }

   public class_7912 method_15804(int var1) {
      int var4 = var1 + this.field_16845 * 6;
      if (this.field_16845 > 0 && var1 == 0) {
         return field_16848;
      } else if (var1 != 7) {
         if (var1 == 8) {
            return field_16844;
         } else {
            return var4 >= 0 && var4 < this.field_16849.method_20603().size()
               ? (class_7912)MoreObjects.firstNonNull(this.field_16849.method_20603().get(var4), field_16839)
               : field_16839;
         }
      } else {
         return var4 >= this.field_16849.method_20603().size() ? field_16847 : field_16843;
      }
   }

   public List<class_7912> method_15808() {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 <= 8; var4++) {
         var3.add(this.method_15804(var4));
      }

      return var3;
   }

   public class_7912 method_15810() {
      return this.method_15804(this.field_16837);
   }

   public class_4439 method_15805() {
      return this.field_16849;
   }

   public void method_15806(int var1) {
      class_7912 var4 = this.method_15804(var1);
      if (var4 != field_16839) {
         if (this.field_16837 == var1 && var4.method_35793()) {
            var4.method_35792(this);
         } else {
            this.field_16837 = var1;
         }
      }
   }

   public void method_15816() {
      this.field_16842.method_17628(this);
   }

   public int method_15817() {
      return this.field_16837;
   }

   public void method_15807(class_4439 var1) {
      this.field_16849 = var1;
      this.field_16837 = -1;
      this.field_16845 = 0;
   }

   public class_5017 method_15811() {
      return new class_5017(this.field_16849, this.method_15808(), this.field_16837);
   }
}
