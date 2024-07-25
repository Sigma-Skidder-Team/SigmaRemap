package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public abstract class class_3893 {
   private final List<class_7794<class_7791, class_1450>> field_18942 = new ArrayList<class_7794<class_7791, class_1450>>();

   public class_3893() {
      this.method_18023();
   }

   public void method_18028(class_8039 var1) {
      class_5370 var4 = new class_5370(var1);
      this.method_18027(var4, var4);
   }

   public void method_18030(class_8039 var1, class_8039 var2) {
      this.method_18027(new class_5370(var1), new class_5370(var2));
   }

   public <T1, T2> void method_18031(class_8039<T1> var1, class_8039<T2> var2, Function<T1, T2> var3) {
      this.method_18027(new class_5370<T1>(var1), new class_6395(this, var2, var3));
   }

   public <T1, T2> void method_18026(class_2526<T1, T2> var1) {
      if (var1.method_11519() != null) {
         this.method_18029(var1.method_11519(), var1);
      } else {
         throw new IllegalArgumentException("Use map(Type<T1>, ValueTransformer<T1, T2>) for value transformers without specified input type!");
      }
   }

   public <T1, T2> void method_18029(class_8039<T1> var1, class_2526<T1, T2> var2) {
      this.method_18027(new class_5370<T1>(var1), var2);
   }

   public <T> void method_18027(class_7791<T> var1, class_1450<T> var2) {
      this.field_18942.add(new class_7794<class_7791, class_1450>(var1, var2));
   }

   public void method_18021(class_5226 var1) {
      this.method_18027(new class_5370<Void>(class_8039.field_41145), var1);
   }

   public void method_18025(class_857 var1) {
      this.method_18027(new class_5370<Void>(class_8039.field_41145), var1);
   }

   public abstract void method_18023();

   public void method_18024(class_5051 var1) throws Exception {
      try {
         for (class_7794 var10 : this.field_18942) {
            Object var6 = ((class_7791)var10.method_35355()).method_35349(var1);
            ((class_1450)var10.method_35352()).method_6684(var1, var6);
         }
      } catch (class_9699 var7) {
         var7.method_44826(this.getClass());
         throw var7;
      } catch (class_6400 var8) {
         throw var8;
      } catch (Exception var9) {
         class_9699 var5 = new class_9699(var9);
         var5.method_44826(this.getClass());
         throw var5;
      }
   }
}
