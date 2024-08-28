package mapped;

import net.minecraft.util.text.*;

import java.util.List;

public class Class3285 extends Class3257 {
   public Class3285(Class5643 var1) {
      super(var1);
   }

   public static boolean method11817(Class39 var0) {
      if (Class3291.method11833(var0)) {
         if (var0.method119("title", 8)) {
            String var3 = var0.method126("title");
            return var3.length() <= 32 ? var0.method119("author", 8) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static int method11818(ItemStack var0) {
      return var0.method32142().method122("generation");
   }

   public static int method11819(ItemStack var0) {
      Class39 var3 = var0.method32142();
      return var3 == null ? 0 : var3.method131("pages", 8).size();
   }

   @Override
   public ITextComponent method11731(ItemStack var1) {
      if (var1.method32141()) {
         Class39 var4 = var1.method32142();
         String var5 = var4.method126("title");
         if (!Class9001.method33256(var5)) {
            return new StringTextComponent(var5);
         }
      }

      return super.method11731(var1);
   }

   @Override
   public void method11730(ItemStack var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      if (var1.method32141()) {
         Class39 var7 = var1.method32142();
         String var8 = var7.method126("author");
         if (!Class9001.method33256(var8)) {
            var3.add(new TranslationTextComponent("book.byAuthor", var8).mergeStyle(TextFormatting.GRAY));
         }

         var3.add(new TranslationTextComponent("book.generation." + var7.method122("generation")).mergeStyle(TextFormatting.GRAY));
      }
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (!var6.method23448(Blocks.field37061)) {
         return Class2274.field14820;
      } else {
         return !Class3354.method11919(var4, var5, var6, var1.method18357()) ? Class2274.field14820 : Class2274.method9002(var4.field9020);
      }
   }

   @Override
   public Class6794<ItemStack> method11700(Class1655 var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method3094(var3);
      var2.method2769(var6, var3);
      var2.method2913(Class8876.field40098.method172(this));
      return Class6794.<ItemStack>method20700(var6, var1.method6714());
   }

   public static boolean method11820(ItemStack var0, Class6619 var1, PlayerEntity var2) {
      Class39 var5 = var0.method32142();
      if (var5 != null && !var5.method132("resolved")) {
         var5.method115("resolved", true);
         if (!method11817(var5)) {
            return false;
         } else {
            Class41 var6 = var5.method131("pages", 8);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               String var8 = var6.method160(var7);

               Object var9;
               try {
                  var9 = ITextComponent$Serializer.func_240644_b_(var8);
                  var9 = TextComponentUtils.func_240645_a_(var1, (ITextComponent)var9, var2, 0);
               } catch (Exception var11) {
                  var9 = new StringTextComponent(var8);
               }

               var6.set(var7, (Class30)Class40.method150(ITextComponent$Serializer.toJson((ITextComponent)var9)));
            }

            var5.method99("pages", var6);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }
}
