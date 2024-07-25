package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.util.text.StringTextComponent;

public class class_6244 extends class_2577 {
   private ArrayList field_31954;
   private int field_31950;
   private long field_31949 = Long.MIN_VALUE;
   private long field_31952 = 0L;
   public final class_1789 field_31951;

   public class_6244(class_1789 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.method_7969(), var2, var3, var4, var5, var6);
      this.field_31951 = var1;
      this.method_28514();
      this.field_12769 = 0.0;
      int var9 = this.field_31950 * var6;
      int var10 = (var5 - var4) / 2;
      if (var9 > var10) {
         this.method_11711(var9 - var10);
      }
   }

   @Override
   public int method_11732() {
      return this.field_12760 - 20;
   }

   public void method_28514() {
      this.field_31954 = class_6588.method_30243();
      this.field_31950 = 0;
      int var3 = 0;

      for (int var4 = this.field_31954.size(); var3 < var4; var3++) {
         if (((String)this.field_31954.get(var3)).equals(class_6588.field_33597)) {
            this.field_31950 = var3;
            break;
         }
      }
   }

   @Override
   public int method_11725() {
      return this.field_31954.size();
   }

   @Override
   public boolean method_11730(int var1, int var2, double var3, double var5) {
      if (var1 == this.field_31950 && this.field_31949 == this.field_31952) {
         return false;
      } else {
         String var9 = (String)this.field_31954.get(var1);
         class_8591 var10 = class_6588.method_30121(var9);
         if (this.method_28516(var10, var1)) {
            this.method_28515(var1);
            return true;
         } else {
            return false;
         }
      }
   }

   private void method_28515(int var1) {
      this.field_31950 = var1;
      this.field_31952 = this.field_31949;
      class_6588.method_30319((String)this.field_31954.get(var1));
      class_6588.method_30259();
      this.field_31951.method_7965();
   }

   private boolean method_28516(class_8591 var1, int var2) {
      if (var1 != null) {
         InputStream var5 = var1.method_39505("/shaders/shaders.properties");
         Properties var6 = class_9654.method_44540(var5, "Shaders");
         if (var6 != null) {
            String var7 = "version.1.16.4";
            String var8 = var6.getProperty(var7);
            if (var8 != null) {
               var8 = var8.trim();
               String var9 = "G5";
               int var10 = Config.method_14281(var9, var8);
               if (var10 < 0) {
                  String var11 = ("HD_U_" + var8).replace('_', ' ');
                  String var12 = class_6956.method_31803("of.message.shaders.nv1", var11);
                  String var13 = class_6956.method_31803("of.message.shaders.nv2");
                  BooleanConsumer var14 = var2x -> {
                     if (var2x) {
                        this.method_28515(var2);
                     }

                     this.field_12768.method_8609(this.field_31951);
                  };
                  class_9640 var15 = new class_9640(var14, new StringTextComponent(var12), new StringTextComponent(var13));
                  this.field_12768.method_8609(var15);
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
   public boolean method_11722(int var1) {
      return var1 == this.field_31950;
   }

   @Override
   public int method_11719() {
      return this.field_12760 - 6;
   }

   @Override
   public int method_11729() {
      return this.method_11725() * 18;
   }

   @Override
   public void method_11705() {
   }

   @Override
   public void method_11704(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      String var11 = (String)this.field_31954.get(var2);
      if (!var11.equals("OFF")) {
         if (var11.equals("(internal)")) {
            var11 = class_3458.method_15912("of.options.shaders.packDefault");
         }
      } else {
         var11 = class_3458.method_15912("of.options.shaders.packNone");
      }

      this.field_31951.method_7973(var1, var11, this.field_12760 / 2, var4 + 1, 14737632);
   }

   public int method_28517() {
      return this.field_31950;
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      return super.method_26945(var1, var3, var5 * 3.0);
   }
}
