package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class800 extends Class798 {
   private static final ITextComponent field4173 = new TranslationTextComponent("mco.reset.world.seed");
   private static final ITextComponent[] field4174 = new ITextComponent[]{
      new TranslationTextComponent("generator.default"),
      new TranslationTextComponent("generator.flat"),
      new TranslationTextComponent("generator.large_biomes"),
      new TranslationTextComponent("generator.amplified")
   };
   private final Class814 field4175;
   private Class1153 field4176;
   private Class1189 field4177;
   private Boolean field4178 = true;
   private Integer field4179 = 0;
   private ITextComponent field4180;

   public Class800(Class814 var1, ITextComponent var2) {
      this.field4175 = var1;
      this.field4180 = var2;
   }

   @Override
   public void method1919() {
      this.field4177.method5633();
      super.method1919();
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4176 = new Class1153(new TranslationTextComponent("mco.reset.world.generate"), this.field4564 / 2, 17, 16777215);
      this.<Class1153>method2456(this.field4176);
      this.field4177 = new Class1189(
         this.field4562.field1294, this.field4564 / 2 - 100, method1929(2), 200, 20, (Class1189)null, new TranslationTextComponent("mco.reset.world.seed")
      );
      this.field4177.method5657(32);
      this.<Class1189>method2456(this.field4177);
      this.method5536(this.field4177);
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 102, method1929(4), 205, 20, this.method1939(), var1 -> {
         this.field4179 = (this.field4179 + 1) % field4174.length;
         var1.method5743(this.method1939());
      }));
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 102, method1929(6) - 2, 205, 20, this.method1940(), var1 -> {
         this.field4178 = !this.field4178;
         var1.method5743(this.method1940());
      }));
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            method1929(12),
            97,
            20,
            this.field4180,
            var1 -> this.field4175.method2255(new Class7044(this.field4177.method5636(), this.field4179, this.field4178))
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 8, method1929(12), 97, 20, Class7127.field30663, var1 -> this.field4562.displayGuiScreen(this.field4175))
      );
      this.method1930();
   }

   @Override
   public void onClose() {
      this.field4562.field1302.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4175);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4176.method5542(this, var1);
      this.field4568.method38805(var1, field4173, (float)(this.field4564 / 2 - 100), (float)method1929(1), 10526880);
      this.field4177.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }

   private ITextComponent method1939() {
      return new TranslationTextComponent("selectWorld.mapType").appendString(" ").append(field4174[this.field4179]);
   }

   private ITextComponent method1940() {
      return Class7127.method22238(new TranslationTextComponent("selectWorld.mapFeatures"), this.field4178);
   }
}
