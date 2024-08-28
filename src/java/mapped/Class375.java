package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class375 extends Thread {
   public final Class806 field1629;

   public Class375(Class806 var1, String var2) {
      super(var2);
      this.field1629 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Class1992 var4 = var3.method14554();
         if (var4 == Class1992.field12995) {
            Class806.field4268 = new Class809(Class806.method2079(this.field1629), true);
            Class806.method2080(this.field1629).execute(() -> Class806.method2090(this.field1629).displayGuiScreen(Class806.field4268));
            return;
         }

         if (var4 == Class1992.field12996) {
            Class806.field4268 = new Class809(Class806.method2079(this.field1629), false);
            Class806.method2081(this.field1629).execute(() -> Class806.method2089(this.field1629).displayGuiScreen(Class806.field4268));
            return;
         }

         Class806.method2082(this.field1629);
      } catch (Class2435 var5) {
         Class806.method2083(false);
         Class806.method2084().error("Couldn't connect to realms", var5);
         if (var5.field16472 == 401) {
            Class806.field4268 = new Class821(
               new TranslationTextComponent("mco.error.invalid.session.title"),
               new TranslationTextComponent("mco.error.invalid.session.message"),
               Class806.method2079(this.field1629)
            );
            Class806.method2085(this.field1629).execute(() -> Class806.method2088(this.field1629).displayGuiScreen(Class806.field4268));
         } else {
            Class806.method2086(this.field1629)
               .execute(() -> Class806.method2087(this.field1629).displayGuiScreen(new Class821(var5, Class806.method2079(this.field1629))));
         }
      }
   }
}
