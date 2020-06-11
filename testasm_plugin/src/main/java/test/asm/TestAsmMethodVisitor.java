package test.asm;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Description:
 * Data：2020/6/11-4:24 PM
 * Author:jianqiang.hu
 */
public class TestAsmMethodVisitor extends MethodVisitor {

    private String className;
    private String methodName;

    public TestAsmMethodVisitor(MethodVisitor methodVisitor,String className,String methodName) {
        super(Opcodes.ASM5, methodVisitor);
        this.className=className;
        this.methodName=methodName;
    }

    @Override
    public void visitCode() {
        super.visitCode();
        System.out.println("MethodVisitor visitCode--------");
        mv.visitLdcInsn("Tag");
        mv.visitLdcInsn(className+"----->"+methodName);
        mv.visitMethodInsn(Opcodes.INVOKESTATIC,"android/util/Log","i","(Ljava/lang/String;Ljava/lang/String;)I",false);
        mv.visitLdcInsn(Opcodes.POP);
    }
}
