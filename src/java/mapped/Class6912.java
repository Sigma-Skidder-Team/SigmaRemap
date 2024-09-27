package mapped;

import java.util.List;
import java.util.UUID;

public class Class6912 extends BitchNiggerPlane2 {
   public Class6912(Class6363 var1) {
      super(var1, Class6057.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      Class2296 var8 = Class2296.method9061(var2, var3.method31148());
      if (var8 == null) {
         throw new Exception("Could not find valid metadata");
      } else if (var8.method9057() == Class1950.field12643) {
         var4.remove(var3);
      } else {
         var3.method31149(var8.method9056());
         var3.method31151(var8.method9057());
         Object var9 = var3.method31152();
         switch (Class8085.field34741[var8.method9057().ordinal()]) {
            case 1:
               if (var8.method9058() == Class1948.field12618) {
                  var3.method31154(var9);
               }

               if (var8.method9058() == Class1948.field12620) {
                  var3.method31154(((Integer)var9).byteValue());
               }

               if (var8 == Class2296.field15268 && var2 == Class1872.field10733) {
                  Byte var16 = (byte)0;
                  if (((Byte)var9 & 16) == 16) {
                     var16 = (byte)1;
                  }

                  int var17 = Class2296.field15290.method9056();
                  Class1950 var18 = Class2296.field15290.method9057();
                  var4.add(new Class8656(var17, var18, var16));
               }
               break;
            case 2:
               String var10 = (String)var9;
               UUID var11 = null;
               if (!var10.isEmpty()) {
                  try {
                     var11 = UUID.fromString(var10);
                  } catch (Exception var14) {
                  }
               }

               var3.method31154(var11);
               break;
            case 3:
               if (var8.method9058() == Class1948.field12618) {
                  var3.method31154(((Byte)var9).intValue());
               }

               if (var8.method9058() == Class1948.field12619) {
                  var3.method31154(((Short)var9).intValue());
               }

               if (var8.method9058() == Class1948.field12620) {
                  var3.method31154(var9);
               }
               break;
            case 4:
               var3.method31154(var9);
               break;
            case 5:
               var3.method31154(var9);
               break;
            case 6:
               if (var8 == Class2296.field15278) {
                  var3.method31154((Byte)var9 < 0);
               } else {
                  var3.method31154((Byte)var9 != 0);
               }
               break;
            case 7:
               var3.method31154(var9);
               Class8768.method31628((Class9738)var3.method31152());
               break;
            case 8:
               Class9691 var12 = (Class9691)var9;
               var3.method31154(var12);
               break;
            case 9:
               Class8665 var13 = (Class8665)var9;
               var3.method31154(var13);
               break;
            case 10:
               var9 = Class6363.method19381(var9.toString());
               var3.method31154(var9);
               break;
            case 11:
               var3.method31154(((Number)var9).intValue());
               break;
            default:
               var4.remove(var3);
               throw new Exception("Unhandled MetaDataType: " + var8.method9057());
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class8991.method33196(var1, false);
   }

   @Override
   public Class1867 method21105(int var1) {
      return Class8991.method33196(var1, true);
   }
}
