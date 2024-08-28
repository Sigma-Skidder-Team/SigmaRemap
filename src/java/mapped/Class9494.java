package mapped;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;

public class Class9494 {
   private static String[] field44118;
   private final Collection<Class8262> field44119 = Lists.newArrayList();
   private Collection<Class8405> field44120 = Lists.newArrayList();

   public Class9494() {
   }

   public Class9494(Collection<Class8262> var1) {
      this.field44119.addAll(var1);
   }

   public void method36669(Class8262 var1) {
      this.field44119.add(var1);
      this.field44120.forEach(var1::method28816);
   }

   public void method36670(Class8405 var1) {
      this.field44120.add(var1);
      this.field44119.forEach(var1x -> var1x.method28816(var1));
   }

   public void method36671(Consumer<Class8262> var1) {
      this.method36670(new Class8407(this, var1));
   }

   public int method36672() {
      return (int)this.field44119.stream().filter(Class8262::method28810).filter(Class8262::method28818).count();
   }

   public int method36673() {
      return (int)this.field44119.stream().filter(Class8262::method28810).filter(Class8262::method28819).count();
   }

   public int method36674() {
      return (int)this.field44119.stream().filter(Class8262::method28812).count();
   }

   public boolean method36675() {
      return this.method36672() > 0;
   }

   public boolean method36676() {
      return this.method36673() > 0;
   }

   public int method36677() {
      return this.field44119.size();
   }

   public boolean method36678() {
      return this.method36674() == this.method36677();
   }

   public String method36679() {
      StringBuffer var3 = new StringBuffer();
      var3.append('[');
      this.field44119.forEach(var1 -> {
         if (var1.method28811()) {
            if (!var1.method28809()) {
               if (!var1.method28810()) {
                  var3.append('_');
               } else {
                  var3.append((char)(!var1.method28818() ? 'x' : 'X'));
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
      return this.method36679();
   }
}
