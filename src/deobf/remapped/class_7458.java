package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class class_7458 extends class_2840<class_6560> implements AutoCloseable {
   private Map<Identifier, class_7373> field_37999;
   private class_6885 field_38007;
   private final class_9524 field_38002;
   private final TextureManager field_38005;
   private final class_4468 field_38006;
   private int field_38004;
   private class_7373 field_38001;
   private Object2IntMap<class_2522> field_38003;

   public class_7458(TextureManager var1, class_4468 var2, int var3) {
      this.field_38005 = var1;
      this.field_38006 = var2;
      this.field_38004 = var3;
      this.field_38002 = new class_9524(this);
   }

   public class_7373 method_33943(class_454 var1) {
      return this.field_37999.getOrDefault(var1, this.field_38001);
   }

   public class_7373 method_33942() {
      return this.field_38001;
   }

   public class_9524 method_33946() {
      return this.field_38002;
   }

   public class_6560 method_33948(class_7832 var1, class_3492 var2) {
      var2.method_16059();
      class_6560 var5 = new class_6560(var1, this.field_38006, var2, this.field_38004);
      var2.method_16052();
      return var5;
   }

   public void method_33945(class_6560 var1, class_7832 var2, class_3492 var3) {
      var3.method_16059();
      var3.startSection("upload");
      if (this.field_38007 != null) {
         this.field_38007.close();
      }

      this.field_38007 = var1.method_29938(this.field_38005, var3);
      this.field_37999 = var1.method_29936();
      this.field_38003 = var1.method_29944();
      this.field_38001 = this.field_37999.get(class_6560.field_33445);
      var3.method_16050("cache");
      this.field_38002.method_43943();
      var3.endSection();
      var3.method_16052();
   }

   public boolean method_33944(class_2522 var1, class_2522 var2) {
      if (var1 != var2) {
         int var5 = this.field_38003.getInt(var1);
         if (var5 != -1) {
            int var6 = this.field_38003.getInt(var2);
            if (var5 == var6) {
               class_4774 var7 = var1.method_8364();
               class_4774 var8 = var2.method_8364();
               return var7 != var8;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public class_8359 method_33947(Identifier var1) {
      return this.field_38007.method_31569(var1);
   }

   @Override
   public void close() {
      if (this.field_38007 != null) {
         this.field_38007.close();
      }
   }

   public void method_33949(int var1) {
      this.field_38004 = var1;
   }
}
