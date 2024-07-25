package remapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class class_4635 implements Serializable {
   private static final long field_22643 = -6024911025449780478L;
   private Throwable field_22647;
   private List<class_5500> field_22646;
   private List<Object[]> field_22645;
   private Map<String, Object> field_22648;

   public class_4635(Throwable var1) {
      this.field_22647 = var1;
      this.field_22646 = new ArrayList<class_5500>();
      this.field_22645 = new ArrayList<Object[]>();
      this.field_22648 = new HashMap<String, Object>();
   }

   public Throwable method_21442() {
      return this.field_22647;
   }

   public void method_21445(class_5500 var1, Object... var2) {
      this.field_22646.add(var1);
      this.field_22645.add(class_4416.method_20546(var2));
   }

   public void method_21435(String var1, Object var2) {
      this.field_22648.put(var1, var2);
   }

   public Object method_21448(String var1) {
      return this.field_22648.get(var1);
   }

   public Set<String> method_21439() {
      return this.field_22648.keySet();
   }

   public String method_21432() {
      return this.method_21433(Locale.US);
   }

   public String method_21443() {
      return this.method_21433(Locale.getDefault());
   }

   public String method_21433(Locale var1) {
      return this.method_21449(var1, ": ");
   }

   public String method_21434(Locale var1, String var2) {
      return this.method_21449(var1, var2);
   }

   private String method_21449(Locale var1, String var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = 0;
      int var7 = this.field_22646.size();

      for (int var8 = 0; var8 < var7; var8++) {
         class_5500 var9 = this.field_22646.get(var8);
         Object[] var10 = this.field_22645.get(var8);
         MessageFormat var11 = new MessageFormat(var9.method_24967(var1), var1);
         var5.append(var11.format(var10));
         if (++var6 < var7) {
            var5.append(var2);
         }
      }

      return var5.toString();
   }

   private void method_21438(ObjectOutputStream var1) throws IOException {
      var1.writeObject(this.field_22647);
      this.method_21436(var1);
      this.method_21446(var1);
   }

   private void method_21447(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      this.field_22647 = (Throwable)var1.readObject();
      this.method_21444(var1);
      this.method_21440(var1);
   }

   private void method_21436(ObjectOutputStream var1) throws IOException {
      int var4 = this.field_22646.size();
      var1.writeInt(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         class_5500 var6 = this.field_22646.get(var5);
         var1.writeObject(var6);
         Object[] var7 = this.field_22645.get(var5);
         int var8 = var7.length;
         var1.writeInt(var8);

         for (int var9 = 0; var9 < var8; var9++) {
            if (!(var7[var9] instanceof Serializable)) {
               var1.writeObject(this.method_21441(var7[var9]));
            } else {
               var1.writeObject(var7[var9]);
            }
         }
      }
   }

   private void method_21444(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      int var4 = var1.readInt();
      this.field_22646 = new ArrayList<class_5500>(var4);
      this.field_22645 = new ArrayList<Object[]>(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         class_5500 var6 = (class_5500)var1.readObject();
         this.field_22646.add(var6);
         int var7 = var1.readInt();
         Object[] var8 = new Object[var7];

         for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var1.readObject();
         }

         this.field_22645.add(var8);
      }
   }

   private void method_21446(ObjectOutputStream var1) throws IOException {
      int var4 = this.field_22648.keySet().size();
      var1.writeInt(var4);

      for (String var6 : this.field_22648.keySet()) {
         var1.writeObject(var6);
         Object var7 = this.field_22648.get(var6);
         if (!(var7 instanceof Serializable)) {
            var1.writeObject(this.method_21441(var7));
         } else {
            var1.writeObject(var7);
         }
      }
   }

   private void method_21440(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      int var4 = var1.readInt();
      this.field_22648 = new HashMap<String, Object>();

      for (int var5 = 0; var5 < var4; var5++) {
         String var6 = (String)var1.readObject();
         Object var7 = var1.readObject();
         this.field_22648.put(var6, var7);
      }
   }

   private String method_21441(Object var1) {
      return "[Object could not be serialized: " + var1.getClass().getName() + "]";
   }
}
