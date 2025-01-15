// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.AbstractCollection;

public class Structure$StructureSet extends AbstractCollection<Structure> implements Set<Structure>
{
    public Structure[] elements;
    private int count;
    
    private void ensureCapacity(final int size) {
        if (this.elements == null) {
            this.elements = new Structure[size * 3 / 2];
        }
        else if (this.elements.length < size) {
            final Structure[] elements = new Structure[size * 3 / 2];
            System.arraycopy(this.elements, 0, elements, 0, this.elements.length);
            this.elements = elements;
        }
    }
    
    public Structure[] getElements() {
        return this.elements;
    }
    
    @Override
    public int size() {
        return this.count;
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf((Structure)o) != -1;
    }
    
    @Override
    public boolean add(final Structure o) {
        if (!this.contains(o)) {
            this.ensureCapacity(this.count + 1);
            this.elements[this.count++] = o;
        }
        return true;
    }
    
    private int indexOf(final Structure s1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: iload           4
        //     5: aload_0         /* this */
        //     6: getfield        com/sun/jna/Structure$StructureSet.count:I
        //     9: if_icmpge       75
        //    12: aload_0         /* this */
        //    13: getfield        com/sun/jna/Structure$StructureSet.elements:[Lcom/sun/jna/Structure;
        //    16: iload           4
        //    18: aaload         
        //    19: astore          5
        //    21: aload_1         /* s1 */
        //    22: aload           5
        //    24: if_acmpeq       66
        //    27: aload_1         /* s1 */
        //    28: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    31: aload           5
        //    33: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    36: if_acmpne       69
        //    39: aload_1         /* s1 */
        //    40: invokevirtual   com/sun/jna/Structure.size:()I
        //    43: aload           5
        //    45: invokevirtual   com/sun/jna/Structure.size:()I
        //    48: if_icmpne       69
        //    51: aload_1         /* s1 */
        //    52: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    55: aload           5
        //    57: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    60: invokevirtual   com/sun/jna/Pointer.equals:(Ljava/lang/Object;)Z
        //    63: ifeq            69
        //    66: iload           s2
        //    68: ireturn        
        //    69: iinc            s2, 1
        //    72: goto            3
        //    75: iconst_m1      
        //    76: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2945)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean remove(final Object o) {
        final int index = this.indexOf((Structure)o);
        if (index != -1) {
            if (--this.count >= 0) {
                this.elements[index] = this.elements[this.count];
                this.elements[this.count] = null;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Iterator<Structure> iterator() {
        final Structure[] a = new Structure[this.count];
        if (this.count > 0) {
            System.arraycopy(this.elements, 0, a, 0, this.count);
        }
        return Arrays.asList(a).iterator();
    }
}
