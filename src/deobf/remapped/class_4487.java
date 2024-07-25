package remapped;

public enum class_4487 {
   field_21905("biome"),
   field_21904("biome_category"),
   field_21908("biome_precipitation"),
   field_21870("temperature"),
   field_21913("rainfall"),
   field_21895(class_6588.field_33940),
   field_21878(class_6588.field_33772),
   field_21869(class_6588.field_33918),
   field_21903(class_6588.field_33766),
   field_21916(class_6588.field_33870),
   field_21919(class_6588.field_33657),
   field_21889(class_6588.field_33663),
   field_21900(class_6588.field_33672),
   field_21884(class_6588.field_33878),
   field_21871(class_6588.field_33768),
   field_21879(class_6588.field_33858),
   field_21909(class_6588.field_33979),
   field_21875(class_6588.field_33815),
   field_21868(class_6588.field_33673),
   field_21914(class_6588.field_33921),
   field_21923(class_6588.field_33855),
   field_21886(class_6588.field_33674),
   field_21866(class_6588.field_33754),
   field_21899(class_6588.field_33683),
   field_21890(class_6588.field_33965),
   field_21918(class_6588.field_33958, new String[]{"x", "y"}),
   field_21912(class_6588.field_33708, new String[]{"x", "y"}),
   field_21865(class_6588.field_33607),
   field_21892(class_6588.field_33914),
   field_21881(class_6588.field_33925),
   field_21921(class_6588.field_33693),
   field_21907(class_6588.field_33789),
   field_21920(class_6588.field_33836),
   field_21880(class_6588.field_33632),
   field_21922(class_6588.field_33740, new String[]{"x", "y"}),
   field_21897(class_6588.field_33796),
   field_21894(class_6588.field_33703, new String[]{"x", "y", "z"}),
   field_21911(class_6588.field_33813, new String[]{"x", "y", "z"}),
   field_21917(class_6588.field_33752, new String[]{"x", "y", "z"}),
   field_21891(class_6588.field_33786, new String[]{"x", "y", "z"}),
   field_21906(class_6588.field_33820, new String[]{"x", "y", "z"}),
   field_21876(class_6588.field_33833, new String[]{"x", "y", "z"}),
   field_21902(class_6588.field_33891, new String[]{"r", "g", "b"}),
   field_21888(class_6588.field_33889, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21898(class_6588.field_33777, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21896(class_6588.field_33951, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21882(class_6588.field_33712, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21915(class_6588.field_33920, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21910(class_6588.field_33669, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21901(class_6588.field_33967, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21874(class_6588.field_33864, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21877(class_6588.field_33643, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   field_21885(class_6588.field_33686, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});

   private String field_21893;
   private class_6045 field_21887;
   private String[] field_21883;
   private String[] field_21873;

   private class_4487(String var3) {
      this.field_21893 = var3;
   }

   private class_4487(class_6045 var3) {
      this.field_21893 = var3.method_27605();
      this.field_21887 = var3;
      if (!method_20839(var3, class_2296.class, class_8800.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   private class_4487(class_6045 var3, String[] var4) {
      this.field_21893 = var3.method_27605();
      this.field_21887 = var3;
      this.field_21883 = var4;
      if (!method_20839(var3, class_7836.class, class_6894.class, class_6777.class, class_85.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   private class_4487(class_6045 var3, String[] var4, String[] var5) {
      this.field_21893 = var3.method_27605();
      this.field_21887 = var3;
      this.field_21883 = var4;
      this.field_21873 = var5;
      if (!method_20839(var3, class_4701.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   public String method_20843() {
      return this.field_21893;
   }

   public class_6045 method_20840() {
      return this.field_21887;
   }

   public String[] method_20837() {
      return this.field_21883;
   }

   public String[] method_20838() {
      return this.field_21873;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_20841(int var1, int var2) {
      if (this.field_21883 == null || var1 >= 0 && var1 <= this.field_21883.length) {
         if (this.field_21873 == null || var2 >= 0 && var2 <= this.field_21873.length) {
            switch (this) {
               case field_21905:
                  BlockPos var5 = class_6588.method_30293();
                  class_6325 var6 = class_6588.method_30215().method_22561(var5);
                  return (float)class_5630.method_25522(var6);
               case field_21904:
                  BlockPos var7 = class_6588.method_30293();
                  class_6325 var8 = class_6588.method_30215().method_22561(var7);
                  return var8 != null ? (float)var8.method_28887().ordinal() : 0.0F;
               case field_21908:
                  BlockPos var9 = class_6588.method_30293();
                  class_6325 var10 = class_6588.method_30215().method_22561(var9);
                  return var10 != null ? (float)var10.method_28866().ordinal() : 0.0F;
               case field_21870:
                  BlockPos var11 = class_6588.method_30293();
                  class_6325 var12 = class_6588.method_30215().method_22561(var11);
                  return var12 != null ? var12.method_28865(var11) : 0.0F;
               case field_21913:
                  BlockPos var13 = class_6588.method_30293();
                  class_6325 var14 = class_6588.method_30215().method_22561(var13);
                  return var14 != null ? var14.method_28870() : 0.0F;
               default:
                  if (this.field_21887 instanceof class_2296) {
                     return ((class_2296)this.field_21887).method_10564();
                  } else if (this.field_21887 instanceof class_8800) {
                     return (float)((class_8800)this.field_21887).method_40457();
                  } else if (this.field_21887 instanceof class_7836) {
                     return (float)((class_7836)this.field_21887).method_35466()[var1];
                  } else if (this.field_21887 instanceof class_6894) {
                     return ((class_6894)this.field_21887).method_31586()[var1];
                  } else if (this.field_21887 instanceof class_6777) {
                     return ((class_6777)this.field_21887).method_31091()[var1];
                  } else if (this.field_21887 instanceof class_85) {
                     return ((class_85)this.field_21887).method_208()[var1];
                  } else if (this.field_21887 instanceof class_4701) {
                     return ((class_4701)this.field_21887).method_21674(var1, var2);
                  } else {
                     throw new IllegalArgumentException("Unknown uniform type: " + this);
                  }
            }
         } else {
            Config.method_14317("Invalid index2, parameter: " + this + ", index: " + var2);
            return 0.0F;
         }
      } else {
         Config.method_14317("Invalid index1, parameter: " + this + ", index: " + var1);
         return 0.0F;
      }
   }

   private static boolean method_20839(Object var0, Class... var1) {
      if (var0 == null) {
         return false;
      } else {
         Class var4 = var0.getClass();

         for (int var5 = 0; var5 < var1.length; var5++) {
            Class var6 = var1[var5];
            if (var6.isAssignableFrom(var4)) {
               return true;
            }
         }

         return false;
      }
   }
}
