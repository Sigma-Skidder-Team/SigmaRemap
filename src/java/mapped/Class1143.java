package mapped;

import net.minecraft.util.text.TranslationTextComponent;

import java.util.Arrays;
import java.util.stream.Stream;

public class Class1143 extends Class1135 {
   private Class1296 field6209;
   private static final AbstractOption[] field6210 = new AbstractOption[]{
      AbstractOption.field25335, AbstractOption.field25361, AbstractOption.field25331, AbstractOption.field25357, AbstractOption.field25368
   };

   public Class1143(Screen var1, Class9574 var2) {
      super(var1, var2, new TranslationTextComponent("options.mouse_settings.title"));
   }

   @Override
   public void method1921() {
      this.field6209 = new Class1296(this.field4562, this.field4564, this.field4565, 32, this.field4565 - 32, 25);
      if (!Class9798.method38643()) {
         this.field6209.method6131(field6210);
      } else {
         this.field6209.method6131(Stream.<AbstractOption>concat(Arrays.stream(field6210), Stream.of(AbstractOption.field25332)).<AbstractOption>toArray(AbstractOption[]::new));
      }

      this.field4561.add(this.field6209);
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 - 27, 200, 20, Class7127.field30658, var1 -> {
         this.field6193.method37146();
         this.field4562.displayGuiScreen(this.field6192);
      }));
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6209.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 5, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
