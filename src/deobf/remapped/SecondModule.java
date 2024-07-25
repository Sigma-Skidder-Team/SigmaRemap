package remapped;

import java.util.ArrayList;
import java.util.List;

public class SecondModule extends Module {
   public Module[] field_17661;
   public Module field_17664;
   private List<String> field_17660 = new ArrayList<String>();
   public ModeSetting field_17659;
   private final List<class_713> field_17662 = new ArrayList<class_713>();

   public SecondModule(Category var1, String var2, String var3, Module... var4) {
      super(var1, var2, var3);
      this.field_17661 = var4;

      for (Module var10 : this.field_17661) {
         SigmaMainClass.getInstance().getEventManager().method_7908(var10);
         this.field_17660.add(var10.getName());
         var10.method_41995(this);
      }

      this.addSetting(this.field_17659 = new ModeSetting("Type", var2 + " mode", 0, this.field_17660.<String>toArray(new String[0])));
      this.field_17659.setModeClass(var1x -> this.method_16866());
      this.method_16866();
   }

   public void method_16866() {
      this.method_16862();

      for (Module var6 : this.field_17661) {
         boolean var7 = this.getStringValueByName("Type").equals(var6.name);
         if (this.method_42015() && client.thePlayer != null) {
            var6.method_42023(var7);
            if (var7) {
               this.field_17664 = var6;
            }
         } else if (this.method_42015()) {
            var6.setEnabled1(var7);
         }

         this.method_16863(var6, var7);
      }
   }

   private void method_16862() {
      boolean var3 = false;

      for (Module var7 : this.field_17661) {
         if (this.getStringValueByName("Type").equals(var7.name)) {
            var3 = true;
         }
      }

      if (!var3) {
         this.isValueString("Type", this.field_17661[0].name);
      }
   }

   public Module method_16864() {
      this.method_16862();

      for (Module var6 : this.field_17661) {
         if (this.getStringValueByName("Type").equals(var6.name)) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public boolean method_42003() {
      if (this.field_17664 == null) {
         this.method_16866();
      }

      return this.field_17664 != null ? this.field_17664.method_42003() : this.method_42015();
   }

   @Override
   public JSONObjectImpl saveToJson(JSONObjectImpl var1) {
      JSONObjectImpl var4 = JSONWriter.saveStringValue(var1, "sub-options");
      if (var4 != null) {
         for (Module var8 : this.field_17661) {
            JSONArray var9 = JSONWriter.saveStringValue2ig(var4, var8.getName());
            if (var9 != null) {
               for (int var10 = 0; var10 < var9.method_6142(); var10++) {
                  JSONObjectImpl var11 = var9.method_6143(var10);
                  String var12 = null;

                  try {
                     var12 = JSONWriter.saveStringValue(var11, "name", null);
                  } catch (class_7584 var17) {
                  }

                  for (Setting var14 : var8.settingMap.values()) {
                     if (var14.getName().equals(var12)) {
                        try {
                           var14.saveDataToJson(var11);
                        } catch (class_7584 var16) {
                           SigmaMainClass.getInstance()
                              .method_3326()
                              .method_12862("Could not initialize settings of " + var8.getName() + "." + var14.getName() + " from config.");
                        }
                        break;
                     }
                  }
               }
            }
         }
      }

      JSONObjectImpl var18 = super.saveToJson(var1);
      if (this.field_46700) {
         this.method_16866();
      }

      return var18;
   }

   @Override
   public JSONObjectImpl loadFromJson(JSONObjectImpl var1) {
      JSONObjectImpl var4 = new JSONObjectImpl();

      for (Module var8 : this.field_17661) {
         JSONArray var9 = new JSONArray();

         for (Setting var11 : var8.settingMap.values()) {
            var9.method_6159(var11.loadDataFromJson(new JSONObjectImpl()));
         }

         var4.method_5820(var8.getName(), var9);
      }

      var1.method_5820("sub-options", var4);
      return super.loadFromJson(var1);
   }

   @Override
   public void onEnable() {
      this.method_16866();
      if (this.field_17664 instanceof PremiumModule && !SigmaMainClass.getInstance().getAccountManager().method_23084()) {
         this.setEnabled1(false);
      }
   }

   @Override
   public void onDisable() {
      for (Module var6 : this.field_17661) {
         var6.setEnabled2(false);
      }
   }

   @Override
   public void method_42019() {
      for (Module var6 : this.field_17661) {
         var6.setEnabled(false);
      }

      super.method_42019();
   }

   public final SecondModule method_16865(class_713 var1) {
      this.field_17662.add(var1);
      return this;
   }

   public final void method_16863(Module var1, boolean var2) {
      for (class_713 var6 : this.field_17662) {
         var6.method_3268(this, var1, var2);
      }
   }

   @Override
   public void method_42012() {
      super.method_42012();

      for (Module var6 : this.field_17661) {
         var6.method_42012();
      }
   }
}
