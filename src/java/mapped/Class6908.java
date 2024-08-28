package mapped;

import java.util.List;

public class Class6908 extends Class6904 {
   private static String[] field29906;

   public Class6908(Class6380 var1) {
      super(var1, Class6054.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      if (var3.method31150().method8207() <= 4) {
         var3.method31151(Class1954.method8213(var3.method31150().method8207()));
      } else {
         var3.method31151(Class1954.method8213(var3.method31150().method8207() + 1));
      }

      if (var3.method31148() == 2) {
         var3.method31151(Class1954.field12713);
         if (var3.method31152() != null && !((String)var3.method31152()).isEmpty()) {
            var3.method31154(Class2980.method11394((String)var3.method31152()));
         } else {
            var3.method31154(null);
         }
      }

      if (var2 == Class1866.field10106 && var3.method31148() == 12) {
         int var8 = (Integer)var3.method31152();
         int var9 = var8 & 4095;
         int var10 = var8 >> 12 & 15;
         var3.method31154(var9 << 4 | var10 & 15);
      }

      if (var3.method31150() != Class1954.field12714) {
         if (var3.method31150() == Class1954.field12721) {
            var3.method31154(Class7795.method25886((Integer)var3.method31152()));
         }
      } else {
         var3.method31151(Class1954.field12714);
         Class9687.method37923((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var2 == Class1866.field10082 && var3.method31148() == 17) {
            var3.method31154(15 - (Integer)var3.method31152());
         }

         if (var2.method8128(Class1866.field10125) && var3.method31148() > 14) {
            var3.method31149(var3.method31148() + 1);
         }

         if (var2.method8128(Class1866.field10161) && var3.method31148() == 9) {
            int var14 = (Integer)var3.method31152();
            int var16 = (var14 & 4095) << 4 | var14 >> 12 & 15;
            int var18 = Class7795.method25886(var16);
            var3.method31154(var18);
         }

         if (var2 == Class1866.field10051) {
            if (var3.method31148() == 9) {
               int var15 = (Integer)var3.method31152();
               Class8656 var17 = this.method21107(10, var4);
               Class8656 var19 = this.method21107(11, var4);
               int var11 = var17 == null ? 0 : (Integer)var17.method31152();
               int var12 = var19 == null ? 0 : (Integer)var19.method31152();
               Class8600 var13 = Class6966.method21489(var15, new Integer[]{var11, var12});
               if (var13 != null && var13.method30771() != -1) {
                  var4.add(new Class8656(9, Class1954.field12723, var13));
               }
            }

            if (var3.method31148() >= 9) {
               var4.remove(var3);
            }
         }

         if (var3.method31148() == 0) {
            var3.method31154((byte)((Byte)var3.method31152() & -17));
         }
      }
   }

   @Override
   public int method21106(int var1) {
      return Class9409.method36042(var1);
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class8753.method31579(var1, false);
   }

   @Override
   public Class1867 method21105(int var1) {
      return Class8753.method31579(var1, true);
   }
}
