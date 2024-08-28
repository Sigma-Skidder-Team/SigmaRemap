package mapped;

public class Class6328 implements Class6326 {
   private static final int field27840 = 5447;
   private static final int field27841 = 5566;

   @Override
   public int method19263(Class7161 var1, Class72 var2) {
      Class6039 var5 = var1.<Class6039>method22438(Class6039.class);
      Class9695 var6 = new Class9695(
         (int)this.method19266(var2.<Class61>method235("x")),
         (short)((int)this.method19266(var2.<Class61>method235("y"))),
         (int)this.method19266(var2.<Class61>method235("z"))
      );
      if (var5.method18688(var6)) {
         int var7 = var5.method18689(var6).method35361();
         if (var7 >= 5447 && var7 <= 5566) {
            Class61 var8 = var2.<Class61>method235("SkullType");
            if (var8 != null) {
               var7 += ((Number)var2.<Class61>method235("SkullType").method205()).intValue() * 20;
            }

            if (var2.method234("Rot")) {
               var7 += ((Number)var2.<Class61>method235("Rot").method205()).intValue();
            }

            return var7;
         } else {
            Class8042.method27613().method27366().warning("Why does this block have the skull block entity? " + var2);
            return -1;
         }
      } else {
         Class8042.method27613().method27366().warning("Received an head update packet, but there is no head! O_o " + var2);
         return -1;
      }
   }

   private long method19266(Class61 var1) {
      return ((Integer)var1.method205()).longValue();
   }
}
