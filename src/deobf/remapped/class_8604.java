package remapped;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;

public class class_8604 {
   private static String[] field_44064;
   private final Collection<class_4085> field_44065 = Lists.newArrayList();
   private Collection<class_6685> field_44063 = Lists.newArrayList();

   public class_8604() {
   }

   public class_8604(Collection<class_4085> var1) {
      this.field_44065.addAll(var1);
   }

   public void method_39548(class_4085 var1) {
      this.field_44065.add(var1);
      this.field_44063.forEach(var1::method_18848);
   }

   public void method_39546(class_6685 var1) {
      this.field_44063.add(var1);
      this.field_44065.forEach(var1x -> var1x.method_18848(var1));
   }

   public void method_39550(Consumer<class_4085> var1) {
      this.method_39546(new class_8797(this, var1));
   }

   public int method_39545() {
      return (int)this.field_44065.stream().filter(class_4085::method_18844).filter(class_4085::method_18838).count();
   }

   public int method_39549() {
      return (int)this.field_44065.stream().filter(class_4085::method_18844).filter(class_4085::method_18842).count();
   }

   public int method_39543() {
      return (int)this.field_44065.stream().filter(class_4085::method_18828).count();
   }

   public boolean method_39547() {
      return this.method_39545() > 0;
   }

   public boolean method_39552() {
      return this.method_39549() > 0;
   }

   public int method_39551() {
      return this.field_44065.size();
   }

   public boolean method_39541() {
      return this.method_39543() == this.method_39551();
   }

   public String method_39542() {
      StringBuffer var3 = new StringBuffer();
      var3.append('[');
      this.field_44065.forEach(var1 -> {
         if (var1.method_18827()) {
            if (!var1.method_18829()) {
               if (!var1.method_18844()) {
                  var3.append('_');
               } else {
                  var3.append((char)(!var1.method_18838() ? 'x' : 'X'));
               }
            } else {
               var3.append('+');
            }
         } else {
            var3.append(' ');
         }
      });
      var3.append(']');
      return var3.toString();
   }

   @Override
   public String toString() {
      return this.method_39542();
   }
}
