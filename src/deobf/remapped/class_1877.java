package remapped;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;

public class class_1877 implements class_857 {
   public class_1877(class_6039 var1) {
      this.field_9519 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      if (class_3446.method_15884().method_25835()) {
         if (var1.<Integer>method_23248(class_8039.field_41157, 0) == var1.method_23255().<class_1189>method_6746(class_1189.class).method_5246()) {
            int var4 = var1.<Integer>method_23242(class_8039.field_41179);
            HashMap var5 = new HashMap(var4);

            for (int var6 = 0; var6 < var4; var6++) {
               String var7 = var1.<String>method_23242(class_8039.field_41171);
               Double var8 = var1.<Double>method_23242(class_8039.field_41147);
               int var9 = var1.<Integer>method_23242(class_8039.field_41157);
               ArrayList var10 = new ArrayList(var9);

               for (int var11 = 0; var11 < var9; var11++) {
                  var10.add(
                     new class_2635<UUID, Double, Byte>(
                        var1.<UUID>method_23242(class_8039.field_41150),
                        var1.<Double>method_23242(class_8039.field_41147),
                        var1.<Byte>method_23242(class_8039.field_41133)
                     )
                  );
               }

               var5.put(var7, new class_7794<Double, ArrayList>(var8, var10));
            }

            var5.put(
               "generic.attackSpeed",
               new class_7794<Double, ImmutableList>(
                  15.9,
                  ImmutableList.of(
                     new class_2635<UUID, Double, Byte>(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), 0.0, (byte)0),
                     new class_2635<UUID, Double, Byte>(UUID.fromString("AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3"), 0.0, (byte)2),
                     new class_2635<UUID, Double, Byte>(UUID.fromString("55FCED67-E92A-486E-9800-B47F202C4386"), 0.0, (byte)2)
                  )
               )
            );
            var1.method_23236(class_8039.field_41179, var5.size());

            for (Entry var13 : var5.entrySet()) {
               var1.method_23236(class_8039.field_41171, (String)var13.getKey());
               var1.method_23236(class_8039.field_41147, (Double)((class_7794)var13.getValue()).method_35355());
               var1.method_23236(class_8039.field_41157, ((List)((class_7794)var13.getValue()).method_35352()).size());

               for (class_2635 var15 : (List)((class_7794)var13.getValue()).method_35352()) {
                  var1.method_23236(class_8039.field_41150, (UUID)var15.method_11914());
                  var1.method_23236(class_8039.field_41147, (Double)var15.method_11917());
                  var1.method_23236(class_8039.field_41133, (Byte)var15.method_11915());
               }
            }
         }
      }
   }
}
