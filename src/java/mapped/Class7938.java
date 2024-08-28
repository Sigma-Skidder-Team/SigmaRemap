package mapped;

public abstract class Class7938 {
   private static final Class113[] field34036 = Class113.values();
   public final int field34037;
   public final int field34038;
   public final int field34039;

   public Class7938(int var1, int var2, int var3) {
      this.field34037 = var1;
      this.field34038 = var2;
      this.field34039 = var3;
   }

   public boolean method26728(Class2321 var1, int var2, int var3, int var4) {
      return this.method26729(
         var1.method9098(var2, var3, var4, Class113.field413),
         var1.method9098(var2, var3, var4, Class113.field414),
         var1.method9098(var2, var3, var4, Class113.field415)
      );
   }

   public boolean method26729(int var1, int var2, int var3) {
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         return var1 < this.field34037 && var2 < this.field34038 && var3 < this.field34039 ? this.method26717(var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   public boolean method26730(Class2321 var1, int var2, int var3, int var4) {
      return this.method26717(
         var1.method9098(var2, var3, var4, Class113.field413),
         var1.method9098(var2, var3, var4, Class113.field414),
         var1.method9098(var2, var3, var4, Class113.field415)
      );
   }

   public abstract boolean method26717(int var1, int var2, int var3);

   public abstract void method26718(int var1, int var2, int var3, boolean var4, boolean var5);

   public boolean method26719() {
      for (Class113 var6 : field34036) {
         if (this.method26720(var6) >= this.method26721(var6)) {
            return true;
         }
      }

      return false;
   }

   public abstract int method26720(Class113 var1);

   public abstract int method26721(Class113 var1);

   public int method26731(Class113 var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         Class113 var6 = Class2321.field15905.method9099(var1);
         Class113 var7 = Class2321.field15906.method9099(var1);
         if (var2 < this.method26732(var6) && var3 < this.method26732(var7)) {
            int var8 = this.method26732(var1);
            Class2321 var9 = Class2321.method9101(Class113.field413, var1);

            for (int var10 = var8 - 1; var10 >= 0; var10--) {
               if (this.method26730(var9, var10, var2, var3)) {
                  return var10 + 1;
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public int method26732(Class113 var1) {
      return var1.method327(this.field34037, this.field34038, this.field34039);
   }

   public int method26733() {
      return this.method26732(Class113.field413);
   }

   public int method26734() {
      return this.method26732(Class113.field414);
   }

   public int method26735() {
      return this.method26732(Class113.field415);
   }

   public void method26736(Class8859 var1, boolean var2) {
      this.method26737(var1, Class2321.field15904, var2);
      this.method26737(var1, Class2321.field15905, var2);
      this.method26737(var1, Class2321.field15906, var2);
   }

   private void method26737(Class8859 var1, Class2321 var2, boolean var3) {
      Class2321 var6 = var2.method9100();
      int var7 = this.method26732(var6.method9099(Class113.field413));
      int var8 = this.method26732(var6.method9099(Class113.field414));
      int var9 = this.method26732(var6.method9099(Class113.field415));

      for (int var10 = 0; var10 <= var7; var10++) {
         for (int var11 = 0; var11 <= var8; var11++) {
            int var12 = -1;

            for (int var13 = 0; var13 <= var9; var13++) {
               int var14 = 0;
               int var15 = 0;

               for (int var16 = 0; var16 <= 1; var16++) {
                  for (int var17 = 0; var17 <= 1; var17++) {
                     if (this.method26728(var6, var10 + var16 - 1, var11 + var17 - 1, var13)) {
                        var14++;
                        var15 ^= var16 ^ var17;
                     }
                  }
               }

               if (var14 == 1 || var14 == 3 || var14 == 2 && (var15 & 1) == 0) {
                  if (!var3) {
                     var1.method32250(
                        var6.method9098(var10, var11, var13, Class113.field413),
                        var6.method9098(var10, var11, var13, Class113.field414),
                        var6.method9098(var10, var11, var13, Class113.field415),
                        var6.method9098(var10, var11, var13 + 1, Class113.field413),
                        var6.method9098(var10, var11, var13 + 1, Class113.field414),
                        var6.method9098(var10, var11, var13 + 1, Class113.field415)
                     );
                  } else if (var12 == -1) {
                     var12 = var13;
                  }
               } else if (var12 != -1) {
                  var1.method32250(
                     var6.method9098(var10, var11, var12, Class113.field413),
                     var6.method9098(var10, var11, var12, Class113.field414),
                     var6.method9098(var10, var11, var12, Class113.field415),
                     var6.method9098(var10, var11, var13, Class113.field413),
                     var6.method9098(var10, var11, var13, Class113.field414),
                     var6.method9098(var10, var11, var13, Class113.field415)
                  );
                  var12 = -1;
               }
            }
         }
      }
   }

   public boolean method26722(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var2; var7++) {
         if (!this.method26729(var3, var4, var7)) {
            return false;
         }
      }

      return true;
   }

   public void method26723(int var1, int var2, int var3, int var4, boolean var5) {
      for (int var8 = var1; var8 < var2; var8++) {
         this.method26718(var3, var4, var8, false, var5);
      }
   }

   public boolean method26738(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var1; var8 < var2; var8++) {
         if (!this.method26722(var3, var4, var8, var5)) {
            return false;
         }
      }

      return true;
   }

   public void method26739(Class8859 var1, boolean var2) {
      Class7937 var5 = new Class7937(this);

      for (int var6 = 0; var6 <= this.field34037; var6++) {
         for (int var7 = 0; var7 <= this.field34038; var7++) {
            int var8 = -1;

            for (int var9 = 0; var9 <= this.field34039; var9++) {
               if (var5.method26729(var6, var7, var9)) {
                  if (!var2) {
                     var1.method32250(var6, var7, var9, var6 + 1, var7 + 1, var9 + 1);
                  } else if (var8 == -1) {
                     var8 = var9;
                  }
               } else if (var8 != -1) {
                  int var10 = var6;
                  int var11 = var6;
                  int var12 = var7;
                  int var13 = var7;
                  var5.method26723(var8, var9, var6, var7, false);

                  while (var5.method26722(var8, var9, var10 - 1, var12)) {
                     var5.method26723(var8, var9, var10 - 1, var12, false);
                     var10--;
                  }

                  while (var5.method26722(var8, var9, var11 + 1, var12)) {
                     var5.method26723(var8, var9, var11 + 1, var12, false);
                     var11++;
                  }

                  while (var5.method26738(var10, var11 + 1, var8, var9, var12 - 1)) {
                     for (int var14 = var10; var14 <= var11; var14++) {
                        var5.method26723(var8, var9, var14, var12 - 1, false);
                     }

                     var12--;
                  }

                  while (var5.method26738(var10, var11 + 1, var8, var9, var13 + 1)) {
                     for (int var15 = var10; var15 <= var11; var15++) {
                        var5.method26723(var8, var9, var15, var13 + 1, false);
                     }

                     var13++;
                  }

                  var1.method32250(var10, var12, var8, var11 + 1, var13 + 1, var9);
                  var8 = -1;
               }
            }
         }
      }
   }

   public void method26740(Class9841 var1) {
      this.method26741(var1, Class2321.field15904);
      this.method26741(var1, Class2321.field15905);
      this.method26741(var1, Class2321.field15906);
   }

   private void method26741(Class9841 var1, Class2321 var2) {
      Class2321 var5 = var2.method9100();
      Class113 var6 = var5.method9099(Class113.field415);
      int var7 = this.method26732(var5.method9099(Class113.field413));
      int var8 = this.method26732(var5.method9099(Class113.field414));
      int var9 = this.method26732(var6);
      Direction var10 = Direction.method550(var6, Class1892.field11093);
      Direction var11 = Direction.method550(var6, Class1892.field11092);

      for (int var12 = 0; var12 < var7; var12++) {
         for (int var13 = 0; var13 < var8; var13++) {
            boolean var14 = false;

            for (int var15 = 0; var15 <= var9; var15++) {
               boolean var16 = var15 != var9 && this.method26730(var5, var12, var13, var15);
               if (!var14 && var16) {
                  var1.method38895(
                     var10,
                     var5.method9098(var12, var13, var15, Class113.field413),
                     var5.method9098(var12, var13, var15, Class113.field414),
                     var5.method9098(var12, var13, var15, Class113.field415)
                  );
               }

               if (var14 && !var16) {
                  var1.method38895(
                     var11,
                     var5.method9098(var12, var13, var15 - 1, Class113.field413),
                     var5.method9098(var12, var13, var15 - 1, Class113.field414),
                     var5.method9098(var12, var13, var15 - 1, Class113.field415)
                  );
               }

               var14 = var16;
            }
         }
      }
   }
}
