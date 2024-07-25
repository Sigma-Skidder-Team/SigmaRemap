package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class class_1685 {
   private final Map<class_8940, class_4639> field_8709 = Maps.newHashMap();
   private final Set<class_8940> field_8711 = Sets.newHashSet();

   public class_1685 method_7551(class_8940 var1, class_4639 var2) {
      this.field_8709.put(var1, var2);
      return this;
   }

   public Stream<class_8940> method_7585() {
      return this.field_8711.stream();
   }

   public class_1685 method_7548(class_8940 var1, class_8940 var2) {
      this.field_8709.put(var2, this.field_8709.get(var1));
      this.field_8711.add(var2);
      return this;
   }

   public class_4639 method_7556(class_8940 var1) {
      for (class_8940 var4 = var1; var4 != null; var4 = var4.method_41077()) {
         class_4639 var5 = this.field_8709.get(var4);
         if (var5 != null) {
            return var5;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + var1);
   }

   public class_1685 method_7531(class_8940 var1, class_4639 var2) {
      class_1685 var5 = new class_1685();
      var5.field_8709.putAll(this.field_8709);
      var5.field_8711.addAll(this.field_8711);
      var5.method_7551(var1, var2);
      return var5;
   }

   public static class_1685 method_7564(class_6414 var0) {
      class_4639 var3 = method_7540(var0);
      return method_7574(var3);
   }

   public static class_1685 method_7552(class_6414 var0) {
      class_4639 var3 = method_7540(var0);
      return method_7542(var3);
   }

   public static class_1685 method_7542(class_4639 var0) {
      return new class_1685().method_7551(class_8940.field_45837, var0);
   }

   public static class_1685 method_7574(class_4639 var0) {
      return new class_1685().method_7551(class_8940.field_45843, var0);
   }

   public static class_1685 method_7575(class_6414 var0) {
      return method_7549(class_8940.field_45826, method_7540(var0));
   }

   public static class_1685 method_7560(class_4639 var0) {
      return method_7549(class_8940.field_45826, var0);
   }

   public static class_1685 method_7573(class_6414 var0) {
      return method_7549(class_8940.field_45841, method_7540(var0));
   }

   public static class_1685 method_7535(class_4639 var0) {
      return method_7549(class_8940.field_45841, var0);
   }

   public static class_1685 method_7581(class_6414 var0) {
      return method_7549(class_8940.field_45814, method_7540(var0));
   }

   public static class_1685 method_7568(class_4639 var0) {
      return method_7549(class_8940.field_45814, var0);
   }

   public static class_1685 method_7559(class_6414 var0) {
      return method_7549(class_8940.field_45823, method_7540(var0));
   }

   public static class_1685 method_7550(class_6414 var0) {
      return method_7549(class_8940.field_45829, method_7540(var0));
   }

   public static class_1685 method_7553(class_6414 var0, class_6414 var1) {
      return new class_1685().method_7551(class_8940.field_45829, method_7540(var0)).method_7551(class_8940.field_45828, method_7540(var1));
   }

   public static class_1685 method_7558(class_6414 var0) {
      return method_7549(class_8940.field_45821, method_7540(var0));
   }

   public static class_1685 method_7563(class_6414 var0) {
      return method_7549(class_8940.field_45816, method_7540(var0));
   }

   public static class_1685 method_7541(class_4639 var0) {
      return method_7549(class_8940.field_45835, var0);
   }

   public static class_1685 method_7532(class_6414 var0, class_6414 var1) {
      return new class_1685().method_7551(class_8940.field_45811, method_7540(var0)).method_7551(class_8940.field_45845, method_7533(var1, "_top"));
   }

   public static class_1685 method_7549(class_8940 var0, class_4639 var1) {
      return new class_1685().method_7551(var0, var1);
   }

   public static class_1685 method_7545(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45813, method_7533(var0, "_side")).method_7551(class_8940.field_45830, method_7533(var0, "_top"));
   }

   public static class_1685 method_7580(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45813, method_7533(var0, "_side")).method_7551(class_8940.field_45810, method_7533(var0, "_top"));
   }

   public static class_1685 method_7554(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45813, method_7540(var0)).method_7551(class_8940.field_45830, method_7533(var0, "_top"));
   }

   public static class_1685 method_7569(class_4639 var0, class_4639 var1) {
      return new class_1685().method_7551(class_8940.field_45813, var0).method_7551(class_8940.field_45830, var1);
   }

   public static class_1685 method_7579(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45813, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45810, method_7533(var0, "_top"))
         .method_7551(class_8940.field_45822, method_7533(var0, "_bottom"));
   }

   public static class_1685 method_7537(class_6414 var0) {
      class_4639 var3 = method_7540(var0);
      return new class_1685()
         .method_7551(class_8940.field_45831, var3)
         .method_7551(class_8940.field_45813, var3)
         .method_7551(class_8940.field_45810, method_7533(var0, "_top"))
         .method_7551(class_8940.field_45822, method_7533(var0, "_bottom"));
   }

   public static class_1685 method_7576(class_6414 var0) {
      class_4639 var3 = method_7540(var0);
      return new class_1685()
         .method_7551(class_8940.field_45831, var3)
         .method_7551(class_8940.field_45813, var3)
         .method_7551(class_8940.field_45830, method_7533(var0, "_top"));
   }

   public static class_1685 method_7536(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45810, method_7533(var0, "_top")).method_7551(class_8940.field_45822, method_7533(var0, "_bottom"));
   }

   public static class_1685 method_7543(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45832, method_7540(var0));
   }

   public static class_1685 method_7567(class_4639 var0) {
      return new class_1685().method_7551(class_8940.field_45832, var0);
   }

   public static class_1685 method_7555(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45808, method_7533(var0, "_0"));
   }

   public static class_1685 method_7582(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45808, method_7533(var0, "_1"));
   }

   public static class_1685 method_7583(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45838, method_7540(var0));
   }

   public static class_1685 method_7565(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45819, method_7540(var0));
   }

   public static class_1685 method_7584(class_4639 var0) {
      return new class_1685().method_7551(class_8940.field_45819, var0);
   }

   public static class_1685 method_7571(class_2451 var0) {
      return new class_1685().method_7551(class_8940.field_45832, method_7546(var0));
   }

   public static class_1685 method_7534(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45813, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45833, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45809, method_7533(var0, "_back"));
   }

   public static class_1685 method_7561(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45813, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45833, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45810, method_7533(var0, "_top"))
         .method_7551(class_8940.field_45822, method_7533(var0, "_bottom"));
   }

   public static class_1685 method_7566(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45813, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45833, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45810, method_7533(var0, "_top"));
   }

   public static class_1685 method_7562(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45813, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45833, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45830, method_7533(var0, "_end"));
   }

   public static class_1685 method_7557(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45810, method_7533(var0, "_top"));
   }

   public static class_1685 method_7538(class_6414 var0, class_6414 var1) {
      return new class_1685()
         .method_7551(class_8940.field_45832, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45839, method_7540(var1))
         .method_7551(class_8940.field_45817, method_7533(var0, "_top"))
         .method_7551(class_8940.field_45825, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45824, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45840, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45836, method_7533(var0, "_front"));
   }

   public static class_1685 method_7570(class_6414 var0, class_6414 var1) {
      return new class_1685()
         .method_7551(class_8940.field_45832, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45839, method_7540(var1))
         .method_7551(class_8940.field_45817, method_7533(var0, "_top"))
         .method_7551(class_8940.field_45825, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45840, method_7533(var0, "_front"))
         .method_7551(class_8940.field_45824, method_7533(var0, "_side"))
         .method_7551(class_8940.field_45836, method_7533(var0, "_side"));
   }

   public static class_1685 method_7572(class_6414 var0) {
      return new class_1685()
         .method_7551(class_8940.field_45820, method_7533(var0, "_log_lit"))
         .method_7551(class_8940.field_45808, method_7533(var0, "_fire"));
   }

   public static class_1685 method_7577(class_2451 var0) {
      return new class_1685().method_7551(class_8940.field_45827, method_7546(var0));
   }

   public static class_1685 method_7578(class_6414 var0) {
      return new class_1685().method_7551(class_8940.field_45827, method_7540(var0));
   }

   public static class_1685 method_7544(class_4639 var0) {
      return new class_1685().method_7551(class_8940.field_45827, var0);
   }

   public static class_4639 method_7540(class_6414 var0) {
      class_4639 var3 = class_8669.field_44462.method_39797(var0);
      return new class_4639(var3.method_21461(), "block/" + var3.method_21456());
   }

   public static class_4639 method_7533(class_6414 var0, String var1) {
      class_4639 var4 = class_8669.field_44462.method_39797(var0);
      return new class_4639(var4.method_21461(), "block/" + var4.method_21456() + var1);
   }

   public static class_4639 method_7546(class_2451 var0) {
      class_4639 var3 = class_8669.field_44382.method_39797(var0);
      return new class_4639(var3.method_21461(), "item/" + var3.method_21456());
   }

   public static class_4639 method_7539(class_2451 var0, String var1) {
      class_4639 var4 = class_8669.field_44382.method_39797(var0);
      return new class_4639(var4.method_21461(), "item/" + var4.method_21456() + var1);
   }
}
