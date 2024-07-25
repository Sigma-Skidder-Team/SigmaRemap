package remapped;

import java.util.Collection;

public class class_4364 extends class_3229 {
   public class_4364() {
      this(Object.class);
   }

   public class_4364(Class<? extends Object> var1) {
      this(new class_8795(method_20236(var1)));
   }

   private static Class<? extends Object> method_20236(Class<? extends Object> var0) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException("Root class must be provided.");
      }
   }

   public class_4364(class_8795 var1) {
      this(var1, null);
   }

   public class_4364(class_8795 var1, Collection<class_8795> var2) {
      if (var1 != null) {
         this.field_47066.put(null, new class_1350(this));
         if (!Object.class.equals(var1.method_40413())) {
            this.field_47068 = new class_9592(var1.method_40413());
         }

         this.field_47065.put(class_99.field_235, new class_2041(this));
         this.field_47065.put(class_99.field_233, new class_953(this));
         this.field_47065.put(class_99.field_234, new class_3653(this));
         this.method_42432(var1);
         if (var2 != null) {
            for (class_8795 var6 : var2) {
               this.method_42432(var6);
            }
         }
      } else {
         throw new NullPointerException("Root type must be provided.");
      }
   }

   public class_4364(String var1) throws ClassNotFoundException {
      this((Class<? extends Object>)Class.forName(method_20237(var1)));
   }

   private static final String method_20237(String var0) {
      if (var0 != null) {
         if (var0.trim().length() != 0) {
            return var0;
         } else {
            throw new class_5251("Root type must be provided.");
         }
      } else {
         throw new NullPointerException("Root type must be provided.");
      }
   }

   public Class<?> method_20238(class_1621 var1) {
      Class var4 = this.field_47061.get(var1.method_7232());
      if (var4 == null) {
         String var5 = var1.method_7232().method_44301();

         Class var6;
         try {
            var6 = this.method_20239(var5);
         } catch (ClassNotFoundException var8) {
            throw new class_5251("Class not found: " + var5);
         }

         this.field_47061.put(var1.method_7232(), var6);
         return var6;
      } else {
         return var4;
      }
   }

   public Class<?> method_20239(String var1) throws ClassNotFoundException {
      try {
         return Class.forName(var1, true, Thread.currentThread().getContextClassLoader());
      } catch (ClassNotFoundException var5) {
         return Class.forName(var1);
      }
   }
}
