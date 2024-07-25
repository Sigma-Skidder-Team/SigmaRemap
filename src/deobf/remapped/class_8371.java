package remapped;

public class class_8371 implements Runnable {
   private static String[] field_42855;

   public class_8371(class_9035 var1, long var2, int var4, int var5, int var6, class_1702 var7, boolean var8) {
      this.field_42859 = var1;
      this.field_42858 = var2;
      this.field_42857 = var4;
      this.field_42860 = var5;
      this.field_42856 = var6;
      this.field_42862 = var7;
      this.field_42861 = var8;
   }

   @Override
   public void run() {
      if (this.field_42858 != 0L) {
         if (this.field_42857 != 1) {
            for (long var3 = (long)this.field_42860; var3 < class_9035.method_41453(this.field_42859); var3 += (long)this.field_42856) {
               class_9035.method_41463(this.field_42859).method_15020(this.field_42862, var3 * class_9035.method_41456(this.field_42859), this.field_42861);
            }
         } else {
            for (long var5 = (long)this.field_42860; var5 < class_9035.method_41453(this.field_42859); var5 += (long)this.field_42856) {
               class_9035.method_41463(this.field_42859).method_15043(this.field_42862, var5 * class_9035.method_41456(this.field_42859));
            }
         }
      } else if (this.field_42857 != -1) {
         for (long var6 = (long)this.field_42860; var6 < class_9035.method_41453(this.field_42859); var6 += (long)this.field_42856) {
            class_9035.method_41463(this.field_42859).method_15033(this.field_42862, var6 * class_9035.method_41456(this.field_42859), this.field_42861);
         }
      } else {
         for (long var7 = (long)this.field_42860; var7 < class_9035.method_41453(this.field_42859); var7 += (long)this.field_42856) {
            class_9035.method_41463(this.field_42859).method_15027(this.field_42862, var7 * class_9035.method_41456(this.field_42859));
         }
      }
   }
}
