package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class_6642 implements class_6310<class_392> {
   private static String[] field_34377;
   private boolean field_34375;
   private Map<class_4639, class_3321> field_34376;
   private Set<class_4639> field_34379;
   private Map<class_4639, class_3604> field_34378;

   public class_6642() {
   }

   public class_6642(boolean var1, Collection<class_3139> var2, Set<class_4639> var3, Map<class_4639, class_3604> var4) {
      this.field_34375 = var1;
      this.field_34376 = Maps.newHashMap();

      for (class_3139 var8 : var2) {
         this.field_34376.put(var8.method_14520(), var8.method_14514());
      }

      this.field_34379 = var3;
      this.field_34378 = Maps.newHashMap(var4);
   }

   public void method_30517(class_392 var1) {
      var1.method_1926(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_34375 = var1.readBoolean();
      this.field_34376 = Maps.newHashMap();
      this.field_34379 = Sets.newLinkedHashSet();
      this.field_34378 = Maps.newHashMap();
      int var4 = var1.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         class_4639 var6 = var1.method_37768();
         class_3321 var7 = class_3321.method_15267(var1);
         this.field_34376.put(var6, var7);
      }

      var4 = var1.method_37778();

      for (int var10 = 0; var10 < var4; var10++) {
         class_4639 var12 = var1.method_37768();
         this.field_34379.add(var12);
      }

      var4 = var1.method_37778();

      for (int var11 = 0; var11 < var4; var11++) {
         class_4639 var13 = var1.method_37768();
         this.field_34378.put(var13, class_3604.method_16808(var1));
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeBoolean(this.field_34375);
      var1.method_37743(this.field_34376.size());

      for (Entry var5 : this.field_34376.entrySet()) {
         class_4639 var6 = (class_4639)var5.getKey();
         class_3321 var7 = (class_3321)var5.getValue();
         var1.method_37780(var6);
         var7.method_15256(var1);
      }

      var1.method_37743(this.field_34379.size());

      for (class_4639 var10 : this.field_34379) {
         var1.method_37780(var10);
      }

      var1.method_37743(this.field_34378.size());

      for (Entry var11 : this.field_34378.entrySet()) {
         var1.method_37780((class_4639)var11.getKey());
         ((class_3604)var11.getValue()).method_16813(var1);
      }
   }

   public Map<class_4639, class_3321> method_30516() {
      return this.field_34376;
   }

   public Set<class_4639> method_30515() {
      return this.field_34379;
   }

   public Map<class_4639, class_3604> method_30514() {
      return this.field_34378;
   }

   public boolean method_30513() {
      return this.field_34375;
   }
}
