package remapped;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3153 extends class_4314 {
   public static final class_7360<Direction> field_15681 = class_3266.field_16180;
   public static final Identifier field_15682 = new Identifier("contents");
   private final class_9077 field_15680;

   public class_3153(class_9077 var1, class_3073 var2) {
      super(var2);
      this.field_15680 = var1;
      this.method_29284(this.field_32751.method_36446().method_10308(field_15681, Direction.field_817));
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_4816(this.field_15680);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38467;
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         if (!var4.method_37221()) {
            class_3757 var9 = var2.method_28260(var3);
            if (!(var9 instanceof class_4816)) {
               return class_6910.field_35521;
            } else {
               class_4816 var10 = (class_4816)var9;
               boolean var11;
               if (var10.method_22203() != class_3639.field_17758) {
                  var11 = true;
               } else {
                  Direction var12 = var1.<Direction>method_10313(field_15681);
                  var11 = var2.method_6681(class_6392.method_29191(var3, var12));
               }

               if (var11) {
                  var4.method_3152(var10);
                  var4.method_3209(class_6234.field_31893);
                  class_134.method_474(var4, true);
               }

               return class_6910.field_35518;
            }
         } else {
            return class_6910.field_35518;
         }
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_15681, var1.method_21857());
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_15681);
   }

   @Override
   public void method_29265(World var1, class_1331 var2, class_2522 var3, class_704 var4) {
      class_3757 var7 = var1.method_28260(var2);
      if (var7 instanceof class_4816) {
         class_4816 var8 = (class_4816)var7;
         if (!var1.field_33055 && var4.method_3186() && !var8.method_31495()) {
            ItemStack var9 = method_14550(this.method_14554());
            CompoundNBT var10 = var8.method_22202(new CompoundNBT());
            if (!var10.method_25940()) {
               var9.method_27954("BlockEntityTag", var10);
            }

            if (var8.method_45507()) {
               var9.method_28032(var8.method_45508());
            }

            class_91 var11 = new class_91(var1, (double)var2.method_12173() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5, var9);
            var11.method_257();
            var1.method_7509(var11);
         } else {
            var8.method_10812(var4);
         }
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public List<ItemStack> method_10796(class_2522 var1, class_8480 var2) {
      class_3757 var5 = var2.<class_3757>method_39071(class_8712.field_44673);
      if (var5 instanceof class_4816) {
         class_4816 var6 = (class_4816)var5;
         var2 = var2.method_39066(field_15682, (var1x, var2x) -> {
            for (int var5x = 0; var5x < var6.method_31505(); var5x++) {
               var2x.accept(var6.method_31498(var5x));
            }
         });
      }

      return super.method_10796(var1, var2);
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_4816) {
            ((class_4816)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_4816) {
            var2.method_29523(var3, var1.method_8360());
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method_29272(ItemStack var1, class_6163 var2, List<ITextComponent> var3, class_4605 var4) {
      super.method_29272(var1, var2, var3, var4);
      CompoundNBT var7 = var1.method_28021("BlockEntityTag");
      if (var7 != null) {
         if (var7.contains("LootTable", 8)) {
            var3.add(new StringTextComponent("???????"));
         }

         if (var7.contains("Items", 9)) {
            class_2831 var8 = class_2831.<ItemStack>method_12872(27, ItemStack.EMPTY);
            class_3037.method_13882(var7, var8);
            int var9 = 0;
            int var10 = 0;

            for (ItemStack var12 : var8) {
               if (!var12.method_28022()) {
                  var10++;
                  if (var9 <= 4) {
                     var9++;
                     IFormattableTextComponent var13 = var12.method_28008().deepCopy();
                     var13.appendString(" x").appendString(String.valueOf(var12.method_27997()));
                     var3.add(var13);
                  }
               }
            }

            if (var10 - var9 > 0) {
               var3.add(new TranslationTextComponent("container.shulkerBox.more", var10 - var9).mergeStyle(TextFormatting.ITALIC));
            }
         }
      }
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      class_3757 var7 = var2.method_28260(var3);
      return !(var7 instanceof class_4816) ? class_3370.method_15524() : class_3370.method_15523(((class_4816)var7).method_22195(var1));
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return class_4088.method_18870((class_6867)var2.method_28260(var3));
   }

   @Override
   public ItemStack method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      ItemStack var6 = super.method_29276(var1, var2, var3);
      class_4816 var7 = (class_4816)var1.method_28260(var2);
      CompoundNBT var8 = var7.method_22202(new CompoundNBT());
      if (!var8.method_25940()) {
         var6.method_27954("BlockEntityTag", var8);
      }

      return var6;
   }

   @Nullable
   public static class_9077 method_14553(class_2451 var0) {
      return method_14551(class_6414.method_29269(var0));
   }

   @Nullable
   public static class_9077 method_14551(class_6414 var0) {
      return !(var0 instanceof class_3153) ? null : ((class_3153)var0).method_14554();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_6414 method_14552(class_9077 var0) {
      if (var0 == null) {
         return class_4783.field_23761;
      } else {
         switch (var0) {
            case field_46493:
               return class_4783.field_23873;
            case field_46486:
               return class_4783.field_23228;
            case field_46480:
               return class_4783.field_23858;
            case field_46491:
               return class_4783.field_23564;
            case field_46477:
               return class_4783.field_23400;
            case field_46489:
               return class_4783.field_23524;
            case field_46495:
               return class_4783.field_23777;
            case field_46498:
               return class_4783.field_23533;
            case field_46503:
               return class_4783.field_23476;
            case field_46501:
               return class_4783.field_23352;
            case field_46499:
            default:
               return class_4783.field_23293;
            case field_46487:
               return class_4783.field_23190;
            case field_46479:
               return class_4783.field_23475;
            case field_46497:
               return class_4783.field_23507;
            case field_46494:
               return class_4783.field_23819;
            case field_46496:
               return class_4783.field_23169;
         }
      }
   }

   @Nullable
   public class_9077 method_14554() {
      return this.field_15680;
   }

   public static ItemStack method_14550(class_9077 var0) {
      return new ItemStack(method_14552(var0));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_15681, var2.method_30489(var1.<Direction>method_10313(field_15681)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_15681)));
   }
}
