package mapped;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6197 implements Class6196 {
   private static final Set<Class3209> field27645 = Sets.newHashSet(
      new Class3209[]{
         Class8487.field36422,
         Class8487.field36423,
         Class8487.field36424,
         Class8487.field36425,
         Class8487.field36426,
         Class8487.field36427,
         Class8487.field37070,
         Class8487.field37079,
         Class8487.field36434,
         Class8487.field36435,
         Class8487.field36436,
         Class8487.field36437,
         Class8487.field36438,
         Class8487.field36439,
         Class8487.field37072,
         Class8487.field37081,
         Class8487.field36446,
         Class8487.field36447,
         Class8487.field36448,
         Class8487.field36449,
         Class8487.field36450,
         Class8487.field36451,
         Class8487.field36891,
         Class8487.field37076
      }
   );
   private static final ITextComponent field27646 = new TranslationTextComponent("tutorial.find_tree.title");
   private static final ITextComponent field27647 = new TranslationTextComponent("tutorial.find_tree.description");
   private final Class9557 field27648;
   private Class7600 field27649;
   private int field27650;

   public Class6197(Class9557 var1) {
      this.field27648 = var1;
   }

   @Override
   public void method19097() {
      this.field27650++;
      if (this.field27648.method37036() == Class1894.field11102) {
         if (this.field27650 == 1) {
            ClientPlayerEntity var3 = this.field27648.method37035().field1339;
            if (var3 != null) {
               for (Class3209 var5 : field27645) {
                  if (var3.field4902.method4058(new Class8848(var5))) {
                     this.field27648.method37034(Class2200.field14380);
                     return;
                  }
               }

               if (method19105(var3)) {
                  this.field27648.method37034(Class2200.field14380);
                  return;
               }
            }
         }

         if (this.field27650 >= 6000 && this.field27649 == null) {
            this.field27649 = new Class7600(Class2130.field13897, field27646, field27647, false);
            this.field27648.method37035().method1566().method5914(this.field27649);
         }
      } else {
         this.field27648.method37034(Class2200.field14381);
      }
   }

   @Override
   public void method19098() {
      if (this.field27649 != null) {
         this.field27649.method24895();
         this.field27649 = null;
      }
   }

   @Override
   public void method19102(Class1656 var1, Class8710 var2) {
      if (var2.method31417() == Class2100.field13690) {
         Class7380 var5 = var1.method6738(((Class8711)var2).method31423());
         if (field27645.contains(var5.method23383())) {
            this.field27648.method37034(Class2200.field14378);
         }
      }
   }

   @Override
   public void method19104(Class8848 var1) {
      for (Class3209 var5 : field27645) {
         if (var1.method32107() == var5.method11581()) {
            this.field27648.method37034(Class2200.field14380);
            return;
         }
      }
   }

   public static boolean method19105(ClientPlayerEntity var0) {
      for (Class3209 var4 : field27645) {
         if (var0.method5396().method28961(Class8876.field40096.method172(var4)) > 0) {
            return true;
         }
      }

      return false;
   }
}
