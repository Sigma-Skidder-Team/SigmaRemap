package mapped;

public class Class1174 extends Class1155<Class1174> {
   public final Class1285 field6359;

   public Class1174(Class1285 var1) {
      this.field6359 = var1;
   }

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Class9537 var13 = Class1324.method6302(this.field6359.field6849)
         .method38129()
         .get(Class1324.method6302(this.field6359.field6849).method38129().size() - var2 - 1);
      Class7380 var14 = var13.method36906();
      Class3257 var15 = var14.method23383().method11581();
      if (var15 == Class8514.field37222) {
         if (!var14.method23448(Blocks.WATER)) {
            if (var14.method23448(Blocks.LAVA)) {
               var15 = Class8514.field37884;
            }
         } else {
            var15 = Class8514.field37883;
         }
      }

      Class8848 var16 = new Class8848(var15);
      this.method5596(var1, var4, var3, var16);
      this.field6359.field6849.field4568.method38805(var1, var15.method11731(var16), (float)(var4 + 18 + 5), (float)(var3 + 3), 16777215);
      String var17;
      if (var2 != 0) {
         if (var2 != Class1324.method6302(this.field6359.field6849).method38129().size() - 1) {
            var17 = Class9088.method33883("createWorld.customize.flat.layer", var13.method36905());
         } else {
            var17 = Class9088.method33883("createWorld.customize.flat.layer.bottom", var13.method36905());
         }
      } else {
         var17 = Class9088.method33883("createWorld.customize.flat.layer.top", var13.method36905());
      }

      this.field6359
         .field6849
         .field4568
         .method38801(var1, var17, (float)(var4 + 2 + 213 - this.field6359.field6849.field4568.method38820(var17)), (float)(var3 + 3), 16777215);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.field6359.method6024(this);
         return true;
      }
   }

   private void method5596(Class9332 var1, int var2, int var3, Class8848 var4) {
      this.method5597(var1, var2 + 1, var3 + 1);
      RenderSystem.method27867();
      if (!var4.method32105()) {
         this.field6359.field6849.field4563.method791(var4, var2 + 2, var3 + 2);
      }

      RenderSystem.method27868();
   }

   private void method5597(Class9332 var1, int var2, int var3) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1285.method6107(this.field6359).getTextureManager().bindTexture(Class1193.field6452);
      Class1193.method5697(var1, var2, var3, this.field6359.field6849.method5702(), 0.0F, 0.0F, 18, 18, 128, 128);
   }
}
