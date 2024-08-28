package mapped;

public class Class8639 {
   private static String[] field38889;
   public long field38890 = 0L;
   public long field38891 = 0L;

   public void method31034() {
      if (Class8578.field38573 && this.field38890 == 0L) {
         this.field38890 = System.nanoTime();
      }
   }

   public void method31035() {
      if (Class8578.field38573 && this.field38890 != 0L) {
         this.field38891 = this.field38891 + (System.nanoTime() - this.field38890);
         this.field38890 = 0L;
      }
   }

   private void method31036() {
      this.field38891 = 0L;
      this.field38890 = 0L;
   }

   // $VF: synthetic method
   public static void method31037(Class8639 var0) {
      var0.method31036();
   }
}
