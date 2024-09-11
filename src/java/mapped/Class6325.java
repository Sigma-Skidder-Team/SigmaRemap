package mapped;

public class Class6325 implements Class6326 {
   @Override
   public int method19263(Class7161 var1, Class72 var2) {
      Class6039 var5 = var1.<Class6039>method22438(Class6039.class);
      Class9695 var6 = new Class9695(
         (int)this.method19264(var2.<Class61>method235("x")),
         (short)((int)this.method19264(var2.<Class61>method235("y"))),
         (int)this.method19264(var2.<Class61>method235("z"))
      );
      if (var5.method18688(var6)) {
         int var7 = var5.method18689(var6).method35361() - 972 + 748;
         Class61 var8 = var2.<Class61>method235("color");
         if (var8 != null) {
            var7 += ((Number)var8.method205()).intValue() * 16;
         }

         return var7;
      } else {
         ViaVersion3.method27613().getLogger().warning("Received an bed color update packet, but there is no bed! O_o " + var2);
         return -1;
      }
   }

   private long method19264(Class61 var1) {
      return ((Integer)var1.method205()).longValue();
   }
}
