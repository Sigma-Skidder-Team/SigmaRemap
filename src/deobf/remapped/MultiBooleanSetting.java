package remapped;

import java.util.Arrays;
import java.util.List;

public abstract class MultiBooleanSetting extends Setting<Boolean> {
   public List<Setting> field_10581;

   public MultiBooleanSetting(String var1, String var2, class_5195 var3, boolean var4, List<Setting> var5) {
      super(var1, var2, var3, var4);
      this.field_10581 = var5;
   }

   public MultiBooleanSetting(String var1, String var2, class_5195 var3, boolean var4, Setting... var5) {
      this(var1, var2, var3, var4, Arrays.<Setting>asList(var5));
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      class_1336 var4 = class_3332.method_15293(var1, this.method_23032());
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            JSONObjectImpl var6 = var4.method_6143(var5);
            String var7 = class_3332.method_15291(var1, "name", null);

            for (Setting var9 : this.method_9875()) {
               if (var9.method_23032().equals(var7)) {
                  var9.saveDataToJson(var6);
                  break;
               }
            }
         }
      }

      this.field_25890 = class_3332.method_15294(var1, "value", this.method_23039());
      return var1;
   }

   @Override
   public JSONObjectImpl loadDataFromJson(JSONObjectImpl var1) {
      class_1336 var4 = new class_1336();

      for (Setting var6 : this.method_9875()) {
         var4.method_6159(var6.loadDataFromJson(new JSONObjectImpl()));
      }

      var1.method_5820("children", var4);
      var1.method_5820("name", this.method_23032());
      return super.loadDataFromJson(var1);
   }

   public List<Setting> method_9875() {
      return this.field_10581;
   }
}
