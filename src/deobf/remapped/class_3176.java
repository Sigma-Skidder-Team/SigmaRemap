package remapped;

public class class_3176 implements Runnable {
   private static String[] field_15888;

   public class_3176(class_6816 var1, long var2, long var4, class_1702 var6, long var7, class_1702 var9) {
      this.field_15889 = var1;
      this.field_15887 = var2;
      this.field_15890 = var4;
      this.field_15886 = var6;
      this.field_15884 = var7;
      this.field_15885 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_15887; var3 < this.field_15890; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field_15886.method_36114(this.field_15884 + var3, this.field_15885.method_36107(var5) - this.field_15885.method_36107(var7));
         this.field_15886
            .method_36114(
               this.field_15884 + class_6816.method_31277(this.field_15889) - var3, this.field_15885.method_36107(var5) + this.field_15885.method_36107(var7)
            );
      }
   }
}
