package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5734 implements class_8406 {
   public static final Codec<class_5734> field_28974 = Codec.PASSTHROUGH.comapFlatMap(var0 -> {
      class_8406 var3 = (class_8406)var0.convert(class_3504.field_17178).getValue();
      return !(var3 instanceof class_5734) ? DataResult.error("Not a compound tag: " + var3) : DataResult.success((class_5734)var3);
   }, var0 -> new Dynamic(class_3504.field_17178, var0));
   private static final Logger field_28972 = LogManager.getLogger();
   private static final Pattern field_28971 = Pattern.compile("[A-Za-z0-9._+-]+");
   public static final class_3265<class_5734> field_28976 = new class_2782();
   private final Map<String, class_8406> field_28975;

   public class_5734(Map<String, class_8406> var1) {
      this.field_28975 = var1;
   }

   public class_5734() {
      this(Maps.newHashMap());
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      for (String var5 : this.field_28975.keySet()) {
         class_8406 var6 = this.field_28975.get(var5);
         method_25928(var5, var6, var1);
      }

      var1.writeByte(0);
   }

   public Set<String> method_25952() {
      return this.field_28975.keySet();
   }

   @Override
   public byte method_38706() {
      return 10;
   }

   @Override
   public class_3265<class_5734> method_38709() {
      return field_28976;
   }

   public int method_25924() {
      return this.field_28975.size();
   }

   @Nullable
   public class_8406 method_25946(String var1, class_8406 var2) {
      return this.field_28975.put(var1, var2);
   }

   public void method_25921(String var1, byte var2) {
      this.field_28975.put(var1, class_5284.method_24120(var2));
   }

   public void method_25958(String var1, short var2) {
      this.field_28975.put(var1, class_7745.method_35070(var2));
   }

   public void method_25931(String var1, int var2) {
      this.field_28975.put(var1, class_9413.method_43597(var2));
   }

   public void method_25949(String var1, long var2) {
      this.field_28975.put(var1, class_3388.method_15658(var2));
   }

   public void method_25964(String var1, UUID var2) {
      this.field_28975.put(var1, class_4338.method_20181(var2));
   }

   public UUID method_25926(String var1) {
      return class_4338.method_20183(this.method_25929(var1));
   }

   public boolean method_25954(String var1) {
      class_8406 var4 = this.method_25929(var1);
      return var4 != null && var4.method_38709() == class_6222.field_31787 && ((class_6222)var4).method_28446().length == 4;
   }

   public void method_25920(String var1, float var2) {
      this.field_28975.put(var1, class_5718.method_25854(var2));
   }

   public void method_25923(String var1, double var2) {
      this.field_28975.put(var1, class_9708.method_44846(var2));
   }

   public void method_25941(String var1, String var2) {
      this.field_28975.put(var1, class_473.method_2261(var2));
   }

   public void method_25953(String var1, byte[] var2) {
      this.field_28975.put(var1, new class_5064(var2));
   }

   public void method_25969(String var1, int[] var2) {
      this.field_28975.put(var1, new class_6222(var2));
   }

   public void method_25968(String var1, List<Integer> var2) {
      this.field_28975.put(var1, new class_6222(var2));
   }

   public void method_25962(String var1, long[] var2) {
      this.field_28975.put(var1, new class_1129(var2));
   }

   public void method_25961(String var1, List<Long> var2) {
      this.field_28975.put(var1, new class_1129(var2));
   }

   public void method_25934(String var1, boolean var2) {
      this.field_28975.put(var1, class_5284.method_24121(var2));
   }

   @Nullable
   public class_8406 method_25929(String var1) {
      return this.field_28975.get(var1);
   }

   public byte method_25943(String var1) {
      class_8406 var4 = this.field_28975.get(var1);
      return var4 != null ? var4.method_38706() : 0;
   }

   public boolean method_25938(String var1) {
      return this.field_28975.containsKey(var1);
   }

   public boolean method_25939(String var1, int var2) {
      byte var5 = this.method_25943(var1);
      if (var5 != var2) {
         return var2 != 99 ? false : var5 == 1 || var5 == 2 || var5 == 3 || var5 == 4 || var5 == 5 || var5 == 6;
      } else {
         return true;
      }
   }

   public byte method_25950(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26641();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public short method_25956(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26640();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public int method_25947(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26636();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public long method_25948(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26635();
         }
      } catch (ClassCastException var5) {
      }

      return 0L;
   }

   public float method_25955(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26639();
         }
      } catch (ClassCastException var5) {
      }

      return 0.0F;
   }

   public double method_25932(String var1) {
      try {
         if (this.method_25939(var1, 99)) {
            return ((class_5841)this.field_28975.get(var1)).method_26642();
         }
      } catch (ClassCastException var5) {
      }

      return 0.0;
   }

   public String method_25965(String var1) {
      try {
         if (this.method_25939(var1, 8)) {
            return this.field_28975.get(var1).method_38710();
         }
      } catch (ClassCastException var5) {
      }

      return "";
   }

   public byte[] method_25930(String var1) {
      try {
         if (this.method_25939(var1, 7)) {
            return ((class_5064)this.field_28975.get(var1)).method_23327();
         }
      } catch (ClassCastException var5) {
         throw new class_3297(this.method_25960(var1, class_5064.field_26180, var5));
      }

      return new byte[0];
   }

   public int[] method_25922(String var1) {
      try {
         if (this.method_25939(var1, 11)) {
            return ((class_6222)this.field_28975.get(var1)).method_28446();
         }
      } catch (ClassCastException var5) {
         throw new class_3297(this.method_25960(var1, class_6222.field_31787, var5));
      }

      return new int[0];
   }

   public long[] method_25942(String var1) {
      try {
         if (this.method_25939(var1, 12)) {
            return ((class_1129)this.field_28975.get(var1)).method_4959();
         }
      } catch (ClassCastException var5) {
         throw new class_3297(this.method_25960(var1, class_1129.field_6440, var5));
      }

      return new long[0];
   }

   public class_5734 method_25937(String var1) {
      try {
         if (this.method_25939(var1, 10)) {
            return (class_5734)this.field_28975.get(var1);
         }
      } catch (ClassCastException var5) {
         throw new class_3297(this.method_25960(var1, field_28976, var5));
      }

      return new class_5734();
   }

   public class_3416 method_25927(String var1, int var2) {
      try {
         if (this.method_25943(var1) == 9) {
            class_3416 var5 = (class_3416)this.field_28975.get(var1);
            if (!var5.isEmpty() && var5.method_31428() != var2) {
               return new class_3416();
            }

            return var5;
         }
      } catch (ClassCastException var6) {
         throw new class_3297(this.method_25960(var1, class_3416.field_16815, var6));
      }

      return new class_3416();
   }

   public boolean method_25933(String var1) {
      return this.method_25950(var1) != 0;
   }

   public void method_25959(String var1) {
      this.field_28975.remove(var1);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("{");
      Object var4 = this.field_28975.keySet();
      if (field_28972.isDebugEnabled()) {
         ArrayList var5 = Lists.newArrayList(this.field_28975.keySet());
         Collections.sort(var5);
         var4 = var5;
      }

      for (String var6 : var4) {
         if (var3.length() != 1) {
            var3.append(',');
         }

         var3.append(method_25951(var6)).append(':').append(this.field_28975.get(var6));
      }

      return var3.append('}').toString();
   }

   public boolean method_25940() {
      return this.field_28975.isEmpty();
   }

   private class_159 method_25960(String var1, class_3265<?> var2, ClassCastException var3) {
      class_159 var6 = class_159.method_643(var3, "Reading NBT data");
      class_6544 var7 = var6.method_642("Corrupt NBT tag", 1);
      var7.method_29851("Tag type found", () -> this.field_28975.get(var1).method_38709().method_14892());
      var7.method_29851("Tag type expected", var2::method_14892);
      var7.method_29850("Tag name", var1);
      return var6;
   }

   public class_5734 method_25944() {
      HashMap var3 = Maps.newHashMap(Maps.transformValues(this.field_28975, class_8406::method_38708));
      return new class_5734(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_5734 && Objects.equals(this.field_28975, ((class_5734)var1).field_28975);
   }

   @Override
   public int hashCode() {
      return this.field_28975.hashCode();
   }

   private static void method_25928(String var0, class_8406 var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.method_38706());
      if (var1.method_38706() != 0) {
         var2.writeUTF(var0);
         var1.method_38707(var2);
      }
   }

   private static byte method_25936(DataInput var0, class_4694 var1) throws IOException {
      return var0.readByte();
   }

   private static String method_25970(DataInput var0, class_4694 var1) throws IOException {
      return var0.readUTF();
   }

   private static class_8406 method_25935(class_3265<?> var0, String var1, DataInput var2, int var3, class_4694 var4) {
      try {
         return var0.method_14890(var2, var3, var4);
      } catch (IOException var10) {
         class_159 var8 = class_159.method_643(var10, "Loading NBT data");
         class_6544 var9 = var8.method_639("NBT Tag");
         var9.method_29850("Tag name", var1);
         var9.method_29850("Tag type", var0.method_14892());
         throw new class_3297(var8);
      }
   }

   public class_5734 method_25925(class_5734 var1) {
      for (String var5 : var1.field_28975.keySet()) {
         class_8406 var6 = var1.field_28975.get(var5);
         if (var6.method_38706() != 10) {
            this.method_25946(var5, var6.method_38708());
         } else if (!this.method_25939(var5, 10)) {
            this.method_25946(var5, var6.method_38708());
         } else {
            class_5734 var7 = this.method_25937(var5);
            var7.method_25925((class_5734)var6);
         }
      }

      return this;
   }

   public static String method_25951(String var0) {
      return !field_28971.matcher(var0).matches() ? class_473.method_2260(var0) : var0;
   }

   public static ITextComponent method_25957(String var0) {
      if (!field_28971.matcher(var0).matches()) {
         String var3 = class_473.method_2260(var0);
         String var4 = var3.substring(0, 1);
         IFormattableTextComponent var5 = new StringTextComponent(var3.substring(1, var3.length() - 1)).mergeStyle(field_43008);
         return new StringTextComponent(var4).append(var5).appendString(var4);
      } else {
         return new StringTextComponent(var0).mergeStyle(field_43008);
      }
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      if (!this.field_28975.isEmpty()) {
         StringTextComponent var5 = new StringTextComponent("{");
         Object var6 = this.field_28975.keySet();
         if (field_28972.isDebugEnabled()) {
            ArrayList var8 = Lists.newArrayList(this.field_28975.keySet());
            Collections.sort(var8);
            var6 = var8;
         }

         if (!var1.isEmpty()) {
            var5.appendString("\n");
         }

         Iterator var7 = var6.iterator();

         while (var7.hasNext()) {
            String var9 = (String)var7.next();
            IFormattableTextComponent var10 = new StringTextComponent(Strings.repeat(var1, var2 + 1))
               .append(method_25957(var9))
               .appendString(String.valueOf(':'))
               .appendString(" ")
               .append(this.field_28975.get(var9).method_38712(var1, var2 + 1));
            if (var7.hasNext()) {
               var10.appendString(String.valueOf(',')).appendString(!var1.isEmpty() ? "\n" : " ");
            }

            var5.append(var10);
         }

         if (!var1.isEmpty()) {
            var5.appendString("\n").appendString(Strings.repeat(var1, var2));
         }

         var5.appendString("}");
         return var5;
      } else {
         return new StringTextComponent("{}");
      }
   }

   public Map<String, class_8406> method_25967() {
      return Collections.<String, class_8406>unmodifiableMap(this.field_28975);
   }
}
