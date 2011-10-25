package org.jruby.compiler.ir.compiler_pass;

import java.util.List;

import org.jruby.compiler.ir.IRScope;
import org.jruby.compiler.ir.IRExecutionScope;
import org.jruby.compiler.ir.representations.BasicBlock;

public class LinearizeCFG implements CompilerPass {
    public boolean isPreOrder()  {
        return true;
    }

    public void run(IRScope s) {
        if (s instanceof IRExecutionScope) {
//            System.out.println("Linearizing cfg for " + s);
            List<BasicBlock> bbs = ((IRExecutionScope)s).getCFG().linearize();
        }
    }
}
