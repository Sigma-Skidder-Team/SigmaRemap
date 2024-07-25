package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ModuleManager {
   private Map<Class<? extends Module>, Module> moduleMap = new LinkedHashMap<Class<? extends Module>, Module>();
   private class_986 field_638;
   private class_123 field_639;
   private List<Module> moduleList;

   private void initList() {
      this.moduleList = new ArrayList<Module>();
   }

   private void addModule(Module var1) {
      this.moduleList.add(var1);
   }

   private void method_841(Class<? extends Module> var1) {
      SigmaMainClass.getInstance().getEventManager().unsubscribe(var1);
      this.moduleMap.remove(var1);
   }

   private void sortAndSub() {
      this.moduleList.sort(new class_5309(this));

      for (Module var4 : this.moduleList) {
         SigmaMainClass.getInstance().getEventManager().subscribe(var4);
         this.moduleMap.put(var4.getClass(), var4);
      }

      class_890.field_4585 = true;
   }

   public void registerAllModules(class_6015 var1) {
      this.initList();
      this.addModule(new BlockFlyModule());
      this.addModule(new FlyModule());
      this.addModule(new SpeedModule());
      this.addModule(new EntitySpeedModule());
      this.addModule(new LongJumpModule());
      this.addModule(new JesusModule());
      this.addModule(new ClickTPModule());
      this.addModule(new NoSlowModule());
      this.addModule(new SafeWalkModule());
      this.addModule(new PhaseModule());
      this.addModule(new StrafeModule());
      this.addModule(new StepModule());
      this.addModule(new BoatFlyModule());
      this.addModule(new FastLadderModule());
      this.addModule(new HighJumpModule());
      this.addModule(new ElytraFlyModule());
      this.addModule(new SpiderModule());
      this.addModule(new KillauraModule());
      this.addModule(new AntiKnockbackModule());
      this.addModule(new CriticalsModule());
      this.addModule(new InvMoveModule());
      this.addModule(new AimbotModule());
      this.addModule(new RegenModule());
      this.addModule(new InfiniteAuraModule());
      this.addModule(new FastBowModule());
      this.addModule(new WTapModule());
      this.addModule(new BowAimbotModule());
      this.addModule(new AntiBotModule());
      this.addModule(new TargetStrafeModule());
      this.addModule(new InteractRangeModule());
      this.addModule(new AutoLogModule());
      this.addModule(new TeamsModule());
      this.addModule(new AntiVoidModule());
      this.addModule(new ServerCrashesModule());
      this.addModule(new DisablerModule());
      this.addModule(new FakeLagModule());
      this.addModule(new DVDSimulatorModule());
      this.addModule(new AutoArmorModule());
      this.addModule(new AutoToolsModule());
      this.addModule(new AutoMLGModule());
      this.addModule(new ChestStealerModule());
      this.addModule(new AutoPotionModule());
      this.addModule(new InvManagerModule());
      this.addModule(new AutoSoupModule());
      this.addModule(new AutoSprintModule());
      this.addModule(new AutoRespawnModule());
      this.addModule(new NoViewResetModule());
      this.addModule(new SneakModule());
      this.addModule(new DerpModule());
      this.addModule(new NoFallModule());
      this.addModule(new ParkourModule());
      this.addModule(new OldHittingModule());
      this.addModule(new FastEatModule());
      this.addModule(new BlinkModule());
      this.addModule(new AutoWalkModule());
      this.addModule(new AutoGapple());
      this.addModule(new LowFireModule());
      this.addModule(new NameProtectModule());
      this.addModule(new FullbrightModule());
      this.addModule(new FreeCamModule());
      this.addModule(new NoHurtCamModule());
      this.addModule(new BreadcrumbsModule());
      this.addModule(new ChestESPModule());
      this.addModule(new AntiBlindModule());
      this.addModule(new XRayModule());
      this.addModule(new TracersModule());
      this.addModule(new CameraNoClipModule());
      this.addModule(new SearchModule());
      this.addModule(new FPSBoosterModule());
      this.addModule(new TimerModule());
      this.addModule(new NukerModule());
      this.addModule(new FastPlaceModule());
      this.addModule(new AutoFarmModule());
      this.addModule(new NewChunksModule());
      this.addModule(new AntiCactusModule());
      this.addModule(new WeatherModule());
      this.addModule(new FastBreakModule());
      this.addModule(new AntiVanishModule());
      this.addModule(new InteractRangeModule());
      this.addModule(new SpammerModule());
      this.addModule(new JargonModule());
      this.addModule(new ChatFilterModule());
      this.addModule(new ChatCleanerModule());
      this.addModule(new GameIdlerModule());
      this.addModule(new GamePlayModule());
      this.addModule(new Auto32KModule());
      this.addModule(new CakeEaterModule());
      this.addModule(new UnstuckModule());
      this.addModule(new AntiLevitationModule());
      this.addModule(new FakeForgeModule());
      if (var1 != class_6015.field_30645) {
         if (var1 == class_6015.field_30644) {
            this.addModule(new OtherActiveModsModule());
            this.addModule(new OtherTabGUIModule());
            this.addModule(new OtherNameTagsModule());
            this.addModule(new OtherESPModule());
            this.addModule(new OtherKeyStrokesModule());
         }
      } else {
         this.addModule(new TabGUIModule());
         this.addModule(new CompassModule());
         this.addModule(new CordsModule());
         this.addModule(new ShulkerInfoModule());
         this.addModule(new KeyStrokesModule());
         this.addModule(new MiniMapModule());
         this.addModule(new ActiveModsModule());
         this.addModule(new RearViewModule());
         this.addModule(new NameTagsModule());
         this.addModule(new WaypointsModule());
         this.addModule(new ProjectilesModule());
         this.addModule(new BrainFreezeModule());
         this.addModule(new Auto32KModule());
         this.addModule(new PortalGUIModule());
         this.addModule(new PortalGodModeModule());
         this.addModule(new MusicParticlesModule());
         this.addModule(new ESPModule());
         this.addModule(new AutoFishModule());
         this.addModule(new AutoCrystalModule());
         this.addModule(new AutoTotemModule());
         this.addModule(new NoteblockPlayerModule());
      }

      new class_4292();
      this.sortAndSub();
   }

   public JSONObjectImpl method_838(JSONObjectImpl var1) {
      JSONArray var4 = null;

      try {
         var4 = JSONWriter.saveStringValue2ig(var1, "mods");
      } catch (class_7584 var14) {
      }

      for (Module var6 : this.moduleMap.values()) {
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

            for (Module var9 : this.moduleMap.values()) {
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

      for (Module var18 : this.moduleMap.values()) {
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

      for (Module var6 : this.moduleMap.values()) {
         var4.method_6159(var6.loadFromJson(new JSONObjectImpl()));
      }

      var1.method_5820("mods", var4);
      return var1;
   }

   public void method_846() {
      long var3 = (long)this.method_840();

      for (Module var6 : this.moduleMap.values()) {
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
      Setting var3 = this.method_847(JesusModule.class).method_41996().get("Mode");
      String var4 = (String)var3.field_25890;
      var3.method_23037("Dolphin");
      var3.field_25890 = var4;
      return 0;
   }

   public Module method_847(Class<? extends Module> var1) {
      return this.moduleMap.get(var1);
   }

   public Module method_850(Class<? extends Module> var1) {
      if (var1.getSuperclass() == SecondModule.class) {
         SecondModule var4 = (SecondModule)this.moduleMap.get(var1.getSuperclass());

         for (Module var8 : var4.field_17661) {
            if (var8.getClass() == var1) {
               return var8;
            }
         }
      }

      return this.moduleMap.get(var1);
   }

   public Map<Class<? extends Module>, Module> method_843() {
      return this.moduleMap;
   }

   public List<Module> method_844(Category var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : this.moduleMap.values()) {
         if (var6.method_42004().equals(var1)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public List<Module> method_836() {
      ArrayList var3 = new ArrayList();

      for (Module var5 : this.moduleMap.values()) {
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
