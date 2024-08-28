package mapped;

import java.util.Collection;

public class Class6210 extends Class6211 {
   public Class6210() {
      this(Object.class);
   }

   public Class6210(Class<? extends Object> var1) {
      this(new Class9545(method19144(var1)));
   }

   private static Class<? extends Object> method19144(Class<? extends Object> var0) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException("Root class must be provided.");
      }
   }

   public Class6210(Class9545 var1) {
      this(var1, null);
   }

   public Class6210(Class9545 var1, Collection<Class9545> var2) {
      if (var1 != null) {
         this.field27702.put(null, new Class4638(this));
         if (!Object.class.equals(var1.method36942())) {
            this.field27709 = new Class9757(var1.method36942());
         }

         this.field27701.put(Class2048.field13364, new Class4642(this));
         this.field27701.put(Class2048.field13366, new Class4633(this));
         this.field27701.put(Class2048.field13365, new Class4636(this));
         this.method19186(var1);
         if (var2 != null) {
            for (Class9545 var6 : var2) {
               this.method19186(var6);
            }
         }
      } else {
         throw new NullPointerException("Root type must be provided.");
      }
   }

   public Class6210(String var1) throws ClassNotFoundException {
      this((Class<? extends Object>)Class.forName(method19145(var1)));
   }

   private static final String method19145(String var0) {
      if (var0 != null) {
         if (var0.trim().length() != 0) {
            return var0;
         } else {
            throw new Class2478("Root type must be provided.");
         }
      } else {
         throw new NullPointerException("Root type must be provided.");
      }
   }

   public Class<?> method19146(Class7255 var1) {
      Class var4 = this.field27714.get(var1.method22780());
      if (var4 == null) {
         String var5 = var1.method22780().method38341();

         Class var6;
         try {
            var6 = this.method19143(var5);
         } catch (ClassNotFoundException var8) {
            throw new Class2478("Class not found: " + var5);
         }

         this.field27714.put(var1.method22780(), var6);
         return var6;
      } else {
         return var4;
      }
   }

   public Class<?> method19143(String var1) throws ClassNotFoundException {
      try {
         return Class.forName(var1, true, Thread.currentThread().getContextClassLoader());
      } catch (ClassNotFoundException var5) {
         return Class.forName(var1);
      }
   }
}
