package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1138 extends class_2451 {
   public class_1138(class_317 var1) {
      super(var1);
   }

   public static boolean method_4990(CompoundNBT var0) {
      if (class_7702.method_34884(var0)) {
         if (var0.method_25939("title", 8)) {
            String var3 = var0.method_25965("title");
            return var3.length() <= 32 ? var0.method_25939("author", 8) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static int method_4992(ItemStack var0) {
      return var0.method_27990().method_25947("generation");
   }

   public static int method_4991(ItemStack var0) {
      CompoundNBT var3 = var0.method_27990();
      return var3 == null ? 0 : var3.method_25927("pages", 8).size();
   }

   @Override
   public ITextComponent method_11249(ItemStack var1) {
      if (var1.method_28002()) {
         CompoundNBT var4 = var1.method_27990();
         String var5 = var4.method_25965("title");
         if (!class_6660.method_30576(var5)) {
            return new StringTextComponent(var5);
         }
      }

      return super.method_11249(var1);
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      if (var1.method_28002()) {
         CompoundNBT var7 = var1.method_27990();
         String var8 = var7.method_25965("author");
         if (!class_6660.method_30576(var8)) {
            var3.add(new TranslationTextComponent("book.byAuthor", var8).mergeStyle(TextFormatting.GRAY));
         }

         var3.add(new TranslationTextComponent("book.generation." + var7.method_25947("generation")).mergeStyle(TextFormatting.GRAY));
      }
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (!var6.method_8350(class_4783.field_23566)) {
         return class_6910.field_35521;
      } else {
         return !class_2013.method_9334(var4, var5, var6, var1.method_21867()) ? class_6910.field_35521 : class_6910.method_31659(var4.field_33055);
      }
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      ItemStack var6 = var2.method_26617(var3);
      var2.method_3174(var6, var3);
      var2.method_3211(class_6234.field_31907.method_43790(this));
      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }

   public static boolean method_4993(ItemStack var0, class_9155 var1, class_704 var2) {
      CompoundNBT var5 = var0.method_27990();
      if (var5 != null && !var5.method_25933("resolved")) {
         var5.method_25934("resolved", true);
         if (!method_4990(var5)) {
            return false;
         } else {
            class_3416 var6 = var5.method_25927("pages", 8);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               String var8 = var6.method_15770(var7);

               Object var9;
               try {
                  var9 = ITextComponent$class_40.func_240644_b_(var8);
                  var9 = TextComponentUtils.func_240645_a_(var1, (ITextComponent)var9, var2, 0);
               } catch (Exception var11) {
                  var9 = new StringTextComponent(var8);
               }

               var6.set(var7, (class_8406)class_473.method_2261(ITextComponent$class_40.toJson((ITextComponent)var9)));
            }

            var5.method_25946("pages", var6);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return true;
   }
}
