package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.List;

public abstract class Class1140 extends Class1135 {
   private final Class5805[] field6203;
   private Class1197 field6204;
   private Class1296 field6205;

   public Class1140(Screen var1, Class9574 var2, ITextComponent var3, Class5805[] var4) {
      super(var1, var2, var3);
      this.field6203 = var4;
   }

   @Override
   public void method1921() {
      this.field6205 = new Class1296(this.field4562, this.field4564, this.field4565, 32, this.field4565 - 32, 25);
      this.field6205.method6131(this.field6203);
      this.field4561.add(this.field6205);
      this.method5472();
      this.field6204 = this.field6205.method6132(Class5805.field25346);
      if (this.field6204 != null) {
         this.field6204.field6482 = Class6688.field29302.method20405();
      }
   }

   public void method5472() {
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 - 27, 200, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6205.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 20, 16777215);
      super.method1923(var1, var2, var3, var4);
      List var7 = method5458(this.field6205, var2, var3);
      if (var7 != null) {
         this.method2461(var1, var7, var2, var3);
      }
   }

   public void method5473() {
      if (this.field6204 != null) {
         this.field6204.method5743(Class5805.field25346.method17947(this.field6193));
      }
   }
}
