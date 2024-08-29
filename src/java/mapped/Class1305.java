package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class Class1305 extends Screen implements Class1306 {
   private static final ITextComponent field6899 = new TranslationTextComponent("multiplayer.downloadingStats");
   public final Screen field6900;
   private Class1280 field6901;
   private Class1282 field6902;
   private Class1277 field6903;
   private final Class8286 field6904;
   private Class1274<?> field6905;
   private boolean field6906 = true;

   public Class1305(Screen var1, Class8286 var2) {
      super(new TranslationTextComponent("gui.stats"));
      this.field6900 = var1;
      this.field6904 = var2;
   }

   @Override
   public void method1921() {
      this.field6906 = true;
      this.field4562.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14278));
   }

   public void method6179() {
      this.field6901 = new Class1280(this, this.field4562);
      this.field6902 = new Class1282(this, this.field4562);
      this.field6903 = new Class1277(this, this.field4562);
   }

   public void method6180() {
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 120, this.field4565 - 52, 80, 20, new TranslationTextComponent("stat.generalButton"), var1 -> this.method6183(this.field6901)
         )
      );
      Class1206 var3 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 40, this.field4565 - 52, 80, 20, new TranslationTextComponent("stat.itemsButton"), var1 -> this.method6183(this.field6902)
         )
      );
      Class1206 var4 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 40, this.field4565 - 52, 80, 20, new TranslationTextComponent("stat.mobsButton"), var1 -> this.method6183(this.field6903)
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 - 28, 200, 20, DialogTexts.field30658, var1 -> this.field4562.displayGuiScreen(this.field6900))
      );
      if (this.field6902.method2468().isEmpty()) {
         var3.field6482 = false;
      }

      if (this.field6903.method2468().isEmpty()) {
         var4.field6482 = false;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      if (!this.field6906) {
         this.method6182().method1923(var1, var2, var3, var4);
         method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 20, 16777215);
         super.method1923(var1, var2, var3, var4);
      } else {
         this.method2469(var1);
         method5691(var1, this.field4568, field6899, this.field4564 / 2, this.field4565 / 2, 16777215);
         method5690(
            var1,
            this.field4568,
            field6907[(int)(Util.milliTime() / 150L % (long)field6907.length)],
            this.field4564 / 2,
            this.field4565 / 2 + 18,
            16777215
         );
      }
   }

   @Override
   public void method6181() {
      if (this.field6906) {
         this.method6179();
         this.method6180();
         this.method6183(this.field6901);
         this.field6906 = false;
      }
   }

   @Override
   public boolean isPauseScreen() {
      return !this.field6906;
   }

   @Nullable
   public Class1274<?> method6182() {
      return this.field6905;
   }

   public void method6183(Class1274<?> var1) {
      this.field4561.remove(this.field6901);
      this.field4561.remove(this.field6902);
      this.field4561.remove(this.field6903);
      if (var1 != null) {
         this.field4561.add(0, var1);
         this.field6905 = var1;
      }
   }

   private static String method6184(Class9007<ResourceLocation> var0) {
      return "stat." + ((ResourceLocation)var0.method33276()).toString().replace(':', '.');
   }

   private int method6185(int var1) {
      return 115 + 40 * var1;
   }

   private void method6186(MatrixStack var1, int var2, int var3, Item var4) {
      this.method6187(var1, var2 + 1, var3 + 1, 0, 0);
      RenderSystem.method27867();
      this.field4563.method791(var4.method11742(), var2 + 2, var3 + 2);
      RenderSystem.method27868();
   }

   private void method6187(MatrixStack var1, int var2, int var3, int var4, int var5) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field6452);
      method5697(var1, var2, var3, this.method5702(), (float)var4, (float)var5, 18, 18, 128, 128);
   }

   // $VF: synthetic method
   public static String method6192(Class9007 var0) {
      return method6184(var0);
   }

   // $VF: synthetic method
   public static Class8286 method6193(Class1305 var0) {
      return var0.field6904;
   }

   // $VF: synthetic method
   public static int method6194(Class1305 var0, int var1) {
      return var0.method6185(var1);
   }

   // $VF: synthetic method
   public static void method6195(Class1305 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method6187(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static Class1282 method6196(Class1305 var0) {
      return var0.field6902;
   }

   // $VF: synthetic method
   public static void method6197(Class1305 var0, MatrixStack var1, int var2, int var3, Item var4) {
      var0.method6186(var1, var2, var3, var4);
   }
}
