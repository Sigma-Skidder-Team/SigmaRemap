package mapped;



public class Class6516 implements Class6515 {
   private Class1955 field28551 = Class1955.field12729;
   private Class1955 field28552 = Class1955.field12728;
   private Class2288 field28553 = Class2288.field15218;
   private Class188 field28554 = Class188.field704;
   private boolean field28555 = false;
   private boolean field28556;
   private int field28557;
   private boolean field28558;
   private boolean field28559 = false;
   private boolean field28560 = false;
   private boolean field28561 = true;
   private boolean field28562 = false;
   private boolean field28563 = false;
   private boolean field28564 = false;

   private Class6516() {
   }

   public Class188 method19733() {
      return this.field28554;
   }

   public void method19734(Class188 var1) {
      this.field28554 = var1;
   }

   public int method19735() {
      return this.field28557;
   }

   public void method19736(int var1) {
      this.field28557 = var1;
   }

   public boolean method19737() {
      return this.field28556;
   }

   public void method19738(boolean var1) {
      this.field28556 = var1;
   }

   public Class1955 method19739() {
      return this.field28552;
   }

   public void method19740(Class1955 var1) {
      this.field28552 = var1;
   }

   public int method19741() {
      return !this.field28555 ? 1024 : 960;
   }

   public boolean method19742() {
      return this.field28555;
   }

   public void method19743(boolean var1) {
      this.field28555 = var1;
   }

   public Class1955 method19744() {
      return this.field28551;
   }

   public void method19745(Class1955 var1) {
      this.field28551 = var1;
   }

   public Class2288 method19746() {
      return this.field28553;
   }

   public void method19747(Class2288 var1) {
      this.field28553 = var1;
   }

   public boolean method19748() {
      return this.field28559;
   }

   public boolean method19749() {
      return this.field28560;
   }

   public boolean method19750() {
      return this.field28561;
   }

   public void method19751(boolean var1) {
      this.field28561 = var1;
   }

   public boolean method19752() {
      return this.field28563;
   }

   public boolean method19753() {
      return this.field28562;
   }

   public boolean method19754() {
      return this.field28564;
   }

   public static Class6516 method19755(byte[] var0) throws AACException {
      Class9189 var3 = new Class9189(var0);
      Class6516 var4 = new Class6516();

      Class6516 var11;
      try {
         var4.field28551 = method19756(var3);
         int var5 = var3.method34397(4);
         if (var5 == 15) {
            var4.field28553 = Class2288.method9031(var3.method34397(24));
         } else {
            var4.field28553 = Class2288.method9030(var5);
         }

         var4.field28554 = Class188.method574(var3.method34397(4));
         switch (Class9833.field45925[var4.field28551.ordinal()]) {
            case 1:
               var4.field28552 = var4.field28551;
               var4.field28559 = true;
               var5 = var3.method34397(4);
               var4.field28560 = var4.field28553.method9032() == var5;
               var4.field28553 = Class2288.method9030(var5);
               var4.field28551 = method19756(var3);
               break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
               var4.field28555 = var3.method34399();
               if (var4.field28555) {
                  throw new AACException("config uses 960-sample frames, not yet supported");
               }

               var4.field28556 = var3.method34399();
               if (var4.field28556) {
                  var4.field28557 = var3.method34397(14);
               } else {
                  var4.field28557 = 0;
               }

               var4.field28558 = var3.method34399();
               if (var4.field28558) {
                  if (var4.field28551.method8218()) {
                     var4.field28562 = var3.method34399();
                     var4.field28563 = var3.method34399();
                     var4.field28564 = var3.method34399();
                  }

                  var3.method34403();
               }

               if (var4.field28554 == Class188.field705) {
                  var3.method34402(3);
                  Class6525 var6 = new Class6525();
                  var6.method19782(var3);
                  var4.field28551 = var6.method19784();
                  var4.field28553 = var6.method19785();
                  var4.field28554 = Class188.method574(var6.method19786());
               }

               if (var3.method34395() > 10) {
                  method19757(var3, var4);
               }
               break;
            default:
               throw new AACException("profile not supported: " + var4.field28551.method8215());
         }

         var11 = var4;
      } finally {
         var3.method34390();
      }

      return var11;
   }

   private static Class1955 method19756(Class9189 var0) throws AACException {
      int var3 = var0.method34397(5);
      if (var3 == 31) {
         var3 = 32 + var0.method34397(6);
      }

      return Class1955.method8214(var3);
   }

   private static void method19757(Class9189 var0, Class6516 var1) throws AACException {
      int var4 = var0.method34397(11);
      switch (var4) {
         case 695:
            Class1955 var5 = Class1955.method8214(var0.method34397(5));
            if (var5.equals(Class1955.field12733)) {
               var1.field28559 = var0.method34399();
               if (var1.field28559) {
                  var1.field28551 = var5;
                  int var6 = var0.method34397(4);
                  if (var6 == var1.field28553.method9032()) {
                     var1.field28560 = true;
                  }

                  if (var6 == 15) {
                     throw new AACException("sample rate specified explicitly, not supported yet!");
                  }
               }
            }
      }
   }
}
