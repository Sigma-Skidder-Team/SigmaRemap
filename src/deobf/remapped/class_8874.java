package remapped;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class class_8874 {
   private class_6349 field_45361;
   private final List<class_6349> field_45362 = new ArrayList<class_6349>();

   public class_8874(class_8874 var1) {
      this.field_45361 = var1.field_45361.method_29059();

      for (class_6349 var5 : var1.field_45362) {
         this.field_45362.add(var5.method_29059());
      }
   }

   public class_8874(String var1) {
      this.field_45361 = new class_5028(var1);
   }

   public class_8874(class_6349 var1) {
      this.field_45361 = var1.method_29059();
   }

   public class_8874 method_40827(class_6349 var1) {
      return this.method_40828(var1, class_4998.field_25860);
   }

   public class_8874 method_40828(class_6349 var1, class_4998 var2) {
      this.field_45362.add(this.field_45361);
      class_6349 var5 = this.field_45361;
      this.field_45361 = var1.method_29059();
      this.field_45361.method_29056(var5, var2, false);
      return this;
   }

   public class_8874 method_40829(class_6349[] var1) {
      return this.method_40830(var1, class_4998.field_25860);
   }

   public class_8874 method_40830(class_6349[] var1, class_4998 var2) {
      Preconditions.checkArgument(var1.length != 0, "No components to append");
      class_6349 var5 = this.field_45361;

      for (class_6349 var9 : var1) {
         this.field_45362.add(this.field_45361);
         this.field_45361 = var9.method_29059();
         this.field_45361.method_29056(var5, var2, false);
      }

      return this;
   }

   public class_8874 method_40823(String var1) {
      return this.method_40824(var1, class_4998.field_25860);
   }

   public class_8874 method_40835(String var1) {
      return this.method_40829(class_5028.method_23188(var1));
   }

   public class_8874 method_40824(String var1, class_4998 var2) {
      this.field_45362.add(this.field_45361);
      class_6349 var5 = this.field_45361;
      this.field_45361 = new class_5028(var1);
      this.field_45361.method_29056(var5, var2, false);
      return this;
   }

   public class_8874 method_40825(class_1713 var1) {
      return var1.method_7689(this, class_4998.field_25860);
   }

   public class_8874 method_40826(class_1713 var1, class_4998 var2) {
      return var1.method_7689(this, var2);
   }

   public class_8874 method_40837(class_2909 var1) {
      this.field_45361.method_29073(var1);
      return this;
   }

   public class_8874 method_40832(boolean var1) {
      this.field_45361.method_29050(var1);
      return this;
   }

   public class_8874 method_40840(boolean var1) {
      this.field_45361.method_29053(var1);
      return this;
   }

   public class_8874 method_40819(boolean var1) {
      this.field_45361.method_29068(var1);
      return this;
   }

   public class_8874 method_40831(boolean var1) {
      this.field_45361.method_29075(var1);
      return this;
   }

   public class_8874 method_40836(boolean var1) {
      this.field_45361.method_29082(var1);
      return this;
   }

   public class_8874 method_40839(String var1) {
      this.field_45361.method_29062(var1);
      return this;
   }

   public class_8874 method_40833(class_2257 var1) {
      this.field_45361.method_29060(var1);
      return this;
   }

   public class_8874 method_40834(class_5316 var1) {
      this.field_45361.method_29072(var1);
      return this;
   }

   public class_8874 method_40821() {
      return this.method_40820(class_4998.field_25858);
   }

   public class_8874 method_40820(class_4998 var1) {
      this.field_45361.method_29045(var1);
      return this;
   }

   public class_6349[] method_40822() {
      class_6349[] var3 = this.field_45362.<class_6349>toArray(new class_6349[this.field_45362.size() + 1]);
      var3[this.field_45362.size()] = this.field_45361;
      return var3;
   }
}
