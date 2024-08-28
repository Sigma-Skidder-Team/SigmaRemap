package mapped;

import com.google.gson.JsonElement;

public class Class3088 implements Class2982 {
   public final Class3813 field18266;

   public Class3088(Class3813 var1) {
      this.field18266 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Short var4 = var1.<Short>method30559(Class4750.field22522);
      String var5 = var1.<String>method30559(Class4750.field22539);
      JsonElement var6 = var1.<JsonElement>method30559(Class4750.field22538);
      Class8770.method31637().method21999(var6);
      Short var7 = var1.<Short>method30559(Class4750.field22522);
      if (var5.equals("EntityHorse")) {
         var1.method30587(31);
         int var8 = var1.<Integer>method30559(Class4750.field22526);
         var1.method30560(Class4750.field22522, var4);
         var1.method30560(Class4750.field22544, var7.intValue());
         var1.method30560(Class4750.field22526, var8);
      } else {
         var1.method30587(46);
         var1.method30560(Class4750.field22544, var4.intValue());
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
            Class8042.method27613().method27366().warning("Can't open inventory for 1.14 player! Type: " + var5 + " Size: " + var7);
         }

         var1.method30560(Class4750.field22544, var11);
         var1.method30560(Class4750.field22538, var6);
      }
   }
}
