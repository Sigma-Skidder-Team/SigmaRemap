package net.minecraft.util;

public enum ActionResultType {
   field14818,
   field14819,
   field14820,
    FAIL;

   private static final ActionResultType[] field14822 = new ActionResultType[]{field14818, field14819, field14820, FAIL};

   public boolean isSuccessOrConsume() {
      return this == field14818 || this == field14819;
   }

   public boolean isSuccess() {
      return this == field14818;
   }

   public static ActionResultType method9002(boolean var0) {
      return !var0 ? field14819 : field14818;
   }
}
