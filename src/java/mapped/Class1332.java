package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1332 extends Class1331 {
   public Class1332() {
      super("");
   }

   @Override
   public void method1921() {
      super.method1921();
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 - 40, 200, 20, new TranslationTextComponent("multiplayer.stopSleeping"), var1 -> this.method6348()
         )
      );
   }

   @Override
   public void method1945() {
      this.method6348();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         if (var1 == 257 || var1 == 335) {
            String var6 = this.field7048.method5636().trim();
            if (!var6.isEmpty()) {
               this.method2465(var6);
            }

            this.field7048.method5635("");
            this.field4562.field1298.method5989().method5936();
            return true;
         }
      } else {
         this.method6348();
      }

      return super.method1920(var1, var2, var3);
   }

   private void method6348() {
      ClientPlayNetHandler var3 = this.field4562.field1339.connection;
      var3.sendPacket(new CEntityActionPacket(this.field4562.field1339, Class1865.field10042));
   }
}
