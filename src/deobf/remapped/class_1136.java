package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class class_1136 {
   private static final Map<class_6629<?>, class_8092> field_6455 = Maps.newHashMap();

   private static <T extends class_5886> void method_4981(class_6629<T> var0, class_1257 var1, class_3801 var2, class_6147<T> var3) {
      class_8092 var6 = field_6455.put(var0, new class_8092(var2, var1, var3));
      if (var6 != null) {
         throw new IllegalStateException("Duplicate registration for type " + class_8669.field_44400.method_39797(var0));
      }
   }

   public static class_1257 method_4980(class_6629<?> var0) {
      class_8092 var3 = field_6455.get(var0);
      return var3 != null ? class_8092.method_36740(var3) : class_1257.field_6939;
   }

   public static class_3801 method_4984(class_6629<?> var0) {
      class_8092 var3 = field_6455.get(var0);
      return var3 != null ? class_8092.method_36739(var3) : class_3801.field_18590;
   }

   public static <T extends Entity> boolean method_4983(class_6629<T> var0, class_1556 var1, class_2417 var2, class_1331 var3, Random var4) {
      class_8092 var7 = field_6455.get(var0);
      return var7 == null || class_8092.method_36741(var7).method_28198(var0, var1, var2, var3, var4);
   }

   static {
      method_4981(class_6629.field_34262, class_1257.field_6934, class_3801.field_18590, class_3578::method_16634);
      method_4981(class_6629.field_34320, class_1257.field_6934, class_3801.field_18590, class_449::method_2156);
      method_4981(class_6629.field_34211, class_1257.field_6934, class_3801.field_18590, class_4359::method_20225);
      method_4981(class_6629.field_34307, class_1257.field_6934, class_3801.field_18590, class_337::method_1551);
      method_4981(class_6629.field_34315, class_1257.field_6934, class_3801.field_18590, class_3578::method_16634);
      method_4981(class_6629.field_34236, class_1257.field_6934, class_3801.field_18590, class_3578::method_16634);
      method_4981(class_6629.field_34292, class_1257.field_6934, class_3801.field_18590, class_6011::method_27439);
      method_4981(class_6629.field_34278, class_1257.field_6934, class_3801.field_18590, class_3578::method_16634);
      method_4981(class_6629.field_34217, class_1257.field_6935, class_3801.field_18590, class_2022::method_9393);
      method_4981(class_6629.field_34301, class_1257.field_6935, class_3801.field_18590, class_1173::method_5198);
      method_4981(class_6629.field_34272, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34263, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34325, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34210, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34248, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34308, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34264, class_1257.field_6935, class_3801.field_18590, class_2667::method_12024);
      method_4981(class_6629.field_34310, class_1257.field_6935, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34281, class_1257.field_6935, class_3801.field_18590, class_4206::method_19574);
      method_4981(class_6629.field_34294, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34286, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34266, class_1257.field_6935, class_3801.field_18590, class_8170::method_37471);
      method_4981(class_6629.field_34298, class_1257.field_6935, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34327, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34295, class_1257.field_6935, class_3801.field_18590, class_3252::method_14865);
      method_4981(class_6629.field_34269, class_1257.field_6935, class_3801.field_18590, class_4393::method_20460);
      method_4981(class_6629.field_34218, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34214, class_1257.field_6935, class_3801.field_18595, class_7617::method_34538);
      method_4981(class_6629.field_34228, class_1257.field_6935, class_3801.field_18595, class_107::method_321);
      method_4981(class_6629.field_34252, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34306, class_1257.field_6935, class_3801.field_18590, class_6704::method_30705);
      method_4981(class_6629.field_34240, class_1257.field_6935, class_3801.field_18590, class_2599::method_11799);
      method_4981(class_6629.field_34265, class_1257.field_6935, class_3801.field_18590, class_4607::method_21355);
      method_4981(class_6629.field_34229, class_1257.field_6935, class_3801.field_18590, class_9668::method_44711);
      method_4981(class_6629.field_34251, class_1257.field_6935, class_3801.field_18590, class_7272::method_33242);
      method_4981(class_6629.field_34321, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34314, class_1257.field_6935, class_3801.field_18590, class_6174::method_28293);
      method_4981(class_6629.field_34241, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34261, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34222, class_1257.field_6935, class_3801.field_18590, class_378::method_1853);
      method_4981(class_6629.field_34253, class_1257.field_6935, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34223, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34322, class_1257.field_6935, class_3801.field_18590, class_4180::method_19449);
      method_4981(class_6629.field_34233, class_1257.field_6937, class_3801.field_18590, class_1775::method_7926);
      method_4981(class_6629.field_34283, class_1257.field_6935, class_3801.field_18590, class_3845::method_17861);
      method_4981(class_6629.field_34276, class_1257.field_6935, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34220, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34212, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34317, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34225, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34297, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34268, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34234, class_1257.field_6935, class_3801.field_18590, class_1918::method_8726);
      method_4981(class_6629.field_34227, class_1257.field_6935, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34249, class_1257.field_6935, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34324, class_1257.field_6934, class_3801.field_18590, class_337::method_1551);
      method_4981(class_6629.field_34296, class_1257.field_6939, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34250, class_1257.field_6939, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34270, class_1257.field_6939, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34232, class_1257.field_6939, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34246, class_1257.field_6939, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34318, class_1257.field_6939, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34231, class_1257.field_6939, class_3801.field_18590, class_5886::method_26908);
      method_4981(class_6629.field_34230, class_1257.field_6939, class_3801.field_18590, class_5467::method_24872);
      method_4981(class_6629.field_34277, class_1257.field_6939, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34255, class_1257.field_6939, class_3801.field_18590, class_1173::method_5199);
      method_4981(class_6629.field_34303, class_1257.field_6939, class_3801.field_18590, class_5886::method_26908);
   }
}
