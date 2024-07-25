package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_3912 implements class_7641 {
   private final String field_19003;
   public long field_19005;
   public long field_19002;
   public long field_19004;
   public class_7641 field_19001;
   public final List<class_7641> field_19006;

   public class_3912(String var1) {
      this.field_19003 = var1;
      this.field_19006 = new ArrayList<class_7641>(4);
   }

   public void method_18112(class_7641 var1, long var2, long var4, long var6) {
      this.field_19005 = var2;
      this.field_19002 = var4;
      this.field_19001 = var1;
      this.field_19004 = var6;
   }

   public long method_18113(class_6041 var1) throws IOException {
      return this.field_19004 + this.field_19005 - var1.method_27526();
   }

   public void method_18109(class_6041 var1) throws IOException {
   }

   @Override
   public long method_34615() {
      return this.field_19002;
   }

   @Override
   public long method_34606() {
      return this.field_19005;
   }

   @Override
   public long method_34613() {
      return this.field_19004;
   }

   @Override
   public class_7641 method_34610() {
      return this.field_19001;
   }

   @Override
   public String method_34609() {
      return this.field_19003;
   }

   @Override
   public String toString() {
      return this.field_19003 + " [" + class_645.method_2970(this.field_19002) + "]";
   }

   @Override
   public boolean method_34614() {
      return this.field_19006.size() > 0;
   }

   @Override
   public boolean method_34608(long var1) {
      boolean var5 = false;

      for (class_7641 var7 : this.field_19006) {
         if (var7.method_34615() == var1) {
            var5 = true;
            break;
         }
      }

      return var5;
   }

   @Override
   public class_7641 method_34607(long var1) {
      class_7641 var5 = null;
      Object var6 = null;

      for (int var7 = 0; var5 == null && var7 < this.field_19006.size(); var7++) {
         var6 = this.field_19006.get(var7);
         if (((class_7641)var6).method_34615() == var1) {
            var5 = (class_7641)var6;
         }
      }

      return var5;
   }

   @Override
   public List<class_7641> method_34611() {
      return Collections.<class_7641>unmodifiableList(this.field_19006);
   }

   @Override
   public List<class_7641> method_34612(long var1) {
      ArrayList var5 = new ArrayList();

      for (class_7641 var7 : this.field_19006) {
         if (var7.method_34615() == var1) {
            var5.add(var7);
         }
      }

      return var5;
   }

   public void method_18110(class_6041 var1) throws IOException {
      while (var1.method_27526() < this.field_19004 + this.field_19005) {
         class_7641 var4 = class_645.method_2969(this, var1);
         this.field_19006.add(var4);
      }
   }

   public void method_18111(class_6041 var1, int var2) throws IOException {
      for (int var5 = 0; var5 < var2; var5++) {
         class_7641 var6 = class_645.method_2969(this, var1);
         this.field_19006.add(var6);
      }
   }
}
