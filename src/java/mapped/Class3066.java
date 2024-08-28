package mapped;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.Map.Entry;

public class Class3066 implements Class2982 {
   public final Class3796 field18232;

   public Class3066(Class3796 var1) {
      this.field18232 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      if (Class8042.method27612().method21919()) {
         if (var1.method30555(Class4750.field22544, 0) == var1.method30580().method22438(Class6057.class).method18753()) {
            int var4 = var1.method30559(Class4750.field22526);
            Map<String, Class9284> var5 = new HashMap<>(var4);

            for (int var6 = 0; var6 < var4; var6++) {
               String var7 = var1.method30559(Class4750.field22539);
               Double var8 = var1.method30559(Class4750.field22528);
               int var9 = var1.method30559(Class4750.field22544);
               ArrayList var10 = new ArrayList(var9);

               for (int var11 = 0; var11 < var9; var11++) {
                  var10.add(
                     new Class7753<UUID, Double, Byte>(
                        var1.<UUID>method30559(Class4750.field22541),
                        var1.<Double>method30559(Class4750.field22528),
                        var1.<Byte>method30559(Class4750.field22518)
                     )
                  );
               }

               var5.put(var7, new Class9284<>(var8, var10));
            }

            var5.put(
               "generic.attackSpeed",
               new Class9284<Double, ImmutableList>(
                  15.9,
                  ImmutableList.of(
                          new Class7753<>(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), 0.0, (byte) 0),
                          new Class7753<>(UUID.fromString("AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3"), 0.0, (byte) 2),
                          new Class7753<>(UUID.fromString("55FCED67-E92A-486E-9800-B47F202C4386"), 0.0, (byte) 2)
                  )
               )
            );
            var1.method30560(Class4750.field22526, var5.size());

            for (Entry var13 : var5.entrySet()) {
               var1.method30560(Class4750.field22539, (String)var13.getKey());
               var1.method30560(Class4750.field22528, (Double)((Class9284)var13.getValue()).method35008());
               var1.method30560(Class4750.field22544, ((List)((Class9284)var13.getValue()).method35009()).size());

               for (Class7753 var15 : (List<Class7753>)((Class9284)var13.getValue()).method35009()) {
                  var1.method30560(Class4750.field22541, (UUID)var15.method25698());
                  var1.method30560(Class4750.field22528, (Double)var15.method25699());
                  var1.method30560(Class4750.field22518, (Byte)var15.method25700());
               }
            }
         }
      }
   }
}
