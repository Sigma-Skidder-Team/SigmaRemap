package mapped;

public class Class3190 implements Class2982 {
   public final Class3809 field18452;

   public Class3190(Class3809 var1) {
      this.field18452 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class4824 var5 = new Class4824(var4);
      Class8173 var6 = var1.<Class8173>method30561(var5);
      var1.method30564();
      if (var6.method28451() != null) {
         for (Class72 var8 : var6.method28451()) {
            if (var8.method234("id")) {
               String var9 = var8.<Class71>method235("id").method205();
               if (var9.equals("MobSpawner")) {
                  Class7922.method26587(var8);
               }

               var8.<Class71>method235("id").method231(Class9236.method34743(var9));
            }
         }
      }
   }
}
