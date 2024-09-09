package mapped;

public class Class6263 extends Class6255 {
   @Override
   public String method19220() {
      return "dontbugme";
   }

   @Override
   public String method19221() {
      return "Toggle checking for updates";
   }

   @Override
   public boolean method19222(Class9150 var1, String[] var2) {
      Class7043 var5 = ViaVersion3.method27613().method27362();
      boolean var6 = !ViaVersion3.method27612().method21890();
      ViaVersion3.method27612().method21944(var6);
      var5.method21880();
      this.method19227(var1, "&6We will %snotify you about updates.", new Object[]{!var6 ? "&cnot " : "&a"});
      return true;
   }
}
