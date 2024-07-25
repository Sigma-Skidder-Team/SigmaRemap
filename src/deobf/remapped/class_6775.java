package remapped;

public class class_6775 implements Runnable {
   private static String[] field_34950;

   public class_6775(class_9035 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_34952 = var1;
      this.field_34957 = var2;
      this.field_34951 = var3;
      this.field_34954 = var4;
      this.field_34955 = var5;
      this.field_34956 = var6;
      this.field_34953 = var7;
   }

   @Override
   public void run() {
      if (this.field_34957 != 0) {
         if (this.field_34951 != 1) {
            for (int var3 = this.field_34954; var3 < class_9035.method_41470(this.field_34952); var3 += this.field_34955) {
               class_9035.method_41463(this.field_34952).method_15022(this.field_34956, var3 * class_9035.method_41431(this.field_34952), this.field_34953);
            }
         } else {
            for (int var4 = this.field_34954; var4 < class_9035.method_41470(this.field_34952); var4 += this.field_34955) {
               class_9035.method_41463(this.field_34952).method_15045(this.field_34956, var4 * class_9035.method_41431(this.field_34952));
            }
         }
      } else if (this.field_34951 != -1) {
         for (int var5 = this.field_34954; var5 < class_9035.method_41470(this.field_34952); var5 += this.field_34955) {
            class_9035.method_41463(this.field_34952).method_15035(this.field_34956, var5 * class_9035.method_41431(this.field_34952), this.field_34953);
         }
      } else {
         for (int var6 = this.field_34954; var6 < class_9035.method_41470(this.field_34952); var6 += this.field_34955) {
            class_9035.method_41463(this.field_34952).method_15029(this.field_34956, var6 * class_9035.method_41431(this.field_34952));
         }
      }
   }
}
