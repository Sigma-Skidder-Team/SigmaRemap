package mapped;

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
   public boolean method19222(Class9150 var1, String[] var2) {
      Class8042.method27614().method34426(!Class8042.method27614().method34425());
      this.method19227(var1, "&6Debug mode is now %s", new Object[]{!Class8042.method27614().method34425() ? "&cdisabled" : "&aenabled"});
      return true;
   }
}
