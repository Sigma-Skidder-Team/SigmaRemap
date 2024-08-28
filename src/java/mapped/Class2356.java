package mapped;

import com.google.common.collect.ForwardingList;

import java.util.List;

public class Class2356 extends ForwardingList<Class8848> {
   private static String[] field16169;
   private final Class25<Class8848> field16170 = Class25.<Class8848>method68(Class974.method4029(), Class8848.field39973);

   public List<Class8848> delegate() {
      return this.field16170;
   }

   public Class41 method9284() {
      Class41 var3 = new Class41();

      for (Class8848 var5 : this.delegate()) {
         var3.add(var5.method32112(new Class39()));
      }

      return var3;
   }

   public void method9285(Class41 var1) {
      List var4 = this.delegate();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         var4.set(var5, Class8848.method32104(var1.method153(var5)));
      }
   }

   public boolean isEmpty() {
      for (Class8848 var4 : this.delegate()) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }
}
