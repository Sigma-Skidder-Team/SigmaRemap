package remapped;

public class class_7691 extends class_4403 {
   @Override
   public String method_20527() {
      return "debug";
   }

   @Override
   public String method_20529() {
      return "Toggle debug mode";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      class_3446.method_15883().method_33724(!class_3446.method_15883().method_33731());
      this.method_20528(var1, "&6Debug mode is now %s", new Object[]{!class_3446.method_15883().method_33731() ? "&cdisabled" : "&aenabled"});
      return true;
   }
}
