package mapped;

public class Class2440 implements Class2439 {
   private static String[] field16483;
   private static final Class2386 field16484 = new Class2386();
   private Class6748 field16485;
   private Class7870 field16486;
   private Class7870 field16487;
   private Class6710 field16488;
   private Class6709 field16489;
   private Class6707 field16490;
   private int field16491;
   private int field16492;
   private Class6625 field16493 = new Class6625();
   private Class2386 field16494;
   private boolean field16495;

   public Class2440() {
      this(null);
   }

   public Class2440(Class2386 var1) {
      if (var1 == null) {
         var1 = field16484;
      }

      this.field16494 = var1;
      Class6625 var4 = this.field16494.method9725();
      if (var4 != null) {
         this.field16493.method20194(var4);
      }
   }

   public static Class2386 method10421() {
      return (Class2386)field16484.clone();
   }

   public void method10422(Class6625 var1) {
      if (var1 == null) {
         var1 = Class6625.field29147;
      }

      this.field16493.method20194(var1);
      float[] var4 = this.field16493.method20200();
      if (this.field16486 != null) {
         this.field16486.method26363(var4);
      }

      if (this.field16487 != null) {
         this.field16487.method26363(var4);
      }
   }

   public Class6748 method10423(Class7413 var1, Class2443 var2) throws Class2438 {
      if (!this.field16495) {
         this.method10431(var1);
      }

      int var5 = var1.method23662();
      this.field16485.method20569();
      Class6708 var6 = this.method10430(var1, var2, var5);
      var6.method20448();
      this.field16485.method20567(1);
      return this.field16485;
   }

   public void method10424(Class6748 var1) {
      this.field16485 = var1;
   }

   public int method10425() {
      return this.field16491;
   }

   public int method10426() {
      return this.field16492;
   }

   public int method10427() {
      return 2304;
   }

   public Class2438 method10428(int var1) {
      return new Class2438(var1, null);
   }

   public Class2438 method10429(int var1, Throwable var2) {
      return new Class2438(var1, var2);
   }

   public Class6708 method10430(Class7413 var1, Class2443 var2, int var3) throws Class2438 {
      Object var6 = null;
      switch (var3) {
         case 1:
            if (this.field16490 == null) {
               this.field16490 = new Class6707();
               this.field16490.method20447(var2, var1, this.field16486, this.field16487, this.field16485, 0);
            }

            var6 = this.field16490;
            break;
         case 2:
            if (this.field16489 == null) {
               this.field16489 = new Class6709();
               this.field16489.method20447(var2, var1, this.field16486, this.field16487, this.field16485, 0);
            }

            var6 = this.field16489;
            break;
         case 3:
            if (this.field16488 == null) {
               this.field16488 = new Class6710(var2, var1, this.field16486, this.field16487, this.field16485, 0);
            }

            var6 = this.field16488;
      }

      if (var6 == null) {
         throw this.method10429(513, null);
      } else {
         return (Class6708)var6;
      }
   }

   private void method10431(Class7413 var1) throws Class2438 {
      float var4 = 32700.0F;
      int var5 = var1.method23666();
      int var6 = var1.method23662();
      int var7 = var5 != 3 ? 2 : 1;
      if (this.field16485 == null) {
         this.field16485 = new Class6747(var1.method23665(), var7);
      }

      float[] var8 = this.field16493.method20200();
      this.field16486 = new Class7870(0, var4, var8);
      if (var7 == 2) {
         this.field16487 = new Class7870(1, var4, var8);
      }

      this.field16492 = var7;
      this.field16491 = var1.method23665();
      this.field16495 = true;
   }
}
