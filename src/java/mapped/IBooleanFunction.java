package mapped;

public interface IBooleanFunction {
   IBooleanFunction field44037 = (var0, var1) -> false;
   IBooleanFunction field44038 = (var0, var1) -> !var0 && !var1;
   IBooleanFunction field44039 = (var0, var1) -> var1 && !var0;
   IBooleanFunction field44040 = (var0, var1) -> !var0;
   IBooleanFunction field44041 = (var0, var1) -> var0 && !var1;
   IBooleanFunction field44042 = (var0, var1) -> !var1;
   IBooleanFunction field44043 = (var0, var1) -> var0 != var1;
   IBooleanFunction field44044 = (var0, var1) -> !var0 || !var1;
   IBooleanFunction AND = (var0, var1) -> var0 && var1;
   IBooleanFunction field44046 = (var0, var1) -> var0 == var1;
   IBooleanFunction field44047 = (var0, var1) -> var1;
   IBooleanFunction field44048 = (var0, var1) -> !var0 || var1;
   IBooleanFunction field44049 = (var0, var1) -> var0;
   IBooleanFunction field44050 = (var0, var1) -> var0 || !var1;
   IBooleanFunction field44051 = (var0, var1) -> var0 || var1;
   IBooleanFunction field44052 = (var0, var1) -> true;

   boolean method36569(boolean var1, boolean var2);
}
