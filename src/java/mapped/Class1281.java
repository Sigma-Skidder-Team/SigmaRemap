package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1281 extends Class1274<Class1167> {
   public final Class1313 field6836;

   public Class1281(Class1313 var1) {
      super(var1.field4562, var1.field4564, var1.field4565, 80, var1.field4565 - 37, 24);
      this.field6836 = var1;

      for (int var4 = 0; var4 < Class1313.method6213().size(); var4++) {
         this.method6030(new Class1167(this));
      }
   }

   public void method6024(Class1167 var1) {
      super.method6024(var1);
      if (var1 != null) {
         NarratorChatListener.INSTANCE
            .say(
               new TranslationTextComponent("narrator.select", ((Class5966)Class1313.method6213().get(this.method2468().indexOf(var1))).method18492())
                  .getString()
            );
      }

      this.field6836.method6205(var1 != null);
   }

   @Override
   public boolean method6057() {
      return this.field6836.method5533() == this;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (super.method1920(var1, var2, var3)) {
         return true;
      } else {
         if ((var1 == 257 || var1 == 335) && this.method6023() != null) {
            Class1167.method5572(this.method6023());
         }

         return false;
      }
   }

   // $VF: synthetic method
   public static Minecraft method6097(Class1281 var0) {
      return var0.field6782;
   }
}
