// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface IBooleanFunction
{
    public static final IBooleanFunction FALSE = (p0, p1) -> false;
    public static final IBooleanFunction NOT_OR = (b3, b5) -> !b3 && !b5;
    public static final IBooleanFunction ONLY_SECOND = (b7, b9) -> b9 && !b7;
    public static final IBooleanFunction NOT_FIRST = (b11, p1) -> !b11;
    public static final IBooleanFunction ONLY_FIRST = (b14, b16) -> b14 && !b16;
    public static final IBooleanFunction NOT_SECOND = (p0, b19) -> !b19;
    public static final IBooleanFunction NOT_SAME = (b21, b23) -> b21 != b23;
    public static final IBooleanFunction NOT_AND = (b25, b27) -> !b25 || !b27;
    public static final IBooleanFunction AND = (b29, b31) -> b29 && b31;
    public static final IBooleanFunction SAME = (b33, b35) -> b33 == b35;
    public static final IBooleanFunction SECOND = (p0, b38) -> b38;
    public static final IBooleanFunction CAUSES = (b40, b42) -> !b40 || b42;
    public static final IBooleanFunction FIRST = (b44, p1) -> b44;
    public static final IBooleanFunction CAUSED_BY = (b47, b49) -> b47 || !b49;
    public static final IBooleanFunction OR = (b51, b53) -> b51 || b53;
    public static final IBooleanFunction TRUE = (p0, p1) -> true;
    
    boolean apply(final boolean p0, final boolean p1);
}
