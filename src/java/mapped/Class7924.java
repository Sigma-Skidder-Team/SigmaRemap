package mapped;

public class Class7924 {
   public short field33919;
   public short field33920;
   public short field33921;
   public short field33922;
   public short field33923;
   public short field33924;
   public short field33925;
   public short field33926;
   public Image field33927;
   public short field33928;
   public short[] field33929;
   public final Class7426 field33930;

   private Class7924(Class7426 var1) {
      this.field33930 = var1;
   }

   public void method26594() {
      this.field33927 = Class7426.method23947(this.field33930).method23551(this.field33920, this.field33921, this.field33922, this.field33923);
   }

   @Override
   public String toString() {
      return "[CharDef id=" + this.field33919 + " x=" + this.field33920 + " y=" + this.field33921 + "]";
   }

   public void method26595(float var1, float var2) {
      this.field33927.method23529(var1 + (float)this.field33924, var2 + (float)this.field33925, (float)this.field33922, (float)this.field33923);
   }

   public int method26596(int var1) {
      if (this.field33929 != null) {
         int var4 = 0;
         int var5 = this.field33929.length - 1;

         while (var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            short var7 = this.field33929[var6];
            int var8 = var7 & 255;
            if (var8 >= var1) {
               if (var8 <= var1) {
                  return var7 >> 8;
               }

               var5 = var6 - 1;
            } else {
               var4 = var6 + 1;
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   // $VF: synthetic method
   public Class7924(Class7426 var1, Class19 var2) {
      this(var1);
   }
}
