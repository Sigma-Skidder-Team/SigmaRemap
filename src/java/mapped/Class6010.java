package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;

import java.awt.Color;

public class Class6010 extends Class6001<Integer> {
   public boolean field26196 = false;

   public Class6010(String var1, String var2, int var3, boolean var4) {
      super(var1, var2, Class2314.field15859, var3);
      this.field26196 = var4;
   }

   public Class6010(String var1, String var2, int var3) {
      super(var1, var2, Class2314.field15859, var3);
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.field26179 = Class8000.method27326(var1, "value", this.method18624());
      this.field26196 = Class8000.method27324(var1, "rainbow", false);
      return var1;
   }

   public boolean method18643() {
      return this.field26196;
   }

   public void method18644(boolean var1) {
      this.field26196 = var1;
   }

   @Override
   public JSONObject method18611(JSONObject var1) {
      var1.method21806("name", this.method18625());
      var1.method21806("value", this.method18645());
      var1.method21800("rainbow", this.field26196);
      return var1;
   }

   public Integer method18619() {
      if (!this.field26196) {
         return this.field26179;
      } else {
         Color var3 = new Color(this.field26179);
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         return Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, var4[1], var4[2]).getRGB();
      }
   }

   public Integer method18645() {
      return this.field26179;
   }
}
