package remapped;

public class class_1742 {
   private class_8343 field_8970;
   private int field_8978;
   private int field_8975;
   private int field_8967;
   private int field_8972;
   private int field_8971;
   private final int field_8977;
   private boolean field_8982;
   private boolean field_8981 = true;
   private class_7162 field_8974;
   private class_798 field_8969;
   private Timer field_8976 = new Timer();
   private int field_8979;
   private int field_8968 = 1;
   private class_2440 field_8980;

   public class_1742(class_8343 var1, int var2, int var3, int var4, class_798 var5, int var6, int var7) {
      this.field_8970 = var1;
      this.field_8975 = var2;
      this.field_8967 = var3;
      this.field_8972 = var4;
      this.field_8969 = var5;
      this.field_8971 = var6;
      this.field_8968 = var7;
      this.field_8980 = new class_2440(var6, var6, class_4043.field_19618);
      this.field_8977 = (int)((float)var1.method_38420() / (float)var3);
      this.field_8974 = class_7162.field_36873;
   }

   public void method_7774() {
      this.field_8976.method_14776();
      this.field_8982 = true;
      if (this.field_8980.method_11128() != class_4043.field_19618) {
         this.field_8980.method_11119(class_4043.field_19618);
      } else {
         this.field_8980.method_11119(class_4043.field_19620);
      }
   }

   public boolean method_7777() {
      return this.field_8980.method_11128() != class_4043.field_19618;
   }

   public void method_7773() {
      this.field_8976.method_14774();
      this.field_8982 = false;
   }

   public void method_7768() {
      this.field_8976.method_14773();
   }

   public void method_7771() {
      long var3 = this.field_8976.method_14772();
      if (this.field_8982) {
         this.field_8979++;
      }

      int var5 = 0;
      switch (this.field_8969) {
         case field_4282:
            this.field_8978 = Math.round((float)(this.field_8975 - 1) * this.field_8980.method_11123());
            break;
         case field_4284:
            if (this.field_8979 >= this.field_8971) {
               var5 = this.field_8968;
               this.field_8979 = 0;
            }

            if (this.field_8974 == class_7162.field_36873) {
               this.field_8978 += var5;
               if (!this.field_8981 && this.field_8978 >= this.field_8975 - 1) {
                  this.field_8978 = this.field_8975 - 1;
                  this.method_7773();
                  this.method_7768();
               } else if (this.field_8978 > this.field_8975) {
               }

               this.field_8978 = this.field_8978 % this.field_8975;
            } else {
               this.field_8978 -= var5;
               if (!this.field_8981 && this.field_8978 <= 0) {
                  this.field_8978 = 0;
                  this.method_7773();
                  this.method_7768();
               } else if (this.field_8978 < 0) {
                  this.field_8978 = this.field_8975 - 1;
               }
            }
      }
   }

   public void method_7766(int var1, int var2, int var3, int var4, float var5) {
      int var8 = this.field_8978 % this.field_8977 * this.field_8967;
      int var9 = this.field_8978 / this.field_8977 * this.field_8972;
      class_73.method_100(
         (float)var1,
         (float)var2,
         (float)var3,
         (float)var4,
         this.field_8970,
         class_314.method_1444(class_1255.field_6918.field_6917, var5),
         (float)var8,
         (float)var9,
         (float)this.field_8967,
         (float)this.field_8972
      );
   }

   public class_8343 method_7769() {
      return this.field_8970;
   }

   public int method_7772() {
      return this.field_8978;
   }

   public void method_7764(int var1) {
      if (var1 < 0 || var1 > this.method_7760() - 1) {
         throw new IllegalArgumentException("Invalid frame count");
      }
   }

   public int method_7770() {
      return this.field_8967;
   }

   public int method_7763() {
      return this.field_8972;
   }

   public int method_7760() {
      return this.field_8975;
   }

   public int method_7761() {
      return this.field_8971;
   }

   public void method_7775(int var1) {
      this.field_8971 = var1;
   }

   public boolean method_7781() {
      return this.field_8982;
   }

   public boolean method_7778() {
      return this.field_8981;
   }

   public void method_7776(boolean var1) {
      this.field_8981 = var1;
   }

   public class_7162 method_7780() {
      return this.field_8974;
   }

   public void method_7767(class_7162 var1) {
      this.field_8974 = var1;
   }

   public int method_7765() {
      return this.field_8968;
   }

   public void method_7762(int var1) {
      this.field_8968 = var1;
   }
}
