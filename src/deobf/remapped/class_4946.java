package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4946 {
   public List<class_3720> field_25604 = new ArrayList<class_3720>();
   public static final String field_25602 = ".";
   public static final String field_25599 = "§f[§6Sigma§f]§7";
   private boolean field_25601 = true;
   private static List<Runnable> field_25600 = new ArrayList<Runnable>();

   public void method_22654() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      this.method_22660(new class_5627());
      this.method_22660(new class_836());
      this.method_22660(new class_1110());
      this.method_22660(new class_3610());
      this.method_22660(new class_7870());
      this.method_22660(new class_6595());
      this.method_22660(new class_3408());
      this.method_22660(new class_842());
      this.method_22660(new class_5949());
      this.method_22660(new class_2629());
      this.method_22660(new class_352());
      this.method_22660(new class_4738());
      this.method_22660(new class_1861());
      this.method_22660(new class_9549());
      this.method_22660(new class_1664());
      this.method_22660(new class_9314());
      this.method_22660(new class_4637());
      this.method_22660(new class_4017());
   }

   public class_3720 method_22656(String var1) {
      for (class_3720 var5 : this.field_25604) {
         if (var5.method_17258().equals(var1)) {
            return var5;
         }
      }

      for (class_3720 var11 : this.field_25604) {
         for (String var9 : var11.method_17254()) {
            if (var9.equals(var1)) {
               return var11;
            }
         }
      }

      return null;
   }

   public List<class_3720> method_22661() {
      return this.field_25604;
   }

   private void method_22660(class_3720 var1) {
      this.field_25604.add(var1);
   }

   public void method_22655(String var1) {
      class_314.method_1443(this.method_22662() + " Invalid command \"" + "." + var1 + "\"");
      class_314.method_1443(this.method_22662() + " Use \"" + "." + "help\" for a list of commands.");
   }

   public String method_22662() {
      if (this.field_25601) {
         this.field_25601 = false;
         return "§f[§6Sigma§f]§7";
      } else {
         String var3 = "";

         for (int var4 = 0; var4 < 8; var4++) {
            var3 = var3 + " ";
         }

         return var3 + "§7";
      }
   }

   public void method_22653() {
      this.field_25601 = true;
   }

   @class_9148
   private void method_22658(class_5596 var1) {
      for (Runnable var5 : field_25600) {
         var5.run();
      }

      field_25600.clear();
   }

   public static void method_22657(Runnable var0) {
      field_25600.add(var0);
   }

   @class_9148
   private void method_22659(class_2157 var1) {
      if (SigmaMainClass.method_3328().method_3312() != class_6015.field_30642) {
         if (var1.method_10047() instanceof class_3211) {
            class_3211 var4 = (class_3211)var1.method_10047();
            String var5 = var4.method_14751();
            if (var5.startsWith(".") && var5.substring(1).startsWith(".")) {
               var4.field_16018 = var5.substring(1);
               return;
            }

            if (var5.startsWith(".")) {
               var1.method_29715(true);
               this.method_22653();
               String[] var6 = var5.substring(".".length()).split(" ");
               class_3720 var7 = this.method_22656(var6[0]);
               if (var7 == null) {
                  this.method_22655(var6[0]);
                  return;
               }

               ArrayList var8 = new ArrayList();

               for (int var9 = 1; var9 < var6.length; var9++) {
                  var8.add(new class_5273(var6[var9]));
               }

               class_314.method_1443(" ");

               try {
                  var7.run(var5, var8.<class_5273>toArray(new class_5273[0]), var1x -> class_314.method_1443(this.method_22662() + " " + var1x));
               } catch (class_2900 var10) {
                  if (var10.field_14164.length() > 0) {
                     class_314.method_1443(this.method_22662() + " Error: " + var10.field_14164);
                  }

                  class_314.method_1443(this.method_22662() + " Usage: " + "." + var7.method_17258() + " " + var7.method_17255());
               }

               class_314.method_1443(" ");
            }
         }

         if (var1.method_10047() instanceof class_6248) {
            class_6248 var11 = (class_6248)var1.method_10047();
            if (var11.method_28521().startsWith(".")) {
               var1.method_29715(true);
            }
         }
      }
   }
}
