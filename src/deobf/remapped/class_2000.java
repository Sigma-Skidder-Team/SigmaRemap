package remapped;

public class class_2000 implements Runnable {
   private static String[] field_10160;

   public class_2000(class_9035 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_10159 = var1;
      this.field_10158 = var2;
      this.field_10157 = var4;
      this.field_10156 = var5;
      this.field_10162 = var7;
      this.field_10161 = var8;
      this.field_10155 = var9;
   }

   @Override
   public void run() {
      if (this.field_10158 != 0L) {
         if (this.field_10157 != 1) {
            for (long var3 = this.field_10156; var3 < class_9035.method_41453(this.field_10159); var3 += (long)this.field_10162) {
               class_9035.method_41463(this.field_10159).method_14990(this.field_10161, var3 * class_9035.method_41456(this.field_10159), this.field_10155);
            }
         } else {
            for (long var5 = this.field_10156; var5 < class_9035.method_41453(this.field_10159); var5 += (long)this.field_10162) {
               class_9035.method_41463(this.field_10159).method_15043(this.field_10161, var5 * class_9035.method_41456(this.field_10159));
            }
         }
      } else if (this.field_10157 != -1) {
         for (long var6 = this.field_10156; var6 < class_9035.method_41453(this.field_10159); var6 += (long)this.field_10162) {
            class_9035.method_41463(this.field_10159).method_15033(this.field_10161, var6 * class_9035.method_41456(this.field_10159), this.field_10155);
         }
      } else {
         for (long var7 = this.field_10156; var7 < class_9035.method_41453(this.field_10159); var7 += (long)this.field_10162) {
            class_9035.method_41463(this.field_10159).method_15027(this.field_10161, var7 * class_9035.method_41456(this.field_10159));
         }
      }
   }
}
