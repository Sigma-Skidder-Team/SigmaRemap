package mapped;

public class Class3146 implements Class2982 {
   public final Class3854 field18370;

   public Class3146(Class3854 var1) {
      this.field18370 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30555(Class4750.field22522, 0);
      if (var4 == 1) {
         Class72 var5 = var1.<Class72>method30555(Class4750.field22555, 0);
         if (var5 != null) {
            if (!var5.method234("EntityId")) {
               Class72 var6 = new Class72("SpawnData");
               var6.<Class71>method236(new Class71("id", "AreaEffectCloud"));
               var5.<Class72>method236(var6);
            } else {
               String var9 = (String)var5.<Class61>method235("EntityId").method205();
               Class72 var7 = new Class72("SpawnData");
               var7.<Class71>method236(new Class71("id", var9));
               var5.<Class72>method236(var7);
            }
         }
      }

      if (var4 == 2) {
         Class5413 var8 = Class8042.method27614().method34424().<Class5413>method31084(Class5413.class);
         var8.method17001(var1.method30580(), var1.<Class9695>method30555(Class4750.field22551, 0), var1.<Class72>method30555(Class4750.field22555, 0));
         var1.method30578();
      }
   }
}
