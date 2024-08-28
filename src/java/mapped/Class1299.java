package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.StringTextComponent;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Class1299 extends Class1298 {
   private ArrayList field6886;
   private int field6887;
   private long field6888 = Long.MIN_VALUE;
   private long field6889 = 0L;
   public final Class842 field6890;

   public Class1299(Class842 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.method2571(), var2, var3, var4, var5, var6);
      this.field6890 = var1;
      this.method6174();
      this.field6880 = 0.0;
      int var9 = this.field6887 * var6;
      int var10 = (var5 - var4) / 2;
      if (var9 > var10) {
         this.method6164(var9 - var10);
      }
   }

   @Override
   public int method6167() {
      return this.field6871 - 20;
   }

   public void method6174() {
      this.field6886 = Class8981.method32982();
      this.field6887 = 0;
      int var3 = 0;

      for (int var4 = this.field6886.size(); var3 < var4; var3++) {
         if (((String)this.field6886.get(var3)).equals(Class8981.field40887)) {
            this.field6887 = var3;
            break;
         }
      }
   }

   @Override
   public int method6147() {
      return this.field6886.size();
   }

   @Override
   public boolean method6148(int var1, int var2, double var3, double var5) {
      if (var1 == this.field6887 && this.field6888 == this.field6889) {
         return false;
      } else {
         String var9 = (String)this.field6886.get(var1);
         Class4671 var10 = Class8981.method32954(var9);
         if (this.method6176(var10, var1)) {
            this.method6175(var1);
            return true;
         } else {
            return false;
         }
      }
   }

   private void method6175(int var1) {
      this.field6887 = var1;
      this.field6889 = this.field6888;
      Class8981.method32952((String)this.field6886.get(var1));
      Class8981.method33033();
      this.field6890.method2569();
   }

   private boolean method6176(Class4671 var1, int var2) {
      if (var1 != null) {
         InputStream var5 = var1.method14639("/shaders/shaders.properties");
         Properties var6 = Class9772.method38446(var5, "Shaders");
         if (var6 != null) {
            String var7 = "version.1.16.4";
            String var8 = var6.getProperty(var7);
            if (var8 != null) {
               var8 = var8.trim();
               String var9 = "G5";
               int var10 = Class7944.method26931(var9, var8);
               if (var10 < 0) {
                  String var11 = ("HD_U_" + var8).replace('_', ' ');
                  String var12 = Class9088.method33883("of.message.shaders.nv1", var11);
                  String var13 = Class9088.method33883("of.message.shaders.nv2");
                  BooleanConsumer var14 = var2x -> {
                     if (var2x) {
                        this.method6175(var2);
                     }

                     this.field6870.displayGuiScreen(this.field6890);
                  };
                  Class829 var15 = new Class829(var14, new StringTextComponent(var12), new StringTextComponent(var13));
                  this.field6870.displayGuiScreen(var15);
                  return false;
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method6149(int var1) {
      return var1 == this.field6887;
   }

   @Override
   public int method6170() {
      return this.field6871 - 6;
   }

   @Override
   public int method6173() {
      return this.method6147() * 18;
   }

   @Override
   public void method6151() {
   }

   @Override
   public void method6153(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      String var11 = (String)this.field6886.get(var2);
      if (!var11.equals("OFF")) {
         if (var11.equals("(internal)")) {
            var11 = Class8043.method27619("of.options.shaders.packDefault");
         }
      } else {
         var11 = Class8043.method27619("of.options.shaders.packNone");
      }

      this.field6890.method2572(var1, var11, this.field6871 / 2, var4 + 1, 14737632);
   }

   public int method6177() {
      return this.field6887;
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      return super.method2649(var1, var3, var5 * 3.0);
   }
}
