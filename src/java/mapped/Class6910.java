package mapped;

import java.util.List;

public class Class6910 extends Class6904 {
   private static String[] field29908;

   public Class6910(Class6371 var1) {
      super(var1, Class6058.class);
      this.method21098(Class1866.values(), Class1873.class);
      this.method21100(Class1866.field10081, Class1873.field10775);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      var3.method31151(Class1953.method8212(var3.method31150().method8207()));
      Class6058 var8 = var5.<Class6058>method22438(Class6058.class);
      if (var3.method31150() != Class1953.field12691) {
         if (var3.method31150() == Class1953.field12698) {
            int var9 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var9));
         }
      } else {
         Class8770.method31635((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var3.method31148() > 5) {
            var3.method31149(var3.method31148() + 1);
         }

         if (var3.method31148() == 8 && var2.method8128(Class1873.field10753)) {
            float var12 = ((Number)var3.method31152()).floatValue();
            if (Float.isNaN(var12) && ViaVersion3.method27612().method21936()) {
               var3.method31154(1.0F);
            }
         }

         if (var3.method31148() > 11 && var2.method8128(Class1873.field10753)) {
            var3.method31149(var3.method31148() + 1);
         }

         if (var2.method8128(Class1873.field10756) && var3.method31148() == 13) {
            var8.method18773(var1, (byte)(((Number)var3.method31152()).byteValue() & -5 | var8.method18772(var1) & 4));
            var3.method31154(var8.method18772(var1));
         }

         if (!var2.method8128(Class1873.field10755)) {
            if (var2.method8128(Class1873.field10823)) {
               if (var3.method31148() != 16) {
                  if (var3.method31148() > 16) {
                     var3.method31149(var3.method31148() - 1);
                  }
               } else {
                  var8.method18773(var1, (byte)(var8.method18772(var1) & -5 | (!((Boolean) var3.method31152()) ? 0 : 4)));
                  var4.remove(var3);
                  var4.add(new Class8656(13, Class1953.field12685, var8.method18772(var1)));
               }
            }
         } else if (var1 != var8.method18670()) {
            if (var3.method31148() != 0) {
               if (var3.method31148() == 7) {
                  var8.method18778(var1, (((Number)var3.method31152()).byteValue() & 4) != 0);
               }
            } else {
               byte var13 = ((Number)var3.method31152()).byteValue();
               var8.method18780(var1, var13);
            }

            if (var3.method31148() == 0 || var3.method31148() == 7) {
               var4.add(new Class8656(6, Class1953.field12703, method21118(var1, var8)));
            }
         }

         if (!var2.method8128(Class1873.field10858)) {
            if (!var2.method8127(Class1873.field10786)) {
               if (!var2.method8127(Class1873.field10760)) {
                  if (!var2.method8127(Class1873.field10827)) {
                     if (!var2.method8128(Class1873.field10843)) {
                        if (!var2.method8127(Class1873.field10747)) {
                           if (!var2.method8128(Class1873.field10815)) {
                              if (var2.method8127(Class1873.field10741) && var3.method31148() == 10) {
                                 this.method21091((Class8600)var3.method31152());
                              }
                           } else if (var3.method31148() == 14) {
                              var8.method18773(var1, (byte)(var8.method18772(var1) & -5 | (!((Boolean) var3.method31152()) ? 0 : 4)));
                              var4.remove(var3);
                              var4.add(new Class8656(13, Class1953.field12685, var8.method18772(var1)));
                           }
                        } else if (var3.method31148() == 8) {
                           if (var3.method31152().equals(0)) {
                              var3.method31154(null);
                           }

                           var3.method31151(Class1953.field12702);
                        }
                     } else if (var3.method31148() >= 9) {
                        var3.method31149(var3.method31148() + 1);
                     }
                  } else if (var3.method31148() == 18) {
                     var3.method31154(new Class9207(2, method21116((Integer)var3.method31152()), 0));
                     var3.method31151(Class1953.field12701);
                  }
               } else if (var3.method31148() == 15) {
                  var3.method31154(new Class9207(2, method21116((Integer)var3.method31152()), 0));
                  var3.method31151(Class1953.field12701);
               }
            } else if (var3.method31148() == 18) {
               var4.remove(var3);
               int var14 = (Integer)var3.method31152();
               Class9738 var10 = null;
               if (var14 != 1) {
                  if (var14 != 2) {
                     if (var14 == 3) {
                        var10 = new Class9738(this.field29902.method19376().method18530(729), (byte)1, (short)0, null);
                     }
                  } else {
                     var10 = new Class9738(this.field29902.method19376().method18530(728), (byte)1, (short)0, null);
                  }
               } else {
                  var10 = new Class9738(this.field29902.method19376().method18530(727), (byte)1, (short)0, null);
               }

               Class8563 var11 = new Class8563(70, null, var5);
               var11.method30560(Class4750.field22544, var1);
               var11.method30560(Class4750.field22544, 4);
               var11.method30560(Class4750.field22569, var10);
               var11.method30570(Class6371.class);
            }
         } else if (var3.method31148() == 10) {
            int var15 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var15));
         }

         if (var2.method8128(Class1873.field10809) && var3.method31148() == 14) {
            var8.method18773(var1, (byte)(var8.method18772(var1) & -5 | (((Number)var3.method31152()).byteValue() == 0 ? 0 : 4)));
            var4.remove(var3);
            var4.add(new Class8656(13, Class1953.field12685, var8.method18772(var1)));
         }

         if ((var2.method8127(Class1873.field10806) || var2.method8127(Class1873.field10808) || var2.method8128(Class1873.field10809))
            && var3.method31148() >= 14) {
            var3.method31149(var3.method31148() + 1);
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class5990.method18583(var1);
   }

   private static boolean method21114(byte var0) {
      return false;
   }

   private static boolean method21115(byte var0) {
      return false;
   }

   private static int method21116(int var0) {
      switch (var0) {
         case 0:
            return 5;
         case 1:
            return 9;
         case 2:
            return 4;
         case 3:
            return 1;
         case 4:
            return 2;
         case 5:
            return 11;
         default:
            return 0;
      }
   }

   private static boolean method21117(int var0) {
      return false;
   }

   public static int method21118(int var0, Class6058 var1) {
      byte var4 = var1.method18779(var0);
      int var5 = 0;
      if (!method21117(var4)) {
         if (!var1.method18775(var0)) {
            if (!method21115(var4)) {
               if (!var1.method18777(var0)) {
                  if (method21114(var4)) {
                     var5 = 5;
                  }
               } else {
                  var5 = 4;
               }
            } else {
               var5 = 3;
            }
         } else {
            var5 = 2;
         }
      } else {
         var5 = 1;
      }

      return var5;
   }
}
