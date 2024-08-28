package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;

public class Class1175 extends Class1155<Class1175> {
   private Class1275 field6360;
   public final Minecraft field6361;
   public final Screen field6362;
   private final Class4681 field6363;
   private final Class9125 field6364;
   private final Class5991 field6365;
   private final Class9125 field6366;
   private final Class5991 field6367;

   public Class1175(Minecraft var1, Class1275 var2, Screen var3, Class4681 var4) {
      this.field6361 = var1;
      this.field6362 = var3;
      this.field6363 = var4;
      this.field6360 = var2;
      this.field6364 = method5598(var1, var4.method14679());
      this.field6365 = method5599(var1, var4.method14690());
      this.field6366 = method5598(var1, Class1275.method6063());
      this.field6367 = method5599(var1, var4.method14678().method8722());
   }

   private static Class9125 method5598(Minecraft var0, ITextComponent var1) {
      int var4 = var0.field1294.method38821(var1);
      if (var4 <= 157) {
         return var1.func_241878_f();
      } else {
         ITextProperties var5 = ITextProperties.func_240655_a_(
            var0.field1294.method38825(var1, 157 - var0.field1294.method38820("...")), ITextProperties.func_240652_a_("...")
         );
         return LanguageMap.getInstance().func_241870_a(var5);
      }
   }

   private static Class5991 method5599(Minecraft var0, ITextComponent var1) {
      return Class5991.method18585(var0.field1294, var1, 157, 2);
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Class2064 var13 = this.field6363.method14678();
      if (!var13.method8720()) {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         Class1193.method5686(var1, var4 - 1, var3 - 1, var4 + var5 - 9, var3 + var6 + 1, -8978432);
      }

      this.field6361.getTextureManager().bindTexture(this.field6363.method14677());
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      Class9125 var14 = this.field6364;
      Class5991 var15 = this.field6365;
      if (this.method5600() && (this.field6361.gameSettings.field44625 || var9)) {
         this.field6361.getTextureManager().bindTexture(Class1275.method6064());
         Class1193.method5686(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         int var16 = var7 - var4;
         int var17 = var8 - var3;
         if (!this.field6363.method14678().method8720()) {
            var14 = this.field6366;
            var15 = this.field6367;
         }

         if (!this.field6363.method14691()) {
            if (this.field6363.method14692()) {
               if (var16 >= 16) {
                  Class1193.method5699(var1, var4, var3, 32.0F, 0.0F, 32, 32, 256, 256);
               } else {
                  Class1193.method5699(var1, var4, var3, 32.0F, 32.0F, 32, 32, 256, 256);
               }
            }

            if (this.field6363.method14686()) {
               if (var16 < 32 && var16 > 16 && var17 < 16) {
                  Class1193.method5699(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  Class1193.method5699(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
               }
            }

            if (this.field6363.method14688()) {
               if (var16 < 32 && var16 > 16 && var17 > 16) {
                  Class1193.method5699(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
               } else {
                  Class1193.method5699(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
               }
            }
         } else if (var16 >= 32) {
            Class1193.method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
         } else {
            Class1193.method5699(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
         }
      }

      this.field6361.field1294.method38802(var1, var14, (float)(var4 + 32 + 2), (float)(var3 + 1), 16777215);
      var15.method18590(var1, var4 + 32 + 2, var3 + 12, 10, 8421504);
   }

   private boolean method5600() {
      return !this.field6363.method14682() || !this.field6363.method14683();
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      double var8 = var1 - (double)this.field6360.method6053();
      double var10 = var3 - (double)this.field6360.method6055(this.field6360.method2468().indexOf(this));
      if (this.method5600() && var8 <= 32.0) {
         if (this.field6363.method14691()) {
            Class2064 var12 = this.field6363.method14678();
            if (!var12.method8720()) {
               ITextComponent var13 = var12.method8723();
               this.field6361.displayGuiScreen(new Class829(var1x -> {
                  this.field6361.displayGuiScreen(this.field6362);
                  if (var1x) {
                     this.field6363.method14675();
                  }
               }, Class1275.method6065(), var13));
            } else {
               this.field6363.method14675();
            }

            return true;
         }

         if (var8 < 16.0 && this.field6363.method14692()) {
            this.field6363.method14676();
            return true;
         }

         if (var8 > 16.0 && var10 < 16.0 && this.field6363.method14686()) {
            this.field6363.method14687();
            return true;
         }

         if (var8 > 16.0 && var10 > 16.0 && this.field6363.method14688()) {
            this.field6363.method14689();
            return true;
         }
      }

      return false;
   }
}
