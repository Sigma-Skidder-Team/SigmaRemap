package mapped;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class Class9571 {
   private Class7626 field44566;
   private final List<Class7626> field44567 = new ArrayList<Class7626>();

   public Class9571(Class9571 var1) {
      this.field44566 = var1.field44566.method24990();

      for (Class7626 var5 : var1.field44567) {
         this.field44567.add(var5.method24990());
      }
   }

   public Class9571(String var1) {
      this.field44566 = new Class7630(var1);
   }

   public Class9571(Class7626 var1) {
      this.field44566 = var1.method24990();
   }

   public Class9571 method37114(Class7626 var1) {
      return this.method37115(var1, Class2081.field13558);
   }

   public Class9571 method37115(Class7626 var1, Class2081 var2) {
      this.field44567.add(this.field44566);
      Class7626 var5 = this.field44566;
      this.field44566 = var1.method24990();
      this.field44566.method24993(var5, var2, false);
      return this;
   }

   public Class9571 method37116(Class7626[] var1) {
      return this.method37117(var1, Class2081.field13558);
   }

   public Class9571 method37117(Class7626[] var1, Class2081 var2) {
      Preconditions.checkArgument(var1.length != 0, "No components to append");
      Class7626 var5 = this.field44566;

      for (Class7626 var9 : var1) {
         this.field44567.add(this.field44566);
         this.field44566 = var9.method24990();
         this.field44566.method24993(var5, var2, false);
      }

      return this;
   }

   public Class9571 method37118(String var1) {
      return this.method37120(var1, Class2081.field13558);
   }

   public Class9571 method37119(String var1) {
      return this.method37116(Class7630.method25042(var1));
   }

   public Class9571 method37120(String var1, Class2081 var2) {
      this.field44567.add(this.field44566);
      Class7626 var5 = this.field44566;
      this.field44566 = new Class7630(var1);
      this.field44566.method24993(var5, var2, false);
      return this;
   }

   public Class9571 method37121(Class7304 var1) {
      return var1.method23078(this, Class2081.field13558);
   }

   public Class9571 method37122(Class7304 var1, Class2081 var2) {
      return var1.method23078(this, var2);
   }

   public Class9571 method37123(ChatFormatting var1) {
      this.field44566.method25017(var1);
      return this;
   }

   public Class9571 method37124(boolean var1) {
      this.field44566.method25018(var1);
      return this;
   }

   public Class9571 method37125(boolean var1) {
      this.field44566.method25019(var1);
      return this;
   }

   public Class9571 method37126(boolean var1) {
      this.field44566.method25020(var1);
      return this;
   }

   public Class9571 method37127(boolean var1) {
      this.field44566.method25021(var1);
      return this;
   }

   public Class9571 method37128(boolean var1) {
      this.field44566.method25022(var1);
      return this;
   }

   public Class9571 method37129(String var1) {
      this.field44566.method25023(var1);
      return this;
   }

   public Class9571 method37130(Class7576 var1) {
      this.field44566.method25024(var1);
      return this;
   }

   public Class9571 method37131(Class8632 var1) {
      this.field44566.method25025(var1);
      return this;
   }

   public Class9571 method37132() {
      return this.method37133(Class2081.field13555);
   }

   public Class9571 method37133(Class2081 var1) {
      this.field44566.method24994(var1);
      return this;
   }

   public Class7626[] method37134() {
      Class7626[] var3 = this.field44567.<Class7626>toArray(new Class7626[this.field44567.size() + 1]);
      var3[this.field44567.size()] = this.field44566;
      return var3;
   }
}
