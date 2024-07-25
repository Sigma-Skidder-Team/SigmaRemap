package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1437 extends class_4785<class_1437> {
   private final EntityType<?> field_7758;
   private final ITextComponent field_7759;
   private final ITextComponent field_7754;
   private final boolean field_7756;
   private final ITextComponent field_7760;
   private final boolean field_7755;

   public class_1437(EntityType<?> var1, EntityType var2) {
      this.field_7753 = var1;
      this.field_7758 = var2;
      this.field_7759 = var2.method_30464();
      int var5 = class_3231.method_14804(var1.field_40420).method_19276(class_6234.field_31832.method_43790(var2));
      if (var5 != 0) {
         this.field_7754 = new TranslationTextComponent("stat_type.minecraft.killed", var5, this.field_7759);
         this.field_7756 = true;
      } else {
         this.field_7754 = new TranslationTextComponent("stat_type.minecraft.killed.none", this.field_7759);
         this.field_7756 = false;
      }

      int var6 = class_3231.method_14804(var1.field_40420).method_19276(class_6234.field_31834.method_43790(var2));
      if (var6 != 0) {
         this.field_7760 = new TranslationTextComponent("stat_type.minecraft.killed_by", this.field_7759, var6);
         this.field_7755 = true;
      } else {
         this.field_7760 = new TranslationTextComponent("stat_type.minecraft.killed_by.none", this.field_7759);
         this.field_7755 = false;
      }
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      AbstractGui.method_9771(var1, this.field_7753.field_40420.field_948, this.field_7759, var4 + 2, var3 + 1, 16777215);
      AbstractGui.method_9771(var1, this.field_7753.field_40420.field_948, this.field_7754, var4 + 2 + 10, var3 + 1 + 9, !this.field_7756 ? 6316128 : 9474192);
      AbstractGui.method_9771(var1, this.field_7753.field_40420.field_948, this.field_7760, var4 + 2 + 10, var3 + 1 + 18, !this.field_7755 ? 6316128 : 9474192);
   }
}
