package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9586 implements class_4439, class_7912 {
   private static final ITextComponent field_48755 = new TranslationTextComponent("spectatorMenu.team_teleport");
   private static final ITextComponent field_48758 = new TranslationTextComponent("spectatorMenu.team_teleport.prompt");
   private final List<class_7912> field_48756 = Lists.newArrayList();

   public class_9586() {
      MinecraftClient var3 = MinecraftClient.method_8510();

      for (class_3903 var5 : var3.field_9601.method_29562().method_4841()) {
         this.field_48756.add(new class_7100(this, var5));
      }
   }

   @Override
   public List<class_7912> method_20603() {
      return this.field_48756;
   }

   @Override
   public ITextComponent method_20602() {
      return field_48758;
   }

   @Override
   public void method_35792(class_3421 var1) {
      var1.method_15807(this);
   }

   @Override
   public ITextComponent method_35794() {
      return field_48755;
   }

   @Override
   public void method_35795(class_7966 var1, float var2, int var3) {
      MinecraftClient.method_8510().method_8577().method_35674(class_8368.field_42845);
      class_2089.method_9778(var1, 0, 0, 16.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean method_35793() {
      for (class_7912 var4 : this.field_48756) {
         if (var4.method_35793()) {
            return true;
         }
      }

      return false;
   }
}
