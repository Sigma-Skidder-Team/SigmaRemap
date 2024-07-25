package remapped;

public class class_3053 {
   public short field_14980;
   public short field_14984;
   public short field_14986;
   public short field_14977;
   public short field_14974;
   public short field_14982;
   public short field_14975;
   public short field_14979;
   public class_8112 field_14983;
   public short field_14978;
   public short[] field_14981;

   private class_3053(class_1948 var1) {
      this.field_14985 = var1;
   }

   public void method_13947() {
      this.field_14983 = class_1948.method_9001(this.field_14985).method_36858(this.field_14984, this.field_14986, this.field_14977, this.field_14974);
   }

   @Override
   public String toString() {
      return "[CharDef id=" + this.field_14980 + " x=" + this.field_14984 + " y=" + this.field_14986 + "]";
   }

   public void method_13948(float var1, float var2) {
      this.field_14983.method_36903(var1 + (float)this.field_14982, var2 + (float)this.field_14975, (float)this.field_14977, (float)this.field_14974);
   }

   public int method_13946(int var1) {
      if (this.field_14981 != null) {
         int var4 = 0;
         int var5 = this.field_14981.length - 1;

         while (var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            short var7 = this.field_14981[var6];
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
}
