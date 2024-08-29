package mapped;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Class9250 {
   private static Map<String, Class4057> field42555 = method34793();

   private static Map<String, Class4057> method34793() {
      LinkedHashMap var2 = new LinkedHashMap();
      method34794(var2, new Class4118());
      method34794(var2, new Class4065());
      method34794(var2, new Class4142());
      method34794(var2, new Class4116());
      method34794(var2, new Class4077());
      method34794(var2, new Class4081());
      method34794(var2, new Class4090());
      method34794(var2, new Class4055());
      method34794(var2, new Class4098());
      method34794(var2, new Class4107());
      method34794(var2, new Class4092());
      method34794(var2, new Class4073());
      method34794(var2, new Class4067());
      method34794(var2, new Class4126());
      method34794(var2, new Class4059());
      method34794(var2, new Class4131());
      method34794(var2, new Class4069());
      method34794(var2, new Class4064());
      method34794(var2, new Class4138());
      method34794(var2, new Class4058());
      method34794(var2, new Class4068());
      method34794(var2, new Class4125());
      method34794(var2, new Class4144());
      method34794(var2, new Class4071());
      method34794(var2, new Class4123());
      method34794(var2, new Class4061());
      method34794(var2, new Class4066());
      method34794(var2, new Class4103());
      method34794(var2, new Class4093());
      method34794(var2, new Class4139());
      method34794(var2, new Class4135());
      method34794(var2, new Class4137());
      method34794(var2, new Class4136());
      method34794(var2, new Class4146());
      method34794(var2, new Class4075());
      method34794(var2, new Class4089());
      method34794(var2, new Class4052());
      method34794(var2, new Class4070());
      method34794(var2, new Class4105());
      method34794(var2, new Class4056());
      method34794(var2, new Class4127());
      method34794(var2, new Class4129());
      method34794(var2, new Class4145());
      method34794(var2, new Class4062());
      method34794(var2, new Class4102());
      method34794(var2, new Class4097());
      method34794(var2, new Class4082());
      method34794(var2, new Class4143());
      method34794(var2, new Class4110());
      method34794(var2, new Class4112());
      method34794(var2, new Class4054());
      method34794(var2, new Class4085());
      method34794(var2, new Class4086());
      method34794(var2, new Class4080());
      method34794(var2, new Class4122());
      method34794(var2, new Class4072());
      method34794(var2, new Class4088());
      method34794(var2, new Class4113());
      method34794(var2, new Class4076());
      method34794(var2, new Class4134());
      method34794(var2, new Class4121());
      method34794(var2, new Class4111());
      method34794(var2, new Class4079());
      method34794(var2, new Class4050());
      method34794(var2, new Class4120());
      method34794(var2, new Class4094());
      method34794(var2, new Class4063());
      method34794(var2, new Class4095());
      method34794(var2, new Class4109());
      method34794(var2, new Class4130());
      method34794(var2, new Class4140());
      method34794(var2, new Class4096());
      method34794(var2, new Class4124());
      method34794(var2, new Class4074());
      method34794(var2, new Class4119());
      method34794(var2, new Class4128());
      method34794(var2, new Class4053());
      method34794(var2, new Class4087());
      method34794(var2, new Class4115());
      method34794(var2, new Class4078());
      method34794(var2, new Class4101());
      method34794(var2, new Class4114());
      method34794(var2, new Class4133());
      method34794(var2, new Class4091());
      method34794(var2, new Class4104());
      method34794(var2, new Class4141());
      method34794(var2, new Class4100());
      method34794(var2, new Class4099());
      method34794(var2, new Class4083());
      method34794(var2, new Class4132());
      method34794(var2, new Class4084());
      method34794(var2, new Class4108());
      method34794(var2, new Class4106());
      return var2;
   }

   private static void method34794(Map<String, Class4057> var0, Class4057 var1) {
      method34795(var0, var1, var1.method12827());
      String[] var4 = var1.method12828();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            method34795(var0, var1, var6);
         }
      }

      Class2828 var10 = var1.method12822();
      String[] var11 = var1.method12824();

      for (int var7 = 0; var7 < var11.length; var7++) {
         String var8 = var11[var7];
         Class7219 var9 = var1.method12823(var10, var8);
         if (var9 == null) {
            Class7944.method26811("Model renderer not found, model: " + var1.method12827() + ", name: " + var8);
         }
      }
   }

   private static void method34795(Map<String, Class4057> var0, Class4057 var1, String var2) {
      if (var0.containsKey(var2)) {
         String var5 = "?";
         Class4862 var6 = var1.method12826();
         if (var6.method15003().isPresent()) {
            var5 = ((EntityType)var6.method15003().get()).method33210();
         }

         if (var6.method15004().isPresent()) {
            var5 = "" + Class4387.method13793((Class4387<?>)var6.method15004().get());
         }

         Class7944.method26811("Model adapter already registered for id: " + var2 + ", type: " + var5);
      }

      var0.put(var2, var1);
   }

   public static Class4057 method34796(String var0) {
      return field42555.get(var0);
   }

   public static String[] method34797() {
      Set<String> var2 = field42555.keySet();
      return var2.toArray(new String[var2.size()]);
   }
}
