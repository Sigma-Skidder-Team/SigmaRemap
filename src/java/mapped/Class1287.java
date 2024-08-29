package mapped;

public class Class1287 extends Class1286<Class1161> {
   private boolean field6850;
   public final Class806 field6851;

   public Class1287(Class806 var1) {
      super(var1.field4564, var1.field4565, 32, var1.field4565 - 40, 36);
      this.field6851 = var1;
   }

   @Override
   public void method6111() {
      super.method6111();
      this.field6850 = false;
   }

   public int method6112(Class1161 var1) {
      this.field6850 = true;
      return this.method6030(var1);
   }

   @Override
   public boolean method6057() {
      return this.field6851.method5533() == this;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 257 && var1 != 32 && var1 != 335) {
         return super.method1920(var1, var2, var3);
      } else {
         Class1155 var6 = this.method6023();
         return var6 != null ? var6.method1958(0.0, 0.0, 0) : super.method1920(var1, var2, var3);
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0 && var1 < (double)this.method6048() && var3 >= (double)this.field6787 && var3 <= (double)this.field6788) {
         int var8 = Class806.method2156(this.field6851).method6053();
         int var9 = this.method6048();
         int var10 = (int)Math.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044() - 4;
         int var11 = var10 / this.field6783;
         if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method6031()) {
            this.method6110(var10, var11, var1, var3, this.field6785);
            Class806.method2157(this.field6851, Class806.method2158(this.field6851) + 7);
            this.method6109(var11);
         }

         return true;
      } else {
         return super.method1958(var1, var3, var5);
      }
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         Class6128 var4;
         if (!this.field6850) {
            if (var1 >= Class806.method2159(this.field6851).size()) {
               Class806.method2120(this.field6851, -1L);
               return;
            }

            var4 = (Class6128)Class806.method2159(this.field6851).get(var1);
         } else if (var1 != 0) {
            if (var1 - 1 >= Class806.method2159(this.field6851).size()) {
               Class806.method2120(this.field6851, -1L);
               return;
            }

            var4 = (Class6128)Class806.method2159(this.field6851).get(var1 - 1);
         } else {
            var4 = null;
         }

         Class806.method2160(this.field6851, var4);
         if (var4 != null) {
            if (var4.field27447 != Class2261.field14708) {
               Class806.method2120(this.field6851, var4.field27443);
               if (Class806.method2158(this.field6851) >= 10 && Class806.method2161(this.field6851).field6482) {
                  this.field6851.method2046(Class806.method2099(this.field6851, Class806.method2098(this.field6851)), this.field6851);
               }
            } else {
               Class806.method2120(this.field6851, -1L);
            }
         } else {
            Class806.method2120(this.field6851, -1L);
         }
      }
   }

   public void method6024(Class1161 var1) {
      super.method6024(var1);
      int var4 = this.method2468().indexOf(var1);
      if (this.field6850 && var4 == 0) {
         Class9229.method34713(I18n.format("mco.trial.message.line1"), I18n.format("mco.trial.message.line2"));
      } else if (!this.field6850 || var4 > 0) {
         Class6128 var5 = (Class6128)Class806.method2159(this.field6851).get(var4 - (!this.field6850 ? 0 : 1));
         Class806.method2120(this.field6851, var5.field27443);
         Class806.method2160(this.field6851, var5);
         if (var5.field27447 != Class2261.field14708) {
            Class9229.method34711(I18n.format("narrator.select", var5.field27445));
         } else {
            Class9229.method34711(I18n.format("mco.selectServer.uninitialized") + I18n.format("mco.gui.button"));
         }
      }
   }

   @Override
   public void method6110(int var1, int var2, double var3, double var5, int var7) {
      if (this.field6850) {
         if (var2 == 0) {
            Class806.method2111(this.field6851, true);
            return;
         }

         var2--;
      }

      if (var2 < Class806.method2159(this.field6851).size()) {
         Class6128 var10 = (Class6128)Class806.method2159(this.field6851).get(var2);
         if (var10 != null) {
            if (var10.field27447 != Class2261.field14708) {
               Class806.method2120(this.field6851, var10.field27443);
            } else {
               Class806.method2120(this.field6851, -1L);
               Minecraft.getInstance().displayGuiScreen(new Class799(var10, this.field6851));
            }

            if (Class806.method2162(this.field6851) != Class1982.field12942) {
               if (Class806.method2162(this.field6851) != Class1982.field12941) {
                  if (Class806.method2162(this.field6851) == Class1982.field12940) {
                     Class806.method2165(this.field6851);
                  }
               } else {
                  Class806.method2120(this.field6851, var10.field27443);
                  Class806.method2164(this.field6851, var10);
               }
            } else {
               Class806.method2120(this.field6851, var10.field27443);
               Class806.method2163(this.field6851, var10);
            }
         }
      }
   }

   @Override
   public int method6036() {
      return this.method6031() * 36;
   }

   @Override
   public int method6022() {
      return 300;
   }
}
