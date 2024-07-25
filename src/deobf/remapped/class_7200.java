package remapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class_7200 {
   private static String[] field_37010;
   private final Map<class_2451, class_4827> field_37008 = Maps.newHashMap();
   private int field_37009;

   public boolean method_32954(class_2451 var1) {
      return this.method_32960(var1, 0.0F) > 0.0F;
   }

   public float method_32960(class_2451 var1, float var2) {
      class_4827 var5 = this.field_37008.get(var1);
      if (var5 == null) {
         return 0.0F;
      } else {
         float var6 = (float)(class_4827.method_22216(var5) - class_4827.method_22215(var5));
         float var7 = (float)class_4827.method_22216(var5) - ((float)this.field_37009 + var2);
         return MathHelper.clamp(var7 / var6, 0.0F, 1.0F);
      }
   }

   public void method_32959() {
      this.field_37009++;
      if (!this.field_37008.isEmpty()) {
         Iterator var3 = this.field_37008.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            if (class_4827.method_22216((class_4827)var4.getValue()) <= this.field_37009) {
               var3.remove();
               this.method_32955((class_2451)var4.getKey());
            }
         }
      }
   }

   public void method_32957(class_2451 var1, int var2) {
      this.field_37008.put(var1, new class_4827(this, this.field_37009, this.field_37009 + var2, null));
      this.method_32958(var1, var2);
   }

   public void method_32961(class_2451 var1) {
      this.field_37008.remove(var1);
      this.method_32955(var1);
   }

   public void method_32958(class_2451 var1, int var2) {
   }

   public void method_32955(class_2451 var1) {
   }
}
