package remapped;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7817 implements class_4439, class_7912 {
   private static final Ordering<class_753> field_39661 = Ordering.from(
      (var0, var1) -> ComparisonChain.start().compare(var0.method_3392().getId(), var1.method_3392().getId()).result()
   );
   private static final ITextComponent field_39663 = new TranslationTextComponent("spectatorMenu.teleport");
   private static final ITextComponent field_39664 = new TranslationTextComponent("spectatorMenu.teleport.prompt");
   private final List<class_7912> field_39660 = Lists.newArrayList();

   public class_7817() {
      this(field_39661.sortedCopy(MinecraftClient.method_8510().method_8614().method_4798()));
   }

   public class_7817(Collection<class_753> var1) {
      for (class_753 var5 : field_39661.sortedCopy(var1)) {
         if (var5.method_3393() != class_4666.field_22756) {
            this.field_39660.add(new class_2374(var5.method_3392()));
         }
      }
   }

   @Override
   public List<class_7912> method_20603() {
      return this.field_39660;
   }

   @Override
   public ITextComponent method_20602() {
      return field_39664;
   }

   @Override
   public void method_35792(class_3421 var1) {
      var1.method_15807(this);
   }

   @Override
   public ITextComponent method_35794() {
      return field_39663;
   }

   @Override
   public void method_35795(class_7966 var1, float var2, int var3) {
      MinecraftClient.method_8510().method_8577().method_35674(class_8368.field_42845);
      class_2089.method_9778(var1, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean method_35793() {
      return !this.field_39660.isEmpty();
   }
}
