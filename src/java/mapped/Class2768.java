package mapped;

public class Class2768 extends Class2595 {
   private static String[] field17343;
   private int field17344;
   public final Class1110 field17345;

   public Class2768(Class1110 var1) {
      this.field17345 = var1;
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field17345.method4232();
      return var3 == null ? false : this.field17345.method3027(this.field17345.method4232(), Class8522.field38240);
   }

   @Override
   public void method10804() {
      this.field17344 = 10;
      Class1110.method5352(this.field17345, Class2143.field14028);
      this.method10963();
   }

   @Override
   public void method10807() {
      Class1110.method5350(
         this.field17345,
         this.field17345
            .field5024
            .method7006(Class101.field299, Class1110.method5349(this.field17345))
            .method8339(10 + Class1110.method5353(this.field17345).nextInt(20))
      );
   }

   @Override
   public void method10805() {
      if (Class1110.method5340(this.field17345) == Class2143.field14028) {
         this.field17344--;
         if (this.field17344 <= 0) {
            Class1110.method5352(this.field17345, Class2143.field14029);
            this.method10963();
            this.field17344 = (8 + Class1110.method5354(this.field17345).nextInt(4)) * 20;
            this.field17345.method2863(Class6067.field26923, 10.0F, 0.95F + Class1110.method5355(this.field17345).nextFloat() * 0.1F);
         }
      }
   }

   private void method10963() {
      Class1110.method5350(this.field17345, this.field17345.method4232().method3432().method8339(20 + Class1110.method5356(this.field17345).nextInt(20)));
      if (Class1110.method5349(this.field17345).getY() < this.field17345.field5024.method6776()) {
         Class1110.method5350(
            this.field17345,
            new BlockPos(
               Class1110.method5349(this.field17345).method8304(),
               this.field17345.field5024.method6776() + 1,
               Class1110.method5349(this.field17345).method8306()
            )
         );
      }
   }
}
