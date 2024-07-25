package remapped;

import java.util.ArrayList;
import java.util.List;

public final class class_2768 extends class_3893 {
   private static String[] field_13517;

   public class_2768(class_4106 var1) {
      this.field_13518 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         var1.method_23245();
         int var4 = var1.<Integer>method_23242(class_8039.field_41179);
         int var5 = var1.<Integer>method_23242(class_8039.field_41179);
         long var6 = 0L;
         var6 |= ((long)var4 & 4194303L) << 42;
         var6 |= ((long)var5 & 4194303L) << 20;
         List[] var8 = new List[16];
         class_9523[] var9 = var1.<class_9523[]>method_23242(class_8039.field_41154);

         for (class_9523 var13 : var9) {
            int var14 = var13.method_43931() >> 4;
            Object var15 = var8[var14];
            if (var15 == null) {
               var8[var14] = (List)(var15 = new ArrayList());
            }

            int var16 = var0.method_19008().method_28217(var13.method_43935());
            var15.add(new class_1152(var13.method_43936(), var13.method_43934(), var13.method_43930(), var16));
         }

         for (int var19 = 0; var19 < var8.length; var19++) {
            List var20 = var8[var19];
            if (var20 != null) {
               class_5051 var21 = var1.method_23259(class_6608.field_34123.method_31559());
               var21.method_23236(class_8039.field_41141, var6 | (long)var19 & 1048575L);
               var21.method_23236(class_8039.field_41161, false);
               var21.method_23236(class_8039.field_41180, var20.<class_9523>toArray(class_4101.method_18943()));
               var21.method_23235(class_6003.class, true, true);
            }
         }
      });
   }
}
