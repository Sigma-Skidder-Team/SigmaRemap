package mapped;

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

public class Class9134 {
   public final Class7358 field41973;
   private String field41974;
   public Class6213 field41975;
   public Class4500 field41976;
   public Class8324 field41977;
   public Class9310 field41978;

   public Class9134() {
      this(new Class6210(), new Class4500(), new Class8324(), new Class9310(), new Class7358());
   }

   public Class9134(Class8324 var1) {
      this(new Class6210(), new Class4500(), var1);
   }

   public Class9134(Class9310 var1) {
      this(new Class6210(), new Class4500(), new Class8324(), var1);
   }

   public Class9134(Class4500 var1) {
      this(new Class6210(), var1);
   }

   public Class9134(Class6213 var1) {
      this(var1, new Class4500());
   }

   public Class9134(Class6213 var1, Class4500 var2) {
      this(var1, var2, method34079(var2));
   }

   private static Class8324 method34079(Class4500 var0) {
      Class8324 var3 = new Class8324();
      var3.method29171(var0.method14199());
      var3.method29155(var0.method14197());
      var3.method29181(var0.method14201().method32621());
      var3.method29183(var0.method14205());
      return var3;
   }

   public Class9134(Class4500 var1, Class8324 var2) {
      this(new Class6210(), var1, var2, new Class9310(), new Class7358());
   }

   public Class9134(Class6213 var1, Class4500 var2, Class8324 var3) {
      this(var1, var2, var3, new Class9310(), new Class7358());
   }

   public Class9134(Class6213 var1, Class4500 var2, Class8324 var3, Class9310 var4) {
      this(var1, var2, var3, var4, new Class7358());
   }

   public Class9134(Class6213 var1, Class4500 var2, Class8324 var3, Class7358 var4) {
      this(var1, var2, var3, new Class9310(), var4);
   }

   public Class9134(Class6213 var1, Class4500 var2, Class8324 var3, Class9310 var4, Class7358 var5) {
      if (var1.method19187()) {
         if (!var2.method14202()) {
            var2.method14200(var1.method19185());
         }
      } else {
         var1.method19184(var2.method14201());
      }

      this.field41975 = var1;
      this.field41975.method19189(var4.method35175());
      if (var3.method29157() > var3.method29159()) {
         var2.method14198(var3.method29172());
         var2.method14196(var3.method29154());
         var2.method14201().method32620(var3.method29180());
         var2.method14206(var3.method29182());
         this.field41976 = var2;
         this.field41977 = var3;
         this.field41978 = var4;
         this.field41973 = var5;
         this.field41974 = "Yaml:" + System.identityHashCode(this);
      } else {
         throw new Class2478("Indicator indent must be smaller then indent.");
      }
   }

   public String method34080(Object var1) {
      ArrayList var4 = new ArrayList(1);
      var4.add(var1);
      return this.method34082(var4.iterator());
   }

   public Class7255 method34081(Object var1) {
      return this.field41976.method14190(var1);
   }

   public String method34082(Iterator<? extends Object> var1) {
      StringWriter var4 = new StringWriter();
      this.method34085(var1, var4, null);
      return var4.toString();
   }

   public void method34083(Object var1, Writer var2) {
      ArrayList var5 = new ArrayList(1);
      var5.add(var1);
      this.method34085(var5.iterator(), var2, null);
   }

   public void method34084(Iterator<? extends Object> var1, Writer var2) {
      this.method34085(var1, var2, null);
   }

   private void method34085(Iterator<? extends Object> var1, Writer var2, Class9757 var3) {
      Class9766 var6 = new Class9766(new Class8475(var2, this.field41977), this.field41973, this.field41977, var3);

      try {
         var6.method38406();

         while (var1.hasNext()) {
            Class7255 var7 = this.field41976.method14190(var1.next());
            var6.method38408(var7);
         }

         var6.method38407();
      } catch (IOException var8) {
         throw new Class2478(var8);
      }
   }

   public String method34086(Object var1, Class9757 var2, Class2214 var3) {
      Class2214 var6 = this.field41976.method14199();
      if (var3 != null) {
         this.field41976.method14198(var3);
      }

      ArrayList var7 = new ArrayList(1);
      var7.add(var1);
      StringWriter var8 = new StringWriter();
      this.method34085(var7.iterator(), var8, var2);
      this.field41976.method14198(var6);
      return var8.toString();
   }

   public String method34087(Object var1) {
      return this.method34086(var1, Class9757.field45644, Class2214.field14476);
   }

   public List<Class5931> method34088(Class7255 var1) {
      Class8473 var4 = new Class8473(null);
      Class9766 var5 = new Class9766(var4, this.field41973, this.field41977, null);

      try {
         var5.method38406();
         var5.method38408(var1);
         var5.method38407();
      } catch (IOException var7) {
         throw new Class2478(var7);
      }

      return var4.method29887();
   }

   public <T> T method34089(String var1) {
      return (T)this.method34095(new Class9583(var1), Object.class);
   }

   public <T> T method34090(InputStream var1) {
      return (T)this.method34095(new Class9583(new Class1802(var1)), Object.class);
   }

   public <T> T method34091(Reader var1) {
      return (T)this.method34095(new Class9583(var1), Object.class);
   }

   public <T> T method34092(Reader var1, Class<T> var2) {
      return (T)this.method34095(new Class9583(var1), var2);
   }

   public <T> T method34093(String var1, Class<T> var2) {
      return (T)this.method34095(new Class9583(var1), var2);
   }

   public <T> T method34094(InputStream var1, Class<T> var2) {
      return (T)this.method34095(new Class9583(new Class1802(var1)), var2);
   }

   private Object method34095(Class9583 var1, Class<?> var2) {
      Class9205 var5 = new Class9205(new Class6980(var1), this.field41973);
      this.field41975.method19157(var5);
      return this.field41975.method19160(var2);
   }

   public Iterable<Object> method34096(Reader var1) {
      Class9205 var4 = new Class9205(new Class6980(new Class9583(var1)), this.field41973);
      this.field41975.method19157(var4);
      Class4541 var5 = new Class4541(this);
      return new Class2346(var5);
   }

   public Iterable<Object> method34097(String var1) {
      return this.method34096(new StringReader(var1));
   }

   public Iterable<Object> method34098(InputStream var1) {
      return this.method34096(new Class1802(var1));
   }

   public Class7255 method34099(Reader var1) {
      Class9205 var4 = new Class9205(new Class6980(new Class9583(var1)), this.field41973);
      return var4.method34497();
   }

   public Iterable<Class7255> method34100(Reader var1) {
      Class9205 var4 = new Class9205(new Class6980(new Class9583(var1)), this.field41973);
      Class4546 var5 = new Class4546(this, var4);
      return new Class48(var5);
   }

   public void method34101(Class9757 var1, Pattern var2, String var3) {
      this.field41973.method23354(var1, var2, var3);
   }

   @Override
   public String toString() {
      return this.field41974;
   }

   public String method34102() {
      return this.field41974;
   }

   public void method34103(String var1) {
      this.field41974 = var1;
   }

   public Iterable<Class5931> method34104(Reader var1) {
      Class6980 var4 = new Class6980(new Class9583(var1));
      Class4549 var5 = new Class4549(this, var4);
      return new Class2355(var5);
   }

   public void method34105(Class2088 var1) {
      this.field41975.method19185().method32619(var1);
      this.field41976.method14201().method32619(var1);
   }

   public void method34106(Class9545 var1) {
      this.field41975.method19186(var1);
      this.field41976.method14207(var1);
   }
}
