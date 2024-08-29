package mapped;

public final class Class9447 {
   private static String[] field43895;
   private final TutorialToast field43896;
   private final int field43897;
   private int field43898;

   public Class9447(TutorialToast var1, int var2) {
      this.field43896 = var1;
      this.field43897 = var2;
   }

   private boolean method36324() {
      this.field43896.method24896(Math.min((float)(++this.field43898) / (float)this.field43897, 1.0F));
      if (this.field43898 <= this.field43897) {
         return false;
      } else {
         this.field43896.method24895();
         return true;
      }
   }

   // $VF: synthetic method
   public static boolean method36325(Class9447 var0) {
      return var0.method36324();
   }

   // $VF: synthetic method
   public static TutorialToast method36326(Class9447 var0) {
      return var0.field43896;
   }
}
