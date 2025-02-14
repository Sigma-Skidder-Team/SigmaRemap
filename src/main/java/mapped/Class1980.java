package mapped;

public enum Class1980 {
   field12912("us-east-1", "ec2.us-east-1.amazonaws.com"),
   field12913("us-west-2", "ec2.us-west-2.amazonaws.com"),
   field12914("us-west-1", "ec2.us-west-1.amazonaws.com"),
   field12915("eu-west-1", "ec2.eu-west-1.amazonaws.com"),
   field12916("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com"),
   field12917("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com"),
   field12918("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com"),
   field12919("sa-east-1", "ec2.sa-east-1.amazonaws.com");

   private final String field12920;
   private final String field12921;
   private static final Class1980[] field12922 = new Class1980[]{
      field12912, field12913, field12914, field12915, field12916, field12917, field12918, field12919
   };

   private Class1980(String var3, String var4) {
      this.field12920 = var3;
      this.field12921 = var4;
   }

   // $VF: synthetic method
   public static String method8263(Class1980 var0) {
      return var0.field12921;
   }

   // $VF: synthetic method
   public static String method8264(Class1980 var0) {
      return var0.field12920;
   }
}
