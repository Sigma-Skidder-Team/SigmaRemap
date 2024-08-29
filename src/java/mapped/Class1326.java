package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1326 extends Class1325 {
   private final Class969 field7017;
   private Class1206 field7018;
   private Class1206 field7019;
   private Class1206 field7020;
   private Class2037 field7021 = Class2037.field13325;
   private boolean field7022;
   private boolean field7023;

   public Class1326(Class969 var1) {
      this.field7017 = var1;
   }

   @Override
   public Class911 method6304() {
      return this.field7017.method4009();
   }

   @Override
   public int method6305() {
      return 135;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field7018 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 50 - 100 - 4, 165, 100, 20, new TranslationTextComponent("advMode.mode.sequence"), var1 -> {
            this.method6316();
            this.method6315();
         })
      );
      this.field7019 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 50, 165, 100, 20, new TranslationTextComponent("advMode.mode.unconditional"), var1 -> {
            this.field7022 = !this.field7022;
            this.method6317();
         })
      );
      this.field7020 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 50 + 4, 165, 100, 20, new TranslationTextComponent("advMode.mode.redstoneTriggered"), var1 -> {
            this.field7023 = !this.field7023;
            this.method6318();
         })
      );
      this.field7012.field6482 = false;
      this.field7014.field6482 = false;
      this.field7018.field6482 = false;
      this.field7019.field6482 = false;
      this.field7020.field6482 = false;
   }

   public void method6314() {
      Class911 var3 = this.field7017.method4009();
      this.field7010.method5635(var3.method3563());
      this.field7015 = var3.method3571();
      this.field7021 = this.field7017.method4020();
      this.field7022 = this.field7017.method4021();
      this.field7023 = this.field7017.method4012();
      this.method6306();
      this.method6315();
      this.method6317();
      this.method6318();
      this.field7012.field6482 = true;
      this.field7014.field6482 = true;
      this.field7018.field6482 = true;
      this.field7019.field6482 = true;
      this.field7020.field6482 = true;
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      super.resize(var1, var2, var3);
      this.method6306();
      this.method6315();
      this.method6317();
      this.method6318();
      this.field7012.field6482 = true;
      this.field7014.field6482 = true;
      this.field7018.field6482 = true;
      this.field7019.field6482 = true;
      this.field7020.field6482 = true;
   }

   @Override
   public void method6308(Class911 var1) {
      this.field4562
         .getConnection()
         .sendPacket(
            new Class5578(new BlockPos(var1.method3573()), this.field7010.method5636(), this.field7021, var1.method3571(), this.field7022, this.field7023)
         );
   }

   private void method6315() {
      switch (Class8046.field34562[this.field7021.ordinal()]) {
         case 1:
            this.field7018.method5743(new TranslationTextComponent("advMode.mode.sequence"));
            break;
         case 2:
            this.field7018.method5743(new TranslationTextComponent("advMode.mode.auto"));
            break;
         case 3:
            this.field7018.method5743(new TranslationTextComponent("advMode.mode.redstone"));
      }
   }

   private void method6316() {
      switch (Class8046.field34562[this.field7021.ordinal()]) {
         case 1:
            this.field7021 = Class2037.field13324;
            break;
         case 2:
            this.field7021 = Class2037.field13325;
            break;
         case 3:
            this.field7021 = Class2037.field13323;
      }
   }

   private void method6317() {
      if (!this.field7022) {
         this.field7019.method5743(new TranslationTextComponent("advMode.mode.unconditional"));
      } else {
         this.field7019.method5743(new TranslationTextComponent("advMode.mode.conditional"));
      }
   }

   private void method6318() {
      if (!this.field7023) {
         this.field7020.method5743(new TranslationTextComponent("advMode.mode.redstoneTriggered"));
      } else {
         this.field7020.method5743(new TranslationTextComponent("advMode.mode.autoexec.bat"));
      }
   }
}
