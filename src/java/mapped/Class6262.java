package mapped;

import com.mentalfrostbyte.jello.viaversion.data.PlayerData;

public class Class6262 extends Class6255 {
   @Override
   public String method19220() {
      return "debug";
   }

   @Override
   public String method19221() {
      return "Toggle debug mode";
   }

   @Override
   public boolean method19222(PlayerData var1, String[] var2) {
      ViaVersion3.getInstance().method34426(!ViaVersion3.getInstance().method34425());
      this.method19227(var1, "&6Debug mode is now %s", new Object[]{!ViaVersion3.getInstance().method34425() ? "&cdisabled" : "&aenabled"});
      return true;
   }
}
