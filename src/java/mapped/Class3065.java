package mapped;

import com.google.common.base.Joiner;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Optional;

public class Class3065 implements Class2982 {
   public final Class4027 field18231;

   public Class3065(Class4027 var1) {
      this.field18231 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(BruhMotha.field22539, 0);
      if (!var4.equalsIgnoreCase("MC|StopSound")) {
         if (!var4.equalsIgnoreCase("MC|TrList")) {
            var4 = Class9687.method37924(var4);
            if (var4 == null) {
               if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
                  ViaVersion3.method27613().getLogger().warning("Ignoring outgoing plugin message with channel: " + var4);
               }

               var1.method30578();
               return;
            }

            if (var4.equals("minecraft:register") || var4.equals("minecraft:unregister")) {
               String[] var14 = new String(var1.<byte[]>method30559(BruhMotha.field22521), StandardCharsets.UTF_8).split("\u0000");
               ArrayList var16 = new ArrayList();

               for (int var18 = 0; var18 < var14.length; var18++) {
                  String var9 = Class9687.method37924(var14[var18]);
                  if (var9 == null) {
                     if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
                        ViaVersion3.method27613().getLogger().warning("Ignoring plugin channel in outgoing REGISTER: " + var14[var18]);
                     }
                  } else {
                     var16.add(var9);
                  }
               }

               if (var16.isEmpty()) {
                  var1.method30578();
                  return;
               }

               var1.method30560(BruhMotha.field22521, Joiner.on('\u0000').join(var16).getBytes(StandardCharsets.UTF_8));
            }
         } else {
            var4 = "minecraft:trader_list";
            var1.<Integer>method30561(BruhMotha.field22526);
            short var13 = var1.<Short>method30561(BruhMotha.field22522);

            for (int var15 = 0; var15 < var13; var15++) {
               Class9738 var17 = var1.<Class9738>method30559(BruhMotha.field22561);
               Class9687.method37923(var17);
               var1.method30560(BruhMotha.field22568, var17);
               Class9738 var19 = var1.<Class9738>method30559(BruhMotha.field22561);
               Class9687.method37923(var19);
               var1.method30560(BruhMotha.field22568, var19);
               boolean var20 = var1.<Boolean>method30561(BruhMotha.field22524);
               if (var20) {
                  Class9738 var10 = var1.<Class9738>method30559(BruhMotha.field22561);
                  Class9687.method37923(var10);
                  var1.method30560(BruhMotha.field22568, var10);
               }

               var1.<Boolean>method30561(BruhMotha.field22524);
               var1.<Integer>method30561(BruhMotha.field22526);
               var1.<Integer>method30561(BruhMotha.field22526);
            }
         }

         var1.method30558(BruhMotha.field22539, 0, var4);
      } else {
         String var5 = var1.<String>method30559(BruhMotha.field22539);
         String var6 = var1.<String>method30559(BruhMotha.field22539);
         var1.method30565();
         var1.method30587(76);
         byte var7 = 0;
         var1.method30560(BruhMotha.field22518, var7);
         if (!var5.isEmpty()) {
            var7 = (byte)(var7 | 1);
            Optional var8 = Class2299.method9064(var5);
            if (!var8.isPresent()) {
               if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
                  ViaVersion3.method27613().getLogger().info("Could not handle unknown sound source " + var5 + " falling back to default: master");
               }

               var8 = Optional.<Class2299>of(Class2299.field15690);
            }

            var1.method30560(BruhMotha.field22544, ((Class2299)var8.get()).method9066());
         }

         if (!var6.isEmpty()) {
            var7 = (byte)(var7 | 2);
            var1.method30560(BruhMotha.field22539, var6);
         }

         var1.method30558(BruhMotha.field22518, 0, var7);
      }
   }
}
