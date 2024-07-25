package remapped;

import com.google.gson.JsonElement;
import java.util.UUID;

public abstract class class_8039<T> implements class_2117<T>, class_7281<T> {
   public static final class_8039<Byte> field_41133 = new class_4680();
   /** @deprecated */
   public static final class_8039<Byte[]> field_41139 = new class_6123<Byte>(field_41133);
   public static final class_8039<byte[]> field_41165 = new class_5466();
   public static final class_8039<byte[]> field_41181 = new class_5742();
   public static final class_8039<Short> field_41175 = new class_9771();
   /** @deprecated */
   public static final class_8039<Short[]> field_41160 = new class_6123<Short>(field_41175);
   public static final class_8039<Boolean> field_41161 = new class_6228();
   /** @deprecated */
   public static final class_8039<Boolean[]> field_41142 = new class_6123<Boolean>(field_41161);
   public static final class_8039<Integer> field_41179 = new class_1483();
   /** @deprecated */
   public static final class_8039<Integer[]> field_41182 = new class_6123<Integer>(field_41179);
   public static final class_8039<Double> field_41147 = new class_1140();
   /** @deprecated */
   public static final class_8039<Double[]> field_41176 = new class_6123<Double>(field_41147);
   public static final class_8039<Long> field_41141 = new class_7419();
   /** @deprecated */
   public static final class_8039<Long[]> field_41170 = new class_6123<Long>(field_41141);
   public static final class_574 field_41146 = new class_574();
   /** @deprecated */
   public static final class_8039<Float[]> field_41188 = new class_6123<Float>(field_41146);
   public static final class_9206 field_41166 = new class_9206();
   /** @deprecated */
   public static final class_8039<Short[]> field_41168 = new class_6123<Short>(field_41166);
   public static final class_8039<Integer> field_41138 = new class_994();
   /** @deprecated */
   public static final class_8039<Integer[]> field_41163 = new class_6123<Integer>(field_41138);
   public static final class_8039<JsonElement> field_41143 = new class_9265();
   public static final class_8039<String> field_41171 = new class_7378();
   public static final class_8039<String[]> field_41152 = new class_6123<String>(field_41171);
   public static final class_8039<UUID> field_41150 = new class_3225();
   public static final class_8039<UUID> field_41178 = new class_8326();
   public static final class_8039<UUID[]> field_41167 = new class_6123<UUID>(field_41150);
   public static final class_3383 field_41157 = new class_3383();
   /** @deprecated */
   public static final class_8039<Integer[]> field_41187 = new class_6123<Integer>(field_41157);
   public static final class_8039<int[]> field_41144 = new class_3157();
   public static final class_8039<Integer> field_41164 = new class_3235();
   public static final class_2302 field_41148 = new class_2302();
   /** @deprecated */
   public static final class_8039<Long[]> field_41135 = new class_6123<Long>(field_41148);
   public static final class_8039<Void> field_41145 = new class_7176();
   public static final class_8039<class_9371> field_41137 = new class_4887();
   public static final class_8039<class_9371> field_41159 = new class_2660();
   public static final class_8039<class_5434> field_41132 = new class_8154();
   public static final class_8039<class_9348> field_41172 = new class_6822();
   public static final class_8039<class_5531> field_41158 = new class_5341();
   public static final class_8039<class_5531[]> field_41177 = new class_6123<class_5531>(field_41158);
   public static final class_8039<UUID> field_41183 = new class_8203();
   public static final class_8039<JsonElement> field_41169 = new class_7084();
   public static final class_8039<class_9371> field_41140 = new class_8378();
   public static final class_8039<class_9371> field_41151 = new class_2444();
   public static final class_8039<class_9530> field_41149 = new class_4185();
   public static final class_8039<class_9530[]> field_41186 = new class_1107();
   public static final class_8039<class_9523> field_41131 = new class_6831();
   public static final class_8039<class_9523[]> field_41154 = new class_6123<class_9523>(field_41131);
   public static final class_8039<class_9523> field_41153 = new class_429();
   public static final class_8039<class_9523[]> field_41180 = new class_6123<class_9523>(field_41153);
   public static final class_8039<class_7468> field_41173 = new class_5165();
   public static final class_8039<class_9530> field_41184 = new class_7111();
   public static final class_8039<class_9530> field_41162 = new class_9050();
   public static final class_8039<class_9530[]> field_41156 = new class_2430();
   public static final class_8039<class_9530[]> field_41134 = new class_3428();
   public static final class_8039<class_9530[]> field_41174 = new class_6123<class_9530>(field_41184);
   public static final class_8039<class_9530[]> field_41185 = new class_6123<class_9530>(field_41162);
   private final Class<? super T> field_41136;
   private final String field_41155;

   public class_8039(Class<? super T> var1) {
      this(var1.getSimpleName(), var1);
   }

   public class_8039(String var1, Class<? super T> var2) {
      this.field_41136 = var2;
      this.field_41155 = var1;
   }

   public Class<? super T> method_36493() {
      return this.field_41136;
   }

   public String method_36494() {
      return this.field_41155;
   }

   public Class<? extends class_8039> method_36495() {
      return (Class<? extends class_8039>)this.getClass();
   }

   @Override
   public String toString() {
      return "Type|" + this.field_41155;
   }
}
