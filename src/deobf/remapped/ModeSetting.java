package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting<String> {
   private List<String> field_13860 = new ArrayList<String>();
   private List<String> field_13859 = new ArrayList<String>();

   public ModeSetting(String var1, String var2, int var3, String... var4) {
      super(var1, var2, class_5195.field_26722, var4[var3]);
      this.field_13860 = Arrays.<String>asList(var4);
   }

   public ModeSetting(String var1, String var2, String var3, String... var4) {
      super(var1, var2, class_5195.field_26722, var3);
      this.field_13860 = Arrays.<String>asList(var4);
   }

   public ModeSetting method_12861(String... var1) {
      this.field_13859.addAll(Arrays.asList(var1));
      return this;
   }

   @Override
   public boolean method_23043() {
      return this.field_13859.size() > 0;
   }

   @Override
   public void method_23040() {
      this.field_13859.clear();
   }

   public String method_12857() {
      String var3 = this.field_25890;
      return !this.field_13859.contains(var3) ? (String)super.method_23031() : this.field_25891;
   }

   public int method_12858() {
      int var3 = 0;

      for (String var5 : this.field_13860) {
         if (var5.equals(this.field_25890)) {
            return var3;
         }

         var3++;
      }

      return 0;
   }

   public void method_12859(int var1) {
      if (var1 <= this.field_13860.size()) {
         String var4 = this.field_13860.get(var1);
         if (this.field_13859.contains(var4) && MinecraftClient.getInstance() != null) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Premium", "Not yet available for free version"));
         } else {
            this.method_23037(this.field_13860.get(var1));
         }
      }
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = JSONWriter.saveStringValue(var1, "value", this.method_23039());
      boolean var4 = false;

      for (String var6 : this.field_13860) {
         if (var6.equals(this.field_25890)) {
            var4 = true;
         }
      }

      if (!var4) {
         this.field_25890 = this.method_23039();
      }

      return var1;
   }

   public List<String> method_12860() {
      return this.field_13860;
   }
}
