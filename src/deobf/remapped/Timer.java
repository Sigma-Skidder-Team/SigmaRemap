package remapped;

public class Timer {
   private static String[] field_16060;
   private long field_16058 = 0L;
   private long field_16061 = 0L;
   private boolean field_16059 = false;

   public void method_14776() {
      this.field_16059 = true;
      this.field_16058 = System.currentTimeMillis();
   }

   public void method_14774() {
      this.field_16059 = false;
   }

   public void method_14773() {
      this.field_16061 = 0L;
      this.field_16058 = System.currentTimeMillis();
   }

   public long method_14772() {
      if (this.field_16059) {
         this.field_16061 = this.field_16061 + (System.currentTimeMillis() - this.field_16058);
         this.field_16058 = System.currentTimeMillis();
      }

      return this.field_16061;
   }

   public void method_14777(long var1) {
      this.field_16058 = System.currentTimeMillis() - var1;
      this.field_16061 = var1;
   }

   public boolean method_14771() {
      return this.field_16059;
   }
}
