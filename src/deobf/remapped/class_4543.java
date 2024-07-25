package remapped;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_4543 {
   private static String[] field_22154;
   private final Map<Identifier, class_87> field_22153 = Maps.newHashMap();

   @Nullable
   public class_87 method_21079(Identifier var1) {
      return this.field_22153.get(var1);
   }

   public class_87 method_21081(Identifier var1, ITextComponent var2) {
      class_87 var5 = new class_87(var1, var2);
      this.field_22153.put(var1, var5);
      return var5;
   }

   public void method_21078(class_87 var1) {
      this.field_22153.remove(var1.method_216());
   }

   public Collection<Identifier> method_21075() {
      return this.field_22153.keySet();
   }

   public Collection<class_87> method_21074() {
      return this.field_22153.values();
   }

   public CompoundNBT method_21082() {
      CompoundNBT var3 = new CompoundNBT();

      for (class_87 var5 : this.field_22153.values()) {
         var3.method_25946(var5.method_216().toString(), var5.method_223());
      }

      return var3;
   }

   public void method_21077(CompoundNBT var1) {
      for (String var5 : var1.method_25952()) {
         Identifier var6 = new Identifier(var5);
         this.field_22153.put(var6, class_87.method_220(var1.method_25937(var5), var6));
      }
   }

   public void method_21076(class_9359 var1) {
      for (class_87 var5 : this.field_22153.values()) {
         var5.method_214(var1);
      }
   }

   public void method_21083(class_9359 var1) {
      for (class_87 var5 : this.field_22153.values()) {
         var5.method_215(var1);
      }
   }
}
