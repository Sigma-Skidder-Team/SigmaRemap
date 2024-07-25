package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2988 extends class_3997 {
   private final EntityType<?> field_14691;

   public class_2988(EntityType<?> var1, class_2340 var2, class_317 var3) {
      super(var2, var3);
      this.field_14691 = var1;
   }

   @Override
   public void method_18422(World var1, ItemStack var2, BlockPos var3) {
      if (var1 instanceof class_6331) {
         this.method_13674((class_6331)var1, var2, var3);
      }
   }

   @Override
   public void method_18425(class_704 var1, class_9379 var2, BlockPos var3) {
      var2.method_43359(var1, var3, class_463.field_2489, class_562.field_3328, 1.0F, 1.0F);
   }

   private void method_13674(class_6331 var1, ItemStack var2, BlockPos var3) {
      Entity var6 = this.field_14691.method_30479(var1, var2, (class_704)null, var3, class_2417.field_12026, true, false);
      if (var6 != null) {
         ((class_3578)var6).method_16631(true);
      }
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      if (this.field_14691 == EntityType.field_34278) {
         CompoundNBT var7 = var1.method_27990();
         if (var7 != null && var7.contains("BucketVariantTag", 3)) {
            int var8 = var7.method_25947("BucketVariantTag");
            TextFormatting[] var9 = new TextFormatting[]{TextFormatting.ITALIC, TextFormatting.GRAY};
            String var10 = "color.minecraft." + class_8477.method_39026(var8);
            String var11 = "color.minecraft." + class_8477.method_39015(var8);

            for (int var12 = 0; var12 < class_8477.field_43434.length; var12++) {
               if (var8 == class_8477.field_43434[var12]) {
                  var3.add(new TranslationTextComponent(class_8477.method_39023(var12)).mergeStyle(var9));
                  return;
               }
            }

            var3.add(new TranslationTextComponent(class_8477.method_39016(var8)).mergeStyle(var9));
            TranslationTextComponent var13 = new TranslationTextComponent(var10);
            if (!var10.equals(var11)) {
               var13.appendString(", ").append(new TranslationTextComponent(var11));
            }

            var13.mergeStyle(var9);
            var3.add(var13);
         }
      }
   }
}
