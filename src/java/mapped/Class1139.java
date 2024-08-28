package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1139 extends Class1135 {
   public Class1139(Screen var1, Class9574 var2) {
      super(var1, var2, new TranslationTextComponent("options.skinCustomisation.title"));
   }

   @Override
   public void method1921() {
      int var3 = 0;

      for (Class2318 var7 : Class2318.values()) {
         this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 - 155 + var3 % 2 * 160, this.field4565 / 6 + 24 * (var3 >> 1), 150, 20, this.method5467(var7), var2 -> {
               this.field6193.method37152(var7);
               var2.method5743(this.method5467(var7));
            })
         );
         var3++;
      }

      this.<Class1228>method2455(
         new Class1228(
            this.field4564 / 2 - 155 + var3 % 2 * 160,
            this.field4565 / 6 + 24 * (var3 >> 1),
            150,
            20,
            AbstractOption.field25345,
            AbstractOption.field25345.method17947(this.field6193),
            var1 -> {
               AbstractOption.field25345.method17945(this.field6193, 1);
               this.field6193.method37146();
               var1.method5743(AbstractOption.field25345.method17947(this.field6193));
               this.field6193.method37149();
            }
         )
      );
      if (++var3 % 2 == 1) {
         var3++;
      }

      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            this.field4565 / 6 + 24 * (var3 >> 1),
            200,
            20,
            Class8043.method27620("of.options.skinCustomisation.ofCape"),
            var1 -> this.field4562.displayGuiScreen(new Class845(this))
         )
      );
      var3 += 2;
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 / 6 + 24 * (var3 >> 1), 200, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(this.field6192)
         )
      );
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 20, 16777215);
      super.method1923(var1, var2, var3, var4);
   }

   private ITextComponent method5467(Class2318 var1) {
      return Class7127.method22238(var1.method9092(), this.field6193.method37150().contains(var1));
   }
}
