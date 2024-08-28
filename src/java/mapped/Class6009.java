package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;
import totalcross.json.JSONObject;

public class Class6009<T extends Number> extends Class6001<Float> {
   private Class<? extends T> field26192;
   private float field26193;
   private float field26194;
   private float field26195;

   public Class6009(String var1, String var2, float var3, Class<? extends T> var4, float var5, float var6, float var7) {
      super(var1, var2, Class2314.field15852, var3);
      this.field26192 = var4;
      this.field26193 = var5;
      this.field26194 = var6;
      this.field26195 = var7;
   }

   public int method18636() {
      if (this.field26195 != 1.0F) {
         String var3 = Float.toString(Math.abs(this.method18641()));
         int var4 = var3.indexOf(46);
         return var3.length() - var4 - 1;
      } else {
         return 0;
      }
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.field26179 = Class8000.method27328(var1, "value", this.method18624());
      return var1;
   }

   public float method18637() {
      return this.field26193;
   }

   public void method18638(float var1) {
      this.field26193 = var1;
   }

   public float method18639() {
      return this.field26194;
   }

   public void method18640(float var1) {
      this.field26194 = var1;
   }

   public float method18641() {
      return this.field26195;
   }

   public void method18642(float var1) {
      this.field26195 = var1;
   }
}
