package mapped;

public enum Class2336 {
   field15971,
   field15972,
   field15973,
   field15974,
   field15975,
   field15976;

   private static final Class2336[] field15977 = new Class2336[]{field15971, field15972, field15973, field15974, field15975, field15976};

   public Class3614 method9105(String var1) {
      switch (Class8147.field35045[this.ordinal()]) {
         case 1:
            return new Class3617(var1);
         case 2:
            return new Class3617(var1);
         case 3:
            return new Class3620(var1);
         case 4:
            return new Class3619(var1);
         case 5:
            return new Class3618(var1);
         case 6:
            return new Class3613(var1);
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   public void method9106(Class1878 var1, Class3614 var2) {
      switch (Class8147.field35045[this.ordinal()]) {
         case 1:
            this.method9107((Class1876)var1, (Class3617)var2);
            return;
         case 2:
            this.method9108((Class1884)var1, (Class3617)var2);
            return;
         case 3:
            this.method9109((Class1884)var1, (Class3620)var2);
            return;
         case 4:
            this.method9110((Class1879)var1, (Class3619)var2);
            return;
         case 5:
            this.method9111((Class1879)var1, (Class3618)var2);
            return;
         case 6:
            this.method9112((Class1879)var1, (Class3613)var2);
            return;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   private void method9107(Class1876 var1, Class3617 var2) {
      boolean var5 = var1.method8137();
      int var6 = !var5 ? 0 : 1;
      var2.method12251(var6);
   }

   private void method9108(Class1884 var1, Class3617 var2) {
      int var5 = (int)var1.method8142();
      var2.method12251(var5);
   }

   private void method9109(Class1884 var1, Class3620 var2) {
      float var5 = var1.method8142();
      var2.method12257(var5);
   }

   private void method9110(Class1879 var1, Class3619 var2) {
      float[] var5 = var1.method8140();
      if (var5.length == 2) {
         var2.method12255(var5[0], var5[1]);
      } else {
         throw new RuntimeException("Value length is not 2, length: " + var5.length);
      }
   }

   private void method9111(Class1879 var1, Class3618 var2) {
      float[] var5 = var1.method8140();
      if (var5.length == 3) {
         var2.method12253(var5[0], var5[1], var5[2]);
      } else {
         throw new RuntimeException("Value length is not 3, length: " + var5.length);
      }
   }

   private void method9112(Class1879 var1, Class3613 var2) {
      float[] var5 = var1.method8140();
      if (var5.length == 4) {
         var2.method12233(var5[0], var5[1], var5[2], var5[3]);
      } else {
         throw new RuntimeException("Value length is not 4, length: " + var5.length);
      }
   }

   public boolean method9113(Class2118 var1) {
      switch (Class8147.field35045[this.ordinal()]) {
         case 1:
            return var1 == Class2118.field13805;
         case 2:
            return var1 == Class2118.field13803;
         case 3:
            return var1 == Class2118.field13803;
         case 4:
         case 5:
         case 6:
            return var1 == Class2118.field13804;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   public static Class2336 method9114(String var0) {
      Class2336[] var3 = values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Class2336 var5 = var3[var4];
         if (var5.name().toLowerCase().equals(var0)) {
            return var5;
         }
      }

      return null;
   }
}
