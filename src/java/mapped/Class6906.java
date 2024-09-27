package mapped;

import java.util.List;
import java.util.Optional;

public class Class6906 extends BitchNiggerPlane2 {
   public Class6906(Class6386 var1) {
      super(var1, Class6055.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) {
      if (var3.method31152() instanceof Class9738) {
         Class7922.method26589((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var2.method8127(Class1868.field10239) || var2.method8127(Class1868.field10238)) {
            int var8 = var3.method31148();
            if (var8 == 12) {
               var3.method31151(Class1950.field12636);
               boolean var9 = ((Byte)var3.method31152() & 2) == 2;
               var3.method31154(var9);
            }
         }

         if (var2.method8128(Class1868.field10216)) {
            int var15 = var3.method31148();
            if (var15 == 12) {
               var4.remove(var3);
            }

            if (var15 == 13) {
               var3.method31149(12);
            }
         }

         if (var2.method8128(Class1868.field10222)) {
            if (var2.method8126(Class1868.field10222, Class1868.field10223) && var3.method31148() == 14) {
               var4.remove(var3);
            } else if (var3.method31148() == 15) {
               var3.method31149(14);
            } else if (var3.method31148() == 14) {
               var3.method31149(15);
            }
         }

         if (var2.method8128(Class1868.field10251)) {
            int var16 = var3.method31148();
            if (var16 == 14) {
               var4.remove(var3);
            }

            if (var16 == 16) {
               var3.method31149(14);
            }

            if (var16 == 17) {
               var3.method31149(16);
            }

            if (!var2.method8127(Class1868.field10252) && (var3.method31148() == 15 || var3.method31148() == 16)) {
               var4.remove(var3);
            }

            if (var2.method8126(Class1868.field10256, Class1868.field10257) && var3.method31148() == 13) {
               if (((Byte)var3.method31152() & 8) == 8) {
                  var4.add(new Class8656(15, Class1950.field12636, true));
               } else {
                  var4.add(new Class8656(15, Class1950.field12636, false));
               }
            }
         }

         if (var2.method8127(Class1868.field10202) && ViaVersion3.method27612().method21896()) {
            Class8656 var17 = this.method21107(11, var4);
            Class8656 var18 = this.method21107(2, var4);
            Class8656 var10 = this.method21107(3, var4);
            if (var3.method31148() == 0 && var17 != null && var18 != null && var10 != null) {
               byte var11 = (Byte)var3.method31152();
               if ((var11 & 32) == 32 && ((Byte)var17.method31152() & 1) == 1 && !((String)var18.method31152()).isEmpty() && (Boolean)var10.method31152()) {
                  Class6055 var12 = var5.<Class6055>method22438(Class6055.class);
                  if (!var12.method18741(var1)) {
                     var12.method18740(var1);

                     try {
                        Class8563 var13 = new Class8563(37, null, var5);
                        var13.method30560(BruhMotha.field22544, var1);
                        var13.method30560(BruhMotha.field22534, (short)0);
                        var13.method30560(BruhMotha.field22534, (short)((int)(128.0 * -ViaVersion3.method27612().method21900() * 32.0)));
                        var13.method30560(BruhMotha.field22534, (short)0);
                        var13.method30560(BruhMotha.field22524, true);
                        var13.method30570(Class6386.class);
                     } catch (Exception var14) {
                        var14.printStackTrace();
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class9185.method34362(var1, false);
   }

   @Override
   public Class1867 method21105(int var1) {
      return Class9185.method34362(var1, true);
   }

   public static Class1868 method21112(int var0, List<Class8656> var1) {
      Optional var4 = Class1868.method8129(var0);
      if (!var4.isPresent()) {
         ViaVersion3.getInstance().method34423().getLogger().severe("Error: could not find Entity type " + var0 + " with metadata: " + var1);
         return null;
      } else {
         Class1868 var5 = (Class1868)var4.get();

         try {
            if (var5.method8127(Class1868.field10238)) {
               Optional var6 = method21113(var1, 12);
               if (var6.isPresent() && ((Byte)((Class8656)var6.get()).method31152() & 4) == 4) {
                  return Class1868.field10239;
               }
            }

            if (var5.method8127(Class1868.field10217)) {
               Optional var9 = method21113(var1, 12);
               if (var9.isPresent()) {
                  if ((Integer)((Class8656)var9.get()).method31152() == 1) {
                     return Class1868.field10218;
                  }

                  if ((Integer)((Class8656)var9.get()).method31152() == 2) {
                     return Class1868.field10219;
                  }
               }
            }

            if (var5.method8127(Class1868.field10222)) {
               Optional var10 = method21113(var1, 13);
               if (var10.isPresent()) {
                  int var7 = (Integer)((Class8656)var10.get()).method31152();
                  if (var7 > 0 && var7 < 6) {
                     var1.add(new Class8656(16, Class1950.field12631, var7 - 1));
                     return Class1868.field10224;
                  }

                  if (var7 == 6) {
                     return Class1868.field10223;
                  }
               }
            }

            if (var5.method8127(Class1868.field10252)) {
               Optional var11 = method21113(var1, 14);
               if (var11.isPresent()) {
                  if ((Integer)((Class8656)var11.get()).method31152() == 0) {
                     return Class1868.field10252;
                  }

                  if ((Integer)((Class8656)var11.get()).method31152() == 1) {
                     return Class1868.field10256;
                  }

                  if ((Integer)((Class8656)var11.get()).method31152() == 2) {
                     return Class1868.field10257;
                  }

                  if ((Integer)((Class8656)var11.get()).method31152() == 3) {
                     return Class1868.field10254;
                  }

                  if ((Integer)((Class8656)var11.get()).method31152() == 4) {
                     return Class1868.field10253;
                  }
               }
            }
         } catch (Exception var8) {
            if (!ViaVersion3.method27612().method21894() || ViaVersion3.getInstance().method34425()) {
               ViaVersion3.method27613().getLogger().warning("An error occurred with entity type rewriter");
               ViaVersion3.method27613().getLogger().warning("Metadata: " + var1);
               var8.printStackTrace();
            }
         }

         return var5;
      }
   }

   public static Optional<Class8656> method21113(List<Class8656> var0, int var1) {
      for (Class8656 var5 : var0) {
         if (var5.method31148() == var1) {
            return Optional.<Class8656>of(var5);
         }
      }

      return Optional.<Class8656>empty();
   }
}
