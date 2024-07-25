package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class class_7151 {
   public final class_1862 field_36833;
   private String field_36830;
   public class_9199 field_36829;
   public class_7776 field_36832;
   public class_4251 field_36831;
   public class_7906 field_36828;

   public class_7151() {
      this(new class_4364(), new class_7776(), new class_4251(), new class_7906(), new class_1862());
   }

   public class_7151(class_4251 var1) {
      this(new class_4364(), new class_7776(), var1);
   }

   public class_7151(class_7906 var1) {
      this(new class_4364(), new class_7776(), new class_4251(), var1);
   }

   public class_7151(class_7776 var1) {
      this(new class_4364(), var1);
   }

   public class_7151(class_9199 var1) {
      this(var1, new class_7776());
   }

   public class_7151(class_9199 var1, class_7776 var2) {
      this(var1, var2, method_32817(var2));
   }

   private static class_4251 method_32817(class_7776 var0) {
      class_4251 var3 = new class_4251();
      var3.method_19804(var0.method_587());
      var3.method_19808(var0.method_593());
      var3.method_19825(var0.method_597().method_29220());
      var3.method_19811(var0.method_37559());
      return var3;
   }

   public class_7151(class_7776 var1, class_4251 var2) {
      this(new class_4364(), var1, var2, new class_7906(), new class_1862());
   }

   public class_7151(class_9199 var1, class_7776 var2, class_4251 var3) {
      this(var1, var2, var3, new class_7906(), new class_1862());
   }

   public class_7151(class_9199 var1, class_7776 var2, class_4251 var3, class_7906 var4) {
      this(var1, var2, var3, var4, new class_1862());
   }

   public class_7151(class_9199 var1, class_7776 var2, class_4251 var3, class_1862 var4) {
      this(var1, var2, var3, new class_7906(), var4);
   }

   public class_7151(class_9199 var1, class_7776 var2, class_4251 var3, class_7906 var4, class_1862 var5) {
      if (var1.method_42431()) {
         if (!var2.method_591()) {
            var2.method_599(var1.method_42416());
         }
      } else {
         var1.method_42429(var2.method_597());
      }

      this.field_36829 = var1;
      this.field_36829.method_42439(var4.method_35729());
      if (var3.method_19819() > var3.method_19801()) {
         var2.method_592(var3.method_19792());
         var2.method_594(var3.method_19809());
         var2.method_597().method_29222(var3.method_19805());
         var2.method_37562(var3.method_19795());
         this.field_36832 = var2;
         this.field_36831 = var3;
         this.field_36828 = var4;
         this.field_36833 = var5;
         this.field_36830 = "Yaml:" + System.identityHashCode(this);
      } else {
         throw new class_5251("Indicator indent must be smaller then indent.");
      }
   }

   public String method_32827(Object var1) {
      ArrayList var4 = new ArrayList(1);
      var4.add(var1);
      return this.method_32837(var4.iterator());
   }

   public class_1621 method_32833(Object var1) {
      return this.field_36832.method_600(var1);
   }

   public String method_32837(Iterator<? extends Object> var1) {
      StringWriter var4 = new StringWriter();
      this.method_32839(var1, var4, null);
      return var4.toString();
   }

   public void method_32828(Object var1, Writer var2) {
      ArrayList var5 = new ArrayList(1);
      var5.add(var1);
      this.method_32839(var5.iterator(), var2, null);
   }

   public void method_32838(Iterator<? extends Object> var1, Writer var2) {
      this.method_32839(var1, var2, null);
   }

   private void method_32839(Iterator<? extends Object> var1, Writer var2, class_9592 var3) {
      class_9626 var6 = new class_9626(new class_4979(var2, this.field_36831), this.field_36833, this.field_36831, var3);

      try {
         var6.method_44425();

         while (var1.hasNext()) {
            class_1621 var7 = this.field_36832.method_600(var1.next());
            var6.method_44428(var7);
         }

         var6.method_44430();
      } catch (IOException var8) {
         throw new class_5251(var8);
      }
   }

   public String method_32821(Object var1, class_9592 var2, class_435 var3) {
      class_435 var6 = this.field_36832.method_587();
      if (var3 != null) {
         this.field_36832.method_592(var3);
      }

      ArrayList var7 = new ArrayList(1);
      var7.add(var1);
      StringWriter var8 = new StringWriter();
      this.method_32839(var7.iterator(), var8, var2);
      this.field_36832.method_592(var6);
      return var8.toString();
   }

   public String method_32825(Object var1) {
      return this.method_32821(var1, class_9592.field_48871, class_435.field_1822);
   }

   public List<class_8087> method_32831(class_1621 var1) {
      class_4723 var4 = new class_4723(null);
      class_9626 var5 = new class_9626(var4, this.field_36833, this.field_36831, null);

      try {
         var5.method_44425();
         var5.method_44428(var1);
         var5.method_44430();
      } catch (IOException var7) {
         throw new class_5251(var7);
      }

      return var4.method_21838();
   }

   public <T> T method_32843(String var1) {
      return (T)this.method_32818(new class_8907(var1), Object.class);
   }

   public <T> T method_32841(InputStream var1) {
      return (T)this.method_32818(new class_8907(new class_1945(var1)), Object.class);
   }

   public <T> T method_32842(Reader var1) {
      return (T)this.method_32818(new class_8907(var1), Object.class);
   }

   public <T> T method_32823(Reader var1, Class<T> var2) {
      return (T)this.method_32818(new class_8907(var1), var2);
   }

   public <T> T method_32824(String var1, Class<T> var2) {
      return (T)this.method_32818(new class_8907(var1), var2);
   }

   public <T> T method_32822(InputStream var1, Class<T> var2) {
      return (T)this.method_32818(new class_8907(new class_1945(var1)), var2);
   }

   private Object method_32818(class_8907 var1, Class<?> var2) {
      class_7464 var5 = new class_7464(new class_1223(var1), this.field_36833);
      this.field_36829.method_42435(var5);
      return this.field_36829.method_42410(var2);
   }

   public Iterable<Object> method_32835(Reader var1) {
      class_7464 var4 = new class_7464(new class_1223(new class_8907(var1)), this.field_36833);
      this.field_36829.method_42435(var4);
      class_2518 var5 = new class_2518(this);
      return new class_7083(var5);
   }

   public Iterable<Object> method_32836(String var1) {
      return this.method_32835(new StringReader(var1));
   }

   public Iterable<Object> method_32834(InputStream var1) {
      return this.method_32835(new class_1945(var1));
   }

   public class_1621 method_32819(Reader var1) {
      class_7464 var4 = new class_7464(new class_1223(new class_8907(var1)), this.field_36833);
      return var4.method_33970();
   }

   public Iterable<class_1621> method_32832(Reader var1) {
      class_7464 var4 = new class_7464(new class_1223(new class_8907(var1)), this.field_36833);
      class_4504 var5 = new class_4504(this, var4);
      return new class_2390(var5);
   }

   public void method_32830(class_9592 var1, Pattern var2, String var3) {
      this.field_36833.method_8241(var1, var2, var3);
   }

   @Override
   public String toString() {
      return this.field_36830;
   }

   public String method_32829() {
      return this.field_36830;
   }

   public void method_32816(String var1) {
      this.field_36830 = var1;
   }

   public Iterable<class_8087> method_32826(Reader var1) {
      class_1223 var4 = new class_1223(new class_8907(var1));
      class_2918 var5 = new class_2918(this, var4);
      return new class_928(var5);
   }

   public void method_32815(class_1953 var1) {
      this.field_36829.method_42416().method_29232(var1);
      this.field_36832.method_597().method_29232(var1);
   }

   public void method_32820(class_8795 var1) {
      this.field_36829.method_42432(var1);
      this.field_36832.method_35290(var1);
   }
}
