// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface IBooleanFunction
{
    IBooleanFunction FALSE = (p0, p1) -> false;
    IBooleanFunction NOT_OR = (b3, b5) -> !b3 && !b5;
    IBooleanFunction ONLY_SECOND = (b7, b9) -> b9 && !b7;
    IBooleanFunction NOT_FIRST = (b11, p1) -> !b11;
    IBooleanFunction ONLY_FIRST = (b14, b16) -> b14 && !b16;
    IBooleanFunction NOT_SECOND = (p0, b19) -> !b19;
    IBooleanFunction NOT_SAME = (b21, b23) -> b21 != b23;
    IBooleanFunction NOT_AND = (b25, b27) -> !b25 || !b27;
    IBooleanFunction AND = (b29, b31) -> b29 && b31;
    IBooleanFunction SAME = (b33, b35) -> b33 == b35;
    IBooleanFunction SECOND = (p0, b38) -> b38;
    IBooleanFunction CAUSES = (b40, b42) -> !b40 || b42;
    IBooleanFunction FIRST = (b44, p1) -> b44;
    IBooleanFunction CAUSED_BY = (b47, b49) -> b47 || !b49;
    IBooleanFunction OR = (b51, b53) -> b51 || b53;
    IBooleanFunction TRUE = (p0, p1) -> true;
    
    boolean apply(final boolean p0, final boolean p1);
}
