package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1137 extends Class1135 {
   public Class1137(Screen var1, Class9574 var2) {
      super(var1, var2, new TranslationTextComponent("options.sounds.title"));
   }

   @Override
   public void method1921() {
      int var3 = 0;
      this.<Class1235>method2455(
         new Class1235(this.field4562, this.field4564 / 2 - 155 + var3 % 2 * 160, this.field4565 / 6 - 12 + 24 * (var3 >> 1), Class2266.field14728, 310)
      );
      var3 += 2;

      for (Class2266 var7 : Class2266.values()) {
         if (var7 != Class2266.field14728) {
            this.<Class1235>method2455(
               new Class1235(this.field4562, this.field4564 / 2 - 155 + var3 % 2 * 160, this.field4565 / 6 - 12 + 24 * (var3 >> 1), var7, 150)
            );
            var3++;
         }
      }

      int var10 = this.field4564 / 2 - 75;
      int var11 = this.field4565 / 6 - 12;
      this.<Class1228>method2455(
         new Class1228(var10, var11 + 24 * (++var3 >> 1), 150, 20, Class5805.field25364, Class5805.field25364.method18081(this.field6193), var1 -> {
            Class5805.field25364.method18078(this.field4562.field1299);
            var1.method5743(Class5805.field25364.method18081(this.field4562.field1299));
            this.field4562.field1299.method37146();
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 / 6 + 168, 200, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
