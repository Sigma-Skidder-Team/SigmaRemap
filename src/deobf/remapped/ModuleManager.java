package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ModuleManager {
   private Map<Class<? extends Module>, Module> field_637 = new LinkedHashMap<Class<? extends Module>, Module>();
   private class_986 field_638;
   private class_123 field_639;
   private List<Module> field_641;

   private void method_837() {
      this.field_641 = new ArrayList<Module>();
   }

   private void method_852(Module var1) {
      this.field_641.add(var1);
   }

   private void method_841(Class<? extends Module> var1) {
      SigmaMainClass.getInstance().getEventManager().method_7911(var1);
      this.field_637.remove(var1);
   }

   private void method_851() {
      Collections.sort(this.field_641, new class_5309(this));

      for (Module var4 : this.field_641) {
         SigmaMainClass.getInstance().getEventManager().subscribe(var4);
         this.field_637.put((Class<? extends Module>)var4.getClass(), var4);
      }

      class_890.field_4585 = true;
   }

   public void registerAllModules(class_6015 var1) {
      this.method_837();
      this.method_852(new BlockFlyModule());
      this.method_852(new FlyModule());
      this.method_852(new class_6908());
      this.method_852(new class_6592());
      this.method_852(new class_1213());
      this.method_852(new class_7033());
      this.method_852(new class_8968());
      this.method_852(new class_9704());
      this.method_852(new class_1396());
      this.method_852(new class_8625());
      this.method_852(new class_3921());
      this.method_852(new class_4181());
      this.method_852(new class_3721());
      this.method_852(new class_5377());
      this.method_852(new class_5838());
      this.method_852(new ElytraFlyModule());
      this.method_852(new class_1715());
      this.method_852(new KillauraModule());
      this.method_852(new class_9758());
      this.method_852(new class_9801());
      this.method_852(new class_5787());
      this.method_852(new class_2329());
      this.method_852(new RegenModule());
      this.method_852(new class_7401());
      this.method_852(new class_5741());
      this.method_852(new class_7169());
      this.method_852(new class_2941());
      this.method_852(new class_5981());
      this.method_852(new class_9824());
      this.method_852(new class_2739());
      this.method_852(new AutoLogModule());
      this.method_852(new class_3595());
      this.method_852(new AntiVoidModule());
      this.method_852(new class_1931());
      this.method_852(new class_4557());
      this.method_852(new class_2656());
      this.method_852(new class_4137());
      this.method_852(new AutoArmorModule());
      this.method_852(new AutoToolsModule());
      this.method_852(new class_3588());
      this.method_852(new ChestStealerModule());
      this.method_852(new AutoPotionModule());
      this.method_852(new class_5174());
      this.method_852(new class_5870());
      this.method_852(new class_7218());
      this.method_852(new class_9459());
      this.method_852(new class_1452());
      this.method_852(new SneakModule());
      this.method_852(new DerpModule());
      this.method_852(new class_3095());
      this.method_852(new ParkourModule());
      this.method_852(new OldHittingModule());
      this.method_852(new class_4342());
      this.method_852(new class_5477());
      this.method_852(new class_1958());
      this.method_852(new class_6424());
      this.method_852(new class_3967());
      this.method_852(new class_9495());
      this.method_852(new class_914());
      this.method_852(new class_9598());
      this.method_852(new NoHurtCamModule());
      this.method_852(new class_2689());
      this.method_852(new class_4711());
      this.method_852(new AntiBlindModule());
      this.method_852(new XRayModule());
      this.method_852(new TracersModule());
      this.method_852(new class_2191());
      this.method_852(new class_9366());
      this.method_852(new class_597());
      this.method_852(new class_6803());
      this.method_852(new class_9437());
      this.method_852(new FastPlaceModule());
      this.method_852(new class_4624());
      this.method_852(new class_2481());
      this.method_852(new AntiCactusModule());
      this.method_852(new class_9357());
      this.method_852(new FastBreakModule());
      this.method_852(new class_8444());
      this.method_852(new class_2739());
      this.method_852(new class_1355());
      this.method_852(new class_2167());
      this.method_852(new class_652());
      this.method_852(new ChatCleanerModule());
      this.method_852(new class_9604());
      this.method_852(new class_7376());
      this.method_852(new class_8726());
      this.method_852(new class_4820());
      this.method_852(new class_1826());
      this.method_852(new AntiLevitationModule());
      this.method_852(new FakeForgeModule());
      if (var1 != class_6015.field_30645) {
         if (var1 == class_6015.field_30644) {
            this.method_852(new class_4221());
            this.method_852(new class_268());
            this.method_852(new class_3055());
            this.method_852(new class_867());
            this.method_852(new KeyStrokesModule());
         }
      } else {
         this.method_852(new class_9024());
         this.method_852(new class_9134());
         this.method_852(new class_1964());
         this.method_852(new ShulkerInfoModule());
         this.method_852(new class_7693());
         this.method_852(new class_4969());
         this.method_852(new class_8438());
         this.method_852(new class_9522());
         this.method_852(new NameTagsModule());
         this.method_852(new class_9137());
         this.method_852(new class_3961());
         this.method_852(new class_7723());
         this.method_852(new class_8726());
         this.method_852(new PortalGUIModule());
         this.method_852(new class_428());
         this.method_852(new class_2590());
         this.method_852(new class_4243());
         this.method_852(new AutoFishModule());
         this.method_852(new class_9543());
         this.method_852(new AutoTotemModule());
         this.method_852(new class_8057());
      }

      new class_4292();
      this.method_851();
   }

   public JSONObjectImpl method_838(JSONObjectImpl var1) {
      JSONArray var4 = null;

      try {
         var4 = JSONWriter.saveStringValue2ig(var1, "mods");
      } catch (class_7584 var14) {
      }

      for (Module var6 : this.field_637.values()) {
         var6.method_42019();
      }

      if (var4 != null) {
         for (int var15 = 0; var15 < var4.method_6142(); var15++) {
            JSONObjectImpl var17 = var4.method_6143(var15);
            String var7 = null;

            try {
               var7 = JSONWriter.saveStringValue(var17, "name", null);
            } catch (class_7584 var13) {
               SigmaMainClass.getInstance().method_3326().method_12862("Invalid name in mod list config");
            }

            for (Module var9 : this.field_637.values()) {
               if (var9.getName().equals(var7)) {
                  try {
                     var9.saveToJson(var17);
                  } catch (class_7584 var12) {
                     SigmaMainClass.getInstance()
                        .method_3326()
                        .method_12862("Could not initialize mod " + var9.getName() + " from config. All settings for this mod have been erased.");
                  }
                  break;
               }
            }
         }
      } else {
         SigmaMainClass.getInstance().method_3326().method_12863("Mods array does not exist in config. Assuming a blank profile...");
      }

      for (Module var18 : this.field_637.values()) {
         if (var18.method_42015()) {
            SigmaMainClass.getInstance().getEventManager().method_7917(var18);
            if (var18 instanceof SecondModule) {
               SecondModule var20 = (SecondModule)var18;
               if (var20.field_17664 != null) {
                  SigmaMainClass.getInstance().getEventManager().method_7917(var20.field_17664);
               }
            }
         } else {
            SigmaMainClass.getInstance().getEventManager().method_7915(var18);
            if (var18 instanceof SecondModule) {
               SecondModule var19 = (SecondModule)var18;

               for (Module var11 : var19.field_17661) {
                  SigmaMainClass.getInstance().getEventManager().method_7915(var11);
               }
            }
         }

         var18.method_42012();
      }

      return var1;
   }

   public JSONObjectImpl method_839(JSONObjectImpl var1) {
      JSONArray var4 = new JSONArray();

      for (Module var6 : this.field_637.values()) {
         var4.method_6159(var6.loadFromJson(new JSONObjectImpl()));
      }

      var1.method_5820("mods", var4);
      return var1;
   }

   public void method_846() {
      long var3 = (long)this.method_840();

      for (Module var6 : this.field_637.values()) {
         for (Setting var8 : var6.method_41996().values()) {
            if (var8.method_23043()) {
               var3++;
            }

            if (var6 instanceof SecondModule) {
               for (Module var12 : ((SecondModule)var6).field_17661) {
                  for (Setting var14 : var12.method_41996().values()) {
                     if (var14.method_23043()) {
                        var3++;
                     }
                  }
               }
            }
         }
      }
   }

   public void method_842(JSONObjectImpl var1) {
      String var4 = null;

      try {
         var4 = var1.method_5861("profile");
      } catch (class_7584 var7) {
      }

      if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30644) {
         var4 = "Classic";
      }

      this.field_638 = new class_986();
      this.field_639 = new class_123();

      try {
         this.field_638.method_4304(var4);
         this.field_639.method_376(var1);
      } catch (IOException var6) {
         SigmaMainClass.getInstance().method_3326().method_12864("Could not load profiles!");
         var6.printStackTrace();
         throw new RuntimeException("sorry m8");
      }

      this.field_639.method_378();
   }

   public void method_849(JSONObjectImpl var1) {
      var1.method_5820("profile", this.field_638.method_4301().field_8677);
      this.field_638.method_4301().field_8678 = this.method_839(new JSONObjectImpl());

      try {
         this.field_638.method_4306();
         this.field_639.method_369(var1);
      } catch (IOException var5) {
         var5.printStackTrace();
         SigmaMainClass.getInstance().method_3326().method_12862("Unable to save mod profiles...");
      }
   }

   public int method_840() {
      Setting var3 = this.method_847(class_7033.class).method_41996().get("Mode");
      String var4 = (String)var3.field_25890;
      var3.method_23037("Dolphin");
      var3.field_25890 = (T)var4;
      return 0;
   }

   public Module method_847(Class<? extends Module> var1) {
      return this.field_637.get(var1);
   }

   public Module method_850(Class<? extends Module> var1) {
      if (var1.getSuperclass() == SecondModule.class) {
         SecondModule var4 = (SecondModule)this.field_637.get(var1.getSuperclass());

         for (Module var8 : var4.field_17661) {
            if (var8.getClass() == var1) {
               return var8;
            }
         }
      }

      return this.field_637.get(var1);
   }

   public Map<Class<? extends Module>, Module> method_843() {
      return this.field_637;
   }

   public List<Module> method_844(Category var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : this.field_637.values()) {
         if (var6.method_42004().equals(var1)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public List<Module> method_836() {
      ArrayList var3 = new ArrayList();

      for (Module var5 : this.field_637.values()) {
         if (var5.method_42015()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public class_986 method_848() {
      return this.field_638;
   }

   public class_123 method_835() {
      return this.field_639;
   }
}
