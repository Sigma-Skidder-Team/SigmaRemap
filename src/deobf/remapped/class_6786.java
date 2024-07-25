package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import javax.annotation.Nullable;

public class class_6786 extends class_3757 {
   private class_4639 field_34997 = new class_4639("empty");
   private class_4639 field_34998 = new class_4639("empty");
   private class_4639 field_34995 = new class_4639("empty");
   private class_1252 field_34996 = class_1252.field_6897;
   private String field_34994 = "minecraft:air";

   public class_6786(class_133<?> var1) {
      super(var1);
   }

   public class_6786() {
      this(class_133.field_355);
   }

   public class_4639 method_31111() {
      return this.field_34997;
   }

   public class_4639 method_31102() {
      return this.field_34998;
   }

   public class_4639 method_31108() {
      return this.field_34995;
   }

   public String method_31106() {
      return this.field_34994;
   }

   public class_1252 method_31103() {
      return this.field_34996;
   }

   public void method_31105(class_4639 var1) {
      this.field_34997 = var1;
   }

   public void method_31109(class_4639 var1) {
      this.field_34998 = var1;
   }

   public void method_31104(class_4639 var1) {
      this.field_34995 = var1;
   }

   public void method_31110(String var1) {
      this.field_34994 = var1;
   }

   public void method_31107(class_1252 var1) {
      this.field_34996 = var1;
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      var1.method_25941("name", this.field_34997.toString());
      var1.method_25941("target", this.field_34998.toString());
      var1.method_25941("pool", this.field_34995.toString());
      var1.method_25941("final_state", this.field_34994);
      var1.method_25941("joint", this.field_34996.method_21049());
      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_34997 = new class_4639(var2.method_25965("name"));
      this.field_34998 = new class_4639(var2.method_25965("target"));
      this.field_34995 = new class_4639(var2.method_25965("pool"));
      this.field_34994 = var2.method_25965("final_state");
      this.field_34996 = class_1252.method_5640(var2.method_25965("joint"))
         .orElseGet(() -> !class_195.method_860(var1).method_1029().method_42629() ? class_1252.field_6897 : class_1252.field_6898);
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 12, this.method_17414());
   }

   @Override
   public class_5734 method_17414() {
      return this.method_17396(new class_5734());
   }

   public void method_31112(class_6331 var1, int var2, boolean var3) {
      class_6541 var6 = var1.method_28945().method_10189();
      class_5799 var7 = var1.method_28978();
      class_2033 var8 = var1.method_28991();
      Random var9 = var1.method_43360();
      class_1331 var10 = this.method_17399();
      ArrayList var11 = Lists.newArrayList();
      class_6561 var12 = new class_6561();
      var12.method_29976(var1, var10, new class_1331(1, 1, 1), false, (class_6414)null);
      class_8781 var13 = new class_8781(var12);
      class_7624 var14 = new class_7624(var7, var13, var10, 1, class_6631.field_34340, new class_9616(var10, var10));
      class_6006.method_27409(var1.method_2755(), var14, var2, class_7624::new, var6, var7, var11, var9);

      for (class_7624 var16 : var11) {
         var16.method_34557(var1, var8, var6, var9, class_9616.method_44389(), var10, var3);
      }
   }
}
