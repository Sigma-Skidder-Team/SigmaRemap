package remapped;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3904 {
   private static final Logger field_18986 = LogManager.getLogger();
   private final Map<Identifier, class_3139> field_18984 = Maps.newHashMap();
   private final Set<class_3139> field_18987 = Sets.newLinkedHashSet();
   private final Set<class_3139> field_18983 = Sets.newLinkedHashSet();
   private class_3869 field_18985;

   private void method_18074(class_3139 var1) {
      for (class_3139 var5 : var1.method_14516()) {
         this.method_18074(var5);
      }

      field_18986.info("Forgot about advancement {}", var1.method_14520());
      this.field_18984.remove(var1.method_14520());
      if (var1.method_14510() != null) {
         this.field_18983.remove(var1);
         if (this.field_18985 != null) {
            this.field_18985.method_17927(var1);
         }
      } else {
         this.field_18987.remove(var1);
         if (this.field_18985 != null) {
            this.field_18985.method_17925(var1);
         }
      }
   }

   public void method_18081(Set<Identifier> var1) {
      for (Identifier var5 : var1) {
         class_3139 var6 = this.field_18984.get(var5);
         if (var6 != null) {
            this.method_18074(var6);
         } else {
            field_18986.warn("Told to remove advancement {} but I don't know what that is", var5);
         }
      }
   }

   public void method_18079(Map<Identifier, class_3321> var1) {
      Function var4 = Functions.forMap(this.field_18984, (class_3139)null);

      while (!var1.isEmpty()) {
         boolean var5 = false;
         Iterator var6 = var1.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Identifier var8 = (Identifier)var7.getKey();
            class_3321 var9 = (class_3321)var7.getValue();
            if (var9.method_15264(var4)) {
               class_3139 var10 = var9.method_15268(var8);
               this.field_18984.put(var8, var10);
               var5 = true;
               var6.remove();
               if (var10.method_14510() != null) {
                  this.field_18983.add(var10);
                  if (this.field_18985 != null) {
                     this.field_18985.method_17924(var10);
                  }
               } else {
                  this.field_18987.add(var10);
                  if (this.field_18985 != null) {
                     this.field_18985.method_17923(var10);
                  }
               }
            }
         }

         if (!var5) {
            for (Entry var12 : var1.entrySet()) {
               field_18986.error("Couldn't load advancement {}: {}", var12.getKey(), var12.getValue());
            }
            break;
         }
      }

      field_18986.info("Loaded {} advancements", this.field_18984.size());
   }

   public void method_18073() {
      this.field_18984.clear();
      this.field_18987.clear();
      this.field_18983.clear();
      if (this.field_18985 != null) {
         this.field_18985.method_17926();
      }
   }

   public Iterable<class_3139> method_18077() {
      return this.field_18987;
   }

   public Collection<class_3139> method_18076() {
      return this.field_18984.values();
   }

   @Nullable
   public class_3139 method_18078(Identifier var1) {
      return this.field_18984.get(var1);
   }

   public void method_18080(class_3869 var1) {
      this.field_18985 = var1;
      if (var1 != null) {
         for (class_3139 var5 : this.field_18987) {
            var1.method_17923(var5);
         }

         for (class_3139 var7 : this.field_18983) {
            var1.method_17924(var7);
         }
      }
   }
}
