package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1284 extends Class1274<Class1164> {
   public final Class1136 field6848;

   public Class1284(Class1136 var1, Minecraft var2) {
      super(var2, var1.field4564, var1.field4565, 32, var1.field4565 - 65 + 4, 18);
      this.field6848 = var1;

      for (Class2019 var6 : Class1136.method5461(var1).method966()) {
         Class1164 var7 = new Class1164(this, var6);
         this.method6030(var7);
         if (Class1136.method5461(var1).getCurrentLanguage().getCode().equals(var6.getCode())) {
            this.method6024(var7);
         }
      }

      if (this.method6023() != null) {
         this.method6041(this.method6023());
      }
   }

   @Override
   public int method6048() {
      return super.method6048() + 20;
   }

   @Override
   public int method6022() {
      return super.method6022() + 50;
   }

   public void method6024(Class1164 var1) {
      super.method6024(var1);
      if (var1 != null) {
         NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.select", Class1164.method5565(var1)).getString());
      }
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6848.method2469(var1);
   }

   @Override
   public boolean method6057() {
      return this.field6848.method5533() == this;
   }

   // $VF: synthetic method
   public static int method6105(Class1284 var0) {
      return var0.field6785;
   }
}
