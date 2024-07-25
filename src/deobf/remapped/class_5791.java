package remapped;

public abstract class class_5791 {
   private static final class_9249[] field_29268 = class_9249.values();
   public final int field_29269;
   public final int field_29266;
   public final int field_29267;

   public class_5791(int var1, int var2, int var3) {
      this.field_29269 = var1;
      this.field_29266 = var2;
      this.field_29267 = var3;
   }

   public boolean method_26210(class_5587 var1, int var2, int var3, int var4) {
      return this.method_26204(
         var1.method_25384(var2, var3, var4, class_9249.field_47215),
         var1.method_25384(var2, var3, var4, class_9249.field_47216),
         var1.method_25384(var2, var3, var4, class_9249.field_47219)
      );
   }

   public boolean method_26204(int var1, int var2, int var3) {
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         return var1 < this.field_29269 && var2 < this.field_29266 && var3 < this.field_29267 ? this.method_26194(var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   public boolean method_26203(class_5587 var1, int var2, int var3, int var4) {
      return this.method_26194(
         var1.method_25384(var2, var3, var4, class_9249.field_47215),
         var1.method_25384(var2, var3, var4, class_9249.field_47216),
         var1.method_25384(var2, var3, var4, class_9249.field_47219)
      );
   }

   public abstract boolean method_26194(int var1, int var2, int var3);

   public abstract void method_26202(int var1, int var2, int var3, boolean var4, boolean var5);

   public boolean method_26192() {
      for (class_9249 var6 : field_29268) {
         if (this.method_26201(var6) >= this.method_26206(var6)) {
            return true;
         }
      }

      return false;
   }

   public abstract int method_26201(class_9249 var1);

   public abstract int method_26206(class_9249 var1);

   public int method_26205(class_9249 var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         class_9249 var6 = class_5587.field_28371.method_25382(var1);
         class_9249 var7 = class_5587.field_28368.method_25382(var1);
         if (var2 < this.method_26199(var6) && var3 < this.method_26199(var7)) {
            int var8 = this.method_26199(var1);
            class_5587 var9 = class_5587.method_25381(class_9249.field_47215, var1);

            for (int var10 = var8 - 1; var10 >= 0; var10--) {
               if (this.method_26203(var9, var10, var2, var3)) {
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

   public int method_26199(class_9249 var1) {
      return var1.method_42631(this.field_29269, this.field_29266, this.field_29267);
   }

   public int method_26209() {
      return this.method_26199(class_9249.field_47215);
   }

   public int method_26207() {
      return this.method_26199(class_9249.field_47216);
   }

   public int method_26196() {
      return this.method_26199(class_9249.field_47219);
   }

   public void method_26193(class_6145 var1, boolean var2) {
      this.method_26208(var1, class_5587.field_28370, var2);
      this.method_26208(var1, class_5587.field_28371, var2);
      this.method_26208(var1, class_5587.field_28368, var2);
   }

   private void method_26208(class_6145 var1, class_5587 var2, boolean var3) {
      class_5587 var6 = var2.method_25383();
      int var7 = this.method_26199(var6.method_25382(class_9249.field_47215));
      int var8 = this.method_26199(var6.method_25382(class_9249.field_47216));
      int var9 = this.method_26199(var6.method_25382(class_9249.field_47219));

      for (int var10 = 0; var10 <= var7; var10++) {
         for (int var11 = 0; var11 <= var8; var11++) {
            int var12 = -1;

            for (int var13 = 0; var13 <= var9; var13++) {
               int var14 = 0;
               int var15 = 0;

               for (int var16 = 0; var16 <= 1; var16++) {
                  for (int var17 = 0; var17 <= 1; var17++) {
                     if (this.method_26210(var6, var10 + var16 - 1, var11 + var17 - 1, var13)) {
                        var14++;
                        var15 ^= var16 ^ var17;
                     }
                  }
               }

               if (var14 == 1 || var14 == 3 || var14 == 2 && (var15 & 1) == 0) {
                  if (!var3) {
                     var1.method_28195(
                        var6.method_25384(var10, var11, var13, class_9249.field_47215),
                        var6.method_25384(var10, var11, var13, class_9249.field_47216),
                        var6.method_25384(var10, var11, var13, class_9249.field_47219),
                        var6.method_25384(var10, var11, var13 + 1, class_9249.field_47215),
                        var6.method_25384(var10, var11, var13 + 1, class_9249.field_47216),
                        var6.method_25384(var10, var11, var13 + 1, class_9249.field_47219)
                     );
                  } else if (var12 == -1) {
                     var12 = var13;
                  }
               } else if (var12 != -1) {
                  var1.method_28195(
                     var6.method_25384(var10, var11, var12, class_9249.field_47215),
                     var6.method_25384(var10, var11, var12, class_9249.field_47216),
                     var6.method_25384(var10, var11, var12, class_9249.field_47219),
                     var6.method_25384(var10, var11, var13, class_9249.field_47215),
                     var6.method_25384(var10, var11, var13, class_9249.field_47216),
                     var6.method_25384(var10, var11, var13, class_9249.field_47219)
                  );
                  var12 = -1;
               }
            }
         }
      }
   }

   public boolean method_26197(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var2; var7++) {
         if (!this.method_26204(var3, var4, var7)) {
            return false;
         }
      }

      return true;
   }

   public void method_26211(int var1, int var2, int var3, int var4, boolean var5) {
      for (int var8 = var1; var8 < var2; var8++) {
         this.method_26202(var3, var4, var8, false, var5);
      }
   }

   public boolean method_26198(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var1; var8 < var2; var8++) {
         if (!this.method_26197(var3, var4, var8, var5)) {
            return false;
         }
      }

      return true;
   }

   public void method_26212(class_6145 var1, boolean var2) {
      class_3087 var5 = new class_3087(this);

      for (int var6 = 0; var6 <= this.field_29269; var6++) {
         for (int var7 = 0; var7 <= this.field_29266; var7++) {
            int var8 = -1;

            for (int var9 = 0; var9 <= this.field_29267; var9++) {
               if (var5.method_26204(var6, var7, var9)) {
                  if (!var2) {
                     var1.method_28195(var6, var7, var9, var6 + 1, var7 + 1, var9 + 1);
                  } else if (var8 == -1) {
                     var8 = var9;
                  }
               } else if (var8 != -1) {
                  int var10 = var6;
                  int var11 = var6;
                  int var12 = var7;
                  int var13 = var7;
                  var5.method_26211(var8, var9, var6, var7, false);

                  while (var5.method_26197(var8, var9, var10 - 1, var12)) {
                     var5.method_26211(var8, var9, var10 - 1, var12, false);
                     var10--;
                  }

                  while (var5.method_26197(var8, var9, var11 + 1, var12)) {
                     var5.method_26211(var8, var9, var11 + 1, var12, false);
                     var11++;
                  }

                  while (var5.method_26198(var10, var11 + 1, var8, var9, var12 - 1)) {
                     for (int var14 = var10; var14 <= var11; var14++) {
                        var5.method_26211(var8, var9, var14, var12 - 1, false);
                     }

                     var12--;
                  }

                  while (var5.method_26198(var10, var11 + 1, var8, var9, var13 + 1)) {
                     for (int var15 = var10; var15 <= var11; var15++) {
                        var5.method_26211(var8, var9, var15, var13 + 1, false);
                     }

                     var13++;
                  }

                  var1.method_28195(var10, var12, var8, var11 + 1, var13 + 1, var9);
                  var8 = -1;
               }
            }
         }
      }
   }

   public void method_26195(class_9876 var1) {
      this.method_26200(var1, class_5587.field_28370);
      this.method_26200(var1, class_5587.field_28371);
      this.method_26200(var1, class_5587.field_28368);
   }

   private void method_26200(class_9876 var1, class_5587 var2) {
      class_5587 var5 = var2.method_25383();
      class_9249 var6 = var5.method_25382(class_9249.field_47219);
      int var7 = this.method_26199(var5.method_25382(class_9249.field_47215));
      int var8 = this.method_26199(var5.method_25382(class_9249.field_47216));
      int var9 = this.method_26199(var6);
      Direction var10 = Direction.method_1055(var6, class_137.field_403);
      Direction var11 = Direction.method_1055(var6, class_137.field_405);

      for (int var12 = 0; var12 < var7; var12++) {
         for (int var13 = 0; var13 < var8; var13++) {
            boolean var14 = false;

            for (int var15 = 0; var15 <= var9; var15++) {
               boolean var16 = var15 != var9 && this.method_26203(var5, var12, var13, var15);
               if (!var14 && var16) {
                  var1.method_45510(
                     var10,
                     var5.method_25384(var12, var13, var15, class_9249.field_47215),
                     var5.method_25384(var12, var13, var15, class_9249.field_47216),
                     var5.method_25384(var12, var13, var15, class_9249.field_47219)
                  );
               }

               if (var14 && !var16) {
                  var1.method_45510(
                     var11,
                     var5.method_25384(var12, var13, var15 - 1, class_9249.field_47215),
                     var5.method_25384(var12, var13, var15 - 1, class_9249.field_47216),
                     var5.method_25384(var12, var13, var15 - 1, class_9249.field_47219)
                  );
               }

               var14 = var16;
            }
         }
      }
   }
}
