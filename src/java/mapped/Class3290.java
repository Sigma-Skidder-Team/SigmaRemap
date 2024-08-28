package mapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class Class3290 extends Class3257 {
   public Class3290(Class5643 var1) {
      super(var1);
   }

   @Override
   public boolean method11732(Class8848 var1) {
      return true;
   }

   @Override
   public boolean method11734(Class8848 var1) {
      return false;
   }

   public static Class41 method11830(Class8848 var0) {
      Class39 var3 = var0.method32142();
      return var3 == null ? new Class41() : var3.method131("StoredEnchantments", 10);
   }

   @Override
   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11730(var1, var2, var3, var4);
      Class8848.method32157(var3, method11830(var1));
   }

   public static void method11831(Class8848 var0, Class6694 var1) {
      Class41 var4 = method11830(var0);
      boolean var5 = true;
      ResourceLocation var6 = Class2348.field16073.method9181(var1.field29316);

      for (int var7 = 0; var7 < var4.size(); var7++) {
         Class39 var8 = var4.method153(var7);
         ResourceLocation var9 = ResourceLocation.method8289(var8.method126("id"));
         if (var9 != null && var9.equals(var6)) {
            if (var8.method122("lvl") < var1.field29317) {
               var8.method101("lvl", (short)var1.field29317);
            }

            var5 = false;
            break;
         }
      }

      if (var5) {
         Class39 var10 = new Class39();
         var10.method109("id", String.valueOf(var6));
         var10.method101("lvl", (short)var1.field29317);
         var4.add(var10);
      }

      var0.method32143().method99("StoredEnchantments", var4);
   }

   public static Class8848 method11832(Class6694 var0) {
      Class8848 var3 = new Class8848(Class8514.field38070);
      method11831(var3, var0);
      return var3;
   }

   @Override
   public void method11737(Class7401 var1, Class25<Class8848> var2) {
      if (var1 != Class7401.field31670) {
         if (var1.method23655().length != 0) {
            for (Class6069 var6 : Class2348.field16073) {
               if (var1.method23657(var6.field27308)) {
                  var2.add(method11832(new Class6694(var6, var6.method18809())));
               }
            }
         }
      } else {
         for (Class6069 var9 : Class2348.field16073) {
            if (var9.field27308 != null) {
               for (int var7 = var9.method18813(); var7 <= var9.method18809(); var7++) {
                  var2.add(method11832(new Class6694(var9, var7)));
               }
            }
         }
      }
   }
}
