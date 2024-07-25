package remapped;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;

public class class_495 extends class_9394 {
   private static String[] field_3077;
   private final Set<class_9359> field_3074 = Sets.newHashSet();
   private final Set<class_9359> field_3075 = Collections.<class_9359>unmodifiableSet(this.field_3074);
   private boolean field_3076 = true;

   public class_495(ITextComponent var1, class_1062 var2, class_2976 var3) {
      super(MathHelper.getRandomUUID(), var1, var2, var3);
   }

   @Override
   public void method_43459(float var1) {
      if (var1 != this.field_48004) {
         super.method_43459(var1);
         this.method_2407(class_8891.field_45612);
      }
   }

   @Override
   public void method_43452(class_1062 var1) {
      if (var1 != this.field_48003) {
         super.method_43452(var1);
         this.method_2407(class_8891.field_45609);
      }
   }

   @Override
   public void method_43458(class_2976 var1) {
      if (var1 != this.field_48002) {
         super.method_43458(var1);
         this.method_2407(class_8891.field_45609);
      }
   }

   @Override
   public class_9394 method_43461(boolean var1) {
      if (var1 != this.field_47999) {
         super.method_43461(var1);
         this.method_2407(class_8891.field_45610);
      }

      return this;
   }

   @Override
   public class_9394 method_43457(boolean var1) {
      if (var1 != this.field_48000) {
         super.method_43457(var1);
         this.method_2407(class_8891.field_45610);
      }

      return this;
   }

   @Override
   public class_9394 method_43463(boolean var1) {
      if (var1 != this.field_48001) {
         super.method_43463(var1);
         this.method_2407(class_8891.field_45610);
      }

      return this;
   }

   @Override
   public void method_43451(ITextComponent var1) {
      if (!Objects.equal(var1, this.field_48006)) {
         super.method_43451(var1);
         this.method_2407(class_8891.field_45608);
      }
   }

   private void method_2407(class_8891 var1) {
      if (this.field_3076) {
         class_9889 var4 = new class_9889(var1, this);

         for (class_9359 var6 : this.field_3074) {
            var6.field_47794.method_4156(var4);
         }
      }
   }

   public void method_2403(class_9359 var1) {
      if (this.field_3074.add(var1) && this.field_3076) {
         var1.field_47794.method_4156(new class_9889(class_8891.field_45606, this));
      }
   }

   public void method_2405(class_9359 var1) {
      if (this.field_3074.remove(var1) && this.field_3076) {
         var1.field_47794.method_4156(new class_9889(class_8891.field_45607, this));
      }
   }

   public void method_2408() {
      if (!this.field_3074.isEmpty()) {
         for (class_9359 var4 : Lists.newArrayList(this.field_3074)) {
            this.method_2405(var4);
         }
      }
   }

   public boolean method_2409() {
      return this.field_3076;
   }

   public void method_2404(boolean var1) {
      if (var1 != this.field_3076) {
         this.field_3076 = var1;

         for (class_9359 var5 : this.field_3074) {
            var5.field_47794.method_4156(new class_9889(!var1 ? class_8891.field_45607 : class_8891.field_45606, this));
         }
      }
   }

   public Collection<class_9359> method_2406() {
      return this.field_3075;
   }
}
