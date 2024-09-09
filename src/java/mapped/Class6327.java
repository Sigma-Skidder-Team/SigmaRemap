package mapped;

public class Class6327 implements Class6326 {
   private static final int field27836 = 7110;
   private static final int field27837 = 7173;
   private static final int field27838 = 6854;
   private static final int field27839 = 7109;

   @Override
   public int method19263(Class7161 var1, Class72 var2) {
      Class6039 var5 = var1.<Class6039>method22438(Class6039.class);
      Class9695 var6 = new Class9695(
         (int)this.method19265(var2.<Class61>method235("x")),
         (short)((int)this.method19265(var2.<Class61>method235("y"))),
         (int)this.method19265(var2.<Class61>method235("z"))
      );
      if (var5.method18688(var6)) {
         int var7 = var5.method18689(var6).method35361();
         Class61 var8 = var2.<Class61>method235("Base");
         int var9 = 0;
         if (var8 != null) {
            var9 = ((Number)var2.<Class61>method235("Base").method205()).intValue();
         }

         if (var7 >= 6854 && var7 <= 7109) {
            var7 += (15 - var9) * 16;
         } else if (var7 >= 7110 && var7 <= 7173) {
            var7 += (15 - var9) * 4;
         } else {
            ViaVersion3.method27613().method27366().warning("Why does this block have the banner block entity? :(" + var2);
         }

         if (var2.method235("Patterns") instanceof Class60) {
            for (Class61 var11 : (Class60)var2.method235("Patterns")) {
               if (var11 instanceof Class72) {
                  Class61 var12 = ((Class72)var11).<Class61>method235("Color");
                  if (var12 instanceof Class66) {
                     ((Class66)var12).method223(15 - (Integer)var12.method205());
                  }
               }
            }
         }

         Class61 var13 = var2.<Class61>method235("CustomName");
         if (var13 instanceof Class71) {
            ((Class71)var13).method231(Class2980.method11395(((Class71)var13).method205()));
         }

         return var7;
      } else {
         ViaVersion3.method27613().method27366().warning("Received an banner color update packet, but there is no banner! O_o " + var2);
         return -1;
      }
   }

   private long method19265(Class61 var1) {
      return ((Integer)var1.method205()).longValue();
   }
}
