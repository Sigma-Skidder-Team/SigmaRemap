package remapped;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Module {
   public static MinecraftClient mcInstance = MinecraftClient.getInstance();
   public String field_46702;
   public String field_46701;
   public Category field_46696;
   public boolean moduleEnabled;
   public boolean field_46699;
   private boolean field_46698 = true;
   private static List<Class<? extends Module>> developmentModules = new ArrayList<Class<? extends Module>>();
   private Module field_46695 = null;
   private int field_46691 = 0;
   public Map<String, Setting> settingMap = new LinkedHashMap<String, Setting>();

   public Module(Category var1, String var2, String var3) {
      this.field_46696 = var1;
      this.field_46702 = var2;
      this.field_46701 = var3;
   }

   public void addSetting(Setting var1) {
      if (!this.settingMap.containsKey(var1.method_23032())) {
         this.settingMap.put(var1.method_23032(), var1);
      } else {
         throw new IllegalArgumentException("Attempted to add an option with the same name");
      }
   }

   public Object getSettingValueByName(String var1) {
      return this.settingMap.get(var1).method_23031();
   }

   public boolean getBooleanValueByName(String var1) {
      try {
         return Boolean.parseBoolean(this.getSettingValueByName(var1).toString());
      } catch (Exception var5) {
         return false;
      }
   }

   public float[] getMultiFloatValueByName(String var1) {
      Setting var4 = (Setting)this.getSettingValueByName(var1);
      return !(var4 instanceof SomeWeirdMultiFloatSetting) ? null : ((SomeWeirdMultiFloatSetting)var4).method_2111();
   }

   public int getIntValueByName(String var1) {
      try {
         return Integer.parseInt(this.getSettingValueByName(var1).toString());
      } catch (Exception var5) {
         return -1;
      }
   }

   public float getFloatValueByName(String var1) {
      try {
         return Float.parseFloat(this.getSettingValueByName(var1).toString());
      } catch (Exception var5) {
         return -1.0F;
      }
   }

   public String getStringValueByName(String var1) {
      try {
         return (String)this.getSettingValueByName(var1);
      } catch (Exception var5) {
         return null;
      }
   }

   public List<Setting> getListValueByName(String var1) {
      try {
         return ((class_4978)this.settingMap.get(var1)).method_9875();
      } catch (Exception var5) {
         return null;
      }
   }

   public void isValueObject(String var1, Object var2) {
      this.settingMap.get(var1).method_23037(var2);
   }

   public void isValueBoolean1(String var1, boolean var2) {
      this.settingMap.get(var1).method_23037(var2);
   }

   public void isValueInt(String var1, int var2) {
      this.settingMap.get(var1).method_23037(var2);
   }

   public void isValueBoolean2(String var1, boolean var2) {
      this.settingMap.get(var1).method_23037(var2);
   }

   public void isValueString(String var1, String var2) {
      this.settingMap.get(var1).method_23037(var2);
   }

   public void method_42019() {
      if (this.moduleEnabled) {
         this.onDisable();
      }

      this.moduleEnabled = false;
      this.field_46699 = true;

      for (Setting var4 : this.settingMap.values()) {
         var4.method_23041();
      }
   }

   public JSONObjectImpl saveToJson(JSONObjectImpl var1) {
      JSONArray var4 = JSONWriter.saveStringValue2ig(var1, "options");

      try {
         this.moduleEnabled = var1.method_5826("enabled");
      } catch (class_7584 var14) {
      }

      try {
         this.field_46699 = var1.method_5826("allowed");
      } catch (class_7584 var13) {
      }

      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            JSONObjectImpl var6 = var4.method_6143(var5);
            String var7 = null;

            try {
               var7 = JSONWriter.saveStringValue(var6, "name", null);
            } catch (class_7584 var12) {
            }

            for (Setting var9 : this.settingMap.values()) {
               if (var9.method_23032().equals(var7)) {
                  try {
                     var9.saveDataToJson(var6);
                  } catch (class_7584 var11) {
                     SigmaMainClass.getInstance()
                        .method_3326()
                        .method_12862("Could not initialize settings of " + this.method_41992() + "." + var9.method_23032() + " from config.");
                  }
                  break;
               }
            }
         }
      }

      if (this.moduleEnabled && mcInstance.field_9601 != null) {
         this.onEnable();
      }

      return var1;
   }

   public JSONObjectImpl loadFromJson(JSONObjectImpl var1) {
      var1.method_5820("name", this.method_41992());
      var1.method_5823("enabled", this.moduleEnabled);
      var1.method_5823("allowed", this.method_41994());
      JSONArray var4 = new JSONArray();

      for (Setting var6 : this.settingMap.values()) {
         var4.method_6159(var6.loadDataFromJson(new JSONObjectImpl()));
      }

      var1.method_5820("options", var4);
      return var1;
   }

   public void onEnable() {
      if (this.getClass().isAnnotationPresent(InDevelopment.class) && !developmentModules.contains(this.getClass())) {
         SigmaMainClass.getInstance().method_3326().method_12862("This mod is still in development. Be careful!");
         developmentModules.add(this.getClass());
      }
   }

   public void onDisable() {
   }

   public boolean method_42003() {
      return this.method_42015();
   }

   public Map<String, Setting> method_41996() {
      return this.settingMap;
   }

   public String method_41987() {
      return this.field_46702;
   }

   public String method_41992() {
      return this.field_46702;
   }

   public String method_42001() {
      return this.field_46701;
   }

   public Category method_42004() {
      if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30644 && this.field_46696 == Category.ITEM) {
         return Category.PLAYER;
      } else {
         return SigmaMainClass.getInstance().method_3312() == class_6015.field_30644 && this.field_46696 == Category.EXPLOIT
            ? Category.MISC
            : this.field_46696;
      }
   }

   public int method_41990() {
      return this.field_46691;
   }

   public Category method_41998() {
      return this.field_46696;
   }

   public boolean method_42015() {
      if (SigmaMainClass.getInstance().method_3312() != class_6015.field_30642) {
         return SigmaMainClass.getInstance().method_3312() == class_6015.field_30644 && !this.method_42013() ? false : this.moduleEnabled;
      } else {
         return false;
      }
   }

   public void setEnabled(boolean var1) {
      if (this.moduleEnabled != var1) {
         if (!(this.moduleEnabled = var1)) {
            SigmaMainClass.getInstance().eventManager().subscribeEvent(this);
            this.onDisable();
         } else {
            SigmaMainClass.getInstance().eventManager().unsubscribeEvent(this);
            this.onEnable();
         }
      }

      SigmaMainClass.getInstance().getModuleManager().method_835().method_370(this);
   }

   public void method_42018(boolean var1) {
      this.moduleEnabled = var1;
      if (!this.moduleEnabled) {
         SigmaMainClass.getInstance().eventManager().subscribeEvent(this);
      } else {
         SigmaMainClass.getInstance().eventManager().unsubscribeEvent(this);
      }
   }

   public void method_41991(boolean var1) {
      if (this.moduleEnabled != var1) {
         if (!(this.moduleEnabled = var1)) {
            SigmaMainClass.getInstance().eventManager().subscribeEvent(this);
            if (!(this instanceof SecondModule)) {
               if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30645
                  && SigmaMainClass.getInstance().getModuleManager().method_847(class_8438.class).getBooleanValueByName("Sound")) {
                  SigmaMainClass.getInstance().method_3315().method_21206("deactivate");
               }

               if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30644
                  && SigmaMainClass.getInstance().getModuleManager().method_847(class_4221.class).getBooleanValueByName("Sound")) {
                  MinecraftClient.getInstance().method_8590().method_16345(class_4949.method_22675(class_463.field_2870, 0.6F));
               }
            }

            this.onDisable();
         } else {
            SigmaMainClass.getInstance().eventManager().unsubscribeEvent(this);
            if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30645
               && SigmaMainClass.getInstance().getModuleManager().method_847(class_8438.class).getBooleanValueByName("Sound")) {
               SigmaMainClass.getInstance().method_3315().method_21206("activate");
            }

            if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30644
               && SigmaMainClass.getInstance().getModuleManager().method_847(class_4221.class).getBooleanValueByName("Sound")) {
               MinecraftClient.getInstance().method_8590().method_16345(class_4949.method_22675(class_463.field_2870, 0.7F));
            }

            this.onEnable();
            this.field_46691++;
         }
      }

      SigmaMainClass.getInstance().getModuleManager().method_835().method_370(this);
   }

   public void method_41999() {
      if (this.method_42015()) {
         this.method_41991(false);
      } else {
         this.method_41991(true);
      }
   }

   public boolean method_41994() {
      return this.field_46699;
   }

   public void method_41989(boolean var1) {
      this.field_46699 = var1;
   }

   public void method_41995(Module var1) {
      this.field_46695 = var1;
   }

   public Module method_42017() {
      return this.field_46695 != null ? this.field_46695 : this;
   }

   public void method_42011(boolean var1) {
      this.field_46698 = var1;
   }

   public boolean method_42013() {
      return this.field_46698;
   }

   public void method_42012() {
   }
}
