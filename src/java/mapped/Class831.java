package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.stream.IntStream;

public class Class831 extends Screen {
   private final Class2848 field4610 = new Class2848();
   private final Class954 field4611;
   private int field4612;
   private int field4613;
   private Class9079 field4614;
   private final String[] field4615;

   public Class831(Class954 var1) {
      super(new TranslationTextComponent("sign.edit"));
      this.field4615 = IntStream.range(0, 4).<ITextComponent>mapToObj(var1::method3835).<String>map(ITextComponent::getString).<String>toArray(String[]::new);
      this.field4611 = var1;
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 120, 200, 20, Class7127.field30658, var1 -> this.method2541()));
      this.field4611.method3839(false);
      this.field4614 = new Class9079(() -> this.field4615[this.field4613], var1 -> {
         this.field4615[this.field4613] = var1;
         this.field4611.method3836(this.field4613, new StringTextComponent(var1));
      }, Class9079.method33827(this.field4562), Class9079.method33829(this.field4562), var1 -> this.field4562.field1294.method38820(var1) <= 90);
   }

   @Override
   public void method1931() {
      this.field4562.field1302.method36347(false);
      ClientPlayNetHandler var3 = this.field4562.getClientPlayNetHandler();
      if (var3 != null) {
         var3.sendPacket(new Class5519(this.field4611.method3774(), this.field4615[0], this.field4615[1], this.field4615[2], this.field4615[3]));
      }

      this.field4611.method3839(true);
   }

   @Override
   public void method1919() {
      this.field4612++;
      if (!this.field4611.method3786().method13796(this.field4611.method3775().method23383())) {
         this.method2541();
      }
   }

   private void method2541() {
      this.field4611.method3622();
      this.field4562.displayGuiScreen((Screen)null);
   }

   @Override
   public boolean method1932(char var1, int var2) {
      this.field4614.method33831(var1);
      return true;
   }

   @Override
   public void method1945() {
      this.method2541();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 265) {
         if (var1 != 264 && var1 != 257 && var1 != 335) {
            return !this.field4614.method33832(var1) ? super.method1920(var1, var2, var3) : true;
         } else {
            this.field4613 = this.field4613 + 1 & 3;
            this.field4614.method33847();
            return true;
         }
      } else {
         this.field4613 = this.field4613 - 1 & 3;
         this.field4614.method33847();
         return true;
      }
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      Class7516.method24502();
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 40, 16777215);
      var1.method35294();
      var1.method35291((double)(this.field4564 / 2), 0.0, 50.0);
      float var7 = 93.75F;
      var1.method35292(93.75F, -93.75F, 93.75F);
      var1.method35291(0.0, -1.3125, 0.0);
      Class7380 var8 = this.field4611.method3775();
      boolean var9 = var8.method23383() instanceof Class3374;
      if (!var9) {
         var1.method35291(0.0, -0.3125, 0.0);
      }

      boolean var10 = this.field4612 / 6 % 2 == 0;
      float var11 = 0.6666667F;
      var1.method35294();
      var1.method35292(0.6666667F, -0.6666667F, -0.6666667F);
      Class7735 var12 = this.field4562.method1581().method26536();
      Class7826 var13 = Class5947.method18473(var8.method23383());
      Class5422 var14 = var13.method26200(var12, this.field4610::method11028);
      this.field4610.field17650.method22680(var1, var14, 15728880, Class213.field798);
      if (var9) {
         this.field4610.field17651.method22680(var1, var14, 15728880, Class213.field798);
      }

      var1.method35295();
      float var15 = 0.010416667F;
      var1.method35291(0.0, 0.33333334F, 0.046666667F);
      var1.method35292(0.010416667F, -0.010416667F, 0.010416667F);
      int var16 = this.field4611.method3844().method314();
      int var17 = this.field4614.method33849();
      int var18 = this.field4614.method33851();
      int var19 = this.field4613 * 10 - this.field4615.length * 5;
      Class9367 var20 = var1.method35296().method32361();

      for (int var21 = 0; var21 < this.field4615.length; var21++) {
         String var22 = this.field4615[var21];
         if (var22 != null) {
            if (this.field4568.method38829()) {
               var22 = this.field4568.method38806(var22);
            }

            float var23 = (float)(-this.field4562.field1294.method38820(var22) / 2);
            this.field4562
               .field1294
               .method38811(var22, var23, (float)(var21 * 10 - this.field4615.length * 5), var16, false, var20, var12, false, 0, 15728880, false);
            if (var21 == this.field4613 && var17 >= 0 && var10) {
               int var24 = this.field4562.field1294.method38820(var22.substring(0, Math.max(Math.min(var17, var22.length()), 0)));
               int var25 = var24 - this.field4562.field1294.method38820(var22) / 2;
               if (var17 >= var22.length()) {
                  this.field4562.field1294.method38811("_", (float)var25, (float)var19, var16, false, var20, var12, false, 0, 15728880, false);
               }
            }
         }
      }

      var12.method25602();

      for (int var33 = 0; var33 < this.field4615.length; var33++) {
         String var34 = this.field4615[var33];
         if (var34 != null && var33 == this.field4613 && var17 >= 0) {
            int var35 = this.field4562.field1294.method38820(var34.substring(0, Math.max(Math.min(var17, var34.length()), 0)));
            int var36 = var35 - this.field4562.field1294.method38820(var34) / 2;
            if (var10 && var17 < var34.length()) {
               method5686(var1, var36, var19 - 1, var36 + 1, var19 + 9, 0xFF000000 | var16);
            }

            if (var18 != var17) {
               int var37 = Math.min(var17, var18);
               int var26 = Math.max(var17, var18);
               int var27 = this.field4562.field1294.method38820(var34.substring(0, var37)) - this.field4562.field1294.method38820(var34) / 2;
               int var28 = this.field4562.field1294.method38820(var34.substring(0, var26)) - this.field4562.field1294.method38820(var34) / 2;
               int var29 = Math.min(var27, var28);
               int var30 = Math.max(var27, var28);
               Class9352 var31 = Class9352.method35409();
               Class5425 var32 = var31.method35411();
               RenderSystem.method27862();
               RenderSystem.method27857();
               RenderSystem.method27859(Class2270.field14769);
               var32.method17063(7, Class9337.field43342);
               var32.method17040(var20, (float)var29, (float)(var19 + 9), 0.0F).method17026(0, 0, 255, 255).method17031();
               var32.method17040(var20, (float)var30, (float)(var19 + 9), 0.0F).method17026(0, 0, 255, 255).method17031();
               var32.method17040(var20, (float)var30, (float)var19, 0.0F).method17026(0, 0, 255, 255).method17031();
               var32.method17040(var20, (float)var29, (float)var19, 0.0F).method17026(0, 0, 255, 255).method17031();
               var32.method17065();
               Class4395.method13895(var32);
               RenderSystem.method27858();
               RenderSystem.method27861();
            }
         }
      }

      var1.method35295();
      Class7516.method24503();
      super.method1923(var1, var2, var3, var4);
   }
}
