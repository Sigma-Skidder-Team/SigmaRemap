package remapped;

import com.google.gson.JsonElement;

public class class_7923 implements class_857 {
   public class_7923(class_4250 var1) {
      this.field_40543 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      Short var4 = var1.<Short>method_23242(class_8039.field_41175);
      String var5 = var1.<String>method_23242(class_8039.field_41171);
      JsonElement var6 = var1.<JsonElement>method_23242(class_8039.field_41143);
      class_5830.method_26384().method_41802(var6);
      Short var7 = var1.<Short>method_23242(class_8039.field_41175);
      if (var5.equals("EntityHorse")) {
         var1.method_23253(31);
         int var8 = var1.<Integer>method_23242(class_8039.field_41179);
         var1.method_23236(class_8039.field_41175, var4);
         var1.method_23236(class_8039.field_41157, var7.intValue());
         var1.method_23236(class_8039.field_41179, var8);
      } else {
         var1.method_23253(46);
         var1.method_23236(class_8039.field_41157, var4.intValue());
         int var11 = -1;
         switch (var5) {
            case "minecraft:container":
            case "minecraft:chest":
               var11 = var7 / 9 - 1;
               break;
            case "minecraft:crafting_table":
               var11 = 11;
               break;
            case "minecraft:furnace":
               var11 = 13;
               break;
            case "minecraft:dropper":
            case "minecraft:dispenser":
               var11 = 6;
               break;
            case "minecraft:enchanting_table":
               var11 = 12;
               break;
            case "minecraft:brewing_stand":
               var11 = 10;
               break;
            case "minecraft:villager":
               var11 = 18;
               break;
            case "minecraft:beacon":
               var11 = 8;
               break;
            case "minecraft:anvil":
               var11 = 7;
               break;
            case "minecraft:hopper":
               var11 = 15;
               break;
            case "minecraft:shulker_box":
               var11 = 19;
               break;
            default:
               var11 = var7 / 9 - 1;
         }

         if (var11 == -1) {
            class_3446.method_15886().method_34617().warning("Can't open inventory for 1.14 player! Type: " + var5 + " Size: " + var7);
         }

         var1.method_23236(class_8039.field_41157, var11);
         var1.method_23236(class_8039.field_41143, var6);
      }
   }
}
