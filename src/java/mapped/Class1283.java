package mapped;

import net.minecraft.util.text.TranslationTextComponent;

import java.util.Comparator;

public class Class1283 extends Class1274<Class1176> {
   public final Class1323 field6847;

   public Class1283(Class1323 var1) {
      super(var1.field4562, var1.field4564, var1.field4565, 40, var1.field4565 - 37, 16);
      this.field6847 = var1;
      Class1323.method6291(var1)
         .method9191()
         .stream()
         .sorted(Comparator.comparing(var0 -> var0.getKey().method31399().toString()))
         .forEach(var1x -> this.method6030(new Class1176(this, var1x.getValue())));
   }

   @Override
   public boolean method6057() {
      return this.field6847.method5533() == this;
   }

   public void method6024(Class1176 var1) {
      super.method6024(var1);
      if (var1 != null) {
         Class1323.method6292(this.field6847, Class1176.method5602(var1));
         NarratorChatListener.INSTANCE
            .say(
               new TranslationTextComponent("narrator.select", Class1323.method6291(this.field6847).method9181(Class1176.method5602(var1))).getString()
            );
      }

      Class1323.method6293(this.field6847);
   }
}
