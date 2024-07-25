package remapped;

import java.io.IOException;

public class class_1083 extends class_1237 {
   private static String[] field_5982;
   private boolean field_5980;
   private boolean field_5968;
   private boolean field_5973;
   private boolean field_5989;
   private boolean field_5983;
   private boolean field_5967;
   private boolean field_5984;
   private boolean field_5970;
   private long field_5977;
   private long field_5971;
   private int field_5988;
   private int field_5978;
   private int field_5981;
   private int field_5976;
   private int field_5979;
   private long field_5972;
   private int field_5987;
   private int field_5969;
   private long field_5990;
   private long field_5974;
   private long field_5986;
   private boolean field_5985;
   private int field_5975;

   @Override
   public void method_5498(class_6041 var1) throws IOException {
      boolean var4 = var1.method_27531() == 1;
      if (!var4) {
         int var5 = var1.method_27531();
         this.field_5980 = (var5 >> 7 & 1) == 1;
         this.field_5968 = (var5 >> 6 & 1) == 1;
         this.field_5973 = (var5 >> 5 & 1) == 1;
         this.field_5989 = (var5 >> 4 & 1) == 1;
         this.field_5983 = (var5 >> 3 & 1) == 1;
         this.field_5967 = (var5 >> 2 & 1) == 1;
         this.field_5984 = (var5 >> 1 & 1) == 1;
         this.field_5970 = (var5 & 1) == 1;
         this.field_5977 = var1.method_27524(4);
         this.field_5971 = var1.method_27524(4);
         this.field_5988 = var1.method_27531();
         this.field_5978 = var1.method_27531();
         this.field_5981 = var1.method_27531();
         var5 = var1.method_27531();
         this.field_5976 = var5 >> 4 & 15;
         this.field_5979 = var5 & 15;
         if (this.field_5970) {
            this.field_5972 = var1.method_27524(4);
            this.field_5987 = (int)var1.method_27524(2);
            this.field_5969 = (int)var1.method_27524(2);
         }

         if (!this.field_5983) {
            if (this.field_5967) {
               this.field_5990 = var1.method_27524(4);
            }

            var5 = (int)Math.ceil((double)(2 * this.field_5988) / 8.0);
            long var6 = var1.method_27524(var5);
            long var8 = (long)((1 << this.field_5988) - 1);
            this.field_5974 = var6 >> this.field_5988 & var8;
            this.field_5986 = var6 & var8;
         }
      }

      int var12 = var1.method_27531();
      this.field_5985 = (var12 >> 7 & 1) == 1;
      if (this.field_5985) {
         this.field_5975 = (int)var1.method_27524(2);
      }
   }
}
