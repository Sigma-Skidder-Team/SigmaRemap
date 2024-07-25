package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_6104 implements class_7978 {
   private final Map<String, class_5041> field_31231 = new HashMap<String, class_5041>();

   public class_6104() {
      this.field_31231.put("minecraft:flower_pot", new class_4691());
      this.field_31231.put("minecraft:bed", new class_568());
      this.field_31231.put("minecraft:banner", new class_5204());
      this.field_31231.put("minecraft:skull", new class_8653());
      this.field_31231.put("minecraft:mob_spawner", new class_1300());
      this.field_31231.put("minecraft:command_block", new class_3267());
   }

   public int method_28046(class_1455 var1, class_9371 var2, class_5531 var3, boolean var4) throws Exception {
      class_5287 var7 = var3.<class_5287>method_25123("id");
      if (var7 != null) {
         String var8 = (String)var7.method_24129();
         class_5041 var9 = this.field_31231.get(var8);
         if (var9 != null) {
            int var10 = var9.method_23214(var1, var3);
            if (var4 && var10 != -1) {
               this.method_28044(var1, var2, var10);
            }

            return var10;
         } else {
            if (class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("Unhandled BlockEntity " + var8 + " full tag: " + var3);
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private void method_28044(class_1455 var1, class_9371 var2, int var3) throws Exception {
      class_5051 var6 = new class_5051(11, null, var1);
      var6.method_23236(class_8039.field_41137, var2);
      var6.method_23236(class_8039.field_41157, var3);
      var6.method_23235(class_8633.class, true, true);
   }
}
